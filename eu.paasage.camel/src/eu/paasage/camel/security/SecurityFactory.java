/**
 */
package eu.paasage.camel.security;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.security.SecurityPackage
 * @generated
 */
public interface SecurityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityFactory eINSTANCE = eu.paasage.camel.security.impl.SecurityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	SecurityModel createSecurityModel();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	SecurityDomain createSecurityDomain();

	/**
	 * Returns a new object of class '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control</em>'.
	 * @generated
	 */
	SecurityControl createSecurityControl();

	/**
	 * Returns a new object of class '<em>Raw Security Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raw Security Metric Instance</em>'.
	 * @generated
	 */
	RawSecurityMetricInstance createRawSecurityMetricInstance();

	/**
	 * Returns a new object of class '<em>Raw Security Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raw Security Metric</em>'.
	 * @generated
	 */
	RawSecurityMetric createRawSecurityMetric();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	SecurityProperty createSecurityProperty();

	/**
	 * Returns a new object of class '<em>Certifiable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Certifiable</em>'.
	 * @generated
	 */
	Certifiable createCertifiable();

	/**
	 * Returns a new object of class '<em>SLO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SLO</em>'.
	 * @generated
	 */
	SecuritySLO createSecuritySLO();

	/**
	 * Returns a new object of class '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability</em>'.
	 * @generated
	 */
	SecurityCapability createSecurityCapability();

	/**
	 * Returns a new object of class '<em>Composite Security Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Security Metric</em>'.
	 * @generated
	 */
	CompositeSecurityMetric createCompositeSecurityMetric();

	/**
	 * Returns a new object of class '<em>Composite Security Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Security Metric Instance</em>'.
	 * @generated
	 */
	CompositeSecurityMetricInstance createCompositeSecurityMetricInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SecurityPackage getSecurityPackage();

} //SecurityFactory
