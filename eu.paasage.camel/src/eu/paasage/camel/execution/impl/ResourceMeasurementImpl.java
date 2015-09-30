/**
 */
package eu.paasage.camel.execution.impl;

import eu.paasage.camel.deployment.VMInstance;

import eu.paasage.camel.execution.ExecutionPackage;
import eu.paasage.camel.execution.ResourceMeasurement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.impl.ResourceMeasurementImpl#getVmInstance <em>Vm Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceMeasurementImpl extends MeasurementImpl implements ResourceMeasurement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.RESOURCE_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMInstance getVmInstance() {
		return (VMInstance)eGet(ExecutionPackage.Literals.RESOURCE_MEASUREMENT__VM_INSTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmInstance(VMInstance newVmInstance) {
		eSet(ExecutionPackage.Literals.RESOURCE_MEASUREMENT__VM_INSTANCE, newVmInstance);
	}

} //ResourceMeasurementImpl
