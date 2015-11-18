/**
 */
package eu.paasage.camel;

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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.CamelModel#getActions <em>Actions</em>}</li>
 *   <li>{@link eu.paasage.camel.CamelModel#getApplications <em>Applications</em>}</li>
 *   <li>{@link eu.paasage.camel.CamelModel#getDeploymentModels <em>Deployment Models</em>}</li>
 *   <li>{@link eu.paasage.camel.CamelModel#getExecutionModels <em>Execution Models</em>}</li>
 *   <li>{@link eu.paasage.camel.CamelModel#getLocationModels <em>Location Models</em>}</li>
 *   <li>{@link eu.paasage.camel.CamelModel#getMetricModels <em>Metric Models</em>}</li>
 *   <li>{@link eu.paasage.camel.CamelModel#getOrganisationModels <em>Organisation Models</em>}</li>
 *   <li>{@link eu.paasage.camel.CamelModel#getProviderModels <em>Provider Models</em>}</li>
 *   <li>{@link eu.paasage.camel.CamelModel#getRequirementModels <em>Requirement Models</em>}</li>
 *   <li>{@link eu.paasage.camel.CamelModel#getScalabilityModels <em>Scalability Models</em>}</li>
 *   <li>{@link eu.paasage.camel.CamelModel#getSecurityModels <em>Security Models</em>}</li>
 *   <li>{@link eu.paasage.camel.CamelModel#getTypeModels <em>Type Models</em>}</li>
 *   <li>{@link eu.paasage.camel.CamelModel#getUnitModels <em>Unit Models</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.CamelPackage#getCamelModel()
 * @model
 * @generated
 */
public interface CamelModel extends Model {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see eu.paasage.camel.CamelPackage#getCamelModel_Actions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.Application}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see eu.paasage.camel.CamelPackage#getCamelModel_Applications()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Application> getApplications();

	/**
	 * Returns the value of the '<em><b>Deployment Models</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.DeploymentModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Models</em>' containment reference list.
	 * @see eu.paasage.camel.CamelPackage#getCamelModel_DeploymentModels()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DeploymentModel> getDeploymentModels();

	/**
	 * Returns the value of the '<em><b>Execution Models</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.execution.ExecutionModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Models</em>' containment reference list.
	 * @see eu.paasage.camel.CamelPackage#getCamelModel_ExecutionModels()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ExecutionModel> getExecutionModels();

	/**
	 * Returns the value of the '<em><b>Location Models</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.location.LocationModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Models</em>' containment reference list.
	 * @see eu.paasage.camel.CamelPackage#getCamelModel_LocationModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocationModel> getLocationModels();

	/**
	 * Returns the value of the '<em><b>Metric Models</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.metric.MetricModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Models</em>' containment reference list.
	 * @see eu.paasage.camel.CamelPackage#getCamelModel_MetricModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetricModel> getMetricModels();

	/**
	 * Returns the value of the '<em><b>Organisation Models</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.organisation.OrganisationModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation Models</em>' containment reference list.
	 * @see eu.paasage.camel.CamelPackage#getCamelModel_OrganisationModels()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<OrganisationModel> getOrganisationModels();

	/**
	 * Returns the value of the '<em><b>Provider Models</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.provider.ProviderModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Models</em>' containment reference list.
	 * @see eu.paasage.camel.CamelPackage#getCamelModel_ProviderModels()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ProviderModel> getProviderModels();

	/**
	 * Returns the value of the '<em><b>Requirement Models</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.requirement.RequirementModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Models</em>' containment reference list.
	 * @see eu.paasage.camel.CamelPackage#getCamelModel_RequirementModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementModel> getRequirementModels();

	/**
	 * Returns the value of the '<em><b>Scalability Models</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.scalability.ScalabilityModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalability Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalability Models</em>' containment reference list.
	 * @see eu.paasage.camel.CamelPackage#getCamelModel_ScalabilityModels()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ScalabilityModel> getScalabilityModels();

	/**
	 * Returns the value of the '<em><b>Security Models</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.security.SecurityModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Models</em>' containment reference list.
	 * @see eu.paasage.camel.CamelPackage#getCamelModel_SecurityModels()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SecurityModel> getSecurityModels();

	/**
	 * Returns the value of the '<em><b>Type Models</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.type.TypeModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Models</em>' containment reference list.
	 * @see eu.paasage.camel.CamelPackage#getCamelModel_TypeModels()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TypeModel> getTypeModels();

	/**
	 * Returns the value of the '<em><b>Unit Models</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.unit.UnitModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Models</em>' containment reference list.
	 * @see eu.paasage.camel.CamelPackage#getCamelModel_UnitModels()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<UnitModel> getUnitModels();

} // CamelModel
