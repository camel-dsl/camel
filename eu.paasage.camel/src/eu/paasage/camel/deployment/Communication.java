/**
 */
package eu.paasage.camel.deployment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.Communication#getType <em>Type</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.Communication#getProvidedCommunication <em>Provided Communication</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.Communication#getRequiredCommunication <em>Required Communication</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.Communication#getProvidedPortConfiguration <em>Provided Port Configuration</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.Communication#getRequiredPortConfiguration <em>Required Port Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.deployment.DeploymentPackage#getCommunication()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='local_communication_both_comp_same_vm'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot local_communication_both_comp_same_vm='Tuple {\n\tmessage : String = \'The communication:\' + self.name +\n\t\t\t\t\' is local but the communicating components are mapped to different VMs\',\n\tstatus : Boolean = let firstOwner : Component =\n\t\t\t\tself.providedCommunication.oclContainer().oclContainer().oclAsType(DeploymentModel).hostings\n\t\t\t\t->select(p | p.requiredHost.oclContainer() = self.providedCommunication.oclContainer())\n\t\t\t\t->first().providedHost.oclContainer() , secondOwner : Component =\n\t\t\t\tself.requiredCommunication.oclContainer().oclContainer().oclAsType(DeploymentModel).hostings\n\t\t\t\t->select(q | q.requiredHost.oclContainer() = self.requiredCommunication.oclContainer())\n\t\t\t\t->first().providedHost.oclContainer()\n\t\t\tin (self.type = CommunicationType::LOCAL) implies (if (firstOwner.oclIsTypeOf(InternalComponent) and\n\t\t\t\t\tsecondOwner.oclIsTypeOf(InternalComponent))\n\t\t\t\tthen firstOwner.oclAsType(InternalComponent).oclContainer().oclAsType(DeploymentModel).hostings\n\t\t\t\t\t->select(p | p.requiredHost.oclContainer() = firstOwner)\n\t\t\t\t\t->first().providedHost.oclContainer() =\n\t\t\t\t\tsecondOwner.oclAsType(InternalComponent).oclContainer().oclAsType(DeploymentModel).hostings\n\t\t\t\t\t->select(p | p.requiredHost.oclContainer() = secondOwner)\n\t\t\t\t\t->first().providedHost.oclContainer()\n\t\t\t\telse if (firstOwner.oclIsTypeOf(VM) and secondOwner.oclIsTypeOf(InternalComponent))\n\t\t\t\t\tthen firstOwner = secondOwner.oclAsType(InternalComponent).oclContainer().oclAsType(DeploymentModel).hostings\n\t\t\t\t\t\t->select(p | p.requiredHost.oclContainer() = secondOwner)\n\t\t\t\t\t\t->first().providedHost.oclContainer()\n\t\t\t\t\telse if (firstOwner.oclIsTypeOf(InternalComponent) and secondOwner.oclIsTypeOf(VM))\n\t\t\t\t\t\tthen firstOwner.oclAsType(InternalComponent).oclContainer().oclAsType(DeploymentModel).hostings\n\t\t\t\t\t\t\t->select(p | p.requiredHost.oclContainer() = firstOwner)\n\t\t\t\t\t\t\t->first().providedHost.oclContainer() = secondOwner\n\t\t\t\t\t\telse if (firstOwner = secondOwner)\n\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif)\n}.status'"
 * @generated
 */
public interface Communication extends DeploymentElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link eu.paasage.camel.deployment.CommunicationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eu.paasage.camel.deployment.CommunicationType
	 * @see #setType(CommunicationType)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getCommunication_Type()
	 * @model default="ANY" required="true"
	 * @generated
	 */
	CommunicationType getType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.Communication#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.paasage.camel.deployment.CommunicationType
	 * @see #getType()
	 * @generated
	 */
	void setType(CommunicationType value);

	/**
	 * Returns the value of the '<em><b>Provided Communication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Communication</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Communication</em>' reference.
	 * @see #setProvidedCommunication(ProvidedCommunication)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getCommunication_ProvidedCommunication()
	 * @model required="true"
	 * @generated
	 */
	ProvidedCommunication getProvidedCommunication();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.Communication#getProvidedCommunication <em>Provided Communication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Communication</em>' reference.
	 * @see #getProvidedCommunication()
	 * @generated
	 */
	void setProvidedCommunication(ProvidedCommunication value);

	/**
	 * Returns the value of the '<em><b>Required Communication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Communication</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Communication</em>' reference.
	 * @see #setRequiredCommunication(RequiredCommunication)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getCommunication_RequiredCommunication()
	 * @model required="true"
	 * @generated
	 */
	RequiredCommunication getRequiredCommunication();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.Communication#getRequiredCommunication <em>Required Communication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Communication</em>' reference.
	 * @see #getRequiredCommunication()
	 * @generated
	 */
	void setRequiredCommunication(RequiredCommunication value);

	/**
	 * Returns the value of the '<em><b>Provided Port Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Port Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Port Configuration</em>' containment reference.
	 * @see #setProvidedPortConfiguration(Configuration)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getCommunication_ProvidedPortConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	Configuration getProvidedPortConfiguration();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.Communication#getProvidedPortConfiguration <em>Provided Port Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Port Configuration</em>' containment reference.
	 * @see #getProvidedPortConfiguration()
	 * @generated
	 */
	void setProvidedPortConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Required Port Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Port Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Port Configuration</em>' containment reference.
	 * @see #setRequiredPortConfiguration(Configuration)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getCommunication_RequiredPortConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	Configuration getRequiredPortConfiguration();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.Communication#getRequiredPortConfiguration <em>Required Port Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Port Configuration</em>' containment reference.
	 * @see #getRequiredPortConfiguration()
	 * @generated
	 */
	void setRequiredPortConfiguration(Configuration value);

} // Communication
