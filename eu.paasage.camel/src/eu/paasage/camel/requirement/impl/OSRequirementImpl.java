/**
 */
package eu.paasage.camel.requirement.impl;

import eu.paasage.camel.requirement.OSRequirement;
import eu.paasage.camel.requirement.RequirementPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OS Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.impl.OSRequirementImpl#getOs <em>Os</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.OSRequirementImpl#isIs64os <em>Is64os</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OSRequirementImpl extends OSOrImageRequirementImpl implements OSRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.OS_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOs() {
		return (String)eGet(RequirementPackage.Literals.OS_REQUIREMENT__OS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs(String newOs) {
		eSet(RequirementPackage.Literals.OS_REQUIREMENT__OS, newOs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIs64os() {
		return (Boolean)eGet(RequirementPackage.Literals.OS_REQUIREMENT__IS64OS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs64os(boolean newIs64os) {
		eSet(RequirementPackage.Literals.OS_REQUIREMENT__IS64OS, newIs64os);
	}

} //OSRequirementImpl
