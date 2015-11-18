/**
 */
package eu.paasage.camel.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.type.List#getValues <em>Values</em>}</li>
 *   <li>{@link eu.paasage.camel.type.List#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link eu.paasage.camel.type.List#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.type.TypePackage#getList()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='list_must_have_type all_list_values_correct_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot list_must_have_type='Tuple {\n\tmessage : String = \'List:\' + self.toString() +\n\t\t\t\t\t\' should either have a primitive or a normal type of values\',\n\tstatus : Boolean = (primitiveType <> null and type = null) or (type <>\n\t\t\t\t\tnull and primitiveType = null)\n}.status' all_list_values_correct_type='Tuple {\n\tmessage : String = \'List: \' + self.toString() +\n\t\t\t\t\t\' has one or more values that do not conform to its value type\',\n\tstatus : Boolean = values\n\t\t\t\t\t->forAll(p | self.checkValueType(p))\n}.status'"
 * @generated
 */
public interface List extends ValueType {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.type.SingleValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see eu.paasage.camel.type.TypePackage#getList_Values()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SingleValue> getValues();

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
	 * @see eu.paasage.camel.type.TypePackage#getList_PrimitiveType()
	 * @model
	 * @generated
	 */
	TypeEnum getPrimitiveType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.type.List#getPrimitiveType <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' attribute.
	 * @see eu.paasage.camel.type.TypeEnum
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(TypeEnum value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ValueType)
	 * @see eu.paasage.camel.type.TypePackage#getList_Type()
	 * @model
	 * @generated
	 */
	ValueType getType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.type.List#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ValueType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model vRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if (type <> null)\n\t\t\t\t\t\tthen if (type.oclIsTypeOf(Range))\n\t\t\t\t\t\t\tthen if (type.oclAsType(Range).primitiveType = TypeEnum::IntType)\n\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(IntegerValue).value = v.oclAsType(IntegerValue).value)\n\t\t\t\t\t\t\t\telse if (type.oclAsType(Range).primitiveType = TypeEnum::FloatType)\n\t\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(FloatsValue).value = v.oclAsType(FloatsValue).value)\n\t\t\t\t\t\t\t\t\telse values\n\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(DoublePrecisionValue).value = v.oclAsType(DoublePrecisionValue).value)\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (type.oclIsTypeOf(RangeUnion))\n\t\t\t\t\t\t\t\tthen if (type.oclAsType(RangeUnion).primitiveType = TypeEnum::IntType)\n\t\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(IntegerValue).value = v.oclAsType(IntegerValue).value)\n\t\t\t\t\t\t\t\t\telse if (type.oclAsType(RangeUnion).primitiveType = TypeEnum::FloatType)\n\t\t\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(FloatsValue).value = v.oclAsType(FloatsValue).value)\n\t\t\t\t\t\t\t\t\t\telse values\n\t\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(DoublePrecisionValue).value = v.oclAsType(DoublePrecisionValue).value)\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse if (type.oclIsTypeOf(StringValueType))\n\t\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(StringsValue).value = v.oclAsType(StringsValue).value)\n\t\t\t\t\t\t\t\t\telse if (type.oclIsTypeOf(BooleanValueType))\n\t\t\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(BoolValue).value = v.oclAsType(BoolValue).value)\n\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse if (primitiveType = TypeEnum::IntType)\n\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(IntegerValue).value = v.oclAsType(IntegerValue).value)\n\t\t\t\t\t\t\telse if (primitiveType = TypeEnum::FloatType)\n\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(FloatsValue).value = v.oclAsType(FloatsValue).value)\n\t\t\t\t\t\t\t\telse if (primitiveType = TypeEnum::DoubleType)\n\t\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(DoublePrecisionValue).value = v.oclAsType(DoublePrecisionValue).value)\n\t\t\t\t\t\t\t\t\telse if (primitiveType = TypeEnum::StringType)\n\t\t\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(StringsValue).value = v.oclAsType(StringsValue).value)\n\t\t\t\t\t\t\t\t\t\telse if (primitiveType = TypeEnum::BooleanType)\n\t\t\t\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(BoolValue).value = v.oclAsType(BoolValue).value)\n\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean includesValue(SingleValue v);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if (type <> null)\n\t\t\t\t\t\tthen if (type.oclIsTypeOf(Range))\n\t\t\t\t\t\t\tthen if (type.oclAsType(Range).primitiveType = TypeEnum::IntType)\n\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(IntegerValue) and\n\t\t\t\t\t\t\t\t\ttype.oclAsType(Range).includesValue(p.oclAsType(IntegerValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\telse if (type.oclAsType(Range).primitiveType = TypeEnum::FloatType)\n\t\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(FloatsValue) and\n\t\t\t\t\t\t\t\t\t\ttype.oclAsType(Range).includesValue(p.oclAsType(FloatsValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\telse p.oclIsTypeOf(DoublePrecisionValue) and\n\t\t\t\t\t\t\t\t\t\ttype.oclAsType(Range).includesValue(p.oclAsType(DoublePrecisionValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (type.oclIsTypeOf(RangeUnion))\n\t\t\t\t\t\t\t\tthen if (type.oclAsType(RangeUnion).primitiveType = TypeEnum::IntType)\n\t\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(IntegerValue) and\n\t\t\t\t\t\t\t\t\t\ttype.oclAsType(RangeUnion).includesValue(p.oclAsType(IntegerValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\telse if (type.oclAsType(RangeUnion).primitiveType = TypeEnum::FloatType)\n\t\t\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(FloatsValue) and\n\t\t\t\t\t\t\t\t\t\t\ttype.oclAsType(RangeUnion).includesValue(p.oclAsType(FloatsValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\t\telse p.oclIsTypeOf(DoublePrecisionValue) and\n\t\t\t\t\t\t\t\t\t\t\ttype.oclAsType(RangeUnion).includesValue(p.oclAsType(DoublePrecisionValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse if (type.oclIsTypeOf(StringValueType))\n\t\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(StringsValue)\n\t\t\t\t\t\t\t\t\telse if (type.oclIsTypeOf(BooleanValueType))\n\t\t\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(BoolValue)\n\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse if (primitiveType = TypeEnum::IntType)\n\t\t\t\t\t\t\tthen p.oclIsTypeOf(IntegerValue)\n\t\t\t\t\t\t\telse if (primitiveType = TypeEnum::StringType)\n\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(StringsValue)\n\t\t\t\t\t\t\t\telse if (primitiveType = TypeEnum::BooleanType)\n\t\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(BoolValue)\n\t\t\t\t\t\t\t\t\telse if (primitiveType = TypeEnum::FloatType)\n\t\t\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(FloatsValue)\n\t\t\t\t\t\t\t\t\t\telse if (primitiveType = TypeEnum::DoubleType)\n\t\t\t\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(DoublePrecisionValue)\n\t\t\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean checkValueType(SingleValue p);

} // List
