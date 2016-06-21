/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.Application;

import eu.paasage.camel.deployment.Component;

import eu.paasage.camel.metric.ConditionContext;
import eu.paasage.camel.metric.MetricPackage;
import eu.paasage.camel.metric.QuantifierType;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.ConditionContextImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.ConditionContextImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.ConditionContextImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.ConditionContextImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.ConditionContextImpl#getMinQuantity <em>Min Quantity</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.ConditionContextImpl#getMaxQuantity <em>Max Quantity</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.ConditionContextImpl#isIsRelative <em>Is Relative</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConditionContextImpl extends CDOObjectImpl implements ConditionContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.CONDITION_CONTEXT;
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
		return (String)eGet(MetricPackage.Literals.CONDITION_CONTEXT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(MetricPackage.Literals.CONDITION_CONTEXT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		return (Component)eGet(MetricPackage.Literals.CONDITION_CONTEXT__COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		eSet(MetricPackage.Literals.CONDITION_CONTEXT__COMPONENT, newComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		return (Application)eGet(MetricPackage.Literals.CONDITION_CONTEXT__APPLICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		eSet(MetricPackage.Literals.CONDITION_CONTEXT__APPLICATION, newApplication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifierType getQuantifier() {
		return (QuantifierType)eGet(MetricPackage.Literals.CONDITION_CONTEXT__QUANTIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantifier(QuantifierType newQuantifier) {
		eSet(MetricPackage.Literals.CONDITION_CONTEXT__QUANTIFIER, newQuantifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinQuantity() {
		return (Double)eGet(MetricPackage.Literals.CONDITION_CONTEXT__MIN_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinQuantity(double newMinQuantity) {
		eSet(MetricPackage.Literals.CONDITION_CONTEXT__MIN_QUANTITY, newMinQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxQuantity() {
		return (Double)eGet(MetricPackage.Literals.CONDITION_CONTEXT__MAX_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxQuantity(double newMaxQuantity) {
		eSet(MetricPackage.Literals.CONDITION_CONTEXT__MAX_QUANTITY, newMaxQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRelative() {
		return (Boolean)eGet(MetricPackage.Literals.CONDITION_CONTEXT__IS_RELATIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRelative(boolean newIsRelative) {
		eSet(MetricPackage.Literals.CONDITION_CONTEXT__IS_RELATIVE, newIsRelative);
	}

} //ConditionContextImpl
