/**
 */
package eu.paasage.camel.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.type.Range#getLowerLimit <em>Lower Limit</em>}</li>
 *   <li>{@link eu.paasage.camel.type.Range#getUpperLimit <em>Upper Limit</em>}</li>
 *   <li>{@link eu.paasage.camel.type.Range#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.type.TypePackage#getRange()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='correct_range_type enforce_correct_range_type range_low_less_than_upper range_infs_at_appropriate_pos'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot correct_range_type='Tuple {\n\tmessage : String = \'Range: \' + self.toString() + \' has a non-numeric primitiveType: \' +\n\t\t\t\t\tprimitiveType.toString(),\n\tstatus : Boolean = (primitiveType = TypeEnum::IntType) or (primitiveType = TypeEnum::FloatType) or\n\t\t\t\t\t(primitiveType = TypeEnum::DoubleType)\n}.status' enforce_correct_range_type='Tuple {\n\tmessage : String = \'Range: \' + self.toString() +\n\t\t\t\t\t\' has either its low or upper limit not conforming to its primitive type\',\n\tstatus : Boolean = self.checkType(self.lowerLimit,\n\t\t\t\t\t\tprimitiveType, true) and self.checkType(self.upperLimit, primitiveType, false)\n}.status' range_low_less_than_upper='Tuple {\n\tmessage : String = \'Range: \' + self.toString() +\n\t\t\t\t\t\' has its lower limit greater than the upper\',\n\tstatus : Boolean = if (not (lowerLimit.value.oclIsTypeOf(NegativeInf)) and not\n\t\t\t\t\t\t(upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\tthen if (primitiveType = TypeEnum::IntType)\n\t\t\t\t\t\tthen if (not (upperLimit.included) and not (lowerLimit.included))\n\t\t\t\t\t\t\tthen (upperLimit.value.oclAsType(IntegerValue).value -\n\t\t\t\t\t\t\t\tlowerLimit.value.oclAsType(IntegerValue).value.oclAsType(ecore::EInt)) >= 2\n\t\t\t\t\t\t\telse if (upperLimit.included)\n\t\t\t\t\t\t\t\tthen lowerLimit.value.oclAsType(IntegerValue).value.oclAsType(ecore::EInt) <=\n\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(IntegerValue).value\n\t\t\t\t\t\t\t\telse lowerLimit.value.oclAsType(IntegerValue).value.oclAsType(ecore::EInt) <\n\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(IntegerValue).value\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse (if (primitiveType = TypeEnum::FloatType)\n\t\t\t\t\t\t\tthen if (upperLimit.included)\n\t\t\t\t\t\t\t\tthen lowerLimit.value.oclAsType(FloatsValue).value.oclAsType(ecore::EFloat) <=\n\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(FloatsValue).value\n\t\t\t\t\t\t\t\telse lowerLimit.value.oclAsType(FloatsValue).value.oclAsType(ecore::EFloat) <\n\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(FloatsValue).value\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (upperLimit.included)\n\t\t\t\t\t\t\t\tthen lowerLimit.value.oclAsType(DoublePrecisionValue).value.oclAsType(ecore::EDouble) <=\n\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(DoublePrecisionValue).value\n\t\t\t\t\t\t\t\telse lowerLimit.value.oclAsType(DoublePrecisionValue).value.oclAsType(ecore::EDouble) <\n\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(DoublePrecisionValue).value\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\tendif\n\t\t\t\t\telse true\n\t\t\t\t\tendif\n}.status' range_infs_at_appropriate_pos='Tuple {\n\tmessage : String = \'Range: \' + self.toString() +\n\t\t\t\t\t\' has a PositiveInf value for its lower limit or a NegativeInf value for its upper limit\',\n\tstatus : Boolean = not\n\t\t\t\t\t(lowerLimit.value.oclIsTypeOf(PositiveInf) or upperLimit.value.oclIsTypeOf(NegativeInf))\n}.status'"
 * @generated
 */
public interface Range extends ValueType {
	/**
	 * Returns the value of the '<em><b>Lower Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Limit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Limit</em>' containment reference.
	 * @see #setLowerLimit(Limit)
	 * @see eu.paasage.camel.type.TypePackage#getRange_LowerLimit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Limit getLowerLimit();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.type.Range#getLowerLimit <em>Lower Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Limit</em>' containment reference.
	 * @see #getLowerLimit()
	 * @generated
	 */
	void setLowerLimit(Limit value);

	/**
	 * Returns the value of the '<em><b>Upper Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Limit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Limit</em>' containment reference.
	 * @see #setUpperLimit(Limit)
	 * @see eu.paasage.camel.type.TypePackage#getRange_UpperLimit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Limit getUpperLimit();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.type.Range#getUpperLimit <em>Upper Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Limit</em>' containment reference.
	 * @see #getUpperLimit()
	 * @generated
	 */
	void setUpperLimit(Limit value);

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
	 * @see eu.paasage.camel.type.TypePackage#getRange_PrimitiveType()
	 * @model required="true"
	 * @generated
	 */
	TypeEnum getPrimitiveType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.type.Range#getPrimitiveType <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' attribute.
	 * @see eu.paasage.camel.type.TypeEnum
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(TypeEnum value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model lRequired="true" typeRequired="true" lowerRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if (type = TypeEnum::IntType)\n\t\t\t\t\t\tthen if (lower and not (lowerLimit.value.oclIsTypeOf(NegativeInf)))\n\t\t\t\t\t\t\tthen lowerLimit.value.oclIsTypeOf(IntegerValue)\n\t\t\t\t\t\t\telse if (not (lower) and not (upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\tthen upperLimit.value.oclIsTypeOf(IntegerValue)\n\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse if (type = TypeEnum::FloatType)\n\t\t\t\t\t\t\tthen if (lower and not (lowerLimit.value.oclIsTypeOf(NegativeInf)))\n\t\t\t\t\t\t\t\tthen lowerLimit.value.oclIsTypeOf(FloatsValue)\n\t\t\t\t\t\t\t\telse if (not (lower) and not (upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\t\tthen upperLimit.value.oclIsTypeOf(FloatsValue)\n\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (lower and not (lowerLimit.value.oclIsTypeOf(NegativeInf)))\n\t\t\t\t\t\t\t\tthen lowerLimit.value.oclIsTypeOf(DoublePrecisionValue)\n\t\t\t\t\t\t\t\telse if (not (lower) and not (upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\t\tthen upperLimit.value.oclIsTypeOf(DoublePrecisionValue)\n\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean checkType(Limit l, TypeEnum type, boolean lower);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if (primitiveType = TypeEnum::IntType)\n\t\t\t\t\t\tthen if (not (lowerLimit.value.oclIsTypeOf(NegativeInf)))\n\t\t\t\t\t\t\tthen ((lowerLimit.included and lowerLimit.value.oclAsType(IntegerValue).value <= n) or (not\n\t\t\t\t\t\t\t\t(lowerLimit.included) and lowerLimit.value.oclAsType(IntegerValue).value < n)) and if (not\n\t\t\t\t\t\t\t\t\t(upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\tthen (upperLimit.included and upperLimit.value.oclAsType(IntegerValue).value >= n) or (not\n\t\t\t\t\t\t\t\t\t(upperLimit.included) and upperLimit.value.oclAsType(IntegerValue).value > n)\n\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (not (upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\tthen (upperLimit.included and upperLimit.value.oclAsType(IntegerValue).value >= n) or (not\n\t\t\t\t\t\t\t\t\t(upperLimit.included) and upperLimit.value.oclAsType(IntegerValue).value > n)\n\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse if (primitiveType = TypeEnum::FloatType)\n\t\t\t\t\t\t\tthen if (not (lowerLimit.value.oclIsTypeOf(NegativeInf)))\n\t\t\t\t\t\t\t\tthen ((lowerLimit.included and lowerLimit.value.oclAsType(FloatsValue).value <= n) or (not\n\t\t\t\t\t\t\t\t\t(lowerLimit.included) and lowerLimit.value.oclAsType(FloatsValue).value < n)) and if (not\n\t\t\t\t\t\t\t\t\t\t(upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\t\tthen (upperLimit.included and upperLimit.value.oclAsType(FloatsValue).value >= n) or (not\n\t\t\t\t\t\t\t\t\t\t(upperLimit.included) and upperLimit.value.oclAsType(FloatsValue).value > n)\n\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse if (not (upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\t\tthen (upperLimit.included and upperLimit.value.oclAsType(FloatsValue).value >= n) or (not\n\t\t\t\t\t\t\t\t\t\t(upperLimit.included) and upperLimit.value.oclAsType(FloatsValue).value > n)\n\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (not (lowerLimit.value.oclIsTypeOf(NegativeInf)))\n\t\t\t\t\t\t\t\tthen ((lowerLimit.included and lowerLimit.value.oclAsType(DoublePrecisionValue).value <= n) or (not\n\t\t\t\t\t\t\t\t\t(lowerLimit.included) and lowerLimit.value.oclAsType(DoublePrecisionValue).value < n)) and if (not\n\t\t\t\t\t\t\t\t\t\t(upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\t\tthen (upperLimit.included and upperLimit.value.oclAsType(DoublePrecisionValue).value >= n) or (not\n\t\t\t\t\t\t\t\t\t\t(upperLimit.included) and upperLimit.value.oclAsType(DoublePrecisionValue).value > n)\n\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse if (not (upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\t\tthen (upperLimit.included and upperLimit.value.oclAsType(DoublePrecisionValue).value >= n) or (not\n\t\t\t\t\t\t\t\t\t\t(upperLimit.included) and upperLimit.value.oclAsType(DoublePrecisionValue).value > n)\n\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean includesValue(double n);

} // Range
