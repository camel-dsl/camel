/**
 */
package eu.paasage.camel.requirement.impl;

import eu.paasage.camel.deployment.InternalComponent;

import eu.paasage.camel.requirement.HorizontalScaleRequirement;
import eu.paasage.camel.requirement.RequirementPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Horizontal Scale Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.impl.HorizontalScaleRequirementImpl#getMinInstances <em>Min Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.HorizontalScaleRequirementImpl#getMaxInstances <em>Max Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.HorizontalScaleRequirementImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HorizontalScaleRequirementImpl extends ScaleRequirementImpl implements HorizontalScaleRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HorizontalScaleRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.HORIZONTAL_SCALE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinInstances() {
		return (Integer)eGet(RequirementPackage.Literals.HORIZONTAL_SCALE_REQUIREMENT__MIN_INSTANCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInstances(int newMinInstances) {
		eSet(RequirementPackage.Literals.HORIZONTAL_SCALE_REQUIREMENT__MIN_INSTANCES, newMinInstances);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxInstances() {
		return (Integer)eGet(RequirementPackage.Literals.HORIZONTAL_SCALE_REQUIREMENT__MAX_INSTANCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInstances(int newMaxInstances) {
		eSet(RequirementPackage.Literals.HORIZONTAL_SCALE_REQUIREMENT__MAX_INSTANCES, newMaxInstances);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalComponent getComponent() {
		return (InternalComponent)eGet(RequirementPackage.Literals.HORIZONTAL_SCALE_REQUIREMENT__COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(InternalComponent newComponent) {
		eSet(RequirementPackage.Literals.HORIZONTAL_SCALE_REQUIREMENT__COMPONENT, newComponent);
	}

} //HorizontalScaleRequirementImpl
