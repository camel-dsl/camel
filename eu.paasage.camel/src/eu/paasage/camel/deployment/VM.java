/**
 */
package eu.paasage.camel.deployment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.VM#getVmRequirementSet <em>Vm Requirement Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.deployment.DeploymentPackage#getVM()
 * @model
 * @generated
 */
public interface VM extends Component {
	/**
	 * Returns the value of the '<em><b>Vm Requirement Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Requirement Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Requirement Set</em>' reference.
	 * @see #setVmRequirementSet(VMRequirementSet)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getVM_VmRequirementSet()
	 * @model
	 * @generated
	 */
	VMRequirementSet getVmRequirementSet();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.VM#getVmRequirementSet <em>Vm Requirement Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Requirement Set</em>' reference.
	 * @see #getVmRequirementSet()
	 * @generated
	 */
	void setVmRequirementSet(VMRequirementSet value);

} // VM
