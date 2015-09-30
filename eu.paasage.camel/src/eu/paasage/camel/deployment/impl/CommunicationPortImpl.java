/**
 */
package eu.paasage.camel.deployment.impl;

import eu.paasage.camel.deployment.CommunicationPort;
import eu.paasage.camel.deployment.DeploymentPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.impl.CommunicationPortImpl#getPortNumber <em>Port Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CommunicationPortImpl extends DeploymentElementImpl implements CommunicationPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.COMMUNICATION_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPortNumber() {
		return (Integer)eGet(DeploymentPackage.Literals.COMMUNICATION_PORT__PORT_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortNumber(int newPortNumber) {
		eSet(DeploymentPackage.Literals.COMMUNICATION_PORT__PORT_NUMBER, newPortNumber);
	}

} //CommunicationPortImpl
