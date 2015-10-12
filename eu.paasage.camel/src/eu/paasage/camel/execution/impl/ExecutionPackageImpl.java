/**
 */
package eu.paasage.camel.execution.impl;

import eu.paasage.camel.CamelPackage;

import eu.paasage.camel.deployment.DeploymentPackage;

import eu.paasage.camel.deployment.impl.DeploymentPackageImpl;

import eu.paasage.camel.execution.ActionRealisation;
import eu.paasage.camel.execution.ApplicationMeasurement;
import eu.paasage.camel.execution.CommunicationMeasurement;
import eu.paasage.camel.execution.ExecutionContext;
import eu.paasage.camel.execution.ExecutionFactory;
import eu.paasage.camel.execution.ExecutionModel;
import eu.paasage.camel.execution.ExecutionPackage;
import eu.paasage.camel.execution.InternalComponentMeasurement;
import eu.paasage.camel.execution.Measurement;
import eu.paasage.camel.execution.RuleTrigger;
import eu.paasage.camel.execution.SLOAssessment;
import eu.paasage.camel.execution.VMMeasurement;

import eu.paasage.camel.execution.util.ExecutionValidator;

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
public class ExecutionPackageImpl extends EPackageImpl implements ExecutionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionRealisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalComponentMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sloAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleTriggerEClass = null;

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
	 * @see eu.paasage.camel.execution.ExecutionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExecutionPackageImpl() {
		super(eNS_URI, ExecutionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExecutionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExecutionPackage init() {
		if (isInited) return (ExecutionPackage)EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);

		// Obtain or create and register package
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExecutionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExecutionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CamelPackageImpl theCamelPackage = (CamelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) instanceof CamelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) : CamelPackage.eINSTANCE);
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);
		LocationPackageImpl theLocationPackage = (LocationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI) instanceof LocationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI) : LocationPackage.eINSTANCE);
		MetricPackageImpl theMetricPackage = (MetricPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetricPackage.eNS_URI) instanceof MetricPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetricPackage.eNS_URI) : MetricPackage.eINSTANCE);
		OrganisationPackageImpl theOrganisationPackage = (OrganisationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganisationPackage.eNS_URI) instanceof OrganisationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganisationPackage.eNS_URI) : OrganisationPackage.eINSTANCE);
		ProviderPackageImpl theProviderPackage = (ProviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI) instanceof ProviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI) : ProviderPackage.eINSTANCE);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) : RequirementPackage.eINSTANCE);
		ScalabilityPackageImpl theScalabilityPackage = (ScalabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScalabilityPackage.eNS_URI) instanceof ScalabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScalabilityPackage.eNS_URI) : ScalabilityPackage.eINSTANCE);
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) instanceof SecurityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) : SecurityPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) : UnitPackage.eINSTANCE);

		// Create package meta-data objects
		theExecutionPackage.createPackageContents();
		theCamelPackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theLocationPackage.createPackageContents();
		theMetricPackage.createPackageContents();
		theOrganisationPackage.createPackageContents();
		theProviderPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theScalabilityPackage.createPackageContents();
		theSecurityPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theUnitPackage.createPackageContents();

		// Initialize created meta-data
		theExecutionPackage.initializePackageContents();
		theCamelPackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theLocationPackage.initializePackageContents();
		theMetricPackage.initializePackageContents();
		theOrganisationPackage.initializePackageContents();
		theProviderPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theScalabilityPackage.initializePackageContents();
		theSecurityPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theUnitPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theExecutionPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ExecutionValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theExecutionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExecutionPackage.eNS_URI, theExecutionPackage);
		return theExecutionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionModel() {
		return executionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionModel_ActionRealisations() {
		return (EReference)executionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionModel_EventInstances() {
		return (EReference)executionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionModel_ExecutionContexts() {
		return (EReference)executionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionModel_Measurements() {
		return (EReference)executionModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionModel_SloAssessessments() {
		return (EReference)executionModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionModel_RuleTriggers() {
		return (EReference)executionModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionRealisation() {
		return actionRealisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionRealisation_Name() {
		return (EAttribute)actionRealisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionRealisation_Action() {
		return (EReference)actionRealisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionRealisation_StartTime() {
		return (EAttribute)actionRealisationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionRealisation_EndTime() {
		return (EAttribute)actionRealisationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionRealisation_LowLevelActions() {
		return (EAttribute)actionRealisationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionContext() {
		return executionContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionContext_Name() {
		return (EAttribute)executionContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionContext_Application() {
		return (EReference)executionContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionContext_StartTime() {
		return (EAttribute)executionContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionContext_EndTime() {
		return (EAttribute)executionContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionContext_TotalCost() {
		return (EAttribute)executionContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionContext_CostUnit() {
		return (EReference)executionContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionContext_DeploymentModel() {
		return (EReference)executionContextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionContext_RequirementGroup() {
		return (EReference)executionContextEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurement() {
		return measurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurement_Name() {
		return (EAttribute)measurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_ExecutionContext() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_MetricInstance() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurement_Value() {
		return (EAttribute)measurementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurement_RawData() {
		return (EAttribute)measurementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurement_MeasurementTime() {
		return (EAttribute)measurementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_Slo() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_EventInstance() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationMeasurement() {
		return applicationMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationMeasurement_Application() {
		return (EReference)applicationMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalComponentMeasurement() {
		return internalComponentMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalComponentMeasurement_InternalComponentInstance() {
		return (EReference)internalComponentMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationMeasurement() {
		return communicationMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMeasurement_SourceVMInstance() {
		return (EReference)communicationMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMeasurement_DestinationVMInstance() {
		return (EReference)communicationMeasurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMMeasurement() {
		return vmMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMMeasurement_VmInstance() {
		return (EReference)vmMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSLOAssessment() {
		return sloAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSLOAssessment_Name() {
		return (EAttribute)sloAssessmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSLOAssessment_Slo() {
		return (EReference)sloAssessmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSLOAssessment_Assessment() {
		return (EAttribute)sloAssessmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSLOAssessment_ExecutionContext() {
		return (EReference)sloAssessmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSLOAssessment_Measurement() {
		return (EReference)sloAssessmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSLOAssessment_AssessmentTime() {
		return (EAttribute)sloAssessmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleTrigger() {
		return ruleTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleTrigger_Name() {
		return (EAttribute)ruleTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleTrigger_ScalabilityRule() {
		return (EReference)ruleTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleTrigger_EventInstances() {
		return (EReference)ruleTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleTrigger_ActionRealisations() {
		return (EReference)ruleTriggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleTrigger_TrigerringTime() {
		return (EAttribute)ruleTriggerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleTrigger_ExecutionContext() {
		return (EReference)ruleTriggerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionFactory getExecutionFactory() {
		return (ExecutionFactory)getEFactoryInstance();
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
		executionModelEClass = createEClass(EXECUTION_MODEL);
		createEReference(executionModelEClass, EXECUTION_MODEL__ACTION_REALISATIONS);
		createEReference(executionModelEClass, EXECUTION_MODEL__EVENT_INSTANCES);
		createEReference(executionModelEClass, EXECUTION_MODEL__EXECUTION_CONTEXTS);
		createEReference(executionModelEClass, EXECUTION_MODEL__MEASUREMENTS);
		createEReference(executionModelEClass, EXECUTION_MODEL__SLO_ASSESSESSMENTS);
		createEReference(executionModelEClass, EXECUTION_MODEL__RULE_TRIGGERS);

		actionRealisationEClass = createEClass(ACTION_REALISATION);
		createEAttribute(actionRealisationEClass, ACTION_REALISATION__NAME);
		createEReference(actionRealisationEClass, ACTION_REALISATION__ACTION);
		createEAttribute(actionRealisationEClass, ACTION_REALISATION__START_TIME);
		createEAttribute(actionRealisationEClass, ACTION_REALISATION__END_TIME);
		createEAttribute(actionRealisationEClass, ACTION_REALISATION__LOW_LEVEL_ACTIONS);

		executionContextEClass = createEClass(EXECUTION_CONTEXT);
		createEAttribute(executionContextEClass, EXECUTION_CONTEXT__NAME);
		createEReference(executionContextEClass, EXECUTION_CONTEXT__APPLICATION);
		createEAttribute(executionContextEClass, EXECUTION_CONTEXT__START_TIME);
		createEAttribute(executionContextEClass, EXECUTION_CONTEXT__END_TIME);
		createEAttribute(executionContextEClass, EXECUTION_CONTEXT__TOTAL_COST);
		createEReference(executionContextEClass, EXECUTION_CONTEXT__COST_UNIT);
		createEReference(executionContextEClass, EXECUTION_CONTEXT__DEPLOYMENT_MODEL);
		createEReference(executionContextEClass, EXECUTION_CONTEXT__REQUIREMENT_GROUP);

		measurementEClass = createEClass(MEASUREMENT);
		createEAttribute(measurementEClass, MEASUREMENT__NAME);
		createEReference(measurementEClass, MEASUREMENT__EXECUTION_CONTEXT);
		createEReference(measurementEClass, MEASUREMENT__METRIC_INSTANCE);
		createEAttribute(measurementEClass, MEASUREMENT__VALUE);
		createEAttribute(measurementEClass, MEASUREMENT__RAW_DATA);
		createEAttribute(measurementEClass, MEASUREMENT__MEASUREMENT_TIME);
		createEReference(measurementEClass, MEASUREMENT__SLO);
		createEReference(measurementEClass, MEASUREMENT__EVENT_INSTANCE);

		applicationMeasurementEClass = createEClass(APPLICATION_MEASUREMENT);
		createEReference(applicationMeasurementEClass, APPLICATION_MEASUREMENT__APPLICATION);

		internalComponentMeasurementEClass = createEClass(INTERNAL_COMPONENT_MEASUREMENT);
		createEReference(internalComponentMeasurementEClass, INTERNAL_COMPONENT_MEASUREMENT__INTERNAL_COMPONENT_INSTANCE);

		communicationMeasurementEClass = createEClass(COMMUNICATION_MEASUREMENT);
		createEReference(communicationMeasurementEClass, COMMUNICATION_MEASUREMENT__SOURCE_VM_INSTANCE);
		createEReference(communicationMeasurementEClass, COMMUNICATION_MEASUREMENT__DESTINATION_VM_INSTANCE);

		vmMeasurementEClass = createEClass(VM_MEASUREMENT);
		createEReference(vmMeasurementEClass, VM_MEASUREMENT__VM_INSTANCE);

		sloAssessmentEClass = createEClass(SLO_ASSESSMENT);
		createEAttribute(sloAssessmentEClass, SLO_ASSESSMENT__NAME);
		createEReference(sloAssessmentEClass, SLO_ASSESSMENT__SLO);
		createEAttribute(sloAssessmentEClass, SLO_ASSESSMENT__ASSESSMENT);
		createEReference(sloAssessmentEClass, SLO_ASSESSMENT__EXECUTION_CONTEXT);
		createEReference(sloAssessmentEClass, SLO_ASSESSMENT__MEASUREMENT);
		createEAttribute(sloAssessmentEClass, SLO_ASSESSMENT__ASSESSMENT_TIME);

		ruleTriggerEClass = createEClass(RULE_TRIGGER);
		createEAttribute(ruleTriggerEClass, RULE_TRIGGER__NAME);
		createEReference(ruleTriggerEClass, RULE_TRIGGER__SCALABILITY_RULE);
		createEReference(ruleTriggerEClass, RULE_TRIGGER__EVENT_INSTANCES);
		createEReference(ruleTriggerEClass, RULE_TRIGGER__ACTION_REALISATIONS);
		createEAttribute(ruleTriggerEClass, RULE_TRIGGER__TRIGERRING_TIME);
		createEReference(ruleTriggerEClass, RULE_TRIGGER__EXECUTION_CONTEXT);
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
		ScalabilityPackage theScalabilityPackage = (ScalabilityPackage)EPackage.Registry.INSTANCE.getEPackage(ScalabilityPackage.eNS_URI);
		UnitPackage theUnitPackage = (UnitPackage)EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI);
		DeploymentPackage theDeploymentPackage = (DeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI);
		RequirementPackage theRequirementPackage = (RequirementPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI);
		MetricPackage theMetricPackage = (MetricPackage)EPackage.Registry.INSTANCE.getEPackage(MetricPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		executionModelEClass.getESuperTypes().add(theCamelPackage.getModel());
		applicationMeasurementEClass.getESuperTypes().add(this.getMeasurement());
		internalComponentMeasurementEClass.getESuperTypes().add(this.getMeasurement());
		communicationMeasurementEClass.getESuperTypes().add(this.getMeasurement());
		vmMeasurementEClass.getESuperTypes().add(this.getMeasurement());

		// Initialize classes, features, and operations; add parameters
		initEClass(executionModelEClass, ExecutionModel.class, "ExecutionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionModel_ActionRealisations(), this.getActionRealisation(), null, "actionRealisations", null, 0, -1, ExecutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExecutionModel_EventInstances(), theScalabilityPackage.getEventInstance(), null, "eventInstances", null, 0, -1, ExecutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionModel_ExecutionContexts(), this.getExecutionContext(), null, "executionContexts", null, 0, -1, ExecutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExecutionModel_Measurements(), this.getMeasurement(), null, "measurements", null, 0, -1, ExecutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExecutionModel_SloAssessessments(), this.getSLOAssessment(), null, "sloAssessessments", null, 0, -1, ExecutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExecutionModel_RuleTriggers(), this.getRuleTrigger(), null, "ruleTriggers", null, 0, -1, ExecutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actionRealisationEClass, ActionRealisation.class, "ActionRealisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionRealisation_Name(), ecorePackage.getEString(), "name", null, 1, 1, ActionRealisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionRealisation_Action(), theCamelPackage.getAction(), null, "action", null, 1, 1, ActionRealisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionRealisation_StartTime(), ecorePackage.getEDate(), "startTime", null, 0, 1, ActionRealisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionRealisation_EndTime(), ecorePackage.getEDate(), "endTime", null, 0, 1, ActionRealisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionRealisation_LowLevelActions(), ecorePackage.getEString(), "lowLevelActions", null, 0, 1, ActionRealisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionContextEClass, ExecutionContext.class, "ExecutionContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionContext_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionContext_Application(), theCamelPackage.getApplication(), null, "application", null, 1, 1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionContext_StartTime(), ecorePackage.getEDate(), "startTime", null, 0, 1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionContext_EndTime(), ecorePackage.getEDate(), "endTime", null, 0, 1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionContext_TotalCost(), ecorePackage.getEDouble(), "totalCost", null, 0, 1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionContext_CostUnit(), theUnitPackage.getMonetaryUnit(), null, "costUnit", null, 0, 1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionContext_DeploymentModel(), theDeploymentPackage.getDeploymentModel(), null, "deploymentModel", null, 1, 1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionContext_RequirementGroup(), theRequirementPackage.getRequirementGroup(), null, "requirementGroup", null, 1, 1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementEClass, Measurement.class, "Measurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasurement_Name(), ecorePackage.getEString(), "name", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_ExecutionContext(), this.getExecutionContext(), null, "executionContext", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_MetricInstance(), theMetricPackage.getMetricInstance(), null, "metricInstance", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurement_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurement_RawData(), ecorePackage.getEString(), "rawData", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurement_MeasurementTime(), ecorePackage.getEDate(), "measurementTime", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_Slo(), theRequirementPackage.getServiceLevelObjective(), null, "slo", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_EventInstance(), theScalabilityPackage.getEventInstance(), null, "eventInstance", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationMeasurementEClass, ApplicationMeasurement.class, "ApplicationMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationMeasurement_Application(), theCamelPackage.getApplication(), null, "application", null, 1, 1, ApplicationMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalComponentMeasurementEClass, InternalComponentMeasurement.class, "InternalComponentMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalComponentMeasurement_InternalComponentInstance(), theDeploymentPackage.getInternalComponentInstance(), null, "internalComponentInstance", null, 1, 1, InternalComponentMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationMeasurementEClass, CommunicationMeasurement.class, "CommunicationMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationMeasurement_SourceVMInstance(), theDeploymentPackage.getVMInstance(), null, "sourceVMInstance", null, 1, 1, CommunicationMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationMeasurement_DestinationVMInstance(), theDeploymentPackage.getVMInstance(), null, "destinationVMInstance", null, 1, 1, CommunicationMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmMeasurementEClass, VMMeasurement.class, "VMMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVMMeasurement_VmInstance(), theDeploymentPackage.getVMInstance(), null, "vmInstance", null, 1, 1, VMMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sloAssessmentEClass, SLOAssessment.class, "SLOAssessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSLOAssessment_Name(), ecorePackage.getEString(), "name", null, 1, 1, SLOAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSLOAssessment_Slo(), theRequirementPackage.getServiceLevelObjective(), null, "slo", null, 1, 1, SLOAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSLOAssessment_Assessment(), ecorePackage.getEBoolean(), "assessment", null, 1, 1, SLOAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSLOAssessment_ExecutionContext(), this.getExecutionContext(), null, "executionContext", null, 1, 1, SLOAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSLOAssessment_Measurement(), this.getMeasurement(), null, "measurement", null, 1, 1, SLOAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSLOAssessment_AssessmentTime(), ecorePackage.getEDate(), "assessmentTime", null, 1, 1, SLOAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleTriggerEClass, RuleTrigger.class, "RuleTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleTrigger_Name(), ecorePackage.getEString(), "name", null, 1, 1, RuleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleTrigger_ScalabilityRule(), theScalabilityPackage.getScalabilityRule(), null, "scalabilityRule", null, 1, 1, RuleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleTrigger_EventInstances(), theScalabilityPackage.getEventInstance(), null, "eventInstances", null, 1, -1, RuleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleTrigger_ActionRealisations(), this.getActionRealisation(), null, "actionRealisations", null, 1, -1, RuleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleTrigger_TrigerringTime(), ecorePackage.getEDate(), "trigerringTime", null, 1, 1, RuleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleTrigger_ExecutionContext(), this.getExecutionContext(), null, "executionContext", null, 1, 1, RuleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
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
		  (executionContextEClass, 
		   source, 
		   new String[] {
			 "constraints", "execution_context_total_cost execution_context_unit_cost"
		   });	
		addAnnotation
		  (measurementEClass, 
		   source, 
		   new String[] {
			 "constraints", "measurement_slo_refer_to_correct_metric measurement_event_instance_same_metric correct_measurement_value measurement_metric_refers_to_correct_execution_context"
		   });	
		addAnnotation
		  (applicationMeasurementEClass, 
		   source, 
		   new String[] {
			 "constraints", "application_measurement_same_app"
		   });	
		addAnnotation
		  (internalComponentMeasurementEClass, 
		   source, 
		   new String[] {
			 "constraints", "internal_component_measurement_metric_refer_to_same_component internal_component_measurement_included_in_execution_context"
		   });	
		addAnnotation
		  (communicationMeasurementEClass, 
		   source, 
		   new String[] {
			 "constraints", "resource_coupling_measurement_diff_vm_instances"
		   });	
		addAnnotation
		  (vmMeasurementEClass, 
		   source, 
		   new String[] {
			 "constraints", "resource_measurement_ec_deployment_model_vm_instance resource_measurement_metric_vm_instance"
		   });	
		addAnnotation
		  (sloAssessmentEClass, 
		   source, 
		   new String[] {
			 "constraints", "slo_assessment_same_metric slo_assessment_slo_in_reqs_for_execution_context slo_assessment_same_exec_context"
		   });	
		addAnnotation
		  (ruleTriggerEClass, 
		   source, 
		   new String[] {
			 "constraints", "rule_trigger_event_instance_correct_events rule_trigger_correct_action rule_trigger_scal_reqs_of_correct_dep_model"
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
		  (executionContextEClass, 
		   source, 
		   new String[] {
			 "execution_context_total_cost", "Tuple {\n\tmessage : String = \'The total cost of execution context: \' + self.name +\n\t\t\t\t\' should be non-negative\',\n\tstatus : Boolean = self.totalCost >= 0\n}.status",
			 "execution_context_unit_cost", "Tuple {\n\tmessage : String = \'The unit of cost should be provided as the totalCost of execution context: \'\n\t\t\t\t+ self.name + \' is positive\',\n\tstatus : Boolean = self.totalCost > 0 implies costUnit <> null\n}.status"
		   });	
		addAnnotation
		  (measurementEClass, 
		   source, 
		   new String[] {
			 "measurement_slo_refer_to_correct_metric", "Tuple {\n\tmessage : String = \'Measurement: \' + self.name +\n\t\t\t\t\' should have a metric instance with a type that maps to the metric referred to by the the measurement\\\'s respective SLO\',\n\tstatus : Boolean = self.slo\n\t\t\t\t<> null implies (if (self.slo.customServiceLevel.oclIsTypeOf(camel::metric::MetricCondition))\n\t\t\t\tthen self.slo.customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.metric =\n\t\t\t\t\tself.metricInstance.metric\n\t\t\t\telse false\n\t\t\t\tendif)\n}.status",
			 "measurement_event_instance_same_metric", "Tuple {\n\tmessage : String = \'Measurement: \' + self.name +\n\t\t\t\t\' maps to non-functional event instance : \' + eventInstance.toString() +\n\t\t\t\t\' with a type related to a metric different from the one of this measurement\',\n\tstatus : Boolean = (self.eventInstance <> null and\n\t\t\t\tself.eventInstance.event.oclIsTypeOf(camel::scalability::NonFunctionalEvent)) implies self.metricInstance.metric =\n\t\t\t\tself.eventInstance.event.oclAsType(camel::scalability::NonFunctionalEvent).metricCondition.metricContext.metric\n}.status",
			 "correct_measurement_value", "Tuple {\n\tmessage : String = \'Measurement: \' + self.name + \' has a value: \' + value.toString() +\n\t\t\t\t\' that is outside the range of values of metric instance: \' + metricInstance.name,\n\tstatus : Boolean = let type :\n\t\t\t\tcamel::type::ValueType = metricInstance.metric.valueType\n\t\t\tin if (type <> null)\n\t\t\t\tthen if (type.oclIsTypeOf(camel::type::Range))\n\t\t\t\t\tthen type.oclAsType(camel::type::Range).includesValue(self.value)\n\t\t\t\t\telse if (type.oclIsTypeOf(camel::type::RangeUnion))\n\t\t\t\t\t\tthen type.oclAsType(camel::type::RangeUnion).includesValue(self.value)\n\t\t\t\t\t\telse true\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\telse true\n\t\t\t\tendif\n}.status",
			 "measurement_metric_refers_to_correct_execution_context", "Tuple {\n\tmessage : String = \'Measurement: \' + self.name +\n\t\t\t\t\' has execution context:\' + executionContext.name +\n\t\t\t\t\' which is different from the one of the binding of the respective metric instance:\' +\n\t\t\t\tmetricInstance.name,\n\tstatus : Boolean = executionContext = metricInstance.objectBinding.executionContext\n}.status"
		   });	
		addAnnotation
		  (applicationMeasurementEClass, 
		   source, 
		   new String[] {
			 "application_measurement_same_app", "Tuple {\n\tmessage : String = \'ApplicationMeasurement: \' + self.name +\n\t\t\t\t\' has a different application from the one referenced by its execution context: \' +\n\t\t\t\tself.executionContext.name,\n\tstatus : Boolean = self.executionContext.application = self.application\n}.status"
		   });	
		addAnnotation
		  (internalComponentMeasurementEClass, 
		   source, 
		   new String[] {
			 "internal_component_measurement_metric_refer_to_same_component", "Tuple {\n\tmessage : String = \'The ComponentInstance: \' +\n\t\t\t\tinternalComponentInstance.name + \' of InternalComponentMeasurement: \' + self.name +\n\t\t\t\t\' is different from the one referenced by the binding of the respective metric instance: \' +\n\t\t\t\tself.metricInstance.name,\n\tstatus : Boolean = metricInstance.objectBinding.oclIsTypeOf(camel::metric::MetricComponentBinding) and\n\t\t\t\tmetricInstance.objectBinding.oclAsType(camel::metric::MetricComponentBinding).componentInstance =\n\t\t\t\tinternalComponentInstance\n}.status",
			 "internal_component_measurement_included_in_execution_context", "Tuple {\n\tmessage : String = \'ComponentInstance: \' +\n\t\t\t\tinternalComponentInstance.name + \' is not included in the deployment model of execution context: \' +\n\t\t\t\tself.executionContext.name + \' for InternalComponentMeasurement: \' +\n\t\t\t\tself.name,\n\tstatus : Boolean = executionContext.deploymentModel.internalComponentInstances\n\t\t\t\t->includes(internalComponentInstance)\n}.status"
		   });	
		addAnnotation
		  (communicationMeasurementEClass, 
		   source, 
		   new String[] {
			 "resource_coupling_measurement_diff_vm_instances", "Tuple {\n\tmessage : String = \'The source: \' + sourceVMInstance.name +\n\t\t\t\t\' and destination: \' + destinationVMInstance.name + \' VM instances of ResourceCouplingMeasurement: \' + self.name +\n\t\t\t\t\' are either identical or not included in the deployment model of the respective execution context: \' +\n\t\t\t\tself.executionContext.name,\n\tstatus : Boolean = sourceVMInstance <> destinationVMInstance and\n\t\t\t\t(executionContext.deploymentModel.vmInstances\n\t\t\t\t->includes(sourceVMInstance)) and (executionContext.deploymentModel.vmInstances\n\t\t\t\t->includes(destinationVMInstance))\n}.status"
		   });	
		addAnnotation
		  (vmMeasurementEClass, 
		   source, 
		   new String[] {
			 "resource_measurement_ec_deployment_model_vm_instance", "Tuple {\n\tmessage : String = \'The VMInstance: \' + vmInstance.name +\n\t\t\t\t\' of ResourceMeasurement: \' + self.name +\n\t\t\t\t\' is not included in the deployment model of the respective execution context: \' +\n\t\t\t\tself.executionContext.name,\n\tstatus : Boolean = vmInstance <> null implies (executionContext.deploymentModel.vmInstances\n\t\t\t\t->includes(vmInstance))\n}.status",
			 "resource_measurement_metric_vm_instance", "Tuple {\n\tmessage : String = \'The binding of metric instance: \' + metricInstance.name +\n\t\t\t\t\' associated to ResourceMeasurement: \' + self.name +\n\t\t\t\t\' refers to a different VMInstance from the one related to this measurement\',\n\tstatus : Boolean = vmInstance <> null implies\n\t\t\t\t(metricInstance.objectBinding.oclIsTypeOf(camel::metric::MetricVMBinding) and\n\t\t\t\tmetricInstance.objectBinding.oclAsType(camel::metric::MetricVMBinding).vmInstance = vmInstance)\n}.status"
		   });	
		addAnnotation
		  (sloAssessmentEClass, 
		   source, 
		   new String[] {
			 "slo_assessment_same_metric", "Tuple {\n\tmessage : String = \'The metric in slo: \' + slo.name + \' of SLOAssessment: \' + self.name +\n\t\t\t\t\' is not the same as the one referenced by the respective measurement: \' + measurement.name,\n\tstatus : Boolean = if\n\t\t\t\t\t(slo.customServiceLevel.oclIsTypeOf(camel::metric::MetricCondition))\n\t\t\t\tthen measurement.metricInstance.metric =\n\t\t\t\t\tslo.customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.metric\n\t\t\t\telse false\n\t\t\t\tendif\n}.status",
			 "slo_assessment_slo_in_reqs_for_execution_context", "Tuple {\n\tmessage : String = \'SLO: \' + self.slo.name +\n\t\t\t\t\' is not included in the requirement group of the respective execution context: \' + self.executionContext.name +\n\t\t\t\t\' of SLO Assessment: \' + self.name,\n\tstatus : Boolean = self.executionContext.requirementGroup.requirements\n\t\t\t\t->includes(self.slo)\n}.status",
			 "slo_assessment_same_exec_context", "Tuple {\n\tmessage : String = \'ExecutionContext: \' + executionContext.name + \' in SLOAssessment: \' +\n\t\t\t\tself.name + \' is not the same as the one of the respective measurement: \' +\n\t\t\t\tself.measurement.name,\n\tstatus : Boolean = executionContext = measurement.executionContext\n}.status"
		   });	
		addAnnotation
		  (ruleTriggerEClass, 
		   source, 
		   new String[] {
			 "rule_trigger_event_instance_correct_events", "Tuple {\n\tmessage : String = \'The eventInstances \' + \' of RuleTrigger: \' + self.name +\n\t\t\t\t\' do not correspond to the event(s) of the respective scalability rule: \' + self.scalabilityRule.name,\n\tstatus : Boolean = if\n\t\t\t\t\t(self.scalabilityRule.event.oclIsKindOf(camel::scalability::SimpleEvent))\n\t\t\t\tthen (self.eventInstances\n\t\t\t\t\t->size() = 1 and self.eventInstances\n\t\t\t\t\t->exists(p | p.event.oclAsType(camel::scalability::SimpleEvent) =\n\t\t\t\t\t\tself.scalabilityRule.event.oclAsType(camel::scalability::SimpleEvent)))\n\t\t\t\telse self.eventInstances\n\t\t\t\t\t->forAll(p | self.scalabilityRule.event.oclAsType(camel::scalability::EventPattern).includesEvent(p.event))\n\t\t\t\tendif\n}.status",
			 "rule_trigger_correct_action", "Tuple {\n\tmessage : String = \'Either the size of action realizations for RuleTrigger: \' + self.name +\n\t\t\t\t\' is not the same as the one corresponding to the actions of the respective scalability rule: \' +\n\t\t\t\tself.scalabilityRule.name +\n\t\t\t\t\' or there is an action realization mapping to an action not contained in the action list of the trigger\\\'s scalability rule\',\n\tstatus : Boolean = (self.actionRealisations\n\t\t\t\t->size() = self.scalabilityRule.actions\n\t\t\t\t->size()) and (self.actionRealisations\n\t\t\t\t->forAll(p | self.scalabilityRule.actions\n\t\t\t\t\t->exists(q | q = p.action)))\n}.status",
			 "rule_trigger_scal_reqs_of_correct_dep_model", "Tuple {\n\tmessage : String = \'There is a scale requirements for the scalability rule: \' +\n\t\t\t\tself.scalabilityRule.name + \' of RuleTrigger: \' + self.name +\n\t\t\t\t\' with a component or vm not included in the deployment model of the trigger\\\'s respective execution context: \' +\n\t\t\t\tself.executionContext.name,\n\tstatus : Boolean = scalabilityRule.scaleRequirements\n\t\t\t\t->forAll(p | if (p.oclIsTypeOf(camel::requirement::HorizontalScaleRequirement) and\n\t\t\t\t\t\tp.oclAsType(camel::requirement::HorizontalScaleRequirement).component <> null)\n\t\t\t\t\tthen (executionContext.deploymentModel.internalComponents\n\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::HorizontalScaleRequirement).component))\n\t\t\t\t\telse if (p.oclIsTypeOf(camel::requirement::VerticalScaleRequirement) and\n\t\t\t\t\t\t\tp.oclAsType(camel::requirement::VerticalScaleRequirement).vm <> null)\n\t\t\t\t\t\tthen (executionContext.deploymentModel.vms\n\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::VerticalScaleRequirement).vm))\n\t\t\t\t\t\telse true\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif)\n}.status"
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
		  (getExecutionContext_Name(), 
		   source, 
		   new String[] {
			 "body", "Measurement",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getExecutionContext_StartTime(), 
		   source, 
		   new String[] {
			 "body", "Measurement",
			 "unique", "false",
			 "upper", "*"
		   });
	}

} //ExecutionPackageImpl
