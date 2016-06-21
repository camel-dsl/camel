/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.metric.MetricFormulaParameter;
import eu.paasage.camel.metric.MetricPackage;

import eu.paasage.camel.type.SingleValue;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formula Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricFormulaParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricFormulaParameterImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetricFormulaParameterImpl extends CDOObjectImpl implements MetricFormulaParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricFormulaParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.METRIC_FORMULA_PARAMETER;
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
		return (String)eGet(MetricPackage.Literals.METRIC_FORMULA_PARAMETER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(MetricPackage.Literals.METRIC_FORMULA_PARAMETER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValue getValue() {
		return (SingleValue)eGet(MetricPackage.Literals.METRIC_FORMULA_PARAMETER__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(SingleValue newValue) {
		eSet(MetricPackage.Literals.METRIC_FORMULA_PARAMETER__VALUE, newValue);
	}

} //MetricFormulaParameterImpl
