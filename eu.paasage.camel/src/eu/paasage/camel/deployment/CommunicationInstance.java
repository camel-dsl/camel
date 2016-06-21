/**
 */
package eu.paasage.camel.deployment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.CommunicationInstance#getType <em>Type</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.CommunicationInstance#getProvidedCommunicationInstance <em>Provided Communication Instance</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.CommunicationInstance#getRequiredCommunicationInstance <em>Required Communication Instance</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.deployment.DeploymentPackage#getCommunicationInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='communication_instance_correct_port_instances'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot communication_instance_correct_port_instances='Tuple {\n\tmessage : String = \'CommunicationInstance: \' + self.name +\n\t\t\t\t\' should have its provided and required communication instances\\\' types mapping to its required communication/host type, respectively\',\n\tstatus : Boolean = requiredCommunicationInstance.type\n\t\t\t\t= type.requiredCommunication and providedCommunicationInstance.type = type.providedCommunication\n}.status'"
 * @generated
 */
public interface CommunicationInstance extends DeploymentElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Communication)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getCommunicationInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	Communication getType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.CommunicationInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Communication value);

	/**
	 * Returns the value of the '<em><b>Provided Communication Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Communication Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Communication Instance</em>' reference.
	 * @see #setProvidedCommunicationInstance(ProvidedCommunicationInstance)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getCommunicationInstance_ProvidedCommunicationInstance()
	 * @model required="true"
	 * @generated
	 */
	ProvidedCommunicationInstance getProvidedCommunicationInstance();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.CommunicationInstance#getProvidedCommunicationInstance <em>Provided Communication Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Communication Instance</em>' reference.
	 * @see #getProvidedCommunicationInstance()
	 * @generated
	 */
	void setProvidedCommunicationInstance(ProvidedCommunicationInstance value);

	/**
	 * Returns the value of the '<em><b>Required Communication Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Communication Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Communication Instance</em>' reference.
	 * @see #setRequiredCommunicationInstance(RequiredCommunicationInstance)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getCommunicationInstance_RequiredCommunicationInstance()
	 * @model required="true"
	 * @generated
	 */
	RequiredCommunicationInstance getRequiredCommunicationInstance();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.CommunicationInstance#getRequiredCommunicationInstance <em>Required Communication Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Communication Instance</em>' reference.
	 * @see #getRequiredCommunicationInstance()
	 * @generated
	 */
	void setRequiredCommunicationInstance(RequiredCommunicationInstance value);

} // CommunicationInstance
