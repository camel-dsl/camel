/**
 */
package eu.paasage.camel.deployment.impl;

import eu.paasage.camel.deployment.DeploymentPackage;
import eu.paasage.camel.deployment.VMInstance;

import eu.paasage.camel.provider.Attribute;

import eu.paasage.camel.type.SingleValue;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VM Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.impl.VMInstanceImpl#getVmType <em>Vm Type</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.VMInstanceImpl#getVmTypeValue <em>Vm Type Value</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.VMInstanceImpl#getIp <em>Ip</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VMInstanceImpl extends ComponentInstanceImpl implements VMInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.VM_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getVmType() {
		return (Attribute)eGet(DeploymentPackage.Literals.VM_INSTANCE__VM_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmType(Attribute newVmType) {
		eSet(DeploymentPackage.Literals.VM_INSTANCE__VM_TYPE, newVmType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValue getVmTypeValue() {
		return (SingleValue)eGet(DeploymentPackage.Literals.VM_INSTANCE__VM_TYPE_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmTypeValue(SingleValue newVmTypeValue) {
		eSet(DeploymentPackage.Literals.VM_INSTANCE__VM_TYPE_VALUE, newVmTypeValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIp() {
		return (String)eGet(DeploymentPackage.Literals.VM_INSTANCE__IP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp(String newIp) {
		eSet(DeploymentPackage.Literals.VM_INSTANCE__IP, newIp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDates(final VMInstance vm) {
		System.out.println("Checking dates for VMInstance: " + vm);
				java.util.Date createdOn = vm.getInstantiatedOn();
				java.util.Date destroyedOn = vm.getDestroyedOn();
				if (createdOn != null && destroyedOn != null && destroyedOn.before(createdOn)) return Boolean.FALSE;
				return Boolean.TRUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DeploymentPackage.VM_INSTANCE___CHECK_DATES__VMINSTANCE:
				return checkDates((VMInstance)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //VMInstanceImpl
