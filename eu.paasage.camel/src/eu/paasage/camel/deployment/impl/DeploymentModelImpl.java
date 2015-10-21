/**
 */
package eu.paasage.camel.deployment.impl;

import eu.paasage.camel.deployment.Communication;
import eu.paasage.camel.deployment.CommunicationInstance;
import eu.paasage.camel.deployment.DeploymentModel;
import eu.paasage.camel.deployment.DeploymentPackage;
import eu.paasage.camel.deployment.Hosting;
import eu.paasage.camel.deployment.HostingInstance;
import eu.paasage.camel.deployment.InternalComponent;
import eu.paasage.camel.deployment.InternalComponentInstance;
import eu.paasage.camel.deployment.VM;
import eu.paasage.camel.deployment.VMInstance;
import eu.paasage.camel.deployment.VMRequirementSet;

import eu.paasage.camel.impl.ModelImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.impl.DeploymentModelImpl#getInternalComponents <em>Internal Components</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.DeploymentModelImpl#getInternalComponentInstances <em>Internal Component Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.DeploymentModelImpl#getVms <em>Vms</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.DeploymentModelImpl#getVmInstances <em>Vm Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.DeploymentModelImpl#getCommunications <em>Communications</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.DeploymentModelImpl#getCommunicationInstances <em>Communication Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.DeploymentModelImpl#getHostings <em>Hostings</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.DeploymentModelImpl#getHostingInstances <em>Hosting Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.DeploymentModelImpl#getVmRequirementSets <em>Vm Requirement Sets</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.DeploymentModelImpl#getGlobalVMRequirementSet <em>Global VM Requirement Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentModelImpl extends ModelImpl implements DeploymentModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.DEPLOYMENT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InternalComponent> getInternalComponents() {
		return (EList<InternalComponent>)eGet(DeploymentPackage.Literals.DEPLOYMENT_MODEL__INTERNAL_COMPONENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InternalComponentInstance> getInternalComponentInstances() {
		return (EList<InternalComponentInstance>)eGet(DeploymentPackage.Literals.DEPLOYMENT_MODEL__INTERNAL_COMPONENT_INSTANCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VM> getVms() {
		return (EList<VM>)eGet(DeploymentPackage.Literals.DEPLOYMENT_MODEL__VMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VMInstance> getVmInstances() {
		return (EList<VMInstance>)eGet(DeploymentPackage.Literals.DEPLOYMENT_MODEL__VM_INSTANCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Communication> getCommunications() {
		return (EList<Communication>)eGet(DeploymentPackage.Literals.DEPLOYMENT_MODEL__COMMUNICATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CommunicationInstance> getCommunicationInstances() {
		return (EList<CommunicationInstance>)eGet(DeploymentPackage.Literals.DEPLOYMENT_MODEL__COMMUNICATION_INSTANCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Hosting> getHostings() {
		return (EList<Hosting>)eGet(DeploymentPackage.Literals.DEPLOYMENT_MODEL__HOSTINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<HostingInstance> getHostingInstances() {
		return (EList<HostingInstance>)eGet(DeploymentPackage.Literals.DEPLOYMENT_MODEL__HOSTING_INSTANCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VMRequirementSet> getVmRequirementSets() {
		return (EList<VMRequirementSet>)eGet(DeploymentPackage.Literals.DEPLOYMENT_MODEL__VM_REQUIREMENT_SETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMRequirementSet getGlobalVMRequirementSet() {
		return (VMRequirementSet)eGet(DeploymentPackage.Literals.DEPLOYMENT_MODEL__GLOBAL_VM_REQUIREMENT_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalVMRequirementSet(VMRequirementSet newGlobalVMRequirementSet) {
		eSet(DeploymentPackage.Literals.DEPLOYMENT_MODEL__GLOBAL_VM_REQUIREMENT_SET, newGlobalVMRequirementSet);
	}

} //DeploymentModelImpl
