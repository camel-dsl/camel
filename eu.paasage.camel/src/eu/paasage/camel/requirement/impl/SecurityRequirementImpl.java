/**
 */
package eu.paasage.camel.requirement.impl;

import eu.paasage.camel.Application;

import eu.paasage.camel.deployment.InternalComponent;

import eu.paasage.camel.requirement.RequirementPackage;
import eu.paasage.camel.requirement.SecurityRequirement;

import eu.paasage.camel.security.SecurityControl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.impl.SecurityRequirementImpl#getSecurityControls <em>Security Controls</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.SecurityRequirementImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.SecurityRequirementImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityRequirementImpl extends HardRequirementImpl implements SecurityRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.SECURITY_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SecurityControl> getSecurityControls() {
		return (EList<SecurityControl>)eGet(RequirementPackage.Literals.SECURITY_REQUIREMENT__SECURITY_CONTROLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		return (Application)eGet(RequirementPackage.Literals.SECURITY_REQUIREMENT__APPLICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		eSet(RequirementPackage.Literals.SECURITY_REQUIREMENT__APPLICATION, newApplication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalComponent getComponent() {
		return (InternalComponent)eGet(RequirementPackage.Literals.SECURITY_REQUIREMENT__COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(InternalComponent newComponent) {
		eSet(RequirementPackage.Literals.SECURITY_REQUIREMENT__COMPONENT, newComponent);
	}

} //SecurityRequirementImpl
