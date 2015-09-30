/**
 */
package eu.paasage.camel.execution;

import eu.paasage.camel.Action;
import java.util.Date;
import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Realisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.ActionRealisation#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.ActionRealisation#getAction <em>Action</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.ActionRealisation#getStartedOn <em>Started On</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.ActionRealisation#getEndedOn <em>Ended On</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.ActionRealisation#getLowLevelActions <em>Low Level Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.execution.ExecutionPackage#getActionRealisation()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ActionRealisation extends CDOObject {
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
	 * @see eu.paasage.camel.execution.ExecutionPackage#getActionRealisation_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.ActionRealisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getActionRealisation_Action()
	 * @model required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.ActionRealisation#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Started On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started On</em>' attribute.
	 * @see #setStartedOn(Date)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getActionRealisation_StartedOn()
	 * @model
	 * @generated
	 */
	Date getStartedOn();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.ActionRealisation#getStartedOn <em>Started On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started On</em>' attribute.
	 * @see #getStartedOn()
	 * @generated
	 */
	void setStartedOn(Date value);

	/**
	 * Returns the value of the '<em><b>Ended On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended On</em>' attribute.
	 * @see #setEndedOn(Date)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getActionRealisation_EndedOn()
	 * @model
	 * @generated
	 */
	Date getEndedOn();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.ActionRealisation#getEndedOn <em>Ended On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ended On</em>' attribute.
	 * @see #getEndedOn()
	 * @generated
	 */
	void setEndedOn(Date value);

	/**
	 * Returns the value of the '<em><b>Low Level Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Level Actions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Level Actions</em>' attribute.
	 * @see #setLowLevelActions(String)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getActionRealisation_LowLevelActions()
	 * @model
	 * @generated
	 */
	String getLowLevelActions();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.ActionRealisation#getLowLevelActions <em>Low Level Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Level Actions</em>' attribute.
	 * @see #getLowLevelActions()
	 * @generated
	 */
	void setLowLevelActions(String value);

} // ActionRealisation
