/**
 */
package eu.paasage.camel.deployment.util;

import eu.paasage.camel.deployment.*;

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
 * @see eu.paasage.camel.deployment.DeploymentPackage
 * @generated
 */
public class DeploymentValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DeploymentValidator INSTANCE = new DeploymentValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eu.paasage.camel.deployment";

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
	public DeploymentValidator() {
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
	  return DeploymentPackage.eINSTANCE;
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
			case DeploymentPackage.DEPLOYMENT_ELEMENT:
				return validateDeploymentElement((DeploymentElement)value, diagnostics, context);
			case DeploymentPackage.DEPLOYMENT_MODEL:
				return validateDeploymentModel((DeploymentModel)value, diagnostics, context);
			case DeploymentPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case DeploymentPackage.INTERNAL_COMPONENT:
				return validateInternalComponent((InternalComponent)value, diagnostics, context);
			case DeploymentPackage.VM:
				return validateVM((VM)value, diagnostics, context);
			case DeploymentPackage.VM_REQUIREMENT_SET:
				return validateVMRequirementSet((VMRequirementSet)value, diagnostics, context);
			case DeploymentPackage.CONFIGURATION:
				return validateConfiguration((Configuration)value, diagnostics, context);
			case DeploymentPackage.COMMUNICATION:
				return validateCommunication((Communication)value, diagnostics, context);
			case DeploymentPackage.COMMUNICATION_PORT:
				return validateCommunicationPort((CommunicationPort)value, diagnostics, context);
			case DeploymentPackage.PROVIDED_COMMUNICATION:
				return validateProvidedCommunication((ProvidedCommunication)value, diagnostics, context);
			case DeploymentPackage.REQUIRED_COMMUNICATION:
				return validateRequiredCommunication((RequiredCommunication)value, diagnostics, context);
			case DeploymentPackage.HOSTING:
				return validateHosting((Hosting)value, diagnostics, context);
			case DeploymentPackage.HOSTING_PORT:
				return validateHostingPort((HostingPort)value, diagnostics, context);
			case DeploymentPackage.PROVIDED_HOST:
				return validateProvidedHost((ProvidedHost)value, diagnostics, context);
			case DeploymentPackage.REQUIRED_HOST:
				return validateRequiredHost((RequiredHost)value, diagnostics, context);
			case DeploymentPackage.COMPONENT_INSTANCE:
				return validateComponentInstance((ComponentInstance)value, diagnostics, context);
			case DeploymentPackage.INTERNAL_COMPONENT_INSTANCE:
				return validateInternalComponentInstance((InternalComponentInstance)value, diagnostics, context);
			case DeploymentPackage.VM_INSTANCE:
				return validateVMInstance((VMInstance)value, diagnostics, context);
			case DeploymentPackage.COMMUNICATION_INSTANCE:
				return validateCommunicationInstance((CommunicationInstance)value, diagnostics, context);
			case DeploymentPackage.COMMUNICATION_PORT_INSTANCE:
				return validateCommunicationPortInstance((CommunicationPortInstance)value, diagnostics, context);
			case DeploymentPackage.PROVIDED_COMMUNICATION_INSTANCE:
				return validateProvidedCommunicationInstance((ProvidedCommunicationInstance)value, diagnostics, context);
			case DeploymentPackage.REQUIRED_COMMUNICATION_INSTANCE:
				return validateRequiredCommunicationInstance((RequiredCommunicationInstance)value, diagnostics, context);
			case DeploymentPackage.HOSTING_INSTANCE:
				return validateHostingInstance((HostingInstance)value, diagnostics, context);
			case DeploymentPackage.HOSTING_PORT_INSTANCE:
				return validateHostingPortInstance((HostingPortInstance)value, diagnostics, context);
			case DeploymentPackage.PROVIDED_HOST_INSTANCE:
				return validateProvidedHostInstance((ProvidedHostInstance)value, diagnostics, context);
			case DeploymentPackage.REQUIRED_HOST_INSTANCE:
				return validateRequiredHostInstance((RequiredHostInstance)value, diagnostics, context);
			case DeploymentPackage.COMMUNICATION_TYPE:
				return validateCommunicationType((CommunicationType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentElement(DeploymentElement deploymentElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)deploymentElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentModel(DeploymentModel deploymentModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)deploymentModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalComponent(InternalComponent internalComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)internalComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)internalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)internalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)internalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)internalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)internalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)internalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)internalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)internalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalComponent_no_recursion_in_parts_of_internal_component(internalComponent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the no_recursion_in_parts_of_internal_component constraint of '<em>Internal Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERNAL_COMPONENT__NO_RECURSION_IN_PARTS_OF_INTERNAL_COMPONENT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'InternalComponent: ' + self.name +\n" +
		"\t\t\t\t' should not be recursively contained by itself via the compositeInternalComponent association',\n" +
		"\tstatus : Boolean = not\n" +
		"\t\t\t\t(self.contains(self, self))\n" +
		"}.status";

	/**
	 * Validates the no_recursion_in_parts_of_internal_component constraint of '<em>Internal Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalComponent_no_recursion_in_parts_of_internal_component(InternalComponent internalComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeploymentPackage.Literals.INTERNAL_COMPONENT,
				 internalComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "no_recursion_in_parts_of_internal_component",
				 INTERNAL_COMPONENT__NO_RECURSION_IN_PARTS_OF_INTERNAL_COMPONENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVM(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)vm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVMRequirementSet(VMRequirementSet vmRequirementSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)vmRequirementSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)vmRequirementSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)vmRequirementSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)vmRequirementSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)vmRequirementSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)vmRequirementSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)vmRequirementSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)vmRequirementSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)vmRequirementSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateVMRequirementSet_at_least_one_alternative_in_vm_req_set(vmRequirementSet, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the at_least_one_alternative_in_vm_req_set constraint of '<em>VM Requirement Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VM_REQUIREMENT_SET__AT_LEAST_ONE_ALTERNATIVE_IN_VM_REQ_SET__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'VMRequirementSet: ' + self.name +\n" +
		"\t\t\t\t' should include the specification of at least one requirement',\n" +
		"\tstatus : Boolean = (locationRequirement <> null or\n" +
		"\t\t\t\tproviderRequirement <> null or osOrImageRequirement <> null or qualitativeHardwareRequirement <> null or\n" +
		"\t\t\t\tquantitativeHardwareRequirement <> null)\n" +
		"}.status";

	/**
	 * Validates the at_least_one_alternative_in_vm_req_set constraint of '<em>VM Requirement Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVMRequirementSet_at_least_one_alternative_in_vm_req_set(VMRequirementSet vmRequirementSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeploymentPackage.Literals.VM_REQUIREMENT_SET,
				 vmRequirementSet,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "at_least_one_alternative_in_vm_req_set",
				 VM_REQUIREMENT_SET__AT_LEAST_ONE_ALTERNATIVE_IN_VM_REQ_SET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)configuration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunication(Communication communication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)communication, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)communication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)communication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)communication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)communication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)communication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)communication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)communication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)communication, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommunication_local_communication_both_comp_same_vm(communication, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the local_communication_both_comp_same_vm constraint of '<em>Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMUNICATION__LOCAL_COMMUNICATION_BOTH_COMP_SAME_VM__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The communication:' + self.name +\n" +
		"\t\t\t\t' is local but the communicating components are mapped to different VMs',\n" +
		"\tstatus : Boolean = let firstOwner : Component =\n" +
		"\t\t\t\tself.providedCommunication.oclContainer().oclContainer().oclAsType(DeploymentModel).hostings\n" +
		"\t\t\t\t->select(p | p.requiredHost.oclContainer() = self.providedCommunication.oclContainer())\n" +
		"\t\t\t\t->first().providedHost.oclContainer() , secondOwner : Component =\n" +
		"\t\t\t\tself.requiredCommunication.oclContainer().oclContainer().oclAsType(DeploymentModel).hostings\n" +
		"\t\t\t\t->select(q | q.requiredHost.oclContainer() = self.requiredCommunication.oclContainer())\n" +
		"\t\t\t\t->first().providedHost.oclContainer()\n" +
		"\t\t\tin (self.type = CommunicationType::LOCAL) implies (if (firstOwner.oclIsTypeOf(InternalComponent) and\n" +
		"\t\t\t\t\tsecondOwner.oclIsTypeOf(InternalComponent))\n" +
		"\t\t\t\tthen firstOwner.oclAsType(InternalComponent).oclContainer().oclAsType(DeploymentModel).hostings\n" +
		"\t\t\t\t\t->select(p | p.requiredHost.oclContainer() = firstOwner)\n" +
		"\t\t\t\t\t->first().providedHost.oclContainer() =\n" +
		"\t\t\t\t\tsecondOwner.oclAsType(InternalComponent).oclContainer().oclAsType(DeploymentModel).hostings\n" +
		"\t\t\t\t\t->select(p | p.requiredHost.oclContainer() = secondOwner)\n" +
		"\t\t\t\t\t->first().providedHost.oclContainer()\n" +
		"\t\t\t\telse if (firstOwner.oclIsTypeOf(VM) and secondOwner.oclIsTypeOf(InternalComponent))\n" +
		"\t\t\t\t\tthen firstOwner = secondOwner.oclAsType(InternalComponent).oclContainer().oclAsType(DeploymentModel).hostings\n" +
		"\t\t\t\t\t\t->select(p | p.requiredHost.oclContainer() = secondOwner)\n" +
		"\t\t\t\t\t\t->first().providedHost.oclContainer()\n" +
		"\t\t\t\t\telse if (firstOwner.oclIsTypeOf(InternalComponent) and secondOwner.oclIsTypeOf(VM))\n" +
		"\t\t\t\t\t\tthen firstOwner.oclAsType(InternalComponent).oclContainer().oclAsType(DeploymentModel).hostings\n" +
		"\t\t\t\t\t\t\t->select(p | p.requiredHost.oclContainer() = firstOwner)\n" +
		"\t\t\t\t\t\t\t->first().providedHost.oclContainer() = secondOwner\n" +
		"\t\t\t\t\t\telse if (firstOwner = secondOwner)\n" +
		"\t\t\t\t\t\t\tthen true\n" +
		"\t\t\t\t\t\t\telse false\n" +
		"\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\tendif\n" +
		"\t\t\t\tendif)\n" +
		"}.status";

	/**
	 * Validates the local_communication_both_comp_same_vm constraint of '<em>Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunication_local_communication_both_comp_same_vm(Communication communication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeploymentPackage.Literals.COMMUNICATION,
				 communication,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "local_communication_both_comp_same_vm",
				 COMMUNICATION__LOCAL_COMMUNICATION_BOTH_COMP_SAME_VM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationPort(CommunicationPort communicationPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)communicationPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedCommunication(ProvidedCommunication providedCommunication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)providedCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredCommunication(RequiredCommunication requiredCommunication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)requiredCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHosting(Hosting hosting, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)hosting, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHostingPort(HostingPort hostingPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)hostingPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedHost(ProvidedHost providedHost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)providedHost, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredHost(RequiredHost requiredHost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)requiredHost, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstance(ComponentInstance componentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)componentInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentInstance_component_port_instances_of_correct_type(componentInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the component_port_instances_of_correct_type constraint of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_INSTANCE__COMPONENT_PORT_INSTANCES_OF_CORRECT_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The type of component instance:' + self.name +\n" +
		"\t\t\t\t' should have as provided communication/hosts the types of the component instance\\'s provided communication/host instances',\n" +
		"\tstatus : Boolean = providedCommunicationInstances\n" +
		"\t\t\t\t->forAll(p | type.providedCommunications\n" +
		"\t\t\t\t\t->includes(p.type)) and providedHostInstances\n" +
		"\t\t\t\t->forAll(p | type.providedHosts\n" +
		"\t\t\t\t\t->includes(p.type))\n" +
		"}.status";

	/**
	 * Validates the component_port_instances_of_correct_type constraint of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstance_component_port_instances_of_correct_type(ComponentInstance componentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeploymentPackage.Literals.COMPONENT_INSTANCE,
				 componentInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "component_port_instances_of_correct_type",
				 COMPONENT_INSTANCE__COMPONENT_PORT_INSTANCES_OF_CORRECT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalComponentInstance(InternalComponentInstance internalComponentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)internalComponentInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)internalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)internalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)internalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)internalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)internalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)internalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)internalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)internalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentInstance_component_port_instances_of_correct_type(internalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalComponentInstance_internal_component_port_instances_of_correct_type(internalComponentInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the internal_component_port_instances_of_correct_type constraint of '<em>Internal Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERNAL_COMPONENT_INSTANCE__INTERNAL_COMPONENT_PORT_INSTANCES_OF_CORRECT_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The type of component instance:' + self.name +\n" +
		"\t\t\t\t' should have as required communication/hosts the types of the component instance\\'s required communication/host instances',\n" +
		"\tstatus : Boolean = type.oclIsKindOf(InternalComponent)\n" +
		"\t\t\t\tand requiredCommunicationInstances\n" +
		"\t\t\t\t->forAll(p | type.oclAsType(InternalComponent).requiredCommunications\n" +
		"\t\t\t\t\t->includes(p.type)) and (requiredHostInstance <> null implies requiredHostInstance.type =\n" +
		"\t\t\t\ttype.oclAsType(InternalComponent).requiredHost)\n" +
		"}.status";

	/**
	 * Validates the internal_component_port_instances_of_correct_type constraint of '<em>Internal Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalComponentInstance_internal_component_port_instances_of_correct_type(InternalComponentInstance internalComponentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeploymentPackage.Literals.INTERNAL_COMPONENT_INSTANCE,
				 internalComponentInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "internal_component_port_instances_of_correct_type",
				 INTERNAL_COMPONENT_INSTANCE__INTERNAL_COMPONENT_PORT_INSTANCES_OF_CORRECT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVMInstance(VMInstance vmInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)vmInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentInstance_component_port_instances_of_correct_type(vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateVMInstance_correct_type_for_vm_instance(vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateVMInstance_correct_vm_type_value_in_vm_instance(vmInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the correct_type_for_vm_instance constraint of '<em>VM Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VM_INSTANCE__CORRECT_TYPE_FOR_VM_INSTANCE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'VM Instance: ' + self.name +\n" +
		"\t\t\t\t' should have as type a VM',\n" +
		"\tstatus : Boolean = type.oclIsTypeOf(VM)\n" +
		"}.status";

	/**
	 * Validates the correct_type_for_vm_instance constraint of '<em>VM Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVMInstance_correct_type_for_vm_instance(VMInstance vmInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeploymentPackage.Literals.VM_INSTANCE,
				 vmInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correct_type_for_vm_instance",
				 VM_INSTANCE__CORRECT_TYPE_FOR_VM_INSTANCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the correct_vm_type_value_in_vm_instance constraint of '<em>VM Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VM_INSTANCE__CORRECT_VM_TYPE_VALUE_IN_VM_INSTANCE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'VMInstance: ' + self.name +\n" +
		"\t\t\t\t' has a vmTypeValue which is not included in the ValueType of the vmType Attribute',\n" +
		"\tstatus : Boolean = ((vmType <> null and\n" +
		"\t\t\t\tvmType.valueType <> null) implies (if (vmType.valueType.oclIsTypeOf(camel::type::Range))\n" +
		"\t\t\t\tthen if (vmTypeValue.oclIsTypeOf(camel::type::IntegerValue))\n" +
		"\t\t\t\t\tthen\n" +
		"\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::Range).includesValue(vmTypeValue.oclAsType(camel::type::IntegerValue).value.oclAsType(ecore::EDouble))\n" +
		"\t\t\t\t\telse if (vmTypeValue.oclIsTypeOf(camel::type::FloatsValue))\n" +
		"\t\t\t\t\t\tthen\n" +
		"\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::Range).includesValue(vmTypeValue.oclAsType(camel::type::FloatsValue).value.oclAsType(ecore::EDouble))\n" +
		"\t\t\t\t\t\telse if (vmTypeValue.oclIsTypeOf(camel::type::DoublePrecisionValue))\n" +
		"\t\t\t\t\t\t\tthen\n" +
		"\t\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::Range).includesValue(vmTypeValue.oclAsType(camel::type::DoublePrecisionValue).value)\n" +
		"\t\t\t\t\t\t\telse false\n" +
		"\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\tendif\n" +
		"\t\t\t\telse if (vmType.valueType.oclIsTypeOf(camel::type::Enumeration))\n" +
		"\t\t\t\t\tthen if (vmTypeValue.oclIsTypeOf(camel::type::StringsValue))\n" +
		"\t\t\t\t\t\tthen\n" +
		"\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::Enumeration).includesName(vmTypeValue.oclAsType(camel::type::StringsValue).value)\n" +
		"\t\t\t\t\t\telse if (vmTypeValue.oclIsTypeOf(camel::type::EnumerateValue))\n" +
		"\t\t\t\t\t\t\tthen\n" +
		"\t\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::Enumeration).includesName(vmTypeValue.oclAsType(camel::type::EnumerateValue).name)\n" +
		"\t\t\t\t\t\t\telse false\n" +
		"\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\telse if (vmType.valueType.oclIsTypeOf(camel::type::List))\n" +
		"\t\t\t\t\t\tthen vmType.valueType.oclAsType(camel::type::List).includesValue(vmTypeValue)\n" +
		"\t\t\t\t\t\telse if (vmType.valueType.oclIsTypeOf(camel::type::RangeUnion))\n" +
		"\t\t\t\t\t\t\tthen if (vmTypeValue.oclIsTypeOf(camel::type::IntegerValue))\n" +
		"\t\t\t\t\t\t\t\tthen\n" +
		"\t\t\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::RangeUnion).includesValue(vmTypeValue.oclAsType(camel::type::IntegerValue).value.oclAsType(ecore::EDouble))\n" +
		"\t\t\t\t\t\t\t\telse if (vmTypeValue.oclIsTypeOf(camel::type::FloatsValue))\n" +
		"\t\t\t\t\t\t\t\t\tthen\n" +
		"\t\t\t\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::RangeUnion).includesValue(vmTypeValue.oclAsType(camel::type::FloatsValue).value.oclAsType(ecore::EDouble))\n" +
		"\t\t\t\t\t\t\t\t\telse if (vmTypeValue.oclIsTypeOf(camel::type::DoublePrecisionValue))\n" +
		"\t\t\t\t\t\t\t\t\t\tthen\n" +
		"\t\t\t\t\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::RangeUnion).includesValue(vmTypeValue.oclAsType(camel::type::DoublePrecisionValue).value)\n" +
		"\t\t\t\t\t\t\t\t\t\telse false\n" +
		"\t\t\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\telse false\n" +
		"\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\tendif\n" +
		"\t\t\t\tendif))\n" +
		"}.status";

	/**
	 * Validates the correct_vm_type_value_in_vm_instance constraint of '<em>VM Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVMInstance_correct_vm_type_value_in_vm_instance(VMInstance vmInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeploymentPackage.Literals.VM_INSTANCE,
				 vmInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correct_vm_type_value_in_vm_instance",
				 VM_INSTANCE__CORRECT_VM_TYPE_VALUE_IN_VM_INSTANCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationInstance(CommunicationInstance communicationInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)communicationInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)communicationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)communicationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)communicationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)communicationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)communicationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)communicationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)communicationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)communicationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommunicationInstance_communication_instance_correct_port_instances(communicationInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the communication_instance_correct_port_instances constraint of '<em>Communication Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMUNICATION_INSTANCE__COMMUNICATION_INSTANCE_CORRECT_PORT_INSTANCES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'CommunicationInstance: ' + self.name +\n" +
		"\t\t\t\t' should have its provided and required communication instances\\' types mapping to its required communication/host type, respectively',\n" +
		"\tstatus : Boolean = requiredCommunicationInstance.type\n" +
		"\t\t\t\t= type.requiredCommunication and providedCommunicationInstance.type = type.providedCommunication\n" +
		"}.status";

	/**
	 * Validates the communication_instance_correct_port_instances constraint of '<em>Communication Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationInstance_communication_instance_correct_port_instances(CommunicationInstance communicationInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeploymentPackage.Literals.COMMUNICATION_INSTANCE,
				 communicationInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "communication_instance_correct_port_instances",
				 COMMUNICATION_INSTANCE__COMMUNICATION_INSTANCE_CORRECT_PORT_INSTANCES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationPortInstance(CommunicationPortInstance communicationPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)communicationPortInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedCommunicationInstance(ProvidedCommunicationInstance providedCommunicationInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)providedCommunicationInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredCommunicationInstance(RequiredCommunicationInstance requiredCommunicationInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)requiredCommunicationInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHostingInstance(HostingInstance hostingInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)hostingInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHostingPortInstance(HostingPortInstance hostingPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)hostingPortInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedHostInstance(ProvidedHostInstance providedHostInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)providedHostInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredHostInstance(RequiredHostInstance requiredHostInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)requiredHostInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationType(CommunicationType communicationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //DeploymentValidator
