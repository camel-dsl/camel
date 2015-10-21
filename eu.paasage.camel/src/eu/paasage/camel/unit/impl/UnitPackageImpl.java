/**
 */
package eu.paasage.camel.unit.impl;

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

import eu.paasage.camel.scalability.ScalabilityPackage;

import eu.paasage.camel.scalability.impl.ScalabilityPackageImpl;

import eu.paasage.camel.security.SecurityPackage;

import eu.paasage.camel.security.impl.SecurityPackageImpl;

import eu.paasage.camel.type.TypePackage;

import eu.paasage.camel.type.impl.TypePackageImpl;

import eu.paasage.camel.unit.CoreUnit;
import eu.paasage.camel.unit.Dimensionless;
import eu.paasage.camel.unit.MonetaryUnit;
import eu.paasage.camel.unit.RequestUnit;
import eu.paasage.camel.unit.StorageUnit;
import eu.paasage.camel.unit.ThroughputUnit;
import eu.paasage.camel.unit.TimeIntervalUnit;
import eu.paasage.camel.unit.TransactionUnit;
import eu.paasage.camel.unit.Unit;
import eu.paasage.camel.unit.UnitDimensionType;
import eu.paasage.camel.unit.UnitFactory;
import eu.paasage.camel.unit.UnitModel;
import eu.paasage.camel.unit.UnitPackage;
import eu.paasage.camel.unit.UnitType;

