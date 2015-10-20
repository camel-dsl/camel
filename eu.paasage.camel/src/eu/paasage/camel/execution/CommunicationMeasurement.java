/**
 */
package eu.paasage.camel.execution;

import eu.paasage.camel.deployment.VMInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.CommunicationMeasurement#getSourceVMInstance <em>Source VM Instance</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.CommunicationMeasurement#getDestinationVMInstance <em>Destination VM Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.execution.ExecutionPackage#getCommunicationMeasurement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='resource_coupling_measurement_diff_vm_instances'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot resource_coupling_measurement_diff_vm_instances='Tuple {\n\tmessage : String = \'The source: \' + sourceVMInstance.name +\n\t\t\t\t\' and destination: \' + destinationVMInstance.name + \' VM instances of ResourceCouplingMeasurement: \' + self.name +\n\t\t\t\t\' are either identical or not included in the deployment model of the respective execution context: \' +\n\t\t\t\tself.executionContext.name,\n\tstatus : Boolean = sourceVMInstance <> destinationVMInstance and\n\t\t\t\t(executionContext.deploymentModel.vmInstances\n\t\t\t\t->includes(sourceVMInstance)) and (executionContext.deploymentModel.vmInstances\n\t\t\t\t->includes(destinationVMInstance))\n}.status'"
 * @generated
 */
public interface CommunicationMeasurement extends Measurement {
	/**
	 * Returns the value of the '<em><b>Source VM Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source VM Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source VM Instance</em>' reference.
	 * @see #setSourceVMInstance(VMInstance)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getCommunicationMeasurement_SourceVMInstance()
	 * @model required="true"
	 * @generated
	 */
	VMInstance getSourceVMInstance();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.CommunicationMeasurement#getSourceVMInstance <em>Source VM Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source VM Instance</em>' reference.
	 * @see #getSourceVMInstance()
	 * @generated
	 */
	void setSourceVMInstance(VMInstance value);

	/**
	 * Returns the value of the '<em><b>Destination VM Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination VM Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination VM Instance</em>' reference.
	 * @see #setDestinationVMInstance(VMInstance)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getCommunicationMeasurement_DestinationVMInstance()
	 * @model required="true"
	 * @generated
	 */
	VMInstance getDestinationVMInstance();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.CommunicationMeasurement#getDestinationVMInstance <em>Destination VM Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination VM Instance</em>' reference.
	 * @see #getDestinationVMInstance()
	 * @generated
	 */
	void setDestinationVMInstance(VMInstance value);

} // CommunicationMeasurement
