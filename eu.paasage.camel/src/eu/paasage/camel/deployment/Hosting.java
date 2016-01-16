/**
 */
package eu.paasage.camel.deployment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hosting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.Hosting#getProvidedHost <em>Provided Host</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.Hosting#getRequiredHost <em>Required Host</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.Hosting#getProvidedHostConfiguration <em>Provided Host Configuration</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.Hosting#getRequiredHostConfiguration <em>Required Host Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.deployment.DeploymentPackage#getHosting()
 * @model
 * @generated
 */
public interface Hosting extends DeploymentElement {
	/**
	 * Returns the value of the '<em><b>Provided Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Host</em>' reference.
	 * @see #setProvidedHost(ProvidedHost)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getHosting_ProvidedHost()
	 * @model required="true"
	 * @generated
	 */
	ProvidedHost getProvidedHost();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.Hosting#getProvidedHost <em>Provided Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Host</em>' reference.
	 * @see #getProvidedHost()
	 * @generated
	 */
	void setProvidedHost(ProvidedHost value);

	/**
	 * Returns the value of the '<em><b>Required Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Host</em>' reference.
	 * @see #setRequiredHost(RequiredHost)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getHosting_RequiredHost()
	 * @model required="true"
	 * @generated
	 */
	RequiredHost getRequiredHost();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.Hosting#getRequiredHost <em>Required Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Host</em>' reference.
	 * @see #getRequiredHost()
	 * @generated
	 */
	void setRequiredHost(RequiredHost value);

	/**
	 * Returns the value of the '<em><b>Provided Host Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Host Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Host Configuration</em>' containment reference.
	 * @see #setProvidedHostConfiguration(Configuration)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getHosting_ProvidedHostConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	Configuration getProvidedHostConfiguration();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.Hosting#getProvidedHostConfiguration <em>Provided Host Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Host Configuration</em>' containment reference.
	 * @see #getProvidedHostConfiguration()
	 * @generated
	 */
	void setProvidedHostConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Required Host Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Host Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Host Configuration</em>' containment reference.
	 * @see #setRequiredHostConfiguration(Configuration)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getHosting_RequiredHostConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	Configuration getRequiredHostConfiguration();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.Hosting#getRequiredHostConfiguration <em>Required Host Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Host Configuration</em>' containment reference.
	 * @see #getRequiredHostConfiguration()
	 * @generated
	 */
	void setRequiredHostConfiguration(Configuration value);

} // Hosting
