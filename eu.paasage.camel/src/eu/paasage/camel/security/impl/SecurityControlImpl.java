/**
 */
package eu.paasage.camel.security.impl;

import eu.paasage.camel.security.CompositeSecurityMetric;
import eu.paasage.camel.security.RawSecurityMetric;
import eu.paasage.camel.security.SecurityControl;
import eu.paasage.camel.security.SecurityDomain;
import eu.paasage.camel.security.SecurityPackage;
import eu.paasage.camel.security.SecurityProperty;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityControlImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityControlImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityControlImpl#getSubDomain <em>Sub Domain</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityControlImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityControlImpl#getSecurityProperties <em>Security Properties</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityControlImpl#getRawSecurityMetrics <em>Raw Security Metrics</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityControlImpl#getCompositeSecurityMetrics <em>Composite Security Metrics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityControlImpl extends CDOObjectImpl implements SecurityControl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.SECURITY_CONTROL;
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
		return (String)eGet(SecurityPackage.Literals.SECURITY_CONTROL__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(SecurityPackage.Literals.SECURITY_CONTROL__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityDomain getDomain() {
		return (SecurityDomain)eGet(SecurityPackage.Literals.SECURITY_CONTROL__DOMAIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(SecurityDomain newDomain) {
		eSet(SecurityPackage.Literals.SECURITY_CONTROL__DOMAIN, newDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityDomain getSubDomain() {
		return (SecurityDomain)eGet(SecurityPackage.Literals.SECURITY_CONTROL__SUB_DOMAIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubDomain(SecurityDomain newSubDomain) {
		eSet(SecurityPackage.Literals.SECURITY_CONTROL__SUB_DOMAIN, newSubDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecification() {
		return (String)eGet(SecurityPackage.Literals.SECURITY_CONTROL__SPECIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(String newSpecification) {
		eSet(SecurityPackage.Literals.SECURITY_CONTROL__SPECIFICATION, newSpecification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SecurityProperty> getSecurityProperties() {
		return (EList<SecurityProperty>)eGet(SecurityPackage.Literals.SECURITY_CONTROL__SECURITY_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RawSecurityMetric> getRawSecurityMetrics() {
		return (EList<RawSecurityMetric>)eGet(SecurityPackage.Literals.SECURITY_CONTROL__RAW_SECURITY_METRICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CompositeSecurityMetric> getCompositeSecurityMetrics() {
		return (EList<CompositeSecurityMetric>)eGet(SecurityPackage.Literals.SECURITY_CONTROL__COMPOSITE_SECURITY_METRICS, true);
	}

} //SecurityControlImpl
