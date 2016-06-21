/**
 */
package eu.paasage.camel.execution;

import eu.paasage.camel.deployment.VMInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.VMMeasurement#getVmInstance <em>Vm Instance</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.execution.ExecutionPackage#getVMMeasurement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='resource_measurement_ec_deployment_model_vm_instance resource_measurement_metric_vm_instance'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot resource_measurement_ec_deployment_model_vm_instance='Tuple {\n\tmessage : String = \'The VMInstance: \' + vmInstance.name +\n\t\t\t\t\' of ResourceMeasurement: \' + self.name +\n\t\t\t\t\' is not included in the deployment model of the respective execution context: \' +\n\t\t\t\tself.executionContext.name,\n\tstatus : Boolean = vmInstance <> null implies (executionContext.deploymentModel.vmInstances\n\t\t\t\t->includes(vmInstance))\n}.status' resource_measurement_metric_vm_instance='Tuple {\n\tmessage : String = \'The binding of metric instance: \' + metricInstance.name +\n\t\t\t\t\' associated to ResourceMeasurement: \' + self.name +\n\t\t\t\t\' refers to a different VMInstance from the one related to this measurement\',\n\tstatus : Boolean = vmInstance <> null implies\n\t\t\t\t(metricInstance.objectBinding.oclIsTypeOf(camel::metric::MetricVMBinding) and\n\t\t\t\tmetricInstance.objectBinding.oclAsType(camel::metric::MetricVMBinding).vmInstance = vmInstance)\n}.status'"
 * @generated
 */
public interface VMMeasurement extends Measurement {
	/**
	 * Returns the value of the '<em><b>Vm Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Instance</em>' reference.
	 * @see #setVmInstance(VMInstance)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getVMMeasurement_VmInstance()
	 * @model required="true"
	 * @generated
	 */
	VMInstance getVmInstance();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.VMMeasurement#getVmInstance <em>Vm Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Instance</em>' reference.
	 * @see #getVmInstance()
	 * @generated
	 */
	void setVmInstance(VMInstance value);

} // VMMeasurement
