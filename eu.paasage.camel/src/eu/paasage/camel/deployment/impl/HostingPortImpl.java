/**
 */
package eu.paasage.camel.deployment.impl;

import eu.paasage.camel.deployment.DeploymentPackage;
import eu.paasage.camel.deployment.HostingPort;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hosting Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class HostingPortImpl extends DeploymentElementImpl implements HostingPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostingPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.HOSTING_PORT;
	}

} //HostingPortImpl
