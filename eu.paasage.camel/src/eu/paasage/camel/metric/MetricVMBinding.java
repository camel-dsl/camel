/**
 */
package eu.paasage.camel.metric;

import eu.paasage.camel.deployment.VMInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.MetricVMBinding#getVmInstance <em>Vm Instance</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getMetricVMBinding()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='vm_binding_vm_in_dep_model_of_app'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot vm_binding_vm_in_dep_model_of_app='Tuple {\n\tmessage : String = \'MetricVMBinding: \' + self.name + \' has VMInstance: \' + vmInstance.name\n\t\t\t\t\t+ \' which is not included in the deployment model of the respective execution context: \' +\n\t\t\t\t\tself.executionContext.name,\n\tstatus : Boolean = (executionContext.deploymentModel.vmInstances\n\t\t\t\t\t->includes(vmInstance))\n}.status'"
 * @generated
 */
public interface MetricVMBinding extends MetricObjectBinding {
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
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricVMBinding_VmInstance()
	 * @model required="true"
	 * @generated
	 */
	VMInstance getVmInstance();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricVMBinding#getVmInstance <em>Vm Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Instance</em>' reference.
	 * @see #getVmInstance()
	 * @generated
	 */
	void setVmInstance(VMInstance value);

} // MetricVMBinding
