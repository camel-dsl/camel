/**
 */
package eu.paasage.camel.deployment.impl;

import eu.paasage.camel.deployment.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentFactoryImpl extends EFactoryImpl implements DeploymentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeploymentFactory init() {
		try {
			DeploymentFactory theDeploymentFactory = (DeploymentFactory)EPackage.Registry.INSTANCE.getEFactory(DeploymentPackage.eNS_URI);
			if (theDeploymentFactory != null) {
				return theDeploymentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeploymentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DeploymentPackage.DEPLOYMENT_MODEL: return (EObject)createDeploymentModel();
			case DeploymentPackage.INTERNAL_COMPONENT: return (EObject)createInternalComponent();
			case DeploymentPackage.VM: return (EObject)createVM();
			case DeploymentPackage.VM_REQUIREMENT_SET: return (EObject)createVMRequirementSet();
			case DeploymentPackage.CONFIGURATION: return (EObject)createConfiguration();
			case DeploymentPackage.COMMUNICATION: return (EObject)createCommunication();
			case DeploymentPackage.PROVIDED_COMMUNICATION: return (EObject)createProvidedCommunication();
			case DeploymentPackage.REQUIRED_COMMUNICATION: return (EObject)createRequiredCommunication();
			case DeploymentPackage.HOSTING: return (EObject)createHosting();
			case DeploymentPackage.PROVIDED_HOST: return (EObject)createProvidedHost();
			case DeploymentPackage.REQUIRED_HOST: return (EObject)createRequiredHost();
			case DeploymentPackage.INTERNAL_COMPONENT_INSTANCE: return (EObject)createInternalComponentInstance();
			case DeploymentPackage.VM_INSTANCE: return (EObject)createVMInstance();
			case DeploymentPackage.COMMUNICATION_INSTANCE: return (EObject)createCommunicationInstance();
			case DeploymentPackage.COMMUNICATION_PORT_INSTANCE: return (EObject)createCommunicationPortInstance();
			case DeploymentPackage.PROVIDED_COMMUNICATION_INSTANCE: return (EObject)createProvidedCommunicationInstance();
			case DeploymentPackage.REQUIRED_COMMUNICATION_INSTANCE: return (EObject)createRequiredCommunicationInstance();
			case DeploymentPackage.HOSTING_INSTANCE: return (EObject)createHostingInstance();
			case DeploymentPackage.PROVIDED_HOST_INSTANCE: return (EObject)createProvidedHostInstance();
			case DeploymentPackage.REQUIRED_HOST_INSTANCE: return (EObject)createRequiredHostInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DeploymentPackage.COMMUNICATION_TYPE:
				return createCommunicationTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DeploymentPackage.COMMUNICATION_TYPE:
				return convertCommunicationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentModel createDeploymentModel() {
		DeploymentModelImpl deploymentModel = new DeploymentModelImpl();
		return deploymentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalComponent createInternalComponent() {
		InternalComponentImpl internalComponent = new InternalComponentImpl();
		return internalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VM createVM() {
		VMImpl vm = new VMImpl();
		return vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMRequirementSet createVMRequirementSet() {
		VMRequirementSetImpl vmRequirementSet = new VMRequirementSetImpl();
		return vmRequirementSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedCommunication createProvidedCommunication() {
		ProvidedCommunicationImpl providedCommunication = new ProvidedCommunicationImpl();
		return providedCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredCommunication createRequiredCommunication() {
		RequiredCommunicationImpl requiredCommunication = new RequiredCommunicationImpl();
		return requiredCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hosting createHosting() {
		HostingImpl hosting = new HostingImpl();
		return hosting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedHost createProvidedHost() {
		ProvidedHostImpl providedHost = new ProvidedHostImpl();
		return providedHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredHost createRequiredHost() {
		RequiredHostImpl requiredHost = new RequiredHostImpl();
		return requiredHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalComponentInstance createInternalComponentInstance() {
		InternalComponentInstanceImpl internalComponentInstance = new InternalComponentInstanceImpl();
		return internalComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMInstance createVMInstance() {
		VMInstanceImpl vmInstance = new VMInstanceImpl();
		return vmInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationInstance createCommunicationInstance() {
		CommunicationInstanceImpl communicationInstance = new CommunicationInstanceImpl();
		return communicationInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPortInstance createCommunicationPortInstance() {
		CommunicationPortInstanceImpl communicationPortInstance = new CommunicationPortInstanceImpl();
		return communicationPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedCommunicationInstance createProvidedCommunicationInstance() {
		ProvidedCommunicationInstanceImpl providedCommunicationInstance = new ProvidedCommunicationInstanceImpl();
		return providedCommunicationInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredCommunicationInstance createRequiredCommunicationInstance() {
		RequiredCommunicationInstanceImpl requiredCommunicationInstance = new RequiredCommunicationInstanceImpl();
		return requiredCommunicationInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostingInstance createHostingInstance() {
		HostingInstanceImpl hostingInstance = new HostingInstanceImpl();
		return hostingInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedHostInstance createProvidedHostInstance() {
		ProvidedHostInstanceImpl providedHostInstance = new ProvidedHostInstanceImpl();
		return providedHostInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredHostInstance createRequiredHostInstance() {
		RequiredHostInstanceImpl requiredHostInstance = new RequiredHostInstanceImpl();
		return requiredHostInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationType createCommunicationTypeFromString(EDataType eDataType, String initialValue) {
		CommunicationType result = CommunicationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentPackage getDeploymentPackage() {
		return (DeploymentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeploymentPackage getPackage() {
		return DeploymentPackage.eINSTANCE;
	}

} //DeploymentFactoryImpl
