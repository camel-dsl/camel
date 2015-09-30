/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.CamelPackage;
import eu.paasage.camel.deployment.DeploymentPackage;
import eu.paasage.camel.deployment.impl.DeploymentPackageImpl;
import eu.paasage.camel.execution.ExecutionPackage;
import eu.paasage.camel.execution.impl.ExecutionPackageImpl;
import eu.paasage.camel.impl.CamelPackageImpl;
import eu.paasage.camel.location.LocationPackage;
import eu.paasage.camel.location.impl.LocationPackageImpl;
import eu.paasage.camel.metric.ComparisonOperatorType;
import eu.paasage.camel.metric.CompositeMetric;
import eu.paasage.camel.metric.CompositeMetricContext;
import eu.paasage.camel.metric.CompositeMetricInstance;
import eu.paasage.camel.metric.Condition;
import eu.paasage.camel.metric.ConditionContext;
import eu.paasage.camel.metric.FunctionPatternType;
import eu.paasage.camel.metric.Metric;
import eu.paasage.camel.metric.MetricApplicationBinding;
import eu.paasage.camel.metric.MetricComponentBinding;
import eu.paasage.camel.metric.MetricCondition;
import eu.paasage.camel.metric.MetricContext;
import eu.paasage.camel.metric.MetricFactory;
import eu.paasage.camel.metric.MetricFormula;
import eu.paasage.camel.metric.MetricFormulaParameter;
import eu.paasage.camel.metric.MetricFunctionArityType;
import eu.paasage.camel.metric.MetricFunctionType;
import eu.paasage.camel.metric.MetricInstance;
import eu.paasage.camel.metric.MetricModel;
import eu.paasage.camel.metric.MetricObjectBinding;
import eu.paasage.camel.metric.MetricPackage;
import eu.paasage.camel.metric.MetricVMBinding;
import eu.paasage.camel.metric.Property;
import eu.paasage.camel.metric.PropertyCondition;
import eu.paasage.camel.metric.PropertyContext;
import eu.paasage.camel.metric.PropertyType;
import eu.paasage.camel.metric.QuantifierType;
import eu.paasage.camel.metric.RawMetric;
import eu.paasage.camel.metric.RawMetricContext;
import eu.paasage.camel.metric.RawMetricInstance;
import eu.paasage.camel.metric.Schedule;
import eu.paasage.camel.metric.ScheduleType;
import eu.paasage.camel.metric.Sensor;
import eu.paasage.camel.metric.Window;
import eu.paasage.camel.metric.WindowSizeType;
import eu.paasage.camel.metric.WindowType;
import eu.paasage.camel.metric.util.MetricValidator;
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
public class MetricPackageImpl extends EPackageImpl implements MetricPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeMetricInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rawMetricInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricFormulaParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rawMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricObjectBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricApplicationBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricComponentBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricVMBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeMetricContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rawMetricContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonOperatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metricFunctionArityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metricFunctionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scheduleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum windowSizeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum windowTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantifierTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functionPatternTypeEEnum = null;

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
	 * @see eu.paasage.camel.metric.MetricPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetricPackageImpl() {
		super(eNS_URI, MetricFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MetricPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetricPackage init() {
		if (isInited) return (MetricPackage)EPackage.Registry.INSTANCE.getEPackage(MetricPackage.eNS_URI);

		// Obtain or create and register package
		MetricPackageImpl theMetricPackage = (MetricPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetricPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MetricPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CamelPackageImpl theCamelPackage = (CamelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) instanceof CamelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) : CamelPackage.eINSTANCE);
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) instanceof ExecutionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) : ExecutionPackage.eINSTANCE);
		LocationPackageImpl theLocationPackage = (LocationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI) instanceof LocationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI) : LocationPackage.eINSTANCE);
		OrganisationPackageImpl theOrganisationPackage = (OrganisationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganisationPackage.eNS_URI) instanceof OrganisationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganisationPackage.eNS_URI) : OrganisationPackage.eINSTANCE);
		ProviderPackageImpl theProviderPackage = (ProviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI) instanceof ProviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI) : ProviderPackage.eINSTANCE);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) : RequirementPackage.eINSTANCE);
		ScalabilityPackageImpl theScalabilityPackage = (ScalabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScalabilityPackage.eNS_URI) instanceof ScalabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScalabilityPackage.eNS_URI) : ScalabilityPackage.eINSTANCE);
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) instanceof SecurityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) : SecurityPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) : UnitPackage.eINSTANCE);

		// Create package meta-data objects
		theMetricPackage.createPackageContents();
		theCamelPackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theLocationPackage.createPackageContents();
		theOrganisationPackage.createPackageContents();
		theProviderPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theScalabilityPackage.createPackageContents();
		theSecurityPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theUnitPackage.createPackageContents();

		// Initialize created meta-data
		theMetricPackage.initializePackageContents();
		theCamelPackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theLocationPackage.initializePackageContents();
		theOrganisationPackage.initializePackageContents();
		theProviderPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theScalabilityPackage.initializePackageContents();
		theSecurityPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theUnitPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMetricPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MetricValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMetricPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetricPackage.eNS_URI, theMetricPackage);
		return theMetricPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Validity() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Name() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Threshold() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_ComparisonOperator() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricCondition() {
		return metricConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricCondition_MetricContext() {
		return (EReference)metricConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyCondition() {
		return propertyConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyCondition_PropertyContext() {
		return (EReference)propertyConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyCondition_Unit() {
		return (EReference)propertyConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyCondition_TimeUnit() {
		return (EReference)propertyConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricInstance() {
		return metricInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricInstance_Name() {
		return (EAttribute)metricInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricInstance_Metric() {
		return (EReference)metricInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricInstance_Schedule() {
		return (EReference)metricInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricInstance_Window() {
		return (EReference)metricInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricInstance_ObjectBinding() {
		return (EReference)metricInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricInstance_MetricContext() {
		return (EReference)metricInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMetricInstance__CheckRecursiveness__MetricInstance_MetricInstance() {
		return metricInstanceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeMetricInstance() {
		return compositeMetricInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeMetricInstance_ComposingMetricInstances() {
		return (EReference)compositeMetricInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRawMetricInstance() {
		return rawMetricInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRawMetricInstance_Sensor() {
		return (EReference)rawMetricInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricFormulaParameter() {
		return metricFormulaParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricFormulaParameter_Value() {
		return (EReference)metricFormulaParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricFormulaParameter_Name() {
		return (EAttribute)metricFormulaParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricFormula() {
		return metricFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricFormula_Function() {
		return (EAttribute)metricFormulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricFormula_FunctionArity() {
		return (EAttribute)metricFormulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricFormula_FunctionPattern() {
		return (EAttribute)metricFormulaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricFormula_Parameters() {
		return (EReference)metricFormulaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMetricFormula__ContainsMetric__Metric() {
		return metricFormulaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Description() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetric_ValueType() {
		return (EReference)metricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_ValueDirection() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetric_Unit() {
		return (EReference)metricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Layer() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetric_Property() {
		return (EReference)metricEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMetric__CheckRecursiveness__Metric_Metric() {
		return metricEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeMetric() {
		return compositeMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeMetric_Formula() {
		return (EReference)compositeMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompositeMetric__GreaterEqualThanLayer__LayerType_LayerType() {
		return compositeMetricEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRawMetric() {
		return rawMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricObjectBinding() {
		return metricObjectBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricObjectBinding_Name() {
		return (EAttribute)metricObjectBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricObjectBinding_ExecutionContext() {
		return (EReference)metricObjectBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricApplicationBinding() {
		return metricApplicationBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricComponentBinding() {
		return metricComponentBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricComponentBinding_VmInstance() {
		return (EReference)metricComponentBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricComponentBinding_ComponentInstance() {
		return (EReference)metricComponentBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricVMBinding() {
		return metricVMBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricVMBinding_VmInstance() {
		return (EReference)metricVMBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Description() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_SubProperties() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Sensors() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Type() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedule() {
		return scheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_Start() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_End() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_Type() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_Unit() {
		return (EReference)scheduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_Repetitions() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_Interval() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_Name() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSchedule__CheckStartEndDates__Schedule() {
		return scheduleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSchedule__CheckIntervalRepetitions__Schedule() {
		return scheduleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Name() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Configuration() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_IsPush() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindow() {
		return windowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWindow_Unit() {
		return (EReference)windowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_WindowType() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_SizeType() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_MeasurementSize() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_TimeSize() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_Name() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionContext() {
		return conditionContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionContext_Name() {
		return (EAttribute)conditionContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionContext_Component() {
		return (EReference)conditionContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionContext_Application() {
		return (EReference)conditionContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionContext_Quantifier() {
		return (EAttribute)conditionContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionContext_MinQuantity() {
		return (EAttribute)conditionContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionContext_MaxQuantity() {
		return (EAttribute)conditionContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionContext_IsRelative() {
		return (EAttribute)conditionContextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricModel() {
		return metricModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Contexts() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Metrics() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_MetricInstances() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Conditions() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Properties() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Bindings() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Windows() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Schedules() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Parameters() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Sensors() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Units() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricContext() {
		return metricContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricContext_Metric() {
		return (EReference)metricContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricContext_Window() {
		return (EReference)metricContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricContext_Schedule() {
		return (EReference)metricContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeMetricContext() {
		return compositeMetricContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeMetricContext_ComposingMetricContexts() {
		return (EReference)compositeMetricContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRawMetricContext() {
		return rawMetricContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRawMetricContext_Sensor() {
		return (EReference)rawMetricContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyContext() {
		return propertyContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyContext_Property() {
		return (EReference)propertyContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonOperatorType() {
		return comparisonOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetricFunctionArityType() {
		return metricFunctionArityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetricFunctionType() {
		return metricFunctionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyType() {
		return propertyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScheduleType() {
		return scheduleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWindowSizeType() {
		return windowSizeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWindowType() {
		return windowTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuantifierType() {
		return quantifierTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFunctionPatternType() {
		return functionPatternTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricFactory getMetricFactory() {
		return (MetricFactory)getEFactoryInstance();
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
		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__NAME);
		createEAttribute(conditionEClass, CONDITION__COMPARISON_OPERATOR);
		createEAttribute(conditionEClass, CONDITION__THRESHOLD);
		createEAttribute(conditionEClass, CONDITION__VALIDITY);

		metricConditionEClass = createEClass(METRIC_CONDITION);
		createEReference(metricConditionEClass, METRIC_CONDITION__METRIC_CONTEXT);

		propertyConditionEClass = createEClass(PROPERTY_CONDITION);
		createEReference(propertyConditionEClass, PROPERTY_CONDITION__PROPERTY_CONTEXT);
		createEReference(propertyConditionEClass, PROPERTY_CONDITION__UNIT);
		createEReference(propertyConditionEClass, PROPERTY_CONDITION__TIME_UNIT);

		metricInstanceEClass = createEClass(METRIC_INSTANCE);
		createEAttribute(metricInstanceEClass, METRIC_INSTANCE__NAME);
		createEReference(metricInstanceEClass, METRIC_INSTANCE__METRIC);
		createEReference(metricInstanceEClass, METRIC_INSTANCE__SCHEDULE);
		createEReference(metricInstanceEClass, METRIC_INSTANCE__WINDOW);
		createEReference(metricInstanceEClass, METRIC_INSTANCE__OBJECT_BINDING);
		createEReference(metricInstanceEClass, METRIC_INSTANCE__METRIC_CONTEXT);
		createEOperation(metricInstanceEClass, METRIC_INSTANCE___CHECK_RECURSIVENESS__METRICINSTANCE_METRICINSTANCE);

		compositeMetricInstanceEClass = createEClass(COMPOSITE_METRIC_INSTANCE);
		createEReference(compositeMetricInstanceEClass, COMPOSITE_METRIC_INSTANCE__COMPOSING_METRIC_INSTANCES);

		rawMetricInstanceEClass = createEClass(RAW_METRIC_INSTANCE);
		createEReference(rawMetricInstanceEClass, RAW_METRIC_INSTANCE__SENSOR);

		metricFormulaParameterEClass = createEClass(METRIC_FORMULA_PARAMETER);
		createEAttribute(metricFormulaParameterEClass, METRIC_FORMULA_PARAMETER__NAME);
		createEReference(metricFormulaParameterEClass, METRIC_FORMULA_PARAMETER__VALUE);

		metricFormulaEClass = createEClass(METRIC_FORMULA);
		createEAttribute(metricFormulaEClass, METRIC_FORMULA__FUNCTION);
		createEAttribute(metricFormulaEClass, METRIC_FORMULA__FUNCTION_ARITY);
		createEAttribute(metricFormulaEClass, METRIC_FORMULA__FUNCTION_PATTERN);
		createEReference(metricFormulaEClass, METRIC_FORMULA__PARAMETERS);
		createEOperation(metricFormulaEClass, METRIC_FORMULA___CONTAINS_METRIC__METRIC);

		metricEClass = createEClass(METRIC);
		createEAttribute(metricEClass, METRIC__DESCRIPTION);
		createEReference(metricEClass, METRIC__VALUE_TYPE);
		createEAttribute(metricEClass, METRIC__VALUE_DIRECTION);
		createEReference(metricEClass, METRIC__UNIT);
		createEAttribute(metricEClass, METRIC__LAYER);
		createEReference(metricEClass, METRIC__PROPERTY);
		createEOperation(metricEClass, METRIC___CHECK_RECURSIVENESS__METRIC_METRIC);

		compositeMetricEClass = createEClass(COMPOSITE_METRIC);
		createEReference(compositeMetricEClass, COMPOSITE_METRIC__FORMULA);
		createEOperation(compositeMetricEClass, COMPOSITE_METRIC___GREATER_EQUAL_THAN_LAYER__LAYERTYPE_LAYERTYPE);

		rawMetricEClass = createEClass(RAW_METRIC);

		metricObjectBindingEClass = createEClass(METRIC_OBJECT_BINDING);
		createEAttribute(metricObjectBindingEClass, METRIC_OBJECT_BINDING__NAME);
		createEReference(metricObjectBindingEClass, METRIC_OBJECT_BINDING__EXECUTION_CONTEXT);

		metricApplicationBindingEClass = createEClass(METRIC_APPLICATION_BINDING);

		metricComponentBindingEClass = createEClass(METRIC_COMPONENT_BINDING);
		createEReference(metricComponentBindingEClass, METRIC_COMPONENT_BINDING__VM_INSTANCE);
		createEReference(metricComponentBindingEClass, METRIC_COMPONENT_BINDING__COMPONENT_INSTANCE);

		metricVMBindingEClass = createEClass(METRIC_VM_BINDING);
		createEReference(metricVMBindingEClass, METRIC_VM_BINDING__VM_INSTANCE);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__DESCRIPTION);
		createEAttribute(propertyEClass, PROPERTY__TYPE);
		createEReference(propertyEClass, PROPERTY__SUB_PROPERTIES);
		createEReference(propertyEClass, PROPERTY__SENSORS);

		scheduleEClass = createEClass(SCHEDULE);
		createEAttribute(scheduleEClass, SCHEDULE__NAME);
		createEAttribute(scheduleEClass, SCHEDULE__START);
		createEAttribute(scheduleEClass, SCHEDULE__END);
		createEAttribute(scheduleEClass, SCHEDULE__TYPE);
		createEReference(scheduleEClass, SCHEDULE__UNIT);
		createEAttribute(scheduleEClass, SCHEDULE__REPETITIONS);
		createEAttribute(scheduleEClass, SCHEDULE__INTERVAL);
		createEOperation(scheduleEClass, SCHEDULE___CHECK_START_END_DATES__SCHEDULE);
		createEOperation(scheduleEClass, SCHEDULE___CHECK_INTERVAL_REPETITIONS__SCHEDULE);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__NAME);
		createEAttribute(sensorEClass, SENSOR__CONFIGURATION);
		createEAttribute(sensorEClass, SENSOR__IS_PUSH);

		windowEClass = createEClass(WINDOW);
		createEAttribute(windowEClass, WINDOW__NAME);
		createEReference(windowEClass, WINDOW__UNIT);
		createEAttribute(windowEClass, WINDOW__WINDOW_TYPE);
		createEAttribute(windowEClass, WINDOW__SIZE_TYPE);
		createEAttribute(windowEClass, WINDOW__MEASUREMENT_SIZE);
		createEAttribute(windowEClass, WINDOW__TIME_SIZE);

		conditionContextEClass = createEClass(CONDITION_CONTEXT);
		createEAttribute(conditionContextEClass, CONDITION_CONTEXT__NAME);
		createEReference(conditionContextEClass, CONDITION_CONTEXT__COMPONENT);
		createEReference(conditionContextEClass, CONDITION_CONTEXT__APPLICATION);
		createEAttribute(conditionContextEClass, CONDITION_CONTEXT__QUANTIFIER);
		createEAttribute(conditionContextEClass, CONDITION_CONTEXT__MIN_QUANTITY);
		createEAttribute(conditionContextEClass, CONDITION_CONTEXT__MAX_QUANTITY);
		createEAttribute(conditionContextEClass, CONDITION_CONTEXT__IS_RELATIVE);

		metricModelEClass = createEClass(METRIC_MODEL);
		createEReference(metricModelEClass, METRIC_MODEL__CONTEXTS);
		createEReference(metricModelEClass, METRIC_MODEL__METRICS);
		createEReference(metricModelEClass, METRIC_MODEL__METRIC_INSTANCES);
		createEReference(metricModelEClass, METRIC_MODEL__CONDITIONS);
		createEReference(metricModelEClass, METRIC_MODEL__PROPERTIES);
		createEReference(metricModelEClass, METRIC_MODEL__BINDINGS);
		createEReference(metricModelEClass, METRIC_MODEL__WINDOWS);
		createEReference(metricModelEClass, METRIC_MODEL__SCHEDULES);
		createEReference(metricModelEClass, METRIC_MODEL__PARAMETERS);
		createEReference(metricModelEClass, METRIC_MODEL__SENSORS);
		createEReference(metricModelEClass, METRIC_MODEL__UNITS);

		metricContextEClass = createEClass(METRIC_CONTEXT);
		createEReference(metricContextEClass, METRIC_CONTEXT__METRIC);
		createEReference(metricContextEClass, METRIC_CONTEXT__WINDOW);
		createEReference(metricContextEClass, METRIC_CONTEXT__SCHEDULE);

		compositeMetricContextEClass = createEClass(COMPOSITE_METRIC_CONTEXT);
		createEReference(compositeMetricContextEClass, COMPOSITE_METRIC_CONTEXT__COMPOSING_METRIC_CONTEXTS);

		rawMetricContextEClass = createEClass(RAW_METRIC_CONTEXT);
		createEReference(rawMetricContextEClass, RAW_METRIC_CONTEXT__SENSOR);

		propertyContextEClass = createEClass(PROPERTY_CONTEXT);
		createEReference(propertyContextEClass, PROPERTY_CONTEXT__PROPERTY);

		// Create enums
		comparisonOperatorTypeEEnum = createEEnum(COMPARISON_OPERATOR_TYPE);
		metricFunctionArityTypeEEnum = createEEnum(METRIC_FUNCTION_ARITY_TYPE);
		metricFunctionTypeEEnum = createEEnum(METRIC_FUNCTION_TYPE);
		propertyTypeEEnum = createEEnum(PROPERTY_TYPE);
		scheduleTypeEEnum = createEEnum(SCHEDULE_TYPE);
		windowSizeTypeEEnum = createEEnum(WINDOW_SIZE_TYPE);
		windowTypeEEnum = createEEnum(WINDOW_TYPE);
		quantifierTypeEEnum = createEEnum(QUANTIFIER_TYPE);
		functionPatternTypeEEnum = createEEnum(FUNCTION_PATTERN_TYPE);
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
		UnitPackage theUnitPackage = (UnitPackage)EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI);
		TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
		CamelPackage theCamelPackage = (CamelPackage)EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI);
		ExecutionPackage theExecutionPackage = (ExecutionPackage)EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);
		DeploymentPackage theDeploymentPackage = (DeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		metricConditionEClass.getESuperTypes().add(this.getCondition());
		propertyConditionEClass.getESuperTypes().add(this.getCondition());
		compositeMetricInstanceEClass.getESuperTypes().add(this.getMetricInstance());
		rawMetricInstanceEClass.getESuperTypes().add(this.getMetricInstance());
		metricFormulaEClass.getESuperTypes().add(this.getMetricFormulaParameter());
		metricEClass.getESuperTypes().add(this.getMetricFormulaParameter());
		compositeMetricEClass.getESuperTypes().add(this.getMetric());
		rawMetricEClass.getESuperTypes().add(this.getMetric());
		metricApplicationBindingEClass.getESuperTypes().add(this.getMetricObjectBinding());
		metricComponentBindingEClass.getESuperTypes().add(this.getMetricObjectBinding());
		metricVMBindingEClass.getESuperTypes().add(this.getMetricObjectBinding());
		metricModelEClass.getESuperTypes().add(theCamelPackage.getModel());
		metricContextEClass.getESuperTypes().add(this.getConditionContext());
		compositeMetricContextEClass.getESuperTypes().add(this.getMetricContext());
		rawMetricContextEClass.getESuperTypes().add(this.getMetricContext());
		propertyContextEClass.getESuperTypes().add(this.getConditionContext());

		// Initialize classes, features, and operations; add parameters
		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Name(), ecorePackage.getEString(), "name", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_ComparisonOperator(), this.getComparisonOperatorType(), "comparisonOperator", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_Threshold(), ecorePackage.getEDouble(), "threshold", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_Validity(), ecorePackage.getEDate(), "validity", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricConditionEClass, MetricCondition.class, "MetricCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetricCondition_MetricContext(), this.getMetricContext(), null, "metricContext", null, 1, 1, MetricCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyConditionEClass, PropertyCondition.class, "PropertyCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyCondition_PropertyContext(), this.getPropertyContext(), null, "propertyContext", null, 1, 1, PropertyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyCondition_Unit(), theUnitPackage.getMonetaryUnit(), null, "unit", null, 0, 1, PropertyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyCondition_TimeUnit(), theUnitPackage.getTimeIntervalUnit(), null, "timeUnit", null, 0, 1, PropertyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricInstanceEClass, MetricInstance.class, "MetricInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetricInstance_Name(), ecorePackage.getEString(), "name", null, 1, 1, MetricInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricInstance_Metric(), this.getMetric(), null, "metric", null, 1, 1, MetricInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricInstance_Schedule(), this.getSchedule(), null, "schedule", null, 0, 1, MetricInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricInstance_Window(), this.getWindow(), null, "window", null, 0, 1, MetricInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricInstance_ObjectBinding(), this.getMetricObjectBinding(), null, "objectBinding", null, 1, 1, MetricInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricInstance_MetricContext(), this.getMetricContext(), null, "metricContext", null, 0, 1, MetricInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getMetricInstance__CheckRecursiveness__MetricInstance_MetricInstance(), ecorePackage.getEBoolean(), "checkRecursiveness", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetricInstance(), "m1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetricInstance(), "m2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compositeMetricInstanceEClass, CompositeMetricInstance.class, "CompositeMetricInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeMetricInstance_ComposingMetricInstances(), this.getMetricInstance(), null, "composingMetricInstances", null, 1, -1, CompositeMetricInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rawMetricInstanceEClass, RawMetricInstance.class, "RawMetricInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRawMetricInstance_Sensor(), this.getSensor(), null, "sensor", null, 1, 1, RawMetricInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricFormulaParameterEClass, MetricFormulaParameter.class, "MetricFormulaParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetricFormulaParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, MetricFormulaParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricFormulaParameter_Value(), theTypePackage.getSingleValue(), null, "value", null, 0, 1, MetricFormulaParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricFormulaEClass, MetricFormula.class, "MetricFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetricFormula_Function(), this.getMetricFunctionType(), "function", null, 1, 1, MetricFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetricFormula_FunctionArity(), this.getMetricFunctionArityType(), "functionArity", null, 1, 1, MetricFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetricFormula_FunctionPattern(), this.getFunctionPatternType(), "functionPattern", null, 0, 1, MetricFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricFormula_Parameters(), this.getMetricFormulaParameter(), null, "parameters", null, 1, -1, MetricFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMetricFormula__ContainsMetric__Metric(), ecorePackage.getEBoolean(), "containsMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetric(), "m", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(metricEClass, Metric.class, "Metric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetric_Description(), ecorePackage.getEString(), "description", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetric_ValueType(), theTypePackage.getValueType(), null, "valueType", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_ValueDirection(), ecorePackage.getEShort(), "valueDirection", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetric_Unit(), theUnitPackage.getUnit(), null, "unit", null, 1, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Layer(), theCamelPackage.getLayerType(), "layer", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetric_Property(), this.getProperty(), null, "property", null, 1, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMetric__CheckRecursiveness__Metric_Metric(), ecorePackage.getEBoolean(), "checkRecursiveness", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetric(), "mt1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetric(), "mt2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compositeMetricEClass, CompositeMetric.class, "CompositeMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeMetric_Formula(), this.getMetricFormula(), null, "formula", null, 1, 1, CompositeMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCompositeMetric__GreaterEqualThanLayer__LayerType_LayerType(), ecorePackage.getEBoolean(), "greaterEqualThanLayer", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCamelPackage.getLayerType(), "l1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCamelPackage.getLayerType(), "l2", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rawMetricEClass, RawMetric.class, "RawMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metricObjectBindingEClass, MetricObjectBinding.class, "MetricObjectBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetricObjectBinding_Name(), ecorePackage.getEString(), "name", null, 1, 1, MetricObjectBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricObjectBinding_ExecutionContext(), theExecutionPackage.getExecutionContext(), null, "executionContext", null, 1, 1, MetricObjectBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricApplicationBindingEClass, MetricApplicationBinding.class, "MetricApplicationBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metricComponentBindingEClass, MetricComponentBinding.class, "MetricComponentBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetricComponentBinding_VmInstance(), theDeploymentPackage.getVMInstance(), null, "vmInstance", null, 0, 1, MetricComponentBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricComponentBinding_ComponentInstance(), theDeploymentPackage.getComponentInstance(), null, "componentInstance", null, 1, 1, MetricComponentBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricVMBindingEClass, MetricVMBinding.class, "MetricVMBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetricVMBinding_VmInstance(), theDeploymentPackage.getVMInstance(), null, "vmInstance", null, 1, 1, MetricVMBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Description(), ecorePackage.getEString(), "description", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Type(), this.getPropertyType(), "type", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_SubProperties(), this.getProperty(), null, "subProperties", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Sensors(), this.getSensor(), null, "sensors", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchedule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_Start(), ecorePackage.getEDate(), "start", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_End(), ecorePackage.getEDate(), "end", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_Type(), this.getScheduleType(), "type", null, 1, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedule_Unit(), theUnitPackage.getTimeIntervalUnit(), null, "unit", null, 1, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_Repetitions(), ecorePackage.getEInt(), "repetitions", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_Interval(), ecorePackage.getELong(), "interval", null, 1, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSchedule__CheckStartEndDates__Schedule(), ecorePackage.getEBoolean(), "checkStartEndDates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSchedule(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSchedule__CheckIntervalRepetitions__Schedule(), ecorePackage.getEBoolean(), "checkIntervalRepetitions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSchedule(), "s", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Name(), ecorePackage.getEString(), "name", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Configuration(), ecorePackage.getEString(), "configuration", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_IsPush(), ecorePackage.getEBoolean(), "isPush", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(windowEClass, Window.class, "Window", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWindow_Name(), ecorePackage.getEString(), "name", null, 1, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWindow_Unit(), theUnitPackage.getTimeIntervalUnit(), null, "unit", null, 0, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindow_WindowType(), this.getWindowType(), "windowType", null, 1, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindow_SizeType(), this.getWindowSizeType(), "sizeType", null, 1, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindow_MeasurementSize(), ecorePackage.getELong(), "measurementSize", null, 0, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindow_TimeSize(), ecorePackage.getELong(), "timeSize", null, 0, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionContextEClass, ConditionContext.class, "ConditionContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionContext_Name(), ecorePackage.getEString(), "name", null, 1, 1, ConditionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionContext_Component(), theDeploymentPackage.getComponent(), null, "component", null, 0, 1, ConditionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionContext_Application(), theCamelPackage.getApplication(), null, "application", null, 0, 1, ConditionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionContext_Quantifier(), this.getQuantifierType(), "quantifier", "ANY", 1, 1, ConditionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionContext_MinQuantity(), ecorePackage.getEDouble(), "minQuantity", null, 0, 1, ConditionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionContext_MaxQuantity(), ecorePackage.getEDouble(), "maxQuantity", null, 0, 1, ConditionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionContext_IsRelative(), ecorePackage.getEBoolean(), "isRelative", null, 0, 1, ConditionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricModelEClass, MetricModel.class, "MetricModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetricModel_Contexts(), this.getConditionContext(), null, "contexts", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_Metrics(), this.getMetric(), null, "metrics", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMetricModel_MetricInstances(), this.getMetricInstance(), null, "metricInstances", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMetricModel_Conditions(), this.getCondition(), null, "conditions", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMetricModel_Properties(), this.getProperty(), null, "properties", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMetricModel_Bindings(), this.getMetricObjectBinding(), null, "bindings", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMetricModel_Windows(), this.getWindow(), null, "windows", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMetricModel_Schedules(), this.getSchedule(), null, "schedules", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMetricModel_Parameters(), this.getMetricFormulaParameter(), null, "parameters", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMetricModel_Sensors(), this.getSensor(), null, "sensors", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMetricModel_Units(), theUnitPackage.getUnit(), null, "units", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(metricContextEClass, MetricContext.class, "MetricContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetricContext_Metric(), this.getMetric(), null, "metric", null, 1, 1, MetricContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricContext_Window(), this.getWindow(), null, "window", null, 0, 1, MetricContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricContext_Schedule(), this.getSchedule(), null, "schedule", null, 0, 1, MetricContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeMetricContextEClass, CompositeMetricContext.class, "CompositeMetricContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeMetricContext_ComposingMetricContexts(), this.getMetricContext(), null, "composingMetricContexts", null, 0, -1, CompositeMetricContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rawMetricContextEClass, RawMetricContext.class, "RawMetricContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRawMetricContext_Sensor(), this.getSensor(), null, "sensor", null, 1, 1, RawMetricContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyContextEClass, PropertyContext.class, "PropertyContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyContext_Property(), this.getProperty(), null, "property", null, 1, 1, PropertyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(comparisonOperatorTypeEEnum, ComparisonOperatorType.class, "ComparisonOperatorType");
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.GREATER_THAN);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.GREATER_EQUAL_THAN);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.LESS_THAN);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.LESS_EQUAL_THAN);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.EQUAL);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.NOT_EQUAL);

		initEEnum(metricFunctionArityTypeEEnum, MetricFunctionArityType.class, "MetricFunctionArityType");
		addEEnumLiteral(metricFunctionArityTypeEEnum, MetricFunctionArityType.UNARY);
		addEEnumLiteral(metricFunctionArityTypeEEnum, MetricFunctionArityType.BINARY);
		addEEnumLiteral(metricFunctionArityTypeEEnum, MetricFunctionArityType.NARY);

		initEEnum(metricFunctionTypeEEnum, MetricFunctionType.class, "MetricFunctionType");
		addEEnumLiteral(metricFunctionTypeEEnum, MetricFunctionType.PLUS);
		addEEnumLiteral(metricFunctionTypeEEnum, MetricFunctionType.MINUS);
		addEEnumLiteral(metricFunctionTypeEEnum, MetricFunctionType.TIMES);
		addEEnumLiteral(metricFunctionTypeEEnum, MetricFunctionType.DIV);
		addEEnumLiteral(metricFunctionTypeEEnum, MetricFunctionType.MODULO);
		addEEnumLiteral(metricFunctionTypeEEnum, MetricFunctionType.MEAN);
		addEEnumLiteral(metricFunctionTypeEEnum, MetricFunctionType.STD);
		addEEnumLiteral(metricFunctionTypeEEnum, MetricFunctionType.COUNT);
		addEEnumLiteral(metricFunctionTypeEEnum, MetricFunctionType.MIN);
		addEEnumLiteral(metricFunctionTypeEEnum, MetricFunctionType.MAX);
		addEEnumLiteral(metricFunctionTypeEEnum, MetricFunctionType.PERCENTILE);
		addEEnumLiteral(metricFunctionTypeEEnum, MetricFunctionType.DERIVATIVE);
		addEEnumLiteral(metricFunctionTypeEEnum, MetricFunctionType.MODE);
		addEEnumLiteral(metricFunctionTypeEEnum, MetricFunctionType.MEDIAN);

		initEEnum(propertyTypeEEnum, PropertyType.class, "PropertyType");
		addEEnumLiteral(propertyTypeEEnum, PropertyType.ABSTRACT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.MEASURABLE);

		initEEnum(scheduleTypeEEnum, ScheduleType.class, "ScheduleType");
		addEEnumLiteral(scheduleTypeEEnum, ScheduleType.FIXED_RATE);
		addEEnumLiteral(scheduleTypeEEnum, ScheduleType.FIXED_DELAY);
		addEEnumLiteral(scheduleTypeEEnum, ScheduleType.SINGLE_EVENT);

		initEEnum(windowSizeTypeEEnum, WindowSizeType.class, "WindowSizeType");
		addEEnumLiteral(windowSizeTypeEEnum, WindowSizeType.MEASUREMENTS_ONLY);
		addEEnumLiteral(windowSizeTypeEEnum, WindowSizeType.TIME_ONLY);
		addEEnumLiteral(windowSizeTypeEEnum, WindowSizeType.FIRST_MATCH);
		addEEnumLiteral(windowSizeTypeEEnum, WindowSizeType.BOTH_MATCH);

		initEEnum(windowTypeEEnum, WindowType.class, "WindowType");
		addEEnumLiteral(windowTypeEEnum, WindowType.FIXED);
		addEEnumLiteral(windowTypeEEnum, WindowType.SLIDING);

		initEEnum(quantifierTypeEEnum, QuantifierType.class, "QuantifierType");
		addEEnumLiteral(quantifierTypeEEnum, QuantifierType.ANY);
		addEEnumLiteral(quantifierTypeEEnum, QuantifierType.ALL);
		addEEnumLiteral(quantifierTypeEEnum, QuantifierType.SOME);

		initEEnum(functionPatternTypeEEnum, FunctionPatternType.class, "FunctionPatternType");
		addEEnumLiteral(functionPatternTypeEEnum, FunctionPatternType.MAP);
		addEEnumLiteral(functionPatternTypeEEnum, FunctionPatternType.REDUCE);

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
		  (getCondition_Validity(), 
		   source, 
		   new String[] {
			 "body", "MetricCondition",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getMetricInstance_Name(), 
		   source, 
		   new String[] {
			 "body", "MetricFormulaParameter",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getSchedule_Type(), 
		   source, 
		   new String[] {
			 "body", "HorizontalScalingPolicy",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getSensor_Configuration(), 
		   source, 
		   new String[] {
			 "body", "ResourceGroup",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getSensor_IsPush(), 
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
		  (compositeMetricInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "composite_metric_instance_to_components component_instances_metric_map_formula_templates component_metrics_refer_to_same_level_or_lower"
		   });	
		addAnnotation
		  (rawMetricInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "raw_metric_instance_correct_metric_type"
		   });	
		addAnnotation
		  (metricFormulaParameterEClass, 
		   source, 
		   new String[] {
			 "constraints", "value_attribute_set_for_non_metric_formula_parameters"
		   });	
		addAnnotation
		  (metricFormulaEClass, 
		   source, 
		   new String[] {
			 "constraints", "metric_formula_correct_arity_for_function_wrt_parameters metric_formula_correct_arity_for_function"
		   });	
		addAnnotation
		  (metricEClass, 
		   source, 
		   new String[] {
			 "constraints", "metric_measures_measurable_property"
		   });	
		addAnnotation
		  (compositeMetricEClass, 
		   source, 
		   new String[] {
			 "constraints", "metric_layer_enforcement metric_percentage_unit_enforcement metric_composite_unit_enforcement"
		   });	
		addAnnotation
		  (metricComponentBindingEClass, 
		   source, 
		   new String[] {
			 "constraints", "vm_and_sw_comp_connected_in_component_binding"
		   });	
		addAnnotation
		  (metricVMBindingEClass, 
		   source, 
		   new String[] {
			 "constraints", "vm_binding_vm_in_dep_model_of_app"
		   });	
		addAnnotation
		  (scheduleEClass, 
		   source, 
		   new String[] {
			 "constraints", "schedule_correct_values"
		   });	
		addAnnotation
		  (windowEClass, 
		   source, 
		   new String[] {
			 "constraints", "window_positive_params window_right_params_exist"
		   });	
		addAnnotation
		  (conditionContextEClass, 
		   source, 
		   new String[] {
			 "constraints", "context_right_params at_least_one_alternative_in_condition_context"
		   });	
		addAnnotation
		  (compositeMetricContextEClass, 
		   source, 
		   new String[] {
			 "constraints", "metrics_in_composing_contexts_in_metric_formula composite_metric_context_correct_metric_type"
		   });	
		addAnnotation
		  (rawMetricContextEClass, 
		   source, 
		   new String[] {
			 "constraints", "raw_metric_context_correct_metric_type"
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
		  (compositeMetricInstanceEClass, 
		   source, 
		   new String[] {
			 "composite_metric_instance_to_components", "Tuple {\n\tmessage : String = \'CompositeMetricInstance: \' + self.name +\n\t\t\t\t\t\' maps to a composite metric but there exists a composing metric with a different execution context associated to it\',\n\tstatus : Boolean = metric.oclIsTypeOf(CompositeMetric)\n\t\t\t\t\tand composingMetricInstances\n\t\t\t\t\t->forAll(p | p.objectBinding.executionContext = objectBinding.executionContext)\n}.status",
			 "component_instances_metric_map_formula_templates", "Tuple {\n\tmessage : String = \'CompositeMetricInstance: \' + self.name +\n\t\t\t\t\t\' should have component metric instances which map to the metrics referenced in the formula of the composite instance\\\'s metric\',\n\tstatus : Boolean = metric.oclIsTypeOf(CompositeMetric)\n\t\t\t\t\tand self.metric.oclAsType(CompositeMetric).formula.parameters\n\t\t\t\t\t->forAll(p | p.oclIsKindOf(Metric) implies self.composingMetricInstances\n\t\t\t\t\t\t->exists(q | q.metric = p)) and self.metric.oclAsType(CompositeMetric).formula.parameters\n\t\t\t\t\t->select(p | p.oclIsKindOf(Metric))\n\t\t\t\t\t->size() = self.composingMetricInstances\n\t\t\t\t\t->size()\n}.status",
			 "component_metrics_refer_to_same_level_or_lower", "Tuple {\n\tmessage : String = \'CompositeMetricInstance: \' + self.name +\n\t\t\t\t\t\' as a binding with a type that maps to a lower cloud level with respect to the one of its composing metrics (e.g., MetricVMBinding while composing metric has MetricComponentBinding)\',\n\tstatus : Boolean = if\n\t\t\t\t\t\t(not (objectBinding.oclIsTypeOf(MetricApplicationBinding)))\n\t\t\t\t\tthen if (objectBinding.oclIsTypeOf(MetricComponentBinding))\n\t\t\t\t\t\tthen composingMetricInstances\n\t\t\t\t\t\t\t->forAll(p | p.objectBinding.executionContext = self.objectBinding.executionContext and not\n\t\t\t\t\t\t\t\t(p.objectBinding.oclIsTypeOf(MetricApplicationBinding)) and if\n\t\t\t\t\t\t\t\t\t(self.objectBinding.oclAsType(MetricComponentBinding).componentInstance.oclIsKindOf(camel::deployment::InternalComponentInstance))\n\t\t\t\t\t\t\t\tthen if (p.objectBinding.oclIsTypeOf(MetricVMBinding))\n\t\t\t\t\t\t\t\t\tthen self.objectBinding.executionContext.deploymentModel.hostingInstances\n\t\t\t\t\t\t\t\t\t\t->exists(q | q.providedHostInstance.oclContainer() = p.objectBinding.oclAsType(MetricVMBinding).vmInstance and\n\t\t\t\t\t\t\t\t\t\t\tq.requiredHostInstance.oclContainer() = self.objectBinding.oclAsType(MetricComponentBinding).componentInstance)\n\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\telse composingMetricInstances\n\t\t\t\t\t\t\t->forAll(p | p.objectBinding.oclIsTypeOf(MetricVMBinding))\n\t\t\t\t\t\tendif\n\t\t\t\t\telse true\n\t\t\t\t\tendif\n}.status"
		   });	
		addAnnotation
		  (rawMetricInstanceEClass, 
		   source, 
		   new String[] {
			 "raw_metric_instance_correct_metric_type", "Tuple {\n\tmessage : String = \'RawMetricInstance: \' + self.name +\n\t\t\t\t\t\' mut map to a raw metric\',\n\tstatus : Boolean = metric.oclIsTypeOf(RawMetric)\n}.status"
		   });	
		addAnnotation
		  (metricFormulaParameterEClass, 
		   source, 
		   new String[] {
			 "value_attribute_set_for_non_metric_formula_parameters", "Tuple {\n\tmessage : String = \'MetricFormulaParameter: \' + self.name +\n\t\t\t\t\t\' has a value of null while not mapping to a metric or metric formula\',\n\tstatus : Boolean = not (self.oclIsKindOf(Metric) or\n\t\t\t\t\t(self.oclIsKindOf(MetricFormula))) implies self.value <> null\n}.status"
		   });	
		addAnnotation
		  (metricFormulaEClass, 
		   source, 
		   new String[] {
			 "metric_formula_correct_arity_for_function_wrt_parameters", "Tuple {\n\tmessage : String = \'MetricFormula: \' + self.toString() +\n\t\t\t\t\t\' has an incorrect arity: \' + functionArity.toString() + \' according to the size of the parameters list: \' +\n\t\t\t\t\tparameters\n\t\t\t\t\t->size().toString(),\n\tstatus : Boolean = ((self.functionArity = MetricFunctionArityType::UNARY) implies (self.parameters\n\t\t\t\t\t->size() = 1 and self.parameters\n\t\t\t\t\t->select(p | p.oclIsKindOf(Metric))\n\t\t\t\t\t->size() = 1)) and ((self.functionArity = MetricFunctionArityType::BINARY) implies self.parameters\n\t\t\t\t\t->size() = 2) and ((self.functionArity = MetricFunctionArityType::N_ARY) implies self.parameters\n\t\t\t\t\t->size() >= 2)\n}.status",
			 "metric_formula_correct_arity_for_function", "Tuple {\n\tmessage : String = \'MetricFormula: \' + self.toString() + \' has function: \' +\n\t\t\t\t\tfunction.toString() + \' that does not correctly correspond to its arity: \' +\n\t\t\t\t\tfunctionArity.toString(),\n\tstatus : Boolean = ((self.function = MetricFunctionType::MODULO or self.function =\n\t\t\t\t\tMetricFunctionType::PERCENTILE) implies self.functionArity = MetricFunctionArityType::BINARY) and (((self.function\n\t\t\t\t\t= MetricFunctionType::MEAN or self.function = MetricFunctionType::STD or self.function = MetricFunctionType::MIN\n\t\t\t\t\tor self.function = MetricFunctionType::MAX or self.function = MetricFunctionType::MODE or self.function =\n\t\t\t\t\tMetricFunctionType::MEDIAN or self.function = MetricFunctionType::DERIVATIVE or self.function =\n\t\t\t\t\tMetricFunctionType::COUNT) implies self.functionArity = MetricFunctionArityType::UNARY)) and (((self.function =\n\t\t\t\t\tMetricFunctionType::TIMES or self.function = MetricFunctionType::DIV) implies (self.functionArity =\n\t\t\t\t\tMetricFunctionArityType::BINARY or self.functionArity = MetricFunctionArityType::N_ARY)))\n}.status"
		   });	
		addAnnotation
		  (getMetricFormula__ContainsMetric__Metric(), 
		   source, 
		   new String[] {
			 "body", "self.parameters\n\t\t\t\t\t\t->includes(m) or self.parameters\n\t\t\t\t\t\t->exists(p | p.oclIsTypeOf(MetricFormula) and p.oclAsType(MetricFormula).containsMetric(m))"
		   });	
		addAnnotation
		  (metricEClass, 
		   source, 
		   new String[] {
			 "metric_measures_measurable_property", "Tuple {\n\tmessage : String = \'Metric: \' + name + \' measures property: \' + self.property.name +\n\t\t\t\t\t\' which is ABSTRACT (i.e., not MEASURABLE)\',\n\tstatus : Boolean = self.property.type = PropertyType::MEASURABLE\n}.status"
		   });	
		addAnnotation
		  (compositeMetricEClass, 
		   source, 
		   new String[] {
			 "metric_layer_enforcement", "Tuple {\n\tmessage : String = \'Composite Metric: \' + name +\n\t\t\t\t\t\' has a layer which is below those of its composing metrics in the respective formula\',\n\tstatus : Boolean = self.formula.parameters\n\t\t\t\t\t->forAll(p | (p.oclIsKindOf(Metric) implies self.greaterEqualThanLayer(self.layer, p.oclAsType(Metric).layer)))\n}.status",
			 "metric_percentage_unit_enforcement", "Tuple {\n\tmessage : String = \'Composite Metric: \' + name +\n\t\t\t\t\t\' has an incorrect unit (percentage) by considering the units of its composing metrics and the function(s) involved in the respective metric formula\',\n\tstatus : Boolean = if\n\t\t\t\t\t\t(self.unit.unit = camel::unit::UnitType::PERCENTAGE)\n\t\t\t\t\tthen (self.formula.parameters\n\t\t\t\t\t\t->forAll(p | p.oclIsKindOf(Metric) implies p.oclAsType(Metric).unit.unit = camel::unit::UnitType::PERCENTAGE) or\n\t\t\t\t\t\t(self.formula.function = MetricFunctionType::DIV and self.formula.parameters\n\t\t\t\t\t\t->size() = 2 and self.formula.parameters\n\t\t\t\t\t\t->forAll(p1, p2 | (p1.oclIsKindOf(Metric) and p2.oclIsKindOf(Metric)) implies p1.oclAsType(Metric).unit.unit =\n\t\t\t\t\t\t\tp2.oclAsType(Metric).unit.unit)))\n\t\t\t\t\telse true\n\t\t\t\t\tendif\n}.status",
			 "metric_composite_unit_enforcement", "Tuple {\n\tmessage : String = \'Composite Metric: \' + self.name +\n\t\t\t\t\t\' has a composite unit that does not correspond to the units of its composing metrics by also considering that its derivation formula maps to the DIV function\',\n\tstatus : Boolean = if\n\t\t\t\t\t\t(self.formula.function = MetricFunctionType::DIV)\n\t\t\t\t\tthen ((self.unit.unit = camel::unit::UnitType::BYTES_PER_SECOND) implies (self.formula.parameters\n\t\t\t\t\t\t->size() = 2 and self.formula.parameters\n\t\t\t\t\t\t->at(1).oclAsType(Metric).unit.unit = camel::unit::UnitType::BYTES and self.formula.parameters\n\t\t\t\t\t\t->at(2).oclAsType(Metric).unit.unit = camel::unit::UnitType::SECONDS) and (self.unit.unit =\n\t\t\t\t\t\tcamel::unit::UnitType::REQUESTS_PER_SECOND) implies (self.formula.parameters\n\t\t\t\t\t\t->size() = 2 and self.formula.parameters\n\t\t\t\t\t\t->at(1).oclAsType(Metric).unit.unit = camel::unit::UnitType::REQUESTS and self.formula.parameters\n\t\t\t\t\t\t->at(2).oclAsType(Metric).unit.unit = camel::unit::UnitType::SECONDS) and (self.unit.unit =\n\t\t\t\t\t\tcamel::unit::UnitType::TRANSACTIONS_PER_SECOND) implies (self.formula.parameters\n\t\t\t\t\t\t->size() = 2 and self.formula.parameters\n\t\t\t\t\t\t->at(1).oclAsType(Metric).unit.unit = camel::unit::UnitType::TRANSACTIONS and self.formula.parameters\n\t\t\t\t\t\t->at(2).oclAsType(Metric).unit.unit = camel::unit::UnitType::SECONDS))\n\t\t\t\t\telse true\n\t\t\t\t\tendif\n}.status"
		   });	
		addAnnotation
		  (getCompositeMetric__GreaterEqualThanLayer__LayerType_LayerType(), 
		   source, 
		   new String[] {
			 "body", "if (l1 = camel::LayerType::SaaS)\n\t\t\t\t\t\tthen true\n\t\t\t\t\t\telse (if (l1 = camel::LayerType::PaaS)\n\t\t\t\t\t\t\tthen (if (l2 = camel::LayerType::PaaS or l2 = camel::LayerType::IaaS)\n\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\t\telse (if (l2 = camel::LayerType::IaaS)\n\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\tendif"
		   });	
		addAnnotation
		  (metricComponentBindingEClass, 
		   source, 
		   new String[] {
			 "vm_and_sw_comp_connected_in_component_binding", "Tuple {\n\tmessage : String = \'MetricComponentBinding: \' + self.name +\n\t\t\t\t\t\' has a componentInstance: \' + self.componentInstance.name +\n\t\t\t\t\t\'which is either not included in the the respective deployment model of the binding\\\'s execution context: \' +\n\t\t\t\t\tself.executionContext.name +\n\t\t\t\t\t\' or is not connected in this deployment model with the vmInstance or it is an external component such that in this case a null value for the vmInstance should have been provided\',\n\tstatus : Boolean = if\n\t\t\t\t\t\t(componentInstance.oclIsTypeOf(camel::deployment::InternalComponentInstance))\n\t\t\t\t\tthen (executionContext.deploymentModel.internalComponentInstances\n\t\t\t\t\t\t->includes(componentInstance)) and if (vmInstance <> null)\n\t\t\t\t\t\tthen (executionContext.deploymentModel.vmInstances\n\t\t\t\t\t\t\t->includes(vmInstance)) and (executionContext.deploymentModel.hostingInstances\n\t\t\t\t\t\t\t->exists(c | c.requiredHostInstance.oclContainer() = componentInstance and c.providedHostInstance.oclContainer() = vmInstance) or\n\t\t\t\t\t\t\t(executionContext.deploymentModel.hostingInstances\n\t\t\t\t\t\t\t->exists(c | c.requiredHostInstance.oclContainer() = componentInstance and\n\t\t\t\t\t\t\t\texecutionContext.deploymentModel.hostingInstances\n\t\t\t\t\t\t\t\t->exists(d | d.requiredHostInstance.oclContainer() = c.providedHostInstance.oclContainer() and d.providedHostInstance.oclContainer() =\n\t\t\t\t\t\t\t\t\tvmInstance))))\n\t\t\t\t\t\telse true\n\t\t\t\t\t\tendif\n\t\t\t\t\telse false\n\t\t\t\t\tendif\n}.status"
		   });	
		addAnnotation
		  (metricVMBindingEClass, 
		   source, 
		   new String[] {
			 "vm_binding_vm_in_dep_model_of_app", "Tuple {\n\tmessage : String = \'MetricVMBinding: \' + self.name + \' has VMInstance: \' + vmInstance.name\n\t\t\t\t\t+ \' which is not included in the deployment model of the respective execution context: \' +\n\t\t\t\t\tself.executionContext.name,\n\tstatus : Boolean = (executionContext.deploymentModel.vmInstances\n\t\t\t\t\t->includes(vmInstance))\n}.status"
		   });	
		addAnnotation
		  (scheduleEClass, 
		   source, 
		   new String[] {
			 "schedule_correct_values", "Tuple {\n\tmessage : String = \'Schedule: \' + self.name +\n\t\t\t\t\t\' has wrong value combination for its attributes and properties. In particular, either the type of the schedule is SINGLE_EVENT and a value of any of the rest of the attributes or the unit property has been given or the schedule type is different but a non-positive value of the interval attribute or no value for the unit property has been provided\',\n\tstatus : Boolean = (self.type\n\t\t\t\t\t<> ScheduleType::SINGLE_EVENT implies (self.interval > 0 and self.unit <> null)) and ((self.type =\n\t\t\t\t\tScheduleType::SINGLE_EVENT implies (interval = 0 and start = null and end = null and unit = null)))\n}.status"
		   });	
		addAnnotation
		  (windowEClass, 
		   source, 
		   new String[] {
			 "window_positive_params", "Tuple {\n\tmessage : String = \'Window:\' + self.name +\n\t\t\t\t\t\' has a negative value for the measurementSize and timeSize attributes\',\n\tstatus : Boolean = (measurementSize >= 0) and (timeSize >=\n\t\t\t\t\t0)\n}.status",
			 "window_right_params_exist", "Tuple {\n\tmessage : String = \'Window: \' + self.name +\n\t\t\t\t\t\' has wrong value combinations for its attributes and properties. If sizeType is MEASUREMENTS_ONLY, then the measurementSize should be positive and all other values zero or null. If sizeType is TIME_ONLY, then both the unit should not be null and the timeSize should be positive, while the measurementSize should be zero. For the other values of sizeType, the values of all remaining attributes and units should be provided\',\n\tstatus : Boolean = (self.sizeType\n\t\t\t\t\t= WindowSizeType::MEASUREMENTS_ONLY implies (unit = null and timeSize = 0 and measurementSize > 0)) and\n\t\t\t\t\t(self.sizeType = WindowSizeType::TIME_ONLY implies (unit <> null and timeSize > 0 and measurementSize = 0)) and\n\t\t\t\t\t((self.sizeType = WindowSizeType::FIRST_MATCH or self.sizeType = WindowSizeType::BOTH_MATCH) implies (timeSize > 0\n\t\t\t\t\tand unit <> null and measurementSize > 0))\n}.status"
		   });	
		addAnnotation
		  (conditionContextEClass, 
		   source, 
		   new String[] {
			 "context_right_params", "Tuple {\n\tmessage : String = \'Context: \' + self.name +\n\t\t\t\t\t\' has wrong value combinations for the quantifier and quantity attributes. When quantifier equals to SOME, then we have the two following cases: (a) relative values: minQuantity should be greater than 0.0 and maxQuantity less or equal to 1.0 and minQuantity less or equal to maxQuantity; (b) absolute values: minQuantity should be greater or equal to 1 and maxQuantity either -1 (inf) or greater or equal to minQuantity and both quantities should be integer\',\n\tstatus : Boolean = ((self.quantifier\n\t\t\t\t\t= QuantifierType::SOME and self.isRelative = true) implies (minQuantity > 0.0 and maxQuantity <= 1.0 and\n\t\t\t\t\tmaxQuantity >= minQuantity)) and ((self.quantifier = QuantifierType::SOME and self.isRelative = false) implies\n\t\t\t\t\t(minQuantity >= 1.0 and ((maxQuantity >= 1.0 and maxQuantity >= minQuantity) or maxQuantity = - 1.0)) and\n\t\t\t\t\t(minQuantity / minQuantity.round()) = 1 and (maxQuantity / maxQuantity.round()) = 1)\n}.status",
			 "at_least_one_alternative_in_condition_context", "Tuple {\n\tmessage : String = \'In ConditionContext: \' + self.name +\n\t\t\t\t\t\' either a component or an application should be referenced\',\n\tstatus : Boolean = self.component <> null or self.application <> null\n}.status"
		   });	
		addAnnotation
		  (compositeMetricContextEClass, 
		   source, 
		   new String[] {
			 "metrics_in_composing_contexts_in_metric_formula", "Tuple {\n\tmessage : String = \'In MetricContext: \' + self.name +\n\t\t\t\t\t\' one or more composingMetricContexts correspond to metrics which are either equal to this context metric: \' +\n\t\t\t\t\tself.metric.name + \' or do not belong to the context metric\'\n\t\t\t\t\t\'s formula\',\n\tstatus : Boolean = self.metric.oclIsTypeOf(CompositeMetric) and self.composingMetricContexts\n\t\t\t\t\t->forAll(p | p.metric <> self.metric and self.metric.oclAsType(CompositeMetric).formula.containsMetric(p.metric))\n}.status",
			 "composite_metric_context_correct_metric_type", "Tuple {\n\tmessage : String = \'In CompositeMetricContext: \' + self.name + \' the metric: \'\n\t\t\t\t\t+ self.metric.name + \' should be composite but it isn\\\'t\',\n\tstatus : Boolean = self.metric.oclIsTypeOf(CompositeMetric)\n}.status"
		   });	
		addAnnotation
		  (rawMetricContextEClass, 
		   source, 
		   new String[] {
			 "raw_metric_context_correct_metric_type", "Tuple {\n\tmessage : String = \'In RawMetricContext: \' + self.name + \' the metric: \' +\n\t\t\t\t\tself.metric.name + \' should be raw but it isn\\\'t\',\n\tstatus : Boolean = self.metric.oclIsTypeOf(RawMetric)\n}.status"
		   });
	}

} //MetricPackageImpl
