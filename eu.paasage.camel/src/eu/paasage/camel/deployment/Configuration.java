/**
 */
package eu.paasage.camel.deployment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.Configuration#getDownloadCommand <em>Download Command</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.Configuration#getUploadCommand <em>Upload Command</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.Configuration#getInstallCommand <em>Install Command</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.Configuration#getConfigureCommand <em>Configure Command</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.Configuration#getStartCommand <em>Start Command</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.Configuration#getStopCommand <em>Stop Command</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.deployment.DeploymentPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends DeploymentElement {
	/**
	 * Returns the value of the '<em><b>Download Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Download Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Download Command</em>' attribute.
	 * @see #setDownloadCommand(String)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getConfiguration_DownloadCommand()
	 * @model
	 * @generated
	 */
	String getDownloadCommand();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.Configuration#getDownloadCommand <em>Download Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Download Command</em>' attribute.
	 * @see #getDownloadCommand()
	 * @generated
	 */
	void setDownloadCommand(String value);

	/**
	 * Returns the value of the '<em><b>Upload Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upload Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upload Command</em>' attribute.
	 * @see #setUploadCommand(String)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getConfiguration_UploadCommand()
	 * @model
	 * @generated
	 */
	String getUploadCommand();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.Configuration#getUploadCommand <em>Upload Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upload Command</em>' attribute.
	 * @see #getUploadCommand()
	 * @generated
	 */
	void setUploadCommand(String value);

	/**
	 * Returns the value of the '<em><b>Install Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Install Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Install Command</em>' attribute.
	 * @see #setInstallCommand(String)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getConfiguration_InstallCommand()
	 * @model
	 * @generated
	 */
	String getInstallCommand();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.Configuration#getInstallCommand <em>Install Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Install Command</em>' attribute.
	 * @see #getInstallCommand()
	 * @generated
	 */
	void setInstallCommand(String value);

	/**
	 * Returns the value of the '<em><b>Configure Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configure Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configure Command</em>' attribute.
	 * @see #setConfigureCommand(String)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getConfiguration_ConfigureCommand()
	 * @model
	 * @generated
	 */
	String getConfigureCommand();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.Configuration#getConfigureCommand <em>Configure Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configure Command</em>' attribute.
	 * @see #getConfigureCommand()
	 * @generated
	 */
	void setConfigureCommand(String value);

	/**
	 * Returns the value of the '<em><b>Start Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Command</em>' attribute.
	 * @see #setStartCommand(String)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getConfiguration_StartCommand()
	 * @model
	 * @generated
	 */
	String getStartCommand();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.Configuration#getStartCommand <em>Start Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Command</em>' attribute.
	 * @see #getStartCommand()
	 * @generated
	 */
	void setStartCommand(String value);

	/**
	 * Returns the value of the '<em><b>Stop Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Command</em>' attribute.
	 * @see #setStopCommand(String)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getConfiguration_StopCommand()
	 * @model
	 * @generated
	 */
	String getStopCommand();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.Configuration#getStopCommand <em>Stop Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Command</em>' attribute.
	 * @see #getStopCommand()
	 * @generated
	 */
	void setStopCommand(String value);

} // Configuration
