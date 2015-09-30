/**
 */
package eu.paasage.camel.impl;

import eu.paasage.camel.Action;
import eu.paasage.camel.Application;
import eu.paasage.camel.CamelModel;
import eu.paasage.camel.CamelPackage;
import eu.paasage.camel.deployment.DeploymentModel;
import eu.paasage.camel.execution.ExecutionModel;
import eu.paasage.camel.location.LocationModel;
import eu.paasage.camel.metric.MetricModel;
import eu.paasage.camel.organisation.OrganisationModel;
import eu.paasage.camel.provider.ProviderModel;
import eu.paasage.camel.requirement.RequirementModel;
import eu.paasage.camel.scalability.ScalabilityModel;
import eu.paasage.camel.security.SecurityModel;
import eu.paasage.camel.type.TypeModel;
import eu.paasage.camel.unit.UnitModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.impl.CamelModelImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link eu.paasage.camel.impl.CamelModelImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link eu.paasage.camel.impl.CamelModelImpl#getDeploymentModels <em>Deployment Models</em>}</li>
 *   <li>{@link eu.paasage.camel.impl.CamelModelImpl#getExecutionModels <em>Execution Models</em>}</li>
 *   <li>{@link eu.paasage.camel.impl.CamelModelImpl#getLocationModels <em>Location Models</em>}</li>
 *   <li>{@link eu.paasage.camel.impl.CamelModelImpl#getMetricModels <em>Metric Models</em>}</li>
 *   <li>{@link eu.paasage.camel.impl.CamelModelImpl#getOrganisationModels <em>Organisation Models</em>}</li>
 *   <li>{@link eu.paasage.camel.impl.CamelModelImpl#getProviderModels <em>Provider Models</em>}</li>
 *   <li>{@link eu.paasage.camel.impl.CamelModelImpl#getRequirementModels <em>Requirement Models</em>}</li>
 *   <li>{@link eu.paasage.camel.impl.CamelModelImpl#getScalabilityModels <em>Scalability Models</em>}</li>
 *   <li>{@link eu.paasage.camel.impl.CamelModelImpl#getSecurityModels <em>Security Models</em>}</li>
 *   <li>{@link eu.paasage.camel.impl.CamelModelImpl#getTypeModels <em>Type Models</em>}</li>
 *   <li>{@link eu.paasage.camel.impl.CamelModelImpl#getUnitModels <em>Unit Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelModelImpl extends ModelImpl implements CamelModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamelModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelPackage.Literals.CAMEL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Action> getActions() {
		return (EList<Action>)eGet(CamelPackage.Literals.CAMEL_MODEL__ACTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Application> getApplications() {
		return (EList<Application>)eGet(CamelPackage.Literals.CAMEL_MODEL__APPLICATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DeploymentModel> getDeploymentModels() {
		return (EList<DeploymentModel>)eGet(CamelPackage.Literals.CAMEL_MODEL__DEPLOYMENT_MODELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExecutionModel> getExecutionModels() {
		return (EList<ExecutionModel>)eGet(CamelPackage.Literals.CAMEL_MODEL__EXECUTION_MODELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LocationModel> getLocationModels() {
		return (EList<LocationModel>)eGet(CamelPackage.Literals.CAMEL_MODEL__LOCATION_MODELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MetricModel> getMetricModels() {
		return (EList<MetricModel>)eGet(CamelPackage.Literals.CAMEL_MODEL__METRIC_MODELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OrganisationModel> getOrganisationModels() {
		return (EList<OrganisationModel>)eGet(CamelPackage.Literals.CAMEL_MODEL__ORGANISATION_MODELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProviderModel> getProviderModels() {
		return (EList<ProviderModel>)eGet(CamelPackage.Literals.CAMEL_MODEL__PROVIDER_MODELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RequirementModel> getRequirementModels() {
		return (EList<RequirementModel>)eGet(CamelPackage.Literals.CAMEL_MODEL__REQUIREMENT_MODELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ScalabilityModel> getScalabilityModels() {
		return (EList<ScalabilityModel>)eGet(CamelPackage.Literals.CAMEL_MODEL__SCALABILITY_MODELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SecurityModel> getSecurityModels() {
		return (EList<SecurityModel>)eGet(CamelPackage.Literals.CAMEL_MODEL__SECURITY_MODELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeModel> getTypeModels() {
		return (EList<TypeModel>)eGet(CamelPackage.Literals.CAMEL_MODEL__TYPE_MODELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UnitModel> getUnitModels() {
		return (EList<UnitModel>)eGet(CamelPackage.Literals.CAMEL_MODEL__UNIT_MODELS, true);
	}

} //CamelModelImpl
