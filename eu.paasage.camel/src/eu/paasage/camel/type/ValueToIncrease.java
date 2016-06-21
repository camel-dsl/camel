/**
 */
package eu.paasage.camel.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value To Increase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.type.ValueToIncrease#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.type.TypePackage#getValueToIncrease()
 * @model
 * @generated
 */
public interface ValueToIncrease extends NumericValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(NumericValue)
	 * @see eu.paasage.camel.type.TypePackage#getValueToIncrease_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumericValue getValue();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.type.ValueToIncrease#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(NumericValue value);

} // ValueToIncrease
