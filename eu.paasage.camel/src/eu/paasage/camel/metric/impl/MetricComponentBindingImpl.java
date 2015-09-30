/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.deployment.ComponentInstance;
import eu.paasage.camel.deployment.VMInstance;

import eu.paasage.camel.metric.MetricComponentBinding;
import eu.paasage.camel.metric.MetricPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricComponentBindingImpl#getVmInstance <em>Vm Instance</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricComponentBindingImpl#getComponentInstance <em>Component Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetricComponentBindingImpl extends MetricObjectBindingImpl implements MetricComponentBinding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricComponentBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.METRIC_COMPONENT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMInstance getVmInstance() {
		return (VMInstance)eGet(MetricPackage.Literals.METRIC_COMPONENT_BINDING__VM_INSTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmInstance(VMInstance newVmInstance) {
		eSet(MetricPackage.Literals.METRIC_COMPONENT_BINDING__VM_INSTANCE, newVmInstance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getComponentInstance() {
		return (ComponentInstance)eGet(MetricPackage.Literals.METRIC_COMPONENT_BINDING__COMPONENT_INSTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstance(ComponentInstance newComponentInstance) {
		eSet(MetricPackage.Literals.METRIC_COMPONENT_BINDING__COMPONENT_INSTANCE, newComponentInstance);
	}

} //MetricComponentBindingImpl
