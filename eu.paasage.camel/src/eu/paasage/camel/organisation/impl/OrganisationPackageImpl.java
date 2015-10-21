/**
 */
package eu.paasage.camel.organisation.impl;

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

import eu.paasage.camel.organisation.CloudCredentials;
import eu.paasage.camel.organisation.CloudProvider;
import eu.paasage.camel.organisation.Credentials;
import eu.paasage.camel.organisation.DataCenter;
import eu.paasage.camel.organisation.Entity;
import eu.paasage.camel.organisation.ExternalIdentifier;
import eu.paasage.camel.organisation.InformationResourceFilter;
import eu.paasage.camel.organisation.Organisation;
import eu.paasage.camel.organisation.OrganisationFactory;
import eu.paasage.camel.organisation.OrganisationModel;
import eu.paasage.camel.organisation.OrganisationPackage;
import eu.paasage.camel.organisation.PaaSageCredentials;
import eu.paasage.camel.organisation.Permission;
import eu.paasage.camel.organisation.ResourceFilter;
import eu.paasage.camel.organisation.ResourcePattern;
import eu.paasage.camel.organisation.Role;
import eu.paasage.camel.organisation.RoleAssignment;
import eu.paasage.camel.organisation.SecurityLevel;
import eu.paasage.camel.organisation.ServiceResourceFilter;
import eu.paasage.camel.organisation.User;
import eu.paasage.camel.organisation.UserGroup;

