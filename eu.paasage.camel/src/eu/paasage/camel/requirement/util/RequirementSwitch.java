/**
 */
package eu.paasage.camel.requirement.util;

import eu.paasage.camel.Model;

import eu.paasage.camel.requirement.*;

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
 * @see eu.paasage.camel.requirement.RequirementPackage
 * @generated
 */
public class RequirementSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RequirementPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementSwitch() {
		if (modelPackage == null) {
			modelPackage = RequirementPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
			case RequirementPackage.REQUIREMENT_MODEL: {
				RequirementModel requirementModel = (RequirementModel)theEObject;
				T result = caseRequirementModel(requirementModel);
				if (result == null) result = caseModel(requirementModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.REQUIREMENT_GROUP: {
				RequirementGroup requirementGroup = (RequirementGroup)theEObject;
				T result = caseRequirementGroup(requirementGroup);
				if (result == null) result = caseRequirement(requirementGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.HARD_REQUIREMENT: {
				HardRequirement hardRequirement = (HardRequirement)theEObject;
				T result = caseHardRequirement(hardRequirement);
				if (result == null) result = caseRequirement(hardRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.SOFT_REQUIREMENT: {
				SoftRequirement softRequirement = (SoftRequirement)theEObject;
				T result = caseSoftRequirement(softRequirement);
				if (result == null) result = caseRequirement(softRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.SERVICE_LEVEL_OBJECTIVE: {
				ServiceLevelObjective serviceLevelObjective = (ServiceLevelObjective)theEObject;
				T result = caseServiceLevelObjective(serviceLevelObjective);
				if (result == null) result = caseHardRequirement(serviceLevelObjective);
				if (result == null) result = caseRequirement(serviceLevelObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.OPTIMISATION_REQUIREMENT: {
				OptimisationRequirement optimisationRequirement = (OptimisationRequirement)theEObject;
				T result = caseOptimisationRequirement(optimisationRequirement);
				if (result == null) result = caseSoftRequirement(optimisationRequirement);
				if (result == null) result = caseRequirement(optimisationRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.HARDWARE_REQUIREMENT: {
				HardwareRequirement hardwareRequirement = (HardwareRequirement)theEObject;
				T result = caseHardwareRequirement(hardwareRequirement);
				if (result == null) result = caseHardRequirement(hardwareRequirement);
				if (result == null) result = caseRequirement(hardwareRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.QUALITATIVE_HARDWARE_REQUIREMENT: {
				QualitativeHardwareRequirement qualitativeHardwareRequirement = (QualitativeHardwareRequirement)theEObject;
				T result = caseQualitativeHardwareRequirement(qualitativeHardwareRequirement);
				if (result == null) result = caseHardwareRequirement(qualitativeHardwareRequirement);
				if (result == null) result = caseHardRequirement(qualitativeHardwareRequirement);
				if (result == null) result = caseRequirement(qualitativeHardwareRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.QUANTITATIVE_HARDWARE_REQUIREMENT: {
				QuantitativeHardwareRequirement quantitativeHardwareRequirement = (QuantitativeHardwareRequirement)theEObject;
				T result = caseQuantitativeHardwareRequirement(quantitativeHardwareRequirement);
				if (result == null) result = caseHardwareRequirement(quantitativeHardwareRequirement);
				if (result == null) result = caseHardRequirement(quantitativeHardwareRequirement);
				if (result == null) result = caseRequirement(quantitativeHardwareRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.PROVIDER_REQUIREMENT: {
				ProviderRequirement providerRequirement = (ProviderRequirement)theEObject;
				T result = caseProviderRequirement(providerRequirement);
				if (result == null) result = caseHardRequirement(providerRequirement);
				if (result == null) result = caseRequirement(providerRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.OS_OR_IMAGE_REQUIREMENT: {
				OSOrImageRequirement osOrImageRequirement = (OSOrImageRequirement)theEObject;
				T result = caseOSOrImageRequirement(osOrImageRequirement);
				if (result == null) result = caseHardRequirement(osOrImageRequirement);
				if (result == null) result = caseRequirement(osOrImageRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.OS_REQUIREMENT: {
				OSRequirement osRequirement = (OSRequirement)theEObject;
				T result = caseOSRequirement(osRequirement);
				if (result == null) result = caseOSOrImageRequirement(osRequirement);
				if (result == null) result = caseHardRequirement(osRequirement);
				if (result == null) result = caseRequirement(osRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.IMAGE_REQUIREMENT: {
				ImageRequirement imageRequirement = (ImageRequirement)theEObject;
				T result = caseImageRequirement(imageRequirement);
				if (result == null) result = caseOSOrImageRequirement(imageRequirement);
				if (result == null) result = caseHardRequirement(imageRequirement);
				if (result == null) result = caseRequirement(imageRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.SECURITY_REQUIREMENT: {
				SecurityRequirement securityRequirement = (SecurityRequirement)theEObject;
				T result = caseSecurityRequirement(securityRequirement);
				if (result == null) result = caseHardRequirement(securityRequirement);
				if (result == null) result = caseRequirement(securityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.LOCATION_REQUIREMENT: {
				LocationRequirement locationRequirement = (LocationRequirement)theEObject;
				T result = caseLocationRequirement(locationRequirement);
				if (result == null) result = caseHardRequirement(locationRequirement);
				if (result == null) result = caseRequirement(locationRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.SCALE_REQUIREMENT: {
				ScaleRequirement scaleRequirement = (ScaleRequirement)theEObject;
				T result = caseScaleRequirement(scaleRequirement);
				if (result == null) result = caseHardRequirement(scaleRequirement);
				if (result == null) result = caseRequirement(scaleRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.HORIZONTAL_SCALE_REQUIREMENT: {
				HorizontalScaleRequirement horizontalScaleRequirement = (HorizontalScaleRequirement)theEObject;
				T result = caseHorizontalScaleRequirement(horizontalScaleRequirement);
				if (result == null) result = caseScaleRequirement(horizontalScaleRequirement);
				if (result == null) result = caseHardRequirement(horizontalScaleRequirement);
				if (result == null) result = caseRequirement(horizontalScaleRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementPackage.VERTICAL_SCALE_REQUIREMENT: {
				VerticalScaleRequirement verticalScaleRequirement = (VerticalScaleRequirement)theEObject;
				T result = caseVerticalScaleRequirement(verticalScaleRequirement);
				if (result == null) result = caseScaleRequirement(verticalScaleRequirement);
				if (result == null) result = caseHardRequirement(verticalScaleRequirement);
				if (result == null) result = caseRequirement(verticalScaleRequirement);
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
	public T caseRequirementModel(RequirementModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementGroup(RequirementGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hard Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hard Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardRequirement(HardRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soft Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soft Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftRequirement(SoftRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelObjective(ServiceLevelObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optimisation Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optimisation Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptimisationRequirement(OptimisationRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareRequirement(HardwareRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualitative Hardware Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualitative Hardware Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualitativeHardwareRequirement(QualitativeHardwareRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantitative Hardware Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantitative Hardware Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantitativeHardwareRequirement(QuantitativeHardwareRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProviderRequirement(ProviderRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OS Or Image Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OS Or Image Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSOrImageRequirement(OSOrImageRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OS Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OS Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSRequirement(OSRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageRequirement(ImageRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityRequirement(SecurityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationRequirement(LocationRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scale Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scale Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScaleRequirement(ScaleRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontal Scale Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontal Scale Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalScaleRequirement(HorizontalScaleRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical Scale Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical Scale Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalScaleRequirement(VerticalScaleRequirement object) {
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

} //RequirementSwitch
