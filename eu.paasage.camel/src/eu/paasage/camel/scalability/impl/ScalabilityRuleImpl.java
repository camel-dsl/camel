/**
 */
package eu.paasage.camel.scalability.impl;

import eu.paasage.camel.Action;

import eu.paasage.camel.organisation.Entity;

import eu.paasage.camel.requirement.ScaleRequirement;

import eu.paasage.camel.scalability.Event;
import eu.paasage.camel.scalability.ScalabilityPackage;
import eu.paasage.camel.scalability.ScalabilityRule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.impl.ScalabilityRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.ScalabilityRuleImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.ScalabilityRuleImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.ScalabilityRuleImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.ScalabilityRuleImpl#getScaleRequirements <em>Scale Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScalabilityRuleImpl extends CDOObjectImpl implements ScalabilityRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalabilityRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalabilityPackage.Literals.SCALABILITY_RULE;
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
		return (String)eGet(ScalabilityPackage.Literals.SCALABILITY_RULE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ScalabilityPackage.Literals.SCALABILITY_RULE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEvent() {
		return (Event)eGet(ScalabilityPackage.Literals.SCALABILITY_RULE__EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(Event newEvent) {
		eSet(ScalabilityPackage.Literals.SCALABILITY_RULE__EVENT, newEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Action> getActions() {
		return (EList<Action>)eGet(ScalabilityPackage.Literals.SCALABILITY_RULE__ACTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Entity> getEntity() {
		return (EList<Entity>)eGet(ScalabilityPackage.Literals.SCALABILITY_RULE__ENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ScaleRequirement> getScaleRequirements() {
		return (EList<ScaleRequirement>)eGet(ScalabilityPackage.Literals.SCALABILITY_RULE__SCALE_REQUIREMENTS, true);
	}

} //ScalabilityRuleImpl
