/**
 */
package eu.paasage.camel;

import org.eclipse.emf.cdo.CDOObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.Action#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.Action#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.CamelPackage#getAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='correct_action_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot correct_action_type='Tuple {\n\tmessage : String = \'Action: \' + self.toString() + \' has a wrong type (\' + self.type.toString() +\n\t\t\t\t\t\'). Any kind of scaling action should be take one of the four possible action type values, while in the opposite case should map to a CREATION_EVENT\',\n\tstatus : Boolean = if\n\t\t\t\t\t\t(self.oclIsKindOf(camel::scalability::ScalingAction))\n\t\t\t\t\tthen (self.type = ActionType::SCALE_IN or self.type = ActionType::SCALE_OUT or self.type = ActionType::SCALE_UP or\n\t\t\t\t\t\tself.type = ActionType::SCALE_DOWN)\n\t\t\t\t\telse not (self.type = ActionType::SCALE_IN or self.type = ActionType::SCALE_OUT or self.type =\n\t\t\t\t\t\tActionType::SCALE_UP or self.type = ActionType::SCALE_DOWN)\n\t\t\t\t\tendif\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface Action extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.paasage.camel.CamelPackage#getAction_Name()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='InternalComponentMeasurement' unique='false' upper='*'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eu.paasage.camel.ActionType
	 * @see #setType(ActionType)
	 * @see eu.paasage.camel.CamelPackage#getAction_Type()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='UserGroup' unique='false' upper='*'"
	 * @generated
	 */
	ActionType getType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.Action#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.paasage.camel.ActionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActionType value);

} // Action
