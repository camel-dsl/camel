/**
 */
package eu.paasage.camel.type.util;

import eu.paasage.camel.Model;

import eu.paasage.camel.type.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.type.TypePackage
 * @generated
 */
public class TypeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSwitch() {
		if (modelPackage == null) {
			modelPackage = TypePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TypePackage.TYPE_MODEL: {
				TypeModel typeModel = (TypeModel)theEObject;
				T result = caseTypeModel(typeModel);
				if (result == null) result = caseModel(typeModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.LIMIT: {
				Limit limit = (Limit)theEObject;
				T result = caseLimit(limit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.SINGLE_VALUE: {
				SingleValue singleValue = (SingleValue)theEObject;
				T result = caseSingleValue(singleValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.BOOL_VALUE: {
				BoolValue boolValue = (BoolValue)theEObject;
				T result = caseBoolValue(boolValue);
				if (result == null) result = caseSingleValue(boolValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.ENUMERATE_VALUE: {
				EnumerateValue enumerateValue = (EnumerateValue)theEObject;
				T result = caseEnumerateValue(enumerateValue);
				if (result == null) result = caseSingleValue(enumerateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.NUMERIC_VALUE: {
				NumericValue numericValue = (NumericValue)theEObject;
				T result = caseNumericValue(numericValue);
				if (result == null) result = caseSingleValue(numericValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.INTEGER_VALUE: {
				IntegerValue integerValue = (IntegerValue)theEObject;
				T result = caseIntegerValue(integerValue);
				if (result == null) result = caseNumericValue(integerValue);
				if (result == null) result = caseSingleValue(integerValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.FLOATS_VALUE: {
				FloatsValue floatsValue = (FloatsValue)theEObject;
				T result = caseFloatsValue(floatsValue);
				if (result == null) result = caseNumericValue(floatsValue);
				if (result == null) result = caseSingleValue(floatsValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.DOUBLE_PRECISION_VALUE: {
				DoublePrecisionValue doublePrecisionValue = (DoublePrecisionValue)theEObject;
				T result = caseDoublePrecisionValue(doublePrecisionValue);
				if (result == null) result = caseNumericValue(doublePrecisionValue);
				if (result == null) result = caseSingleValue(doublePrecisionValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.NEGATIVE_INF: {
				NegativeInf negativeInf = (NegativeInf)theEObject;
				T result = caseNegativeInf(negativeInf);
				if (result == null) result = caseNumericValue(negativeInf);
				if (result == null) result = caseSingleValue(negativeInf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.POSITIVE_INF: {
				PositiveInf positiveInf = (PositiveInf)theEObject;
				T result = casePositiveInf(positiveInf);
				if (result == null) result = caseNumericValue(positiveInf);
				if (result == null) result = caseSingleValue(positiveInf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.VALUE_TO_INCREASE: {
				ValueToIncrease valueToIncrease = (ValueToIncrease)theEObject;
				T result = caseValueToIncrease(valueToIncrease);
				if (result == null) result = caseNumericValue(valueToIncrease);
				if (result == null) result = caseSingleValue(valueToIncrease);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.STRINGS_VALUE: {
				StringsValue stringsValue = (StringsValue)theEObject;
				T result = caseStringsValue(stringsValue);
				if (result == null) result = caseSingleValue(stringsValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.BOOLEAN_VALUE_TYPE: {
				BooleanValueType booleanValueType = (BooleanValueType)theEObject;
				T result = caseBooleanValueType(booleanValueType);
				if (result == null) result = caseValueType(booleanValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseValueType(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.LIST: {
				List list = (List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseValueType(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.RANGE: {
				Range range = (Range)theEObject;
				T result = caseRange(range);
				if (result == null) result = caseValueType(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.RANGE_UNION: {
				RangeUnion rangeUnion = (RangeUnion)theEObject;
				T result = caseRangeUnion(rangeUnion);
				if (result == null) result = caseValueType(rangeUnion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.STRING_VALUE_TYPE: {
				StringValueType stringValueType = (StringValueType)theEObject;
				T result = caseStringValueType(stringValueType);
				if (result == null) result = caseValueType(stringValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeModel(TypeModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimit(Limit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleValue(SingleValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolValue(BoolValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerate Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerate Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerateValue(EnumerateValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericValue(NumericValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue(IntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floats Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floats Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatsValue(FloatsValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Precision Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Precision Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoublePrecisionValue(DoublePrecisionValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Inf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Inf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeInf(NegativeInf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Inf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Inf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveInf(PositiveInf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value To Increase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value To Increase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueToIncrease(ValueToIncrease object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strings Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strings Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringsValue(StringsValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValueType(BooleanValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRange(Range object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Union</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeUnion(RangeUnion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValueType(StringValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TypeSwitch
