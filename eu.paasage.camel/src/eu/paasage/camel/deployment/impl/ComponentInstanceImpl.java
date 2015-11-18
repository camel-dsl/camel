/**
 */
package eu.paasage.camel.deployment.impl;

import eu.paasage.camel.deployment.Component;
import eu.paasage.camel.deployment.ComponentInstance;
import eu.paasage.camel.deployment.DeploymentPackage;
import eu.paasage.camel.deployment.ProvidedCommunicationInstance;
import eu.paasage.camel.deployment.ProvidedHostInstance;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.impl.ComponentInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.ComponentInstanceImpl#getProvidedCommunicationInstances <em>Provided Communication Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.ComponentInstanceImpl#getProvidedHostInstances <em>Provided Host Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.ComponentInstanceImpl#getInstantiatedOn <em>Instantiated On</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.ComponentInstanceImpl#getDestroyedOn <em>Destroyed On</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentInstanceImpl extends DeploymentElementImpl implements ComponentInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getType() {
		return (Component)eGet(DeploymentPackage.Literals.COMPONENT_INSTANCE__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Component newType) {
		eSet(DeploymentPackage.Literals.COMPONENT_INSTANCE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProvidedCommunicationInstance> getProvidedCommunicationInstances() {
		return (EList<ProvidedCommunicationInstance>)eGet(DeploymentPackage.Literals.COMPONENT_INSTANCE__PROVIDED_COMMUNICATION_INSTANCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProvidedHostInstance> getProvidedHostInstances() {
		return (EList<ProvidedHostInstance>)eGet(DeploymentPackage.Literals.COMPONENT_INSTANCE__PROVIDED_HOST_INSTANCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getInstantiatedOn() {
		return (Date)eGet(DeploymentPackage.Literals.COMPONENT_INSTANCE__INSTANTIATED_ON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiatedOn(Date newInstantiatedOn) {
		eSet(DeploymentPackage.Literals.COMPONENT_INSTANCE__INSTANTIATED_ON, newInstantiatedOn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDestroyedOn() {
		return (Date)eGet(DeploymentPackage.Literals.COMPONENT_INSTANCE__DESTROYED_ON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestroyedOn(Date newDestroyedOn) {
		eSet(DeploymentPackage.Literals.COMPONENT_INSTANCE__DESTROYED_ON, newDestroyedOn);
	}

} //ComponentInstanceImpl
