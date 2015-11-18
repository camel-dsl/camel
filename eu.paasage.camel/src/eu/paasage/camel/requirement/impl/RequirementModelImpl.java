/**
 */
package eu.paasage.camel.requirement.impl;

import eu.paasage.camel.impl.ModelImpl;

import eu.paasage.camel.requirement.Requirement;
import eu.paasage.camel.requirement.RequirementModel;
import eu.paasage.camel.requirement.RequirementPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.impl.RequirementModelImpl#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementModelImpl extends ModelImpl implements RequirementModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.REQUIREMENT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Requirement> getRequirements() {
		return (EList<Requirement>)eGet(RequirementPackage.Literals.REQUIREMENT_MODEL__REQUIREMENTS, true);
	}

} //RequirementModelImpl
