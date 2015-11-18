/**
 */
package eu.paasage.camel.execution.impl;

import eu.paasage.camel.deployment.VMInstance;

import eu.paasage.camel.execution.CommunicationMeasurement;
import eu.paasage.camel.execution.ExecutionPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.impl.CommunicationMeasurementImpl#getSourceVMInstance <em>Source VM Instance</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.CommunicationMeasurementImpl#getDestinationVMInstance <em>Destination VM Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationMeasurementImpl extends MeasurementImpl implements CommunicationMeasurement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.COMMUNICATION_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMInstance getSourceVMInstance() {
		return (VMInstance)eGet(ExecutionPackage.Literals.COMMUNICATION_MEASUREMENT__SOURCE_VM_INSTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceVMInstance(VMInstance newSourceVMInstance) {
		eSet(ExecutionPackage.Literals.COMMUNICATION_MEASUREMENT__SOURCE_VM_INSTANCE, newSourceVMInstance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMInstance getDestinationVMInstance() {
		return (VMInstance)eGet(ExecutionPackage.Literals.COMMUNICATION_MEASUREMENT__DESTINATION_VM_INSTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationVMInstance(VMInstance newDestinationVMInstance) {
		eSet(ExecutionPackage.Literals.COMMUNICATION_MEASUREMENT__DESTINATION_VM_INSTANCE, newDestinationVMInstance);
	}

} //CommunicationMeasurementImpl
