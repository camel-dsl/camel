/**
 */
package eu.paasage.camel.type;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.type.TypePackage
 * @generated
 */
public interface TypeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypeFactory eINSTANCE = eu.paasage.camel.type.impl.TypeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	TypeModel createTypeModel();

	/**
	 * Returns a new object of class '<em>Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Limit</em>'.
	 * @generated
	 */
	Limit createLimit();

	/**
	 * Returns a new object of class '<em>Bool Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bool Value</em>'.
	 * @generated
	 */
	BoolValue createBoolValue();

	/**
	 * Returns a new object of class '<em>Enumerate Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerate Value</em>'.
	 * @generated
	 */
	EnumerateValue createEnumerateValue();

	/**
	 * Returns a new object of class '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value</em>'.
	 * @generated
	 */
	IntegerValue createIntegerValue();

	/**
	 * Returns a new object of class '<em>Floats Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floats Value</em>'.
	 * @generated
	 */
	FloatsValue createFloatsValue();

	/**
	 * Returns a new object of class '<em>Double Precision Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Precision Value</em>'.
	 * @generated
	 */
	DoublePrecisionValue createDoublePrecisionValue();

	/**
	 * Returns a new object of class '<em>Negative Inf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Inf</em>'.
	 * @generated
	 */
	NegativeInf createNegativeInf();

	/**
	 * Returns a new object of class '<em>Positive Inf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Inf</em>'.
	 * @generated
	 */
	PositiveInf createPositiveInf();

	/**
	 * Returns a new object of class '<em>Value To Increase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value To Increase</em>'.
	 * @generated
	 */
	ValueToIncrease createValueToIncrease();

	/**
	 * Returns a new object of class '<em>Strings Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strings Value</em>'.
	 * @generated
	 */
	StringsValue createStringsValue();

	/**
	 * Returns a new object of class '<em>Boolean Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value Type</em>'.
	 * @generated
	 */
	BooleanValueType createBooleanValueType();

	/**
	 * Returns a new object of class '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration</em>'.
	 * @generated
	 */
	Enumeration createEnumeration();

	/**
	 * Returns a new object of class '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List</em>'.
	 * @generated
	 */
	List createList();

	/**
	 * Returns a new object of class '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range</em>'.
	 * @generated
	 */
	Range createRange();

	/**
	 * Returns a new object of class '<em>Range Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Union</em>'.
	 * @generated
	 */
	RangeUnion createRangeUnion();

	/**
	 * Returns a new object of class '<em>String Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value Type</em>'.
	 * @generated
	 */
	StringValueType createStringValueType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypePackage getTypePackage();

} //TypeFactory
