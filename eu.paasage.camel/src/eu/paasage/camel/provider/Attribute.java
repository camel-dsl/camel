/**
 */
package eu.paasage.camel.provider;

import eu.paasage.camel.type.SingleValue;
import eu.paasage.camel.type.ValueType;

import eu.paasage.camel.unit.UnitType;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.provider.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.Attribute#getValue <em>Value</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.Attribute#getValueType <em>Value Type</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.Attribute#getUnitType <em>Unit Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.provider.ProviderPackage#getAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='attribute_must_have_at_least_value_or_value_type attribute_value_in_value_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot attribute_must_have_at_least_value_or_value_type='Tuple {\n\tmessage : String = \'Attribute: \' + self.name +\n\t\t\t\t\t\' does not have a value or value type\',\n\tstatus : Boolean = value <> null or valueType <> null\n}.status' attribute_value_in_value_type='Tuple {\n\tmessage : String = \'Value  is not contained in ValueType in Attribute: \' + self.name,\n\tstatus : Boolean = (value\n\t\t\t\t\t<> null and valueType <> null) implies self.checkValue(value, false)\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface Attribute extends CDOObject {
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
	 * @see eu.paasage.camel.provider.ProviderPackage#getAttribute_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(SingleValue)
	 * @see eu.paasage.camel.provider.ProviderPackage#getAttribute_Value()
	 * @model containment="true"
	 * @generated
	 */
	SingleValue getValue();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Attribute#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SingleValue value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' reference.
	 * @see #setValueType(ValueType)
	 * @see eu.paasage.camel.provider.ProviderPackage#getAttribute_ValueType()
	 * @model
	 * @generated
	 */
	ValueType getValueType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Attribute#getValueType <em>Value Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(ValueType value);

	/**
	 * Returns the value of the '<em><b>Unit Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.unit.UnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Type</em>' attribute.
	 * @see eu.paasage.camel.unit.UnitType
	 * @see #setUnitType(UnitType)
	 * @see eu.paasage.camel.provider.ProviderPackage#getAttribute_UnitType()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='OptimizationRequirement' unique='false' upper='*'"
	 * @generated
	 */
	UnitType getUnitType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Attribute#getUnitType <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Type</em>' attribute.
	 * @see eu.paasage.camel.unit.UnitType
	 * @see #getUnitType()
	 * @generated
	 */
	void setUnitType(UnitType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model vRequired="true" diffRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if (self.valueType <> null)\n\t\t\t\t\t\tthen if (self.valueType.oclIsTypeOf(camel::type::Range))\n\t\t\t\t\t\t\tthen if (v.oclIsTypeOf(camel::type::BoolValue) or v.oclIsTypeOf(camel::type::StringsValue))\n\t\t\t\t\t\t\t\tthen false\n\t\t\t\t\t\t\t\telse if (v.oclIsTypeOf(camel::type::IntegerValue))\n\t\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::Range).includesValue(v.oclAsType(camel::type::IntegerValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\telse if (v.oclIsTypeOf(camel::type::FloatsValue))\n\t\t\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::Range).includesValue(v.oclAsType(camel::type::FloatsValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::Range).includesValue(v.oclAsType(camel::type::DoublePrecisionValue).value)\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (self.valueType.oclIsTypeOf(camel::type::RangeUnion))\n\t\t\t\t\t\t\t\tthen if (v.oclIsTypeOf(camel::type::BoolValue) or v.oclIsTypeOf(camel::type::StringsValue))\n\t\t\t\t\t\t\t\t\tthen false\n\t\t\t\t\t\t\t\t\telse if (v.oclIsTypeOf(camel::type::IntegerValue))\n\t\t\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::RangeUnion).includesValue(v.oclAsType(camel::type::IntegerValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\t\telse if (v.oclIsTypeOf(camel::type::FloatsValue))\n\t\t\t\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::RangeUnion).includesValue(v.oclAsType(camel::type::FloatsValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::RangeUnion).includesValue(v.oclAsType(camel::type::DoublePrecisionValue).value)\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse if (self.valueType.oclIsTypeOf(camel::type::List))\n\t\t\t\t\t\t\t\t\tthen (self.valueType.oclAsType(camel::type::List).checkValueType(v) and\n\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::List).includesValue(v))\n\t\t\t\t\t\t\t\t\telse if (self.valueType.oclIsTypeOf(camel::type::Enumeration) and v.oclIsTypeOf(camel::type::StringsValue))\n\t\t\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::Enumeration).includesName(v.oclAsType(camel::type::StringsValue).value)\n\t\t\t\t\t\t\t\t\t\telse if (self.valueType.oclIsTypeOf(camel::type::Enumeration) and v.oclIsTypeOf(camel::type::EnumerateValue))\n\t\t\t\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\t\t\t\t(self.valueType.oclAsType(camel::type::Enumeration).includesName(v.oclAsType(camel::type::EnumerateValue).name)\n\t\t\t\t\t\t\t\t\t\t\t\tand\n\t\t\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::Enumeration).includesValue(v.oclAsType(camel::type::EnumerateValue).value))\n\t\t\t\t\t\t\t\t\t\t\telse if (self.valueType.oclIsTypeOf(camel::type::StringValueType))\n\t\t\t\t\t\t\t\t\t\t\t\tthen v.oclIsTypeOf(camel::type::StringsValue)\n\t\t\t\t\t\t\t\t\t\t\t\telse if (self.valueType.oclIsTypeOf(camel::type::BooleanValueType))\n\t\t\t\t\t\t\t\t\t\t\t\t\tthen v.oclIsTypeOf(camel::type::BoolValue)\n\t\t\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse if (diff and self.value <> null)\n\t\t\t\t\t\t\tthen self.value.valueEquals(v)\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean checkValue(SingleValue v, boolean diff);

} // Attribute
