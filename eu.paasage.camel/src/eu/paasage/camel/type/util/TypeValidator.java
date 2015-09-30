/**
 */
package eu.paasage.camel.type.util;

import eu.paasage.camel.type.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.type.TypePackage
 * @generated
 */
public class TypeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TypeValidator INSTANCE = new TypeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eu.paasage.camel.type";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TypePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TypePackage.TYPE_MODEL:
				return validateTypeModel((TypeModel)value, diagnostics, context);
			case TypePackage.LIMIT:
				return validateLimit((Limit)value, diagnostics, context);
			case TypePackage.SINGLE_VALUE:
				return validateSingleValue((SingleValue)value, diagnostics, context);
			case TypePackage.BOOL_VALUE:
				return validateBoolValue((BoolValue)value, diagnostics, context);
			case TypePackage.ENUMERATE_VALUE:
				return validateEnumerateValue((EnumerateValue)value, diagnostics, context);
			case TypePackage.NUMERIC_VALUE:
				return validateNumericValue((NumericValue)value, diagnostics, context);
			case TypePackage.INTEGER_VALUE:
				return validateIntegerValue((IntegerValue)value, diagnostics, context);
			case TypePackage.FLOATS_VALUE:
				return validateFloatsValue((FloatsValue)value, diagnostics, context);
			case TypePackage.DOUBLE_PRECISION_VALUE:
				return validateDoublePrecisionValue((DoublePrecisionValue)value, diagnostics, context);
			case TypePackage.NEGATIVE_INF:
				return validateNegativeInf((NegativeInf)value, diagnostics, context);
			case TypePackage.POSITIVE_INF:
				return validatePositiveInf((PositiveInf)value, diagnostics, context);
			case TypePackage.VALUE_TO_INCREASE:
				return validateValueToIncrease((ValueToIncrease)value, diagnostics, context);
			case TypePackage.STRINGS_VALUE:
				return validateStringsValue((StringsValue)value, diagnostics, context);
			case TypePackage.VALUE_TYPE:
				return validateValueType((ValueType)value, diagnostics, context);
			case TypePackage.BOOLEAN_VALUE_TYPE:
				return validateBooleanValueType((BooleanValueType)value, diagnostics, context);
			case TypePackage.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			case TypePackage.LIST:
				return validateList((List)value, diagnostics, context);
			case TypePackage.RANGE:
				return validateRange((Range)value, diagnostics, context);
			case TypePackage.RANGE_UNION:
				return validateRangeUnion((RangeUnion)value, diagnostics, context);
			case TypePackage.STRING_VALUE_TYPE:
				return validateStringValueType((StringValueType)value, diagnostics, context);
			case TypePackage.TYPE_ENUM:
				return validateTypeEnum((TypeEnum)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeModel(TypeModel typeModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)typeModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLimit(Limit limit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)limit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleValue(SingleValue singleValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)singleValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolValue(BoolValue boolValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)boolValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerateValue(EnumerateValue enumerateValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)enumerateValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericValue(NumericValue numericValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)numericValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerValue(IntegerValue integerValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)integerValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatsValue(FloatsValue floatsValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)floatsValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoublePrecisionValue(DoublePrecisionValue doublePrecisionValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)doublePrecisionValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegativeInf(NegativeInf negativeInf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)negativeInf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveInf(PositiveInf positiveInf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)positiveInf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueToIncrease(ValueToIncrease valueToIncrease, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)valueToIncrease, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringsValue(StringsValue stringsValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)stringsValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType(ValueType valueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)valueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanValueType(BooleanValueType booleanValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)booleanValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)enumeration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumeration_enumeration_all_values_diff(enumeration, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the enumeration_all_values_diff constraint of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENUMERATION__ENUMERATION_ALL_VALUES_DIFF__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Enumeration: ' + self.toString() +\n" +
		"\t\t\t\t\t' has two or more members which have either the same name or the same value',\n" +
		"\tstatus : Boolean = values\n" +
		"\t\t\t\t\t->forAll(p1, p2 | p1 <> p2 implies (p1.name <> p2.name and p1.value <> p2.value))\n" +
		"}.status";

	/**
	 * Validates the enumeration_all_values_diff constraint of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration_enumeration_all_values_diff(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TypePackage.Literals.ENUMERATION,
				 enumeration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "enumeration_all_values_diff",
				 ENUMERATION__ENUMERATION_ALL_VALUES_DIFF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)list, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)list, diagnostics, context);
		if (result || diagnostics != null) result &= validateList_list_must_have_type(list, diagnostics, context);
		if (result || diagnostics != null) result &= validateList_all_list_values_correct_type(list, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the list_must_have_type constraint of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LIST__LIST_MUST_HAVE_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'List:' + self.toString() +\n" +
		"\t\t\t\t\t' should either have a primitive or a normal type of values',\n" +
		"\tstatus : Boolean = (primitiveType <> null and type = null) or (type <>\n" +
		"\t\t\t\t\tnull and primitiveType = null)\n" +
		"}.status";

	/**
	 * Validates the list_must_have_type constraint of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList_list_must_have_type(List list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TypePackage.Literals.LIST,
				 list,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "list_must_have_type",
				 LIST__LIST_MUST_HAVE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the all_list_values_correct_type constraint of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LIST__ALL_LIST_VALUES_CORRECT_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'List: ' + self.toString() +\n" +
		"\t\t\t\t\t' has one or more values that do not conform to its value type',\n" +
		"\tstatus : Boolean = values\n" +
		"\t\t\t\t\t->forAll(p | self.checkValueType(p))\n" +
		"}.status";

	/**
	 * Validates the all_list_values_correct_type constraint of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList_all_list_values_correct_type(List list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TypePackage.Literals.LIST,
				 list,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "all_list_values_correct_type",
				 LIST__ALL_LIST_VALUES_CORRECT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRange(Range range, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)range, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)range, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)range, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)range, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)range, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)range, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)range, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)range, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)range, diagnostics, context);
		if (result || diagnostics != null) result &= validateRange_correct_range_type(range, diagnostics, context);
		if (result || diagnostics != null) result &= validateRange_enforce_correct_range_type(range, diagnostics, context);
		if (result || diagnostics != null) result &= validateRange_range_low_less_than_upper(range, diagnostics, context);
		if (result || diagnostics != null) result &= validateRange_range_infs_at_appropriate_pos(range, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the correct_range_type constraint of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE__CORRECT_RANGE_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Range: ' + self.toString() + ' has a non-numeric primitiveType: ' +\n" +
		"\t\t\t\t\tprimitiveType.toString(),\n" +
		"\tstatus : Boolean = (primitiveType = TypeEnum::IntType) or (primitiveType = TypeEnum::FloatType) or\n" +
		"\t\t\t\t\t(primitiveType = TypeEnum::DoubleType)\n" +
		"}.status";

	/**
	 * Validates the correct_range_type constraint of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRange_correct_range_type(Range range, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TypePackage.Literals.RANGE,
				 range,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correct_range_type",
				 RANGE__CORRECT_RANGE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the enforce_correct_range_type constraint of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE__ENFORCE_CORRECT_RANGE_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Range: ' + self.toString() +\n" +
		"\t\t\t\t\t' has either its low or upper limit not conforming to its primitive type',\n" +
		"\tstatus : Boolean = self.checkType(self.lowerLimit,\n" +
		"\t\t\t\t\t\tprimitiveType, true) and self.checkType(self.upperLimit, primitiveType, false)\n" +
		"}.status";

	/**
	 * Validates the enforce_correct_range_type constraint of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRange_enforce_correct_range_type(Range range, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TypePackage.Literals.RANGE,
				 range,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "enforce_correct_range_type",
				 RANGE__ENFORCE_CORRECT_RANGE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the range_low_less_than_upper constraint of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE__RANGE_LOW_LESS_THAN_UPPER__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Range: ' + self.toString() +\n" +
		"\t\t\t\t\t' has its lower limit greater than the upper',\n" +
		"\tstatus : Boolean = if (not (lowerLimit.value.oclIsTypeOf(NegativeInf)) and not\n" +
		"\t\t\t\t\t\t(upperLimit.value.oclIsTypeOf(PositiveInf)))\n" +
		"\t\t\t\t\tthen if (primitiveType = TypeEnum::IntType)\n" +
		"\t\t\t\t\t\tthen if (not (upperLimit.included) and not (lowerLimit.included))\n" +
		"\t\t\t\t\t\t\tthen (upperLimit.value.oclAsType(IntegerValue).value -\n" +
		"\t\t\t\t\t\t\t\tlowerLimit.value.oclAsType(IntegerValue).value.oclAsType(ecore::EInt)) >= 2\n" +
		"\t\t\t\t\t\t\telse if (upperLimit.included)\n" +
		"\t\t\t\t\t\t\t\tthen lowerLimit.value.oclAsType(IntegerValue).value.oclAsType(ecore::EInt) <=\n" +
		"\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(IntegerValue).value\n" +
		"\t\t\t\t\t\t\t\telse lowerLimit.value.oclAsType(IntegerValue).value.oclAsType(ecore::EInt) <\n" +
		"\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(IntegerValue).value\n" +
		"\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\telse (if (primitiveType = TypeEnum::FloatType)\n" +
		"\t\t\t\t\t\t\tthen if (upperLimit.included)\n" +
		"\t\t\t\t\t\t\t\tthen lowerLimit.value.oclAsType(FloatsValue).value.oclAsType(ecore::EFloat) <=\n" +
		"\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(FloatsValue).value\n" +
		"\t\t\t\t\t\t\t\telse lowerLimit.value.oclAsType(FloatsValue).value.oclAsType(ecore::EFloat) <\n" +
		"\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(FloatsValue).value\n" +
		"\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\telse if (upperLimit.included)\n" +
		"\t\t\t\t\t\t\t\tthen lowerLimit.value.oclAsType(DoublePrecisionValue).value.oclAsType(ecore::EDouble) <=\n" +
		"\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(DoublePrecisionValue).value\n" +
		"\t\t\t\t\t\t\t\telse lowerLimit.value.oclAsType(DoublePrecisionValue).value.oclAsType(ecore::EDouble) <\n" +
		"\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(DoublePrecisionValue).value\n" +
		"\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\tendif)\n" +
		"\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif\n" +
		"}.status";

	/**
	 * Validates the range_low_less_than_upper constraint of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRange_range_low_less_than_upper(Range range, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TypePackage.Literals.RANGE,
				 range,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "range_low_less_than_upper",
				 RANGE__RANGE_LOW_LESS_THAN_UPPER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the range_infs_at_appropriate_pos constraint of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE__RANGE_INFS_AT_APPROPRIATE_POS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Range: ' + self.toString() +\n" +
		"\t\t\t\t\t' has a PositiveInf value for its lower limit or a NegativeInf value for its upper limit',\n" +
		"\tstatus : Boolean = not\n" +
		"\t\t\t\t\t(lowerLimit.value.oclIsTypeOf(PositiveInf) or upperLimit.value.oclIsTypeOf(NegativeInf))\n" +
		"}.status";

	/**
	 * Validates the range_infs_at_appropriate_pos constraint of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRange_range_infs_at_appropriate_pos(Range range, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TypePackage.Literals.RANGE,
				 range,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "range_infs_at_appropriate_pos",
				 RANGE__RANGE_INFS_AT_APPROPRIATE_POS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeUnion(RangeUnion rangeUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)rangeUnion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)rangeUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)rangeUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)rangeUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)rangeUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)rangeUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)rangeUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)rangeUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)rangeUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeUnion_same_primitive_types_in_union_ranges(rangeUnion, diagnostics, context);
		if (result || diagnostics != null) result &= validateRangeUnion_correct_range_union_sequence(rangeUnion, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the same_primitive_types_in_union_ranges constraint of '<em>Range Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_UNION__SAME_PRIMITIVE_TYPES_IN_UNION_RANGES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'RangeUnion: ' + self.name +\n" +
		"\t\t\t\t\t' has one or more ranges with a different primitive type',\n" +
		"\tstatus : Boolean = self.ranges\n" +
		"\t\t\t\t\t->forAll(p | p.primitiveType = self.primitiveType)\n" +
		"}.status";

	/**
	 * Validates the same_primitive_types_in_union_ranges constraint of '<em>Range Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeUnion_same_primitive_types_in_union_ranges(RangeUnion rangeUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TypePackage.Literals.RANGE_UNION,
				 rangeUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "same_primitive_types_in_union_ranges",
				 RANGE_UNION__SAME_PRIMITIVE_TYPES_IN_UNION_RANGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the correct_range_union_sequence constraint of '<em>Range Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_UNION__CORRECT_RANGE_UNION_SEQUENCE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'RangeUnion: ' + self.name +\n" +
		"\t\t\t\t\t' has a wrong sequence of ranges. This means that two or more ranges are conflicting',\n" +
		"\tstatus : Boolean = not\n" +
		"\t\t\t\t\t(invalidRangeSequence(self))\n" +
		"}.status";

	/**
	 * Validates the correct_range_union_sequence constraint of '<em>Range Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeUnion_correct_range_union_sequence(RangeUnion rangeUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TypePackage.Literals.RANGE_UNION,
				 rangeUnion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correct_range_union_sequence",
				 RANGE_UNION__CORRECT_RANGE_UNION_SEQUENCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringValueType(StringValueType stringValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)stringValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeEnum(TypeEnum typeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TypeValidator
