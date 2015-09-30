/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.metric.ComparisonOperatorType;
import eu.paasage.camel.metric.Condition;
import eu.paasage.camel.metric.MetricPackage;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.ConditionImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.ConditionImpl#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.ConditionImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.ConditionImpl#getValidity <em>Validity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConditionImpl extends CDOObjectImpl implements Condition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.CONDITION;
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
	public Date getValidity() {
		return (Date)eGet(MetricPackage.Literals.CONDITION__VALIDITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidity(Date newValidity) {
		eSet(MetricPackage.Literals.CONDITION__VALIDITY, newValidity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(MetricPackage.Literals.CONDITION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(MetricPackage.Literals.CONDITION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThreshold() {
		return (Double)eGet(MetricPackage.Literals.CONDITION__THRESHOLD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(double newThreshold) {
		eSet(MetricPackage.Literals.CONDITION__THRESHOLD, newThreshold);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperatorType getComparisonOperator() {
		return (ComparisonOperatorType)eGet(MetricPackage.Literals.CONDITION__COMPARISON_OPERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonOperator(ComparisonOperatorType newComparisonOperator) {
		eSet(MetricPackage.Literals.CONDITION__COMPARISON_OPERATOR, newComparisonOperator);
	}

} //ConditionImpl
