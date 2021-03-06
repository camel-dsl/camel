/**
 */
package eu.paasage.camel.deployment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.CommunicationPortInstance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.deployment.DeploymentPackage#getCommunicationPortInstance()
 * @model
 * @generated
 */
public interface CommunicationPortInstance extends DeploymentElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(CommunicationPort)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getCommunicationPortInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	CommunicationPort getType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.CommunicationPortInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CommunicationPort value);

} // CommunicationPortInstance
