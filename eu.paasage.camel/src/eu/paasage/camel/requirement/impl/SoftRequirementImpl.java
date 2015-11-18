/**
 */
package eu.paasage.camel.requirement.impl;

import eu.paasage.camel.requirement.RequirementPackage;
import eu.paasage.camel.requirement.SoftRequirement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Soft Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.impl.SoftRequirementImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SoftRequirementImpl extends RequirementImpl implements SoftRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.SOFT_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPriority() {
		return (Double)eGet(RequirementPackage.Literals.SOFT_REQUIREMENT__PRIORITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(double newPriority) {
		eSet(RequirementPackage.Literals.SOFT_REQUIREMENT__PRIORITY, newPriority);
	}

} //SoftRequirementImpl
