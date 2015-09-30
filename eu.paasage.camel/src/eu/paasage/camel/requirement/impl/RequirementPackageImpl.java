/**
 */
package eu.paasage.camel.requirement.impl;

import eu.paasage.camel.CamelPackage;
import eu.paasage.camel.deployment.DeploymentPackage;
import eu.paasage.camel.deployment.impl.DeploymentPackageImpl;
import eu.paasage.camel.execution.ExecutionPackage;
import eu.paasage.camel.execution.impl.ExecutionPackageImpl;
import eu.paasage.camel.impl.CamelPackageImpl;
import eu.paasage.camel.location.LocationPackage;
import eu.paasage.camel.location.impl.LocationPackageImpl;
import eu.paasage.camel.metric.MetricPackage;
import eu.paasage.camel.metric.impl.MetricPackageImpl;
import eu.paasage.camel.organisation.OrganisationPackage;
import eu.paasage.camel.organisation.impl.OrganisationPackageImpl;
import eu.paasage.camel.provider.ProviderPackage;
import eu.paasage.camel.provider.impl.ProviderPackageImpl;
import eu.paasage.camel.requirement.HardRequirement;
import eu.paasage.camel.requirement.HardwareRequirement;
import eu.paasage.camel.requirement.HorizontalScaleRequirement;
import eu.paasage.camel.requirement.ImageRequirement;
import eu.paasage.camel.requirement.LocationRequirement;
import eu.paasage.camel.requirement.OSOrImageRequirement;
import eu.paasage.camel.requirement.OSRequirement;
import eu.paasage.camel.requirement.OptimisationFunctionType;
import eu.paasage.camel.requirement.OptimisationRequirement;
import eu.paasage.camel.requirement.ProviderRequirement;
import eu.paasage.camel.requirement.QualitativeHardwareRequirement;
import eu.paasage.camel.requirement.QuantitativeHardwareRequirement;
import eu.paasage.camel.requirement.Requirement;
import eu.paasage.camel.requirement.RequirementFactory;
import eu.paasage.camel.requirement.RequirementGroup;
import eu.paasage.camel.requirement.RequirementModel;
import eu.paasage.camel.requirement.RequirementOperatorType;
import eu.paasage.camel.requirement.RequirementPackage;
import eu.paasage.camel.requirement.ScaleRequirement;
import eu.paasage.camel.requirement.SecurityRequirement;
import eu.paasage.camel.requirement.ServiceLevelObjective;
import eu.paasage.camel.requirement.SoftRequirement;
import eu.paasage.camel.requirement.VerticalScaleRequirement;
import eu.paasage.camel.requirement.util.RequirementValidator;
import eu.paasage.camel.scalability.ScalabilityPackage;
import eu.paasage.camel.scalability.impl.ScalabilityPackageImpl;
import eu.paasage.camel.security.SecurityPackage;
import eu.paasage.camel.security.impl.SecurityPackageImpl;
import eu.paasage.camel.type.TypePackage;
import eu.paasage.camel.type.impl.TypePackageImpl;
import eu.paasage.camel.unit.UnitPackage;
import eu.paasage.camel.unit.impl.UnitPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementPackageImpl extends EPackageImpl implements RequirementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optimisationRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualitativeHardwareRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantitativeHardwareRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osOrImageRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaleRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalScaleRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticalScaleRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requirementOperatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum optimisationFunctionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eu.paasage.camel.requirement.RequirementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementPackageImpl() {
		super(eNS_URI, RequirementFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RequirementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementPackage init() {
		if (isInited) return (RequirementPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI);

		// Obtain or create and register package
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RequirementPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CamelPackageImpl theCamelPackage = (CamelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) instanceof CamelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) : CamelPackage.eINSTANCE);
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) instanceof ExecutionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) : ExecutionPackage.eINSTANCE);
		LocationPackageImpl theLocationPackage = (LocationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI) instanceof LocationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI) : LocationPackage.eINSTANCE);
		MetricPackageImpl theMetricPackage = (MetricPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetricPackage.eNS_URI) instanceof MetricPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetricPackage.eNS_URI) : MetricPackage.eINSTANCE);
		OrganisationPackageImpl theOrganisationPackage = (OrganisationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganisationPackage.eNS_URI) instanceof OrganisationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganisationPackage.eNS_URI) : OrganisationPackage.eINSTANCE);
		ProviderPackageImpl theProviderPackage = (ProviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI) instanceof ProviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI) : ProviderPackage.eINSTANCE);
		ScalabilityPackageImpl theScalabilityPackage = (ScalabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScalabilityPackage.eNS_URI) instanceof ScalabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScalabilityPackage.eNS_URI) : ScalabilityPackage.eINSTANCE);
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) instanceof SecurityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) : SecurityPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) : UnitPackage.eINSTANCE);

		// Create package meta-data objects
		theRequirementPackage.createPackageContents();
		theCamelPackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theLocationPackage.createPackageContents();
		theMetricPackage.createPackageContents();
		theOrganisationPackage.createPackageContents();
		theProviderPackage.createPackageContents();
		theScalabilityPackage.createPackageContents();
		theSecurityPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theUnitPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementPackage.initializePackageContents();
		theCamelPackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theLocationPackage.initializePackageContents();
		theMetricPackage.initializePackageContents();
		theOrganisationPackage.initializePackageContents();
		theProviderPackage.initializePackageContents();
		theScalabilityPackage.initializePackageContents();
		theSecurityPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theUnitPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRequirementPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RequirementValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRequirementPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementPackage.eNS_URI, theRequirementPackage);
		return theRequirementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementModel() {
		return requirementModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementModel_Requirements() {
		return (EReference)requirementModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Name() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementGroup() {
		return requirementGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementGroup_Requirements() {
		return (EReference)requirementGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementGroup_Application() {
		return (EReference)requirementGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementGroup_RequirementOperator() {
		return (EAttribute)requirementGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequirementGroup__CheckRecursiveness__RequirementGroup_HardRequirement_boolean_EList() {
		return requirementGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardRequirement() {
		return hardRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftRequirement() {
		return softRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftRequirement_Priority() {
		return (EAttribute)softRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelObjective() {
		return serviceLevelObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelObjective_CustomServiceLevel() {
		return (EReference)serviceLevelObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptimisationRequirement() {
		return optimisationRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptimisationRequirement_OptimisationFunction() {
		return (EAttribute)optimisationRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimisationRequirement_Metric() {
		return (EReference)optimisationRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimisationRequirement_Property() {
		return (EReference)optimisationRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimisationRequirement_Application() {
		return (EReference)optimisationRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimisationRequirement_Component() {
		return (EReference)optimisationRequirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareRequirement() {
		return hardwareRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualitativeHardwareRequirement() {
		return qualitativeHardwareRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualitativeHardwareRequirement_MinBenchmark() {
		return (EAttribute)qualitativeHardwareRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualitativeHardwareRequirement_MaxBenchmark() {
		return (EAttribute)qualitativeHardwareRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantitativeHardwareRequirement() {
		return quantitativeHardwareRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeHardwareRequirement_MinCPU() {
		return (EAttribute)quantitativeHardwareRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeHardwareRequirement_MaxCPU() {
		return (EAttribute)quantitativeHardwareRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeHardwareRequirement_MinCores() {
		return (EAttribute)quantitativeHardwareRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeHardwareRequirement_MaxCores() {
		return (EAttribute)quantitativeHardwareRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeHardwareRequirement_MinRAM() {
		return (EAttribute)quantitativeHardwareRequirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeHardwareRequirement_MaxRAM() {
		return (EAttribute)quantitativeHardwareRequirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeHardwareRequirement_MinStorage() {
		return (EAttribute)quantitativeHardwareRequirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeHardwareRequirement_MaxStorage() {
		return (EAttribute)quantitativeHardwareRequirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProviderRequirement() {
		return providerRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProviderRequirement_Providers() {
		return (EReference)providerRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSOrImageRequirement() {
		return osOrImageRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSRequirement() {
		return osRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSRequirement_Os() {
		return (EAttribute)osRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSRequirement_Is64os() {
		return (EAttribute)osRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageRequirement() {
		return imageRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageRequirement_ImageId() {
		return (EAttribute)imageRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityRequirement() {
		return securityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRequirement_SecurityControls() {
		return (EReference)securityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRequirement_Application() {
		return (EReference)securityRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRequirement_Component() {
		return (EReference)securityRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationRequirement() {
		return locationRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationRequirement_Locations() {
		return (EReference)locationRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScaleRequirement() {
		return scaleRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHorizontalScaleRequirement() {
		return horizontalScaleRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalScaleRequirement_MinInstances() {
		return (EAttribute)horizontalScaleRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalScaleRequirement_MaxInstances() {
		return (EAttribute)horizontalScaleRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHorizontalScaleRequirement_Component() {
		return (EReference)horizontalScaleRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerticalScaleRequirement() {
		return verticalScaleRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScaleRequirement_MinCPU() {
		return (EAttribute)verticalScaleRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScaleRequirement_MaxCPU() {
		return (EAttribute)verticalScaleRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScaleRequirement_MinCores() {
		return (EAttribute)verticalScaleRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScaleRequirement_MaxCores() {
		return (EAttribute)verticalScaleRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScaleRequirement_MinRAM() {
		return (EAttribute)verticalScaleRequirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScaleRequirement_MaxRAM() {
		return (EAttribute)verticalScaleRequirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScaleRequirement_MinStorage() {
		return (EAttribute)verticalScaleRequirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScaleRequirement_MaxStorage() {
		return (EAttribute)verticalScaleRequirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerticalScaleRequirement_Vm() {
		return (EReference)verticalScaleRequirementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequirementOperatorType() {
		return requirementOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOptimisationFunctionType() {
		return optimisationFunctionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementFactory getRequirementFactory() {
		return (RequirementFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		requirementModelEClass = createEClass(REQUIREMENT_MODEL);
		createEReference(requirementModelEClass, REQUIREMENT_MODEL__REQUIREMENTS);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__NAME);

		requirementGroupEClass = createEClass(REQUIREMENT_GROUP);
		createEReference(requirementGroupEClass, REQUIREMENT_GROUP__REQUIREMENTS);
		createEReference(requirementGroupEClass, REQUIREMENT_GROUP__APPLICATION);
		createEAttribute(requirementGroupEClass, REQUIREMENT_GROUP__REQUIREMENT_OPERATOR);
		createEOperation(requirementGroupEClass, REQUIREMENT_GROUP___CHECK_RECURSIVENESS__REQUIREMENTGROUP_HARDREQUIREMENT_BOOLEAN_ELIST);

		hardRequirementEClass = createEClass(HARD_REQUIREMENT);

		softRequirementEClass = createEClass(SOFT_REQUIREMENT);
		createEAttribute(softRequirementEClass, SOFT_REQUIREMENT__PRIORITY);

		serviceLevelObjectiveEClass = createEClass(SERVICE_LEVEL_OBJECTIVE);
		createEReference(serviceLevelObjectiveEClass, SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL);

		optimisationRequirementEClass = createEClass(OPTIMISATION_REQUIREMENT);
		createEAttribute(optimisationRequirementEClass, OPTIMISATION_REQUIREMENT__OPTIMISATION_FUNCTION);
		createEReference(optimisationRequirementEClass, OPTIMISATION_REQUIREMENT__METRIC);
		createEReference(optimisationRequirementEClass, OPTIMISATION_REQUIREMENT__PROPERTY);
		createEReference(optimisationRequirementEClass, OPTIMISATION_REQUIREMENT__APPLICATION);
		createEReference(optimisationRequirementEClass, OPTIMISATION_REQUIREMENT__COMPONENT);

		hardwareRequirementEClass = createEClass(HARDWARE_REQUIREMENT);

		qualitativeHardwareRequirementEClass = createEClass(QUALITATIVE_HARDWARE_REQUIREMENT);
		createEAttribute(qualitativeHardwareRequirementEClass, QUALITATIVE_HARDWARE_REQUIREMENT__MIN_BENCHMARK);
		createEAttribute(qualitativeHardwareRequirementEClass, QUALITATIVE_HARDWARE_REQUIREMENT__MAX_BENCHMARK);

		quantitativeHardwareRequirementEClass = createEClass(QUANTITATIVE_HARDWARE_REQUIREMENT);
		createEAttribute(quantitativeHardwareRequirementEClass, QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CPU);
		createEAttribute(quantitativeHardwareRequirementEClass, QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CPU);
		createEAttribute(quantitativeHardwareRequirementEClass, QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CORES);
		createEAttribute(quantitativeHardwareRequirementEClass, QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CORES);
		createEAttribute(quantitativeHardwareRequirementEClass, QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_RAM);
		createEAttribute(quantitativeHardwareRequirementEClass, QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_RAM);
		createEAttribute(quantitativeHardwareRequirementEClass, QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_STORAGE);
		createEAttribute(quantitativeHardwareRequirementEClass, QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_STORAGE);

		providerRequirementEClass = createEClass(PROVIDER_REQUIREMENT);
		createEReference(providerRequirementEClass, PROVIDER_REQUIREMENT__PROVIDERS);

		osOrImageRequirementEClass = createEClass(OS_OR_IMAGE_REQUIREMENT);

		osRequirementEClass = createEClass(OS_REQUIREMENT);
		createEAttribute(osRequirementEClass, OS_REQUIREMENT__OS);
		createEAttribute(osRequirementEClass, OS_REQUIREMENT__IS64OS);

		imageRequirementEClass = createEClass(IMAGE_REQUIREMENT);
		createEAttribute(imageRequirementEClass, IMAGE_REQUIREMENT__IMAGE_ID);

		securityRequirementEClass = createEClass(SECURITY_REQUIREMENT);
		createEReference(securityRequirementEClass, SECURITY_REQUIREMENT__SECURITY_CONTROLS);
		createEReference(securityRequirementEClass, SECURITY_REQUIREMENT__APPLICATION);
		createEReference(securityRequirementEClass, SECURITY_REQUIREMENT__COMPONENT);

		locationRequirementEClass = createEClass(LOCATION_REQUIREMENT);
		createEReference(locationRequirementEClass, LOCATION_REQUIREMENT__LOCATIONS);

		scaleRequirementEClass = createEClass(SCALE_REQUIREMENT);

		horizontalScaleRequirementEClass = createEClass(HORIZONTAL_SCALE_REQUIREMENT);
		createEAttribute(horizontalScaleRequirementEClass, HORIZONTAL_SCALE_REQUIREMENT__MIN_INSTANCES);
		createEAttribute(horizontalScaleRequirementEClass, HORIZONTAL_SCALE_REQUIREMENT__MAX_INSTANCES);
		createEReference(horizontalScaleRequirementEClass, HORIZONTAL_SCALE_REQUIREMENT__COMPONENT);

		verticalScaleRequirementEClass = createEClass(VERTICAL_SCALE_REQUIREMENT);
		createEAttribute(verticalScaleRequirementEClass, VERTICAL_SCALE_REQUIREMENT__MIN_CPU);
		createEAttribute(verticalScaleRequirementEClass, VERTICAL_SCALE_REQUIREMENT__MAX_CPU);
		createEAttribute(verticalScaleRequirementEClass, VERTICAL_SCALE_REQUIREMENT__MIN_CORES);
		createEAttribute(verticalScaleRequirementEClass, VERTICAL_SCALE_REQUIREMENT__MAX_CORES);
		createEAttribute(verticalScaleRequirementEClass, VERTICAL_SCALE_REQUIREMENT__MIN_RAM);
		createEAttribute(verticalScaleRequirementEClass, VERTICAL_SCALE_REQUIREMENT__MAX_RAM);
		createEAttribute(verticalScaleRequirementEClass, VERTICAL_SCALE_REQUIREMENT__MIN_STORAGE);
		createEAttribute(verticalScaleRequirementEClass, VERTICAL_SCALE_REQUIREMENT__MAX_STORAGE);
		createEReference(verticalScaleRequirementEClass, VERTICAL_SCALE_REQUIREMENT__VM);

		// Create enums
		requirementOperatorTypeEEnum = createEEnum(REQUIREMENT_OPERATOR_TYPE);
		optimisationFunctionTypeEEnum = createEEnum(OPTIMISATION_FUNCTION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CamelPackage theCamelPackage = (CamelPackage)EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI);
		MetricPackage theMetricPackage = (MetricPackage)EPackage.Registry.INSTANCE.getEPackage(MetricPackage.eNS_URI);
		DeploymentPackage theDeploymentPackage = (DeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI);
		OrganisationPackage theOrganisationPackage = (OrganisationPackage)EPackage.Registry.INSTANCE.getEPackage(OrganisationPackage.eNS_URI);
		SecurityPackage theSecurityPackage = (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);
		LocationPackage theLocationPackage = (LocationPackage)EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		requirementModelEClass.getESuperTypes().add(theCamelPackage.getModel());
		requirementGroupEClass.getESuperTypes().add(this.getRequirement());
		hardRequirementEClass.getESuperTypes().add(this.getRequirement());
		softRequirementEClass.getESuperTypes().add(this.getRequirement());
		serviceLevelObjectiveEClass.getESuperTypes().add(this.getHardRequirement());
		optimisationRequirementEClass.getESuperTypes().add(this.getSoftRequirement());
		hardwareRequirementEClass.getESuperTypes().add(this.getHardRequirement());
		qualitativeHardwareRequirementEClass.getESuperTypes().add(this.getHardwareRequirement());
		quantitativeHardwareRequirementEClass.getESuperTypes().add(this.getHardwareRequirement());
		providerRequirementEClass.getESuperTypes().add(this.getHardRequirement());
		osOrImageRequirementEClass.getESuperTypes().add(this.getHardRequirement());
		osRequirementEClass.getESuperTypes().add(this.getOSOrImageRequirement());
		imageRequirementEClass.getESuperTypes().add(this.getOSOrImageRequirement());
		securityRequirementEClass.getESuperTypes().add(this.getHardRequirement());
		locationRequirementEClass.getESuperTypes().add(this.getHardRequirement());
		scaleRequirementEClass.getESuperTypes().add(this.getHardRequirement());
		horizontalScaleRequirementEClass.getESuperTypes().add(this.getScaleRequirement());
		verticalScaleRequirementEClass.getESuperTypes().add(this.getScaleRequirement());

		// Initialize classes, features, and operations; add parameters
		initEClass(requirementModelEClass, RequirementModel.class, "RequirementModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementModel_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, RequirementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Name(), ecorePackage.getEString(), "name", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementGroupEClass, RequirementGroup.class, "RequirementGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementGroup_Requirements(), this.getRequirement(), null, "requirements", null, 1, -1, RequirementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementGroup_Application(), theCamelPackage.getApplication(), null, "application", null, 0, -1, RequirementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementGroup_RequirementOperator(), this.getRequirementOperatorType(), "requirementOperator", null, 1, 1, RequirementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRequirementGroup__CheckRecursiveness__RequirementGroup_HardRequirement_boolean_EList(), ecorePackage.getEBoolean(), "checkRecursiveness", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRequirementGroup(), "rg1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHardRequirement(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "resources", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRequirementGroup(), "context", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(hardRequirementEClass, HardRequirement.class, "HardRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softRequirementEClass, SoftRequirement.class, "SoftRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftRequirement_Priority(), ecorePackage.getEDouble(), "priority", null, 0, 1, SoftRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelObjectiveEClass, ServiceLevelObjective.class, "ServiceLevelObjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceLevelObjective_CustomServiceLevel(), theMetricPackage.getCondition(), null, "customServiceLevel", null, 1, 1, ServiceLevelObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optimisationRequirementEClass, OptimisationRequirement.class, "OptimisationRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptimisationRequirement_OptimisationFunction(), this.getOptimisationFunctionType(), "optimisationFunction", null, 1, 1, OptimisationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptimisationRequirement_Metric(), theMetricPackage.getMetric(), null, "metric", null, 0, 1, OptimisationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptimisationRequirement_Property(), theMetricPackage.getProperty(), null, "property", null, 0, 1, OptimisationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptimisationRequirement_Application(), theCamelPackage.getApplication(), null, "application", null, 0, 1, OptimisationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptimisationRequirement_Component(), theDeploymentPackage.getComponent(), null, "component", null, 0, 1, OptimisationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareRequirementEClass, HardwareRequirement.class, "HardwareRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qualitativeHardwareRequirementEClass, QualitativeHardwareRequirement.class, "QualitativeHardwareRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualitativeHardwareRequirement_MinBenchmark(), ecorePackage.getEDouble(), "minBenchmark", null, 0, 1, QualitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualitativeHardwareRequirement_MaxBenchmark(), ecorePackage.getEDouble(), "maxBenchmark", null, 0, 1, QualitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantitativeHardwareRequirementEClass, QuantitativeHardwareRequirement.class, "QuantitativeHardwareRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantitativeHardwareRequirement_MinCPU(), ecorePackage.getEDouble(), "minCPU", null, 0, 1, QuantitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantitativeHardwareRequirement_MaxCPU(), ecorePackage.getEDouble(), "maxCPU", null, 0, 1, QuantitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantitativeHardwareRequirement_MinCores(), ecorePackage.getEInt(), "minCores", null, 0, 1, QuantitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantitativeHardwareRequirement_MaxCores(), ecorePackage.getEInt(), "maxCores", null, 0, 1, QuantitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantitativeHardwareRequirement_MinRAM(), ecorePackage.getEInt(), "minRAM", null, 0, 1, QuantitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantitativeHardwareRequirement_MaxRAM(), ecorePackage.getEInt(), "maxRAM", null, 0, 1, QuantitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantitativeHardwareRequirement_MinStorage(), ecorePackage.getEInt(), "minStorage", null, 0, 1, QuantitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantitativeHardwareRequirement_MaxStorage(), ecorePackage.getEInt(), "maxStorage", null, 0, 1, QuantitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providerRequirementEClass, ProviderRequirement.class, "ProviderRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProviderRequirement_Providers(), theOrganisationPackage.getCloudProvider(), null, "providers", null, 1, -1, ProviderRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osOrImageRequirementEClass, OSOrImageRequirement.class, "OSOrImageRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(osRequirementEClass, OSRequirement.class, "OSRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOSRequirement_Os(), ecorePackage.getEString(), "os", null, 1, 1, OSRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSRequirement_Is64os(), ecorePackage.getEBoolean(), "is64os", "true", 1, 1, OSRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageRequirementEClass, ImageRequirement.class, "ImageRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageRequirement_ImageId(), ecorePackage.getEString(), "imageId", null, 1, 1, ImageRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityRequirementEClass, SecurityRequirement.class, "SecurityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityRequirement_SecurityControls(), theSecurityPackage.getSecurityControl(), null, "securityControls", null, 1, -1, SecurityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityRequirement_Application(), theCamelPackage.getApplication(), null, "application", null, 0, 1, SecurityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityRequirement_Component(), theDeploymentPackage.getInternalComponent(), null, "component", null, 0, 1, SecurityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationRequirementEClass, LocationRequirement.class, "LocationRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationRequirement_Locations(), theLocationPackage.getLocation(), null, "locations", null, 1, -1, LocationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scaleRequirementEClass, ScaleRequirement.class, "ScaleRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(horizontalScaleRequirementEClass, HorizontalScaleRequirement.class, "HorizontalScaleRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHorizontalScaleRequirement_MinInstances(), ecorePackage.getEInt(), "minInstances", null, 1, 1, HorizontalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalScaleRequirement_MaxInstances(), ecorePackage.getEInt(), "maxInstances", null, 1, 1, HorizontalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHorizontalScaleRequirement_Component(), theDeploymentPackage.getInternalComponent(), null, "component", null, 1, 1, HorizontalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verticalScaleRequirementEClass, VerticalScaleRequirement.class, "VerticalScaleRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerticalScaleRequirement_MinCPU(), ecorePackage.getEDouble(), "minCPU", null, 0, 1, VerticalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScaleRequirement_MaxCPU(), ecorePackage.getEDouble(), "maxCPU", null, 0, 1, VerticalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScaleRequirement_MinCores(), ecorePackage.getEInt(), "minCores", null, 0, 1, VerticalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScaleRequirement_MaxCores(), ecorePackage.getEInt(), "maxCores", null, 0, 1, VerticalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScaleRequirement_MinRAM(), ecorePackage.getEInt(), "minRAM", null, 0, 1, VerticalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScaleRequirement_MaxRAM(), ecorePackage.getEInt(), "maxRAM", null, 0, 1, VerticalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScaleRequirement_MinStorage(), ecorePackage.getEInt(), "minStorage", null, 0, 1, VerticalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScaleRequirement_MaxStorage(), ecorePackage.getEInt(), "maxStorage", null, 0, 1, VerticalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerticalScaleRequirement_Vm(), theDeploymentPackage.getVM(), null, "vm", null, 1, 1, VerticalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(requirementOperatorTypeEEnum, RequirementOperatorType.class, "RequirementOperatorType");
		addEEnumLiteral(requirementOperatorTypeEEnum, RequirementOperatorType.AND);
		addEEnumLiteral(requirementOperatorTypeEEnum, RequirementOperatorType.OR);
		addEEnumLiteral(requirementOperatorTypeEEnum, RequirementOperatorType.XOR);

		initEEnum(optimisationFunctionTypeEEnum, OptimisationFunctionType.class, "OptimisationFunctionType");
		addEEnumLiteral(optimisationFunctionTypeEEnum, OptimisationFunctionType.MINIMISE);
		addEEnumLiteral(optimisationFunctionTypeEEnum, OptimisationFunctionType.MAXIMISE);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmofAnnotations() {
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";	
		addAnnotation
		  (getRequirement_Name(), 
		   source, 
		   new String[] {
			 "body", "SecurityCapability",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getRequirementGroup_RequirementOperator(), 
		   source, 
		   new String[] {
			 "body", "Requires"
		   });	
		addAnnotation
		  (getSoftRequirement_Priority(), 
		   source, 
		   new String[] {
			 "body", "BinaryEventPattern",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getSoftRequirement_Priority(), 
		   source, 
		   new String[] {
			 "body", "BinaryEventPattern",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getQualitativeHardwareRequirement_MinBenchmark(), 
		   source, 
		   new String[] {
			 "body", "NonFunctionalEvent",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getQualitativeHardwareRequirement_MinBenchmark(), 
		   source, 
		   new String[] {
			 "body", "NonFunctionalEvent",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getQuantitativeHardwareRequirement_MaxCores(), 
		   source, 
		   new String[] {
			 "body", "EventInstance",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getQuantitativeHardwareRequirement_MaxCores(), 
		   source, 
		   new String[] {
			 "body", "EventInstance",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getQuantitativeHardwareRequirement_MinRAM(), 
		   source, 
		   new String[] {
			 "body", "EventInstance",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getQuantitativeHardwareRequirement_MinRAM(), 
		   source, 
		   new String[] {
			 "body", "EventInstance",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getOSRequirement_Is64os(), 
		   source, 
		   new String[] {
			 "body", "HorizontalScalingAction",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getOSRequirement_Is64os(), 
		   source, 
		   new String[] {
			 "body", "HorizontalScalingAction",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getHorizontalScaleRequirement_MaxInstances(), 
		   source, 
		   new String[] {
			 "body", "ScalabilityRule",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getVerticalScaleRequirement_MinCPU(), 
		   source, 
		   new String[] {
			 "body", "ScalabilityRule",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getVerticalScaleRequirement_MaxCores(), 
		   source, 
		   new String[] {
			 "body", "ScalabilityRule",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getVerticalScaleRequirement_MinRAM(), 
		   source, 
		   new String[] {
			 "body", "Property",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getVerticalScaleRequirement_MinRAM(), 
		   source, 
		   new String[] {
			 "body", "ScalabilityRule",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getVerticalScaleRequirement_MaxRAM(), 
		   source, 
		   new String[] {
			 "body", "ScalabilityRule",
			 "unique", "false",
			 "upper", "*"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (requirementGroupEClass, 
		   source, 
		   new String[] {
			 "constraints", "applications_in_sub_groups_in_group requirement_group_no_conflict_reqs requirements_in_group_refer_to_group_applications"
		   });	
		addAnnotation
		  (softRequirementEClass, 
		   source, 
		   new String[] {
			 "constraints", "non_negative_priorities_for_soft_requirement"
		   });	
		addAnnotation
		  (optimisationRequirementEClass, 
		   source, 
		   new String[] {
			 "constraints", "optimization_requirement_metric_or_prop"
		   });	
		addAnnotation
		  (quantitativeHardwareRequirementEClass, 
		   source, 
		   new String[] {
			 "constraints", "one_alternative_provided_in_quantitative_req quantitative_req_correct_input"
		   });	
		addAnnotation
		  (securityRequirementEClass, 
		   source, 
		   new String[] {
			 "constraints", "security_req_component_in_app"
		   });	
		addAnnotation
		  (horizontalScaleRequirementEClass, 
		   source, 
		   new String[] {
			 "constraints", "horiz_scale_requirement_min_max_enforcement"
		   });	
		addAnnotation
		  (verticalScaleRequirementEClass, 
		   source, 
		   new String[] {
			 "constraints", "vert_scale_requirement_correct_param_vals vert_scale_requirement_activ_one_alt"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (requirementGroupEClass, 
		   source, 
		   new String[] {
			 "applications_in_sub_groups_in_group", "Tuple {\n\tmessage : String = \'RequirementGroup: \' + self.name +\n\t\t\t\t\t\' has one or more sub-groups that map to applications which are not included in the group\\\'s list of applications\',\n\tstatus : Boolean = self.requirements\n\t\t\t\t\t->forAll(p | p.oclIsTypeOf(RequirementGroup) implies p.oclAsType(RequirementGroup).application\n\t\t\t\t\t\t->forAll(a | self.application\n\t\t\t\t\t\t\t->includes(a)))\n}.status",
			 "requirement_group_no_conflict_reqs", "Tuple {\n\tmessage : String = \'RequirementGroup: \' + self.name +\n\t\t\t\t\t\' has two or more scale requirements of the same type that are conflicting, i.e., refer to the same VM (in case of vertical requirements) or component (in case of horizontal requirements)\',\n\tstatus : Boolean = if\n\t\t\t\t\t\t(self.requirementOperator = RequirementOperatorType::AND)\n\t\t\t\t\tthen self.requirements\n\t\t\t\t\t\t->forAll(p1, p2 | (p1 <> p2 and p1.oclIsKindOf(camel::requirement::ScaleRequirement) and\n\t\t\t\t\t\t\tp2.oclIsKindOf(camel::requirement::ScaleRequirement) and p1.oclType() = p2.oclType()) implies if\n\t\t\t\t\t\t\t\t(p1.oclIsTypeOf(camel::requirement::VerticalScaleRequirement))\n\t\t\t\t\t\t\tthen p1.oclAsType(camel::requirement::VerticalScaleRequirement).vm <>\n\t\t\t\t\t\t\t\tp2.oclAsType(camel::requirement::VerticalScaleRequirement).vm\n\t\t\t\t\t\t\telse p1.oclAsType(camel::requirement::HorizontalScaleRequirement).component <>\n\t\t\t\t\t\t\t\tp2.oclAsType(camel::requirement::HorizontalScaleRequirement).component\n\t\t\t\t\t\t\tendif)\n\t\t\t\t\telse true\n\t\t\t\t\tendif\n}.status",
			 "requirements_in_group_refer_to_group_applications", "Tuple {\n\tmessage : String = \'RequirementGroup: \' + self.name +\n\t\t\t\t\t\' has one or more requirements that map to an application which is not included in the group\\\'s list of applications\',\n\tstatus : Boolean = if\n\t\t\t\t\t\t(application\n\t\t\t\t\t\t->notEmpty())\n\t\t\t\t\tthen requirements\n\t\t\t\t\t\t->forAll(p | if (p.oclIsTypeOf(camel::requirement::ServiceLevelObjective))\n\t\t\t\t\t\t\tthen if\n\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclIsTypeOf(camel::metric::MetricCondition))\n\t\t\t\t\t\t\t\tthen application\n\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.application)\n\t\t\t\t\t\t\t\telse if\n\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclIsTypeOf(camel::metric::MetricCondition))\n\t\t\t\t\t\t\t\t\tthen if\n\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.application\n\t\t\t\t\t\t\t\t\t\t\t<> null)\n\t\t\t\t\t\t\t\t\t\tthen application\n\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.application)\n\t\t\t\t\t\t\t\t\t\telse if\n\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.component\n\t\t\t\t\t\t\t\t\t\t\t\t<> null)\n\t\t\t\t\t\t\t\t\t\t\tthen if\n\t\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.component.oclIsTypeOf(camel::deployment::InternalComponent))\n\t\t\t\t\t\t\t\t\t\t\t\tthen application\n\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.internalComponents\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.component.oclAsType(camel::deployment::InternalComponent)))))\n\t\t\t\t\t\t\t\t\t\t\t\telse application\n\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.vms\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.component.oclAsType(camel::deployment::VM)))))\n\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\telse if\n\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclIsTypeOf(camel::metric::PropertyCondition))\n\t\t\t\t\t\t\t\t\t\tthen if\n\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.application\n\t\t\t\t\t\t\t\t\t\t\t\t<> null)\n\t\t\t\t\t\t\t\t\t\t\tthen application\n\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.application)\n\t\t\t\t\t\t\t\t\t\t\telse if\n\t\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.component\n\t\t\t\t\t\t\t\t\t\t\t\t\t<> null)\n\t\t\t\t\t\t\t\t\t\t\t\tthen if\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.component.oclIsTypeOf(camel::deployment::InternalComponent))\n\t\t\t\t\t\t\t\t\t\t\t\t\tthen application\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.internalComponents\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.component.oclAsType(camel::deployment::InternalComponent)))))\n\t\t\t\t\t\t\t\t\t\t\t\t\telse application\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.vms\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.component.oclAsType(camel::deployment::VM)))))\n\t\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (p.oclIsTypeOf(camel::requirement::OptimisationRequirement))\n\t\t\t\t\t\t\t\tthen if (p.oclAsType(camel::requirement::OptimisationRequirement).metric <> null or\n\t\t\t\t\t\t\t\t\t\tp.oclAsType(camel::requirement::OptimisationRequirement).property <> null)\n\t\t\t\t\t\t\t\t\tthen if (p.oclAsType(camel::requirement::OptimisationRequirement).application <> null)\n\t\t\t\t\t\t\t\t\t\tthen application\n\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::OptimisationRequirement).application)\n\t\t\t\t\t\t\t\t\t\telse if (p.oclAsType(camel::requirement::OptimisationRequirement).component <> null)\n\t\t\t\t\t\t\t\t\t\t\tthen if\n\t\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::OptimisationRequirement).component.oclIsTypeOf(camel::deployment::InternalComponent))\n\t\t\t\t\t\t\t\t\t\t\t\tthen application\n\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.internalComponents\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::OptimisationRequirement).component.oclAsType(camel::deployment::InternalComponent)))))\n\t\t\t\t\t\t\t\t\t\t\t\telse application\n\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.vms\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::OptimisationRequirement).component.oclAsType(camel::deployment::VM)))))\n\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse if (p.oclIsTypeOf(camel::requirement::SecurityRequirement))\n\t\t\t\t\t\t\t\t\tthen if (p.oclAsType(camel::requirement::SecurityRequirement).application <> null)\n\t\t\t\t\t\t\t\t\t\tthen application\n\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::SecurityRequirement).application)\n\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif)\n\t\t\t\t\telse true\n\t\t\t\t\tendif\n}.status"
		   });	
		addAnnotation
		  (softRequirementEClass, 
		   source, 
		   new String[] {
			 "non_negative_priorities_for_soft_requirement", "Tuple {\n\tmessage : String = \'Requirement: \' + self.name + \' has a negative priority: \' +\n\t\t\t\t\tself.priority.toString(),\n\tstatus : Boolean = self.priority >= 0.0\n}.status"
		   });	
		addAnnotation
		  (optimisationRequirementEClass, 
		   source, 
		   new String[] {
			 "optimization_requirement_metric_or_prop", "Tuple {\n\tmessage : String = \'In OptimizationRequirement: \' + self.name +\n\t\t\t\t\t\' no metric or property has been given\',\n\tstatus : Boolean = (metric <> null and property = null and (application <> null or\n\t\t\t\t\tcomponent <> null)) or (property <> null and metric = null and (application <> null or component <> null))\n}.status"
		   });	
		addAnnotation
		  (quantitativeHardwareRequirementEClass, 
		   source, 
		   new String[] {
			 "one_alternative_provided_in_quantitative_req", "Tuple {\n\tmessage : String = \'QuantitativeHardwareRequirement with name: \' + self.name +\n\t\t\t\t\t\' should be have at least one min or max value for a VM characteristic\',\n\tstatus : Boolean = ((minRAM > 0 or maxRAM > 0)) or\n\t\t\t\t\t((minStorage > 0 or maxStorage > 0)) or (minCores > 0 or maxCores > 0)\n}.status",
			 "quantitative_req_correct_input", "Tuple {\n\tmessage : String = \'Correct (non-negative) values for the characteristics of VM in QuantitativeHardwareRequirement with name: \'\n\t\t\t\t\t+ self.name + \' should be provided\',\n\tstatus : Boolean = minRAM >= 0 and maxRAM >= 0 and minCores >= 0 and maxCores >= 0 and\n\t\t\t\t\tminStorage >= 0 and maxStorage >= 0\n}.status"
		   });	
		addAnnotation
		  (securityRequirementEClass, 
		   source, 
		   new String[] {
			 "security_req_component_in_app", "Tuple {\n\tmessage : String = \'SecurityRequirement\' + self.name +\n\t\t\t\t\t\' maps to a component  which is not included in any deploymentModel of the respective application referenced\',\n\tstatus : Boolean = (application\n\t\t\t\t\t<> null and component <> null) implies application.deploymentModels\n\t\t\t\t\t->exists(d | (d.internalComponents\n\t\t\t\t\t\t->includes(component)))\n}.status"
		   });	
		addAnnotation
		  (horizontalScaleRequirementEClass, 
		   source, 
		   new String[] {
			 "horiz_scale_requirement_min_max_enforcement", "Tuple {\n\tmessage : String = \'HorizontalScaleRequirement: \' + self.name +\n\t\t\t\t\t\' has wrong values for the minInstances and/or maxInstance properties. The minInstances value should be positive, the maxInstances value positive or equal to -1, and when maxInstances value is positive, then minInstances value should not be greater than it\',\n\tstatus : Boolean = self.minInstances\n\t\t\t\t\t> 0 and (self.maxInstances > 0 or self.maxInstances = - 1) and (self.maxInstances <> - 1 implies self.minInstances\n\t\t\t\t\t<= self.maxInstances)\n}.status"
		   });	
		addAnnotation
		  (verticalScaleRequirementEClass, 
		   source, 
		   new String[] {
			 "vert_scale_requirement_correct_param_vals", "Tuple {\n\tmessage : String = \'In VerticalScaleRequirement: \' + self.name +\n\t\t\t\t\t\' there are wrong combinations of values mapping to the respective VM characteristics. For each characteristic, the min value should be non-negative, the max value greater or equal to -1 and if the max value is greater than -1, then it should be greater or equal to the min value\',\n\tstatus : Boolean = minCores\n\t\t\t\t\t>= 0 and maxCores >= - 1 and (maxCores <> - 1 implies minCores <= maxCores) and minRAM >= 0 and maxRAM >= - 1 and\n\t\t\t\t\t(maxRAM <> - 1 implies minRAM <= maxRAM) and minCPU >= 0 and maxCPU >= - 1 and (maxCPU <> - 1 implies minCPU <=\n\t\t\t\t\tmaxCPU) and minStorage >= 0 and maxStorage >= - 1 and (maxStorage <> - 1 implies minStorage <= maxStorage)\n}.status",
			 "vert_scale_requirement_activ_one_alt", "Tuple {\n\tmessage : String = \'In VerticalScaleRequirement: \' + self.name +\n\t\t\t\t\t\' the maximum value for no VM characteristic has been specified\',\n\tstatus : Boolean = maxCores > 0 or maxCores = - 1 or maxCPU > 0 or\n\t\t\t\t\tmaxCPU = - 1 or maxRAM > 0 or maxRAM = - 1 or maxStorage > 0 or maxStorage = - 1\n}.status"
		   });
	}

} //RequirementPackageImpl
