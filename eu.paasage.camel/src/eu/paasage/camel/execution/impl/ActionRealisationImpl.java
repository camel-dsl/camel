/**
 */
package eu.paasage.camel.execution.impl;

import eu.paasage.camel.Action;

import eu.paasage.camel.execution.ActionRealisation;
import eu.paasage.camel.execution.ExecutionPackage;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Realisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.impl.ActionRealisationImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ActionRealisationImpl#getAction <em>Action</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ActionRealisationImpl#getStartedOn <em>Started On</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ActionRealisationImpl#getEndedOn <em>Ended On</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ActionRealisationImpl#getLowLevelActions <em>Low Level Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionRealisationImpl extends CDOObjectImpl implements ActionRealisation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionRealisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.ACTION_REALISATION;
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
		return (String)eGet(ExecutionPackage.Literals.ACTION_REALISATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ExecutionPackage.Literals.ACTION_REALISATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return (Action)eGet(ExecutionPackage.Literals.ACTION_REALISATION__ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		eSet(ExecutionPackage.Literals.ACTION_REALISATION__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartedOn() {
		return (Date)eGet(ExecutionPackage.Literals.ACTION_REALISATION__STARTED_ON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartedOn(Date newStartedOn) {
		eSet(ExecutionPackage.Literals.ACTION_REALISATION__STARTED_ON, newStartedOn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndedOn() {
		return (Date)eGet(ExecutionPackage.Literals.ACTION_REALISATION__ENDED_ON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndedOn(Date newEndedOn) {
		eSet(ExecutionPackage.Literals.ACTION_REALISATION__ENDED_ON, newEndedOn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowLevelActions() {
		return (String)eGet(ExecutionPackage.Literals.ACTION_REALISATION__LOW_LEVEL_ACTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowLevelActions(String newLowLevelActions) {
		eSet(ExecutionPackage.Literals.ACTION_REALISATION__LOW_LEVEL_ACTIONS, newLowLevelActions);
	}

} //ActionRealisationImpl