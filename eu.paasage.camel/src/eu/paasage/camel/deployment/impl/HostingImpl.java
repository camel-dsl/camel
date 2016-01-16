/**
 */
package eu.paasage.camel.deployment.impl;

import eu.paasage.camel.deployment.Configuration;
import eu.paasage.camel.deployment.DeploymentPackage;
import eu.paasage.camel.deployment.Hosting;
import eu.paasage.camel.deployment.ProvidedHost;
import eu.paasage.camel.deployment.RequiredHost;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hosting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.impl.HostingImpl#getProvidedHost <em>Provided Host</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.HostingImpl#getRequiredHost <em>Required Host</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.HostingImpl#getProvidedHostConfiguration <em>Provided Host Configuration</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.HostingImpl#getRequiredHostConfiguration <em>Required Host Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HostingImpl extends DeploymentElementImpl implements Hosting {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.HOSTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedHost getProvidedHost() {
		return (ProvidedHost)eGet(DeploymentPackage.Literals.HOSTING__PROVIDED_HOST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedHost(ProvidedHost newProvidedHost) {
		eSet(DeploymentPackage.Literals.HOSTING__PROVIDED_HOST, newProvidedHost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredHost getRequiredHost() {
		return (RequiredHost)eGet(DeploymentPackage.Literals.HOSTING__REQUIRED_HOST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredHost(RequiredHost newRequiredHost) {
		eSet(DeploymentPackage.Literals.HOSTING__REQUIRED_HOST, newRequiredHost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getProvidedHostConfiguration() {
		return (Configuration)eGet(DeploymentPackage.Literals.HOSTING__PROVIDED_HOST_CONFIGURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedHostConfiguration(Configuration newProvidedHostConfiguration) {
		eSet(DeploymentPackage.Literals.HOSTING__PROVIDED_HOST_CONFIGURATION, newProvidedHostConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getRequiredHostConfiguration() {
		return (Configuration)eGet(DeploymentPackage.Literals.HOSTING__REQUIRED_HOST_CONFIGURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredHostConfiguration(Configuration newRequiredHostConfiguration) {
		eSet(DeploymentPackage.Literals.HOSTING__REQUIRED_HOST_CONFIGURATION, newRequiredHostConfiguration);
	}

} //HostingImpl
