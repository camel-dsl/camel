/**
 */
package eu.paasage.camel.type;

import eu.paasage.camel.CamelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.type.TypeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface TypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "type";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.paasage.eu/2015/06/camel/type";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "type";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypePackage eINSTANCE = eu.paasage.camel.type.impl.TypePackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.TypeModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.TypeModelImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getTypeModel()
	 * @generated
	 */
	int TYPE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__NAME = CamelPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__IMPORT_URI = CamelPackage.MODEL__IMPORT_URI;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__DATA_TYPES = CamelPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__VALUES = CamelPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL_FEATURE_COUNT = CamelPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL_OPERATION_COUNT = CamelPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.LimitImpl <em>Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.LimitImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getLimit()
	 * @generated
	 */
	int LIMIT = 1;

	/**
	 * The feature id for the '<em><b>Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__INCLUDED = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.SingleValueImpl <em>Single Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.SingleValueImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getSingleValue()
	 * @generated
	 */
	int SINGLE_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Single Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Value Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE___VALUE_EQUALS__SINGLEVALUE = 0;

	/**
	 * The number of operations of the '<em>Single Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.BoolValueImpl <em>Bool Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.BoolValueImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getBoolValue()
	 * @generated
	 */
	int BOOL_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE__VALUE = SINGLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE_FEATURE_COUNT = SINGLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Value Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE___VALUE_EQUALS__SINGLEVALUE = SINGLE_VALUE___VALUE_EQUALS__SINGLEVALUE;

	/**
	 * The number of operations of the '<em>Bool Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE_OPERATION_COUNT = SINGLE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.EnumerateValueImpl <em>Enumerate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.EnumerateValueImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getEnumerateValue()
	 * @generated
	 */
	int ENUMERATE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATE_VALUE__NAME = SINGLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATE_VALUE__VALUE = SINGLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumerate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATE_VALUE_FEATURE_COUNT = SINGLE_VALUE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Value Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATE_VALUE___VALUE_EQUALS__SINGLEVALUE = SINGLE_VALUE___VALUE_EQUALS__SINGLEVALUE;

	/**
	 * The number of operations of the '<em>Enumerate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATE_VALUE_OPERATION_COUNT = SINGLE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.NumericValueImpl <em>Numeric Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.NumericValueImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getNumericValue()
	 * @generated
	 */
	int NUMERIC_VALUE = 5;

	/**
	 * The number of structural features of the '<em>Numeric Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE_FEATURE_COUNT = SINGLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Value Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE___VALUE_EQUALS__SINGLEVALUE = SINGLE_VALUE___VALUE_EQUALS__SINGLEVALUE;

	/**
	 * The number of operations of the '<em>Numeric Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE_OPERATION_COUNT = SINGLE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.IntegerValueImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = NUMERIC_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = NUMERIC_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Value Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE___VALUE_EQUALS__SINGLEVALUE = NUMERIC_VALUE___VALUE_EQUALS__SINGLEVALUE;

	/**
	 * The number of operations of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_OPERATION_COUNT = NUMERIC_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.FloatsValueImpl <em>Floats Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.FloatsValueImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getFloatsValue()
	 * @generated
	 */
	int FLOATS_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATS_VALUE__VALUE = NUMERIC_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Floats Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATS_VALUE_FEATURE_COUNT = NUMERIC_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Value Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATS_VALUE___VALUE_EQUALS__SINGLEVALUE = NUMERIC_VALUE___VALUE_EQUALS__SINGLEVALUE;

	/**
	 * The number of operations of the '<em>Floats Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATS_VALUE_OPERATION_COUNT = NUMERIC_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.DoublePrecisionValueImpl <em>Double Precision Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.DoublePrecisionValueImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getDoublePrecisionValue()
	 * @generated
	 */
	int DOUBLE_PRECISION_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PRECISION_VALUE__VALUE = NUMERIC_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Precision Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PRECISION_VALUE_FEATURE_COUNT = NUMERIC_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Value Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PRECISION_VALUE___VALUE_EQUALS__SINGLEVALUE = NUMERIC_VALUE___VALUE_EQUALS__SINGLEVALUE;

	/**
	 * The number of operations of the '<em>Double Precision Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PRECISION_VALUE_OPERATION_COUNT = NUMERIC_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.NegativeInfImpl <em>Negative Inf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.NegativeInfImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getNegativeInf()
	 * @generated
	 */
	int NEGATIVE_INF = 9;

	/**
	 * The number of structural features of the '<em>Negative Inf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_INF_FEATURE_COUNT = NUMERIC_VALUE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Value Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_INF___VALUE_EQUALS__SINGLEVALUE = NUMERIC_VALUE___VALUE_EQUALS__SINGLEVALUE;

	/**
	 * The number of operations of the '<em>Negative Inf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_INF_OPERATION_COUNT = NUMERIC_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.PositiveInfImpl <em>Positive Inf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.PositiveInfImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getPositiveInf()
	 * @generated
	 */
	int POSITIVE_INF = 10;

	/**
	 * The number of structural features of the '<em>Positive Inf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INF_FEATURE_COUNT = NUMERIC_VALUE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Value Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INF___VALUE_EQUALS__SINGLEVALUE = NUMERIC_VALUE___VALUE_EQUALS__SINGLEVALUE;

	/**
	 * The number of operations of the '<em>Positive Inf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INF_OPERATION_COUNT = NUMERIC_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.ValueToIncreaseImpl <em>Value To Increase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.ValueToIncreaseImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getValueToIncrease()
	 * @generated
	 */
	int VALUE_TO_INCREASE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TO_INCREASE__VALUE = NUMERIC_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value To Increase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TO_INCREASE_FEATURE_COUNT = NUMERIC_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Value Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TO_INCREASE___VALUE_EQUALS__SINGLEVALUE = NUMERIC_VALUE___VALUE_EQUALS__SINGLEVALUE;

	/**
	 * The number of operations of the '<em>Value To Increase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TO_INCREASE_OPERATION_COUNT = NUMERIC_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.StringsValueImpl <em>Strings Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.StringsValueImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getStringsValue()
	 * @generated
	 */
	int STRINGS_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS_VALUE__VALUE = SINGLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strings Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS_VALUE_FEATURE_COUNT = SINGLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Value Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS_VALUE___VALUE_EQUALS__SINGLEVALUE = SINGLE_VALUE___VALUE_EQUALS__SINGLEVALUE;

	/**
	 * The number of operations of the '<em>Strings Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS_VALUE_OPERATION_COUNT = SINGLE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.ValueTypeImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.BooleanValueTypeImpl <em>Boolean Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.BooleanValueTypeImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getBooleanValueType()
	 * @generated
	 */
	int BOOLEAN_VALUE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE__PRIMITIVE_TYPE = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.EnumerationImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__VALUES = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Includes Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___INCLUDES_NAME__STRING = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Includes Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___INCLUDES_VALUE__INT = VALUE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.ListImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getList()
	 * @generated
	 */
	int LIST = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VALUES = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__PRIMITIVE_TYPE = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__TYPE = VALUE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Includes Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___INCLUDES_VALUE__SINGLEVALUE = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Value Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___CHECK_VALUE_TYPE__SINGLEVALUE = VALUE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.RangeImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Lower Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__LOWER_LIMIT = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__UPPER_LIMIT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__PRIMITIVE_TYPE = VALUE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Check Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE___CHECK_TYPE__LIMIT_TYPEENUM_BOOLEAN = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Includes Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE___INCLUDES_VALUE__DOUBLE = VALUE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.RangeUnionImpl <em>Range Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.RangeUnionImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getRangeUnion()
	 * @generated
	 */
	int RANGE_UNION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_UNION__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_UNION__RANGES = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_UNION__PRIMITIVE_TYPE = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_UNION_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Includes Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_UNION___INCLUDES_VALUE__DOUBLE = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Invalid Range Sequence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_UNION___INVALID_RANGE_SEQUENCE__RANGEUNION = VALUE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Range Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_UNION_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.impl.StringValueTypeImpl <em>String Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.impl.StringValueTypeImpl
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getStringValueType()
	 * @generated
	 */
	int STRING_VALUE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_TYPE__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_TYPE__PRIMITIVE_TYPE = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_TYPE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_TYPE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.type.TypeEnum <em>Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.type.TypeEnum
	 * @see eu.paasage.camel.type.impl.TypePackageImpl#getTypeEnum()
	 * @generated
	 */
	int TYPE_ENUM = 20;


	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.TypeModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see eu.paasage.camel.type.TypeModel
	 * @generated
	 */
	EClass getTypeModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.type.TypeModel#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see eu.paasage.camel.type.TypeModel#getDataTypes()
	 * @see #getTypeModel()
	 * @generated
	 */
	EReference getTypeModel_DataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.type.TypeModel#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see eu.paasage.camel.type.TypeModel#getValues()
	 * @see #getTypeModel()
	 * @generated
	 */
	EReference getTypeModel_Values();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.Limit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limit</em>'.
	 * @see eu.paasage.camel.type.Limit
	 * @generated
	 */
	EClass getLimit();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.type.Limit#isIncluded <em>Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Included</em>'.
	 * @see eu.paasage.camel.type.Limit#isIncluded()
	 * @see #getLimit()
	 * @generated
	 */
	EAttribute getLimit_Included();

	/**
	 * Returns the meta object for the containment reference '{@link eu.paasage.camel.type.Limit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see eu.paasage.camel.type.Limit#getValue()
	 * @see #getLimit()
	 * @generated
	 */
	EReference getLimit_Value();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.SingleValue <em>Single Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Value</em>'.
	 * @see eu.paasage.camel.type.SingleValue
	 * @generated
	 */
	EClass getSingleValue();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.type.SingleValue#valueEquals(eu.paasage.camel.type.SingleValue) <em>Value Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value Equals</em>' operation.
	 * @see eu.paasage.camel.type.SingleValue#valueEquals(eu.paasage.camel.type.SingleValue)
	 * @generated
	 */
	EOperation getSingleValue__ValueEquals__SingleValue();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.BoolValue <em>Bool Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Value</em>'.
	 * @see eu.paasage.camel.type.BoolValue
	 * @generated
	 */
	EClass getBoolValue();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.type.BoolValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.paasage.camel.type.BoolValue#isValue()
	 * @see #getBoolValue()
	 * @generated
	 */
	EAttribute getBoolValue_Value();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.EnumerateValue <em>Enumerate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerate Value</em>'.
	 * @see eu.paasage.camel.type.EnumerateValue
	 * @generated
	 */
	EClass getEnumerateValue();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.type.EnumerateValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.paasage.camel.type.EnumerateValue#getValue()
	 * @see #getEnumerateValue()
	 * @generated
	 */
	EAttribute getEnumerateValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.type.EnumerateValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.type.EnumerateValue#getName()
	 * @see #getEnumerateValue()
	 * @generated
	 */
	EAttribute getEnumerateValue_Name();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.NumericValue <em>Numeric Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Value</em>'.
	 * @see eu.paasage.camel.type.NumericValue
	 * @generated
	 */
	EClass getNumericValue();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see eu.paasage.camel.type.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.type.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.paasage.camel.type.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.FloatsValue <em>Floats Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floats Value</em>'.
	 * @see eu.paasage.camel.type.FloatsValue
	 * @generated
	 */
	EClass getFloatsValue();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.type.FloatsValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.paasage.camel.type.FloatsValue#getValue()
	 * @see #getFloatsValue()
	 * @generated
	 */
	EAttribute getFloatsValue_Value();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.DoublePrecisionValue <em>Double Precision Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Precision Value</em>'.
	 * @see eu.paasage.camel.type.DoublePrecisionValue
	 * @generated
	 */
	EClass getDoublePrecisionValue();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.type.DoublePrecisionValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.paasage.camel.type.DoublePrecisionValue#getValue()
	 * @see #getDoublePrecisionValue()
	 * @generated
	 */
	EAttribute getDoublePrecisionValue_Value();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.NegativeInf <em>Negative Inf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Inf</em>'.
	 * @see eu.paasage.camel.type.NegativeInf
	 * @generated
	 */
	EClass getNegativeInf();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.PositiveInf <em>Positive Inf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Inf</em>'.
	 * @see eu.paasage.camel.type.PositiveInf
	 * @generated
	 */
	EClass getPositiveInf();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.ValueToIncrease <em>Value To Increase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value To Increase</em>'.
	 * @see eu.paasage.camel.type.ValueToIncrease
	 * @generated
	 */
	EClass getValueToIncrease();

	/**
	 * Returns the meta object for the containment reference '{@link eu.paasage.camel.type.ValueToIncrease#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see eu.paasage.camel.type.ValueToIncrease#getValue()
	 * @see #getValueToIncrease()
	 * @generated
	 */
	EReference getValueToIncrease_Value();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.StringsValue <em>Strings Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strings Value</em>'.
	 * @see eu.paasage.camel.type.StringsValue
	 * @generated
	 */
	EClass getStringsValue();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.type.StringsValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.paasage.camel.type.StringsValue#getValue()
	 * @see #getStringsValue()
	 * @generated
	 */
	EAttribute getStringsValue_Value();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see eu.paasage.camel.type.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.type.ValueType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.type.ValueType#getName()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Name();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.BooleanValueType <em>Boolean Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value Type</em>'.
	 * @see eu.paasage.camel.type.BooleanValueType
	 * @generated
	 */
	EClass getBooleanValueType();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.type.BooleanValueType#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see eu.paasage.camel.type.BooleanValueType#getPrimitiveType()
	 * @see #getBooleanValueType()
	 * @generated
	 */
	EAttribute getBooleanValueType_PrimitiveType();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see eu.paasage.camel.type.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.type.Enumeration#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see eu.paasage.camel.type.Enumeration#getValues()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Values();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.type.Enumeration#includesName(java.lang.String) <em>Includes Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Includes Name</em>' operation.
	 * @see eu.paasage.camel.type.Enumeration#includesName(java.lang.String)
	 * @generated
	 */
	EOperation getEnumeration__IncludesName__String();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.type.Enumeration#includesValue(int) <em>Includes Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Includes Value</em>' operation.
	 * @see eu.paasage.camel.type.Enumeration#includesValue(int)
	 * @generated
	 */
	EOperation getEnumeration__IncludesValue__int();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see eu.paasage.camel.type.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.type.List#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see eu.paasage.camel.type.List#getValues()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Values();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.type.List#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see eu.paasage.camel.type.List#getPrimitiveType()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_PrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.type.List#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see eu.paasage.camel.type.List#getType()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Type();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.type.List#includesValue(eu.paasage.camel.type.SingleValue) <em>Includes Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Includes Value</em>' operation.
	 * @see eu.paasage.camel.type.List#includesValue(eu.paasage.camel.type.SingleValue)
	 * @generated
	 */
	EOperation getList__IncludesValue__SingleValue();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.type.List#checkValueType(eu.paasage.camel.type.SingleValue) <em>Check Value Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Value Type</em>' operation.
	 * @see eu.paasage.camel.type.List#checkValueType(eu.paasage.camel.type.SingleValue)
	 * @generated
	 */
	EOperation getList__CheckValueType__SingleValue();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see eu.paasage.camel.type.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the containment reference '{@link eu.paasage.camel.type.Range#getLowerLimit <em>Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Limit</em>'.
	 * @see eu.paasage.camel.type.Range#getLowerLimit()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_LowerLimit();

	/**
	 * Returns the meta object for the containment reference '{@link eu.paasage.camel.type.Range#getUpperLimit <em>Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Limit</em>'.
	 * @see eu.paasage.camel.type.Range#getUpperLimit()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_UpperLimit();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.type.Range#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see eu.paasage.camel.type.Range#getPrimitiveType()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_PrimitiveType();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.type.Range#checkType(eu.paasage.camel.type.Limit, eu.paasage.camel.type.TypeEnum, boolean) <em>Check Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Type</em>' operation.
	 * @see eu.paasage.camel.type.Range#checkType(eu.paasage.camel.type.Limit, eu.paasage.camel.type.TypeEnum, boolean)
	 * @generated
	 */
	EOperation getRange__CheckType__Limit_TypeEnum_boolean();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.type.Range#includesValue(double) <em>Includes Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Includes Value</em>' operation.
	 * @see eu.paasage.camel.type.Range#includesValue(double)
	 * @generated
	 */
	EOperation getRange__IncludesValue__double();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.RangeUnion <em>Range Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Union</em>'.
	 * @see eu.paasage.camel.type.RangeUnion
	 * @generated
	 */
	EClass getRangeUnion();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.type.RangeUnion#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ranges</em>'.
	 * @see eu.paasage.camel.type.RangeUnion#getRanges()
	 * @see #getRangeUnion()
	 * @generated
	 */
	EReference getRangeUnion_Ranges();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.type.RangeUnion#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see eu.paasage.camel.type.RangeUnion#getPrimitiveType()
	 * @see #getRangeUnion()
	 * @generated
	 */
	EAttribute getRangeUnion_PrimitiveType();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.type.RangeUnion#includesValue(double) <em>Includes Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Includes Value</em>' operation.
	 * @see eu.paasage.camel.type.RangeUnion#includesValue(double)
	 * @generated
	 */
	EOperation getRangeUnion__IncludesValue__double();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.type.RangeUnion#invalidRangeSequence(eu.paasage.camel.type.RangeUnion) <em>Invalid Range Sequence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invalid Range Sequence</em>' operation.
	 * @see eu.paasage.camel.type.RangeUnion#invalidRangeSequence(eu.paasage.camel.type.RangeUnion)
	 * @generated
	 */
	EOperation getRangeUnion__InvalidRangeSequence__RangeUnion();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.type.StringValueType <em>String Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value Type</em>'.
	 * @see eu.paasage.camel.type.StringValueType
	 * @generated
	 */
	EClass getStringValueType();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.type.StringValueType#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see eu.paasage.camel.type.StringValueType#getPrimitiveType()
	 * @see #getStringValueType()
	 * @generated
	 */
	EAttribute getStringValueType_PrimitiveType();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.type.TypeEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum</em>'.
	 * @see eu.paasage.camel.type.TypeEnum
	 * @generated
	 */
	EEnum getTypeEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypeFactory getTypeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.TypeModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.TypeModelImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getTypeModel()
		 * @generated
		 */
		EClass TYPE_MODEL = eINSTANCE.getTypeModel();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MODEL__DATA_TYPES = eINSTANCE.getTypeModel_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MODEL__VALUES = eINSTANCE.getTypeModel_Values();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.LimitImpl <em>Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.LimitImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getLimit()
		 * @generated
		 */
		EClass LIMIT = eINSTANCE.getLimit();

		/**
		 * The meta object literal for the '<em><b>Included</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMIT__INCLUDED = eINSTANCE.getLimit_Included();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIMIT__VALUE = eINSTANCE.getLimit_Value();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.SingleValueImpl <em>Single Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.SingleValueImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getSingleValue()
		 * @generated
		 */
		EClass SINGLE_VALUE = eINSTANCE.getSingleValue();

		/**
		 * The meta object literal for the '<em><b>Value Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SINGLE_VALUE___VALUE_EQUALS__SINGLEVALUE = eINSTANCE.getSingleValue__ValueEquals__SingleValue();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.BoolValueImpl <em>Bool Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.BoolValueImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getBoolValue()
		 * @generated
		 */
		EClass BOOL_VALUE = eINSTANCE.getBoolValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_VALUE__VALUE = eINSTANCE.getBoolValue_Value();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.EnumerateValueImpl <em>Enumerate Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.EnumerateValueImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getEnumerateValue()
		 * @generated
		 */
		EClass ENUMERATE_VALUE = eINSTANCE.getEnumerateValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATE_VALUE__VALUE = eINSTANCE.getEnumerateValue_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATE_VALUE__NAME = eINSTANCE.getEnumerateValue_Name();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.NumericValueImpl <em>Numeric Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.NumericValueImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getNumericValue()
		 * @generated
		 */
		EClass NUMERIC_VALUE = eINSTANCE.getNumericValue();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.IntegerValueImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.FloatsValueImpl <em>Floats Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.FloatsValueImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getFloatsValue()
		 * @generated
		 */
		EClass FLOATS_VALUE = eINSTANCE.getFloatsValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATS_VALUE__VALUE = eINSTANCE.getFloatsValue_Value();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.DoublePrecisionValueImpl <em>Double Precision Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.DoublePrecisionValueImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getDoublePrecisionValue()
		 * @generated
		 */
		EClass DOUBLE_PRECISION_VALUE = eINSTANCE.getDoublePrecisionValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_PRECISION_VALUE__VALUE = eINSTANCE.getDoublePrecisionValue_Value();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.NegativeInfImpl <em>Negative Inf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.NegativeInfImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getNegativeInf()
		 * @generated
		 */
		EClass NEGATIVE_INF = eINSTANCE.getNegativeInf();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.PositiveInfImpl <em>Positive Inf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.PositiveInfImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getPositiveInf()
		 * @generated
		 */
		EClass POSITIVE_INF = eINSTANCE.getPositiveInf();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.ValueToIncreaseImpl <em>Value To Increase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.ValueToIncreaseImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getValueToIncrease()
		 * @generated
		 */
		EClass VALUE_TO_INCREASE = eINSTANCE.getValueToIncrease();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TO_INCREASE__VALUE = eINSTANCE.getValueToIncrease_Value();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.StringsValueImpl <em>Strings Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.StringsValueImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getStringsValue()
		 * @generated
		 */
		EClass STRINGS_VALUE = eINSTANCE.getStringsValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRINGS_VALUE__VALUE = eINSTANCE.getStringsValue_Value();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.ValueTypeImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__NAME = eINSTANCE.getValueType_Name();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.BooleanValueTypeImpl <em>Boolean Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.BooleanValueTypeImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getBooleanValueType()
		 * @generated
		 */
		EClass BOOLEAN_VALUE_TYPE = eINSTANCE.getBooleanValueType();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE_TYPE__PRIMITIVE_TYPE = eINSTANCE.getBooleanValueType_PrimitiveType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.EnumerationImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__VALUES = eINSTANCE.getEnumeration_Values();

		/**
		 * The meta object literal for the '<em><b>Includes Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___INCLUDES_NAME__STRING = eINSTANCE.getEnumeration__IncludesName__String();

		/**
		 * The meta object literal for the '<em><b>Includes Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___INCLUDES_VALUE__INT = eINSTANCE.getEnumeration__IncludesValue__int();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.ListImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__VALUES = eINSTANCE.getList_Values();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__PRIMITIVE_TYPE = eINSTANCE.getList_PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__TYPE = eINSTANCE.getList_Type();

		/**
		 * The meta object literal for the '<em><b>Includes Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST___INCLUDES_VALUE__SINGLEVALUE = eINSTANCE.getList__IncludesValue__SingleValue();

		/**
		 * The meta object literal for the '<em><b>Check Value Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST___CHECK_VALUE_TYPE__SINGLEVALUE = eINSTANCE.getList__CheckValueType__SingleValue();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.RangeImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Lower Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__LOWER_LIMIT = eINSTANCE.getRange_LowerLimit();

		/**
		 * The meta object literal for the '<em><b>Upper Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__UPPER_LIMIT = eINSTANCE.getRange_UpperLimit();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__PRIMITIVE_TYPE = eINSTANCE.getRange_PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Check Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE___CHECK_TYPE__LIMIT_TYPEENUM_BOOLEAN = eINSTANCE.getRange__CheckType__Limit_TypeEnum_boolean();

		/**
		 * The meta object literal for the '<em><b>Includes Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE___INCLUDES_VALUE__DOUBLE = eINSTANCE.getRange__IncludesValue__double();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.RangeUnionImpl <em>Range Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.RangeUnionImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getRangeUnion()
		 * @generated
		 */
		EClass RANGE_UNION = eINSTANCE.getRangeUnion();

		/**
		 * The meta object literal for the '<em><b>Ranges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_UNION__RANGES = eINSTANCE.getRangeUnion_Ranges();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_UNION__PRIMITIVE_TYPE = eINSTANCE.getRangeUnion_PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Includes Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE_UNION___INCLUDES_VALUE__DOUBLE = eINSTANCE.getRangeUnion__IncludesValue__double();

		/**
		 * The meta object literal for the '<em><b>Invalid Range Sequence</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE_UNION___INVALID_RANGE_SEQUENCE__RANGEUNION = eINSTANCE.getRangeUnion__InvalidRangeSequence__RangeUnion();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.impl.StringValueTypeImpl <em>String Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.impl.StringValueTypeImpl
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getStringValueType()
		 * @generated
		 */
		EClass STRING_VALUE_TYPE = eINSTANCE.getStringValueType();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE_TYPE__PRIMITIVE_TYPE = eINSTANCE.getStringValueType_PrimitiveType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.type.TypeEnum <em>Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.type.TypeEnum
		 * @see eu.paasage.camel.type.impl.TypePackageImpl#getTypeEnum()
		 * @generated
		 */
		EEnum TYPE_ENUM = eINSTANCE.getTypeEnum();

	}

} //TypePackage
