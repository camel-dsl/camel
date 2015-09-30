/**
 */
package eu.paasage.camel.metric;

import eu.paasage.camel.unit.TimeIntervalUnit;
import java.util.Date;
import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.Schedule#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Schedule#getStart <em>Start</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Schedule#getEnd <em>End</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Schedule#getType <em>Type</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Schedule#getUnit <em>Unit</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Schedule#getRepetitions <em>Repetitions</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Schedule#getInterval <em>Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getSchedule()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='schedule_correct_values'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot schedule_correct_values='Tuple {\n\tmessage : String = \'Schedule: \' + self.name +\n\t\t\t\t\t\' has wrong value combination for its attributes and properties. In particular, either the type of the schedule is SINGLE_EVENT and a value of any of the rest of the attributes or the unit property has been given or the schedule type is different but a non-positive value of the interval attribute or no value for the unit property has been provided\',\n\tstatus : Boolean = (self.type\n\t\t\t\t\t<> ScheduleType::SINGLE_EVENT implies (self.interval > 0 and self.unit <> null)) and ((self.type =\n\t\t\t\t\tScheduleType::SINGLE_EVENT implies (interval = 0 and start = null and end = null and unit = null)))\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface Schedule extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see eu.paasage.camel.metric.MetricPackage#getSchedule_Start()
	 * @model
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Schedule#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see eu.paasage.camel.metric.MetricPackage#getSchedule_End()
	 * @model
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Schedule#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.metric.ScheduleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eu.paasage.camel.metric.ScheduleType
	 * @see #setType(ScheduleType)
	 * @see eu.paasage.camel.metric.MetricPackage#getSchedule_Type()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='HorizontalScalingPolicy' unique='false' upper='*'"
	 * @generated
	 */
	ScheduleType getType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Schedule#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.paasage.camel.metric.ScheduleType
	 * @see #getType()
	 * @generated
	 */
	void setType(ScheduleType value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(TimeIntervalUnit)
	 * @see eu.paasage.camel.metric.MetricPackage#getSchedule_Unit()
	 * @model required="true"
	 * @generated
	 */
	TimeIntervalUnit getUnit();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Schedule#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeIntervalUnit value);

	/**
	 * Returns the value of the '<em><b>Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetitions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetitions</em>' attribute.
	 * @see #setRepetitions(int)
	 * @see eu.paasage.camel.metric.MetricPackage#getSchedule_Repetitions()
	 * @model
	 * @generated
	 */
	int getRepetitions();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Schedule#getRepetitions <em>Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetitions</em>' attribute.
	 * @see #getRepetitions()
	 * @generated
	 */
	void setRepetitions(int value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(long)
	 * @see eu.paasage.camel.metric.MetricPackage#getSchedule_Interval()
	 * @model required="true"
	 * @generated
	 */
	long getInterval();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Schedule#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(long value);

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
	 * @see eu.paasage.camel.metric.MetricPackage#getSchedule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Schedule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model thisRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='System.out.println(\"CHECKING Schedule_Start_Before_End: \" + this + \" \" + this.getStart() + \" \" + this.getEnd()); java.util.Date date1 = this.getStart(); java.util.Date date2 = this.getEnd(); if ((this.getType() != ScheduleType.SINGLE_EVENT) && (date1 == null || date2 == null)) return Boolean.FALSE; if (date1 == null || date2 == null || (date1 != null && date2 != null && date1.before(date2))) return Boolean.TRUE; return Boolean.FALSE;'"
	 * @generated
	 */
	boolean checkStartEndDates(Schedule this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='System.out.println(\"Schedule_correct_rep: \" + s + \" \" + s.getStart() + \" \" + s.getEnd() + \" \" + s.getInterval() + \" \" + s.getRepetitions());\r\n\t\tDate d1 = s.getStart();\r\n\t\tDate d2 = s.getEnd();\r\n\t\tint reps = s.getRepetitions();\r\n\t\tlong interval = s.getInterval();\r\n\t\teu.paasage.camel.unit.TimeIntervalUnit unit = s.getUnit();\r\n\t\tdouble diff = d2.getTime()-d1.getTime();\r\n\t\tif (d1 != null && d2 != null && interval != 0){\r\n\t\t\tif (unit.equals(eu.paasage.camel.unit.UnitType.SECONDS)){\r\n\t\t\t\tdiff = diff / 1000.0;\r\n\t\t\t}\r\n\t\t\telse if (unit.equals(eu.paasage.camel.unit.UnitType.MINUTES)){\r\n\t\t\t\tdiff = diff / (60 * 1000.0);\r\n\t\t\t}\r\n\t\t\telse if (unit.equals(eu.paasage.camel.unit.UnitType.HOURS)){\r\n\t\t\t\tdiff = diff / (60 * 60 * 1000.0);\r\n\t\t\t}\r\n\t\t\telse if (unit.equals(eu.paasage.camel.unit.UnitType.DAYS)){\r\n\t\t\t\tdiff = diff / (24 * 60 * 60 * 1000.0);\r\n\t\t\t}\r\n\t\t\telse if (unit.equals(eu.paasage.camel.unit.UnitType.WEEKS)){\r\n\t\t\t\tdiff = diff / (7 * 24 * 60 * 60 * 1000.0);\r\n\t\t\t}\r\n\t\t\telse if (unit.equals(eu.paasage.camel.unit.UnitType.MONTHS)){\r\n\t\t\t\tdiff = diff / (30 * 24 * 60 * 60 * 1000.0);\r\n\t\t\t}\r\n\t\t\tif (diff >= interval){\r\n\t\t\t\tif (reps == 0 || (reps != 0 && reps * interval <= diff)) return Boolean.TRUE;\r\n\t\t\t}\r\n\t\t}\r\n\t\treturn Boolean.FALSE;'"
	 * @generated
	 */
	boolean checkIntervalRepetitions(Schedule s);

} // Schedule
