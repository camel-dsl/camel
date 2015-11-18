/**
 */
package eu.paasage.camel.deployment.impl;

import eu.paasage.camel.deployment.DeploymentPackage;
import eu.paasage.camel.deployment.Hosting;
import eu.paasage.camel.deployment.HostingInstance;
import eu.paasage.camel.deployment.ProvidedHostInstance;
import eu.paasage.camel.deployment.RequiredHostInstance;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hosting Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.impl.HostingInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.HostingInstanceImpl#getProvidedHostInstance <em>Provided Host Instance</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.HostingInstanceImpl#getRequiredHostInstance <em>Required Host Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostingInstanceImpl extends DeploymentElementImpl implements HostingInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostingInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.HOSTING_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hosting getType() {
		return (Hosting)eGet(DeploymentPackage.Literals.HOSTING_INSTANCE__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Hosting newType) {
		eSet(DeploymentPackage.Literals.HOSTING_INSTANCE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedHostInstance getProvidedHostInstance() {
		return (ProvidedHostInstance)eGet(DeploymentPackage.Literals.HOSTING_INSTANCE__PROVIDED_HOST_INSTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedHostInstance(ProvidedHostInstance newProvidedHostInstance) {
		eSet(DeploymentPackage.Literals.HOSTING_INSTANCE__PROVIDED_HOST_INSTANCE, newProvidedHostInstance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredHostInstance getRequiredHostInstance() {
		return (RequiredHostInstance)eGet(DeploymentPackage.Literals.HOSTING_INSTANCE__REQUIRED_HOST_INSTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredHostInstance(RequiredHostInstance newRequiredHostInstance) {
		eSet(DeploymentPackage.Literals.HOSTING_INSTANCE__REQUIRED_HOST_INSTANCE, newRequiredHostInstance);
	}

} //HostingInstanceImpl
