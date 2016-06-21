/**
 */
package eu.paasage.camel.deployment.impl;

import eu.paasage.camel.CamelPackage;

import eu.paasage.camel.deployment.Communication;
import eu.paasage.camel.deployment.CommunicationInstance;
import eu.paasage.camel.deployment.CommunicationPort;
import eu.paasage.camel.deployment.CommunicationPortInstance;
import eu.paasage.camel.deployment.CommunicationType;
import eu.paasage.camel.deployment.Component;
import eu.paasage.camel.deployment.ComponentInstance;
import eu.paasage.camel.deployment.Configuration;
import eu.paasage.camel.deployment.DeploymentElement;
import eu.paasage.camel.deployment.DeploymentFactory;
import eu.paasage.camel.deployment.DeploymentModel;
import eu.paasage.camel.deployment.DeploymentPackage;
import eu.paasage.camel.deployment.Hosting;
import eu.paasage.camel.deployment.HostingInstance;
import eu.paasage.camel.deployment.HostingPort;
import eu.paasage.camel.deployment.HostingPortInstance;
import eu.paasage.camel.deployment.InternalComponent;
import eu.paasage.camel.deployment.InternalComponentInstance;
import eu.paasage.camel.deployment.ProvidedCommunication;
import eu.paasage.camel.deployment.ProvidedCommunicationInstance;
import eu.paasage.camel.deployment.ProvidedHost;
import eu.paasage.camel.deployment.ProvidedHostInstance;
import eu.paasage.camel.deployment.RequiredCommunication;
import eu.paasage.camel.deployment.RequiredCommunicationInstance;
import eu.paasage.camel.deployment.RequiredHost;
import eu.paasage.camel.deployment.RequiredHostInstance;
import eu.paasage.camel.deployment.VMInstance;
import eu.paasage.camel.deployment.VMRequirementSet;

