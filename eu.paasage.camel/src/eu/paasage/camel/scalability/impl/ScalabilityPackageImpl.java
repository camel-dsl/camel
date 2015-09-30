/**
 */
package eu.paasage.camel.scalability.impl;

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
import eu.paasage.camel.requirement.RequirementPackage;
import eu.paasage.camel.requirement.impl.RequirementPackageImpl;
import eu.paasage.camel.scalability.BinaryEventPattern;
import eu.paasage.camel.scalability.BinaryPatternOperatorType;
import eu.paasage.camel.scalability.Event;
import eu.paasage.camel.scalability.EventInstance;
import eu.paasage.camel.scalability.EventPattern;
import eu.paasage.camel.scalability.FunctionalEvent;
import eu.paasage.camel.scalability.HorizontalScalingAction;
import eu.paasage.camel.scalability.NonFunctionalEvent;
import eu.paasage.camel.scalability.ScalabilityFactory;
import eu.paasage.camel.scalability.ScalabilityModel;
import eu.paasage.camel.scalability.ScalabilityPackage;
import eu.paasage.camel.scalability.ScalabilityRule;
import eu.paasage.camel.scalability.ScalingAction;
import eu.paasage.camel.scalability.SimpleEvent;
import eu.paasage.camel.scalability.StatusType;
import eu.paasage.camel.scalability.Timer;
import eu.paasage.camel.scalability.TimerType;
import eu.paasage.camel.scalability.UnaryEventPattern;
import eu.paasage.camel.scalability.UnaryPatternOperatorType;
import eu.paasage.camel.scalability.VerticalScalingAction;
import eu.paasage.camel.scalability.util.ScalabilityValidator;
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
public class ScalabilityPackageImpl extends EPackageImpl implements ScalabilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalabilityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryEventPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryEventPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonFunctionalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalabilityRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalingActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalScalingActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticalScalingActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryPatternOperatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryPatternOperatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusTypeEEnum = null;

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
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScalabilityPackageImpl() {
		super(eNS_URI, ScalabilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ScalabilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScalabilityPackage init() {
		if (isInited) return (ScalabilityPackage)EPackage.Registry.INSTANCE.getEPackage(ScalabilityPackage.eNS_URI);

		// Obtain or create and register package
		ScalabilityPackageImpl theScalabilityPackage = (ScalabilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScalabilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScalabilityPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CamelPackageImpl theCamelPackage = (CamelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) instanceof CamelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) : CamelPackage.eINSTANCE);
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) instanceof ExecutionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) : ExecutionPackage.eINSTANCE);
		LocationPackageImpl theLocationPackage = (LocationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI) instanceof LocationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI) : LocationPackage.eINSTANCE);
		MetricPackageImpl theMetricPackage = (MetricPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetricPackage.eNS_URI) instanceof MetricPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetricPackage.eNS_URI) : MetricPackage.eINSTANCE);
		OrganisationPackageImpl theOrganisationPackage = (OrganisationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganisationPackage.eNS_URI) instanceof OrganisationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganisationPackage.eNS_URI) : OrganisationPackage.eINSTANCE);
		ProviderPackageImpl theProviderPackage = (ProviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI) instanceof ProviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI) : ProviderPackage.eINSTANCE);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) : RequirementPackage.eINSTANCE);
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) instanceof SecurityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) : SecurityPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) : UnitPackage.eINSTANCE);

		// Create package meta-data objects
		theScalabilityPackage.createPackageContents();
		theCamelPackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theLocationPackage.createPackageContents();
		theMetricPackage.createPackageContents();
		theOrganisationPackage.createPackageContents();
		theProviderPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theSecurityPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theUnitPackage.createPackageContents();

		// Initialize created meta-data
		theScalabilityPackage.initializePackageContents();
		theCamelPackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theLocationPackage.initializePackageContents();
		theMetricPackage.initializePackageContents();
		theOrganisationPackage.initializePackageContents();
		theProviderPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theSecurityPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theUnitPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theScalabilityPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ScalabilityValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theScalabilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScalabilityPackage.eNS_URI, theScalabilityPackage);
		return theScalabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalabilityModel() {
		return scalabilityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalabilityModel_Rules() {
		return (EReference)scalabilityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalabilityModel_Events() {
		return (EReference)scalabilityModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalabilityModel_EventInstances() {
		return (EReference)scalabilityModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalabilityModel_Actions() {
		return (EReference)scalabilityModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalabilityModel_Patterns() {
		return (EReference)scalabilityModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalabilityModel_Timers() {
		return (EReference)scalabilityModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalabilityModel_ScaleRequirements() {
		return (EReference)scalabilityModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Name() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventPattern() {
		return eventPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventPattern_Timer() {
		return (EReference)eventPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventPattern__IncludesEvent__SimpleEvent() {
		return eventPatternEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventPattern__IncludesLeftEvent__SimpleEvent() {
		return eventPatternEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventPattern__IncludesRightEvent__SimpleEvent() {
		return eventPatternEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryEventPattern() {
		return binaryEventPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryEventPattern_LeftEvent() {
		return (EReference)binaryEventPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryEventPattern_RightEvent() {
		return (EReference)binaryEventPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryEventPattern_LowerOccurrenceBound() {
		return (EAttribute)binaryEventPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryEventPattern_UpperOccurrenceBound() {
		return (EAttribute)binaryEventPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryEventPattern_Operator() {
		return (EAttribute)binaryEventPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryEventPattern() {
		return unaryEventPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryEventPattern_Event() {
		return (EReference)unaryEventPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryEventPattern_OccurrenceNum() {
		return (EAttribute)unaryEventPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryEventPattern_Operator() {
		return (EAttribute)unaryEventPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleEvent() {
		return simpleEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalEvent() {
		return functionalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalEvent_FunctionalType() {
		return (EAttribute)functionalEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonFunctionalEvent() {
		return nonFunctionalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonFunctionalEvent_MetricCondition() {
		return (EReference)nonFunctionalEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonFunctionalEvent_IsViolation() {
		return (EAttribute)nonFunctionalEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventInstance() {
		return eventInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventInstance_Name() {
		return (EAttribute)eventInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventInstance_Status() {
		return (EAttribute)eventInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventInstance_Layer() {
		return (EAttribute)eventInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventInstance_Event() {
		return (EReference)eventInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventInstance_MetricInstance() {
		return (EReference)eventInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventInstance__EqualLayer__LayerType_LayerType() {
		return eventInstanceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalabilityRule() {
		return scalabilityRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScalabilityRule_Name() {
		return (EAttribute)scalabilityRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalabilityRule_Event() {
		return (EReference)scalabilityRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalabilityRule_Actions() {
		return (EReference)scalabilityRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalabilityRule_Entity() {
		return (EReference)scalabilityRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalabilityRule_ScaleRequirements() {
		return (EReference)scalabilityRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalingAction() {
		return scalingActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalingAction_Vm() {
		return (EReference)scalingActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHorizontalScalingAction() {
		return horizontalScalingActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalScalingAction_Count() {
		return (EAttribute)horizontalScalingActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHorizontalScalingAction_InternalComponent() {
		return (EReference)horizontalScalingActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerticalScalingAction() {
		return verticalScalingActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScalingAction_MemoryUpdate() {
		return (EAttribute)verticalScalingActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScalingAction_CPUUpdate() {
		return (EAttribute)verticalScalingActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScalingAction_CoreUpdate() {
		return (EAttribute)verticalScalingActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScalingAction_StorageUpdate() {
		return (EAttribute)verticalScalingActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScalingAction_IoUpdate() {
		return (EAttribute)verticalScalingActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScalingAction_NetworkUpdate() {
		return (EAttribute)verticalScalingActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimer() {
		return timerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimer_Type() {
		return (EAttribute)timerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimer_TimeValue() {
		return (EAttribute)timerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimer_MaxOccurrenceNum() {
		return (EAttribute)timerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimer_Unit() {
		return (EReference)timerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimer_Name() {
		return (EAttribute)timerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryPatternOperatorType() {
		return binaryPatternOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimerType() {
		return timerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnaryPatternOperatorType() {
		return unaryPatternOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatusType() {
		return statusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalabilityFactory getScalabilityFactory() {
		return (ScalabilityFactory)getEFactoryInstance();
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
		scalabilityModelEClass = createEClass(SCALABILITY_MODEL);
		createEReference(scalabilityModelEClass, SCALABILITY_MODEL__RULES);
		createEReference(scalabilityModelEClass, SCALABILITY_MODEL__EVENTS);
		createEReference(scalabilityModelEClass, SCALABILITY_MODEL__EVENT_INSTANCES);
		createEReference(scalabilityModelEClass, SCALABILITY_MODEL__ACTIONS);
		createEReference(scalabilityModelEClass, SCALABILITY_MODEL__PATTERNS);
		createEReference(scalabilityModelEClass, SCALABILITY_MODEL__TIMERS);
		createEReference(scalabilityModelEClass, SCALABILITY_MODEL__SCALE_REQUIREMENTS);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__NAME);

		eventPatternEClass = createEClass(EVENT_PATTERN);
		createEReference(eventPatternEClass, EVENT_PATTERN__TIMER);
		createEOperation(eventPatternEClass, EVENT_PATTERN___INCLUDES_EVENT__SIMPLEEVENT);
		createEOperation(eventPatternEClass, EVENT_PATTERN___INCLUDES_LEFT_EVENT__SIMPLEEVENT);
		createEOperation(eventPatternEClass, EVENT_PATTERN___INCLUDES_RIGHT_EVENT__SIMPLEEVENT);

		binaryEventPatternEClass = createEClass(BINARY_EVENT_PATTERN);
		createEReference(binaryEventPatternEClass, BINARY_EVENT_PATTERN__LEFT_EVENT);
		createEReference(binaryEventPatternEClass, BINARY_EVENT_PATTERN__RIGHT_EVENT);
		createEAttribute(binaryEventPatternEClass, BINARY_EVENT_PATTERN__LOWER_OCCURRENCE_BOUND);
		createEAttribute(binaryEventPatternEClass, BINARY_EVENT_PATTERN__UPPER_OCCURRENCE_BOUND);
		createEAttribute(binaryEventPatternEClass, BINARY_EVENT_PATTERN__OPERATOR);

		unaryEventPatternEClass = createEClass(UNARY_EVENT_PATTERN);
		createEReference(unaryEventPatternEClass, UNARY_EVENT_PATTERN__EVENT);
		createEAttribute(unaryEventPatternEClass, UNARY_EVENT_PATTERN__OCCURRENCE_NUM);
		createEAttribute(unaryEventPatternEClass, UNARY_EVENT_PATTERN__OPERATOR);

		simpleEventEClass = createEClass(SIMPLE_EVENT);

		functionalEventEClass = createEClass(FUNCTIONAL_EVENT);
		createEAttribute(functionalEventEClass, FUNCTIONAL_EVENT__FUNCTIONAL_TYPE);

		nonFunctionalEventEClass = createEClass(NON_FUNCTIONAL_EVENT);
		createEReference(nonFunctionalEventEClass, NON_FUNCTIONAL_EVENT__METRIC_CONDITION);
		createEAttribute(nonFunctionalEventEClass, NON_FUNCTIONAL_EVENT__IS_VIOLATION);

		eventInstanceEClass = createEClass(EVENT_INSTANCE);
		createEAttribute(eventInstanceEClass, EVENT_INSTANCE__NAME);
		createEAttribute(eventInstanceEClass, EVENT_INSTANCE__STATUS);
		createEAttribute(eventInstanceEClass, EVENT_INSTANCE__LAYER);
		createEReference(eventInstanceEClass, EVENT_INSTANCE__EVENT);
		createEReference(eventInstanceEClass, EVENT_INSTANCE__METRIC_INSTANCE);
		createEOperation(eventInstanceEClass, EVENT_INSTANCE___EQUAL_LAYER__LAYERTYPE_LAYERTYPE);

		scalabilityRuleEClass = createEClass(SCALABILITY_RULE);
		createEAttribute(scalabilityRuleEClass, SCALABILITY_RULE__NAME);
		createEReference(scalabilityRuleEClass, SCALABILITY_RULE__EVENT);
		createEReference(scalabilityRuleEClass, SCALABILITY_RULE__ACTIONS);
		createEReference(scalabilityRuleEClass, SCALABILITY_RULE__ENTITY);
		createEReference(scalabilityRuleEClass, SCALABILITY_RULE__SCALE_REQUIREMENTS);

		scalingActionEClass = createEClass(SCALING_ACTION);
		createEReference(scalingActionEClass, SCALING_ACTION__VM);

		horizontalScalingActionEClass = createEClass(HORIZONTAL_SCALING_ACTION);
		createEAttribute(horizontalScalingActionEClass, HORIZONTAL_SCALING_ACTION__COUNT);
		createEReference(horizontalScalingActionEClass, HORIZONTAL_SCALING_ACTION__INTERNAL_COMPONENT);

		verticalScalingActionEClass = createEClass(VERTICAL_SCALING_ACTION);
		createEAttribute(verticalScalingActionEClass, VERTICAL_SCALING_ACTION__MEMORY_UPDATE);
		createEAttribute(verticalScalingActionEClass, VERTICAL_SCALING_ACTION__CPU_UPDATE);
		createEAttribute(verticalScalingActionEClass, VERTICAL_SCALING_ACTION__CORE_UPDATE);
		createEAttribute(verticalScalingActionEClass, VERTICAL_SCALING_ACTION__STORAGE_UPDATE);
		createEAttribute(verticalScalingActionEClass, VERTICAL_SCALING_ACTION__IO_UPDATE);
		createEAttribute(verticalScalingActionEClass, VERTICAL_SCALING_ACTION__NETWORK_UPDATE);

		timerEClass = createEClass(TIMER);
		createEAttribute(timerEClass, TIMER__NAME);
		createEAttribute(timerEClass, TIMER__TYPE);
		createEAttribute(timerEClass, TIMER__TIME_VALUE);
		createEAttribute(timerEClass, TIMER__MAX_OCCURRENCE_NUM);
		createEReference(timerEClass, TIMER__UNIT);

		// Create enums
		binaryPatternOperatorTypeEEnum = createEEnum(BINARY_PATTERN_OPERATOR_TYPE);
		timerTypeEEnum = createEEnum(TIMER_TYPE);
		unaryPatternOperatorTypeEEnum = createEEnum(UNARY_PATTERN_OPERATOR_TYPE);
		statusTypeEEnum = createEEnum(STATUS_TYPE);
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
		RequirementPackage theRequirementPackage = (RequirementPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI);
		MetricPackage theMetricPackage = (MetricPackage)EPackage.Registry.INSTANCE.getEPackage(MetricPackage.eNS_URI);
		OrganisationPackage theOrganisationPackage = (OrganisationPackage)EPackage.Registry.INSTANCE.getEPackage(OrganisationPackage.eNS_URI);
		DeploymentPackage theDeploymentPackage = (DeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI);
		UnitPackage theUnitPackage = (UnitPackage)EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scalabilityModelEClass.getESuperTypes().add(theCamelPackage.getModel());
		eventPatternEClass.getESuperTypes().add(this.getEvent());
		binaryEventPatternEClass.getESuperTypes().add(this.getEventPattern());
		unaryEventPatternEClass.getESuperTypes().add(this.getEventPattern());
		simpleEventEClass.getESuperTypes().add(this.getEvent());
		functionalEventEClass.getESuperTypes().add(this.getSimpleEvent());
		nonFunctionalEventEClass.getESuperTypes().add(this.getSimpleEvent());
		scalingActionEClass.getESuperTypes().add(theCamelPackage.getAction());
		horizontalScalingActionEClass.getESuperTypes().add(this.getScalingAction());
		verticalScalingActionEClass.getESuperTypes().add(this.getScalingAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(scalabilityModelEClass, ScalabilityModel.class, "ScalabilityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScalabilityModel_Rules(), this.getScalabilityRule(), null, "rules", null, 0, -1, ScalabilityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScalabilityModel_Events(), this.getEvent(), null, "events", null, 0, -1, ScalabilityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScalabilityModel_EventInstances(), this.getEventInstance(), null, "eventInstances", null, 0, -1, ScalabilityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScalabilityModel_Actions(), this.getScalingAction(), null, "actions", null, 0, -1, ScalabilityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScalabilityModel_Patterns(), this.getEventPattern(), null, "patterns", null, 0, -1, ScalabilityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScalabilityModel_Timers(), this.getTimer(), null, "timers", null, 0, -1, ScalabilityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScalabilityModel_ScaleRequirements(), theRequirementPackage.getScaleRequirement(), null, "scaleRequirements", null, 0, -1, ScalabilityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventPatternEClass, EventPattern.class, "EventPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventPattern_Timer(), this.getTimer(), null, "timer", null, 0, 1, EventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getEventPattern__IncludesEvent__SimpleEvent(), ecorePackage.getEBoolean(), "includesEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSimpleEvent(), "e", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEventPattern__IncludesLeftEvent__SimpleEvent(), ecorePackage.getEBoolean(), "includesLeftEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSimpleEvent(), "e", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEventPattern__IncludesRightEvent__SimpleEvent(), ecorePackage.getEBoolean(), "includesRightEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSimpleEvent(), "e", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(binaryEventPatternEClass, BinaryEventPattern.class, "BinaryEventPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryEventPattern_LeftEvent(), this.getEvent(), null, "leftEvent", null, 0, 1, BinaryEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryEventPattern_RightEvent(), this.getEvent(), null, "rightEvent", null, 0, 1, BinaryEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryEventPattern_LowerOccurrenceBound(), ecorePackage.getEInt(), "lowerOccurrenceBound", null, 0, 1, BinaryEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryEventPattern_UpperOccurrenceBound(), ecorePackage.getEInt(), "upperOccurrenceBound", null, 0, 1, BinaryEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryEventPattern_Operator(), this.getBinaryPatternOperatorType(), "operator", null, 1, 1, BinaryEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryEventPatternEClass, UnaryEventPattern.class, "UnaryEventPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryEventPattern_Event(), this.getEvent(), null, "event", null, 1, 1, UnaryEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryEventPattern_OccurrenceNum(), ecorePackage.getEInt(), "occurrenceNum", null, 0, 1, UnaryEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryEventPattern_Operator(), this.getUnaryPatternOperatorType(), "operator", null, 1, 1, UnaryEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleEventEClass, SimpleEvent.class, "SimpleEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionalEventEClass, FunctionalEvent.class, "FunctionalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionalEvent_FunctionalType(), ecorePackage.getEString(), "functionalType", null, 1, 1, FunctionalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonFunctionalEventEClass, NonFunctionalEvent.class, "NonFunctionalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonFunctionalEvent_MetricCondition(), theMetricPackage.getMetricCondition(), null, "metricCondition", null, 1, 1, NonFunctionalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonFunctionalEvent_IsViolation(), ecorePackage.getEBoolean(), "isViolation", null, 1, 1, NonFunctionalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventInstanceEClass, EventInstance.class, "EventInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventInstance_Name(), ecorePackage.getEString(), "name", null, 1, 1, EventInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventInstance_Status(), this.getStatusType(), "status", null, 1, 1, EventInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventInstance_Layer(), theCamelPackage.getLayerType(), "layer", null, 0, 1, EventInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventInstance_Event(), this.getSimpleEvent(), null, "event", null, 1, 1, EventInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventInstance_MetricInstance(), theMetricPackage.getMetricInstance(), null, "metricInstance", null, 0, 1, EventInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEventInstance__EqualLayer__LayerType_LayerType(), ecorePackage.getEBoolean(), "equalLayer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCamelPackage.getLayerType(), "l1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCamelPackage.getLayerType(), "l2", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(scalabilityRuleEClass, ScalabilityRule.class, "ScalabilityRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScalabilityRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, ScalabilityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalabilityRule_Event(), this.getEvent(), null, "event", null, 1, 1, ScalabilityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalabilityRule_Actions(), theCamelPackage.getAction(), null, "actions", null, 1, -1, ScalabilityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalabilityRule_Entity(), theOrganisationPackage.getEntity(), null, "entity", null, 0, -1, ScalabilityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalabilityRule_ScaleRequirements(), theRequirementPackage.getScaleRequirement(), null, "scaleRequirements", null, 0, -1, ScalabilityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scalingActionEClass, ScalingAction.class, "ScalingAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScalingAction_Vm(), theDeploymentPackage.getVM(), null, "vm", null, 1, 1, ScalingAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(horizontalScalingActionEClass, HorizontalScalingAction.class, "HorizontalScalingAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHorizontalScalingAction_Count(), ecorePackage.getEInt(), "count", null, 0, 1, HorizontalScalingAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHorizontalScalingAction_InternalComponent(), theDeploymentPackage.getInternalComponent(), null, "internalComponent", null, 1, 1, HorizontalScalingAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verticalScalingActionEClass, VerticalScalingAction.class, "VerticalScalingAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerticalScalingAction_MemoryUpdate(), ecorePackage.getEInt(), "memoryUpdate", null, 0, 1, VerticalScalingAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScalingAction_CPUUpdate(), ecorePackage.getEDouble(), "CPUUpdate", null, 0, 1, VerticalScalingAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScalingAction_CoreUpdate(), ecorePackage.getEInt(), "coreUpdate", null, 0, 1, VerticalScalingAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScalingAction_StorageUpdate(), ecorePackage.getEInt(), "storageUpdate", null, 0, 1, VerticalScalingAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScalingAction_IoUpdate(), ecorePackage.getEInt(), "ioUpdate", null, 0, 1, VerticalScalingAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScalingAction_NetworkUpdate(), ecorePackage.getEInt(), "networkUpdate", null, 0, 1, VerticalScalingAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timerEClass, Timer.class, "Timer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Timer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimer_Type(), this.getTimerType(), "type", null, 1, 1, Timer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimer_TimeValue(), ecorePackage.getEInt(), "timeValue", null, 1, 1, Timer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimer_MaxOccurrenceNum(), ecorePackage.getEInt(), "maxOccurrenceNum", null, 0, 1, Timer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimer_Unit(), theUnitPackage.getTimeIntervalUnit(), null, "unit", null, 1, 1, Timer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(binaryPatternOperatorTypeEEnum, BinaryPatternOperatorType.class, "BinaryPatternOperatorType");
		addEEnumLiteral(binaryPatternOperatorTypeEEnum, BinaryPatternOperatorType.AND);
		addEEnumLiteral(binaryPatternOperatorTypeEEnum, BinaryPatternOperatorType.OR);
		addEEnumLiteral(binaryPatternOperatorTypeEEnum, BinaryPatternOperatorType.XOR);
		addEEnumLiteral(binaryPatternOperatorTypeEEnum, BinaryPatternOperatorType.PRECEDES);
		addEEnumLiteral(binaryPatternOperatorTypeEEnum, BinaryPatternOperatorType.REPEAT_UNTIL);

		initEEnum(timerTypeEEnum, TimerType.class, "TimerType");
		addEEnumLiteral(timerTypeEEnum, TimerType.WITHIN);
		addEEnumLiteral(timerTypeEEnum, TimerType.WITHIN_MAX);
		addEEnumLiteral(timerTypeEEnum, TimerType.INTERVAL);

		initEEnum(unaryPatternOperatorTypeEEnum, UnaryPatternOperatorType.class, "UnaryPatternOperatorType");
		addEEnumLiteral(unaryPatternOperatorTypeEEnum, UnaryPatternOperatorType.EVERY);
		addEEnumLiteral(unaryPatternOperatorTypeEEnum, UnaryPatternOperatorType.NOT);
		addEEnumLiteral(unaryPatternOperatorTypeEEnum, UnaryPatternOperatorType.REPEAT);
		addEEnumLiteral(unaryPatternOperatorTypeEEnum, UnaryPatternOperatorType.WHEN);

		initEEnum(statusTypeEEnum, StatusType.class, "StatusType");
		addEEnumLiteral(statusTypeEEnum, StatusType.CRITICAL);
		addEEnumLiteral(statusTypeEEnum, StatusType.WARNING);
		addEEnumLiteral(statusTypeEEnum, StatusType.SUCCESS);
		addEEnumLiteral(statusTypeEEnum, StatusType.FATAL);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
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
		  (binaryEventPatternEClass, 
		   source, 
		   new String[] {
			 "constraints", "binary_event_pattern_at_least_left_right binary_event_pattern_timer_one_event binary_event_pattern_occur_bounds"
		   });	
		addAnnotation
		  (unaryEventPatternEClass, 
		   source, 
		   new String[] {
			 "constraints", "unary_event_pattern_correct_values_per_operator"
		   });	
		addAnnotation
		  (eventInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "event_instance_same_layer_of_metric_as_in_event event_instance_metric_in_event"
		   });	
		addAnnotation
		  (scalabilityRuleEClass, 
		   source, 
		   new String[] {
			 "constraints", "scal_rule_horiz_req_count scal_rule_vert_req_correct_vals scal_rule_no_conficting_reqs"
		   });	
		addAnnotation
		  (horizontalScalingActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "horizontal_scale_action_correct_count horizontal_scale_action_correct_type"
		   });	
		addAnnotation
		  (verticalScalingActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "vertical_scale_action_correct_input vertical_scale_action_correct_type"
		   });	
		addAnnotation
		  (timerEClass, 
		   source, 
		   new String[] {
			 "constraints", "timer_correct_values"
		   });
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
		  (getEvent_Name(), 
		   source, 
		   new String[] {
			 "body", "EventPattern",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getFunctionalEvent_FunctionalType(), 
		   source, 
		   new String[] {
			 "body", "NonFunctionalEvent",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getVerticalScalingAction_StorageUpdate(), 
		   source, 
		   new String[] {
			 "body", "Schedule",
			 "unique", "false",
			 "upper", "*"
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
		  (getEventPattern__IncludesEvent__SimpleEvent(), 
		   source, 
		   new String[] {
			 "body", "if (self.oclIsTypeOf(UnaryEventPattern))\n\t\t\t\t\t\tthen self.oclAsType(UnaryEventPattern).event = e\n\t\t\t\t\t\telse (includesLeftEvent(e) or includesRightEvent(e))\n\t\t\t\t\t\tendif"
		   });	
		addAnnotation
		  (getEventPattern__IncludesLeftEvent__SimpleEvent(), 
		   source, 
		   new String[] {
			 "body", "if (self.oclAsType(BinaryEventPattern).leftEvent.oclIsKindOf(EventPattern))\n\t\t\t\t\t\tthen self.oclAsType(BinaryEventPattern).leftEvent.oclAsType(EventPattern).includesEvent(e)\n\t\t\t\t\t\telse (if (self.oclAsType(BinaryEventPattern).leftEvent.oclIsKindOf(SimpleEvent))\n\t\t\t\t\t\t\tthen self.oclAsType(BinaryEventPattern).leftEvent.oclAsType(SimpleEvent) = e\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\tendif"
		   });	
		addAnnotation
		  (getEventPattern__IncludesRightEvent__SimpleEvent(), 
		   source, 
		   new String[] {
			 "body", "if (self.oclAsType(BinaryEventPattern).rightEvent.oclIsKindOf(EventPattern))\n\t\t\t\t\t\tthen self.oclAsType(BinaryEventPattern).rightEvent.oclAsType(EventPattern).includesEvent(e)\n\t\t\t\t\t\telse (if (self.oclAsType(BinaryEventPattern).rightEvent.oclIsKindOf(SimpleEvent))\n\t\t\t\t\t\t\tthen self.oclAsType(BinaryEventPattern).rightEvent.oclAsType(SimpleEvent) = e\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\tendif"
		   });	
		addAnnotation
		  (binaryEventPatternEClass, 
		   source, 
		   new String[] {
			 "binary_event_pattern_at_least_left_right", "Tuple {\n\tmessage : String = \'In BinaryEventPattern: \' + self.name +\n\t\t\t\t\t\' no left or right event has been specified\',\n\tstatus : Boolean = self.leftEvent <> null or self.rightEvent <> null\n}.status",
			 "binary_event_pattern_timer_one_event", "Tuple {\n\tmessage : String = \'In BinaryEventPattern: \' + self.name +\n\t\t\t\t\t\' both a timer as well as left and right events have been specified\',\n\tstatus : Boolean = self.oclAsType(EventPattern).timer <> null\n\t\t\t\t\timplies (self.leftEvent = null or self.rightEvent = null)\n}.status",
			 "binary_event_pattern_occur_bounds", "Tuple {\n\tmessage : String = \'In BinaryEventPattern: \' + self.name +\n\t\t\t\t\t\' incorrect values were given for the lowerOccurrenceBound and upperOccurrenceBound attributes in conjunction with the use of the respective pattern operator: \'\n\t\t\t\t\t+ operator.toString(),\n\tstatus : Boolean = (self.operator <> BinaryPatternOperatorType::REPEAT_UNTIL implies\n\t\t\t\t\t(self.lowerOccurrenceBound = 0 and self.upperOccurrenceBound = 0)) and (self.operator =\n\t\t\t\t\tBinaryPatternOperatorType::REPEAT_UNTIL and self.lowerOccurrenceBound >= 0 and self.upperOccurrenceBound > 0\n\t\t\t\t\timplies self.lowerOccurrenceBound <= upperOccurrenceBound)\n}.status"
		   });	
		addAnnotation
		  (unaryEventPatternEClass, 
		   source, 
		   new String[] {
			 "unary_event_pattern_correct_values_per_operator", "Tuple {\n\tmessage : String = \'In UnaryEventPattern: \' + self.name +\n\t\t\t\t\t\' either a REPEAT operator there is an incorrect combination of values of the operator and occurrenceNum attributes and of the timer association. When operator is REPEAT, occurrenceNum should be positive; otherwise, equal to zero. When operator is WHERE, then a timer must be specified; otherwise, no timer should be specified\',\n\tstatus : Boolean = (self.operator\n\t\t\t\t\t= UnaryPatternOperatorType::REPEAT implies occurrenceNum > 0) and (self.operator <>\n\t\t\t\t\tUnaryPatternOperatorType::REPEAT implies occurrenceNum = 0) and (self.operator = UnaryPatternOperatorType::WHEN\n\t\t\t\t\timplies self.oclAsType(EventPattern).timer <> null) and (self.operator <> UnaryPatternOperatorType::WHEN implies\n\t\t\t\t\tself.oclAsType(EventPattern).timer = null)\n}.status"
		   });	
		addAnnotation
		  (eventInstanceEClass, 
		   source, 
		   new String[] {
			 "event_instance_same_layer_of_metric_as_in_event", "Tuple {\n\tmessage : String = \'EventInstance: \' + self.name +\n\t\t\t\t\t\' does not map to the same layer as the one designated by the metric referenced by the instance\\\'s respective event:\'\n\t\t\t\t\t+ self.event.name,\n\tstatus : Boolean = if (self.event.oclIsTypeOf(NonFunctionalEvent))\n\t\t\t\t\tthen self.equalLayer(self.layer,\n\t\t\t\t\t\t\tself.event.oclAsType(NonFunctionalEvent).metricCondition.metricContext.metric.layer)\n\t\t\t\t\telse true\n\t\t\t\t\tendif\n}.status",
			 "event_instance_metric_in_event", "Tuple {\n\tmessage : String = \'EventInstance: \' + self.name +\n\t\t\t\t\t\' has a metric instance with a metric which is not identical to the one associated to the event instance\\\'s event: \'\n\t\t\t\t\t+ self.event.name,\n\tstatus : Boolean = if (self.event.oclIsTypeOf(NonFunctionalEvent))\n\t\t\t\t\tthen metricInstance.metric = event.oclAsType(NonFunctionalEvent).metricCondition.metricContext.metric\n\t\t\t\t\telse true\n\t\t\t\t\tendif\n}.status"
		   });	
		addAnnotation
		  (getEventInstance__EqualLayer__LayerType_LayerType(), 
		   source, 
		   new String[] {
			 "body", "if (l1 = LayerType::SaaS)\n\t\t\t\t\t\tthen (if (l2 = LayerType::SaaS)\n\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\telse (if (l1 = LayerType::PaaS)\n\t\t\t\t\t\t\tthen (if (l2 = LayerType::PaaS)\n\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\t\telse (if (l2 = LayerType::IaaS)\n\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\tendif"
		   });	
		addAnnotation
		  (scalabilityRuleEClass, 
		   source, 
		   new String[] {
			 "scal_rule_horiz_req_count", "Tuple {\n\tmessage : String = \'In ScalabilityRule: \' + self.name +\n\t\t\t\t\t\' there is a HorizontalScalingAction which conflicts with a rule\\\'s respective HorizontalScaleRequirement\',\n\tstatus : Boolean = self.actions\n\t\t\t\t\t->forAll(p | (p.oclIsTypeOf(HorizontalScalingAction) and p.oclAsType(HorizontalScalingAction).count > 0 and\n\t\t\t\t\t\t(p.type = camel::ActionType::SCALE_IN or p.type = camel::ActionType::SCALE_OUT and self.scaleRequirements\n\t\t\t\t\t\t->exists(q | q.oclIsTypeOf(camel::requirement::HorizontalScaleRequirement))) implies self.scaleRequirements\n\t\t\t\t\t\t->forAll(t | if (t.oclIsTypeOf(camel::requirement::HorizontalScaleRequirement))\n\t\t\t\t\t\t\tthen (t.oclAsType(camel::requirement::HorizontalScaleRequirement).maxInstances = - 1 or\n\t\t\t\t\t\t\t\tp.oclAsType(HorizontalScalingAction).count <=\n\t\t\t\t\t\t\t\t(t.oclAsType(camel::requirement::HorizontalScaleRequirement).maxInstances -\n\t\t\t\t\t\t\t\tt.oclAsType(camel::requirement::HorizontalScaleRequirement).minInstances))\n\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\tendif)))\n}.status",
			 "scal_rule_vert_req_correct_vals", "Tuple {\n\tmessage : String = \'In ScalabilityRule: \' + self.name +\n\t\t\t\t\t\' there is a VerticalScalingAction which conflicts with a rule\\\'s respective VerticalScaleRequirement\',\n\tstatus : Boolean = self.actions\n\t\t\t\t\t->forAll(p | (p.oclIsTypeOf(VerticalScalingAction) and (p.type = camel::ActionType::SCALE_UP or p.type =\n\t\t\t\t\t\tcamel::ActionType::SCALE_DOWN and self.scaleRequirements\n\t\t\t\t\t\t->exists(t | t.oclIsTypeOf(camel::requirement::VerticalScaleRequirement))) implies self.scaleRequirements\n\t\t\t\t\t\t->forAll(q | q.oclIsTypeOf(camel::requirement::VerticalScaleRequirement) implies\n\t\t\t\t\t\t\t((p.oclAsType(VerticalScalingAction).coreUpdate > 0) implies\n\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxCores = - 1 or\n\t\t\t\t\t\t\tp.oclAsType(VerticalScalingAction).coreUpdate <=\n\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxCores -\n\t\t\t\t\t\t\tq.oclAsType(camel::requirement::VerticalScaleRequirement).minCores))) and\n\t\t\t\t\t\t\t((p.oclAsType(VerticalScalingAction).storageUpdate > 0) implies\n\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxStorage = - 1 or\n\t\t\t\t\t\t\tp.oclAsType(VerticalScalingAction).storageUpdate <=\n\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxStorage -\n\t\t\t\t\t\t\tq.oclAsType(camel::requirement::VerticalScaleRequirement).minStorage))) and\n\t\t\t\t\t\t\t((p.oclAsType(VerticalScalingAction).CPUUpdate > 0) implies\n\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxCPU = - 1 or\n\t\t\t\t\t\t\tp.oclAsType(VerticalScalingAction).CPUUpdate <=\n\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxCPU -\n\t\t\t\t\t\t\tq.oclAsType(camel::requirement::VerticalScaleRequirement).minCPU))) and\n\t\t\t\t\t\t\t((p.oclAsType(VerticalScalingAction).memoryUpdate > 0) implies\n\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxRAM = - 1 or\n\t\t\t\t\t\t\tp.oclAsType(VerticalScalingAction).memoryUpdate <=\n\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxRAM -\n\t\t\t\t\t\t\tq.oclAsType(camel::requirement::VerticalScaleRequirement).minRAM))))))\n}.status",
			 "scal_rule_no_conficting_reqs", "Tuple {\n\tmessage : String = \'In ScalabilityRule: \' + self.name +\n\t\t\t\t\t\' there is a pair of vertical or horizontal scale requirements that are conflicting, where conflicting means that they concern the same vm or component, respectively\',\n\tstatus : Boolean = self.scaleRequirements\n\t\t\t\t\t->forAll(p1, p2 | if (p1 <> p2 and p1.oclType() = p2.oclType())\n\t\t\t\t\t\tthen if (p1.oclIsTypeOf(camel::requirement::VerticalScaleRequirement))\n\t\t\t\t\t\t\tthen p1.oclAsType(camel::requirement::VerticalScaleRequirement).vm <>\n\t\t\t\t\t\t\t\tp2.oclAsType(camel::requirement::VerticalScaleRequirement).vm\n\t\t\t\t\t\t\telse p1.oclAsType(camel::requirement::HorizontalScaleRequirement).component <>\n\t\t\t\t\t\t\t\tp2.oclAsType(camel::requirement::HorizontalScaleRequirement).component\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse true\n\t\t\t\t\t\tendif)\n}.status"
		   });	
		addAnnotation
		  (horizontalScalingActionEClass, 
		   source, 
		   new String[] {
			 "horizontal_scale_action_correct_count", "Tuple {\n\tmessage : String = \'HorizontalScalingAction: \' + self.name +\n\t\t\t\t\t\' has a wrong (negative) value for the count attribute\',\n\tstatus : Boolean = count >= 0\n}.status",
			 "horizontal_scale_action_correct_type", "Tuple {\n\tmessage : String = \'HorizontalScalingAction: \' + self.name + \' has a wrong type (\' +\n\t\t\t\t\tself.type.toString() + \'). It should be either SCALE_IN or SCALE_OUT\',\n\tstatus : Boolean = (self.type = camel::ActionType::SCALE_IN)\n\t\t\t\t\tor (self.type = camel::ActionType::SCALE_OUT)\n}.status"
		   });	
		addAnnotation
		  (verticalScalingActionEClass, 
		   source, 
		   new String[] {
			 "vertical_scale_action_correct_input", "Tuple {\n\tmessage : String = \'VerticalScalingAction: \' + self.name +\n\t\t\t\t\t\' has the value of all VM characteristic update attributes equal to zero. At least one should be positive.\',\n\tstatus : Boolean = memoryUpdate\n\t\t\t\t\t<> 0 or CPUUpdate <> 0.0 or coreUpdate <> 0 or storageUpdate <> 0\n}.status",
			 "vertical_scale_action_correct_type", "Tuple {\n\tmessage : String = \'VerticalScalingAction: \' + self.name + \' has a wrong type (\' +\n\t\t\t\t\tself.type.toString() + \'). It should be either SCALE_UP or SCALE_DOWN\',\n\tstatus : Boolean = (self.type = camel::ActionType::SCALE_UP)\n\t\t\t\t\tor (self.type = camel::ActionType::SCALE_DOWN)\n}.status"
		   });	
		addAnnotation
		  (timerEClass, 
		   source, 
		   new String[] {
			 "timer_correct_values", "Tuple {\n\tmessage : String = \'Timer: \' + self.toString() +\n\t\t\t\t\t\' as wrong value combinations for its attributes. This means that either the timeValue is non-positive or the time type is WITHIN_MAX and a non-positive maxOccurrenceNum has been provided or that the time type is not WITHIN_MAX and a positive maxOccurrenceNum has been given\',\n\tstatus : Boolean = timeValue\n\t\t\t\t\t> 0 and (self.type = TimerType::WITHIN_MAX implies self.maxOccurrenceNum > 0) and (self.type <>\n\t\t\t\t\tTimerType::WITHIN_MAX implies self.maxOccurrenceNum = 0)\n}.status"
		   });
	}

} //ScalabilityPackageImpl
