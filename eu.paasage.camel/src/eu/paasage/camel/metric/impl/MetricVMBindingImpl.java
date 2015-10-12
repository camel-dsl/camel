/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.deployment.VMInstance;

import eu.paasage.camel.metric.MetricPackage;
import eu.paasage.camel.metric.MetricVMBinding;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VM Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricVMBindingImpl#getVmInstance <em>Vm Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetricVMBindingImpl extends MetricObjectBindingImpl implements MetricVMBinding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricVMBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.METRIC_VM_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMInstance getVmInstance() {
		return (VMInstance)eGet(MetricPackage.Literals.METRIC_VM_BINDING__VM_INSTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmInstance(VMInstance newVmInstance) {
		eSet(MetricPackage.Literals.METRIC_VM_BINDING__VM_INSTANCE, newVmInstance);
	}

} //MetricVMBindingImpl
