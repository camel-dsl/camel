/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.LayerType;
import eu.paasage.camel.metric.CompositeMetric;
import eu.paasage.camel.metric.MetricFormula;
import eu.paasage.camel.metric.MetricPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.CompositeMetricImpl#getFormula <em>Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeMetricImpl extends MetricImpl implements CompositeMetric {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.COMPOSITE_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricFormula getFormula() {
		return (MetricFormula)eGet(MetricPackage.Literals.COMPOSITE_METRIC__FORMULA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(MetricFormula newFormula) {
		eSet(MetricPackage.Literals.COMPOSITE_METRIC__FORMULA, newFormula);
	}

	/**
	 * The cached invocation delegate for the '{@link #greaterEqualThanLayer(eu.paasage.camel.LayerType, eu.paasage.camel.LayerType) <em>Greater Equal Than Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #greaterEqualThanLayer(eu.paasage.camel.LayerType, eu.paasage.camel.LayerType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GREATER_EQUAL_THAN_LAYER_LAYER_TYPE_LAYER_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)MetricPackage.Literals.COMPOSITE_METRIC___GREATER_EQUAL_THAN_LAYER__LAYERTYPE_LAYERTYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean greaterEqualThanLayer(LayerType l1, LayerType l2) {
		try {
			return (Boolean)GREATER_EQUAL_THAN_LAYER_LAYER_TYPE_LAYER_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{l1, l2}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MetricPackage.COMPOSITE_METRIC___GREATER_EQUAL_THAN_LAYER__LAYERTYPE_LAYERTYPE:
				return greaterEqualThanLayer((LayerType)arguments.get(0), (LayerType)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CompositeMetricImpl
