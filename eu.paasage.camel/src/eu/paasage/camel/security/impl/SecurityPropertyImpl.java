/**
 */
package eu.paasage.camel.security.impl;

import eu.paasage.camel.metric.impl.PropertyImpl;

import eu.paasage.camel.security.SecurityDomain;
import eu.paasage.camel.security.SecurityPackage;
import eu.paasage.camel.security.SecurityProperty;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityPropertyImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityPropertyImpl extends PropertyImpl implements SecurityProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.SECURITY_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityDomain getDomain() {
		return (SecurityDomain)eGet(SecurityPackage.Literals.SECURITY_PROPERTY__DOMAIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(SecurityDomain newDomain) {
		eSet(SecurityPackage.Literals.SECURITY_PROPERTY__DOMAIN, newDomain);
	}

} //SecurityPropertyImpl