import eu.paasage.camel.unit.util.UnitValidator;

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
public class UnitPackageImpl extends EPackageImpl implements UnitPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionlessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monetaryUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throughputUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitDimensionTypeEEnum = null;

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
	 * @see eu.paasage.camel.unit.UnitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UnitPackageImpl() {
		super(eNS_URI, UnitFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UnitPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UnitPackage init() {
		if (isInited) return (UnitPackage)EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI);

		// Obtain or create and register package
		UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UnitPackageImpl());

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
		ScalabilityPackageImpl theScalabilityPackage = (ScalabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScalabilityPackage.eNS_URI) instanceof ScalabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScalabilityPackage.eNS_URI) : ScalabilityPackage.eINSTANCE);
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) instanceof SecurityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) : SecurityPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);

		// Create package meta-data objects
		theUnitPackage.createPackageContents();
		theCamelPackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theLocationPackage.createPackageContents();
		theMetricPackage.createPackageContents();
		theOrganisationPackage.createPackageContents();
		theProviderPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theScalabilityPackage.createPackageContents();
		theSecurityPackage.createPackageContents();
		theTypePackage.createPackageContents();

		// Initialize created meta-data
		theUnitPackage.initializePackageContents();
		theCamelPackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theLocationPackage.initializePackageContents();
		theMetricPackage.initializePackageContents();
		theOrganisationPackage.initializePackageContents();
		theProviderPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theScalabilityPackage.initializePackageContents();
		theSecurityPackage.initializePackageContents();
		theTypePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theUnitPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return UnitValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theUnitPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UnitPackage.eNS_URI, theUnitPackage);
		return theUnitPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Name() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Unit() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnit__CheckUnit() {
		return unitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoreUnit() {
		return coreUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionless() {
		return dimensionlessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonetaryUnit() {
		return monetaryUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestUnit() {
		return requestUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageUnit() {
		return storageUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThroughputUnit() {
		return throughputUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeIntervalUnit() {
		return timeIntervalUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionUnit() {
		return transactionUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitModel() {
		return unitModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitModel_Units() {
		return (EReference)unitModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitType() {
		return unitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitDimensionType() {
		return unitDimensionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitFactory getUnitFactory() {
		return (UnitFactory)getEFactoryInstance();
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
		unitEClass = createEClass(UNIT);
		createEAttribute(unitEClass, UNIT__NAME);
		createEAttribute(unitEClass, UNIT__UNIT);
		createEOperation(unitEClass, UNIT___CHECK_UNIT);

		coreUnitEClass = createEClass(CORE_UNIT);

		dimensionlessEClass = createEClass(DIMENSIONLESS);

		monetaryUnitEClass = createEClass(MONETARY_UNIT);

		requestUnitEClass = createEClass(REQUEST_UNIT);

		storageUnitEClass = createEClass(STORAGE_UNIT);

		throughputUnitEClass = createEClass(THROUGHPUT_UNIT);

		timeIntervalUnitEClass = createEClass(TIME_INTERVAL_UNIT);

		transactionUnitEClass = createEClass(TRANSACTION_UNIT);

		unitModelEClass = createEClass(UNIT_MODEL);
		createEReference(unitModelEClass, UNIT_MODEL__UNITS);

		// Create enums
		unitTypeEEnum = createEEnum(UNIT_TYPE);
		unitDimensionTypeEEnum = createEEnum(UNIT_DIMENSION_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		coreUnitEClass.getESuperTypes().add(this.getUnit());
		dimensionlessEClass.getESuperTypes().add(this.getUnit());
		monetaryUnitEClass.getESuperTypes().add(this.getUnit());
		requestUnitEClass.getESuperTypes().add(this.getUnit());
		storageUnitEClass.getESuperTypes().add(this.getUnit());
		throughputUnitEClass.getESuperTypes().add(this.getUnit());
		timeIntervalUnitEClass.getESuperTypes().add(this.getUnit());
		transactionUnitEClass.getESuperTypes().add(this.getUnit());
		unitModelEClass.getESuperTypes().add(theCamelPackage.getModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(unitEClass, Unit.class, "Unit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnit_Name(), ecorePackage.getEString(), "name", null, 1, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Unit(), this.getUnitType(), "unit", null, 1, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUnit__CheckUnit(), ecorePackage.getEBoolean(), "checkUnit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(coreUnitEClass, CoreUnit.class, "CoreUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimensionlessEClass, Dimensionless.class, "Dimensionless", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(monetaryUnitEClass, MonetaryUnit.class, "MonetaryUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestUnitEClass, RequestUnit.class, "RequestUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storageUnitEClass, StorageUnit.class, "StorageUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(throughputUnitEClass, ThroughputUnit.class, "ThroughputUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeIntervalUnitEClass, TimeIntervalUnit.class, "TimeIntervalUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transactionUnitEClass, TransactionUnit.class, "TransactionUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitModelEClass, UnitModel.class, "UnitModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitModel_Units(), this.getUnit(), null, "units", null, 0, -1, UnitModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(unitTypeEEnum, UnitType.class, "UnitType");
		addEEnumLiteral(unitTypeEEnum, UnitType.BYTES);
		addEEnumLiteral(unitTypeEEnum, UnitType.BYTES_PER_SECOND);
		addEEnumLiteral(unitTypeEEnum, UnitType.KILOBYTES);
		addEEnumLiteral(unitTypeEEnum, UnitType.MEGABYTES);
		addEEnumLiteral(unitTypeEEnum, UnitType.GIGABYTES);
		addEEnumLiteral(unitTypeEEnum, UnitType.MILLISECONDS);
		addEEnumLiteral(unitTypeEEnum, UnitType.SECONDS);
		addEEnumLiteral(unitTypeEEnum, UnitType.MINUTES);
		addEEnumLiteral(unitTypeEEnum, UnitType.HOURS);
		addEEnumLiteral(unitTypeEEnum, UnitType.DAYS);
		addEEnumLiteral(unitTypeEEnum, UnitType.WEEKS);
		addEEnumLiteral(unitTypeEEnum, UnitType.MONTHS);
		addEEnumLiteral(unitTypeEEnum, UnitType.REQUESTS);
		addEEnumLiteral(unitTypeEEnum, UnitType.REQUESTS_PER_SECOND);
		addEEnumLiteral(unitTypeEEnum, UnitType.TRANSACTIONS);
		addEEnumLiteral(unitTypeEEnum, UnitType.TRANSACTIONS_PER_SECOND);
		addEEnumLiteral(unitTypeEEnum, UnitType.CORES);
		addEEnumLiteral(unitTypeEEnum, UnitType.PERCENTAGE);
		addEEnumLiteral(unitTypeEEnum, UnitType.EUROS);
		addEEnumLiteral(unitTypeEEnum, UnitType.POUNDS);
		addEEnumLiteral(unitTypeEEnum, UnitType.DOLLARS);

		initEEnum(unitDimensionTypeEEnum, UnitDimensionType.class, "UnitDimensionType");
		addEEnumLiteral(unitDimensionTypeEEnum, UnitDimensionType.TIME_INTERVAL);
		addEEnumLiteral(unitDimensionTypeEEnum, UnitDimensionType.STORAGE);
		addEEnumLiteral(unitDimensionTypeEEnum, UnitDimensionType.COST);
		addEEnumLiteral(unitDimensionTypeEEnum, UnitDimensionType.THROUGHPUT);
		addEEnumLiteral(unitDimensionTypeEEnum, UnitDimensionType.REQUEST_NUM);
		addEEnumLiteral(unitDimensionTypeEEnum, UnitDimensionType.TRANSACTION_NUM);
		addEEnumLiteral(unitDimensionTypeEEnum, UnitDimensionType.DIMENSIONLESS);
		addEEnumLiteral(unitDimensionTypeEEnum, UnitDimensionType.CORE_NUM);

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
		  (unitEClass, 
		   source, 
		   new String[] {
			 "constraints", "correct_unit"
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
		  (unitEClass, 
		   source, 
		   new String[] {
			 "correct_unit", "Tuple {\n\tmessage : String = \'Unit: \' + name + \' is incorrect as its type( \' + self.unit.toString() +\n\t\t\t\t\t\t\' that does not correspond to its dimension\',\n\tstatus : Boolean = checkUnit()\n}.status"
		   });	
		addAnnotation
		  (getUnit__CheckUnit(), 
		   source, 
		   new String[] {
			 "body", "if (self.oclIsTypeOf(TimeIntervalUnit))\n\t\t\t\t\t\tthen if (unit = UnitType::MILLISECONDS or unit = UnitType::SECONDS or unit = UnitType::MINUTES or unit =\n\t\t\t\t\t\t\t\tUnitType::HOURS or unit = UnitType::DAYS or unit = UnitType::WEEKS or unit = UnitType::MONTHS)\n\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse if (self.oclIsTypeOf(StorageUnit))\n\t\t\t\t\t\t\tthen if (unit = UnitType::BYTES or unit = UnitType::KILOBYTES or unit = UnitType::MEGABYTES or unit =\n\t\t\t\t\t\t\t\t\tUnitType::GIGABYTES)\n\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (self.oclIsTypeOf(MonetaryUnit))\n\t\t\t\t\t\t\t\tthen if (unit = UnitType::EUROS or unit = UnitType::DOLLARS or unit = UnitType::POUNDS)\n\t\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse if (self.oclIsTypeOf(ThroughputUnit))\n\t\t\t\t\t\t\t\t\tthen if (unit = UnitType::BYTES_PER_SECOND or unit = UnitType::TRANSACTIONS_PER_SECOND or unit =\n\t\t\t\t\t\t\t\t\t\t\tUnitType::REQUESTS_PER_SECOND)\n\t\t\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\telse if (self.oclIsTypeOf(RequestUnit))\n\t\t\t\t\t\t\t\t\t\tthen if (unit = UnitType::REQUESTS)\n\t\t\t\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\telse if (self.oclIsTypeOf(TransactionUnit))\n\t\t\t\t\t\t\t\t\t\t\tthen if (unit = UnitType::TRANSACTIONS)\n\t\t\t\t\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\telse if (self.oclIsTypeOf(Dimensionless))\n\t\t\t\t\t\t\t\t\t\t\t\tthen if (unit = UnitType::PERCENTAGE)\n\t\t\t\t\t\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\t\telse if (self.oclIsTypeOf(CoreUnit))\n\t\t\t\t\t\t\t\t\t\t\t\t\tthen if (unit = UnitType::CORES)\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif"
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
		  (getUnit_Unit(), 
		   source, 
		   new String[] {
			 "body", "Feature"
		   });
	}

} //UnitPackageImpl
