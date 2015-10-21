/**
 */
package eu.paasage.camel.impl;

import eu.paasage.camel.Application;
import eu.paasage.camel.CamelPackage;

import eu.paasage.camel.deployment.DeploymentModel;

import eu.paasage.camel.organisation.Entity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.impl.ApplicationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link eu.paasage.camel.impl.ApplicationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eu.paasage.camel.impl.ApplicationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link eu.paasage.camel.impl.ApplicationImpl#getDeploymentModels <em>Deployment Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends CDOObjectImpl implements Application {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(CamelPackage.Literals.APPLICATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(CamelPackage.Literals.APPLICATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eGet(CamelPackage.Literals.APPLICATION__VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eSet(CamelPackage.Literals.APPLICATION__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(CamelPackage.Literals.APPLICATION__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(CamelPackage.Literals.APPLICATION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getOwner() {
		return (Entity)eGet(CamelPackage.Literals.APPLICATION__OWNER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Entity newOwner) {
		eSet(CamelPackage.Literals.APPLICATION__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DeploymentModel> getDeploymentModels() {
		return (EList<DeploymentModel>)eGet(CamelPackage.Literals.APPLICATION__DEPLOYMENT_MODELS, true);
	}

} //ApplicationImpl
