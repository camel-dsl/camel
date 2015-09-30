/**
 */
package eu.paasage.camel.provider.util;

import eu.paasage.camel.provider.*;

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
 * @see eu.paasage.camel.provider.ProviderPackage
 * @generated
 */
public class ProviderValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProviderValidator INSTANCE = new ProviderValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eu.paasage.camel.provider";

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
	public ProviderValidator() {
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
	  return ProviderPackage.eINSTANCE;
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
			case ProviderPackage.PROVIDER_MODEL:
				return validateProviderModel((ProviderModel)value, diagnostics, context);
			case ProviderPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case ProviderPackage.ATTRIBUTE_CONSTRAINT:
				return validateAttributeConstraint((AttributeConstraint)value, diagnostics, context);
			case ProviderPackage.CARDINALITY:
				return validateCardinality((Cardinality)value, diagnostics, context);
			case ProviderPackage.FEAT_CARDINALITY:
				return validateFeatCardinality((FeatCardinality)value, diagnostics, context);
			case ProviderPackage.GROUP_CARDINALITY:
				return validateGroupCardinality((GroupCardinality)value, diagnostics, context);
			case ProviderPackage.CLONE:
				return validateClone((Clone)value, diagnostics, context);
			case ProviderPackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case ProviderPackage.EXCLUDES:
				return validateExcludes((Excludes)value, diagnostics, context);
			case ProviderPackage.IMPLIES:
				return validateImplies((Implies)value, diagnostics, context);
			case ProviderPackage.REQUIRES:
				return validateRequires((Requires)value, diagnostics, context);
			case ProviderPackage.FUNCTIONAL:
				return validateFunctional((Functional)value, diagnostics, context);
			case ProviderPackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case ProviderPackage.ALTERNATIVE:
				return validateAlternative((Alternative)value, diagnostics, context);
			case ProviderPackage.EXCLUSIVE:
				return validateExclusive((Exclusive)value, diagnostics, context);
			case ProviderPackage.SCOPE:
				return validateScope((Scope)value, diagnostics, context);
			case ProviderPackage.INSTANCE:
				return validateInstance((Instance)value, diagnostics, context);
			case ProviderPackage.PRODUCT:
				return validateProduct((Product)value, diagnostics, context);
			case ProviderPackage.OPERATOR:
				return validateOperator((Operator)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderModel(ProviderModel providerModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)providerModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)attribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_attribute_must_have_at_least_value_or_value_type(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_attribute_value_in_value_type(attribute, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the attribute_must_have_at_least_value_or_value_type constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATTRIBUTE__ATTRIBUTE_MUST_HAVE_AT_LEAST_VALUE_OR_VALUE_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Attribute: ' + self.name +\n" +
		"\t\t\t\t\t' does not have a value or value type',\n" +
		"\tstatus : Boolean = value <> null or valueType <> null\n" +
		"}.status";

	/**
	 * Validates the attribute_must_have_at_least_value_or_value_type constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_attribute_must_have_at_least_value_or_value_type(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProviderPackage.Literals.ATTRIBUTE,
				 attribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "attribute_must_have_at_least_value_or_value_type",
				 ATTRIBUTE__ATTRIBUTE_MUST_HAVE_AT_LEAST_VALUE_OR_VALUE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the attribute_value_in_value_type constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATTRIBUTE__ATTRIBUTE_VALUE_IN_VALUE_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Value  is not contained in ValueType in Attribute: ' + self.name,\n" +
		"\tstatus : Boolean = (value\n" +
		"\t\t\t\t\t<> null and valueType <> null) implies self.checkValue(value, false)\n" +
		"}.status";

	/**
	 * Validates the attribute_value_in_value_type constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_attribute_value_in_value_type(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProviderPackage.Literals.ATTRIBUTE,
				 attribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "attribute_value_in_value_type",
				 ATTRIBUTE__ATTRIBUTE_VALUE_IN_VALUE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeConstraint(AttributeConstraint attributeConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)attributeConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)attributeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)attributeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)attributeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)attributeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)attributeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)attributeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)attributeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)attributeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeConstraint_attribute_constraint_correct_values(attributeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeConstraint_different_attrs_in_attribute_constraint(attributeConstraint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the attribute_constraint_correct_values constraint of '<em>Attribute Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATTRIBUTE_CONSTRAINT__ATTRIBUTE_CONSTRAINT_CORRECT_VALUES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In AttributeConstraint: ' + self.toString() +\n" +
		"\t\t\t\t\t' either the fromValue: ' + fromValue.toString() + ' or the toValue: ' + toValue.toString() +\n" +
		"\t\t\t\t\t' are not contained in the value types of the respective attributes: ' + from.name + ' ' + to.name +\n" +
		"\t\t\t\t\t', respectively',\n" +
		"\tstatus : Boolean = from.checkValue(fromValue, true) and to.checkValue(toValue, true)\n" +
		"}.status";

	/**
	 * Validates the attribute_constraint_correct_values constraint of '<em>Attribute Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeConstraint_attribute_constraint_correct_values(AttributeConstraint attributeConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProviderPackage.Literals.ATTRIBUTE_CONSTRAINT,
				 attributeConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "attribute_constraint_correct_values",
				 ATTRIBUTE_CONSTRAINT__ATTRIBUTE_CONSTRAINT_CORRECT_VALUES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the different_attrs_in_attribute_constraint constraint of '<em>Attribute Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATTRIBUTE_CONSTRAINT__DIFFERENT_ATTRS_IN_ATTRIBUTE_CONSTRAINT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In AttributeConstraint: ' + self.toString() +\n" +
		"\t\t\t\t\t' the same attribute: ' + from.name + ' is used in the from and to associations',\n" +
		"\tstatus : Boolean = from <> to\n" +
		"}.status";

	/**
	 * Validates the different_attrs_in_attribute_constraint constraint of '<em>Attribute Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeConstraint_different_attrs_in_attribute_constraint(AttributeConstraint attributeConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProviderPackage.Literals.ATTRIBUTE_CONSTRAINT,
				 attributeConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "different_attrs_in_attribute_constraint",
				 ATTRIBUTE_CONSTRAINT__DIFFERENT_ATTRS_IN_ATTRIBUTE_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinality(Cardinality cardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)cardinality, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)cardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)cardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)cardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)cardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)cardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)cardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)cardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)cardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validateCardinality_cardinality_min_less_equal_than_max(cardinality, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the cardinality_min_less_equal_than_max constraint of '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CARDINALITY__CARDINALITY_MIN_LESS_EQUAL_THAN_MAX__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In Cardinality' + self.toString() +\n" +
		"\t\t\t\t\t' either negative values are given for cardinalityMin or cardinalityMax or cardinalityMin is greater than cardinalityMax',\n" +
		"\tstatus : Boolean = cardinalityMin\n" +
		"\t\t\t\t\t>= 0 and (cardinalityMax >= 0 implies cardinalityMin <= cardinalityMax)\n" +
		"}.status";

	/**
	 * Validates the cardinality_min_less_equal_than_max constraint of '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinality_cardinality_min_less_equal_than_max(Cardinality cardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProviderPackage.Literals.CARDINALITY,
				 cardinality,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "cardinality_min_less_equal_than_max",
				 CARDINALITY__CARDINALITY_MIN_LESS_EQUAL_THAN_MAX__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatCardinality(FeatCardinality featCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)featCardinality, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)featCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)featCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)featCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)featCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)featCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)featCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)featCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)featCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validateCardinality_cardinality_min_less_equal_than_max(featCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeatCardinality_correct_feat_cardinality(featCardinality, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the correct_feat_cardinality constraint of '<em>Feat Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FEAT_CARDINALITY__CORRECT_FEAT_CARDINALITY__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In FeatCardinality: ' + self.toString() +\n" +
		"\t\t\t\t\t' either the value given is negative or the value is less than cardinalityMin or value is greater than cardinalityMax',\n" +
		"\tstatus : Boolean = (value\n" +
		"\t\t\t\t\t> 0 implies (cardinalityMin <= value) and (cardinalityMax <> - 1 implies value <= cardinalityMax))\n" +
		"}.status";

	/**
	 * Validates the correct_feat_cardinality constraint of '<em>Feat Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatCardinality_correct_feat_cardinality(FeatCardinality featCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProviderPackage.Literals.FEAT_CARDINALITY,
				 featCardinality,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correct_feat_cardinality",
				 FEAT_CARDINALITY__CORRECT_FEAT_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupCardinality(GroupCardinality groupCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)groupCardinality, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)groupCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)groupCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)groupCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)groupCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)groupCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)groupCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)groupCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)groupCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validateCardinality_cardinality_min_less_equal_than_max(groupCardinality, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClone(Clone clone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)clone, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)constraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_constraint_from_attributes_belong_to_from_feature_and_symmetric(constraint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the constraint_from_attributes_belong_to_from_feature_and_symmetric constraint of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONSTRAINT__CONSTRAINT_FROM_ATTRIBUTES_BELONG_TO_FROM_FEATURE_AND_SYMMETRIC__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Constraint: ' + name +\n" +
		"\t\t\t\t\t' has attribute constraints which map to from or to attributes that do not belong to the respective from: ' +\n" +
		"\t\t\t\t\tfrom.name + ' or to: ' + to.name + ' feature of this constraint',\n" +
		"\tstatus : Boolean = attributeConstraints\n" +
		"\t\t\t\t\t->forAll(p | (from.attributes\n" +
		"\t\t\t\t\t\t->includes(p.from) and to.attributes\n" +
		"\t\t\t\t\t\t->includes(p.to)))\n" +
		"}.status";

	/**
	 * Validates the constraint_from_attributes_belong_to_from_feature_and_symmetric constraint of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint_constraint_from_attributes_belong_to_from_feature_and_symmetric(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProviderPackage.Literals.CONSTRAINT,
				 constraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "constraint_from_attributes_belong_to_from_feature_and_symmetric",
				 CONSTRAINT__CONSTRAINT_FROM_ATTRIBUTES_BELONG_TO_FROM_FEATURE_AND_SYMMETRIC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExcludes(Excludes excludes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)excludes, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)excludes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)excludes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)excludes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)excludes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)excludes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)excludes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)excludes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)excludes, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_constraint_from_attributes_belong_to_from_feature_and_symmetric(excludes, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplies(Implies implies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)implies, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)implies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)implies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)implies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)implies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)implies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)implies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)implies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)implies, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_constraint_from_attributes_belong_to_from_feature_and_symmetric(implies, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequires(Requires requires, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)requires, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)requires, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)requires, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)requires, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)requires, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)requires, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)requires, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)requires, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)requires, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_constraint_from_attributes_belong_to_from_feature_and_symmetric(requires, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequires_requires_cardFrom_to_conformance(requires, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the requires_cardFrom_to_conformance constraint of '<em>Requires</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIRES__REQUIRES_CARD_FROM_TO_CONFORMANCE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In Requires Constraint: ' + self.name +\n" +
		"\t\t\t\t\t' there are from or to cardinalities that do not conform to the designated cardinality restrictions of the respective from: '\n" +
		"\t\t\t\t\t+ from.name + ' or to: ' + to.name + ' features of this constraint',\n" +
		"\tstatus : Boolean = (cardFrom <> null implies\n" +
		"\t\t\t\t\t(cardFrom.cardinalityMin >= from.featureCardinality.cardinalityMin and ((from.featureCardinality.cardinalityMax =\n" +
		"\t\t\t\t\t- 1) or (cardFrom.cardinalityMax <> - 1 and cardFrom.cardinalityMax <= from.featureCardinality.cardinalityMax))))\n" +
		"\t\t\t\t\tand (cardTo <> null implies (cardTo.cardinalityMin >= to.featureCardinality.cardinalityMin and\n" +
		"\t\t\t\t\t((to.featureCardinality.cardinalityMax = - 1) or (cardTo.cardinalityMax <> - 1 and cardTo.cardinalityMax <=\n" +
		"\t\t\t\t\tto.featureCardinality.cardinalityMax))))\n" +
		"}.status";

	/**
	 * Validates the requires_cardFrom_to_conformance constraint of '<em>Requires</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequires_requires_cardFrom_to_conformance(Requires requires, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProviderPackage.Literals.REQUIRES,
				 requires,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "requires_cardFrom_to_conformance",
				 REQUIRES__REQUIRES_CARD_FROM_TO_CONFORMANCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctional(Functional functional, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)functional, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)functional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)functional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)functional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)functional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)functional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)functional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)functional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)functional, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_constraint_from_attributes_belong_to_from_feature_and_symmetric(functional, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequires_requires_cardFrom_to_conformance(functional, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctional_correct_values_for_functional(functional, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the correct_values_for_functional constraint of '<em>Functional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FUNCTIONAL__CORRECT_VALUES_FOR_FUNCTIONAL__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In Functional Constraint: ' + self.name +\n" +
		"\t\t\t\t\t', either the value of order is negative or that of the value attributes is not positive',\n" +
		"\tstatus : Boolean = order >= 0 and value >\n" +
		"\t\t\t\t\t0\n" +
		"}.status";

	/**
	 * Validates the correct_values_for_functional constraint of '<em>Functional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctional_correct_values_for_functional(Functional functional, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProviderPackage.Literals.FUNCTIONAL,
				 functional,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correct_values_for_functional",
				 FUNCTIONAL__CORRECT_VALUES_FOR_FUNCTIONAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)feature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlternative(Alternative alternative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)alternative, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlternative_alternative_variants_diff_from_sub_features(alternative, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the alternative_variants_diff_from_sub_features constraint of '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALTERNATIVE__ALTERNATIVE_VARIANTS_DIFF_FROM_SUB_FEATURES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'There is a pair of subFeature and variant with the same name for Feature: '\n" +
		"\t\t\t\t\t+ self.name,\n" +
		"\tstatus : Boolean = subFeatures\n" +
		"\t\t\t\t\t->forAll(p | not (variants\n" +
		"\t\t\t\t\t\t->exists(q | q.name = p.name)))\n" +
		"}.status";

	/**
	 * Validates the alternative_variants_diff_from_sub_features constraint of '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlternative_alternative_variants_diff_from_sub_features(Alternative alternative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProviderPackage.Literals.ALTERNATIVE,
				 alternative,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "alternative_variants_diff_from_sub_features",
				 ALTERNATIVE__ALTERNATIVE_VARIANTS_DIFF_FROM_SUB_FEATURES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExclusive(Exclusive exclusive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)exclusive, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)exclusive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)exclusive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)exclusive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)exclusive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)exclusive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)exclusive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)exclusive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)exclusive, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlternative_alternative_variants_diff_from_sub_features(exclusive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScope(Scope scope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)scope, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstance(Instance instance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)instance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)product, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator(Operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ProviderValidator
