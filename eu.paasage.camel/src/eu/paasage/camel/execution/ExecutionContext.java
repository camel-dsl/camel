/**
 */
package eu.paasage.camel.execution;

import eu.paasage.camel.Application;

import eu.paasage.camel.deployment.DeploymentModel;

import eu.paasage.camel.requirement.RequirementGroup;

import eu.paasage.camel.unit.MonetaryUnit;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.ExecutionContext#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.ExecutionContext#getApplication <em>Application</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.ExecutionContext#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.ExecutionContext#getEndTime <em>End Time</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.ExecutionContext#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.ExecutionContext#getCostUnit <em>Cost Unit</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.ExecutionContext#getDeploymentModel <em>Deployment Model</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.ExecutionContext#getRequirementGroup <em>Requirement Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.execution.ExecutionPackage#getExecutionContext()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='execution_context_total_cost execution_context_unit_cost'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot execution_context_total_cost='Tuple {\n\tmessage : String = \'The total cost of execution context: \' + self.name +\n\t\t\t\t\' should be non-negative\',\n\tstatus : Boolean = self.totalCost >= 0\n}.status' execution_context_unit_cost='Tuple {\n\tmessage : String = \'The unit of cost should be provided as the totalCost of execution context: \'\n\t\t\t\t+ self.name + \' is positive\',\n\tstatus : Boolean = self.totalCost > 0 implies costUnit <> null\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface ExecutionContext extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getExecutionContext_Name()
	 * @model id="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='Measurement' unique='false' upper='*'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.ExecutionContext#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference.
	 * @see #setApplication(Application)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getExecutionContext_Application()
	 * @model required="true"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.ExecutionContext#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getExecutionContext_StartTime()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='Measurement' unique='false' upper='*'"
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.ExecutionContext#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Date)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getExecutionContext_EndTime()
	 * @model
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.ExecutionContext#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cost</em>' attribute.
	 * @see #setTotalCost(double)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getExecutionContext_TotalCost()
	 * @model
	 * @generated
	 */
	double getTotalCost();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.ExecutionContext#getTotalCost <em>Total Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cost</em>' attribute.
	 * @see #getTotalCost()
	 * @generated
	 */
	void setTotalCost(double value);

	/**
	 * Returns the value of the '<em><b>Cost Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Unit</em>' reference.
	 * @see #setCostUnit(MonetaryUnit)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getExecutionContext_CostUnit()
	 * @model
	 * @generated
	 */
	MonetaryUnit getCostUnit();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.ExecutionContext#getCostUnit <em>Cost Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Unit</em>' reference.
	 * @see #getCostUnit()
	 * @generated
	 */
	void setCostUnit(MonetaryUnit value);

	/**
	 * Returns the value of the '<em><b>Deployment Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Model</em>' reference.
	 * @see #setDeploymentModel(DeploymentModel)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getExecutionContext_DeploymentModel()
	 * @model required="true"
	 * @generated
	 */
	DeploymentModel getDeploymentModel();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.ExecutionContext#getDeploymentModel <em>Deployment Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Model</em>' reference.
	 * @see #getDeploymentModel()
	 * @generated
	 */
	void setDeploymentModel(DeploymentModel value);

	/**
	 * Returns the value of the '<em><b>Requirement Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Group</em>' reference.
	 * @see #setRequirementGroup(RequirementGroup)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getExecutionContext_RequirementGroup()
	 * @model required="true"
	 * @generated
	 */
	RequirementGroup getRequirementGroup();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.ExecutionContext#getRequirementGroup <em>Requirement Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Group</em>' reference.
	 * @see #getRequirementGroup()
	 * @generated
	 */
	void setRequirementGroup(RequirementGroup value);

} // ExecutionContext
