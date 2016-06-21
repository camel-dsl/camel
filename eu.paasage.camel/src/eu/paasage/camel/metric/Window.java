/**
 */
package eu.paasage.camel.metric;

import eu.paasage.camel.unit.TimeIntervalUnit;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.Window#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Window#getUnit <em>Unit</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Window#getWindowType <em>Window Type</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Window#getSizeType <em>Size Type</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Window#getMeasurementSize <em>Measurement Size</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Window#getTimeSize <em>Time Size</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getWindow()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='window_positive_params window_right_params_exist'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot window_positive_params='Tuple {\n\tmessage : String = \'Window:\' + self.name +\n\t\t\t\t\t\' has a negative value for the measurementSize and timeSize attributes\',\n\tstatus : Boolean = (measurementSize >= 0) and (timeSize >=\n\t\t\t\t\t0)\n}.status' window_right_params_exist='Tuple {\n\tmessage : String = \'Window: \' + self.name +\n\t\t\t\t\t\' has wrong value combinations for its attributes and properties. If sizeType is MEASUREMENTS_ONLY, then the measurementSize should be positive and all other values zero or null. If sizeType is TIME_ONLY, then both the unit should not be null and the timeSize should be positive, while the measurementSize should be zero. For the other values of sizeType, the values of all remaining attributes and units should be provided\',\n\tstatus : Boolean = (self.sizeType\n\t\t\t\t\t= WindowSizeType::MEASUREMENTS_ONLY implies (unit = null and timeSize = 0 and measurementSize > 0)) and\n\t\t\t\t\t(self.sizeType = WindowSizeType::TIME_ONLY implies (unit <> null and timeSize > 0 and measurementSize = 0)) and\n\t\t\t\t\t((self.sizeType = WindowSizeType::FIRST_MATCH or self.sizeType = WindowSizeType::BOTH_MATCH) implies (timeSize > 0\n\t\t\t\t\tand unit <> null and measurementSize > 0))\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface Window extends CDOObject {
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
	 * @see eu.paasage.camel.metric.MetricPackage#getWindow_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Window#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see eu.paasage.camel.metric.MetricPackage#getWindow_Unit()
	 * @model
	 * @generated
	 */
	TimeIntervalUnit getUnit();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Window#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeIntervalUnit value);

	/**
	 * Returns the value of the '<em><b>Window Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.metric.WindowType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window Type</em>' attribute.
	 * @see eu.paasage.camel.metric.WindowType
	 * @see #setWindowType(WindowType)
	 * @see eu.paasage.camel.metric.MetricPackage#getWindow_WindowType()
	 * @model required="true"
	 * @generated
	 */
	WindowType getWindowType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Window#getWindowType <em>Window Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window Type</em>' attribute.
	 * @see eu.paasage.camel.metric.WindowType
	 * @see #getWindowType()
	 * @generated
	 */
	void setWindowType(WindowType value);

	/**
	 * Returns the value of the '<em><b>Size Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.metric.WindowSizeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Type</em>' attribute.
	 * @see eu.paasage.camel.metric.WindowSizeType
	 * @see #setSizeType(WindowSizeType)
	 * @see eu.paasage.camel.metric.MetricPackage#getWindow_SizeType()
	 * @model required="true"
	 * @generated
	 */
	WindowSizeType getSizeType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Window#getSizeType <em>Size Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Type</em>' attribute.
	 * @see eu.paasage.camel.metric.WindowSizeType
	 * @see #getSizeType()
	 * @generated
	 */
	void setSizeType(WindowSizeType value);

	/**
	 * Returns the value of the '<em><b>Measurement Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Size</em>' attribute.
	 * @see #setMeasurementSize(long)
	 * @see eu.paasage.camel.metric.MetricPackage#getWindow_MeasurementSize()
	 * @model
	 * @generated
	 */
	long getMeasurementSize();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Window#getMeasurementSize <em>Measurement Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Size</em>' attribute.
	 * @see #getMeasurementSize()
	 * @generated
	 */
	void setMeasurementSize(long value);

	/**
	 * Returns the value of the '<em><b>Time Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Size</em>' attribute.
	 * @see #setTimeSize(long)
	 * @see eu.paasage.camel.metric.MetricPackage#getWindow_TimeSize()
	 * @model
	 * @generated
	 */
	long getTimeSize();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Window#getTimeSize <em>Time Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Size</em>' attribute.
	 * @see #getTimeSize()
	 * @generated
	 */
	void setTimeSize(long value);

} // Window
