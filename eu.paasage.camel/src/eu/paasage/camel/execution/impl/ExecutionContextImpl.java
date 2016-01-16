/**
 */
package eu.paasage.camel.execution.impl;

import eu.paasage.camel.Application;

import eu.paasage.camel.deployment.DeploymentModel;

import eu.paasage.camel.execution.ExecutionContext;
import eu.paasage.camel.execution.ExecutionPackage;

import eu.paasage.camel.requirement.RequirementGroup;

import eu.paasage.camel.unit.MonetaryUnit;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.impl.ExecutionContextImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ExecutionContextImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ExecutionContextImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ExecutionContextImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ExecutionContextImpl#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ExecutionContextImpl#getCostUnit <em>Cost Unit</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ExecutionContextImpl#getDeploymentModel <em>Deployment Model</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ExecutionContextImpl#getRequirementGroup <em>Requirement Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionContextImpl extends CDOObjectImpl implements ExecutionContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.EXECUTION_CONTEXT;
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
		return (String)eGet(ExecutionPackage.Literals.EXECUTION_CONTEXT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ExecutionPackage.Literals.EXECUTION_CONTEXT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		return (Application)eGet(ExecutionPackage.Literals.EXECUTION_CONTEXT__APPLICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		eSet(ExecutionPackage.Literals.EXECUTION_CONTEXT__APPLICATION, newApplication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTime() {
		return (Date)eGet(ExecutionPackage.Literals.EXECUTION_CONTEXT__START_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		eSet(ExecutionPackage.Literals.EXECUTION_CONTEXT__START_TIME, newStartTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndTime() {
		return (Date)eGet(ExecutionPackage.Literals.EXECUTION_CONTEXT__END_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(Date newEndTime) {
		eSet(ExecutionPackage.Literals.EXECUTION_CONTEXT__END_TIME, newEndTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalCost() {
		return (Double)eGet(ExecutionPackage.Literals.EXECUTION_CONTEXT__TOTAL_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCost(double newTotalCost) {
		eSet(ExecutionPackage.Literals.EXECUTION_CONTEXT__TOTAL_COST, newTotalCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonetaryUnit getCostUnit() {
		return (MonetaryUnit)eGet(ExecutionPackage.Literals.EXECUTION_CONTEXT__COST_UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostUnit(MonetaryUnit newCostUnit) {
		eSet(ExecutionPackage.Literals.EXECUTION_CONTEXT__COST_UNIT, newCostUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentModel getDeploymentModel() {
		return (DeploymentModel)eGet(ExecutionPackage.Literals.EXECUTION_CONTEXT__DEPLOYMENT_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentModel(DeploymentModel newDeploymentModel) {
		eSet(ExecutionPackage.Literals.EXECUTION_CONTEXT__DEPLOYMENT_MODEL, newDeploymentModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementGroup getRequirementGroup() {
		return (RequirementGroup)eGet(ExecutionPackage.Literals.EXECUTION_CONTEXT__REQUIREMENT_GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirementGroup(RequirementGroup newRequirementGroup) {
		eSet(ExecutionPackage.Literals.EXECUTION_CONTEXT__REQUIREMENT_GROUP, newRequirementGroup);
	}

} //ExecutionContextImpl
