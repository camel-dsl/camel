/**
 */
package eu.paasage.camel.security;

import eu.paasage.camel.Model;

import eu.paasage.camel.requirement.SecurityRequirement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.security.SecurityModel#getSecurityControls <em>Security Controls</em>}</li>
 *   <li>{@link eu.paasage.camel.security.SecurityModel#getSecurityRequirements <em>Security Requirements</em>}</li>
 *   <li>{@link eu.paasage.camel.security.SecurityModel#getSecurityProperties <em>Security Properties</em>}</li>
 *   <li>{@link eu.paasage.camel.security.SecurityModel#getRawSecurityMetrics <em>Raw Security Metrics</em>}</li>
 *   <li>{@link eu.paasage.camel.security.SecurityModel#getCompositeSecurityMetrics <em>Composite Security Metrics</em>}</li>
 *   <li>{@link eu.paasage.camel.security.SecurityModel#getRawSecurityMetricInstances <em>Raw Security Metric Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.security.SecurityModel#getCompositeSecurityMetricInstances <em>Composite Security Metric Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.security.SecurityModel#getSecurityDomains <em>Security Domains</em>}</li>
 *   <li>{@link eu.paasage.camel.security.SecurityModel#getSecurityCapabilities <em>Security Capabilities</em>}</li>
 *   <li>{@link eu.paasage.camel.security.SecurityModel#getSecuritySLOs <em>Security SL Os</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.security.SecurityPackage#getSecurityModel()
 * @model
 * @generated
 */
public interface SecurityModel extends Model {
	/**
	 * Returns the value of the '<em><b>Security Controls</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.security.SecurityControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Controls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Controls</em>' containment reference list.
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityModel_SecurityControls()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SecurityControl> getSecurityControls();

	/**
	 * Returns the value of the '<em><b>Security Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.requirement.SecurityRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Requirements</em>' containment reference list.
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityModel_SecurityRequirements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SecurityRequirement> getSecurityRequirements();

	/**
	 * Returns the value of the '<em><b>Security Properties</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.security.SecurityProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Properties</em>' containment reference list.
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityModel_SecurityProperties()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SecurityProperty> getSecurityProperties();

	/**
	 * Returns the value of the '<em><b>Raw Security Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.security.RawSecurityMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Security Metrics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Security Metrics</em>' containment reference list.
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityModel_RawSecurityMetrics()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RawSecurityMetric> getRawSecurityMetrics();

	/**
	 * Returns the value of the '<em><b>Composite Security Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.security.CompositeSecurityMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Security Metrics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Security Metrics</em>' containment reference list.
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityModel_CompositeSecurityMetrics()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CompositeSecurityMetric> getCompositeSecurityMetrics();

	/**
	 * Returns the value of the '<em><b>Raw Security Metric Instances</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.security.RawSecurityMetricInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Security Metric Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Security Metric Instances</em>' containment reference list.
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityModel_RawSecurityMetricInstances()
	 * @model containment="true" ordered="false"
	 *        annotation="teneo.jpa value='@JoinColumn(name=\"rawsecuritymetricInstances\")'"
	 * @generated
	 */
	EList<RawSecurityMetricInstance> getRawSecurityMetricInstances();

	/**
	 * Returns the value of the '<em><b>Composite Security Metric Instances</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.security.CompositeSecurityMetricInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Security Metric Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Security Metric Instances</em>' containment reference list.
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityModel_CompositeSecurityMetricInstances()
	 * @model containment="true" ordered="false"
	 *        annotation="teneo.jpa value='@JoinColumn(name=\"compositesecuritymetricInstances\")'"
	 * @generated
	 */
	EList<CompositeSecurityMetricInstance> getCompositeSecurityMetricInstances();

	/**
	 * Returns the value of the '<em><b>Security Domains</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.security.SecurityDomain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Domains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Domains</em>' containment reference list.
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityModel_SecurityDomains()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SecurityDomain> getSecurityDomains();

	/**
	 * Returns the value of the '<em><b>Security Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.security.SecurityCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Capabilities</em>' containment reference list.
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityModel_SecurityCapabilities()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SecurityCapability> getSecurityCapabilities();

	/**
	 * Returns the value of the '<em><b>Security SL Os</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.security.SecuritySLO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security SL Os</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security SL Os</em>' containment reference list.
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityModel_SecuritySLOs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecuritySLO> getSecuritySLOs();

} // SecurityModel
