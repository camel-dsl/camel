/**
 */
package eu.paasage.camel.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.type.StringValueType#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.type.TypePackage#getStringValueType()
 * @model
 * @generated
 */
public interface StringValueType extends ValueType {
	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.type.TypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type</em>' attribute.
	 * @see eu.paasage.camel.type.TypeEnum
	 * @see #setPrimitiveType(TypeEnum)
	 * @see eu.paasage.camel.type.TypePackage#getStringValueType_PrimitiveType()
	 * @model required="true"
	 * @generated
	 */
	TypeEnum getPrimitiveType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.type.StringValueType#getPrimitiveType <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' attribute.
	 * @see eu.paasage.camel.type.TypeEnum
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(TypeEnum value);

} // StringValueType
