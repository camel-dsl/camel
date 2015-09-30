/**
 */
package eu.paasage.camel.scalability.impl;

import eu.paasage.camel.metric.MetricCondition;

import eu.paasage.camel.scalability.NonFunctionalEvent;
import eu.paasage.camel.scalability.ScalabilityPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Functional Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.impl.NonFunctionalEventImpl#getMetricCondition <em>Metric Condition</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.NonFunctionalEventImpl#isIsViolation <em>Is Violation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonFunctionalEventImpl extends SimpleEventImpl implements NonFunctionalEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonFunctionalEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalabilityPackage.Literals.NON_FUNCTIONAL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricCondition getMetricCondition() {
		return (MetricCondition)eGet(ScalabilityPackage.Literals.NON_FUNCTIONAL_EVENT__METRIC_CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetricCondition(MetricCondition newMetricCondition) {
		eSet(ScalabilityPackage.Literals.NON_FUNCTIONAL_EVENT__METRIC_CONDITION, newMetricCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsViolation() {
		return (Boolean)eGet(ScalabilityPackage.Literals.NON_FUNCTIONAL_EVENT__IS_VIOLATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsViolation(boolean newIsViolation) {
		eSet(ScalabilityPackage.Literals.NON_FUNCTIONAL_EVENT__IS_VIOLATION, newIsViolation);
	}

} //NonFunctionalEventImpl
