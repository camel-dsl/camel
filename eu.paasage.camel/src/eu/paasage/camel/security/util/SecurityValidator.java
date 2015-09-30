/**
 */
package eu.paasage.camel.security.util;

import eu.paasage.camel.metric.util.MetricValidator;

import eu.paasage.camel.security.*;

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
 * @see eu.paasage.camel.security.SecurityPackage
 * @generated
 */
public class SecurityValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SecurityValidator INSTANCE = new SecurityValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eu.paasage.camel.security";

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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricValidator metricValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityValidator() {
		super();
		metricValidator = MetricValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SecurityPackage.eINSTANCE;
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
			case SecurityPackage.SECURITY_MODEL:
				return validateSecurityModel((SecurityModel)value, diagnostics, context);
			case SecurityPackage.SECURITY_DOMAIN:
				return validateSecurityDomain((SecurityDomain)value, diagnostics, context);
			case SecurityPackage.SECURITY_CONTROL:
				return validateSecurityControl((SecurityControl)value, diagnostics, context);
			case SecurityPackage.RAW_SECURITY_METRIC_INSTANCE:
				return validateRawSecurityMetricInstance((RawSecurityMetricInstance)value, diagnostics, context);
			case SecurityPackage.RAW_SECURITY_METRIC:
				return validateRawSecurityMetric((RawSecurityMetric)value, diagnostics, context);
			case SecurityPackage.SECURITY_PROPERTY:
				return validateSecurityProperty((SecurityProperty)value, diagnostics, context);
			case SecurityPackage.CERTIFIABLE:
				return validateCertifiable((Certifiable)value, diagnostics, context);
			case SecurityPackage.SECURITY_SLO:
				return validateSecuritySLO((SecuritySLO)value, diagnostics, context);
			case SecurityPackage.SECURITY_CAPABILITY:
				return validateSecurityCapability((SecurityCapability)value, diagnostics, context);
			case SecurityPackage.COMPOSITE_SECURITY_METRIC:
				return validateCompositeSecurityMetric((CompositeSecurityMetric)value, diagnostics, context);
			case SecurityPackage.COMPOSITE_SECURITY_METRIC_INSTANCE:
				return validateCompositeSecurityMetricInstance((CompositeSecurityMetricInstance)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityModel(SecurityModel securityModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)securityModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityDomain(SecurityDomain securityDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)securityDomain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityControl(SecurityControl securityControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)securityControl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRawSecurityMetricInstance(RawSecurityMetricInstance rawSecurityMetricInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)rawSecurityMetricInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)rawSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)rawSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)rawSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)rawSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)rawSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)rawSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)rawSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)rawSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= metricValidator.validateRawMetricInstance_raw_metric_instance_correct_metric_type(rawSecurityMetricInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRawSecurityMetric(RawSecurityMetric rawSecurityMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)rawSecurityMetric, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)rawSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)rawSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)rawSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)rawSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)rawSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)rawSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)rawSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)rawSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= metricValidator.validateMetricFormulaParameter_value_attribute_set_for_non_metric_formula_parameters(rawSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= metricValidator.validateMetric_metric_measures_measurable_property(rawSecurityMetric, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityProperty(SecurityProperty securityProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)securityProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertifiable(Certifiable certifiable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)certifiable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)certifiable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)certifiable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)certifiable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)certifiable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)certifiable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)certifiable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)certifiable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)certifiable, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertifiable_certifiable_realized_by(certifiable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the certifiable_realized_by constraint of '<em>Certifiable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CERTIFIABLE__CERTIFIABLE_REALIZED_BY__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Certifiable Property: ' + self.name +\n" +
		"\t\t\t\t\t' has a non-empty list of sub-properties',\n" +
		"\tstatus : Boolean = self.subProperties\n" +
		"\t\t\t\t\t->isEmpty()\n" +
		"}.status";

	/**
	 * Validates the certifiable_realized_by constraint of '<em>Certifiable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertifiable_certifiable_realized_by(Certifiable certifiable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SecurityPackage.Literals.CERTIFIABLE,
				 certifiable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "certifiable_realized_by",
				 CERTIFIABLE__CERTIFIABLE_REALIZED_BY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuritySLO(SecuritySLO securitySLO, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)securitySLO, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)securitySLO, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)securitySLO, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)securitySLO, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)securitySLO, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)securitySLO, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)securitySLO, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)securitySLO, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)securitySLO, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecuritySLO_only_sec_constructs_in_condition(securitySLO, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the only_sec_constructs_in_condition constraint of '<em>SLO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SECURITY_SLO__ONLY_SEC_CONSTRUCTS_IN_CONDITION__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'SecuritySLO: ' + self.name +\n" +
		"\t\t\t\t\t' maps to non-security metrics or properties',\n" +
		"\tstatus : Boolean = if\n" +
		"\t\t\t\t\t\t(customServiceLevel.oclIsTypeOf(camel::metric::MetricCondition))\n" +
		"\t\t\t\t\tthen\n" +
		"\t\t\t\t\t\tcustomServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.metric.oclIsTypeOf(camel::security::RawSecurityMetric)\n" +
		"\t\t\t\t\t\tor\n" +
		"\t\t\t\t\t\tcustomServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.metric.oclIsTypeOf(camel::security::CompositeSecurityMetric)\n" +
		"\t\t\t\t\telse if (customServiceLevel.oclIsTypeOf(camel::metric::PropertyCondition))\n" +
		"\t\t\t\t\t\tthen\n" +
		"\t\t\t\t\t\t\tcustomServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.property.oclIsTypeOf(camel::security::SecurityProperty)\n" +
		"\t\t\t\t\t\telse false\n" +
		"\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\tendif\n" +
		"}.status";

	/**
	 * Validates the only_sec_constructs_in_condition constraint of '<em>SLO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuritySLO_only_sec_constructs_in_condition(SecuritySLO securitySLO, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SecurityPackage.Literals.SECURITY_SLO,
				 securitySLO,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "only_sec_constructs_in_condition",
				 SECURITY_SLO__ONLY_SEC_CONSTRUCTS_IN_CONDITION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityCapability(SecurityCapability securityCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)securityCapability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeSecurityMetric(CompositeSecurityMetric compositeSecurityMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)compositeSecurityMetric, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)compositeSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)compositeSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)compositeSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)compositeSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)compositeSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)compositeSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)compositeSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)compositeSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= metricValidator.validateMetricFormulaParameter_value_attribute_set_for_non_metric_formula_parameters(compositeSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= metricValidator.validateMetric_metric_measures_measurable_property(compositeSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= metricValidator.validateCompositeMetric_metric_layer_enforcement(compositeSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= metricValidator.validateCompositeMetric_metric_percentage_unit_enforcement(compositeSecurityMetric, diagnostics, context);
		if (result || diagnostics != null) result &= metricValidator.validateCompositeMetric_metric_composite_unit_enforcement(compositeSecurityMetric, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeSecurityMetricInstance(CompositeSecurityMetricInstance compositeSecurityMetricInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)compositeSecurityMetricInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)compositeSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)compositeSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)compositeSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)compositeSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)compositeSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)compositeSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)compositeSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)compositeSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= metricValidator.validateCompositeMetricInstance_composite_metric_instance_to_components(compositeSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= metricValidator.validateCompositeMetricInstance_component_instances_metric_map_formula_templates(compositeSecurityMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= metricValidator.validateCompositeMetricInstance_component_metrics_refer_to_same_level_or_lower(compositeSecurityMetricInstance, diagnostics, context);
		return result;
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

} //SecurityValidator
