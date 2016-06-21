/**
 */
package eu.paasage.camel.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Union</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.type.RangeUnion#getRanges <em>Ranges</em>}</li>
 *   <li>{@link eu.paasage.camel.type.RangeUnion#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.type.TypePackage#getRangeUnion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='same_primitive_types_in_union_ranges correct_range_union_sequence'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot same_primitive_types_in_union_ranges='Tuple {\n\tmessage : String = \'RangeUnion: \' + self.name +\n\t\t\t\t\t\' has one or more ranges with a different primitive type\',\n\tstatus : Boolean = self.ranges\n\t\t\t\t\t->forAll(p | p.primitiveType = self.primitiveType)\n}.status' correct_range_union_sequence='Tuple {\n\tmessage : String = \'RangeUnion: \' + self.name +\n\t\t\t\t\t\' has a wrong sequence of ranges. This means that two or more ranges are conflicting\',\n\tstatus : Boolean = not\n\t\t\t\t\t(invalidRangeSequence(self))\n}.status'"
 * @generated
 */
public interface RangeUnion extends ValueType {
	/**
	 * Returns the value of the '<em><b>Ranges</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.type.Range}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranges</em>' containment reference list.
	 * @see eu.paasage.camel.type.TypePackage#getRangeUnion_Ranges()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Range> getRanges();

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
	 * @see eu.paasage.camel.type.TypePackage#getRangeUnion_PrimitiveType()
	 * @model required="true"
	 * @generated
	 */
	TypeEnum getPrimitiveType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.type.RangeUnion#getPrimitiveType <em>Primitive Type</em>}' attribute.
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
	 * @model nRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='ranges\n\t\t\t\t\t\t->exists(p | p.includesValue(n))'"
	 * @generated
	 */
	boolean includesValue(double n);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ruRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList<Range> ranges = ru.getRanges();\r\n\t\tRange prev = ranges.get(0);\r\n\t\tfor (int i = 1; i < ranges.size(); i++){\r\n\t\t\tRange next = ranges.get(i);\r\n\t\t\teu.paasage.camel.type.Limit lowerLimit = prev.getUpperLimit();\r\n\t\t\teu.paasage.camel.type.Limit upperLimit = next.getLowerLimit();\r\n\t\t\tboolean lowerInclusive = lowerLimit.isIncluded();\r\n\t\t\tboolean upperInclusive = upperLimit.isIncluded();\r\n\t\t\tif (!(lowerLimit instanceof eu.paasage.camel.type.NegativeInf) && !(upperLimit instanceof eu.paasage.camel.type.PositiveInf)){\r\n\t\t\t\tdouble low = 0.0, upper = 0.0;\r\n\t\t\t\t//Checking if already at end (positive infinity or next range starts with negative infinity\r\n\t\t\t\teu.paasage.camel.type.NumericValue prevVal = lowerLimit.getValue();\r\n\t\t\t\tif (prevVal instanceof eu.paasage.camel.type.PositiveInf) return Boolean.TRUE;\r\n\t\t\t\teu.paasage.camel.type.NumericValue nextVal = upperLimit.getValue();\r\n\t\t\t\tif (nextVal instanceof eu.paasage.camel.type.NegativeInf) return Boolean.TRUE;\r\n\t\t\t\t//Checking now that low is less or equal to upper\r\n\t\t\t\tif (prevVal instanceof eu.paasage.camel.type.IntegerValue){\r\n\t\t\t\t\tlow = ((eu.paasage.camel.type.IntegerValue)prevVal).getValue();\r\n\t\t\t\t\tif (!lowerInclusive){\r\n\t\t\t\t\t\tlow = low -1;\r\n\t\t\t\t\t\tlowerInclusive = true;\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t\telse if (prevVal instanceof eu.paasage.camel.type.FloatsValue) low = ((eu.paasage.camel.type.FloatsValue)prevVal).getValue();\r\n\t\t\t\telse low = ((eu.paasage.camel.type.DoublePrecisionValue)prevVal).getValue();\r\n\t\t\t\tif (nextVal instanceof eu.paasage.camel.type.IntegerValue){\r\n\t\t\t\t\tupper = ((eu.paasage.camel.type.IntegerValue)nextVal).getValue();\r\n\t\t\t\t\tif (!upperInclusive){\r\n\t\t\t\t\t\tupper = upper + 1;\r\n\t\t\t\t\t\tupperInclusive = true;\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t\telse if (nextVal instanceof eu.paasage.camel.type.FloatsValue) upper = ((eu.paasage.camel.type.FloatsValue)nextVal).getValue();\r\n\t\t\t\telse upper = ((eu.paasage.camel.type.DoublePrecisionValue)nextVal).getValue();\r\n\t\t\t\tSystem.out.println(\"Low is: \" + low + \" upper is: \" + upper);\r\n\t\t\t\tif (low > upper || (low == upper && lowerInclusive == true )) return Boolean.TRUE;\r\n\t\t\t}\r\n\t\t\tprev = next;\r\n\t\t}\r\n\t\treturn Boolean.FALSE;'"
	 * @generated
	 */
	boolean invalidRangeSequence(RangeUnion ru);

} // RangeUnion
