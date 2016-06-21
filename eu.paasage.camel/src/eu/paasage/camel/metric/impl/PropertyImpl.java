/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.metric.MetricPackage;
import eu.paasage.camel.metric.Property;
import eu.paasage.camel.metric.PropertyType;
import eu.paasage.camel.metric.Sensor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.PropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.PropertyImpl#getSubProperties <em>Sub Properties</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.PropertyImpl#getSensors <em>Sensors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends CDOObjectImpl implements Property {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.PROPERTY;
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
		return (String)eGet(MetricPackage.Literals.PROPERTY__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(MetricPackage.Literals.PROPERTY__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(MetricPackage.Literals.PROPERTY__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(MetricPackage.Literals.PROPERTY__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType getType() {
		return (PropertyType)eGet(MetricPackage.Literals.PROPERTY__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PropertyType newType) {
		eSet(MetricPackage.Literals.PROPERTY__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getSubProperties() {
		return (EList<Property>)eGet(MetricPackage.Literals.PROPERTY__SUB_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Sensor> getSensors() {
		return (EList<Sensor>)eGet(MetricPackage.Literals.PROPERTY__SENSORS, true);
	}

} //PropertyImpl
