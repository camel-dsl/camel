/**
 */
package eu.paasage.camel.security;

import eu.paasage.camel.metric.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.security.SecurityProperty#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.security.SecurityPackage#getSecurityProperty()
 * @model
 * @generated
 */
public interface SecurityProperty extends Property {
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
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityProperty_Domain()
	 * @model required="true"
	 * @generated
	 */
	SecurityDomain getDomain();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.security.SecurityProperty#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(SecurityDomain value);

} // SecurityProperty
