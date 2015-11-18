/**
 */
package eu.paasage.camel.scalability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.EventPattern#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.scalability.ScalabilityPackage#getEventPattern()
 * @model abstract="true"
 * @generated
 */
public interface EventPattern extends Event {
	/**
	 * Returns the value of the '<em><b>Timer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' reference.
	 * @see #setTimer(Timer)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getEventPattern_Timer()
	 * @model
	 * @generated
	 */
	Timer getTimer();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.EventPattern#getTimer <em>Timer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer</em>' reference.
	 * @see #getTimer()
	 * @generated
	 */
	void setTimer(Timer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if (self.oclIsTypeOf(UnaryEventPattern))\n\t\t\t\t\t\tthen self.oclAsType(UnaryEventPattern).event = e\n\t\t\t\t\t\telse (includesLeftEvent(e) or includesRightEvent(e))\n\t\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean includesEvent(SimpleEvent e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if (self.oclAsType(BinaryEventPattern).leftEvent.oclIsKindOf(EventPattern))\n\t\t\t\t\t\tthen self.oclAsType(BinaryEventPattern).leftEvent.oclAsType(EventPattern).includesEvent(e)\n\t\t\t\t\t\telse (if (self.oclAsType(BinaryEventPattern).leftEvent.oclIsKindOf(SimpleEvent))\n\t\t\t\t\t\t\tthen self.oclAsType(BinaryEventPattern).leftEvent.oclAsType(SimpleEvent) = e\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean includesLeftEvent(SimpleEvent e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if (self.oclAsType(BinaryEventPattern).rightEvent.oclIsKindOf(EventPattern))\n\t\t\t\t\t\tthen self.oclAsType(BinaryEventPattern).rightEvent.oclAsType(EventPattern).includesEvent(e)\n\t\t\t\t\t\telse (if (self.oclAsType(BinaryEventPattern).rightEvent.oclIsKindOf(SimpleEvent))\n\t\t\t\t\t\t\tthen self.oclAsType(BinaryEventPattern).rightEvent.oclAsType(SimpleEvent) = e\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean includesRightEvent(SimpleEvent e);

} // EventPattern
