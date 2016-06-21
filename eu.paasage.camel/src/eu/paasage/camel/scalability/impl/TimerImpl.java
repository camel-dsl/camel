/**
 */
package eu.paasage.camel.scalability.impl;

import eu.paasage.camel.scalability.ScalabilityPackage;
import eu.paasage.camel.scalability.Timer;
import eu.paasage.camel.scalability.TimerType;

import eu.paasage.camel.unit.TimeIntervalUnit;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.impl.TimerImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.TimerImpl#getType <em>Type</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.TimerImpl#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.TimerImpl#getMaxOccurrenceNum <em>Max Occurrence Num</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.TimerImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimerImpl extends CDOObjectImpl implements Timer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalabilityPackage.Literals.TIMER;
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
		return (String)eGet(ScalabilityPackage.Literals.TIMER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ScalabilityPackage.Literals.TIMER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerType getType() {
		return (TimerType)eGet(ScalabilityPackage.Literals.TIMER__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TimerType newType) {
		eSet(ScalabilityPackage.Literals.TIMER__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeValue() {
		return (Integer)eGet(ScalabilityPackage.Literals.TIMER__TIME_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeValue(int newTimeValue) {
		eSet(ScalabilityPackage.Literals.TIMER__TIME_VALUE, newTimeValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxOccurrenceNum() {
		return (Integer)eGet(ScalabilityPackage.Literals.TIMER__MAX_OCCURRENCE_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOccurrenceNum(int newMaxOccurrenceNum) {
		eSet(ScalabilityPackage.Literals.TIMER__MAX_OCCURRENCE_NUM, newMaxOccurrenceNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeIntervalUnit getUnit() {
		return (TimeIntervalUnit)eGet(ScalabilityPackage.Literals.TIMER__UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(TimeIntervalUnit newUnit) {
		eSet(ScalabilityPackage.Literals.TIMER__UNIT, newUnit);
	}

} //TimerImpl
