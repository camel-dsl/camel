/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.LayerType;
import eu.paasage.camel.metric.CompositeMetric;
import eu.paasage.camel.metric.Metric;
import eu.paasage.camel.metric.MetricPackage;
import eu.paasage.camel.metric.Property;
import eu.paasage.camel.type.ValueType;
import eu.paasage.camel.unit.Unit;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricImpl#getValueDirection <em>Value Direction</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MetricImpl extends MetricFormulaParameterImpl implements Metric {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(MetricPackage.Literals.METRIC__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(MetricPackage.Literals.METRIC__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType getValueType() {
		return (ValueType)eGet(MetricPackage.Literals.METRIC__VALUE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(ValueType newValueType) {
		eSet(MetricPackage.Literals.METRIC__VALUE_TYPE, newValueType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getValueDirection() {
		return (Short)eGet(MetricPackage.Literals.METRIC__VALUE_DIRECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDirection(short newValueDirection) {
		eSet(MetricPackage.Literals.METRIC__VALUE_DIRECTION, newValueDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getUnit() {
		return (Unit)eGet(MetricPackage.Literals.METRIC__UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Unit newUnit) {
		eSet(MetricPackage.Literals.METRIC__UNIT, newUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerType getLayer() {
		return (LayerType)eGet(MetricPackage.Literals.METRIC__LAYER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayer(LayerType newLayer) {
		eSet(MetricPackage.Literals.METRIC__LAYER, newLayer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getProperty() {
		return (Property)eGet(MetricPackage.Literals.METRIC__PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(Property newProperty) {
		eSet(MetricPackage.Literals.METRIC__PROPERTY, newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkRecursiveness(final Metric mt1, final Metric mt2) {
		System.out.println("Checking recursiveness for Metric: " + mt1.getName());
				CompositeMetric m1 = (CompositeMetric)mt1;
				for (eu.paasage.camel.metric.MetricFormulaParameter param: m1.getFormula().getParameters()){
					if (param instanceof Metric){
						Metric mt = (Metric)param;
						if (mt.getName().equals(mt2.getName())) return Boolean.TRUE;
						if (mt instanceof CompositeMetric && checkRecursiveness(mt,mt2)) return Boolean.TRUE;
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
			case MetricPackage.METRIC___CHECK_RECURSIVENESS__METRIC_METRIC:
				return checkRecursiveness((Metric)arguments.get(0), (Metric)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //MetricImpl
