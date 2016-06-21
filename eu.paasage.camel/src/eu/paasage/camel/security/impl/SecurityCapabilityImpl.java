/**
 */
package eu.paasage.camel.security.impl;

import eu.paasage.camel.organisation.DataCenter;

import eu.paasage.camel.security.SecurityCapability;
import eu.paasage.camel.security.SecurityControl;
import eu.paasage.camel.security.SecurityPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityCapabilityImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityCapabilityImpl#getSecurityControls <em>Security Controls</em>}</li>
 *   <li>{@link eu.paasage.camel.security.impl.SecurityCapabilityImpl#getDataCenter <em>Data Center</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityCapabilityImpl extends CDOObjectImpl implements SecurityCapability {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.SECURITY_CAPABILITY;
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
		return (String)eGet(SecurityPackage.Literals.SECURITY_CAPABILITY__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(SecurityPackage.Literals.SECURITY_CAPABILITY__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SecurityControl> getSecurityControls() {
		return (EList<SecurityControl>)eGet(SecurityPackage.Literals.SECURITY_CAPABILITY__SECURITY_CONTROLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCenter getDataCenter() {
		return (DataCenter)eGet(SecurityPackage.Literals.SECURITY_CAPABILITY__DATA_CENTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataCenter(DataCenter newDataCenter) {
		eSet(SecurityPackage.Literals.SECURITY_CAPABILITY__DATA_CENTER, newDataCenter);
	}

} //SecurityCapabilityImpl
