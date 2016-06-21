/**
 */
package eu.paasage.camel.scalability.impl;

import eu.paasage.camel.scalability.ScalabilityPackage;
import eu.paasage.camel.scalability.VerticalScalingAction;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertical Scaling Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.impl.VerticalScalingActionImpl#getMemoryUpdate <em>Memory Update</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.VerticalScalingActionImpl#getCPUUpdate <em>CPU Update</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.VerticalScalingActionImpl#getCoreUpdate <em>Core Update</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.VerticalScalingActionImpl#getStorageUpdate <em>Storage Update</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.VerticalScalingActionImpl#getIoUpdate <em>Io Update</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.VerticalScalingActionImpl#getNetworkUpdate <em>Network Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerticalScalingActionImpl extends ScalingActionImpl implements VerticalScalingAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerticalScalingActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalabilityPackage.Literals.VERTICAL_SCALING_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemoryUpdate() {
		return (Integer)eGet(ScalabilityPackage.Literals.VERTICAL_SCALING_ACTION__MEMORY_UPDATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryUpdate(int newMemoryUpdate) {
		eSet(ScalabilityPackage.Literals.VERTICAL_SCALING_ACTION__MEMORY_UPDATE, newMemoryUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCPUUpdate() {
		return (Double)eGet(ScalabilityPackage.Literals.VERTICAL_SCALING_ACTION__CPU_UPDATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPUUpdate(double newCPUUpdate) {
		eSet(ScalabilityPackage.Literals.VERTICAL_SCALING_ACTION__CPU_UPDATE, newCPUUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoreUpdate() {
		return (Integer)eGet(ScalabilityPackage.Literals.VERTICAL_SCALING_ACTION__CORE_UPDATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreUpdate(int newCoreUpdate) {
		eSet(ScalabilityPackage.Literals.VERTICAL_SCALING_ACTION__CORE_UPDATE, newCoreUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStorageUpdate() {
		return (Integer)eGet(ScalabilityPackage.Literals.VERTICAL_SCALING_ACTION__STORAGE_UPDATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageUpdate(int newStorageUpdate) {
		eSet(ScalabilityPackage.Literals.VERTICAL_SCALING_ACTION__STORAGE_UPDATE, newStorageUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIoUpdate() {
		return (Integer)eGet(ScalabilityPackage.Literals.VERTICAL_SCALING_ACTION__IO_UPDATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoUpdate(int newIoUpdate) {
		eSet(ScalabilityPackage.Literals.VERTICAL_SCALING_ACTION__IO_UPDATE, newIoUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNetworkUpdate() {
		return (Integer)eGet(ScalabilityPackage.Literals.VERTICAL_SCALING_ACTION__NETWORK_UPDATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkUpdate(int newNetworkUpdate) {
		eSet(ScalabilityPackage.Literals.VERTICAL_SCALING_ACTION__NETWORK_UPDATE, newNetworkUpdate);
	}

} //VerticalScalingActionImpl
