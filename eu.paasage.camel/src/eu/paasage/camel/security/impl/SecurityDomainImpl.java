/**
 */
package eu.paasage.camel.security.impl;

import eu.paasage.camel.security.SecurityDomain;
import eu.paasage.camel.security.SecurityPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityDomainImpl#getId <em>Id</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityDomainImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityDomainImpl#getSubDomain <em>Sub Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityDomainImpl extends CDOObjectImpl implements SecurityDomain {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.SECURITY_DOMAIN;
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
	public String getId() {
		return (String)eGet(SecurityPackage.Literals.SECURITY_DOMAIN__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(SecurityPackage.Literals.SECURITY_DOMAIN__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(SecurityPackage.Literals.SECURITY_DOMAIN__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(SecurityPackage.Literals.SECURITY_DOMAIN__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SecurityDomain> getSubDomain() {
		return (EList<SecurityDomain>)eGet(SecurityPackage.Literals.SECURITY_DOMAIN__SUB_DOMAIN, true);
	}

} //SecurityDomainImpl
