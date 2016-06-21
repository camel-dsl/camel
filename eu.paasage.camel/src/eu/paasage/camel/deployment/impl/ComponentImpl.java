/**
 */
package eu.paasage.camel.deployment.impl;

import eu.paasage.camel.deployment.Component;
import eu.paasage.camel.deployment.Configuration;
import eu.paasage.camel.deployment.DeploymentPackage;
import eu.paasage.camel.deployment.ProvidedCommunication;
import eu.paasage.camel.deployment.ProvidedHost;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.impl.ComponentImpl#getProvidedCommunications <em>Provided Communications</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.ComponentImpl#getProvidedHosts <em>Provided Hosts</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.ComponentImpl#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends DeploymentElementImpl implements Component {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProvidedCommunication> getProvidedCommunications() {
		return (EList<ProvidedCommunication>)eGet(DeploymentPackage.Literals.COMPONENT__PROVIDED_COMMUNICATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProvidedHost> getProvidedHosts() {
		return (EList<ProvidedHost>)eGet(DeploymentPackage.Literals.COMPONENT__PROVIDED_HOSTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Configuration> getConfigurations() {
		return (EList<Configuration>)eGet(DeploymentPackage.Literals.COMPONENT__CONFIGURATIONS, true);
	}

} //ComponentImpl
