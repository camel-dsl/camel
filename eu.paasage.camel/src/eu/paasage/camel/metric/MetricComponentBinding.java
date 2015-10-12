/**
 */
package eu.paasage.camel.metric;

import eu.paasage.camel.deployment.ComponentInstance;
import eu.paasage.camel.deployment.VMInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.MetricComponentBinding#getVmInstance <em>Vm Instance</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricComponentBinding#getComponentInstance <em>Component Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getMetricComponentBinding()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='vm_and_sw_comp_connected_in_component_binding'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot vm_and_sw_comp_connected_in_component_binding='Tuple {\n\tmessage : String = \'MetricComponentBinding: \' + self.name +\n\t\t\t\t\t\' has a componentInstance: \' + self.componentInstance.name +\n\t\t\t\t\t\'which is either not included in the the respective deployment model of the binding\\\'s execution context: \' +\n\t\t\t\t\tself.executionContext.name +\n\t\t\t\t\t\' or is not connected in this deployment model with the vmInstance or it is an external component such that in this case a null value for the vmInstance should have been provided\',\n\tstatus : Boolean = if\n\t\t\t\t\t\t(componentInstance.oclIsTypeOf(camel::deployment::InternalComponentInstance))\n\t\t\t\t\tthen (executionContext.deploymentModel.internalComponentInstances\n\t\t\t\t\t\t->includes(componentInstance)) and if (vmInstance <> null)\n\t\t\t\t\t\tthen (executionContext.deploymentModel.vmInstances\n\t\t\t\t\t\t\t->includes(vmInstance)) and (executionContext.deploymentModel.hostingInstances\n\t\t\t\t\t\t\t->exists(c | c.requiredHostInstance.oclContainer() = componentInstance and c.providedHostInstance.oclContainer() = vmInstance) or\n\t\t\t\t\t\t\t(executionContext.deploymentModel.hostingInstances\n\t\t\t\t\t\t\t->exists(c | c.requiredHostInstance.oclContainer() = componentInstance and\n\t\t\t\t\t\t\t\texecutionContext.deploymentModel.hostingInstances\n\t\t\t\t\t\t\t\t->exists(d | d.requiredHostInstance.oclContainer() = c.providedHostInstance.oclContainer() and d.providedHostInstance.oclContainer() =\n\t\t\t\t\t\t\t\t\tvmInstance))))\n\t\t\t\t\t\telse true\n\t\t\t\t\t\tendif\n\t\t\t\t\telse false\n\t\t\t\t\tendif\n}.status'"
 * @generated
 */
public interface MetricComponentBinding extends MetricObjectBinding {
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
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricComponentBinding_VmInstance()
	 * @model
	 * @generated
	 */
	VMInstance getVmInstance();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricComponentBinding#getVmInstance <em>Vm Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Instance</em>' reference.
	 * @see #getVmInstance()
	 * @generated
	 */
	void setVmInstance(VMInstance value);

	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance</em>' reference.
	 * @see #setComponentInstance(ComponentInstance)
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricComponentBinding_ComponentInstance()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstance getComponentInstance();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricComponentBinding#getComponentInstance <em>Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance</em>' reference.
	 * @see #getComponentInstance()
	 * @generated
	 */
	void setComponentInstance(ComponentInstance value);

} // MetricComponentBinding
