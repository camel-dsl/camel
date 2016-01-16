/**
 */
package eu.paasage.camel.metric;

import eu.paasage.camel.Application;

import eu.paasage.camel.deployment.Component;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.ConditionContext#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.ConditionContext#getComponent <em>Component</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.ConditionContext#getApplication <em>Application</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.ConditionContext#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.ConditionContext#getMinQuantity <em>Min Quantity</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.ConditionContext#getMaxQuantity <em>Max Quantity</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.ConditionContext#isIsRelative <em>Is Relative</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getConditionContext()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='context_right_params at_least_one_alternative_in_condition_context'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot context_right_params='Tuple {\n\tmessage : String = \'Context: \' + self.name +\n\t\t\t\t\t\' has wrong value combinations for the quantifier and quantity attributes. When quantifier equals to SOME, then we have the two following cases: (a) relative values: minQuantity should be greater than 0.0 and maxQuantity less or equal to 1.0 and minQuantity less or equal to maxQuantity; (b) absolute values: minQuantity should be greater or equal to 1 and maxQuantity either -1 (inf) or greater or equal to minQuantity and both quantities should be integer\',\n\tstatus : Boolean = ((self.quantifier\n\t\t\t\t\t= QuantifierType::SOME and self.isRelative = true) implies (minQuantity > 0.0 and maxQuantity <= 1.0 and\n\t\t\t\t\tmaxQuantity >= minQuantity)) and ((self.quantifier = QuantifierType::SOME and self.isRelative = false) implies\n\t\t\t\t\t(minQuantity >= 1.0 and ((maxQuantity >= 1.0 and maxQuantity >= minQuantity) or maxQuantity = - 1.0)) and\n\t\t\t\t\t(minQuantity / minQuantity.round()) = 1 and (maxQuantity / maxQuantity.round()) = 1)\n}.status' at_least_one_alternative_in_condition_context='Tuple {\n\tmessage : String = \'In ConditionContext: \' + self.name +\n\t\t\t\t\t\' either a component or an application should be referenced\',\n\tstatus : Boolean = self.component <> null or self.application <> null\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface ConditionContext extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.paasage.camel.metric.MetricPackage#getConditionContext_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.ConditionContext#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see eu.paasage.camel.metric.MetricPackage#getConditionContext_Component()
	 * @model
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.ConditionContext#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference.
	 * @see #setApplication(Application)
	 * @see eu.paasage.camel.metric.MetricPackage#getConditionContext_Application()
	 * @model
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.ConditionContext#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link eu.paasage.camel.metric.QuantifierType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see eu.paasage.camel.metric.QuantifierType
	 * @see #setQuantifier(QuantifierType)
	 * @see eu.paasage.camel.metric.MetricPackage#getConditionContext_Quantifier()
	 * @model default="ANY" required="true"
	 * @generated
	 */
	QuantifierType getQuantifier();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.ConditionContext#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see eu.paasage.camel.metric.QuantifierType
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(QuantifierType value);

	/**
	 * Returns the value of the '<em><b>Min Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Quantity</em>' attribute.
	 * @see #setMinQuantity(double)
	 * @see eu.paasage.camel.metric.MetricPackage#getConditionContext_MinQuantity()
	 * @model
	 * @generated
	 */
	double getMinQuantity();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.ConditionContext#getMinQuantity <em>Min Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Quantity</em>' attribute.
	 * @see #getMinQuantity()
	 * @generated
	 */
	void setMinQuantity(double value);

	/**
	 * Returns the value of the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Quantity</em>' attribute.
	 * @see #setMaxQuantity(double)
	 * @see eu.paasage.camel.metric.MetricPackage#getConditionContext_MaxQuantity()
	 * @model
	 * @generated
	 */
	double getMaxQuantity();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.ConditionContext#getMaxQuantity <em>Max Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Quantity</em>' attribute.
	 * @see #getMaxQuantity()
	 * @generated
	 */
	void setMaxQuantity(double value);

	/**
	 * Returns the value of the '<em><b>Is Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Relative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Relative</em>' attribute.
	 * @see #setIsRelative(boolean)
	 * @see eu.paasage.camel.metric.MetricPackage#getConditionContext_IsRelative()
	 * @model
	 * @generated
	 */
	boolean isIsRelative();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.ConditionContext#isIsRelative <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Relative</em>' attribute.
	 * @see #isIsRelative()
	 * @generated
	 */
	void setIsRelative(boolean value);

} // ConditionContext
