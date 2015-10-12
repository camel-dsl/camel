/**
 */
package eu.paasage.camel.requirement.util;

import eu.paasage.camel.requirement.*;

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
 * @see eu.paasage.camel.requirement.RequirementPackage
 * @generated
 */
public class RequirementValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RequirementValidator INSTANCE = new RequirementValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eu.paasage.camel.requirement";

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
	public RequirementValidator() {
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
	  return RequirementPackage.eINSTANCE;
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
			case RequirementPackage.REQUIREMENT_MODEL:
				return validateRequirementModel((RequirementModel)value, diagnostics, context);
			case RequirementPackage.REQUIREMENT:
				return validateRequirement((Requirement)value, diagnostics, context);
			case RequirementPackage.REQUIREMENT_GROUP:
				return validateRequirementGroup((RequirementGroup)value, diagnostics, context);
			case RequirementPackage.HARD_REQUIREMENT:
				return validateHardRequirement((HardRequirement)value, diagnostics, context);
			case RequirementPackage.SOFT_REQUIREMENT:
				return validateSoftRequirement((SoftRequirement)value, diagnostics, context);
			case RequirementPackage.SERVICE_LEVEL_OBJECTIVE:
				return validateServiceLevelObjective((ServiceLevelObjective)value, diagnostics, context);
			case RequirementPackage.OPTIMISATION_REQUIREMENT:
				return validateOptimisationRequirement((OptimisationRequirement)value, diagnostics, context);
			case RequirementPackage.HARDWARE_REQUIREMENT:
				return validateHardwareRequirement((HardwareRequirement)value, diagnostics, context);
			case RequirementPackage.QUALITATIVE_HARDWARE_REQUIREMENT:
				return validateQualitativeHardwareRequirement((QualitativeHardwareRequirement)value, diagnostics, context);
			case RequirementPackage.QUANTITATIVE_HARDWARE_REQUIREMENT:
				return validateQuantitativeHardwareRequirement((QuantitativeHardwareRequirement)value, diagnostics, context);
			case RequirementPackage.PROVIDER_REQUIREMENT:
				return validateProviderRequirement((ProviderRequirement)value, diagnostics, context);
			case RequirementPackage.OS_OR_IMAGE_REQUIREMENT:
				return validateOSOrImageRequirement((OSOrImageRequirement)value, diagnostics, context);
			case RequirementPackage.OS_REQUIREMENT:
				return validateOSRequirement((OSRequirement)value, diagnostics, context);
			case RequirementPackage.IMAGE_REQUIREMENT:
				return validateImageRequirement((ImageRequirement)value, diagnostics, context);
			case RequirementPackage.SECURITY_REQUIREMENT:
				return validateSecurityRequirement((SecurityRequirement)value, diagnostics, context);
			case RequirementPackage.LOCATION_REQUIREMENT:
				return validateLocationRequirement((LocationRequirement)value, diagnostics, context);
			case RequirementPackage.SCALE_REQUIREMENT:
				return validateScaleRequirement((ScaleRequirement)value, diagnostics, context);
			case RequirementPackage.HORIZONTAL_SCALE_REQUIREMENT:
				return validateHorizontalScaleRequirement((HorizontalScaleRequirement)value, diagnostics, context);
			case RequirementPackage.VERTICAL_SCALE_REQUIREMENT:
				return validateVerticalScaleRequirement((VerticalScaleRequirement)value, diagnostics, context);
			case RequirementPackage.REQUIREMENT_OPERATOR_TYPE:
				return validateRequirementOperatorType((RequirementOperatorType)value, diagnostics, context);
			case RequirementPackage.OPTIMISATION_FUNCTION_TYPE:
				return validateOptimisationFunctionType((OptimisationFunctionType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementModel(RequirementModel requirementModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)requirementModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)requirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementGroup(RequirementGroup requirementGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)requirementGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)requirementGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)requirementGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)requirementGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)requirementGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)requirementGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)requirementGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)requirementGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)requirementGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirementGroup_applications_in_sub_groups_in_group(requirementGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirementGroup_requirement_group_no_conflict_reqs(requirementGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirementGroup_requirements_in_group_refer_to_group_applications(requirementGroup, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the applications_in_sub_groups_in_group constraint of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT_GROUP__APPLICATIONS_IN_SUB_GROUPS_IN_GROUP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'RequirementGroup: ' + self.name +\n" +
		"\t\t\t\t\t' has one or more sub-groups that map to applications which are not included in the group\\'s list of applications',\n" +
		"\tstatus : Boolean = self.requirements\n" +
		"\t\t\t\t\t->forAll(p | p.oclIsTypeOf(RequirementGroup) implies p.oclAsType(RequirementGroup).application\n" +
		"\t\t\t\t\t\t->forAll(a | self.application\n" +
		"\t\t\t\t\t\t\t->includes(a)))\n" +
		"}.status";

	/**
	 * Validates the applications_in_sub_groups_in_group constraint of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementGroup_applications_in_sub_groups_in_group(RequirementGroup requirementGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RequirementPackage.Literals.REQUIREMENT_GROUP,
				 requirementGroup,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "applications_in_sub_groups_in_group",
				 REQUIREMENT_GROUP__APPLICATIONS_IN_SUB_GROUPS_IN_GROUP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the requirement_group_no_conflict_reqs constraint of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT_GROUP__REQUIREMENT_GROUP_NO_CONFLICT_REQS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'RequirementGroup: ' + self.name +\n" +
		"\t\t\t\t\t' has two or more scale requirements of the same type that are conflicting, i.e., refer to the same VM (in case of vertical requirements) or component (in case of horizontal requirements)',\n" +
		"\tstatus : Boolean = if\n" +
		"\t\t\t\t\t\t(self.requirementOperator = RequirementOperatorType::AND)\n" +
		"\t\t\t\t\tthen self.requirements\n" +
		"\t\t\t\t\t\t->forAll(p1, p2 | (p1 <> p2 and p1.oclIsKindOf(camel::requirement::ScaleRequirement) and\n" +
		"\t\t\t\t\t\t\tp2.oclIsKindOf(camel::requirement::ScaleRequirement) and p1.oclType() = p2.oclType()) implies if\n" +
		"\t\t\t\t\t\t\t\t(p1.oclIsTypeOf(camel::requirement::VerticalScaleRequirement))\n" +
		"\t\t\t\t\t\t\tthen p1.oclAsType(camel::requirement::VerticalScaleRequirement).vm <>\n" +
		"\t\t\t\t\t\t\t\tp2.oclAsType(camel::requirement::VerticalScaleRequirement).vm\n" +
		"\t\t\t\t\t\t\telse p1.oclAsType(camel::requirement::HorizontalScaleRequirement).component <>\n" +
		"\t\t\t\t\t\t\t\tp2.oclAsType(camel::requirement::HorizontalScaleRequirement).component\n" +
		"\t\t\t\t\t\t\tendif)\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif\n" +
		"}.status";

	/**
	 * Validates the requirement_group_no_conflict_reqs constraint of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementGroup_requirement_group_no_conflict_reqs(RequirementGroup requirementGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RequirementPackage.Literals.REQUIREMENT_GROUP,
				 requirementGroup,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "requirement_group_no_conflict_reqs",
				 REQUIREMENT_GROUP__REQUIREMENT_GROUP_NO_CONFLICT_REQS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the requirements_in_group_refer_to_group_applications constraint of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT_GROUP__REQUIREMENTS_IN_GROUP_REFER_TO_GROUP_APPLICATIONS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'RequirementGroup: ' + self.name +\n" +
		"\t\t\t\t\t' has one or more requirements that map to an application which is not included in the group\\'s list of applications',\n" +
		"\tstatus : Boolean = if\n" +
		"\t\t\t\t\t\t(application\n" +
		"\t\t\t\t\t\t->notEmpty())\n" +
		"\t\t\t\t\tthen requirements\n" +
		"\t\t\t\t\t\t->forAll(p | if (p.oclIsTypeOf(camel::requirement::ServiceLevelObjective))\n" +
		"\t\t\t\t\t\t\tthen if\n" +
		"\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclIsTypeOf(camel::metric::MetricCondition))\n" +
		"\t\t\t\t\t\t\t\tthen application\n" +
		"\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.application)\n" +
		"\t\t\t\t\t\t\t\telse if\n" +
		"\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclIsTypeOf(camel::metric::MetricCondition))\n" +
		"\t\t\t\t\t\t\t\t\tthen if\n" +
		"\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.application\n" +
		"\t\t\t\t\t\t\t\t\t\t\t<> null)\n" +
		"\t\t\t\t\t\t\t\t\t\tthen application\n" +
		"\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.application)\n" +
		"\t\t\t\t\t\t\t\t\t\telse if\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.component\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t<> null)\n" +
		"\t\t\t\t\t\t\t\t\t\t\tthen if\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.component.oclIsTypeOf(camel::deployment::InternalComponent))\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\tthen application\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.internalComponents\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.component.oclAsType(camel::deployment::InternalComponent)))))\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\telse application\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.vms\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.component.oclAsType(camel::deployment::VM)))))\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\t\t\t\t\telse false\n" +
		"\t\t\t\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\t\t\telse if\n" +
		"\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclIsTypeOf(camel::metric::PropertyCondition))\n" +
		"\t\t\t\t\t\t\t\t\t\tthen if\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.application\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t<> null)\n" +
		"\t\t\t\t\t\t\t\t\t\t\tthen application\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.application)\n" +
		"\t\t\t\t\t\t\t\t\t\t\telse if\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.component\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t<> null)\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\tthen if\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.component.oclIsTypeOf(camel::deployment::InternalComponent))\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\tthen application\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.internalComponents\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.component.oclAsType(camel::deployment::InternalComponent)))))\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\telse application\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.vms\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.component.oclAsType(camel::deployment::VM)))))\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\telse false\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\t\t\t\telse false\n" +
		"\t\t\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\telse if (p.oclIsTypeOf(camel::requirement::OptimisationRequirement))\n" +
		"\t\t\t\t\t\t\t\tthen if (p.oclAsType(camel::requirement::OptimisationRequirement).metric <> null or\n" +
		"\t\t\t\t\t\t\t\t\t\tp.oclAsType(camel::requirement::OptimisationRequirement).property <> null)\n" +
		"\t\t\t\t\t\t\t\t\tthen if (p.oclAsType(camel::requirement::OptimisationRequirement).application <> null)\n" +
		"\t\t\t\t\t\t\t\t\t\tthen application\n" +
		"\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::OptimisationRequirement).application)\n" +
		"\t\t\t\t\t\t\t\t\t\telse if (p.oclAsType(camel::requirement::OptimisationRequirement).component <> null)\n" +
		"\t\t\t\t\t\t\t\t\t\t\tthen if\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::OptimisationRequirement).component.oclIsTypeOf(camel::deployment::InternalComponent))\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\tthen application\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.internalComponents\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::OptimisationRequirement).component.oclAsType(camel::deployment::InternalComponent)))))\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\telse application\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.vms\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::OptimisationRequirement).component.oclAsType(camel::deployment::VM)))))\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\t\t\t\t\telse false\n" +
		"\t\t\t\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\t\t\telse false\n" +
		"\t\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\t\telse if (p.oclIsTypeOf(camel::requirement::SecurityRequirement))\n" +
		"\t\t\t\t\t\t\t\t\tthen if (p.oclAsType(camel::requirement::SecurityRequirement).application <> null)\n" +
		"\t\t\t\t\t\t\t\t\t\tthen application\n" +
		"\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::SecurityRequirement).application)\n" +
		"\t\t\t\t\t\t\t\t\t\telse false\n" +
		"\t\t\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\t\t\telse true\n" +
		"\t\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\tendif)\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif\n" +
		"}.status";

	/**
	 * Validates the requirements_in_group_refer_to_group_applications constraint of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementGroup_requirements_in_group_refer_to_group_applications(RequirementGroup requirementGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RequirementPackage.Literals.REQUIREMENT_GROUP,
				 requirementGroup,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "requirements_in_group_refer_to_group_applications",
				 REQUIREMENT_GROUP__REQUIREMENTS_IN_GROUP_REFER_TO_GROUP_APPLICATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardRequirement(HardRequirement hardRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)hardRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftRequirement(SoftRequirement softRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)softRequirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)softRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)softRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)softRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)softRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)softRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)softRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)softRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)softRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoftRequirement_non_negative_priorities_for_soft_requirement(softRequirement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the non_negative_priorities_for_soft_requirement constraint of '<em>Soft Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SOFT_REQUIREMENT__NON_NEGATIVE_PRIORITIES_FOR_SOFT_REQUIREMENT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Requirement: ' + self.name + ' has a negative priority: ' +\n" +
		"\t\t\t\t\tself.priority.toString(),\n" +
		"\tstatus : Boolean = self.priority >= 0.0\n" +
		"}.status";

	/**
	 * Validates the non_negative_priorities_for_soft_requirement constraint of '<em>Soft Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftRequirement_non_negative_priorities_for_soft_requirement(SoftRequirement softRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RequirementPackage.Literals.SOFT_REQUIREMENT,
				 softRequirement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "non_negative_priorities_for_soft_requirement",
				 SOFT_REQUIREMENT__NON_NEGATIVE_PRIORITIES_FOR_SOFT_REQUIREMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceLevelObjective(ServiceLevelObjective serviceLevelObjective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)serviceLevelObjective, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptimisationRequirement(OptimisationRequirement optimisationRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)optimisationRequirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)optimisationRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)optimisationRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)optimisationRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)optimisationRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)optimisationRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)optimisationRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)optimisationRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)optimisationRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoftRequirement_non_negative_priorities_for_soft_requirement(optimisationRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateOptimisationRequirement_optimization_requirement_metric_or_prop(optimisationRequirement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the optimization_requirement_metric_or_prop constraint of '<em>Optimisation Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPTIMISATION_REQUIREMENT__OPTIMIZATION_REQUIREMENT_METRIC_OR_PROP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In OptimizationRequirement: ' + self.name +\n" +
		"\t\t\t\t\t' no metric or property has been given',\n" +
		"\tstatus : Boolean = (metric <> null and property = null and (application <> null or\n" +
		"\t\t\t\t\tcomponent <> null)) or (property <> null and metric = null and (application <> null or component <> null))\n" +
		"}.status";

	/**
	 * Validates the optimization_requirement_metric_or_prop constraint of '<em>Optimisation Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptimisationRequirement_optimization_requirement_metric_or_prop(OptimisationRequirement optimisationRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RequirementPackage.Literals.OPTIMISATION_REQUIREMENT,
				 optimisationRequirement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "optimization_requirement_metric_or_prop",
				 OPTIMISATION_REQUIREMENT__OPTIMIZATION_REQUIREMENT_METRIC_OR_PROP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareRequirement(HardwareRequirement hardwareRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)hardwareRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualitativeHardwareRequirement(QualitativeHardwareRequirement qualitativeHardwareRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)qualitativeHardwareRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantitativeHardwareRequirement(QuantitativeHardwareRequirement quantitativeHardwareRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)quantitativeHardwareRequirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)quantitativeHardwareRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)quantitativeHardwareRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)quantitativeHardwareRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)quantitativeHardwareRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)quantitativeHardwareRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)quantitativeHardwareRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)quantitativeHardwareRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)quantitativeHardwareRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuantitativeHardwareRequirement_one_alternative_provided_in_quantitative_req(quantitativeHardwareRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuantitativeHardwareRequirement_quantitative_req_correct_input(quantitativeHardwareRequirement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the one_alternative_provided_in_quantitative_req constraint of '<em>Quantitative Hardware Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String QUANTITATIVE_HARDWARE_REQUIREMENT__ONE_ALTERNATIVE_PROVIDED_IN_QUANTITATIVE_REQ__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'QuantitativeHardwareRequirement with name: ' + self.name +\n" +
		"\t\t\t\t\t' should be have at least one min or max value for a VM characteristic',\n" +
		"\tstatus : Boolean = ((minRAM > 0 or maxRAM > 0)) or\n" +
		"\t\t\t\t\t((minStorage > 0 or maxStorage > 0)) or (minCores > 0 or maxCores > 0)\n" +
		"}.status";

	/**
	 * Validates the one_alternative_provided_in_quantitative_req constraint of '<em>Quantitative Hardware Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantitativeHardwareRequirement_one_alternative_provided_in_quantitative_req(QuantitativeHardwareRequirement quantitativeHardwareRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT,
				 quantitativeHardwareRequirement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "one_alternative_provided_in_quantitative_req",
				 QUANTITATIVE_HARDWARE_REQUIREMENT__ONE_ALTERNATIVE_PROVIDED_IN_QUANTITATIVE_REQ__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the quantitative_req_correct_input constraint of '<em>Quantitative Hardware Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String QUANTITATIVE_HARDWARE_REQUIREMENT__QUANTITATIVE_REQ_CORRECT_INPUT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Correct (non-negative) values for the characteristics of VM in QuantitativeHardwareRequirement with name: '\n" +
		"\t\t\t\t\t+ self.name + ' should be provided',\n" +
		"\tstatus : Boolean = minRAM >= 0 and maxRAM >= 0 and minCores >= 0 and maxCores >= 0 and\n" +
		"\t\t\t\t\tminStorage >= 0 and maxStorage >= 0\n" +
		"}.status";

	/**
	 * Validates the quantitative_req_correct_input constraint of '<em>Quantitative Hardware Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantitativeHardwareRequirement_quantitative_req_correct_input(QuantitativeHardwareRequirement quantitativeHardwareRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT,
				 quantitativeHardwareRequirement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "quantitative_req_correct_input",
				 QUANTITATIVE_HARDWARE_REQUIREMENT__QUANTITATIVE_REQ_CORRECT_INPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderRequirement(ProviderRequirement providerRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)providerRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOSOrImageRequirement(OSOrImageRequirement osOrImageRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)osOrImageRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOSRequirement(OSRequirement osRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)osRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageRequirement(ImageRequirement imageRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)imageRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityRequirement(SecurityRequirement securityRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)securityRequirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)securityRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)securityRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)securityRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)securityRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)securityRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)securityRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)securityRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)securityRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityRequirement_security_req_component_in_app(securityRequirement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the security_req_component_in_app constraint of '<em>Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SECURITY_REQUIREMENT__SECURITY_REQ_COMPONENT_IN_APP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'SecurityRequirement' + self.name +\n" +
		"\t\t\t\t\t' maps to a component  which is not included in any deploymentModel of the respective application referenced',\n" +
		"\tstatus : Boolean = (application\n" +
		"\t\t\t\t\t<> null and component <> null) implies application.deploymentModels\n" +
		"\t\t\t\t\t->exists(d | (d.internalComponents\n" +
		"\t\t\t\t\t\t->includes(component)))\n" +
		"}.status";

	/**
	 * Validates the security_req_component_in_app constraint of '<em>Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityRequirement_security_req_component_in_app(SecurityRequirement securityRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RequirementPackage.Literals.SECURITY_REQUIREMENT,
				 securityRequirement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "security_req_component_in_app",
				 SECURITY_REQUIREMENT__SECURITY_REQ_COMPONENT_IN_APP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationRequirement(LocationRequirement locationRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)locationRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScaleRequirement(ScaleRequirement scaleRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)scaleRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHorizontalScaleRequirement(HorizontalScaleRequirement horizontalScaleRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)horizontalScaleRequirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)horizontalScaleRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)horizontalScaleRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)horizontalScaleRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)horizontalScaleRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)horizontalScaleRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)horizontalScaleRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)horizontalScaleRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)horizontalScaleRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateHorizontalScaleRequirement_horiz_scale_requirement_min_max_enforcement(horizontalScaleRequirement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the horiz_scale_requirement_min_max_enforcement constraint of '<em>Horizontal Scale Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HORIZONTAL_SCALE_REQUIREMENT__HORIZ_SCALE_REQUIREMENT_MIN_MAX_ENFORCEMENT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'HorizontalScaleRequirement: ' + self.name +\n" +
		"\t\t\t\t\t' has wrong values for the minInstances and/or maxInstance properties. The minInstances value should be positive, the maxInstances value positive or equal to -1, and when maxInstances value is positive, then minInstances value should not be greater than it',\n" +
		"\tstatus : Boolean = self.minInstances\n" +
		"\t\t\t\t\t> 0 and (self.maxInstances > 0 or self.maxInstances = - 1) and (self.maxInstances <> - 1 implies self.minInstances\n" +
		"\t\t\t\t\t<= self.maxInstances)\n" +
		"}.status";

	/**
	 * Validates the horiz_scale_requirement_min_max_enforcement constraint of '<em>Horizontal Scale Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHorizontalScaleRequirement_horiz_scale_requirement_min_max_enforcement(HorizontalScaleRequirement horizontalScaleRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RequirementPackage.Literals.HORIZONTAL_SCALE_REQUIREMENT,
				 horizontalScaleRequirement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "horiz_scale_requirement_min_max_enforcement",
				 HORIZONTAL_SCALE_REQUIREMENT__HORIZ_SCALE_REQUIREMENT_MIN_MAX_ENFORCEMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalScaleRequirement(VerticalScaleRequirement verticalScaleRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)verticalScaleRequirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)verticalScaleRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)verticalScaleRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)verticalScaleRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)verticalScaleRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)verticalScaleRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)verticalScaleRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)verticalScaleRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)verticalScaleRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateVerticalScaleRequirement_vert_scale_requirement_correct_param_vals(verticalScaleRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateVerticalScaleRequirement_vert_scale_requirement_activ_one_alt(verticalScaleRequirement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the vert_scale_requirement_correct_param_vals constraint of '<em>Vertical Scale Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VERTICAL_SCALE_REQUIREMENT__VERT_SCALE_REQUIREMENT_CORRECT_PARAM_VALS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In VerticalScaleRequirement: ' + self.name +\n" +
		"\t\t\t\t\t' there are wrong combinations of values mapping to the respective VM characteristics. For each characteristic, the min value should be non-negative, the max value greater or equal to -1 and if the max value is greater than -1, then it should be greater or equal to the min value',\n" +
		"\tstatus : Boolean = minCores\n" +
		"\t\t\t\t\t>= 0 and maxCores >= - 1 and (maxCores <> - 1 implies minCores <= maxCores) and minRAM >= 0 and maxRAM >= - 1 and\n" +
		"\t\t\t\t\t(maxRAM <> - 1 implies minRAM <= maxRAM) and minCPU >= 0 and maxCPU >= - 1 and (maxCPU <> - 1 implies minCPU <=\n" +
		"\t\t\t\t\tmaxCPU) and minStorage >= 0 and maxStorage >= - 1 and (maxStorage <> - 1 implies minStorage <= maxStorage)\n" +
		"}.status";

	/**
	 * Validates the vert_scale_requirement_correct_param_vals constraint of '<em>Vertical Scale Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalScaleRequirement_vert_scale_requirement_correct_param_vals(VerticalScaleRequirement verticalScaleRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT,
				 verticalScaleRequirement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "vert_scale_requirement_correct_param_vals",
				 VERTICAL_SCALE_REQUIREMENT__VERT_SCALE_REQUIREMENT_CORRECT_PARAM_VALS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the vert_scale_requirement_activ_one_alt constraint of '<em>Vertical Scale Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VERTICAL_SCALE_REQUIREMENT__VERT_SCALE_REQUIREMENT_ACTIV_ONE_ALT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In VerticalScaleRequirement: ' + self.name +\n" +
		"\t\t\t\t\t' the maximum value for no VM characteristic has been specified',\n" +
		"\tstatus : Boolean = maxCores > 0 or maxCores = - 1 or maxCPU > 0 or\n" +
		"\t\t\t\t\tmaxCPU = - 1 or maxRAM > 0 or maxRAM = - 1 or maxStorage > 0 or maxStorage = - 1\n" +
		"}.status";

	/**
	 * Validates the vert_scale_requirement_activ_one_alt constraint of '<em>Vertical Scale Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalScaleRequirement_vert_scale_requirement_activ_one_alt(VerticalScaleRequirement verticalScaleRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT,
				 verticalScaleRequirement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "vert_scale_requirement_activ_one_alt",
				 VERTICAL_SCALE_REQUIREMENT__VERT_SCALE_REQUIREMENT_ACTIV_ONE_ALT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementOperatorType(RequirementOperatorType requirementOperatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptimisationFunctionType(OptimisationFunctionType optimisationFunctionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //RequirementValidator
