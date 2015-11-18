/**
 */
package eu.paasage.camel.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.type.BoolValue#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.type.TypePackage#getBoolValue()
 * @model
 * @generated
 */
public interface BoolValue extends SingleValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see eu.paasage.camel.type.TypePackage#getBoolValue_Value()
	 * @model required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.type.BoolValue#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // BoolValue
