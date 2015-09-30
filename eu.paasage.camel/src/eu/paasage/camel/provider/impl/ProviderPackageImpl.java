/**
 */
package eu.paasage.camel.provider.impl;

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
import eu.paasage.camel.provider.Alternative;
import eu.paasage.camel.provider.Attribute;
import eu.paasage.camel.provider.AttributeConstraint;
import eu.paasage.camel.provider.Cardinality;
import eu.paasage.camel.provider.Clone;
import eu.paasage.camel.provider.Constraint;
import eu.paasage.camel.provider.Excludes;
import eu.paasage.camel.provider.Exclusive;
import eu.paasage.camel.provider.FeatCardinality;
import eu.paasage.camel.provider.Feature;
import eu.paasage.camel.provider.Functional;
import eu.paasage.camel.provider.GroupCardinality;
import eu.paasage.camel.provider.Implies;
import eu.paasage.camel.provider.Instance;
import eu.paasage.camel.provider.Operator;
import eu.paasage.camel.provider.Product;
import eu.paasage.camel.provider.ProviderFactory;
import eu.paasage.camel.provider.ProviderModel;
import eu.paasage.camel.provider.ProviderPackage;
import eu.paasage.camel.provider.Requires;
import eu.paasage.camel.provider.Scope;
import eu.paasage.camel.provider.util.ProviderValidator;
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
public class ProviderPackageImpl extends EPackageImpl implements ProviderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impliesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

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
	 * @see eu.paasage.camel.provider.ProviderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProviderPackageImpl() {
		super(eNS_URI, ProviderFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProviderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProviderPackage init() {
		if (isInited) return (ProviderPackage)EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI);

		// Obtain or create and register package
		ProviderPackageImpl theProviderPackage = (ProviderPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProviderPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProviderPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CamelPackageImpl theCamelPackage = (CamelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) instanceof CamelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) : CamelPackage.eINSTANCE);
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) instanceof ExecutionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) : ExecutionPackage.eINSTANCE);
		LocationPackageImpl theLocationPackage = (LocationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI) instanceof LocationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI) : LocationPackage.eINSTANCE);
		MetricPackageImpl theMetricPackage = (MetricPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetricPackage.eNS_URI) instanceof MetricPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetricPackage.eNS_URI) : MetricPackage.eINSTANCE);
		OrganisationPackageImpl theOrganisationPackage = (OrganisationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganisationPackage.eNS_URI) instanceof OrganisationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganisationPackage.eNS_URI) : OrganisationPackage.eINSTANCE);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) : RequirementPackage.eINSTANCE);
		ScalabilityPackageImpl theScalabilityPackage = (ScalabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScalabilityPackage.eNS_URI) instanceof ScalabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScalabilityPackage.eNS_URI) : ScalabilityPackage.eINSTANCE);
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) instanceof SecurityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) : SecurityPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) : UnitPackage.eINSTANCE);

		// Create package meta-data objects
		theProviderPackage.createPackageContents();
		theCamelPackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theLocationPackage.createPackageContents();
		theMetricPackage.createPackageContents();
		theOrganisationPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theScalabilityPackage.createPackageContents();
		theSecurityPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theUnitPackage.createPackageContents();

		// Initialize created meta-data
		theProviderPackage.initializePackageContents();
		theCamelPackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theLocationPackage.initializePackageContents();
		theMetricPackage.initializePackageContents();
		theOrganisationPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theScalabilityPackage.initializePackageContents();
		theSecurityPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theUnitPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theProviderPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ProviderValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theProviderPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProviderPackage.eNS_URI, theProviderPackage);
		return theProviderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProviderModel() {
		return providerModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProviderModel_Constraints() {
		return (EReference)providerModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProviderModel_RootFeature() {
		return (EReference)providerModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Value() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_ValueType() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_UnitType() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttribute__CheckValue__SingleValue_boolean() {
		return attributeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeConstraint() {
		return attributeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeConstraint_From() {
		return (EReference)attributeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeConstraint_To() {
		return (EReference)attributeConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeConstraint_FromValue() {
		return (EReference)attributeConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeConstraint_ToValue() {
		return (EReference)attributeConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeConstraint_Name() {
		return (EAttribute)attributeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinality() {
		return cardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_CardinalityMin() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_CardinalityMax() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatCardinality() {
		return featCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatCardinality_Value() {
		return (EAttribute)featCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupCardinality() {
		return groupCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClone() {
		return cloneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClone_Name() {
		return (EAttribute)cloneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClone_SubClones() {
		return (EReference)cloneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Name() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_From() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_To() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_AttributeConstraints() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludes() {
		return excludesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplies() {
		return impliesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequires() {
		return requiresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequires_ScopeFrom() {
		return (EReference)requiresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequires_ScopeTo() {
		return (EReference)requiresEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequires_CardFrom() {
		return (EReference)requiresEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequires_CardTo() {
		return (EReference)requiresEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctional() {
		return functionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctional_Type() {
		return (EAttribute)functionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctional_Order() {
		return (EAttribute)functionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctional_Value() {
		return (EAttribute)functionalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Attributes() {
		return (EReference)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_SubFeatures() {
		return (EReference)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_FeatureCardinality() {
		return (EReference)featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Clones() {
		return (EReference)featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Name() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternative() {
		return alternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternative_GroupCardinality() {
		return (EReference)alternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternative_Variants() {
		return (EReference)alternativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusive() {
		return exclusiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScope() {
		return scopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstance_Feature() {
		return (EReference)instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderFactory getProviderFactory() {
		return (ProviderFactory)getEFactoryInstance();
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
		providerModelEClass = createEClass(PROVIDER_MODEL);
		createEReference(providerModelEClass, PROVIDER_MODEL__CONSTRAINTS);
		createEReference(providerModelEClass, PROVIDER_MODEL__ROOT_FEATURE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEReference(attributeEClass, ATTRIBUTE__VALUE);
		createEReference(attributeEClass, ATTRIBUTE__VALUE_TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__UNIT_TYPE);
		createEOperation(attributeEClass, ATTRIBUTE___CHECK_VALUE__SINGLEVALUE_BOOLEAN);

		attributeConstraintEClass = createEClass(ATTRIBUTE_CONSTRAINT);
		createEAttribute(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__NAME);
		createEReference(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__FROM);
		createEReference(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__TO);
		createEReference(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__FROM_VALUE);
		createEReference(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__TO_VALUE);

		cardinalityEClass = createEClass(CARDINALITY);
		createEAttribute(cardinalityEClass, CARDINALITY__CARDINALITY_MIN);
		createEAttribute(cardinalityEClass, CARDINALITY__CARDINALITY_MAX);

		featCardinalityEClass = createEClass(FEAT_CARDINALITY);
		createEAttribute(featCardinalityEClass, FEAT_CARDINALITY__VALUE);

		groupCardinalityEClass = createEClass(GROUP_CARDINALITY);

		cloneEClass = createEClass(CLONE);
		createEAttribute(cloneEClass, CLONE__NAME);
		createEReference(cloneEClass, CLONE__SUB_CLONES);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__NAME);
		createEReference(constraintEClass, CONSTRAINT__FROM);
		createEReference(constraintEClass, CONSTRAINT__TO);
		createEReference(constraintEClass, CONSTRAINT__ATTRIBUTE_CONSTRAINTS);

		excludesEClass = createEClass(EXCLUDES);

		impliesEClass = createEClass(IMPLIES);

		requiresEClass = createEClass(REQUIRES);
		createEReference(requiresEClass, REQUIRES__SCOPE_FROM);
		createEReference(requiresEClass, REQUIRES__SCOPE_TO);
		createEReference(requiresEClass, REQUIRES__CARD_FROM);
		createEReference(requiresEClass, REQUIRES__CARD_TO);

		functionalEClass = createEClass(FUNCTIONAL);
		createEAttribute(functionalEClass, FUNCTIONAL__TYPE);
		createEAttribute(functionalEClass, FUNCTIONAL__ORDER);
		createEAttribute(functionalEClass, FUNCTIONAL__VALUE);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__NAME);
		createEReference(featureEClass, FEATURE__ATTRIBUTES);
		createEReference(featureEClass, FEATURE__SUB_FEATURES);
		createEReference(featureEClass, FEATURE__FEATURE_CARDINALITY);
		createEReference(featureEClass, FEATURE__CLONES);

		alternativeEClass = createEClass(ALTERNATIVE);
		createEReference(alternativeEClass, ALTERNATIVE__GROUP_CARDINALITY);
		createEReference(alternativeEClass, ALTERNATIVE__VARIANTS);

		exclusiveEClass = createEClass(EXCLUSIVE);

		scopeEClass = createEClass(SCOPE);

		instanceEClass = createEClass(INSTANCE);
		createEReference(instanceEClass, INSTANCE__FEATURE);

		productEClass = createEClass(PRODUCT);

		// Create enums
		operatorEEnum = createEEnum(OPERATOR);
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
		TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
		UnitPackage theUnitPackage = (UnitPackage)EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		providerModelEClass.getESuperTypes().add(theCamelPackage.getModel());
		featCardinalityEClass.getESuperTypes().add(this.getCardinality());
		groupCardinalityEClass.getESuperTypes().add(this.getCardinality());
		excludesEClass.getESuperTypes().add(this.getConstraint());
		impliesEClass.getESuperTypes().add(this.getConstraint());
		requiresEClass.getESuperTypes().add(this.getConstraint());
		functionalEClass.getESuperTypes().add(this.getRequires());
		alternativeEClass.getESuperTypes().add(this.getFeature());
		exclusiveEClass.getESuperTypes().add(this.getAlternative());
		instanceEClass.getESuperTypes().add(this.getScope());
		productEClass.getESuperTypes().add(this.getScope());

		// Initialize classes, features, and operations; add parameters
		initEClass(providerModelEClass, ProviderModel.class, "ProviderModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProviderModel_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, ProviderModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProviderModel_RootFeature(), this.getFeature(), null, "rootFeature", null, 1, 1, ProviderModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Value(), theTypePackage.getSingleValue(), null, "value", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_ValueType(), theTypePackage.getValueType(), null, "valueType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_UnitType(), theUnitPackage.getUnitType(), "unitType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAttribute__CheckValue__SingleValue_boolean(), ecorePackage.getEBoolean(), "checkValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypePackage.getSingleValue(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "diff", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(attributeConstraintEClass, AttributeConstraint.class, "AttributeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeConstraint_From(), this.getAttribute(), null, "from", null, 1, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeConstraint_To(), this.getAttribute(), null, "to", null, 1, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeConstraint_FromValue(), theTypePackage.getSingleValue(), null, "fromValue", null, 1, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeConstraint_ToValue(), theTypePackage.getSingleValue(), null, "toValue", null, 1, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityEClass, Cardinality.class, "Cardinality", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinality_CardinalityMin(), ecorePackage.getEInt(), "cardinalityMin", null, 1, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_CardinalityMax(), ecorePackage.getEInt(), "cardinalityMax", null, 1, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featCardinalityEClass, FeatCardinality.class, "FeatCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatCardinality_Value(), ecorePackage.getEInt(), "value", null, 1, 1, FeatCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupCardinalityEClass, GroupCardinality.class, "GroupCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cloneEClass, Clone.class, "Clone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClone_Name(), ecorePackage.getEString(), "name", null, 1, 1, Clone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClone_SubClones(), this.getClone(), null, "subClones", null, 0, -1, Clone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Name(), ecorePackage.getEString(), "name", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_From(), this.getFeature(), null, "from", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_To(), this.getFeature(), null, "to", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_AttributeConstraints(), this.getAttributeConstraint(), null, "attributeConstraints", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excludesEClass, Excludes.class, "Excludes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(impliesEClass, Implies.class, "Implies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiresEClass, Requires.class, "Requires", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequires_ScopeFrom(), this.getScope(), null, "scopeFrom", null, 0, 1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequires_ScopeTo(), this.getScope(), null, "scopeTo", null, 0, 1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequires_CardFrom(), this.getFeatCardinality(), null, "cardFrom", null, 0, 1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequires_CardTo(), this.getFeatCardinality(), null, "cardTo", null, 0, 1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalEClass, Functional.class, "Functional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctional_Type(), this.getOperator(), "type", null, 0, 1, Functional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctional_Order(), ecorePackage.getEInt(), "order", null, 0, 1, Functional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctional_Value(), ecorePackage.getEInt(), "value", null, 1, 1, Functional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_SubFeatures(), this.getFeature(), null, "subFeatures", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_FeatureCardinality(), this.getFeatCardinality(), null, "featureCardinality", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Clones(), this.getClone(), null, "clones", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeEClass, Alternative.class, "Alternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternative_GroupCardinality(), this.getGroupCardinality(), null, "groupCardinality", null, 0, 1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlternative_Variants(), this.getFeature(), null, "variants", null, 1, -1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exclusiveEClass, Exclusive.class, "Exclusive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scopeEClass, Scope.class, "Scope", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstance_Feature(), this.getFeature(), null, "feature", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.SELECT);
		addEEnumLiteral(operatorEEnum, Operator.ADD);
		addEEnumLiteral(operatorEEnum, Operator.REMOVE);
		addEEnumLiteral(operatorEEnum, Operator.MULTIPLY);
		addEEnumLiteral(operatorEEnum, Operator.DIVIDE);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// Ecore
		createEcore_1Annotations();
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
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "constraints", "attribute_must_have_at_least_value_or_value_type attribute_value_in_value_type"
		   });	
		addAnnotation
		  (attributeConstraintEClass, 
		   source, 
		   new String[] {
			 "constraints", "attribute_constraint_correct_values different_attrs_in_attribute_constraint"
		   });	
		addAnnotation
		  (cardinalityEClass, 
		   source, 
		   new String[] {
			 "constraints", "cardinality_min_less_equal_than_max"
		   });	
		addAnnotation
		  (featCardinalityEClass, 
		   source, 
		   new String[] {
			 "constraints", "correct_feat_cardinality"
		   });	
		addAnnotation
		  (constraintEClass, 
		   source, 
		   new String[] {
			 "constraints", "constraint_from_attributes_belong_to_from_feature_and_symmetric"
		   });	
		addAnnotation
		  (requiresEClass, 
		   source, 
		   new String[] {
			 "constraints", "requires_cardFrom_to_conformance"
		   });	
		addAnnotation
		  (functionalEClass, 
		   source, 
		   new String[] {
			 "constraints", "correct_values_for_functional"
		   });	
		addAnnotation
		  (alternativeEClass, 
		   source, 
		   new String[] {
			 "constraints", "alternative_variants_diff_from_sub_features"
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
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "attribute_must_have_at_least_value_or_value_type", "Tuple {\n\tmessage : String = \'Attribute: \' + self.name +\n\t\t\t\t\t\' does not have a value or value type\',\n\tstatus : Boolean = value <> null or valueType <> null\n}.status",
			 "attribute_value_in_value_type", "Tuple {\n\tmessage : String = \'Value  is not contained in ValueType in Attribute: \' + self.name,\n\tstatus : Boolean = (value\n\t\t\t\t\t<> null and valueType <> null) implies self.checkValue(value, false)\n}.status"
		   });	
		addAnnotation
		  (getAttribute__CheckValue__SingleValue_boolean(), 
		   source, 
		   new String[] {
			 "body", "if (self.valueType <> null)\n\t\t\t\t\t\tthen if (self.valueType.oclIsTypeOf(camel::type::Range))\n\t\t\t\t\t\t\tthen if (v.oclIsTypeOf(camel::type::BoolValue) or v.oclIsTypeOf(camel::type::StringsValue))\n\t\t\t\t\t\t\t\tthen false\n\t\t\t\t\t\t\t\telse if (v.oclIsTypeOf(camel::type::IntegerValue))\n\t\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::Range).includesValue(v.oclAsType(camel::type::IntegerValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\telse if (v.oclIsTypeOf(camel::type::FloatsValue))\n\t\t\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::Range).includesValue(v.oclAsType(camel::type::FloatsValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::Range).includesValue(v.oclAsType(camel::type::DoublePrecisionValue).value)\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (self.valueType.oclIsTypeOf(camel::type::RangeUnion))\n\t\t\t\t\t\t\t\tthen if (v.oclIsTypeOf(camel::type::BoolValue) or v.oclIsTypeOf(camel::type::StringsValue))\n\t\t\t\t\t\t\t\t\tthen false\n\t\t\t\t\t\t\t\t\telse if (v.oclIsTypeOf(camel::type::IntegerValue))\n\t\t\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::RangeUnion).includesValue(v.oclAsType(camel::type::IntegerValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\t\telse if (v.oclIsTypeOf(camel::type::FloatsValue))\n\t\t\t\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::RangeUnion).includesValue(v.oclAsType(camel::type::FloatsValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::RangeUnion).includesValue(v.oclAsType(camel::type::DoublePrecisionValue).value)\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse if (self.valueType.oclIsTypeOf(camel::type::List))\n\t\t\t\t\t\t\t\t\tthen (self.valueType.oclAsType(camel::type::List).checkValueType(v) and\n\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::List).includesValue(v))\n\t\t\t\t\t\t\t\t\telse if (self.valueType.oclIsTypeOf(camel::type::Enumeration) and v.oclIsTypeOf(camel::type::StringsValue))\n\t\t\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::Enumeration).includesName(v.oclAsType(camel::type::StringsValue).value)\n\t\t\t\t\t\t\t\t\t\telse if (self.valueType.oclIsTypeOf(camel::type::Enumeration) and v.oclIsTypeOf(camel::type::EnumerateValue))\n\t\t\t\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\t\t\t\t(self.valueType.oclAsType(camel::type::Enumeration).includesName(v.oclAsType(camel::type::EnumerateValue).name)\n\t\t\t\t\t\t\t\t\t\t\t\tand\n\t\t\t\t\t\t\t\t\t\t\t\tself.valueType.oclAsType(camel::type::Enumeration).includesValue(v.oclAsType(camel::type::EnumerateValue).value))\n\t\t\t\t\t\t\t\t\t\t\telse if (self.valueType.oclIsTypeOf(camel::type::StringValueType))\n\t\t\t\t\t\t\t\t\t\t\t\tthen v.oclIsTypeOf(camel::type::StringsValue)\n\t\t\t\t\t\t\t\t\t\t\t\telse if (self.valueType.oclIsTypeOf(camel::type::BooleanValueType))\n\t\t\t\t\t\t\t\t\t\t\t\t\tthen v.oclIsTypeOf(camel::type::BoolValue)\n\t\t\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse if (diff and self.value <> null)\n\t\t\t\t\t\t\tthen self.value.valueEquals(v)\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif"
		   });	
		addAnnotation
		  (attributeConstraintEClass, 
		   source, 
		   new String[] {
			 "attribute_constraint_correct_values", "Tuple {\n\tmessage : String = \'In AttributeConstraint: \' + self.toString() +\n\t\t\t\t\t\' either the fromValue: \' + fromValue.toString() + \' or the toValue: \' + toValue.toString() +\n\t\t\t\t\t\' are not contained in the value types of the respective attributes: \' + from.name + \' \' + to.name +\n\t\t\t\t\t\', respectively\',\n\tstatus : Boolean = from.checkValue(fromValue, true) and to.checkValue(toValue, true)\n}.status",
			 "different_attrs_in_attribute_constraint", "Tuple {\n\tmessage : String = \'In AttributeConstraint: \' + self.toString() +\n\t\t\t\t\t\' the same attribute: \' + from.name + \' is used in the from and to associations\',\n\tstatus : Boolean = from <> to\n}.status"
		   });	
		addAnnotation
		  (cardinalityEClass, 
		   source, 
		   new String[] {
			 "cardinality_min_less_equal_than_max", "Tuple {\n\tmessage : String = \'In Cardinality\' + self.toString() +\n\t\t\t\t\t\' either negative values are given for cardinalityMin or cardinalityMax or cardinalityMin is greater than cardinalityMax\',\n\tstatus : Boolean = cardinalityMin\n\t\t\t\t\t>= 0 and (cardinalityMax >= 0 implies cardinalityMin <= cardinalityMax)\n}.status"
		   });	
		addAnnotation
		  (featCardinalityEClass, 
		   source, 
		   new String[] {
			 "correct_feat_cardinality", "Tuple {\n\tmessage : String = \'In FeatCardinality: \' + self.toString() +\n\t\t\t\t\t\' either the value given is negative or the value is less than cardinalityMin or value is greater than cardinalityMax\',\n\tstatus : Boolean = (value\n\t\t\t\t\t> 0 implies (cardinalityMin <= value) and (cardinalityMax <> - 1 implies value <= cardinalityMax))\n}.status"
		   });	
		addAnnotation
		  (constraintEClass, 
		   source, 
		   new String[] {
			 "constraint_from_attributes_belong_to_from_feature_and_symmetric", "Tuple {\n\tmessage : String = \'Constraint: \' + name +\n\t\t\t\t\t\' has attribute constraints which map to from or to attributes that do not belong to the respective from: \' +\n\t\t\t\t\tfrom.name + \' or to: \' + to.name + \' feature of this constraint\',\n\tstatus : Boolean = attributeConstraints\n\t\t\t\t\t->forAll(p | (from.attributes\n\t\t\t\t\t\t->includes(p.from) and to.attributes\n\t\t\t\t\t\t->includes(p.to)))\n}.status"
		   });	
		addAnnotation
		  (requiresEClass, 
		   source, 
		   new String[] {
			 "requires_cardFrom_to_conformance", "Tuple {\n\tmessage : String = \'In Requires Constraint: \' + self.name +\n\t\t\t\t\t\' there are from or to cardinalities that do not conform to the designated cardinality restrictions of the respective from: \'\n\t\t\t\t\t+ from.name + \' or to: \' + to.name + \' features of this constraint\',\n\tstatus : Boolean = (cardFrom <> null implies\n\t\t\t\t\t(cardFrom.cardinalityMin >= from.featureCardinality.cardinalityMin and ((from.featureCardinality.cardinalityMax =\n\t\t\t\t\t- 1) or (cardFrom.cardinalityMax <> - 1 and cardFrom.cardinalityMax <= from.featureCardinality.cardinalityMax))))\n\t\t\t\t\tand (cardTo <> null implies (cardTo.cardinalityMin >= to.featureCardinality.cardinalityMin and\n\t\t\t\t\t((to.featureCardinality.cardinalityMax = - 1) or (cardTo.cardinalityMax <> - 1 and cardTo.cardinalityMax <=\n\t\t\t\t\tto.featureCardinality.cardinalityMax))))\n}.status"
		   });	
		addAnnotation
		  (functionalEClass, 
		   source, 
		   new String[] {
			 "correct_values_for_functional", "Tuple {\n\tmessage : String = \'In Functional Constraint: \' + self.name +\n\t\t\t\t\t\', either the value of order is negative or that of the value attributes is not positive\',\n\tstatus : Boolean = order >= 0 and value >\n\t\t\t\t\t0\n}.status"
		   });	
		addAnnotation
		  (alternativeEClass, 
		   source, 
		   new String[] {
			 "alternative_variants_diff_from_sub_features", "Tuple {\n\tmessage : String = \'There is a pair of subFeature and variant with the same name for Feature: \'\n\t\t\t\t\t+ self.name,\n\tstatus : Boolean = subFeatures\n\t\t\t\t\t->forAll(p | not (variants\n\t\t\t\t\t\t->exists(q | q.name = p.name)))\n}.status"
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
		  (getAttribute_UnitType(), 
		   source, 
		   new String[] {
			 "body", "OptimizationRequirement",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getClone_Name(), 
		   source, 
		   new String[] {
			 "body", "ServiceLevelObjective",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getClone_Name(), 
		   source, 
		   new String[] {
			 "body", "ServiceLevelObjective",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getClone_Name(), 
		   source, 
		   new String[] {
			 "body", "MetricCondition",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getConstraint_Name(), 
		   source, 
		   new String[] {
			 "body", "PropertyCondition",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getFunctional_Type(), 
		   source, 
		   new String[] {
			 "body", "ProviderRequirement",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getFunctional_Type(), 
		   source, 
		   new String[] {
			 "body", "ProviderRequirement",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getFunctional_Type(), 
		   source, 
		   new String[] {
			 "body", "BinaryEventPattern",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getFunctional_Order(), 
		   source, 
		   new String[] {
			 "body", "BinaryEventPattern",
			 "unique", "false",
			 "upper", "*"
		   });
	}

	/**
	 * Initializes the annotations for <b>Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcore_1Annotations() {
		String source = "Ecore";	
		addAnnotation
		  (attributeConstraintEClass, 
		   source, 
		   new String[] {
			 "attributeConstraintValidation", "atLeastOneDefinied"
		   });	
		addAnnotation
		  (constraintEClass, 
		   source, 
		   new String[] {
			 "fromAttributeConstraintsvalidation", "fromAttributesBelongsToFromFeature",
			 "toAttributeConstraintsvalidation", "toAttributesBelongsToToFeature"
		   });
	}

} //ProviderPackageImpl
