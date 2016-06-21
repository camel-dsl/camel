/**
 */
package eu.paasage.camel.provider;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.provider.Functional#getType <em>Type</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.Functional#getOrder <em>Order</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.Functional#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.provider.ProviderPackage#getFunctional()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='correct_values_for_functional'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot correct_values_for_functional='Tuple {\n\tmessage : String = \'In Functional Constraint: \' + self.name +\n\t\t\t\t\t\', either the value of order is negative or that of the value attributes is not positive\',\n\tstatus : Boolean = order >= 0 and value >\n\t\t\t\t\t0\n}.status'"
 * @generated
 */
public interface Functional extends Requires {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.provider.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eu.paasage.camel.provider.Operator
	 * @see #setType(Operator)
	 * @see eu.paasage.camel.provider.ProviderPackage#getFunctional_Type()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='ProviderRequirement' unique='false' upper='*'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='ProviderRequirement' unique='false' upper='*'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='BinaryEventPattern' unique='false' upper='*'"
	 * @generated
	 */
	Operator getType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Functional#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.paasage.camel.provider.Operator
	 * @see #getType()
	 * @generated
	 */
	void setType(Operator value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see eu.paasage.camel.provider.ProviderPackage#getFunctional_Order()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='BinaryEventPattern' unique='false' upper='*'"
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Functional#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see eu.paasage.camel.provider.ProviderPackage#getFunctional_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Functional#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // Functional
