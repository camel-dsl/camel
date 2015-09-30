/**
 */
package eu.paasage.camel.type;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see eu.paasage.camel.type.TypePackage#getSingleValue()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface SingleValue extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model vRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if (self.oclIsTypeOf(IntegerValue) and v.oclIsTypeOf(IntegerValue))\n\t\t\t\t\t\tthen self.oclAsType(IntegerValue).value = v.oclAsType(IntegerValue).value\n\t\t\t\t\t\telse if (self.oclIsTypeOf(FloatsValue) and v.oclIsTypeOf(FloatsValue))\n\t\t\t\t\t\t\tthen self.oclAsType(FloatsValue).value = v.oclAsType(FloatsValue).value\n\t\t\t\t\t\t\telse if (self.oclIsTypeOf(DoublePrecisionValue) and v.oclIsTypeOf(DoublePrecisionValue))\n\t\t\t\t\t\t\t\tthen self.oclAsType(DoublePrecisionValue).value = v.oclAsType(DoublePrecisionValue).value\n\t\t\t\t\t\t\t\telse if (self.oclIsTypeOf(StringsValue) and v.oclIsTypeOf(StringsValue))\n\t\t\t\t\t\t\t\t\tthen self.oclAsType(StringsValue).value = v.oclAsType(StringsValue).value\n\t\t\t\t\t\t\t\t\telse if (self.oclIsTypeOf(BoolValue) and v.oclIsTypeOf(BoolValue))\n\t\t\t\t\t\t\t\t\t\tthen self.oclAsType(BoolValue).value = v.oclAsType(BoolValue).value\n\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean valueEquals(SingleValue v);

} // SingleValue
