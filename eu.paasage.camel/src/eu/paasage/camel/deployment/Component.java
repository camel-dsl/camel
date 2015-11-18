/**
 */
package eu.paasage.camel.deployment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.Component#getProvidedCommunications <em>Provided Communications</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.Component#getProvidedHosts <em>Provided Hosts</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.Component#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.deployment.DeploymentPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends DeploymentElement {
	/**
	 * Returns the value of the '<em><b>Provided Communications</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.ProvidedCommunication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Communications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Communications</em>' containment reference list.
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getComponent_ProvidedCommunications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedCommunication> getProvidedCommunications();

	/**
	 * Returns the value of the '<em><b>Provided Hosts</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.ProvidedHost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Hosts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Hosts</em>' containment reference list.
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getComponent_ProvidedHosts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedHost> getProvidedHosts();

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getComponent_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Configuration> getConfigurations();

} // Component
