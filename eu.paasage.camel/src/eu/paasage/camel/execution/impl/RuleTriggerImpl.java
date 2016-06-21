/**
 */
package eu.paasage.camel.execution.impl;

import eu.paasage.camel.execution.ActionRealisation;
import eu.paasage.camel.execution.ExecutionContext;
import eu.paasage.camel.execution.ExecutionPackage;
import eu.paasage.camel.execution.RuleTrigger;

import eu.paasage.camel.scalability.EventInstance;
import eu.paasage.camel.scalability.ScalabilityRule;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.impl.RuleTriggerImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.RuleTriggerImpl#getScalabilityRule <em>Scalability Rule</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.RuleTriggerImpl#getEventInstances <em>Event Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.RuleTriggerImpl#getActionRealisations <em>Action Realisations</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.RuleTriggerImpl#getTrigerringTime <em>Trigerring Time</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.RuleTriggerImpl#getExecutionContext <em>Execution Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleTriggerImpl extends CDOObjectImpl implements RuleTrigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.RULE_TRIGGER;
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
		return (String)eGet(ExecutionPackage.Literals.RULE_TRIGGER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ExecutionPackage.Literals.RULE_TRIGGER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalabilityRule getScalabilityRule() {
		return (ScalabilityRule)eGet(ExecutionPackage.Literals.RULE_TRIGGER__SCALABILITY_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalabilityRule(ScalabilityRule newScalabilityRule) {
		eSet(ExecutionPackage.Literals.RULE_TRIGGER__SCALABILITY_RULE, newScalabilityRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EventInstance> getEventInstances() {
		return (EList<EventInstance>)eGet(ExecutionPackage.Literals.RULE_TRIGGER__EVENT_INSTANCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ActionRealisation> getActionRealisations() {
		return (EList<ActionRealisation>)eGet(ExecutionPackage.Literals.RULE_TRIGGER__ACTION_REALISATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTrigerringTime() {
		return (Date)eGet(ExecutionPackage.Literals.RULE_TRIGGER__TRIGERRING_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigerringTime(Date newTrigerringTime) {
		eSet(ExecutionPackage.Literals.RULE_TRIGGER__TRIGERRING_TIME, newTrigerringTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionContext getExecutionContext() {
		return (ExecutionContext)eGet(ExecutionPackage.Literals.RULE_TRIGGER__EXECUTION_CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionContext(ExecutionContext newExecutionContext) {
		eSet(ExecutionPackage.Literals.RULE_TRIGGER__EXECUTION_CONTEXT, newExecutionContext);
	}

} //RuleTriggerImpl
