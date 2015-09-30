/**
 */
package eu.paasage.camel.organisation.impl;

import eu.paasage.camel.organisation.Organisation;
import eu.paasage.camel.organisation.OrganisationPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.impl.OrganisationImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.OrganisationImpl#getWww <em>Www</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.OrganisationImpl#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.OrganisationImpl#getEmail <em>Email</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganisationImpl extends EntityImpl implements Organisation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganisationPackage.Literals.ORGANISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(OrganisationPackage.Literals.ORGANISATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(OrganisationPackage.Literals.ORGANISATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWww() {
		return (String)eGet(OrganisationPackage.Literals.ORGANISATION__WWW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWww(String newWww) {
		eSet(OrganisationPackage.Literals.ORGANISATION__WWW, newWww);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostalAddress() {
		return (String)eGet(OrganisationPackage.Literals.ORGANISATION__POSTAL_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalAddress(String newPostalAddress) {
		eSet(OrganisationPackage.Literals.ORGANISATION__POSTAL_ADDRESS, newPostalAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return (String)eGet(OrganisationPackage.Literals.ORGANISATION__EMAIL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		eSet(OrganisationPackage.Literals.ORGANISATION__EMAIL, newEmail);
	}

} //OrganisationImpl
