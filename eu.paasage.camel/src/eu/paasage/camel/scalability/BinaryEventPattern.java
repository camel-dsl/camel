/**
 */
package eu.paasage.camel.scalability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.BinaryEventPattern#getLeftEvent <em>Left Event</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.BinaryEventPattern#getRightEvent <em>Right Event</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.BinaryEventPattern#getLowerOccurrenceBound <em>Lower Occurrence Bound</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.BinaryEventPattern#getUpperOccurrenceBound <em>Upper Occurrence Bound</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.BinaryEventPattern#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.scalability.ScalabilityPackage#getBinaryEventPattern()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='binary_event_pattern_at_least_left_right binary_event_pattern_timer_one_event binary_event_pattern_occur_bounds'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot binary_event_pattern_at_least_left_right='Tuple {\n\tmessage : String = \'In BinaryEventPattern: \' + self.name +\n\t\t\t\t\t\' no left or right event has been specified\',\n\tstatus : Boolean = self.leftEvent <> null or self.rightEvent <> null\n}.status' binary_event_pattern_timer_one_event='Tuple {\n\tmessage : String = \'In BinaryEventPattern: \' + self.name +\n\t\t\t\t\t\' both a timer as well as left and right events have been specified\',\n\tstatus : Boolean = self.oclAsType(EventPattern).timer <> null\n\t\t\t\t\timplies (self.leftEvent = null or self.rightEvent = null)\n}.status' binary_event_pattern_occur_bounds='Tuple {\n\tmessage : String = \'In BinaryEventPattern: \' + self.name +\n\t\t\t\t\t\' incorrect values were given for the lowerOccurrenceBound and upperOccurrenceBound attributes in conjunction with the use of the respective pattern operator: \'\n\t\t\t\t\t+ operator.toString(),\n\tstatus : Boolean = (self.operator <> BinaryPatternOperatorType::REPEAT_UNTIL implies\n\t\t\t\t\t(self.lowerOccurrenceBound = 0 and self.upperOccurrenceBound = 0)) and (self.operator =\n\t\t\t\t\tBinaryPatternOperatorType::REPEAT_UNTIL and self.lowerOccurrenceBound >= 0 and self.upperOccurrenceBound > 0\n\t\t\t\t\timplies self.lowerOccurrenceBound <= upperOccurrenceBound)\n}.status'"
 * @generated
 */
public interface BinaryEventPattern extends EventPattern {
	/**
	 * Returns the value of the '<em><b>Left Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Event</em>' reference.
	 * @see #setLeftEvent(Event)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getBinaryEventPattern_LeftEvent()
	 * @model
	 * @generated
	 */
	Event getLeftEvent();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.BinaryEventPattern#getLeftEvent <em>Left Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Event</em>' reference.
	 * @see #getLeftEvent()
	 * @generated
	 */
	void setLeftEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Right Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Event</em>' reference.
	 * @see #setRightEvent(Event)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getBinaryEventPattern_RightEvent()
	 * @model
	 * @generated
	 */
	Event getRightEvent();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.BinaryEventPattern#getRightEvent <em>Right Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Event</em>' reference.
	 * @see #getRightEvent()
	 * @generated
	 */
	void setRightEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Lower Occurrence Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Occurrence Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Occurrence Bound</em>' attribute.
	 * @see #setLowerOccurrenceBound(int)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getBinaryEventPattern_LowerOccurrenceBound()
	 * @model
	 * @generated
	 */
	int getLowerOccurrenceBound();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.BinaryEventPattern#getLowerOccurrenceBound <em>Lower Occurrence Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Occurrence Bound</em>' attribute.
	 * @see #getLowerOccurrenceBound()
	 * @generated
	 */
	void setLowerOccurrenceBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Occurrence Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Occurrence Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Occurrence Bound</em>' attribute.
	 * @see #setUpperOccurrenceBound(int)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getBinaryEventPattern_UpperOccurrenceBound()
	 * @model
	 * @generated
	 */
	int getUpperOccurrenceBound();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.BinaryEventPattern#getUpperOccurrenceBound <em>Upper Occurrence Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Occurrence Bound</em>' attribute.
	 * @see #getUpperOccurrenceBound()
	 * @generated
	 */
	void setUpperOccurrenceBound(int value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.scalability.BinaryPatternOperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see eu.paasage.camel.scalability.BinaryPatternOperatorType
	 * @see #setOperator(BinaryPatternOperatorType)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getBinaryEventPattern_Operator()
	 * @model required="true"
	 * @generated
	 */
	BinaryPatternOperatorType getOperator();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.BinaryEventPattern#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see eu.paasage.camel.scalability.BinaryPatternOperatorType
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryPatternOperatorType value);

} // BinaryEventPattern