import eu.paasage.camel.deployment.util.DeploymentValidator;

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
public class DeploymentPackageImpl extends EPackageImpl implements DeploymentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmRequirementSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostingPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedHostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredHostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalComponentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationPortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedCommunicationInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredCommunicationInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostingInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostingPortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedHostInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredHostInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationTypeEEnum = null;

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
	 * @see eu.paasage.camel.deployment.DeploymentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeploymentPackageImpl() {
		super(eNS_URI, DeploymentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DeploymentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeploymentPackage init() {
		if (isInited) return (DeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI);

		// Obtain or create and register package
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DeploymentPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CamelPackageImpl theCamelPackage = (CamelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) instanceof CamelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) : CamelPackage.eINSTANCE);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) instanceof ExecutionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) : ExecutionPackage.eINSTANCE);
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
		theDeploymentPackage.createPackageContents();
		theCamelPackage.createPackageContents();
		theExecutionPackage.createPackageContents();
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
		theDeploymentPackage.initializePackageContents();
		theCamelPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
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
			(theDeploymentPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DeploymentValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDeploymentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeploymentPackage.eNS_URI, theDeploymentPackage);
		return theDeploymentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentElement() {
		return deploymentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentElement_Name() {
		return (EAttribute)deploymentElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentModel() {
		return deploymentModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentModel_InternalComponents() {
		return (EReference)deploymentModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentModel_InternalComponentInstances() {
		return (EReference)deploymentModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentModel_Vms() {
		return (EReference)deploymentModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentModel_VmInstances() {
		return (EReference)deploymentModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentModel_Communications() {
		return (EReference)deploymentModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentModel_CommunicationInstances() {
		return (EReference)deploymentModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentModel_Hostings() {
		return (EReference)deploymentModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentModel_HostingInstances() {
		return (EReference)deploymentModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentModel_VmRequirementSets() {
		return (EReference)deploymentModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentModel_GlobalVMRequirementSet() {
		return (EReference)deploymentModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ProvidedCommunications() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ProvidedHosts() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Configurations() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalComponent() {
		return internalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalComponent_CompositeInternalComponents() {
		return (EReference)internalComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalComponent_RequiredCommunications() {
		return (EReference)internalComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalComponent_RequiredHost() {
		return (EReference)internalComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalComponent_Version() {
		return (EAttribute)internalComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInternalComponent__Contains__InternalComponent_InternalComponent() {
		return internalComponentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVM() {
		return vmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVM_VmRequirementSet() {
		return (EReference)vmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMRequirementSet() {
		return vmRequirementSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMRequirementSet_Name() {
		return (EAttribute)vmRequirementSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMRequirementSet_LocationRequirement() {
		return (EReference)vmRequirementSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMRequirementSet_ProviderRequirement() {
		return (EReference)vmRequirementSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMRequirementSet_QualitativeHardwareRequirement() {
		return (EReference)vmRequirementSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMRequirementSet_QuantitativeHardwareRequirement() {
		return (EReference)vmRequirementSetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMRequirementSet_OsOrImageRequirement() {
		return (EReference)vmRequirementSetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_DownloadCommand() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_UploadCommand() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_InstallCommand() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_ConfigureCommand() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_StartCommand() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_StopCommand() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunication() {
		return communicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunication_Type() {
		return (EAttribute)communicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_ProvidedCommunication() {
		return (EReference)communicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_RequiredCommunication() {
		return (EReference)communicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_ProvidedPortConfiguration() {
		return (EReference)communicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_RequiredPortConfiguration() {
		return (EReference)communicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationPort() {
		return communicationPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationPort_PortNumber() {
		return (EAttribute)communicationPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedCommunication() {
		return providedCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredCommunication() {
		return requiredCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredCommunication_IsMandatory() {
		return (EAttribute)requiredCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHosting() {
		return hostingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHosting_ProvidedHost() {
		return (EReference)hostingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHosting_RequiredHost() {
		return (EReference)hostingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHosting_ProvidedHostConfiguration() {
		return (EReference)hostingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHosting_RequiredHostConfiguration() {
		return (EReference)hostingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostingPort() {
		return hostingPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedHost() {
		return providedHostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredHost() {
		return requiredHostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstance() {
		return componentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Type() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_ProvidedCommunicationInstances() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_ProvidedHostInstances() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInstance_InstantiatedOn() {
		return (EAttribute)componentInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInstance_DestroyedOn() {
		return (EAttribute)componentInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalComponentInstance() {
		return internalComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalComponentInstance_RequiredCommunicationInstances() {
		return (EReference)internalComponentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalComponentInstance_RequiredHostInstance() {
		return (EReference)internalComponentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMInstance() {
		return vmInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMInstance_VmType() {
		return (EReference)vmInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMInstance_VmTypeValue() {
		return (EReference)vmInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMInstance_Ip() {
		return (EAttribute)vmInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVMInstance__CheckDates__VMInstance() {
		return vmInstanceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationInstance() {
		return communicationInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationInstance_Type() {
		return (EReference)communicationInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationInstance_ProvidedCommunicationInstance() {
		return (EReference)communicationInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationInstance_RequiredCommunicationInstance() {
		return (EReference)communicationInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationPortInstance() {
		return communicationPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationPortInstance_Type() {
		return (EReference)communicationPortInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedCommunicationInstance() {
		return providedCommunicationInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredCommunicationInstance() {
		return requiredCommunicationInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostingInstance() {
		return hostingInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostingInstance_Type() {
		return (EReference)hostingInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostingInstance_ProvidedHostInstance() {
		return (EReference)hostingInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostingInstance_RequiredHostInstance() {
		return (EReference)hostingInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostingPortInstance() {
		return hostingPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostingPortInstance_Type() {
		return (EReference)hostingPortInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedHostInstance() {
		return providedHostInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredHostInstance() {
		return requiredHostInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommunicationType() {
		return communicationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentFactory getDeploymentFactory() {
		return (DeploymentFactory)getEFactoryInstance();
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
		deploymentElementEClass = createEClass(DEPLOYMENT_ELEMENT);
		createEAttribute(deploymentElementEClass, DEPLOYMENT_ELEMENT__NAME);

		deploymentModelEClass = createEClass(DEPLOYMENT_MODEL);
		createEReference(deploymentModelEClass, DEPLOYMENT_MODEL__INTERNAL_COMPONENTS);
		createEReference(deploymentModelEClass, DEPLOYMENT_MODEL__INTERNAL_COMPONENT_INSTANCES);
		createEReference(deploymentModelEClass, DEPLOYMENT_MODEL__VMS);
		createEReference(deploymentModelEClass, DEPLOYMENT_MODEL__VM_INSTANCES);
		createEReference(deploymentModelEClass, DEPLOYMENT_MODEL__COMMUNICATIONS);
		createEReference(deploymentModelEClass, DEPLOYMENT_MODEL__COMMUNICATION_INSTANCES);
		createEReference(deploymentModelEClass, DEPLOYMENT_MODEL__HOSTINGS);
		createEReference(deploymentModelEClass, DEPLOYMENT_MODEL__HOSTING_INSTANCES);
		createEReference(deploymentModelEClass, DEPLOYMENT_MODEL__VM_REQUIREMENT_SETS);
		createEReference(deploymentModelEClass, DEPLOYMENT_MODEL__GLOBAL_VM_REQUIREMENT_SET);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__PROVIDED_COMMUNICATIONS);
		createEReference(componentEClass, COMPONENT__PROVIDED_HOSTS);
		createEReference(componentEClass, COMPONENT__CONFIGURATIONS);

		internalComponentEClass = createEClass(INTERNAL_COMPONENT);
		createEReference(internalComponentEClass, INTERNAL_COMPONENT__COMPOSITE_INTERNAL_COMPONENTS);
		createEReference(internalComponentEClass, INTERNAL_COMPONENT__REQUIRED_COMMUNICATIONS);
		createEReference(internalComponentEClass, INTERNAL_COMPONENT__REQUIRED_HOST);
		createEAttribute(internalComponentEClass, INTERNAL_COMPONENT__VERSION);
		createEOperation(internalComponentEClass, INTERNAL_COMPONENT___CONTAINS__INTERNALCOMPONENT_INTERNALCOMPONENT);

		vmEClass = createEClass(VM);
		createEReference(vmEClass, VM__VM_REQUIREMENT_SET);

		vmRequirementSetEClass = createEClass(VM_REQUIREMENT_SET);
		createEAttribute(vmRequirementSetEClass, VM_REQUIREMENT_SET__NAME);
		createEReference(vmRequirementSetEClass, VM_REQUIREMENT_SET__LOCATION_REQUIREMENT);
		createEReference(vmRequirementSetEClass, VM_REQUIREMENT_SET__PROVIDER_REQUIREMENT);
		createEReference(vmRequirementSetEClass, VM_REQUIREMENT_SET__QUALITATIVE_HARDWARE_REQUIREMENT);
		createEReference(vmRequirementSetEClass, VM_REQUIREMENT_SET__QUANTITATIVE_HARDWARE_REQUIREMENT);
		createEReference(vmRequirementSetEClass, VM_REQUIREMENT_SET__OS_OR_IMAGE_REQUIREMENT);

		configurationEClass = createEClass(CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__DOWNLOAD_COMMAND);
		createEAttribute(configurationEClass, CONFIGURATION__UPLOAD_COMMAND);
		createEAttribute(configurationEClass, CONFIGURATION__INSTALL_COMMAND);
		createEAttribute(configurationEClass, CONFIGURATION__CONFIGURE_COMMAND);
		createEAttribute(configurationEClass, CONFIGURATION__START_COMMAND);
		createEAttribute(configurationEClass, CONFIGURATION__STOP_COMMAND);

		communicationEClass = createEClass(COMMUNICATION);
		createEAttribute(communicationEClass, COMMUNICATION__TYPE);
		createEReference(communicationEClass, COMMUNICATION__PROVIDED_COMMUNICATION);
		createEReference(communicationEClass, COMMUNICATION__REQUIRED_COMMUNICATION);
		createEReference(communicationEClass, COMMUNICATION__PROVIDED_PORT_CONFIGURATION);
		createEReference(communicationEClass, COMMUNICATION__REQUIRED_PORT_CONFIGURATION);

		communicationPortEClass = createEClass(COMMUNICATION_PORT);
		createEAttribute(communicationPortEClass, COMMUNICATION_PORT__PORT_NUMBER);

		providedCommunicationEClass = createEClass(PROVIDED_COMMUNICATION);

		requiredCommunicationEClass = createEClass(REQUIRED_COMMUNICATION);
		createEAttribute(requiredCommunicationEClass, REQUIRED_COMMUNICATION__IS_MANDATORY);

		hostingEClass = createEClass(HOSTING);
		createEReference(hostingEClass, HOSTING__PROVIDED_HOST);
		createEReference(hostingEClass, HOSTING__REQUIRED_HOST);
		createEReference(hostingEClass, HOSTING__PROVIDED_HOST_CONFIGURATION);
		createEReference(hostingEClass, HOSTING__REQUIRED_HOST_CONFIGURATION);

		hostingPortEClass = createEClass(HOSTING_PORT);

		providedHostEClass = createEClass(PROVIDED_HOST);

		requiredHostEClass = createEClass(REQUIRED_HOST);

		componentInstanceEClass = createEClass(COMPONENT_INSTANCE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__TYPE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__PROVIDED_COMMUNICATION_INSTANCES);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__PROVIDED_HOST_INSTANCES);
		createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__INSTANTIATED_ON);
		createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__DESTROYED_ON);

		internalComponentInstanceEClass = createEClass(INTERNAL_COMPONENT_INSTANCE);
		createEReference(internalComponentInstanceEClass, INTERNAL_COMPONENT_INSTANCE__REQUIRED_COMMUNICATION_INSTANCES);
		createEReference(internalComponentInstanceEClass, INTERNAL_COMPONENT_INSTANCE__REQUIRED_HOST_INSTANCE);

		vmInstanceEClass = createEClass(VM_INSTANCE);
		createEReference(vmInstanceEClass, VM_INSTANCE__VM_TYPE);
		createEReference(vmInstanceEClass, VM_INSTANCE__VM_TYPE_VALUE);
		createEAttribute(vmInstanceEClass, VM_INSTANCE__IP);
		createEOperation(vmInstanceEClass, VM_INSTANCE___CHECK_DATES__VMINSTANCE);

		communicationInstanceEClass = createEClass(COMMUNICATION_INSTANCE);
		createEReference(communicationInstanceEClass, COMMUNICATION_INSTANCE__TYPE);
		createEReference(communicationInstanceEClass, COMMUNICATION_INSTANCE__PROVIDED_COMMUNICATION_INSTANCE);
		createEReference(communicationInstanceEClass, COMMUNICATION_INSTANCE__REQUIRED_COMMUNICATION_INSTANCE);

		communicationPortInstanceEClass = createEClass(COMMUNICATION_PORT_INSTANCE);
		createEReference(communicationPortInstanceEClass, COMMUNICATION_PORT_INSTANCE__TYPE);

		providedCommunicationInstanceEClass = createEClass(PROVIDED_COMMUNICATION_INSTANCE);

		requiredCommunicationInstanceEClass = createEClass(REQUIRED_COMMUNICATION_INSTANCE);

		hostingInstanceEClass = createEClass(HOSTING_INSTANCE);
		createEReference(hostingInstanceEClass, HOSTING_INSTANCE__TYPE);
		createEReference(hostingInstanceEClass, HOSTING_INSTANCE__PROVIDED_HOST_INSTANCE);
		createEReference(hostingInstanceEClass, HOSTING_INSTANCE__REQUIRED_HOST_INSTANCE);

		hostingPortInstanceEClass = createEClass(HOSTING_PORT_INSTANCE);
		createEReference(hostingPortInstanceEClass, HOSTING_PORT_INSTANCE__TYPE);

		providedHostInstanceEClass = createEClass(PROVIDED_HOST_INSTANCE);

		requiredHostInstanceEClass = createEClass(REQUIRED_HOST_INSTANCE);

		// Create enums
		communicationTypeEEnum = createEEnum(COMMUNICATION_TYPE);
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
		ProviderPackage theProviderPackage = (ProviderPackage)EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI);
		TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		deploymentModelEClass.getESuperTypes().add(theCamelPackage.getModel());
		componentEClass.getESuperTypes().add(this.getDeploymentElement());
		internalComponentEClass.getESuperTypes().add(this.getComponent());
		vmEClass.getESuperTypes().add(this.getComponent());
		configurationEClass.getESuperTypes().add(this.getDeploymentElement());
		communicationEClass.getESuperTypes().add(this.getDeploymentElement());
		communicationPortEClass.getESuperTypes().add(this.getDeploymentElement());
		providedCommunicationEClass.getESuperTypes().add(this.getCommunicationPort());
		requiredCommunicationEClass.getESuperTypes().add(this.getCommunicationPort());
		hostingEClass.getESuperTypes().add(this.getDeploymentElement());
		hostingPortEClass.getESuperTypes().add(this.getDeploymentElement());
		providedHostEClass.getESuperTypes().add(this.getHostingPort());
		requiredHostEClass.getESuperTypes().add(this.getHostingPort());
		componentInstanceEClass.getESuperTypes().add(this.getDeploymentElement());
		internalComponentInstanceEClass.getESuperTypes().add(this.getComponentInstance());
		vmInstanceEClass.getESuperTypes().add(this.getComponentInstance());
		communicationInstanceEClass.getESuperTypes().add(this.getDeploymentElement());
		communicationPortInstanceEClass.getESuperTypes().add(this.getDeploymentElement());
		providedCommunicationInstanceEClass.getESuperTypes().add(this.getCommunicationPortInstance());
		requiredCommunicationInstanceEClass.getESuperTypes().add(this.getCommunicationPortInstance());
		hostingInstanceEClass.getESuperTypes().add(this.getDeploymentElement());
		hostingPortInstanceEClass.getESuperTypes().add(this.getDeploymentElement());
		providedHostInstanceEClass.getESuperTypes().add(this.getHostingPortInstance());
		requiredHostInstanceEClass.getESuperTypes().add(this.getHostingPortInstance());

		// Initialize classes, features, and operations; add parameters
		initEClass(deploymentElementEClass, DeploymentElement.class, "DeploymentElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, DeploymentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentModelEClass, DeploymentModel.class, "DeploymentModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentModel_InternalComponents(), this.getInternalComponent(), null, "internalComponents", null, 0, -1, DeploymentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentModel_InternalComponentInstances(), this.getInternalComponentInstance(), null, "internalComponentInstances", null, 0, -1, DeploymentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentModel_Vms(), this.getVM(), null, "vms", null, 0, -1, DeploymentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentModel_VmInstances(), this.getVMInstance(), null, "vmInstances", null, 0, -1, DeploymentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentModel_Communications(), this.getCommunication(), null, "communications", null, 0, -1, DeploymentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentModel_CommunicationInstances(), this.getCommunicationInstance(), null, "communicationInstances", null, 0, -1, DeploymentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentModel_Hostings(), this.getHosting(), null, "hostings", null, 0, -1, DeploymentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentModel_HostingInstances(), this.getHostingInstance(), null, "hostingInstances", null, 0, -1, DeploymentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentModel_VmRequirementSets(), this.getVMRequirementSet(), null, "vmRequirementSets", null, 0, -1, DeploymentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentModel_GlobalVMRequirementSet(), this.getVMRequirementSet(), null, "globalVMRequirementSet", null, 0, 1, DeploymentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_ProvidedCommunications(), this.getProvidedCommunication(), null, "providedCommunications", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ProvidedHosts(), this.getProvidedHost(), null, "providedHosts", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Configurations(), this.getConfiguration(), null, "configurations", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalComponentEClass, InternalComponent.class, "InternalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalComponent_CompositeInternalComponents(), this.getInternalComponent(), null, "compositeInternalComponents", null, 0, -1, InternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalComponent_RequiredCommunications(), this.getRequiredCommunication(), null, "requiredCommunications", null, 0, -1, InternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalComponent_RequiredHost(), this.getRequiredHost(), null, "requiredHost", null, 0, 1, InternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalComponent_Version(), ecorePackage.getEString(), "version", null, 0, 1, InternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getInternalComponent__Contains__InternalComponent_InternalComponent(), ecorePackage.getEBoolean(), "contains", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInternalComponent(), "ic", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInternalComponent(), "rc", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vmEClass, eu.paasage.camel.deployment.VM.class, "VM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVM_VmRequirementSet(), this.getVMRequirementSet(), null, "vmRequirementSet", null, 0, 1, eu.paasage.camel.deployment.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmRequirementSetEClass, VMRequirementSet.class, "VMRequirementSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVMRequirementSet_Name(), ecorePackage.getEString(), "name", null, 1, 1, VMRequirementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVMRequirementSet_LocationRequirement(), theRequirementPackage.getLocationRequirement(), null, "locationRequirement", null, 0, 1, VMRequirementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVMRequirementSet_ProviderRequirement(), theRequirementPackage.getProviderRequirement(), null, "providerRequirement", null, 0, 1, VMRequirementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVMRequirementSet_QualitativeHardwareRequirement(), theRequirementPackage.getQualitativeHardwareRequirement(), null, "qualitativeHardwareRequirement", null, 0, 1, VMRequirementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVMRequirementSet_QuantitativeHardwareRequirement(), theRequirementPackage.getQuantitativeHardwareRequirement(), null, "quantitativeHardwareRequirement", null, 0, 1, VMRequirementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVMRequirementSet_OsOrImageRequirement(), theRequirementPackage.getOSOrImageRequirement(), null, "osOrImageRequirement", null, 0, 1, VMRequirementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguration_DownloadCommand(), ecorePackage.getEString(), "downloadCommand", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_UploadCommand(), ecorePackage.getEString(), "uploadCommand", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_InstallCommand(), ecorePackage.getEString(), "installCommand", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_ConfigureCommand(), ecorePackage.getEString(), "configureCommand", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_StartCommand(), ecorePackage.getEString(), "startCommand", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_StopCommand(), ecorePackage.getEString(), "stopCommand", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationEClass, Communication.class, "Communication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunication_Type(), this.getCommunicationType(), "type", "ANY", 1, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunication_ProvidedCommunication(), this.getProvidedCommunication(), null, "providedCommunication", null, 1, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunication_RequiredCommunication(), this.getRequiredCommunication(), null, "requiredCommunication", null, 1, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunication_ProvidedPortConfiguration(), this.getConfiguration(), null, "providedPortConfiguration", null, 0, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunication_RequiredPortConfiguration(), this.getConfiguration(), null, "requiredPortConfiguration", null, 0, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationPortEClass, CommunicationPort.class, "CommunicationPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationPort_PortNumber(), ecorePackage.getEInt(), "portNumber", null, 0, 1, CommunicationPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedCommunicationEClass, ProvidedCommunication.class, "ProvidedCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiredCommunicationEClass, RequiredCommunication.class, "RequiredCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredCommunication_IsMandatory(), ecorePackage.getEBoolean(), "isMandatory", null, 1, 1, RequiredCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostingEClass, Hosting.class, "Hosting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHosting_ProvidedHost(), this.getProvidedHost(), null, "providedHost", null, 1, 1, Hosting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHosting_RequiredHost(), this.getRequiredHost(), null, "requiredHost", null, 1, 1, Hosting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHosting_ProvidedHostConfiguration(), this.getConfiguration(), null, "providedHostConfiguration", null, 0, 1, Hosting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHosting_RequiredHostConfiguration(), this.getConfiguration(), null, "requiredHostConfiguration", null, 0, 1, Hosting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostingPortEClass, HostingPort.class, "HostingPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providedHostEClass, ProvidedHost.class, "ProvidedHost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiredHostEClass, RequiredHost.class, "RequiredHost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentInstanceEClass, ComponentInstance.class, "ComponentInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstance_Type(), this.getComponent(), null, "type", null, 1, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_ProvidedCommunicationInstances(), this.getProvidedCommunicationInstance(), null, "providedCommunicationInstances", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_ProvidedHostInstances(), this.getProvidedHostInstance(), null, "providedHostInstances", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInstance_InstantiatedOn(), ecorePackage.getEDate(), "instantiatedOn", null, 0, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInstance_DestroyedOn(), ecorePackage.getEDate(), "destroyedOn", null, 0, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalComponentInstanceEClass, InternalComponentInstance.class, "InternalComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalComponentInstance_RequiredCommunicationInstances(), this.getRequiredCommunicationInstance(), null, "requiredCommunicationInstances", null, 0, -1, InternalComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalComponentInstance_RequiredHostInstance(), this.getRequiredHostInstance(), null, "requiredHostInstance", null, 0, 1, InternalComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmInstanceEClass, VMInstance.class, "VMInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVMInstance_VmType(), theProviderPackage.getAttribute(), null, "vmType", null, 0, 1, VMInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVMInstance_VmTypeValue(), theTypePackage.getSingleValue(), null, "vmTypeValue", null, 0, 1, VMInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVMInstance_Ip(), ecorePackage.getEString(), "ip", null, 0, 1, VMInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVMInstance__CheckDates__VMInstance(), ecorePackage.getEBoolean(), "checkDates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVMInstance(), "vm", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(communicationInstanceEClass, CommunicationInstance.class, "CommunicationInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationInstance_Type(), this.getCommunication(), null, "type", null, 1, 1, CommunicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationInstance_ProvidedCommunicationInstance(), this.getProvidedCommunicationInstance(), null, "providedCommunicationInstance", null, 1, 1, CommunicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationInstance_RequiredCommunicationInstance(), this.getRequiredCommunicationInstance(), null, "requiredCommunicationInstance", null, 1, 1, CommunicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationPortInstanceEClass, CommunicationPortInstance.class, "CommunicationPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationPortInstance_Type(), this.getCommunicationPort(), null, "type", null, 1, 1, CommunicationPortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedCommunicationInstanceEClass, ProvidedCommunicationInstance.class, "ProvidedCommunicationInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiredCommunicationInstanceEClass, RequiredCommunicationInstance.class, "RequiredCommunicationInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hostingInstanceEClass, HostingInstance.class, "HostingInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHostingInstance_Type(), this.getHosting(), null, "type", null, 1, 1, HostingInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHostingInstance_ProvidedHostInstance(), this.getProvidedHostInstance(), null, "providedHostInstance", null, 1, 1, HostingInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHostingInstance_RequiredHostInstance(), this.getRequiredHostInstance(), null, "requiredHostInstance", null, 1, 1, HostingInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostingPortInstanceEClass, HostingPortInstance.class, "HostingPortInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHostingPortInstance_Type(), this.getHostingPort(), null, "type", null, 1, 1, HostingPortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedHostInstanceEClass, ProvidedHostInstance.class, "ProvidedHostInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiredHostInstanceEClass, RequiredHostInstance.class, "RequiredHostInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(communicationTypeEEnum, CommunicationType.class, "CommunicationType");
		addEEnumLiteral(communicationTypeEEnum, CommunicationType.ANY);
		addEEnumLiteral(communicationTypeEEnum, CommunicationType.LOCAL);
		addEEnumLiteral(communicationTypeEEnum, CommunicationType.REMOTE);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// teneo.jpa
		createTeneoAnnotations();
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
		  (internalComponentEClass, 
		   source, 
		   new String[] {
			 "constraints", "no_recursion_in_parts_of_internal_component"
		   });	
		addAnnotation
		  (vmRequirementSetEClass, 
		   source, 
		   new String[] {
			 "constraints", "at_least_one_alternative_in_vm_req_set"
		   });	
		addAnnotation
		  (communicationEClass, 
		   source, 
		   new String[] {
			 "constraints", "local_communication_both_comp_same_vm"
		   });	
		addAnnotation
		  (componentInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "component_port_instances_of_correct_type"
		   });	
		addAnnotation
		  (internalComponentInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "internal_component_port_instances_of_correct_type"
		   });	
		addAnnotation
		  (vmInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "correct_type_for_vm_instance correct_vm_type_value_in_vm_instance"
		   });	
		addAnnotation
		  (communicationInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "communication_instance_correct_port_instances"
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
		  (internalComponentEClass, 
		   source, 
		   new String[] {
			 "no_recursion_in_parts_of_internal_component", "Tuple {\n\tmessage : String = \'InternalComponent: \' + self.name +\n\t\t\t\t\' should not be recursively contained by itself via the compositeInternalComponent association\',\n\tstatus : Boolean = not\n\t\t\t\t(self.contains(self, self))\n}.status"
		   });	
		addAnnotation
		  (getInternalComponent__Contains__InternalComponent_InternalComponent(), 
		   source, 
		   new String[] {
			 "body", "ic.compositeInternalComponents\n\t\t\t\t\t->exists(p | p.name = rc.name or p.contains(p, rc))"
		   });	
		addAnnotation
		  (vmRequirementSetEClass, 
		   source, 
		   new String[] {
			 "at_least_one_alternative_in_vm_req_set", "Tuple {\n\tmessage : String = \'VMRequirementSet: \' + self.name +\n\t\t\t\t\' should include the specification of at least one requirement\',\n\tstatus : Boolean = (locationRequirement <> null or\n\t\t\t\tproviderRequirement <> null or osOrImageRequirement <> null or qualitativeHardwareRequirement <> null or\n\t\t\t\tquantitativeHardwareRequirement <> null)\n}.status"
		   });	
		addAnnotation
		  (communicationEClass, 
		   source, 
		   new String[] {
			 "local_communication_both_comp_same_vm", "Tuple {\n\tmessage : String = \'The communication:\' + self.name +\n\t\t\t\t\' is local but the communicating components are mapped to different VMs\',\n\tstatus : Boolean = let firstOwner : Component =\n\t\t\t\tself.providedCommunication.oclContainer().oclContainer().oclAsType(DeploymentModel).hostings\n\t\t\t\t->select(p | p.requiredHost.oclContainer() = self.providedCommunication.oclContainer())\n\t\t\t\t->first().providedHost.oclContainer() , secondOwner : Component =\n\t\t\t\tself.requiredCommunication.oclContainer().oclContainer().oclAsType(DeploymentModel).hostings\n\t\t\t\t->select(q | q.requiredHost.oclContainer() = self.requiredCommunication.oclContainer())\n\t\t\t\t->first().providedHost.oclContainer()\n\t\t\tin (self.type = CommunicationType::LOCAL) implies (if (firstOwner.oclIsTypeOf(InternalComponent) and\n\t\t\t\t\tsecondOwner.oclIsTypeOf(InternalComponent))\n\t\t\t\tthen firstOwner.oclAsType(InternalComponent).oclContainer().oclAsType(DeploymentModel).hostings\n\t\t\t\t\t->select(p | p.requiredHost.oclContainer() = firstOwner)\n\t\t\t\t\t->first().providedHost.oclContainer() =\n\t\t\t\t\tsecondOwner.oclAsType(InternalComponent).oclContainer().oclAsType(DeploymentModel).hostings\n\t\t\t\t\t->select(p | p.requiredHost.oclContainer() = secondOwner)\n\t\t\t\t\t->first().providedHost.oclContainer()\n\t\t\t\telse if (firstOwner.oclIsTypeOf(VM) and secondOwner.oclIsTypeOf(InternalComponent))\n\t\t\t\t\tthen firstOwner = secondOwner.oclAsType(InternalComponent).oclContainer().oclAsType(DeploymentModel).hostings\n\t\t\t\t\t\t->select(p | p.requiredHost.oclContainer() = secondOwner)\n\t\t\t\t\t\t->first().providedHost.oclContainer()\n\t\t\t\t\telse if (firstOwner.oclIsTypeOf(InternalComponent) and secondOwner.oclIsTypeOf(VM))\n\t\t\t\t\t\tthen firstOwner.oclAsType(InternalComponent).oclContainer().oclAsType(DeploymentModel).hostings\n\t\t\t\t\t\t\t->select(p | p.requiredHost.oclContainer() = firstOwner)\n\t\t\t\t\t\t\t->first().providedHost.oclContainer() = secondOwner\n\t\t\t\t\t\telse if (firstOwner = secondOwner)\n\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif)\n}.status"
		   });	
		addAnnotation
		  (componentInstanceEClass, 
		   source, 
		   new String[] {
			 "component_port_instances_of_correct_type", "Tuple {\n\tmessage : String = \'The type of component instance:\' + self.name +\n\t\t\t\t\' should have as provided communication/hosts the types of the component instance\\\'s provided communication/host instances\',\n\tstatus : Boolean = providedCommunicationInstances\n\t\t\t\t->forAll(p | type.providedCommunications\n\t\t\t\t\t->includes(p.type)) and providedHostInstances\n\t\t\t\t->forAll(p | type.providedHosts\n\t\t\t\t\t->includes(p.type))\n}.status"
		   });	
		addAnnotation
		  (internalComponentInstanceEClass, 
		   source, 
		   new String[] {
			 "internal_component_port_instances_of_correct_type", "Tuple {\n\tmessage : String = \'The type of component instance:\' + self.name +\n\t\t\t\t\' should have as required communication/hosts the types of the component instance\\\'s required communication/host instances\',\n\tstatus : Boolean = type.oclIsKindOf(InternalComponent)\n\t\t\t\tand requiredCommunicationInstances\n\t\t\t\t->forAll(p | type.oclAsType(InternalComponent).requiredCommunications\n\t\t\t\t\t->includes(p.type)) and (requiredHostInstance <> null implies requiredHostInstance.type =\n\t\t\t\ttype.oclAsType(InternalComponent).requiredHost)\n}.status"
		   });	
		addAnnotation
		  (vmInstanceEClass, 
		   source, 
		   new String[] {
			 "correct_type_for_vm_instance", "Tuple {\n\tmessage : String = \'VM Instance: \' + self.name +\n\t\t\t\t\' should have as type a VM\',\n\tstatus : Boolean = type.oclIsTypeOf(VM)\n}.status",
			 "correct_vm_type_value_in_vm_instance", "Tuple {\n\tmessage : String = \'VMInstance: \' + self.name +\n\t\t\t\t\' has a vmTypeValue which is not included in the ValueType of the vmType Attribute\',\n\tstatus : Boolean = ((vmType <> null and\n\t\t\t\tvmType.valueType <> null) implies (if (vmType.valueType.oclIsTypeOf(camel::type::Range))\n\t\t\t\tthen if (vmTypeValue.oclIsTypeOf(camel::type::IntegerValue))\n\t\t\t\t\tthen\n\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::Range).includesValue(vmTypeValue.oclAsType(camel::type::IntegerValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\telse if (vmTypeValue.oclIsTypeOf(camel::type::FloatsValue))\n\t\t\t\t\t\tthen\n\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::Range).includesValue(vmTypeValue.oclAsType(camel::type::FloatsValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\telse if (vmTypeValue.oclIsTypeOf(camel::type::DoublePrecisionValue))\n\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::Range).includesValue(vmTypeValue.oclAsType(camel::type::DoublePrecisionValue).value)\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\telse if (vmType.valueType.oclIsTypeOf(camel::type::Enumeration))\n\t\t\t\t\tthen if (vmTypeValue.oclIsTypeOf(camel::type::StringsValue))\n\t\t\t\t\t\tthen\n\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::Enumeration).includesName(vmTypeValue.oclAsType(camel::type::StringsValue).value)\n\t\t\t\t\t\telse if (vmTypeValue.oclIsTypeOf(camel::type::EnumerateValue))\n\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::Enumeration).includesName(vmTypeValue.oclAsType(camel::type::EnumerateValue).name)\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif\n\t\t\t\t\telse if (vmType.valueType.oclIsTypeOf(camel::type::List))\n\t\t\t\t\t\tthen vmType.valueType.oclAsType(camel::type::List).includesValue(vmTypeValue)\n\t\t\t\t\t\telse if (vmType.valueType.oclIsTypeOf(camel::type::RangeUnion))\n\t\t\t\t\t\t\tthen if (vmTypeValue.oclIsTypeOf(camel::type::IntegerValue))\n\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::RangeUnion).includesValue(vmTypeValue.oclAsType(camel::type::IntegerValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\telse if (vmTypeValue.oclIsTypeOf(camel::type::FloatsValue))\n\t\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::RangeUnion).includesValue(vmTypeValue.oclAsType(camel::type::FloatsValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\telse if (vmTypeValue.oclIsTypeOf(camel::type::DoublePrecisionValue))\n\t\t\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::RangeUnion).includesValue(vmTypeValue.oclAsType(camel::type::DoublePrecisionValue).value)\n\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif))\n}.status"
		   });	
		addAnnotation
		  (communicationInstanceEClass, 
		   source, 
		   new String[] {
			 "communication_instance_correct_port_instances", "Tuple {\n\tmessage : String = \'CommunicationInstance: \' + self.name +\n\t\t\t\t\' should have its provided and required communication instances\\\' types mapping to its required communication/host type, respectively\',\n\tstatus : Boolean = requiredCommunicationInstance.type\n\t\t\t\t= type.requiredCommunication and providedCommunicationInstance.type = type.providedCommunication\n}.status"
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
		  (getVMRequirementSet_QualitativeHardwareRequirement(), 
		   source, 
		   new String[] {
			 "value", "@JoinColumn(name=\"qualitativehardwarerequirement\")"
		   });	
		addAnnotation
		  (getVMRequirementSet_QuantitativeHardwareRequirement(), 
		   source, 
		   new String[] {
			 "value", "@JoinColumn(name=\"quantitativehardwarerequirement\")"
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
		  (getVMInstance_Ip(), 
		   source, 
		   new String[] {
			 "body", "CommunicationInstance",
			 "unique", "false",
			 "upper", "*"
		   });
	}

} //DeploymentPackageImpl
