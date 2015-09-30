/**
 */
package eu.paasage.camel.type.impl;

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
import eu.paasage.camel.type.BoolValue;
import eu.paasage.camel.type.BooleanValueType;
import eu.paasage.camel.type.DoublePrecisionValue;
import eu.paasage.camel.type.EnumerateValue;
import eu.paasage.camel.type.Enumeration;
import eu.paasage.camel.type.FloatsValue;
import eu.paasage.camel.type.IntegerValue;
import eu.paasage.camel.type.Limit;
import eu.paasage.camel.type.List;
import eu.paasage.camel.type.NegativeInf;
import eu.paasage.camel.type.NumericValue;
import eu.paasage.camel.type.PositiveInf;
import eu.paasage.camel.type.Range;
import eu.paasage.camel.type.RangeUnion;
import eu.paasage.camel.type.SingleValue;
import eu.paasage.camel.type.StringValueType;
import eu.paasage.camel.type.StringsValue;
import eu.paasage.camel.type.TypeEnum;
import eu.paasage.camel.type.TypeFactory;
import eu.paasage.camel.type.TypeModel;
import eu.paasage.camel.type.TypePackage;
import eu.paasage.camel.type.ValueToIncrease;
import eu.paasage.camel.type.ValueType;
import eu.paasage.camel.type.util.TypeValidator;
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
public class TypePackageImpl extends EPackageImpl implements TypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerateValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatsValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doublePrecisionValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeInfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveInfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueToIncreaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringsValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeUnionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEnumEEnum = null;

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
	 * @see eu.paasage.camel.type.TypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypePackageImpl() {
		super(eNS_URI, TypeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypePackage init() {
		if (isInited) return (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

		// Obtain or create and register package
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypePackageImpl());

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
		UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) : UnitPackage.eINSTANCE);

		// Create package meta-data objects
		theTypePackage.createPackageContents();
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
		theUnitPackage.createPackageContents();

		// Initialize created meta-data
		theTypePackage.initializePackageContents();
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
		theUnitPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTypePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TypeValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTypePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypePackage.eNS_URI, theTypePackage);
		return theTypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeModel() {
		return typeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeModel_DataTypes() {
		return (EReference)typeModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeModel_Values() {
		return (EReference)typeModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLimit() {
		return limitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLimit_Included() {
		return (EAttribute)limitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLimit_Value() {
		return (EReference)limitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleValue() {
		return singleValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSingleValue__ValueEquals__SingleValue() {
		return singleValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolValue() {
		return boolValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolValue_Value() {
		return (EAttribute)boolValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerateValue() {
		return enumerateValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerateValue_Value() {
		return (EAttribute)enumerateValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerateValue_Name() {
		return (EAttribute)enumerateValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericValue() {
		return numericValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValue_Value() {
		return (EAttribute)integerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatsValue() {
		return floatsValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatsValue_Value() {
		return (EAttribute)floatsValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoublePrecisionValue() {
		return doublePrecisionValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoublePrecisionValue_Value() {
		return (EAttribute)doublePrecisionValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegativeInf() {
		return negativeInfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositiveInf() {
		return positiveInfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueToIncrease() {
		return valueToIncreaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueToIncrease_Value() {
		return (EReference)valueToIncreaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringsValue() {
		return stringsValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringsValue_Value() {
		return (EAttribute)stringsValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Name() {
		return (EAttribute)valueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValueType() {
		return booleanValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValueType_PrimitiveType() {
		return (EAttribute)booleanValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_Values() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnumeration__IncludesName__String() {
		return enumerationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnumeration__IncludesValue__int() {
		return enumerationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Values() {
		return (EReference)listEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_PrimitiveType() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Type() {
		return (EReference)listEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getList__IncludesValue__SingleValue() {
		return listEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getList__CheckValueType__SingleValue() {
		return listEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRange() {
		return rangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRange_LowerLimit() {
		return (EReference)rangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRange_UpperLimit() {
		return (EReference)rangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRange_PrimitiveType() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRange__CheckType__Limit_TypeEnum_boolean() {
		return rangeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRange__IncludesValue__double() {
		return rangeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeUnion() {
		return rangeUnionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeUnion_Ranges() {
		return (EReference)rangeUnionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeUnion_PrimitiveType() {
		return (EAttribute)rangeUnionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRangeUnion__IncludesValue__double() {
		return rangeUnionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRangeUnion__InvalidRangeSequence__RangeUnion() {
		return rangeUnionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValueType() {
		return stringValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValueType_PrimitiveType() {
		return (EAttribute)stringValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeEnum() {
		return typeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFactory getTypeFactory() {
		return (TypeFactory)getEFactoryInstance();
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
		typeModelEClass = createEClass(TYPE_MODEL);
		createEReference(typeModelEClass, TYPE_MODEL__DATA_TYPES);
		createEReference(typeModelEClass, TYPE_MODEL__VALUES);

		limitEClass = createEClass(LIMIT);
		createEAttribute(limitEClass, LIMIT__INCLUDED);
		createEReference(limitEClass, LIMIT__VALUE);

		singleValueEClass = createEClass(SINGLE_VALUE);
		createEOperation(singleValueEClass, SINGLE_VALUE___VALUE_EQUALS__SINGLEVALUE);

		boolValueEClass = createEClass(BOOL_VALUE);
		createEAttribute(boolValueEClass, BOOL_VALUE__VALUE);

		enumerateValueEClass = createEClass(ENUMERATE_VALUE);
		createEAttribute(enumerateValueEClass, ENUMERATE_VALUE__NAME);
		createEAttribute(enumerateValueEClass, ENUMERATE_VALUE__VALUE);

		numericValueEClass = createEClass(NUMERIC_VALUE);

		integerValueEClass = createEClass(INTEGER_VALUE);
		createEAttribute(integerValueEClass, INTEGER_VALUE__VALUE);

		floatsValueEClass = createEClass(FLOATS_VALUE);
		createEAttribute(floatsValueEClass, FLOATS_VALUE__VALUE);

		doublePrecisionValueEClass = createEClass(DOUBLE_PRECISION_VALUE);
		createEAttribute(doublePrecisionValueEClass, DOUBLE_PRECISION_VALUE__VALUE);

		negativeInfEClass = createEClass(NEGATIVE_INF);

		positiveInfEClass = createEClass(POSITIVE_INF);

		valueToIncreaseEClass = createEClass(VALUE_TO_INCREASE);
		createEReference(valueToIncreaseEClass, VALUE_TO_INCREASE__VALUE);

		stringsValueEClass = createEClass(STRINGS_VALUE);
		createEAttribute(stringsValueEClass, STRINGS_VALUE__VALUE);

		valueTypeEClass = createEClass(VALUE_TYPE);
		createEAttribute(valueTypeEClass, VALUE_TYPE__NAME);

		booleanValueTypeEClass = createEClass(BOOLEAN_VALUE_TYPE);
		createEAttribute(booleanValueTypeEClass, BOOLEAN_VALUE_TYPE__PRIMITIVE_TYPE);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__VALUES);
		createEOperation(enumerationEClass, ENUMERATION___INCLUDES_NAME__STRING);
		createEOperation(enumerationEClass, ENUMERATION___INCLUDES_VALUE__INT);

		listEClass = createEClass(LIST);
		createEReference(listEClass, LIST__VALUES);
		createEAttribute(listEClass, LIST__PRIMITIVE_TYPE);
		createEReference(listEClass, LIST__TYPE);
		createEOperation(listEClass, LIST___INCLUDES_VALUE__SINGLEVALUE);
		createEOperation(listEClass, LIST___CHECK_VALUE_TYPE__SINGLEVALUE);

		rangeEClass = createEClass(RANGE);
		createEReference(rangeEClass, RANGE__LOWER_LIMIT);
		createEReference(rangeEClass, RANGE__UPPER_LIMIT);
		createEAttribute(rangeEClass, RANGE__PRIMITIVE_TYPE);
		createEOperation(rangeEClass, RANGE___CHECK_TYPE__LIMIT_TYPEENUM_BOOLEAN);
		createEOperation(rangeEClass, RANGE___INCLUDES_VALUE__DOUBLE);

		rangeUnionEClass = createEClass(RANGE_UNION);
		createEReference(rangeUnionEClass, RANGE_UNION__RANGES);
		createEAttribute(rangeUnionEClass, RANGE_UNION__PRIMITIVE_TYPE);
		createEOperation(rangeUnionEClass, RANGE_UNION___INCLUDES_VALUE__DOUBLE);
		createEOperation(rangeUnionEClass, RANGE_UNION___INVALID_RANGE_SEQUENCE__RANGEUNION);

		stringValueTypeEClass = createEClass(STRING_VALUE_TYPE);
		createEAttribute(stringValueTypeEClass, STRING_VALUE_TYPE__PRIMITIVE_TYPE);

		// Create enums
		typeEnumEEnum = createEEnum(TYPE_ENUM);
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
		typeModelEClass.getESuperTypes().add(theCamelPackage.getModel());
		boolValueEClass.getESuperTypes().add(this.getSingleValue());
		enumerateValueEClass.getESuperTypes().add(this.getSingleValue());
		numericValueEClass.getESuperTypes().add(this.getSingleValue());
		integerValueEClass.getESuperTypes().add(this.getNumericValue());
		floatsValueEClass.getESuperTypes().add(this.getNumericValue());
		doublePrecisionValueEClass.getESuperTypes().add(this.getNumericValue());
		negativeInfEClass.getESuperTypes().add(this.getNumericValue());
		positiveInfEClass.getESuperTypes().add(this.getNumericValue());
		valueToIncreaseEClass.getESuperTypes().add(this.getNumericValue());
		stringsValueEClass.getESuperTypes().add(this.getSingleValue());
		booleanValueTypeEClass.getESuperTypes().add(this.getValueType());
		enumerationEClass.getESuperTypes().add(this.getValueType());
		listEClass.getESuperTypes().add(this.getValueType());
		rangeEClass.getESuperTypes().add(this.getValueType());
		rangeUnionEClass.getESuperTypes().add(this.getValueType());
		stringValueTypeEClass.getESuperTypes().add(this.getValueType());

		// Initialize classes, features, and operations; add parameters
		initEClass(typeModelEClass, TypeModel.class, "TypeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeModel_DataTypes(), this.getValueType(), null, "dataTypes", null, 0, -1, TypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeModel_Values(), this.getSingleValue(), null, "values", null, 0, -1, TypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(limitEClass, Limit.class, "Limit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLimit_Included(), ecorePackage.getEBoolean(), "included", null, 1, 1, Limit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLimit_Value(), this.getNumericValue(), null, "value", null, 1, 1, Limit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleValueEClass, SingleValue.class, "SingleValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSingleValue__ValueEquals__SingleValue(), ecorePackage.getEBoolean(), "valueEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSingleValue(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(boolValueEClass, BoolValue.class, "BoolValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BoolValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerateValueEClass, EnumerateValue.class, "EnumerateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerateValue_Name(), ecorePackage.getEString(), "name", null, 1, 1, EnumerateValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerateValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, EnumerateValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericValueEClass, NumericValue.class, "NumericValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatsValueEClass, FloatsValue.class, "FloatsValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatsValue_Value(), ecorePackage.getEFloat(), "value", null, 1, 1, FloatsValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doublePrecisionValueEClass, DoublePrecisionValue.class, "DoublePrecisionValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoublePrecisionValue_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, DoublePrecisionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negativeInfEClass, NegativeInf.class, "NegativeInf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveInfEClass, PositiveInf.class, "PositiveInf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueToIncreaseEClass, ValueToIncrease.class, "ValueToIncrease", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueToIncrease_Value(), this.getNumericValue(), null, "value", null, 1, 1, ValueToIncrease.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringsValueEClass, StringsValue.class, "StringsValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringsValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringsValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueTypeEClass, BooleanValueType.class, "BooleanValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValueType_PrimitiveType(), this.getTypeEnum(), "primitiveType", null, 1, 1, BooleanValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_Values(), this.getEnumerateValue(), null, "values", null, 1, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEnumeration__IncludesName__String(), ecorePackage.getEBoolean(), "includesName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnumeration__IncludesValue__int(), ecorePackage.getEBoolean(), "includesValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getList_Values(), this.getSingleValue(), null, "values", null, 1, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_PrimitiveType(), this.getTypeEnum(), "primitiveType", null, 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getList_Type(), this.getValueType(), null, "type", null, 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getList__IncludesValue__SingleValue(), ecorePackage.getEBoolean(), "includesValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSingleValue(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getList__CheckValueType__SingleValue(), ecorePackage.getEBoolean(), "checkValueType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSingleValue(), "p", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRange_LowerLimit(), this.getLimit(), null, "lowerLimit", null, 1, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRange_UpperLimit(), this.getLimit(), null, "upperLimit", null, 1, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRange_PrimitiveType(), this.getTypeEnum(), "primitiveType", null, 1, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRange__CheckType__Limit_TypeEnum_boolean(), ecorePackage.getEBoolean(), "checkType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLimit(), "l", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeEnum(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "lower", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRange__IncludesValue__double(), ecorePackage.getEBoolean(), "includesValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "n", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rangeUnionEClass, RangeUnion.class, "RangeUnion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRangeUnion_Ranges(), this.getRange(), null, "ranges", null, 1, -1, RangeUnion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeUnion_PrimitiveType(), this.getTypeEnum(), "primitiveType", null, 1, 1, RangeUnion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRangeUnion__IncludesValue__double(), ecorePackage.getEBoolean(), "includesValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "n", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRangeUnion__InvalidRangeSequence__RangeUnion(), ecorePackage.getEBoolean(), "invalidRangeSequence", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRangeUnion(), "ru", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringValueTypeEClass, StringValueType.class, "StringValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValueType_PrimitiveType(), this.getTypeEnum(), "primitiveType", null, 1, 1, StringValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeEnumEEnum, TypeEnum.class, "TypeEnum");
		addEEnumLiteral(typeEnumEEnum, TypeEnum.INT_TYPE);
		addEEnumLiteral(typeEnumEEnum, TypeEnum.STRING_TYPE);
		addEEnumLiteral(typeEnumEEnum, TypeEnum.BOOLEAN_TYPE);
		addEEnumLiteral(typeEnumEEnum, TypeEnum.FLOAT_TYPE);
		addEEnumLiteral(typeEnumEEnum, TypeEnum.DOUBLE_TYPE);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
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
		  (enumerationEClass, 
		   source, 
		   new String[] {
			 "constraints", "enumeration_all_values_diff"
		   });	
		addAnnotation
		  (listEClass, 
		   source, 
		   new String[] {
			 "constraints", "list_must_have_type all_list_values_correct_type"
		   });	
		addAnnotation
		  (rangeEClass, 
		   source, 
		   new String[] {
			 "constraints", "correct_range_type enforce_correct_range_type range_low_less_than_upper range_infs_at_appropriate_pos"
		   });	
		addAnnotation
		  (rangeUnionEClass, 
		   source, 
		   new String[] {
			 "constraints", "same_primitive_types_in_union_ranges correct_range_union_sequence"
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
		  (getSingleValue__ValueEquals__SingleValue(), 
		   source, 
		   new String[] {
			 "body", "if (self.oclIsTypeOf(IntegerValue) and v.oclIsTypeOf(IntegerValue))\n\t\t\t\t\t\tthen self.oclAsType(IntegerValue).value = v.oclAsType(IntegerValue).value\n\t\t\t\t\t\telse if (self.oclIsTypeOf(FloatsValue) and v.oclIsTypeOf(FloatsValue))\n\t\t\t\t\t\t\tthen self.oclAsType(FloatsValue).value = v.oclAsType(FloatsValue).value\n\t\t\t\t\t\t\telse if (self.oclIsTypeOf(DoublePrecisionValue) and v.oclIsTypeOf(DoublePrecisionValue))\n\t\t\t\t\t\t\t\tthen self.oclAsType(DoublePrecisionValue).value = v.oclAsType(DoublePrecisionValue).value\n\t\t\t\t\t\t\t\telse if (self.oclIsTypeOf(StringsValue) and v.oclIsTypeOf(StringsValue))\n\t\t\t\t\t\t\t\t\tthen self.oclAsType(StringsValue).value = v.oclAsType(StringsValue).value\n\t\t\t\t\t\t\t\t\telse if (self.oclIsTypeOf(BoolValue) and v.oclIsTypeOf(BoolValue))\n\t\t\t\t\t\t\t\t\t\tthen self.oclAsType(BoolValue).value = v.oclAsType(BoolValue).value\n\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif"
		   });	
		addAnnotation
		  (enumerationEClass, 
		   source, 
		   new String[] {
			 "enumeration_all_values_diff", "Tuple {\n\tmessage : String = \'Enumeration: \' + self.toString() +\n\t\t\t\t\t\' has two or more members which have either the same name or the same value\',\n\tstatus : Boolean = values\n\t\t\t\t\t->forAll(p1, p2 | p1 <> p2 implies (p1.name <> p2.name and p1.value <> p2.value))\n}.status"
		   });	
		addAnnotation
		  (getEnumeration__IncludesName__String(), 
		   source, 
		   new String[] {
			 "body", "self.values\n\t\t\t\t\t\t->exists(p | p.name = name)"
		   });	
		addAnnotation
		  (getEnumeration__IncludesValue__int(), 
		   source, 
		   new String[] {
			 "body", "self.values\n\t\t\t\t\t\t->exists(p | p.value = value)"
		   });	
		addAnnotation
		  (listEClass, 
		   source, 
		   new String[] {
			 "list_must_have_type", "Tuple {\n\tmessage : String = \'List:\' + self.toString() +\n\t\t\t\t\t\' should either have a primitive or a normal type of values\',\n\tstatus : Boolean = (primitiveType <> null and type = null) or (type <>\n\t\t\t\t\tnull and primitiveType = null)\n}.status",
			 "all_list_values_correct_type", "Tuple {\n\tmessage : String = \'List: \' + self.toString() +\n\t\t\t\t\t\' has one or more values that do not conform to its value type\',\n\tstatus : Boolean = values\n\t\t\t\t\t->forAll(p | self.checkValueType(p))\n}.status"
		   });	
		addAnnotation
		  (getList__IncludesValue__SingleValue(), 
		   source, 
		   new String[] {
			 "body", "if (type <> null)\n\t\t\t\t\t\tthen if (type.oclIsTypeOf(Range))\n\t\t\t\t\t\t\tthen if (type.oclAsType(Range).primitiveType = TypeEnum::IntType)\n\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(IntegerValue).value = v.oclAsType(IntegerValue).value)\n\t\t\t\t\t\t\t\telse if (type.oclAsType(Range).primitiveType = TypeEnum::FloatType)\n\t\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(FloatsValue).value = v.oclAsType(FloatsValue).value)\n\t\t\t\t\t\t\t\t\telse values\n\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(DoublePrecisionValue).value = v.oclAsType(DoublePrecisionValue).value)\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (type.oclIsTypeOf(RangeUnion))\n\t\t\t\t\t\t\t\tthen if (type.oclAsType(RangeUnion).primitiveType = TypeEnum::IntType)\n\t\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(IntegerValue).value = v.oclAsType(IntegerValue).value)\n\t\t\t\t\t\t\t\t\telse if (type.oclAsType(RangeUnion).primitiveType = TypeEnum::FloatType)\n\t\t\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(FloatsValue).value = v.oclAsType(FloatsValue).value)\n\t\t\t\t\t\t\t\t\t\telse values\n\t\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(DoublePrecisionValue).value = v.oclAsType(DoublePrecisionValue).value)\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse if (type.oclIsTypeOf(StringValueType))\n\t\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(StringsValue).value = v.oclAsType(StringsValue).value)\n\t\t\t\t\t\t\t\t\telse if (type.oclIsTypeOf(BooleanValueType))\n\t\t\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(BoolValue).value = v.oclAsType(BoolValue).value)\n\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse if (primitiveType = TypeEnum::IntType)\n\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(IntegerValue).value = v.oclAsType(IntegerValue).value)\n\t\t\t\t\t\t\telse if (primitiveType = TypeEnum::FloatType)\n\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(FloatsValue).value = v.oclAsType(FloatsValue).value)\n\t\t\t\t\t\t\t\telse if (primitiveType = TypeEnum::DoubleType)\n\t\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(DoublePrecisionValue).value = v.oclAsType(DoublePrecisionValue).value)\n\t\t\t\t\t\t\t\t\telse if (primitiveType = TypeEnum::StringType)\n\t\t\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(StringsValue).value = v.oclAsType(StringsValue).value)\n\t\t\t\t\t\t\t\t\t\telse if (primitiveType = TypeEnum::BooleanType)\n\t\t\t\t\t\t\t\t\t\t\tthen values\n\t\t\t\t\t\t\t\t\t\t\t\t->exists(p | p.oclAsType(BoolValue).value = v.oclAsType(BoolValue).value)\n\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif"
		   });	
		addAnnotation
		  (getList__CheckValueType__SingleValue(), 
		   source, 
		   new String[] {
			 "body", "if (type <> null)\n\t\t\t\t\t\tthen if (type.oclIsTypeOf(Range))\n\t\t\t\t\t\t\tthen if (type.oclAsType(Range).primitiveType = TypeEnum::IntType)\n\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(IntegerValue) and\n\t\t\t\t\t\t\t\t\ttype.oclAsType(Range).includesValue(p.oclAsType(IntegerValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\telse if (type.oclAsType(Range).primitiveType = TypeEnum::FloatType)\n\t\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(FloatsValue) and\n\t\t\t\t\t\t\t\t\t\ttype.oclAsType(Range).includesValue(p.oclAsType(FloatsValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\telse p.oclIsTypeOf(DoublePrecisionValue) and\n\t\t\t\t\t\t\t\t\t\ttype.oclAsType(Range).includesValue(p.oclAsType(DoublePrecisionValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (type.oclIsTypeOf(RangeUnion))\n\t\t\t\t\t\t\t\tthen if (type.oclAsType(RangeUnion).primitiveType = TypeEnum::IntType)\n\t\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(IntegerValue) and\n\t\t\t\t\t\t\t\t\t\ttype.oclAsType(RangeUnion).includesValue(p.oclAsType(IntegerValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\telse if (type.oclAsType(RangeUnion).primitiveType = TypeEnum::FloatType)\n\t\t\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(FloatsValue) and\n\t\t\t\t\t\t\t\t\t\t\ttype.oclAsType(RangeUnion).includesValue(p.oclAsType(FloatsValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\t\telse p.oclIsTypeOf(DoublePrecisionValue) and\n\t\t\t\t\t\t\t\t\t\t\ttype.oclAsType(RangeUnion).includesValue(p.oclAsType(DoublePrecisionValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse if (type.oclIsTypeOf(StringValueType))\n\t\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(StringsValue)\n\t\t\t\t\t\t\t\t\telse if (type.oclIsTypeOf(BooleanValueType))\n\t\t\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(BoolValue)\n\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse if (primitiveType = TypeEnum::IntType)\n\t\t\t\t\t\t\tthen p.oclIsTypeOf(IntegerValue)\n\t\t\t\t\t\t\telse if (primitiveType = TypeEnum::StringType)\n\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(StringsValue)\n\t\t\t\t\t\t\t\telse if (primitiveType = TypeEnum::BooleanType)\n\t\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(BoolValue)\n\t\t\t\t\t\t\t\t\telse if (primitiveType = TypeEnum::FloatType)\n\t\t\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(FloatsValue)\n\t\t\t\t\t\t\t\t\t\telse if (primitiveType = TypeEnum::DoubleType)\n\t\t\t\t\t\t\t\t\t\t\tthen p.oclIsTypeOf(DoublePrecisionValue)\n\t\t\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif"
		   });	
		addAnnotation
		  (rangeEClass, 
		   source, 
		   new String[] {
			 "correct_range_type", "Tuple {\n\tmessage : String = \'Range: \' + self.toString() + \' has a non-numeric primitiveType: \' +\n\t\t\t\t\tprimitiveType.toString(),\n\tstatus : Boolean = (primitiveType = TypeEnum::IntType) or (primitiveType = TypeEnum::FloatType) or\n\t\t\t\t\t(primitiveType = TypeEnum::DoubleType)\n}.status",
			 "enforce_correct_range_type", "Tuple {\n\tmessage : String = \'Range: \' + self.toString() +\n\t\t\t\t\t\' has either its low or upper limit not conforming to its primitive type\',\n\tstatus : Boolean = self.checkType(self.lowerLimit,\n\t\t\t\t\t\tprimitiveType, true) and self.checkType(self.upperLimit, primitiveType, false)\n}.status",
			 "range_low_less_than_upper", "Tuple {\n\tmessage : String = \'Range: \' + self.toString() +\n\t\t\t\t\t\' has its lower limit greater than the upper\',\n\tstatus : Boolean = if (not (lowerLimit.value.oclIsTypeOf(NegativeInf)) and not\n\t\t\t\t\t\t(upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\tthen if (primitiveType = TypeEnum::IntType)\n\t\t\t\t\t\tthen if (not (upperLimit.included) and not (lowerLimit.included))\n\t\t\t\t\t\t\tthen (upperLimit.value.oclAsType(IntegerValue).value -\n\t\t\t\t\t\t\t\tlowerLimit.value.oclAsType(IntegerValue).value.oclAsType(ecore::EInt)) >= 2\n\t\t\t\t\t\t\telse if (upperLimit.included)\n\t\t\t\t\t\t\t\tthen lowerLimit.value.oclAsType(IntegerValue).value.oclAsType(ecore::EInt) <=\n\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(IntegerValue).value\n\t\t\t\t\t\t\t\telse lowerLimit.value.oclAsType(IntegerValue).value.oclAsType(ecore::EInt) <\n\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(IntegerValue).value\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse (if (primitiveType = TypeEnum::FloatType)\n\t\t\t\t\t\t\tthen if (upperLimit.included)\n\t\t\t\t\t\t\t\tthen lowerLimit.value.oclAsType(FloatsValue).value.oclAsType(ecore::EFloat) <=\n\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(FloatsValue).value\n\t\t\t\t\t\t\t\telse lowerLimit.value.oclAsType(FloatsValue).value.oclAsType(ecore::EFloat) <\n\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(FloatsValue).value\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (upperLimit.included)\n\t\t\t\t\t\t\t\tthen lowerLimit.value.oclAsType(DoublePrecisionValue).value.oclAsType(ecore::EDouble) <=\n\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(DoublePrecisionValue).value\n\t\t\t\t\t\t\t\telse lowerLimit.value.oclAsType(DoublePrecisionValue).value.oclAsType(ecore::EDouble) <\n\t\t\t\t\t\t\t\t\tupperLimit.value.oclAsType(DoublePrecisionValue).value\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\tendif\n\t\t\t\t\telse true\n\t\t\t\t\tendif\n}.status",
			 "range_infs_at_appropriate_pos", "Tuple {\n\tmessage : String = \'Range: \' + self.toString() +\n\t\t\t\t\t\' has a PositiveInf value for its lower limit or a NegativeInf value for its upper limit\',\n\tstatus : Boolean = not\n\t\t\t\t\t(lowerLimit.value.oclIsTypeOf(PositiveInf) or upperLimit.value.oclIsTypeOf(NegativeInf))\n}.status"
		   });	
		addAnnotation
		  (getRange__CheckType__Limit_TypeEnum_boolean(), 
		   source, 
		   new String[] {
			 "body", "if (type = TypeEnum::IntType)\n\t\t\t\t\t\tthen if (lower and not (lowerLimit.value.oclIsTypeOf(NegativeInf)))\n\t\t\t\t\t\t\tthen lowerLimit.value.oclIsTypeOf(IntegerValue)\n\t\t\t\t\t\t\telse if (not (lower) and not (upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\tthen upperLimit.value.oclIsTypeOf(IntegerValue)\n\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse if (type = TypeEnum::FloatType)\n\t\t\t\t\t\t\tthen if (lower and not (lowerLimit.value.oclIsTypeOf(NegativeInf)))\n\t\t\t\t\t\t\t\tthen lowerLimit.value.oclIsTypeOf(FloatsValue)\n\t\t\t\t\t\t\t\telse if (not (lower) and not (upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\t\tthen upperLimit.value.oclIsTypeOf(FloatsValue)\n\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (lower and not (lowerLimit.value.oclIsTypeOf(NegativeInf)))\n\t\t\t\t\t\t\t\tthen lowerLimit.value.oclIsTypeOf(DoublePrecisionValue)\n\t\t\t\t\t\t\t\telse if (not (lower) and not (upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\t\tthen upperLimit.value.oclIsTypeOf(DoublePrecisionValue)\n\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif"
		   });	
		addAnnotation
		  (getRange__IncludesValue__double(), 
		   source, 
		   new String[] {
			 "body", "if (primitiveType = TypeEnum::IntType)\n\t\t\t\t\t\tthen if (not (lowerLimit.value.oclIsTypeOf(NegativeInf)))\n\t\t\t\t\t\t\tthen ((lowerLimit.included and lowerLimit.value.oclAsType(IntegerValue).value <= n) or (not\n\t\t\t\t\t\t\t\t(lowerLimit.included) and lowerLimit.value.oclAsType(IntegerValue).value < n)) and if (not\n\t\t\t\t\t\t\t\t\t(upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\tthen (upperLimit.included and upperLimit.value.oclAsType(IntegerValue).value >= n) or (not\n\t\t\t\t\t\t\t\t\t(upperLimit.included) and upperLimit.value.oclAsType(IntegerValue).value > n)\n\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (not (upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\tthen (upperLimit.included and upperLimit.value.oclAsType(IntegerValue).value >= n) or (not\n\t\t\t\t\t\t\t\t\t(upperLimit.included) and upperLimit.value.oclAsType(IntegerValue).value > n)\n\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse if (primitiveType = TypeEnum::FloatType)\n\t\t\t\t\t\t\tthen if (not (lowerLimit.value.oclIsTypeOf(NegativeInf)))\n\t\t\t\t\t\t\t\tthen ((lowerLimit.included and lowerLimit.value.oclAsType(FloatsValue).value <= n) or (not\n\t\t\t\t\t\t\t\t\t(lowerLimit.included) and lowerLimit.value.oclAsType(FloatsValue).value < n)) and if (not\n\t\t\t\t\t\t\t\t\t\t(upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\t\tthen (upperLimit.included and upperLimit.value.oclAsType(FloatsValue).value >= n) or (not\n\t\t\t\t\t\t\t\t\t\t(upperLimit.included) and upperLimit.value.oclAsType(FloatsValue).value > n)\n\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse if (not (upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\t\tthen (upperLimit.included and upperLimit.value.oclAsType(FloatsValue).value >= n) or (not\n\t\t\t\t\t\t\t\t\t\t(upperLimit.included) and upperLimit.value.oclAsType(FloatsValue).value > n)\n\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (not (lowerLimit.value.oclIsTypeOf(NegativeInf)))\n\t\t\t\t\t\t\t\tthen ((lowerLimit.included and lowerLimit.value.oclAsType(DoublePrecisionValue).value <= n) or (not\n\t\t\t\t\t\t\t\t\t(lowerLimit.included) and lowerLimit.value.oclAsType(DoublePrecisionValue).value < n)) and if (not\n\t\t\t\t\t\t\t\t\t\t(upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\t\tthen (upperLimit.included and upperLimit.value.oclAsType(DoublePrecisionValue).value >= n) or (not\n\t\t\t\t\t\t\t\t\t\t(upperLimit.included) and upperLimit.value.oclAsType(DoublePrecisionValue).value > n)\n\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse if (not (upperLimit.value.oclIsTypeOf(PositiveInf)))\n\t\t\t\t\t\t\t\t\tthen (upperLimit.included and upperLimit.value.oclAsType(DoublePrecisionValue).value >= n) or (not\n\t\t\t\t\t\t\t\t\t\t(upperLimit.included) and upperLimit.value.oclAsType(DoublePrecisionValue).value > n)\n\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif"
		   });	
		addAnnotation
		  (rangeUnionEClass, 
		   source, 
		   new String[] {
			 "same_primitive_types_in_union_ranges", "Tuple {\n\tmessage : String = \'RangeUnion: \' + self.name +\n\t\t\t\t\t\' has one or more ranges with a different primitive type\',\n\tstatus : Boolean = self.ranges\n\t\t\t\t\t->forAll(p | p.primitiveType = self.primitiveType)\n}.status",
			 "correct_range_union_sequence", "Tuple {\n\tmessage : String = \'RangeUnion: \' + self.name +\n\t\t\t\t\t\' has a wrong sequence of ranges. This means that two or more ranges are conflicting\',\n\tstatus : Boolean = not\n\t\t\t\t\t(invalidRangeSequence(self))\n}.status"
		   });	
		addAnnotation
		  (getRangeUnion__IncludesValue__double(), 
		   source, 
		   new String[] {
			 "body", "ranges\n\t\t\t\t\t\t->exists(p | p.includesValue(n))"
		   });
	}

} //TypePackageImpl
