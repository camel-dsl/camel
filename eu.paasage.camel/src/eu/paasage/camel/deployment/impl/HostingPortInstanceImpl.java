/**
 */
package eu.paasage.camel.deployment.impl;

import eu.paasage.camel.deployment.DeploymentPackage;
import eu.paasage.camel.deployment.HostingPort;
import eu.paasage.camel.deployment.HostingPortInstance;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hosting Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.impl.HostingPortInstanceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HostingPortInstanceImpl extends DeploymentElementImpl implements HostingPortInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostingPortInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.HOSTING_PORT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostingPort getType() {
		return (HostingPort)eGet(DeploymentPackage.Literals.HOSTING_PORT_INSTANCE__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(HostingPort newType) {
		eSet(DeploymentPackage.Literals.HOSTING_PORT_INSTANCE__TYPE, newType);
	}

} //HostingPortInstanceImpl
