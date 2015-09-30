/**
 */
package eu.paasage.camel.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floats Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.type.FloatsValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.type.TypePackage#getFloatsValue()
 * @model
 * @generated
 */
public interface FloatsValue extends NumericValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see eu.paasage.camel.type.TypePackage#getFloatsValue_Value()
	 * @model required="true"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.type.FloatsValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // FloatsValue
