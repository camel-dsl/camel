/**
 */
package eu.paasage.camel.deployment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.InternalComponentInstance#getRequiredCommunicationInstances <em>Required Communication Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.InternalComponentInstance#getRequiredHostInstance <em>Required Host Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.deployment.DeploymentPackage#getInternalComponentInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='internal_component_port_instances_of_correct_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot internal_component_port_instances_of_correct_type='Tuple {\n\tmessage : String = \'The type of component instance:\' + self.name +\n\t\t\t\t\' should have as required communication/hosts the types of the component instance\\\'s required communication/host instances\',\n\tstatus : Boolean = type.oclIsKindOf(InternalComponent)\n\t\t\t\tand requiredCommunicationInstances\n\t\t\t\t->forAll(p | type.oclAsType(InternalComponent).requiredCommunications\n\t\t\t\t\t->includes(p.type)) and (requiredHostInstance <> null implies requiredHostInstance.type =\n\t\t\t\ttype.oclAsType(InternalComponent).requiredHost)\n}.status'"
 * @generated
 */
public interface InternalComponentInstance extends ComponentInstance {
	/**
	 * Returns the value of the '<em><b>Required Communication Instances</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.RequiredCommunicationInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Communication Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Communication Instances</em>' containment reference list.
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getInternalComponentInstance_RequiredCommunicationInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredCommunicationInstance> getRequiredCommunicationInstances();

	/**
	 * Returns the value of the '<em><b>Required Host Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Host Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Host Instance</em>' containment reference.
	 * @see #setRequiredHostInstance(RequiredHostInstance)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getInternalComponentInstance_RequiredHostInstance()
	 * @model containment="true"
	 * @generated
	 */
	RequiredHostInstance getRequiredHostInstance();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.InternalComponentInstance#getRequiredHostInstance <em>Required Host Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Host Instance</em>' containment reference.
	 * @see #getRequiredHostInstance()
	 * @generated
	 */
	void setRequiredHostInstance(RequiredHostInstance value);

} // InternalComponentInstance
