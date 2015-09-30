/**
 */
package eu.paasage.camel.security;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.security.SecurityControl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.security.SecurityControl#getDomain <em>Domain</em>}</li>
 *   <li>{@link eu.paasage.camel.security.SecurityControl#getSubDomain <em>Sub Domain</em>}</li>
 *   <li>{@link eu.paasage.camel.security.SecurityControl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link eu.paasage.camel.security.SecurityControl#getSecurityProperties <em>Security Properties</em>}</li>
 *   <li>{@link eu.paasage.camel.security.SecurityControl#getRawSecurityMetrics <em>Raw Security Metrics</em>}</li>
 *   <li>{@link eu.paasage.camel.security.SecurityControl#getCompositeSecurityMetrics <em>Composite Security Metrics</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.security.SecurityPackage#getSecurityControl()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface SecurityControl extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityControl_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.security.SecurityControl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(SecurityDomain)
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityControl_Domain()
	 * @model required="true"
	 * @generated
	 */
	SecurityDomain getDomain();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.security.SecurityControl#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(SecurityDomain value);

	/**
	 * Returns the value of the '<em><b>Sub Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Domain</em>' reference.
	 * @see #setSubDomain(SecurityDomain)
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityControl_SubDomain()
	 * @model required="true"
	 * @generated
	 */
	SecurityDomain getSubDomain();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.security.SecurityControl#getSubDomain <em>Sub Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Domain</em>' reference.
	 * @see #getSubDomain()
	 * @generated
	 */
	void setSubDomain(SecurityDomain value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' attribute.
	 * @see #setSpecification(String)
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityControl_Specification()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='AgreementType'"
	 *        annotation="teneo.jpa value='@Column(length=4000)'"
	 * @generated
	 */
	String getSpecification();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.security.SecurityControl#getSpecification <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' attribute.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(String value);

	/**
	 * Returns the value of the '<em><b>Security Properties</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.security.SecurityProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Properties</em>' reference list.
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityControl_SecurityProperties()
	 * @model
	 * @generated
	 */
	EList<SecurityProperty> getSecurityProperties();

	/**
	 * Returns the value of the '<em><b>Raw Security Metrics</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.security.RawSecurityMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Security Metrics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Security Metrics</em>' reference list.
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityControl_RawSecurityMetrics()
	 * @model
	 * @generated
	 */
	EList<RawSecurityMetric> getRawSecurityMetrics();

	/**
	 * Returns the value of the '<em><b>Composite Security Metrics</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.security.CompositeSecurityMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Security Metrics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Security Metrics</em>' reference list.
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityControl_CompositeSecurityMetrics()
	 * @model
	 * @generated
	 */
	EList<CompositeSecurityMetric> getCompositeSecurityMetrics();

} // SecurityControl
