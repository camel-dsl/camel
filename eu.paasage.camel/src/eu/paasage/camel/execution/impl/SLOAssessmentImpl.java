/**
 */
package eu.paasage.camel.execution.impl;

import eu.paasage.camel.execution.ExecutionContext;
import eu.paasage.camel.execution.ExecutionPackage;
import eu.paasage.camel.execution.Measurement;
import eu.paasage.camel.execution.SLOAssessment;

import eu.paasage.camel.requirement.ServiceLevelObjective;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SLO Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.impl.SLOAssessmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.SLOAssessmentImpl#getSlo <em>Slo</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.SLOAssessmentImpl#isAssessment <em>Assessment</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.SLOAssessmentImpl#getExecutionContext <em>Execution Context</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.SLOAssessmentImpl#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.SLOAssessmentImpl#getAssessmentTime <em>Assessment Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SLOAssessmentImpl extends CDOObjectImpl implements SLOAssessment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SLOAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.SLO_ASSESSMENT;
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
		return (String)eGet(ExecutionPackage.Literals.SLO_ASSESSMENT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ExecutionPackage.Literals.SLO_ASSESSMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelObjective getSlo() {
		return (ServiceLevelObjective)eGet(ExecutionPackage.Literals.SLO_ASSESSMENT__SLO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlo(ServiceLevelObjective newSlo) {
		eSet(ExecutionPackage.Literals.SLO_ASSESSMENT__SLO, newSlo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAssessment() {
		return (Boolean)eGet(ExecutionPackage.Literals.SLO_ASSESSMENT__ASSESSMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssessment(boolean newAssessment) {
		eSet(ExecutionPackage.Literals.SLO_ASSESSMENT__ASSESSMENT, newAssessment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionContext getExecutionContext() {
		return (ExecutionContext)eGet(ExecutionPackage.Literals.SLO_ASSESSMENT__EXECUTION_CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionContext(ExecutionContext newExecutionContext) {
		eSet(ExecutionPackage.Literals.SLO_ASSESSMENT__EXECUTION_CONTEXT, newExecutionContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement getMeasurement() {
		return (Measurement)eGet(ExecutionPackage.Literals.SLO_ASSESSMENT__MEASUREMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurement(Measurement newMeasurement) {
		eSet(ExecutionPackage.Literals.SLO_ASSESSMENT__MEASUREMENT, newMeasurement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAssessmentTime() {
		return (Date)eGet(ExecutionPackage.Literals.SLO_ASSESSMENT__ASSESSMENT_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssessmentTime(Date newAssessmentTime) {
		eSet(ExecutionPackage.Literals.SLO_ASSESSMENT__ASSESSMENT_TIME, newAssessmentTime);
	}

} //SLOAssessmentImpl
