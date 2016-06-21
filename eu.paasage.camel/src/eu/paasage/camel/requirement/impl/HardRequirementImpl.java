/**
 */
package eu.paasage.camel.requirement.impl;

import eu.paasage.camel.requirement.HardRequirement;
import eu.paasage.camel.requirement.RequirementPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hard Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class HardRequirementImpl extends RequirementImpl implements HardRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.HARD_REQUIREMENT;
	}

} //HardRequirementImpl
