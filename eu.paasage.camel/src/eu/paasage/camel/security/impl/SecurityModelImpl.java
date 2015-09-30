/**
 */
package eu.paasage.camel.security.impl;

import eu.paasage.camel.impl.ModelImpl;
import eu.paasage.camel.requirement.SecurityRequirement;
import eu.paasage.camel.security.CompositeSecurityMetric;
import eu.paasage.camel.security.CompositeSecurityMetricInstance;
import eu.paasage.camel.security.RawSecurityMetric;
import eu.paasage.camel.security.RawSecurityMetricInstance;
import eu.paasage.camel.security.SecurityCapability;
import eu.paasage.camel.security.SecurityControl;
import eu.paasage.camel.security.SecurityDomain;
import eu.paasage.camel.security.SecurityModel;
import eu.paasage.camel.security.SecurityPackage;
import eu.paasage.camel.security.SecurityProperty;
import eu.paasage.camel.security.SecuritySLO;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityModelImpl#getSecurityControls <em>Security Controls</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityModelImpl#getSecurityRequirements <em>Security Requirements</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityModelImpl#getSecurityProperties <em>Security Properties</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityModelImpl#getRawSecurityMetrics <em>Raw Security Metrics</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityModelImpl#getCompositeSecurityMetrics <em>Composite Security Metrics</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityModelImpl#getRawSecurityMetricInstances <em>Raw Security Metric Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityModelImpl#getCompositeSecurityMetricInstances <em>Composite Security Metric Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityModelImpl#getSecurityDomains <em>Security Domains</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityModelImpl#getSecurityCapabilities <em>Security Capabilities</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityModelImpl#getSecuritySLOs <em>Security SL Os</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecurityModelImpl extends ModelImpl implements SecurityModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.SECURITY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SecurityControl> getSecurityControls() {
		return (EList<SecurityControl>)eGet(SecurityPackage.Literals.SECURITY_MODEL__SECURITY_CONTROLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SecurityRequirement> getSecurityRequirements() {
		return (EList<SecurityRequirement>)eGet(SecurityPackage.Literals.SECURITY_MODEL__SECURITY_REQUIREMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SecurityProperty> getSecurityProperties() {
		return (EList<SecurityProperty>)eGet(SecurityPackage.Literals.SECURITY_MODEL__SECURITY_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RawSecurityMetric> getRawSecurityMetrics() {
		return (EList<RawSecurityMetric>)eGet(SecurityPackage.Literals.SECURITY_MODEL__RAW_SECURITY_METRICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CompositeSecurityMetric> getCompositeSecurityMetrics() {
		return (EList<CompositeSecurityMetric>)eGet(SecurityPackage.Literals.SECURITY_MODEL__COMPOSITE_SECURITY_METRICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RawSecurityMetricInstance> getRawSecurityMetricInstances() {
		return (EList<RawSecurityMetricInstance>)eGet(SecurityPackage.Literals.SECURITY_MODEL__RAW_SECURITY_METRIC_INSTANCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CompositeSecurityMetricInstance> getCompositeSecurityMetricInstances() {
		return (EList<CompositeSecurityMetricInstance>)eGet(SecurityPackage.Literals.SECURITY_MODEL__COMPOSITE_SECURITY_METRIC_INSTANCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SecurityDomain> getSecurityDomains() {
		return (EList<SecurityDomain>)eGet(SecurityPackage.Literals.SECURITY_MODEL__SECURITY_DOMAINS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SecurityCapability> getSecurityCapabilities() {
		return (EList<SecurityCapability>)eGet(SecurityPackage.Literals.SECURITY_MODEL__SECURITY_CAPABILITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SecuritySLO> getSecuritySLOs() {
		return (EList<SecuritySLO>)eGet(SecurityPackage.Literals.SECURITY_MODEL__SECURITY_SL_OS, true);
	}

} //SecurityModelImpl