import eu.paasage.camel.organisation.util.OrganisationValidator;

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
public class OrganisationPackageImpl extends EPackageImpl implements OrganisationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass credentialsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudCredentialsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationResourceFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceResourceFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paaSageCredentialsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securityLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourcePatternEEnum = null;

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
	 * @see eu.paasage.camel.organisation.OrganisationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrganisationPackageImpl() {
		super(eNS_URI, OrganisationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OrganisationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OrganisationPackage init() {
		if (isInited) return (OrganisationPackage)EPackage.Registry.INSTANCE.getEPackage(OrganisationPackage.eNS_URI);

		// Obtain or create and register package
		OrganisationPackageImpl theOrganisationPackage = (OrganisationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrganisationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OrganisationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CamelPackageImpl theCamelPackage = (CamelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) instanceof CamelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) : CamelPackage.eINSTANCE);
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) instanceof ExecutionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) : ExecutionPackage.eINSTANCE);
		LocationPackageImpl theLocationPackage = (LocationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI) instanceof LocationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI) : LocationPackage.eINSTANCE);
		MetricPackageImpl theMetricPackage = (MetricPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetricPackage.eNS_URI) instanceof MetricPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetricPackage.eNS_URI) : MetricPackage.eINSTANCE);
		ProviderPackageImpl theProviderPackage = (ProviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI) instanceof ProviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI) : ProviderPackage.eINSTANCE);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) : RequirementPackage.eINSTANCE);
		ScalabilityPackageImpl theScalabilityPackage = (ScalabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScalabilityPackage.eNS_URI) instanceof ScalabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScalabilityPackage.eNS_URI) : ScalabilityPackage.eINSTANCE);
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) instanceof SecurityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) : SecurityPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) : UnitPackage.eINSTANCE);

		// Create package meta-data objects
		theOrganisationPackage.createPackageContents();
		theCamelPackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theLocationPackage.createPackageContents();
		theMetricPackage.createPackageContents();
		theProviderPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theScalabilityPackage.createPackageContents();
		theSecurityPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theUnitPackage.createPackageContents();

		// Initialize created meta-data
		theOrganisationPackage.initializePackageContents();
		theCamelPackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theLocationPackage.initializePackageContents();
		theMetricPackage.initializePackageContents();
		theProviderPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theScalabilityPackage.initializePackageContents();
		theSecurityPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theUnitPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOrganisationPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OrganisationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOrganisationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OrganisationPackage.eNS_URI, theOrganisationPackage);
		return theOrganisationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganisationModel() {
		return organisationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationModel_Organisation() {
		return (EReference)organisationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationModel_Provider() {
		return (EReference)organisationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationModel_ExternalIdentifiers() {
		return (EReference)organisationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationModel_Users() {
		return (EReference)organisationModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationModel_UserGroups() {
		return (EReference)organisationModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationModel_DataCentres() {
		return (EReference)organisationModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationModel_Roles() {
		return (EReference)organisationModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationModel_RoleAssigments() {
		return (EReference)organisationModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationModel_Permissions() {
		return (EReference)organisationModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationModel_SecurityLevel() {
		return (EAttribute)organisationModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationModel_ResourceFilters() {
		return (EReference)organisationModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCredentials() {
		return credentialsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudCredentials() {
		return cloudCredentialsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudCredentials_Name() {
		return (EAttribute)cloudCredentialsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudCredentials_CloudProvider() {
		return (EReference)cloudCredentialsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudCredentials_SecurityGroup() {
		return (EAttribute)cloudCredentialsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudCredentials_PublicSSHKey() {
		return (EAttribute)cloudCredentialsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudCredentials_PrivateSSHKey() {
		return (EAttribute)cloudCredentialsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudCredentials_Username() {
		return (EAttribute)cloudCredentialsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudCredentials_Password() {
		return (EAttribute)cloudCredentialsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCenter() {
		return dataCenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCenter_Name() {
		return (EAttribute)dataCenterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCenter_CodeName() {
		return (EAttribute)dataCenterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCenter_Location() {
		return (EReference)dataCenterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganisation() {
		return organisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisation_Name() {
		return (EAttribute)organisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisation_Www() {
		return (EAttribute)organisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisation_PostalAddress() {
		return (EAttribute)organisationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisation_Email() {
		return (EAttribute)organisationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudProvider() {
		return cloudProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudProvider_Public() {
		return (EAttribute)cloudProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudProvider_SaaS() {
		return (EAttribute)cloudProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudProvider_PaaS() {
		return (EAttribute)cloudProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudProvider_IaaS() {
		return (EAttribute)cloudProviderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudProvider_ProviderModel() {
		return (EReference)cloudProviderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudProvider_SecurityCapability() {
		return (EReference)cloudProviderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Name() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Email() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_FirstName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_LastName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Www() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_ExternalIdentifiers() {
		return (EReference)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_RequirementModels() {
		return (EReference)userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_CloudCredentials() {
		return (EReference)userEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_DeploymentModels() {
		return (EReference)userEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_PaasageCredentials() {
		return (EReference)userEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalIdentifier() {
		return externalIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalIdentifier_Identifier() {
		return (EAttribute)externalIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalIdentifier_Description() {
		return (EAttribute)externalIdentifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermission() {
		return permissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermission_Name() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermission_Role() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermission_StartTime() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermission_EndTime() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermission_ResourceFilter() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermission_Action() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPermission__CheckStartEndDates__Permission() {
		return permissionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceFilter() {
		return resourceFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceFilter_Name() {
		return (EAttribute)resourceFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceFilter_ResourcePattern() {
		return (EAttribute)resourceFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationResourceFilter() {
		return informationResourceFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationResourceFilter_InformationResourcePath() {
		return (EAttribute)informationResourceFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationResourceFilter_EveryInformationResource() {
		return (EAttribute)informationResourceFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceResourceFilter() {
		return serviceResourceFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceResourceFilter_ServiceURL() {
		return (EAttribute)serviceResourceFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceResourceFilter_EveryService() {
		return (EAttribute)serviceResourceFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleAssignment() {
		return roleAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleAssignment_Name() {
		return (EAttribute)roleAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleAssignment_User() {
		return (EReference)roleAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleAssignment_Role() {
		return (EReference)roleAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleAssignment_UserGroup() {
		return (EReference)roleAssignmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleAssignment_StartTime() {
		return (EAttribute)roleAssignmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleAssignment_EndTime() {
		return (EAttribute)roleAssignmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleAssignment_AssignmentTime() {
		return (EAttribute)roleAssignmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoleAssignment__CheckAssignedOnDates__RoleAssignment() {
		return roleAssignmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoleAssignment__CheckStartEndDates__RoleAssignment() {
		return roleAssignmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserGroup() {
		return userGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserGroup_Name() {
		return (EAttribute)userGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserGroup_Users() {
		return (EReference)userGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaaSageCredentials() {
		return paaSageCredentialsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaaSageCredentials_Password() {
		return (EAttribute)paaSageCredentialsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSecurityLevel() {
		return securityLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourcePattern() {
		return resourcePatternEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationFactory getOrganisationFactory() {
		return (OrganisationFactory)getEFactoryInstance();
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
		organisationModelEClass = createEClass(ORGANISATION_MODEL);
		createEReference(organisationModelEClass, ORGANISATION_MODEL__ORGANISATION);
		createEReference(organisationModelEClass, ORGANISATION_MODEL__PROVIDER);
		createEReference(organisationModelEClass, ORGANISATION_MODEL__EXTERNAL_IDENTIFIERS);
		createEReference(organisationModelEClass, ORGANISATION_MODEL__USERS);
		createEReference(organisationModelEClass, ORGANISATION_MODEL__USER_GROUPS);
		createEReference(organisationModelEClass, ORGANISATION_MODEL__DATA_CENTRES);
		createEReference(organisationModelEClass, ORGANISATION_MODEL__ROLES);
		createEReference(organisationModelEClass, ORGANISATION_MODEL__ROLE_ASSIGMENTS);
		createEReference(organisationModelEClass, ORGANISATION_MODEL__PERMISSIONS);
		createEAttribute(organisationModelEClass, ORGANISATION_MODEL__SECURITY_LEVEL);
		createEReference(organisationModelEClass, ORGANISATION_MODEL__RESOURCE_FILTERS);

		credentialsEClass = createEClass(CREDENTIALS);

		cloudCredentialsEClass = createEClass(CLOUD_CREDENTIALS);
		createEAttribute(cloudCredentialsEClass, CLOUD_CREDENTIALS__NAME);
		createEReference(cloudCredentialsEClass, CLOUD_CREDENTIALS__CLOUD_PROVIDER);
		createEAttribute(cloudCredentialsEClass, CLOUD_CREDENTIALS__SECURITY_GROUP);
		createEAttribute(cloudCredentialsEClass, CLOUD_CREDENTIALS__PUBLIC_SSH_KEY);
		createEAttribute(cloudCredentialsEClass, CLOUD_CREDENTIALS__PRIVATE_SSH_KEY);
		createEAttribute(cloudCredentialsEClass, CLOUD_CREDENTIALS__USERNAME);
		createEAttribute(cloudCredentialsEClass, CLOUD_CREDENTIALS__PASSWORD);

		dataCenterEClass = createEClass(DATA_CENTER);
		createEAttribute(dataCenterEClass, DATA_CENTER__NAME);
		createEAttribute(dataCenterEClass, DATA_CENTER__CODE_NAME);
		createEReference(dataCenterEClass, DATA_CENTER__LOCATION);

		entityEClass = createEClass(ENTITY);

		organisationEClass = createEClass(ORGANISATION);
		createEAttribute(organisationEClass, ORGANISATION__NAME);
		createEAttribute(organisationEClass, ORGANISATION__WWW);
		createEAttribute(organisationEClass, ORGANISATION__POSTAL_ADDRESS);
		createEAttribute(organisationEClass, ORGANISATION__EMAIL);

		cloudProviderEClass = createEClass(CLOUD_PROVIDER);
		createEAttribute(cloudProviderEClass, CLOUD_PROVIDER__PUBLIC);
		createEAttribute(cloudProviderEClass, CLOUD_PROVIDER__SAA_S);
		createEAttribute(cloudProviderEClass, CLOUD_PROVIDER__PAA_S);
		createEAttribute(cloudProviderEClass, CLOUD_PROVIDER__IAA_S);
		createEReference(cloudProviderEClass, CLOUD_PROVIDER__PROVIDER_MODEL);
		createEReference(cloudProviderEClass, CLOUD_PROVIDER__SECURITY_CAPABILITY);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__NAME);
		createEAttribute(userEClass, USER__EMAIL);
		createEAttribute(userEClass, USER__FIRST_NAME);
		createEAttribute(userEClass, USER__LAST_NAME);
		createEAttribute(userEClass, USER__WWW);
		createEReference(userEClass, USER__EXTERNAL_IDENTIFIERS);
		createEReference(userEClass, USER__REQUIREMENT_MODELS);
		createEReference(userEClass, USER__CLOUD_CREDENTIALS);
		createEReference(userEClass, USER__DEPLOYMENT_MODELS);
		createEReference(userEClass, USER__PAASAGE_CREDENTIALS);

		externalIdentifierEClass = createEClass(EXTERNAL_IDENTIFIER);
		createEAttribute(externalIdentifierEClass, EXTERNAL_IDENTIFIER__IDENTIFIER);
		createEAttribute(externalIdentifierEClass, EXTERNAL_IDENTIFIER__DESCRIPTION);

		permissionEClass = createEClass(PERMISSION);
		createEAttribute(permissionEClass, PERMISSION__NAME);
		createEReference(permissionEClass, PERMISSION__ROLE);
		createEAttribute(permissionEClass, PERMISSION__START_TIME);
		createEAttribute(permissionEClass, PERMISSION__END_TIME);
		createEReference(permissionEClass, PERMISSION__RESOURCE_FILTER);
		createEAttribute(permissionEClass, PERMISSION__ACTION);
		createEOperation(permissionEClass, PERMISSION___CHECK_START_END_DATES__PERMISSION);

		resourceFilterEClass = createEClass(RESOURCE_FILTER);
		createEAttribute(resourceFilterEClass, RESOURCE_FILTER__NAME);
		createEAttribute(resourceFilterEClass, RESOURCE_FILTER__RESOURCE_PATTERN);

		informationResourceFilterEClass = createEClass(INFORMATION_RESOURCE_FILTER);
		createEAttribute(informationResourceFilterEClass, INFORMATION_RESOURCE_FILTER__INFORMATION_RESOURCE_PATH);
		createEAttribute(informationResourceFilterEClass, INFORMATION_RESOURCE_FILTER__EVERY_INFORMATION_RESOURCE);

		serviceResourceFilterEClass = createEClass(SERVICE_RESOURCE_FILTER);
		createEAttribute(serviceResourceFilterEClass, SERVICE_RESOURCE_FILTER__SERVICE_URL);
		createEAttribute(serviceResourceFilterEClass, SERVICE_RESOURCE_FILTER__EVERY_SERVICE);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__NAME);

		roleAssignmentEClass = createEClass(ROLE_ASSIGNMENT);
		createEAttribute(roleAssignmentEClass, ROLE_ASSIGNMENT__NAME);
		createEReference(roleAssignmentEClass, ROLE_ASSIGNMENT__USER);
		createEReference(roleAssignmentEClass, ROLE_ASSIGNMENT__ROLE);
		createEReference(roleAssignmentEClass, ROLE_ASSIGNMENT__USER_GROUP);
		createEAttribute(roleAssignmentEClass, ROLE_ASSIGNMENT__START_TIME);
		createEAttribute(roleAssignmentEClass, ROLE_ASSIGNMENT__END_TIME);
		createEAttribute(roleAssignmentEClass, ROLE_ASSIGNMENT__ASSIGNMENT_TIME);
		createEOperation(roleAssignmentEClass, ROLE_ASSIGNMENT___CHECK_ASSIGNED_ON_DATES__ROLEASSIGNMENT);
		createEOperation(roleAssignmentEClass, ROLE_ASSIGNMENT___CHECK_START_END_DATES__ROLEASSIGNMENT);

		userGroupEClass = createEClass(USER_GROUP);
		createEAttribute(userGroupEClass, USER_GROUP__NAME);
		createEReference(userGroupEClass, USER_GROUP__USERS);

		paaSageCredentialsEClass = createEClass(PAA_SAGE_CREDENTIALS);
		createEAttribute(paaSageCredentialsEClass, PAA_SAGE_CREDENTIALS__PASSWORD);

		// Create enums
		securityLevelEEnum = createEEnum(SECURITY_LEVEL);
		resourcePatternEEnum = createEEnum(RESOURCE_PATTERN);
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
		LocationPackage theLocationPackage = (LocationPackage)EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI);
		ProviderPackage theProviderPackage = (ProviderPackage)EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI);
		SecurityPackage theSecurityPackage = (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);
		RequirementPackage theRequirementPackage = (RequirementPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI);
		DeploymentPackage theDeploymentPackage = (DeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		organisationModelEClass.getESuperTypes().add(theCamelPackage.getModel());
		cloudCredentialsEClass.getESuperTypes().add(this.getCredentials());
		organisationEClass.getESuperTypes().add(this.getEntity());
		cloudProviderEClass.getESuperTypes().add(this.getOrganisation());
		userEClass.getESuperTypes().add(this.getEntity());
		informationResourceFilterEClass.getESuperTypes().add(this.getResourceFilter());
		serviceResourceFilterEClass.getESuperTypes().add(this.getResourceFilter());
		paaSageCredentialsEClass.getESuperTypes().add(this.getCredentials());

		// Initialize classes, features, and operations; add parameters
		initEClass(organisationModelEClass, OrganisationModel.class, "OrganisationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganisationModel_Organisation(), this.getOrganisation(), null, "organisation", null, 0, 1, OrganisationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisationModel_Provider(), this.getCloudProvider(), null, "provider", null, 0, 1, OrganisationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisationModel_ExternalIdentifiers(), this.getExternalIdentifier(), null, "externalIdentifiers", null, 0, -1, OrganisationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrganisationModel_Users(), this.getUser(), null, "users", null, 0, -1, OrganisationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrganisationModel_UserGroups(), this.getUserGroup(), null, "userGroups", null, 0, -1, OrganisationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrganisationModel_DataCentres(), this.getDataCenter(), null, "dataCentres", null, 0, -1, OrganisationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrganisationModel_Roles(), this.getRole(), null, "roles", null, 0, -1, OrganisationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrganisationModel_RoleAssigments(), this.getRoleAssignment(), null, "roleAssigments", null, 0, -1, OrganisationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrganisationModel_Permissions(), this.getPermission(), null, "permissions", null, 0, -1, OrganisationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOrganisationModel_SecurityLevel(), this.getSecurityLevel(), "securityLevel", null, 1, 1, OrganisationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisationModel_ResourceFilters(), this.getResourceFilter(), null, "resourceFilters", null, 0, -1, OrganisationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(credentialsEClass, Credentials.class, "Credentials", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cloudCredentialsEClass, CloudCredentials.class, "CloudCredentials", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudCredentials_Name(), ecorePackage.getEString(), "name", null, 1, 1, CloudCredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudCredentials_CloudProvider(), this.getCloudProvider(), null, "cloudProvider", null, 1, 1, CloudCredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudCredentials_SecurityGroup(), ecorePackage.getEString(), "securityGroup", null, 0, 1, CloudCredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudCredentials_PublicSSHKey(), ecorePackage.getEString(), "publicSSHKey", null, 0, 1, CloudCredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudCredentials_PrivateSSHKey(), ecorePackage.getEString(), "privateSSHKey", null, 0, 1, CloudCredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudCredentials_Username(), ecorePackage.getEString(), "username", null, 0, 1, CloudCredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudCredentials_Password(), ecorePackage.getEString(), "password", null, 0, 1, CloudCredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataCenterEClass, DataCenter.class, "DataCenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataCenter_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataCenter_CodeName(), ecorePackage.getEString(), "codeName", null, 1, 1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataCenter_Location(), theLocationPackage.getLocation(), null, "location", null, 1, 1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(organisationEClass, Organisation.class, "Organisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganisation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisation_Www(), ecorePackage.getEString(), "www", null, 0, 1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisation_PostalAddress(), ecorePackage.getEString(), "postalAddress", null, 0, 1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisation_Email(), ecorePackage.getEString(), "email", null, 1, 1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudProviderEClass, CloudProvider.class, "CloudProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudProvider_Public(), ecorePackage.getEBoolean(), "public", null, 0, 1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudProvider_SaaS(), ecorePackage.getEBoolean(), "SaaS", null, 0, 1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudProvider_PaaS(), ecorePackage.getEBoolean(), "PaaS", null, 0, 1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudProvider_IaaS(), ecorePackage.getEBoolean(), "IaaS", null, 0, 1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudProvider_ProviderModel(), theProviderPackage.getProviderModel(), null, "providerModel", null, 0, 1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudProvider_SecurityCapability(), theSecurityPackage.getSecurityCapability(), null, "securityCapability", null, 0, -1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Email(), ecorePackage.getEString(), "email", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Www(), ecorePackage.getEString(), "www", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_ExternalIdentifiers(), this.getExternalIdentifier(), null, "externalIdentifiers", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_RequirementModels(), theRequirementPackage.getRequirementModel(), null, "requirementModels", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_CloudCredentials(), this.getCloudCredentials(), null, "cloudCredentials", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_DeploymentModels(), theDeploymentPackage.getDeploymentModel(), null, "deploymentModels", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_PaasageCredentials(), this.getPaaSageCredentials(), null, "paasageCredentials", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalIdentifierEClass, ExternalIdentifier.class, "ExternalIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalIdentifier_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, ExternalIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalIdentifier_Description(), ecorePackage.getEString(), "description", null, 0, 1, ExternalIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPermission_Name(), ecorePackage.getEString(), "name", null, 1, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermission_Role(), this.getRole(), null, "role", null, 1, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermission_StartTime(), ecorePackage.getEDate(), "startTime", null, 1, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermission_EndTime(), ecorePackage.getEDate(), "endTime", null, 0, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermission_ResourceFilter(), this.getResourceFilter(), null, "resourceFilter", null, 1, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermission_Action(), theCamelPackage.getActionType(), "action", null, 1, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPermission__CheckStartEndDates__Permission(), ecorePackage.getEBoolean(), "checkStartEndDates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPermission(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceFilterEClass, ResourceFilter.class, "ResourceFilter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceFilter_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResourceFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceFilter_ResourcePattern(), this.getResourcePattern(), "resourcePattern", null, 1, 1, ResourceFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationResourceFilterEClass, InformationResourceFilter.class, "InformationResourceFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInformationResourceFilter_InformationResourcePath(), ecorePackage.getEString(), "informationResourcePath", null, 0, 1, InformationResourceFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformationResourceFilter_EveryInformationResource(), ecorePackage.getEBoolean(), "everyInformationResource", null, 1, 1, InformationResourceFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceResourceFilterEClass, ServiceResourceFilter.class, "ServiceResourceFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceResourceFilter_ServiceURL(), ecorePackage.getEString(), "serviceURL", null, 0, 1, ServiceResourceFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceResourceFilter_EveryService(), ecorePackage.getEBoolean(), "everyService", null, 1, 1, ServiceResourceFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleAssignmentEClass, RoleAssignment.class, "RoleAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleAssignment_Name(), ecorePackage.getEString(), "name", null, 1, 1, RoleAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleAssignment_User(), this.getUser(), null, "user", null, 0, 1, RoleAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleAssignment_Role(), this.getRole(), null, "role", null, 1, 1, RoleAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleAssignment_UserGroup(), this.getUserGroup(), null, "userGroup", null, 0, 1, RoleAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleAssignment_StartTime(), ecorePackage.getEDate(), "startTime", null, 0, 1, RoleAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleAssignment_EndTime(), ecorePackage.getEDate(), "endTime", null, 0, 1, RoleAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleAssignment_AssignmentTime(), ecorePackage.getEDate(), "assignmentTime", null, 1, 1, RoleAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRoleAssignment__CheckAssignedOnDates__RoleAssignment(), ecorePackage.getEBoolean(), "checkAssignedOnDates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRoleAssignment(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRoleAssignment__CheckStartEndDates__RoleAssignment(), ecorePackage.getEBoolean(), "checkStartEndDates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRoleAssignment(), "this_", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userGroupEClass, UserGroup.class, "UserGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserGroup_Name(), ecorePackage.getEString(), "name", null, 1, 1, UserGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserGroup_Users(), this.getUser(), null, "users", null, 1, -1, UserGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paaSageCredentialsEClass, PaaSageCredentials.class, "PaaSageCredentials", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaaSageCredentials_Password(), ecorePackage.getEString(), "password", null, 1, 1, PaaSageCredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(securityLevelEEnum, SecurityLevel.class, "SecurityLevel");
		addEEnumLiteral(securityLevelEEnum, SecurityLevel.LOW);
		addEEnumLiteral(securityLevelEEnum, SecurityLevel.MEDIUM);
		addEEnumLiteral(securityLevelEEnum, SecurityLevel.HIGH);

		initEEnum(resourcePatternEEnum, ResourcePattern.class, "ResourcePattern");
		addEEnumLiteral(resourcePatternEEnum, ResourcePattern.EXACT);
		addEEnumLiteral(resourcePatternEEnum, ResourcePattern.TREE);

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
		  (organisationModelEClass, 
		   source, 
		   new String[] {
			 "constraints", "org_model_provider_or_organisation_supplied"
		   });	
		addAnnotation
		  (dataCenterEClass, 
		   source, 
		   new String[] {
			 "constraints", "unique_datacenter_per_provider no_datacenter_same_location_same_provider"
		   });	
		addAnnotation
		  (permissionEClass, 
		   source, 
		   new String[] {
			 "constraints", "permission_valid_actions"
		   });	
		addAnnotation
		  (informationResourceFilterEClass, 
		   source, 
		   new String[] {
			 "constraints", "information_resource_filter_validity"
		   });	
		addAnnotation
		  (serviceResourceFilterEClass, 
		   source, 
		   new String[] {
			 "constraints", "service_resource_filter_validity"
		   });	
		addAnnotation
		  (roleAssignmentEClass, 
		   source, 
		   new String[] {
			 "constraints", "role_assignment_at_least_user_or_group same_role_concurrent_assignments"
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
		  (organisationModelEClass, 
		   source, 
		   new String[] {
			 "org_model_provider_or_organisation_supplied", "Tuple {\n\tmessage : String = \'The OrganisationModel: \' + self.name +\n\t\t\t\t\t\' should map to one and only organisation or cloud provider\',\n\tstatus : Boolean = provider <> null or organisation <> null\n}.status"
		   });	
		addAnnotation
		  (dataCenterEClass, 
		   source, 
		   new String[] {
			 "unique_datacenter_per_provider", "Tuple {\n\tmessage : String = \'There exist data centers of cloud provider: \' + oclContainer().oclAsType(OrganisationModel).provider.name +\n\t\t\t\t\t\' which have the same name or the same code name\',\n\tstatus : Boolean = DataCenter.allInstances()\n\t\t\t\t\t->forAll(p1, p2 | p1 <> p2 and p1.oclContainer().oclAsType(OrganisationModel).provider = p2.oclContainer().oclAsType(OrganisationModel).provider implies p1.name <> p2.name and p1.codeName <>\n\t\t\t\t\t\tp2.codeName)\n}.status",
			 "no_datacenter_same_location_same_provider", "Tuple {\n\tmessage : String = \'There exist data centers of cloud provider\' +\n\t\t\t\t\toclContainer().oclAsType(OrganisationModel).provider.name + \' which are on the same fine-grained location\',\n\tstatus : Boolean = DataCenter.allInstances()\n\t\t\t\t\t->forAll(p1, p2 | p1 <> p2 and p1.name <> p2.name and p1.oclContainer().oclAsType(OrganisationModel).provider = p2.oclContainer().oclAsType(OrganisationModel).provider implies p1.location <>\n\t\t\t\t\t\tp2.location)\n}.status"
		   });	
		addAnnotation
		  (permissionEClass, 
		   source, 
		   new String[] {
			 "permission_valid_actions", "Tuple {\n\tmessage : String = \'Wrong actions were identified for resource:\' + self.resourceFilter.name +\n\t\t\t\t\t\' in the context of Permission: \' + self.name,\n\tstatus : Boolean = self.action = camel::ActionType::READ or self.action =\n\t\t\t\t\tcamel::ActionType::WRITE\n}.status"
		   });	
		addAnnotation
		  (informationResourceFilterEClass, 
		   source, 
		   new String[] {
			 "information_resource_filter_validity", "Tuple {\n\tmessage : String = \'InformationResourceFilter: \' + self.name +\n\t\t\t\t\t\' is not valid as both its own attributes were set\',\n\tstatus : Boolean = everyInformationResource = true implies\n\t\t\t\t\tinformationResourcePath = null\n}.status"
		   });	
		addAnnotation
		  (serviceResourceFilterEClass, 
		   source, 
		   new String[] {
			 "service_resource_filter_validity", "Tuple {\n\tmessage : String = \'ServiceResourceFilter: \' + self.name +\n\t\t\t\t\t\' is not valid as both its own attributes were set\',\n\tstatus : Boolean = everyService = true implies serviceURL = null\n}.status"
		   });	
		addAnnotation
		  (roleAssignmentEClass, 
		   source, 
		   new String[] {
			 "role_assignment_at_least_user_or_group", "Tuple {\n\tmessage : String = \'There is no user or user group associated to RoleAssigment:\' +\n\t\t\t\t\tself.name,\n\tstatus : Boolean = self.user <> null or self.userGroup <> null\n}.status",
			 "same_role_concurrent_assignments", "Tuple {\n\tmessage : String = \'There are two or more role assignments which are odentical, i.e., refer to the same organisation, user/user group and role\',\n\tstatus : Boolean = RoleAssignment.allInstances()\n\t\t\t\t\t->forAll(p1, p2 | p1 <> p2 and ((p1.user <> null and p2.user <> null and p1.user = p2.user) or (p1.userGroup <>\n\t\t\t\t\t\tnull and p2.userGroup <> null and p1.userGroup = p2.userGroup)) implies p1.role <> p2.role)\n}.status"
		   });
	}

} //OrganisationPackageImpl
