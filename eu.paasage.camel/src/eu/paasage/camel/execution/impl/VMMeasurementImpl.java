/**
 */
package eu.paasage.camel.execution.impl;

import eu.paasage.camel.deployment.VMInstance;

import eu.paasage.camel.execution.ExecutionPackage;
import eu.paasage.camel.execution.VMMeasurement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VM Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.impl.VMMeasurementImpl#getVmInstance <em>Vm Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VMMeasurementImpl extends MeasurementImpl implements VMMeasurement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.VM_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMInstance getVmInstance() {
		return (VMInstance)eGet(ExecutionPackage.Literals.VM_MEASUREMENT__VM_INSTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmInstance(VMInstance newVmInstance) {
		eSet(ExecutionPackage.Literals.VM_MEASUREMENT__VM_INSTANCE, newVmInstance);
	}

} //VMMeasurementImpl
