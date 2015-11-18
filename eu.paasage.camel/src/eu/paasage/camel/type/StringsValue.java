/**
 */
package eu.paasage.camel.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strings Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.type.StringsValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.type.TypePackage#getStringsValue()
 * @model
 * @generated
 */
public interface StringsValue extends SingleValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see eu.paasage.camel.type.TypePackage#getStringsValue_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.type.StringsValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringsValue
