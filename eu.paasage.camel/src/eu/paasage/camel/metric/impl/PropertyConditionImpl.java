/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.metric.MetricPackage;
import eu.paasage.camel.metric.PropertyCondition;
import eu.paasage.camel.metric.PropertyContext;

import eu.paasage.camel.unit.MonetaryUnit;
import eu.paasage.camel.unit.TimeIntervalUnit;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.PropertyConditionImpl#getPropertyContext <em>Property Context</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.PropertyConditionImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.PropertyConditionImpl#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyConditionImpl extends ConditionImpl implements PropertyCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.PROPERTY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyContext getPropertyContext() {
		return (PropertyContext)eGet(MetricPackage.Literals.PROPERTY_CONDITION__PROPERTY_CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyContext(PropertyContext newPropertyContext) {
		eSet(MetricPackage.Literals.PROPERTY_CONDITION__PROPERTY_CONTEXT, newPropertyContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonetaryUnit getUnit() {
		return (MonetaryUnit)eGet(MetricPackage.Literals.PROPERTY_CONDITION__UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(MonetaryUnit newUnit) {
		eSet(MetricPackage.Literals.PROPERTY_CONDITION__UNIT, newUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeIntervalUnit getTimeUnit() {
		return (TimeIntervalUnit)eGet(MetricPackage.Literals.PROPERTY_CONDITION__TIME_UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUnit(TimeIntervalUnit newTimeUnit) {
		eSet(MetricPackage.Literals.PROPERTY_CONDITION__TIME_UNIT, newTimeUnit);
	}

} //PropertyConditionImpl
