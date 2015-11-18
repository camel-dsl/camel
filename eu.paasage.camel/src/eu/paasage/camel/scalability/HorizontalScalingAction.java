/**
 */
package eu.paasage.camel.scalability;

import eu.paasage.camel.deployment.InternalComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Horizontal Scaling Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.HorizontalScalingAction#getCount <em>Count</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.HorizontalScalingAction#getInternalComponent <em>Internal Component</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.scalability.ScalabilityPackage#getHorizontalScalingAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='horizontal_scale_action_correct_count horizontal_scale_action_correct_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot horizontal_scale_action_correct_count='Tuple {\n\tmessage : String = \'HorizontalScalingAction: \' + self.name +\n\t\t\t\t\t\' has a wrong (negative) value for the count attribute\',\n\tstatus : Boolean = count >= 0\n}.status' horizontal_scale_action_correct_type='Tuple {\n\tmessage : String = \'HorizontalScalingAction: \' + self.name + \' has a wrong type (\' +\n\t\t\t\t\tself.type.toString() + \'). It should be either SCALE_IN or SCALE_OUT\',\n\tstatus : Boolean = (self.type = camel::ActionType::SCALE_IN)\n\t\t\t\t\tor (self.type = camel::ActionType::SCALE_OUT)\n}.status'"
 * @generated
 */
public interface HorizontalScalingAction extends ScalingAction {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getHorizontalScalingAction_Count()
	 * @model
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.HorizontalScalingAction#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Internal Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Component</em>' reference.
	 * @see #setInternalComponent(InternalComponent)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getHorizontalScalingAction_InternalComponent()
	 * @model required="true"
	 * @generated
	 */
	InternalComponent getInternalComponent();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.HorizontalScalingAction#getInternalComponent <em>Internal Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Component</em>' reference.
	 * @see #getInternalComponent()
	 * @generated
	 */
	void setInternalComponent(InternalComponent value);

} // HorizontalScalingAction
