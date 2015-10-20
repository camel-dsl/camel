/**
 */
package eu.paasage.camel.execution.impl;

import eu.paasage.camel.execution.ActionRealisation;
import eu.paasage.camel.execution.ExecutionContext;
import eu.paasage.camel.execution.ExecutionModel;
import eu.paasage.camel.execution.ExecutionPackage;
import eu.paasage.camel.execution.Measurement;
import eu.paasage.camel.execution.RuleTrigger;
import eu.paasage.camel.execution.SLOAssessment;

import eu.paasage.camel.impl.ModelImpl;

import eu.paasage.camel.scalability.EventInstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.impl.ExecutionModelImpl#getActionRealisations <em>Action Realisations</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ExecutionModelImpl#getEventInstances <em>Event Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ExecutionModelImpl#getExecutionContexts <em>Execution Contexts</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ExecutionModelImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ExecutionModelImpl#getSloAssessessments <em>Slo Assessessments</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ExecutionModelImpl#getRuleTriggers <em>Rule Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionModelImpl extends ModelImpl implements ExecutionModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.EXECUTION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ActionRealisation> getActionRealisations() {
		return (EList<ActionRealisation>)eGet(ExecutionPackage.Literals.EXECUTION_MODEL__ACTION_REALISATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EventInstance> getEventInstances() {
		return (EList<EventInstance>)eGet(ExecutionPackage.Literals.EXECUTION_MODEL__EVENT_INSTANCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExecutionContext> getExecutionContexts() {
		return (EList<ExecutionContext>)eGet(ExecutionPackage.Literals.EXECUTION_MODEL__EXECUTION_CONTEXTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Measurement> getMeasurements() {
		return (EList<Measurement>)eGet(ExecutionPackage.Literals.EXECUTION_MODEL__MEASUREMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SLOAssessment> getSloAssessessments() {
		return (EList<SLOAssessment>)eGet(ExecutionPackage.Literals.EXECUTION_MODEL__SLO_ASSESSESSMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RuleTrigger> getRuleTriggers() {
		return (EList<RuleTrigger>)eGet(ExecutionPackage.Literals.EXECUTION_MODEL__RULE_TRIGGERS, true);
	}

} //ExecutionModelImpl
