/**
 */
package eu.paasage.camel.organisation.impl;

import eu.paasage.camel.organisation.OrganisationPackage;
import eu.paasage.camel.organisation.PaaSageCredentials;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paa Sage Credentials</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.impl.PaaSageCredentialsImpl#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaaSageCredentialsImpl extends CredentialsImpl implements PaaSageCredentials {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaaSageCredentialsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganisationPackage.Literals.PAA_SAGE_CREDENTIALS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return (String)eGet(OrganisationPackage.Literals.PAA_SAGE_CREDENTIALS__PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		eSet(OrganisationPackage.Literals.PAA_SAGE_CREDENTIALS__PASSWORD, newPassword);
	}

} //PaaSageCredentialsImpl
