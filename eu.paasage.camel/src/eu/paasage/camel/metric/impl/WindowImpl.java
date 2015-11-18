/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.metric.MetricPackage;
import eu.paasage.camel.metric.Window;
import eu.paasage.camel.metric.WindowSizeType;
import eu.paasage.camel.metric.WindowType;

import eu.paasage.camel.unit.TimeIntervalUnit;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.WindowImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.WindowImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.WindowImpl#getWindowType <em>Window Type</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.WindowImpl#getSizeType <em>Size Type</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.WindowImpl#getMeasurementSize <em>Measurement Size</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.WindowImpl#getTimeSize <em>Time Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindowImpl extends CDOObjectImpl implements Window {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.WINDOW;
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
		return (String)eGet(MetricPackage.Literals.WINDOW__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(MetricPackage.Literals.WINDOW__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeIntervalUnit getUnit() {
		return (TimeIntervalUnit)eGet(MetricPackage.Literals.WINDOW__UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(TimeIntervalUnit newUnit) {
		eSet(MetricPackage.Literals.WINDOW__UNIT, newUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowType getWindowType() {
		return (WindowType)eGet(MetricPackage.Literals.WINDOW__WINDOW_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindowType(WindowType newWindowType) {
		eSet(MetricPackage.Literals.WINDOW__WINDOW_TYPE, newWindowType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowSizeType getSizeType() {
		return (WindowSizeType)eGet(MetricPackage.Literals.WINDOW__SIZE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeType(WindowSizeType newSizeType) {
		eSet(MetricPackage.Literals.WINDOW__SIZE_TYPE, newSizeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMeasurementSize() {
		return (Long)eGet(MetricPackage.Literals.WINDOW__MEASUREMENT_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementSize(long newMeasurementSize) {
		eSet(MetricPackage.Literals.WINDOW__MEASUREMENT_SIZE, newMeasurementSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeSize() {
		return (Long)eGet(MetricPackage.Literals.WINDOW__TIME_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSize(long newTimeSize) {
		eSet(MetricPackage.Literals.WINDOW__TIME_SIZE, newTimeSize);
	}

} //WindowImpl
