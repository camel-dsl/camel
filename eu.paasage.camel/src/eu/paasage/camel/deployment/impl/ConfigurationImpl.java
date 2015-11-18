/**
 */
package eu.paasage.camel.deployment.impl;

import eu.paasage.camel.deployment.Configuration;
import eu.paasage.camel.deployment.DeploymentPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.impl.ConfigurationImpl#getDownloadCommand <em>Download Command</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.ConfigurationImpl#getUploadCommand <em>Upload Command</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.ConfigurationImpl#getInstallCommand <em>Install Command</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.ConfigurationImpl#getConfigureCommand <em>Configure Command</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.ConfigurationImpl#getStartCommand <em>Start Command</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.ConfigurationImpl#getStopCommand <em>Stop Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends DeploymentElementImpl implements Configuration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDownloadCommand() {
		return (String)eGet(DeploymentPackage.Literals.CONFIGURATION__DOWNLOAD_COMMAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownloadCommand(String newDownloadCommand) {
		eSet(DeploymentPackage.Literals.CONFIGURATION__DOWNLOAD_COMMAND, newDownloadCommand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUploadCommand() {
		return (String)eGet(DeploymentPackage.Literals.CONFIGURATION__UPLOAD_COMMAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUploadCommand(String newUploadCommand) {
		eSet(DeploymentPackage.Literals.CONFIGURATION__UPLOAD_COMMAND, newUploadCommand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstallCommand() {
		return (String)eGet(DeploymentPackage.Literals.CONFIGURATION__INSTALL_COMMAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstallCommand(String newInstallCommand) {
		eSet(DeploymentPackage.Literals.CONFIGURATION__INSTALL_COMMAND, newInstallCommand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigureCommand() {
		return (String)eGet(DeploymentPackage.Literals.CONFIGURATION__CONFIGURE_COMMAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigureCommand(String newConfigureCommand) {
		eSet(DeploymentPackage.Literals.CONFIGURATION__CONFIGURE_COMMAND, newConfigureCommand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartCommand() {
		return (String)eGet(DeploymentPackage.Literals.CONFIGURATION__START_COMMAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartCommand(String newStartCommand) {
		eSet(DeploymentPackage.Literals.CONFIGURATION__START_COMMAND, newStartCommand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStopCommand() {
		return (String)eGet(DeploymentPackage.Literals.CONFIGURATION__STOP_COMMAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopCommand(String newStopCommand) {
		eSet(DeploymentPackage.Literals.CONFIGURATION__STOP_COMMAND, newStopCommand);
	}

} //ConfigurationImpl
