/**
 */
package eu.paasage.camel.security.impl;

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

import eu.paasage.camel.security.Certifiable;
import eu.paasage.camel.security.CompositeSecurityMetric;
import eu.paasage.camel.security.CompositeSecurityMetricInstance;
import eu.paasage.camel.security.RawSecurityMetric;
import eu.paasage.camel.security.RawSecurityMetricInstance;
import eu.paasage.camel.security.SecurityCapability;
import eu.paasage.camel.security.SecurityControl;
import eu.paasage.camel.security.SecurityDomain;
import eu.paasage.camel.security.SecurityFactory;
import eu.paasage.camel.security.SecurityModel;
import eu.paasage.camel.security.SecurityPackage;
import eu.paasage.camel.security.SecurityProperty;
import eu.paasage.camel.security.SecuritySLO;

import eu.paasage.camel.security.util.SecurityValidator;

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
public class SecurityPackageImpl extends EPackageImpl implements SecurityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rawSecurityMetricInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rawSecurityMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securitySLOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeSecurityMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeSecurityMetricInstanceEClass = null;

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
	 * @see eu.paasage.camel.security.SecurityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecurityPackageImpl() {
		super(eNS_URI, SecurityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SecurityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecurityPackage init() {
		if (isInited) return (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

		// Obtain or create and register package
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SecurityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SecurityPackageImpl());

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
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) : UnitPackage.eINSTANCE);

		// Create package meta-data objects
		theSecurityPackage.createPackageContents();
		theCamelPackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theLocationPackage.createPackageContents();
		theMetricPackage.createPackageContents();
		theOrganisationPackage.createPackageContents();
		theProviderPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theScalabilityPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theUnitPackage.createPackageContents();

		// Initialize created meta-data
		theSecurityPackage.initializePackageContents();
		theCamelPackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theLocationPackage.initializePackageContents();
		theMetricPackage.initializePackageContents();
		theOrganisationPackage.initializePackageContents();
		theProviderPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theScalabilityPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theUnitPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSecurityPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SecurityValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSecurityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecurityPackage.eNS_URI, theSecurityPackage);
		return theSecurityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityModel() {
		return securityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityModel_SecurityControls() {
		return (EReference)securityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityModel_SecurityRequirements() {
		return (EReference)securityModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityModel_SecurityProperties() {
		return (EReference)securityModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityModel_RawSecurityMetrics() {
		return (EReference)securityModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityModel_CompositeSecurityMetrics() {
		return (EReference)securityModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityModel_RawSecurityMetricInstances() {
		return (EReference)securityModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityModel_CompositeSecurityMetricInstances() {
		return (EReference)securityModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityModel_SecurityDomains() {
		return (EReference)securityModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityModel_SecurityCapabilities() {
		return (EReference)securityModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityModel_SecuritySLOs() {
		return (EReference)securityModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityDomain() {
		return securityDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityDomain_Id() {
		return (EAttribute)securityDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityDomain_Name() {
		return (EAttribute)securityDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityDomain_SubDomain() {
		return (EReference)securityDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityControl() {
		return securityControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityControl_Name() {
		return (EAttribute)securityControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityControl_Domain() {
		return (EReference)securityControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityControl_SubDomain() {
		return (EReference)securityControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityControl_Specification() {
		return (EAttribute)securityControlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityControl_SecurityProperties() {
		return (EReference)securityControlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityControl_RawSecurityMetrics() {
		return (EReference)securityControlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityControl_CompositeSecurityMetrics() {
		return (EReference)securityControlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRawSecurityMetricInstance() {
		return rawSecurityMetricInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRawSecurityMetric() {
		return rawSecurityMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityProperty() {
		return securityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityProperty_Domain() {
		return (EReference)securityPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCertifiable() {
		return certifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecuritySLO() {
		return securitySLOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityCapability() {
		return securityCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityCapability_Name() {
		return (EAttribute)securityCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityCapability_SecurityControls() {
		return (EReference)securityCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityCapability_DataCenter() {
		return (EReference)securityCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeSecurityMetric() {
		return compositeSecurityMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeSecurityMetricInstance() {
		return compositeSecurityMetricInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityFactory getSecurityFactory() {
		return (SecurityFactory)getEFactoryInstance();
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
		securityModelEClass = createEClass(SECURITY_MODEL);
		createEReference(securityModelEClass, SECURITY_MODEL__SECURITY_CONTROLS);
		createEReference(securityModelEClass, SECURITY_MODEL__SECURITY_REQUIREMENTS);
		createEReference(securityModelEClass, SECURITY_MODEL__SECURITY_PROPERTIES);
		createEReference(securityModelEClass, SECURITY_MODEL__RAW_SECURITY_METRICS);
		createEReference(securityModelEClass, SECURITY_MODEL__COMPOSITE_SECURITY_METRICS);
		createEReference(securityModelEClass, SECURITY_MODEL__RAW_SECURITY_METRIC_INSTANCES);
		createEReference(securityModelEClass, SECURITY_MODEL__COMPOSITE_SECURITY_METRIC_INSTANCES);
		createEReference(securityModelEClass, SECURITY_MODEL__SECURITY_DOMAINS);
		createEReference(securityModelEClass, SECURITY_MODEL__SECURITY_CAPABILITIES);
		createEReference(securityModelEClass, SECURITY_MODEL__SECURITY_SL_OS);

		securityDomainEClass = createEClass(SECURITY_DOMAIN);
		createEAttribute(securityDomainEClass, SECURITY_DOMAIN__ID);
		createEAttribute(securityDomainEClass, SECURITY_DOMAIN__NAME);
		createEReference(securityDomainEClass, SECURITY_DOMAIN__SUB_DOMAIN);

		securityControlEClass = createEClass(SECURITY_CONTROL);
		createEAttribute(securityControlEClass, SECURITY_CONTROL__NAME);
		createEReference(securityControlEClass, SECURITY_CONTROL__DOMAIN);
		createEReference(securityControlEClass, SECURITY_CONTROL__SUB_DOMAIN);
		createEAttribute(securityControlEClass, SECURITY_CONTROL__SPECIFICATION);
		createEReference(securityControlEClass, SECURITY_CONTROL__SECURITY_PROPERTIES);
		createEReference(securityControlEClass, SECURITY_CONTROL__RAW_SECURITY_METRICS);
		createEReference(securityControlEClass, SECURITY_CONTROL__COMPOSITE_SECURITY_METRICS);

		rawSecurityMetricInstanceEClass = createEClass(RAW_SECURITY_METRIC_INSTANCE);

		rawSecurityMetricEClass = createEClass(RAW_SECURITY_METRIC);

		securityPropertyEClass = createEClass(SECURITY_PROPERTY);
		createEReference(securityPropertyEClass, SECURITY_PROPERTY__DOMAIN);

		certifiableEClass = createEClass(CERTIFIABLE);

		securitySLOEClass = createEClass(SECURITY_SLO);

		securityCapabilityEClass = createEClass(SECURITY_CAPABILITY);
		createEAttribute(securityCapabilityEClass, SECURITY_CAPABILITY__NAME);
		createEReference(securityCapabilityEClass, SECURITY_CAPABILITY__SECURITY_CONTROLS);
		createEReference(securityCapabilityEClass, SECURITY_CAPABILITY__DATA_CENTER);

		compositeSecurityMetricEClass = createEClass(COMPOSITE_SECURITY_METRIC);

		compositeSecurityMetricInstanceEClass = createEClass(COMPOSITE_SECURITY_METRIC_INSTANCE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		securityModelEClass.getESuperTypes().add(theCamelPackage.getModel());
		rawSecurityMetricInstanceEClass.getESuperTypes().add(theMetricPackage.getRawMetricInstance());
		rawSecurityMetricEClass.getESuperTypes().add(theMetricPackage.getRawMetric());
		securityPropertyEClass.getESuperTypes().add(theMetricPackage.getProperty());
		certifiableEClass.getESuperTypes().add(this.getSecurityProperty());
		securitySLOEClass.getESuperTypes().add(theRequirementPackage.getServiceLevelObjective());
		compositeSecurityMetricEClass.getESuperTypes().add(theMetricPackage.getCompositeMetric());
		compositeSecurityMetricInstanceEClass.getESuperTypes().add(theMetricPackage.getCompositeMetricInstance());

		// Initialize classes, features, and operations; add parameters
		initEClass(securityModelEClass, SecurityModel.class, "SecurityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityModel_SecurityControls(), this.getSecurityControl(), null, "securityControls", null, 0, -1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurityModel_SecurityRequirements(), theRequirementPackage.getSecurityRequirement(), null, "securityRequirements", null, 0, -1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurityModel_SecurityProperties(), this.getSecurityProperty(), null, "securityProperties", null, 0, -1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurityModel_RawSecurityMetrics(), this.getRawSecurityMetric(), null, "rawSecurityMetrics", null, 0, -1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurityModel_CompositeSecurityMetrics(), this.getCompositeSecurityMetric(), null, "compositeSecurityMetrics", null, 0, -1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurityModel_RawSecurityMetricInstances(), this.getRawSecurityMetricInstance(), null, "rawSecurityMetricInstances", null, 0, -1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurityModel_CompositeSecurityMetricInstances(), this.getCompositeSecurityMetricInstance(), null, "compositeSecurityMetricInstances", null, 0, -1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurityModel_SecurityDomains(), this.getSecurityDomain(), null, "securityDomains", null, 0, -1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurityModel_SecurityCapabilities(), this.getSecurityCapability(), null, "securityCapabilities", null, 0, -1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurityModel_SecuritySLOs(), this.getSecuritySLO(), null, "securitySLOs", null, 0, -1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityDomainEClass, SecurityDomain.class, "SecurityDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityDomain_Id(), ecorePackage.getEString(), "id", null, 1, 1, SecurityDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityDomain_Name(), ecorePackage.getEString(), "name", null, 1, 1, SecurityDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityDomain_SubDomain(), this.getSecurityDomain(), null, "subDomain", null, 0, -1, SecurityDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(securityControlEClass, SecurityControl.class, "SecurityControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityControl_Name(), ecorePackage.getEString(), "name", null, 1, 1, SecurityControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityControl_Domain(), this.getSecurityDomain(), null, "domain", null, 1, 1, SecurityControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityControl_SubDomain(), this.getSecurityDomain(), null, "subDomain", null, 1, 1, SecurityControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityControl_Specification(), ecorePackage.getEString(), "specification", null, 1, 1, SecurityControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityControl_SecurityProperties(), this.getSecurityProperty(), null, "securityProperties", null, 0, -1, SecurityControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityControl_RawSecurityMetrics(), this.getRawSecurityMetric(), null, "rawSecurityMetrics", null, 0, -1, SecurityControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityControl_CompositeSecurityMetrics(), this.getCompositeSecurityMetric(), null, "compositeSecurityMetrics", null, 0, -1, SecurityControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rawSecurityMetricInstanceEClass, RawSecurityMetricInstance.class, "RawSecurityMetricInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rawSecurityMetricEClass, RawSecurityMetric.class, "RawSecurityMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityPropertyEClass, SecurityProperty.class, "SecurityProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityProperty_Domain(), this.getSecurityDomain(), null, "domain", null, 1, 1, SecurityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certifiableEClass, Certifiable.class, "Certifiable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securitySLOEClass, SecuritySLO.class, "SecuritySLO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityCapabilityEClass, SecurityCapability.class, "SecurityCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityCapability_Name(), ecorePackage.getEString(), "name", null, 1, 1, SecurityCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityCapability_SecurityControls(), this.getSecurityControl(), null, "securityControls", null, 1, -1, SecurityCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurityCapability_DataCenter(), theOrganisationPackage.getDataCenter(), null, "dataCenter", null, 0, 1, SecurityCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeSecurityMetricEClass, CompositeSecurityMetric.class, "CompositeSecurityMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeSecurityMetricInstanceEClass, CompositeSecurityMetricInstance.class, "CompositeSecurityMetricInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// teneo.jpa
		createTeneoAnnotations();
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
		  (certifiableEClass, 
		   source, 
		   new String[] {
			 "constraints", "certifiable_realized_by"
		   });	
		addAnnotation
		  (securitySLOEClass, 
		   source, 
		   new String[] {
			 "constraints", "only_sec_constructs_in_condition"
		   });
	}

	/**
	 * Initializes the annotations for <b>teneo.jpa</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneoAnnotations() {
		String source = "teneo.jpa";	
		addAnnotation
		  (getSecurityModel_RawSecurityMetricInstances(), 
		   source, 
		   new String[] {
			 "value", "@JoinColumn(name=\"rawsecuritymetricInstances\")"
		   });	
		addAnnotation
		  (getSecurityModel_CompositeSecurityMetricInstances(), 
		   source, 
		   new String[] {
			 "value", "@JoinColumn(name=\"compositesecuritymetricInstances\")"
		   });	
		addAnnotation
		  (getSecurityControl_Specification(), 
		   source, 
		   new String[] {
			 "value", "@Column(length=4000)"
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
		  (getSecurityDomain_Name(), 
		   source, 
		   new String[] {
			 "body", "Limit"
		   });	
		addAnnotation
		  (getSecurityDomain_Name(), 
		   source, 
		   new String[] {
			 "body", "Limit"
		   });	
		addAnnotation
		  (getSecurityControl_Specification(), 
		   source, 
		   new String[] {
			 "body", "AgreementType"
		   });	
		addAnnotation
		  (getSecurityCapability_Name(), 
		   source, 
		   new String[] {
			 "body", "ServiceLevelObjectiveType"
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
		  (certifiableEClass, 
		   source, 
		   new String[] {
			 "certifiable_realized_by", "Tuple {\n\tmessage : String = \'Certifiable Property: \' + self.name +\n\t\t\t\t\t\' has a non-empty list of sub-properties\',\n\tstatus : Boolean = self.subProperties\n\t\t\t\t\t->isEmpty()\n}.status"
		   });	
		addAnnotation
		  (securitySLOEClass, 
		   source, 
		   new String[] {
			 "only_sec_constructs_in_condition", "Tuple {\n\tmessage : String = \'SecuritySLO: \' + self.name +\n\t\t\t\t\t\' maps to non-security metrics or properties\',\n\tstatus : Boolean = if\n\t\t\t\t\t\t(customServiceLevel.oclIsTypeOf(camel::metric::MetricCondition))\n\t\t\t\t\tthen\n\t\t\t\t\t\tcustomServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.metric.oclIsTypeOf(camel::security::RawSecurityMetric)\n\t\t\t\t\t\tor\n\t\t\t\t\t\tcustomServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.metric.oclIsTypeOf(camel::security::CompositeSecurityMetric)\n\t\t\t\t\telse if (customServiceLevel.oclIsTypeOf(camel::metric::PropertyCondition))\n\t\t\t\t\t\tthen\n\t\t\t\t\t\t\tcustomServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.property.oclIsTypeOf(camel::security::SecurityProperty)\n\t\t\t\t\t\telse false\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n}.status"
		   });
	}

} //SecurityPackageImpl
