/**
 */
package eu.paasage.camel.scalability;

import eu.paasage.camel.Action;

import eu.paasage.camel.deployment.VM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scaling Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.ScalingAction#getVm <em>Vm</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.scalability.ScalabilityPackage#getScalingAction()
 * @model abstract="true"
 * @generated
 */
public interface ScalingAction extends Action {
	/**
	 * Returns the value of the '<em><b>Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm</em>' reference.
	 * @see #setVm(VM)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getScalingAction_Vm()
	 * @model required="true"
	 * @generated
	 */
	VM getVm();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.ScalingAction#getVm <em>Vm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm</em>' reference.
	 * @see #getVm()
	 * @generated
	 */
	void setVm(VM value);

} // ScalingAction
