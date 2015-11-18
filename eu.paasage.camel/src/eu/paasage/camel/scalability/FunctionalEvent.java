/**
 */
package eu.paasage.camel.scalability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.FunctionalEvent#getFunctionalType <em>Functional Type</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.scalability.ScalabilityPackage#getFunctionalEvent()
 * @model
 * @generated
 */
public interface FunctionalEvent extends SimpleEvent {
	/**
	 * Returns the value of the '<em><b>Functional Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Type</em>' attribute.
	 * @see #setFunctionalType(String)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getFunctionalEvent_FunctionalType()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='NonFunctionalEvent' unique='false' upper='*'"
	 * @generated
	 */
	String getFunctionalType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.FunctionalEvent#getFunctionalType <em>Functional Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Type</em>' attribute.
	 * @see #getFunctionalType()
	 * @generated
	 */
	void setFunctionalType(String value);

} // FunctionalEvent
