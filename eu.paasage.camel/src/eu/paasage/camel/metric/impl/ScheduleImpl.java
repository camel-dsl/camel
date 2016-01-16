/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.metric.MetricPackage;
import eu.paasage.camel.metric.Schedule;
import eu.paasage.camel.metric.ScheduleType;

import eu.paasage.camel.unit.TimeIntervalUnit;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.ScheduleImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.ScheduleImpl#getStart <em>Start</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.ScheduleImpl#getEnd <em>End</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.ScheduleImpl#getType <em>Type</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.ScheduleImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.ScheduleImpl#getRepetitions <em>Repetitions</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.ScheduleImpl#getInterval <em>Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScheduleImpl extends CDOObjectImpl implements Schedule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.SCHEDULE;
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
		return (String)eGet(MetricPackage.Literals.SCHEDULE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(MetricPackage.Literals.SCHEDULE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return (Date)eGet(MetricPackage.Literals.SCHEDULE__START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		eSet(MetricPackage.Literals.SCHEDULE__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return (Date)eGet(MetricPackage.Literals.SCHEDULE__END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		eSet(MetricPackage.Literals.SCHEDULE__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleType getType() {
		return (ScheduleType)eGet(MetricPackage.Literals.SCHEDULE__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ScheduleType newType) {
		eSet(MetricPackage.Literals.SCHEDULE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeIntervalUnit getUnit() {
		return (TimeIntervalUnit)eGet(MetricPackage.Literals.SCHEDULE__UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(TimeIntervalUnit newUnit) {
		eSet(MetricPackage.Literals.SCHEDULE__UNIT, newUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRepetitions() {
		return (Integer)eGet(MetricPackage.Literals.SCHEDULE__REPETITIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepetitions(int newRepetitions) {
		eSet(MetricPackage.Literals.SCHEDULE__REPETITIONS, newRepetitions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getInterval() {
		return (Long)eGet(MetricPackage.Literals.SCHEDULE__INTERVAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(long newInterval) {
		eSet(MetricPackage.Literals.SCHEDULE__INTERVAL, newInterval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkStartEndDates(final Schedule this_) {
		System.out.println("CHECKING Schedule_Start_Before_End: " + this + " " + this.getStart() + " " + this.getEnd()); java.util.Date date1 = this.getStart(); java.util.Date date2 = this.getEnd(); if ((this.getType() != ScheduleType.SINGLE_EVENT) && (date1 == null || date2 == null)) return Boolean.FALSE; if (date1 == null || date2 == null || (date1 != null && date2 != null && date1.before(date2))) return Boolean.TRUE; return Boolean.FALSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkIntervalRepetitions(final Schedule s) {
		System.out.println("Schedule_correct_rep: " + s + " " + s.getStart() + " " + s.getEnd() + " " + s.getInterval() + " " + s.getRepetitions());
				Date d1 = s.getStart();
				Date d2 = s.getEnd();
				int reps = s.getRepetitions();
				long interval = s.getInterval();
				eu.paasage.camel.unit.TimeIntervalUnit unit = s.getUnit();
				double diff = d2.getTime()-d1.getTime();
				if (d1 != null && d2 != null && interval != 0){
					if (unit.equals(eu.paasage.camel.unit.UnitType.SECONDS)){
						diff = diff / 1000.0;
					}
					else if (unit.equals(eu.paasage.camel.unit.UnitType.MINUTES)){
						diff = diff / (60 * 1000.0);
					}
					else if (unit.equals(eu.paasage.camel.unit.UnitType.HOURS)){
						diff = diff / (60 * 60 * 1000.0);
					}
					else if (unit.equals(eu.paasage.camel.unit.UnitType.DAYS)){
						diff = diff / (24 * 60 * 60 * 1000.0);
					}
					else if (unit.equals(eu.paasage.camel.unit.UnitType.WEEKS)){
						diff = diff / (7 * 24 * 60 * 60 * 1000.0);
					}
					else if (unit.equals(eu.paasage.camel.unit.UnitType.MONTHS)){
						diff = diff / (30 * 24 * 60 * 60 * 1000.0);
					}
					if (diff >= interval){
						if (reps == 0 || (reps != 0 && reps * interval <= diff)) return Boolean.TRUE;
					}
				}
				return Boolean.FALSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MetricPackage.SCHEDULE___CHECK_START_END_DATES__SCHEDULE:
				return checkStartEndDates((Schedule)arguments.get(0));
			case MetricPackage.SCHEDULE___CHECK_INTERVAL_REPETITIONS__SCHEDULE:
				return checkIntervalRepetitions((Schedule)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ScheduleImpl
