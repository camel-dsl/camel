/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.metric.MetricPackage;
import eu.paasage.camel.metric.Sensor;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.SensorImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.SensorImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.SensorImpl#isIsPush <em>Is Push</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensorImpl extends CDOObjectImpl implements Sensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.SENSOR;
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
		return (String)eGet(MetricPackage.Literals.SENSOR__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(MetricPackage.Literals.SENSOR__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfiguration() {
		return (String)eGet(MetricPackage.Literals.SENSOR__CONFIGURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(String newConfiguration) {
		eSet(MetricPackage.Literals.SENSOR__CONFIGURATION, newConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPush() {
		return (Boolean)eGet(MetricPackage.Literals.SENSOR__IS_PUSH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPush(boolean newIsPush) {
		eSet(MetricPackage.Literals.SENSOR__IS_PUSH, newIsPush);
	}

} //SensorImpl
