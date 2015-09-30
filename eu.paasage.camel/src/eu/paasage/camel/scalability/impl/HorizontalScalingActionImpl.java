/**
 */
package eu.paasage.camel.scalability.impl;

import eu.paasage.camel.deployment.InternalComponent;

import eu.paasage.camel.scalability.HorizontalScalingAction;
import eu.paasage.camel.scalability.ScalabilityPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Horizontal Scaling Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.impl.HorizontalScalingActionImpl#getCount <em>Count</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.HorizontalScalingActionImpl#getInternalComponent <em>Internal Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HorizontalScalingActionImpl extends ScalingActionImpl implements HorizontalScalingAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HorizontalScalingActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalabilityPackage.Literals.HORIZONTAL_SCALING_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return (Integer)eGet(ScalabilityPackage.Literals.HORIZONTAL_SCALING_ACTION__COUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		eSet(ScalabilityPackage.Literals.HORIZONTAL_SCALING_ACTION__COUNT, newCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalComponent getInternalComponent() {
		return (InternalComponent)eGet(ScalabilityPackage.Literals.HORIZONTAL_SCALING_ACTION__INTERNAL_COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalComponent(InternalComponent newInternalComponent) {
		eSet(ScalabilityPackage.Literals.HORIZONTAL_SCALING_ACTION__INTERNAL_COMPONENT, newInternalComponent);
	}

} //HorizontalScalingActionImpl
