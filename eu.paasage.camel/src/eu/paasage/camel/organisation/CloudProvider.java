/**
 */
package eu.paasage.camel.organisation;

import eu.paasage.camel.provider.ProviderModel;

import eu.paasage.camel.security.SecurityCapability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.CloudProvider#isPublic <em>Public</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.CloudProvider#isSaaS <em>Saa S</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.CloudProvider#isPaaS <em>Paa S</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.CloudProvider#isIaaS <em>Iaa S</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.CloudProvider#getProviderModel <em>Provider Model</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.CloudProvider#getSecurityCapability <em>Security Capability</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.organisation.OrganisationPackage#getCloudProvider()
 * @model
 * @generated
 */
public interface CloudProvider extends Organisation {
	/**
	 * Returns the value of the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public</em>' attribute.
	 * @see #setPublic(boolean)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getCloudProvider_Public()
	 * @model
	 * @generated
	 */
	boolean isPublic();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.CloudProvider#isPublic <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public</em>' attribute.
	 * @see #isPublic()
	 * @generated
	 */
	void setPublic(boolean value);

	/**
	 * Returns the value of the '<em><b>Saa S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Saa S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saa S</em>' attribute.
	 * @see #setSaaS(boolean)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getCloudProvider_SaaS()
	 * @model
	 * @generated
	 */
	boolean isSaaS();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.CloudProvider#isSaaS <em>Saa S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saa S</em>' attribute.
	 * @see #isSaaS()
	 * @generated
	 */
	void setSaaS(boolean value);

	/**
	 * Returns the value of the '<em><b>Paa S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paa S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paa S</em>' attribute.
	 * @see #setPaaS(boolean)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getCloudProvider_PaaS()
	 * @model
	 * @generated
	 */
	boolean isPaaS();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.CloudProvider#isPaaS <em>Paa S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paa S</em>' attribute.
	 * @see #isPaaS()
	 * @generated
	 */
	void setPaaS(boolean value);

	/**
	 * Returns the value of the '<em><b>Iaa S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iaa S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iaa S</em>' attribute.
	 * @see #setIaaS(boolean)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getCloudProvider_IaaS()
	 * @model
	 * @generated
	 */
	boolean isIaaS();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.CloudProvider#isIaaS <em>Iaa S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iaa S</em>' attribute.
	 * @see #isIaaS()
	 * @generated
	 */
	void setIaaS(boolean value);

	/**
	 * Returns the value of the '<em><b>Provider Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Model</em>' reference.
	 * @see #setProviderModel(ProviderModel)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getCloudProvider_ProviderModel()
	 * @model
	 * @generated
	 */
	ProviderModel getProviderModel();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.CloudProvider#getProviderModel <em>Provider Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Model</em>' reference.
	 * @see #getProviderModel()
	 * @generated
	 */
	void setProviderModel(ProviderModel value);

	/**
	 * Returns the value of the '<em><b>Security Capability</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.security.SecurityCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Capability</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Capability</em>' reference list.
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getCloudProvider_SecurityCapability()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SecurityCapability> getSecurityCapability();

} // CloudProvider
