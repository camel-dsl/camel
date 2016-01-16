/**
 */
package eu.paasage.camel.execution;

import eu.paasage.camel.deployment.InternalComponentInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Component Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.InternalComponentMeasurement#getInternalComponentInstance <em>Internal Component Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.execution.ExecutionPackage#getInternalComponentMeasurement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='internal_component_measurement_metric_refer_to_same_component internal_component_measurement_included_in_execution_context'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot internal_component_measurement_metric_refer_to_same_component='Tuple {\n\tmessage : String = \'The ComponentInstance: \' +\n\t\t\t\tinternalComponentInstance.name + \' of InternalComponentMeasurement: \' + self.name +\n\t\t\t\t\' is different from the one referenced by the binding of the respective metric instance: \' +\n\t\t\t\tself.metricInstance.name,\n\tstatus : Boolean = metricInstance.objectBinding.oclIsTypeOf(camel::metric::MetricComponentBinding) and\n\t\t\t\tmetricInstance.objectBinding.oclAsType(camel::metric::MetricComponentBinding).componentInstance =\n\t\t\t\tinternalComponentInstance\n}.status' internal_component_measurement_included_in_execution_context='Tuple {\n\tmessage : String = \'ComponentInstance: \' +\n\t\t\t\tinternalComponentInstance.name + \' is not included in the deployment model of execution context: \' +\n\t\t\t\tself.executionContext.name + \' for InternalComponentMeasurement: \' +\n\t\t\t\tself.name,\n\tstatus : Boolean = executionContext.deploymentModel.internalComponentInstances\n\t\t\t\t->includes(internalComponentInstance)\n}.status'"
 * @generated
 */
public interface InternalComponentMeasurement extends Measurement {
	/**
	 * Returns the value of the '<em><b>Internal Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Component Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Component Instance</em>' reference.
	 * @see #setInternalComponentInstance(InternalComponentInstance)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getInternalComponentMeasurement_InternalComponentInstance()
	 * @model required="true"
	 * @generated
	 */
	InternalComponentInstance getInternalComponentInstance();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.InternalComponentMeasurement#getInternalComponentInstance <em>Internal Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Component Instance</em>' reference.
	 * @see #getInternalComponentInstance()
	 * @generated
	 */
	void setInternalComponentInstance(InternalComponentInstance value);

} // InternalComponentMeasurement
