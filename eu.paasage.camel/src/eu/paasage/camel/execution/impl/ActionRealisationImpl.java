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
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.impl.ActionRealisationImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ActionRealisationImpl#getAction <em>Action</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ActionRealisationImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ActionRealisationImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.ActionRealisationImpl#getLowLevelActions <em>Low Level Actions</em>}</li>
 * </ul>
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
	public Date getStartTime() {
		return (Date)eGet(ExecutionPackage.Literals.ACTION_REALISATION__START_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		eSet(ExecutionPackage.Literals.ACTION_REALISATION__START_TIME, newStartTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndTime() {
		return (Date)eGet(ExecutionPackage.Literals.ACTION_REALISATION__END_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(Date newEndTime) {
		eSet(ExecutionPackage.Literals.ACTION_REALISATION__END_TIME, newEndTime);
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
