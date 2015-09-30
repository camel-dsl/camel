/**
 */
package eu.paasage.camel.scalability.impl;

import eu.paasage.camel.deployment.VM;

import eu.paasage.camel.impl.ActionImpl;

import eu.paasage.camel.scalability.ScalabilityPackage;
import eu.paasage.camel.scalability.ScalingAction;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scaling Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.impl.ScalingActionImpl#getVm <em>Vm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ScalingActionImpl extends ActionImpl implements ScalingAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalingActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalabilityPackage.Literals.SCALING_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VM getVm() {
		return (VM)eGet(ScalabilityPackage.Literals.SCALING_ACTION__VM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVm(VM newVm) {
		eSet(ScalabilityPackage.Literals.SCALING_ACTION__VM, newVm);
	}

} //ScalingActionImpl
