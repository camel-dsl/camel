/**
 */
package eu.paasage.camel.deployment;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.ComponentInstance#getType <em>Type</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.ComponentInstance#getProvidedCommunicationInstances <em>Provided Communication Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.ComponentInstance#getProvidedHostInstances <em>Provided Host Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.ComponentInstance#getInstantiatedOn <em>Instantiated On</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.ComponentInstance#getDestroyedOn <em>Destroyed On</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.deployment.DeploymentPackage#getComponentInstance()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='component_port_instances_of_correct_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot component_port_instances_of_correct_type='Tuple {\n\tmessage : String = \'The type of component instance:\' + self.name +\n\t\t\t\t\' should have as provided communication/hosts the types of the component instance\\\'s provided communication/host instances\',\n\tstatus : Boolean = providedCommunicationInstances\n\t\t\t\t->forAll(p | type.providedCommunications\n\t\t\t\t\t->includes(p.type)) and providedHostInstances\n\t\t\t\t->forAll(p | type.providedHosts\n\t\t\t\t\t->includes(p.type))\n}.status'"
 * @generated
 */
public interface ComponentInstance extends DeploymentElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Component)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getComponentInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	Component getType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.ComponentInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Component value);

	/**
	 * Returns the value of the '<em><b>Provided Communication Instances</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.ProvidedCommunicationInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Communication Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Communication Instances</em>' containment reference list.
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getComponentInstance_ProvidedCommunicationInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedCommunicationInstance> getProvidedCommunicationInstances();

	/**
	 * Returns the value of the '<em><b>Provided Host Instances</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.ProvidedHostInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Host Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Host Instances</em>' containment reference list.
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getComponentInstance_ProvidedHostInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedHostInstance> getProvidedHostInstances();

	/**
	 * Returns the value of the '<em><b>Instantiated On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiated On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiated On</em>' attribute.
	 * @see #setInstantiatedOn(Date)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getComponentInstance_InstantiatedOn()
	 * @model
	 * @generated
	 */
	Date getInstantiatedOn();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.ComponentInstance#getInstantiatedOn <em>Instantiated On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiated On</em>' attribute.
	 * @see #getInstantiatedOn()
	 * @generated
	 */
	void setInstantiatedOn(Date value);

	/**
	 * Returns the value of the '<em><b>Destroyed On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destroyed On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destroyed On</em>' attribute.
	 * @see #setDestroyedOn(Date)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getComponentInstance_DestroyedOn()
	 * @model
	 * @generated
	 */
	Date getDestroyedOn();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.ComponentInstance#getDestroyedOn <em>Destroyed On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destroyed On</em>' attribute.
	 * @see #getDestroyedOn()
	 * @generated
	 */
	void setDestroyedOn(Date value);

} // ComponentInstance
