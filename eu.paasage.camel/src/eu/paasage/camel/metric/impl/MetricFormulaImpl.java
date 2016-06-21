/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.metric.FunctionPatternType;
import eu.paasage.camel.metric.Metric;
import eu.paasage.camel.metric.MetricFormula;
import eu.paasage.camel.metric.MetricFormulaParameter;
import eu.paasage.camel.metric.MetricFunctionArityType;
import eu.paasage.camel.metric.MetricFunctionType;
import eu.paasage.camel.metric.MetricPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricFormulaImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricFormulaImpl#getFunctionArity <em>Function Arity</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricFormulaImpl#getFunctionPattern <em>Function Pattern</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricFormulaImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetricFormulaImpl extends MetricFormulaParameterImpl implements MetricFormula {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricFormulaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.METRIC_FORMULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricFunctionType getFunction() {
		return (MetricFunctionType)eGet(MetricPackage.Literals.METRIC_FORMULA__FUNCTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(MetricFunctionType newFunction) {
		eSet(MetricPackage.Literals.METRIC_FORMULA__FUNCTION, newFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricFunctionArityType getFunctionArity() {
		return (MetricFunctionArityType)eGet(MetricPackage.Literals.METRIC_FORMULA__FUNCTION_ARITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionArity(MetricFunctionArityType newFunctionArity) {
		eSet(MetricPackage.Literals.METRIC_FORMULA__FUNCTION_ARITY, newFunctionArity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPatternType getFunctionPattern() {
		return (FunctionPatternType)eGet(MetricPackage.Literals.METRIC_FORMULA__FUNCTION_PATTERN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionPattern(FunctionPatternType newFunctionPattern) {
		eSet(MetricPackage.Literals.METRIC_FORMULA__FUNCTION_PATTERN, newFunctionPattern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MetricFormulaParameter> getParameters() {
		return (EList<MetricFormulaParameter>)eGet(MetricPackage.Literals.METRIC_FORMULA__PARAMETERS, true);
	}

	/**
	 * The cached invocation delegate for the '{@link #containsMetric(eu.paasage.camel.metric.Metric) <em>Contains Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #containsMetric(eu.paasage.camel.metric.Metric)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CONTAINS_METRIC_METRIC__EINVOCATION_DELEGATE = ((EOperation.Internal)MetricPackage.Literals.METRIC_FORMULA___CONTAINS_METRIC__METRIC).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean containsMetric(Metric m) {
		try {
			return (Boolean)CONTAINS_METRIC_METRIC__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{m}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #hasMetric() <em>Has Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasMetric()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate HAS_METRIC__EINVOCATION_DELEGATE = ((EOperation.Internal)MetricPackage.Literals.METRIC_FORMULA___HAS_METRIC).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasMetric() {
		try {
			return (Boolean)HAS_METRIC__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case MetricPackage.METRIC_FORMULA___CONTAINS_METRIC__METRIC:
				return containsMetric((Metric)arguments.get(0));
			case MetricPackage.METRIC_FORMULA___HAS_METRIC:
				return hasMetric();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MetricFormulaImpl
