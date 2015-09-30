/**
 */
package eu.paasage.camel.organisation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.Organisation#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.Organisation#getWww <em>Www</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.Organisation#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.Organisation#getEmail <em>Email</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.organisation.OrganisationPackage#getOrganisation()
 * @model
 * @generated
 */
public interface Organisation extends Entity {
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
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getOrganisation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.Organisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Www</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Www</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Www</em>' attribute.
	 * @see #setWww(String)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getOrganisation_Www()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='Clone' unique='false' upper='*'"
	 * @generated
	 */
	String getWww();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.Organisation#getWww <em>Www</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Www</em>' attribute.
	 * @see #getWww()
	 * @generated
	 */
	void setWww(String value);

	/**
	 * Returns the value of the '<em><b>Postal Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Address</em>' attribute.
	 * @see #setPostalAddress(String)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getOrganisation_PostalAddress()
	 * @model
	 * @generated
	 */
	String getPostalAddress();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.Organisation#getPostalAddress <em>Postal Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Address</em>' attribute.
	 * @see #getPostalAddress()
	 * @generated
	 */
	void setPostalAddress(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getOrganisation_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.Organisation#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // Organisation
