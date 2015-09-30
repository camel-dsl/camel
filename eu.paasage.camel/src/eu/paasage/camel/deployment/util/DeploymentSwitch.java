/**
 */
package eu.paasage.camel.deployment.util;

import eu.paasage.camel.Model;
import eu.paasage.camel.deployment.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.deployment.DeploymentPackage
 * @generated
 */
public class DeploymentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeploymentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSwitch() {
		if (modelPackage == null) {
			modelPackage = DeploymentPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DeploymentPackage.DEPLOYMENT_ELEMENT: {
				DeploymentElement deploymentElement = (DeploymentElement)theEObject;
				T result = caseDeploymentElement(deploymentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.DEPLOYMENT_MODEL: {
				DeploymentModel deploymentModel = (DeploymentModel)theEObject;
				T result = caseDeploymentModel(deploymentModel);
				if (result == null) result = caseModel(deploymentModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseDeploymentElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.INTERNAL_COMPONENT: {
				InternalComponent internalComponent = (InternalComponent)theEObject;
				T result = caseInternalComponent(internalComponent);
				if (result == null) result = caseComponent(internalComponent);
				if (result == null) result = caseDeploymentElement(internalComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.VM: {
				VM vm = (VM)theEObject;
				T result = caseVM(vm);
				if (result == null) result = caseComponent(vm);
				if (result == null) result = caseDeploymentElement(vm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.VM_REQUIREMENT_SET: {
				VMRequirementSet vmRequirementSet = (VMRequirementSet)theEObject;
				T result = caseVMRequirementSet(vmRequirementSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = caseDeploymentElement(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.COMMUNICATION: {
				Communication communication = (Communication)theEObject;
				T result = caseCommunication(communication);
				if (result == null) result = caseDeploymentElement(communication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.COMMUNICATION_PORT: {
				CommunicationPort communicationPort = (CommunicationPort)theEObject;
				T result = caseCommunicationPort(communicationPort);
				if (result == null) result = caseDeploymentElement(communicationPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.PROVIDED_COMMUNICATION: {
				ProvidedCommunication providedCommunication = (ProvidedCommunication)theEObject;
				T result = caseProvidedCommunication(providedCommunication);
				if (result == null) result = caseCommunicationPort(providedCommunication);
				if (result == null) result = caseDeploymentElement(providedCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.REQUIRED_COMMUNICATION: {
				RequiredCommunication requiredCommunication = (RequiredCommunication)theEObject;
				T result = caseRequiredCommunication(requiredCommunication);
				if (result == null) result = caseCommunicationPort(requiredCommunication);
				if (result == null) result = caseDeploymentElement(requiredCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.HOSTING: {
				Hosting hosting = (Hosting)theEObject;
				T result = caseHosting(hosting);
				if (result == null) result = caseDeploymentElement(hosting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.HOSTING_PORT: {
				HostingPort hostingPort = (HostingPort)theEObject;
				T result = caseHostingPort(hostingPort);
				if (result == null) result = caseDeploymentElement(hostingPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.PROVIDED_HOST: {
				ProvidedHost providedHost = (ProvidedHost)theEObject;
				T result = caseProvidedHost(providedHost);
				if (result == null) result = caseHostingPort(providedHost);
				if (result == null) result = caseDeploymentElement(providedHost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.REQUIRED_HOST: {
				RequiredHost requiredHost = (RequiredHost)theEObject;
				T result = caseRequiredHost(requiredHost);
				if (result == null) result = caseHostingPort(requiredHost);
				if (result == null) result = caseDeploymentElement(requiredHost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.COMPONENT_INSTANCE: {
				ComponentInstance componentInstance = (ComponentInstance)theEObject;
				T result = caseComponentInstance(componentInstance);
				if (result == null) result = caseDeploymentElement(componentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.INTERNAL_COMPONENT_INSTANCE: {
				InternalComponentInstance internalComponentInstance = (InternalComponentInstance)theEObject;
				T result = caseInternalComponentInstance(internalComponentInstance);
				if (result == null) result = caseComponentInstance(internalComponentInstance);
				if (result == null) result = caseDeploymentElement(internalComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.VM_INSTANCE: {
				VMInstance vmInstance = (VMInstance)theEObject;
				T result = caseVMInstance(vmInstance);
				if (result == null) result = caseComponentInstance(vmInstance);
				if (result == null) result = caseDeploymentElement(vmInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.COMMUNICATION_INSTANCE: {
				CommunicationInstance communicationInstance = (CommunicationInstance)theEObject;
				T result = caseCommunicationInstance(communicationInstance);
				if (result == null) result = caseDeploymentElement(communicationInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.COMMUNICATION_PORT_INSTANCE: {
				CommunicationPortInstance communicationPortInstance = (CommunicationPortInstance)theEObject;
				T result = caseCommunicationPortInstance(communicationPortInstance);
				if (result == null) result = caseDeploymentElement(communicationPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.PROVIDED_COMMUNICATION_INSTANCE: {
				ProvidedCommunicationInstance providedCommunicationInstance = (ProvidedCommunicationInstance)theEObject;
				T result = caseProvidedCommunicationInstance(providedCommunicationInstance);
				if (result == null) result = caseCommunicationPortInstance(providedCommunicationInstance);
				if (result == null) result = caseDeploymentElement(providedCommunicationInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.REQUIRED_COMMUNICATION_INSTANCE: {
				RequiredCommunicationInstance requiredCommunicationInstance = (RequiredCommunicationInstance)theEObject;
				T result = caseRequiredCommunicationInstance(requiredCommunicationInstance);
				if (result == null) result = caseCommunicationPortInstance(requiredCommunicationInstance);
				if (result == null) result = caseDeploymentElement(requiredCommunicationInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.HOSTING_INSTANCE: {
				HostingInstance hostingInstance = (HostingInstance)theEObject;
				T result = caseHostingInstance(hostingInstance);
				if (result == null) result = caseDeploymentElement(hostingInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.HOSTING_PORT_INSTANCE: {
				HostingPortInstance hostingPortInstance = (HostingPortInstance)theEObject;
				T result = caseHostingPortInstance(hostingPortInstance);
				if (result == null) result = caseDeploymentElement(hostingPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.PROVIDED_HOST_INSTANCE: {
				ProvidedHostInstance providedHostInstance = (ProvidedHostInstance)theEObject;
				T result = caseProvidedHostInstance(providedHostInstance);
				if (result == null) result = caseHostingPortInstance(providedHostInstance);
				if (result == null) result = caseDeploymentElement(providedHostInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.REQUIRED_HOST_INSTANCE: {
				RequiredHostInstance requiredHostInstance = (RequiredHostInstance)theEObject;
				T result = caseRequiredHostInstance(requiredHostInstance);
				if (result == null) result = caseHostingPortInstance(requiredHostInstance);
				if (result == null) result = caseDeploymentElement(requiredHostInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentElement(DeploymentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentModel(DeploymentModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalComponent(InternalComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVM(VM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Requirement Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Requirement Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMRequirementSet(VMRequirementSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunication(Communication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationPort(CommunicationPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedCommunication(ProvidedCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredCommunication(RequiredCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hosting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hosting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHosting(Hosting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hosting Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hosting Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostingPort(HostingPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Host</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Host</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedHost(ProvidedHost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Host</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Host</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredHost(RequiredHost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstance(ComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalComponentInstance(InternalComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMInstance(VMInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationInstance(CommunicationInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationPortInstance(CommunicationPortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Communication Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Communication Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedCommunicationInstance(ProvidedCommunicationInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Communication Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Communication Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredCommunicationInstance(RequiredCommunicationInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hosting Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hosting Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostingInstance(HostingInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hosting Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hosting Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostingPortInstance(HostingPortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Host Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Host Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedHostInstance(ProvidedHostInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Host Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Host Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredHostInstance(RequiredHostInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DeploymentSwitch
