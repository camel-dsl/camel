/**
 */
package eu.paasage.camel.requirement.impl;

import eu.paasage.camel.requirement.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementFactoryImpl extends EFactoryImpl implements RequirementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequirementFactory init() {
		try {
			RequirementFactory theRequirementFactory = (RequirementFactory)EPackage.Registry.INSTANCE.getEFactory(RequirementPackage.eNS_URI);
			if (theRequirementFactory != null) {
				return theRequirementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RequirementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RequirementPackage.REQUIREMENT_MODEL: return (EObject)createRequirementModel();
			case RequirementPackage.REQUIREMENT_GROUP: return (EObject)createRequirementGroup();
			case RequirementPackage.SERVICE_LEVEL_OBJECTIVE: return (EObject)createServiceLevelObjective();
			case RequirementPackage.OPTIMISATION_REQUIREMENT: return (EObject)createOptimisationRequirement();
			case RequirementPackage.QUALITATIVE_HARDWARE_REQUIREMENT: return (EObject)createQualitativeHardwareRequirement();
			case RequirementPackage.QUANTITATIVE_HARDWARE_REQUIREMENT: return (EObject)createQuantitativeHardwareRequirement();
			case RequirementPackage.PROVIDER_REQUIREMENT: return (EObject)createProviderRequirement();
			case RequirementPackage.OS_REQUIREMENT: return (EObject)createOSRequirement();
			case RequirementPackage.IMAGE_REQUIREMENT: return (EObject)createImageRequirement();
			case RequirementPackage.SECURITY_REQUIREMENT: return (EObject)createSecurityRequirement();
			case RequirementPackage.LOCATION_REQUIREMENT: return (EObject)createLocationRequirement();
			case RequirementPackage.HORIZONTAL_SCALE_REQUIREMENT: return (EObject)createHorizontalScaleRequirement();
			case RequirementPackage.VERTICAL_SCALE_REQUIREMENT: return (EObject)createVerticalScaleRequirement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RequirementPackage.REQUIREMENT_OPERATOR_TYPE:
				return createRequirementOperatorTypeFromString(eDataType, initialValue);
			case RequirementPackage.OPTIMISATION_FUNCTION_TYPE:
				return createOptimisationFunctionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RequirementPackage.REQUIREMENT_OPERATOR_TYPE:
				return convertRequirementOperatorTypeToString(eDataType, instanceValue);
			case RequirementPackage.OPTIMISATION_FUNCTION_TYPE:
				return convertOptimisationFunctionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementModel createRequirementModel() {
		RequirementModelImpl requirementModel = new RequirementModelImpl();
		return requirementModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementGroup createRequirementGroup() {
		RequirementGroupImpl requirementGroup = new RequirementGroupImpl();
		return requirementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelObjective createServiceLevelObjective() {
		ServiceLevelObjectiveImpl serviceLevelObjective = new ServiceLevelObjectiveImpl();
		return serviceLevelObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationRequirement createOptimisationRequirement() {
		OptimisationRequirementImpl optimisationRequirement = new OptimisationRequirementImpl();
		return optimisationRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitativeHardwareRequirement createQualitativeHardwareRequirement() {
		QualitativeHardwareRequirementImpl qualitativeHardwareRequirement = new QualitativeHardwareRequirementImpl();
		return qualitativeHardwareRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantitativeHardwareRequirement createQuantitativeHardwareRequirement() {
		QuantitativeHardwareRequirementImpl quantitativeHardwareRequirement = new QuantitativeHardwareRequirementImpl();
		return quantitativeHardwareRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderRequirement createProviderRequirement() {
		ProviderRequirementImpl providerRequirement = new ProviderRequirementImpl();
		return providerRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSRequirement createOSRequirement() {
		OSRequirementImpl osRequirement = new OSRequirementImpl();
		return osRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageRequirement createImageRequirement() {
		ImageRequirementImpl imageRequirement = new ImageRequirementImpl();
		return imageRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRequirement createSecurityRequirement() {
		SecurityRequirementImpl securityRequirement = new SecurityRequirementImpl();
		return securityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationRequirement createLocationRequirement() {
		LocationRequirementImpl locationRequirement = new LocationRequirementImpl();
		return locationRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalScaleRequirement createHorizontalScaleRequirement() {
		HorizontalScaleRequirementImpl horizontalScaleRequirement = new HorizontalScaleRequirementImpl();
		return horizontalScaleRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalScaleRequirement createVerticalScaleRequirement() {
		VerticalScaleRequirementImpl verticalScaleRequirement = new VerticalScaleRequirementImpl();
		return verticalScaleRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementOperatorType createRequirementOperatorTypeFromString(EDataType eDataType, String initialValue) {
		RequirementOperatorType result = RequirementOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequirementOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationFunctionType createOptimisationFunctionTypeFromString(EDataType eDataType, String initialValue) {
		OptimisationFunctionType result = OptimisationFunctionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptimisationFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementPackage getRequirementPackage() {
		return (RequirementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RequirementPackage getPackage() {
		return RequirementPackage.eINSTANCE;
	}

} //RequirementFactoryImpl
