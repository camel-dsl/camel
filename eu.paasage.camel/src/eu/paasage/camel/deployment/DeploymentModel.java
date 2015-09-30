/**
 */
package eu.paasage.camel.deployment;

import eu.paasage.camel.Model;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.DeploymentModel#getInternalComponents <em>Internal Components</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.DeploymentModel#getInternalComponentInstances <em>Internal Component Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.DeploymentModel#getVms <em>Vms</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.DeploymentModel#getVmInstances <em>Vm Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.DeploymentModel#getCommunications <em>Communications</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.DeploymentModel#getCommunicationInstances <em>Communication Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.DeploymentModel#getHostings <em>Hostings</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.DeploymentModel#getHostingInstances <em>Hosting Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.DeploymentModel#getVmRequirementSets <em>Vm Requirement Sets</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.DeploymentModel#getGlobalVMRequirementSet <em>Global VM Requirement Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.deployment.DeploymentPackage#getDeploymentModel()
 * @model
 * @generated
 */
public interface DeploymentModel extends Model {
	/**
	 * Returns the value of the '<em><b>Internal Components</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.InternalComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Components</em>' containment reference list.
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getDeploymentModel_InternalComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalComponent> getInternalComponents();

	/**
	 * Returns the value of the '<em><b>Internal Component Instances</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.InternalComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Component Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Component Instances</em>' containment reference list.
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getDeploymentModel_InternalComponentInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalComponentInstance> getInternalComponentInstances();

	/**
	 * Returns the value of the '<em><b>Vms</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.VM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vms</em>' containment reference list.
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getDeploymentModel_Vms()
	 * @model containment="true"
	 * @generated
	 */
	EList<VM> getVms();

	/**
	 * Returns the value of the '<em><b>Vm Instances</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.VMInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Instances</em>' containment reference list.
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getDeploymentModel_VmInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<VMInstance> getVmInstances();

	/**
	 * Returns the value of the '<em><b>Communications</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.Communication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communications</em>' containment reference list.
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getDeploymentModel_Communications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Communication> getCommunications();

	/**
	 * Returns the value of the '<em><b>Hostings</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.Hosting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hostings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostings</em>' containment reference list.
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getDeploymentModel_Hostings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hosting> getHostings();

	/**
	 * Returns the value of the '<em><b>Communication Instances</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.CommunicationInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Instances</em>' containment reference list.
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getDeploymentModel_CommunicationInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationInstance> getCommunicationInstances();

	/**
	 * Returns the value of the '<em><b>Hosting Instances</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.HostingInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosting Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosting Instances</em>' containment reference list.
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getDeploymentModel_HostingInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<HostingInstance> getHostingInstances();

	/**
	 * Returns the value of the '<em><b>Vm Requirement Sets</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.VMRequirementSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Requirement Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Requirement Sets</em>' containment reference list.
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getDeploymentModel_VmRequirementSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<VMRequirementSet> getVmRequirementSets();

	/**
	 * Returns the value of the '<em><b>Global VM Requirement Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global VM Requirement Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global VM Requirement Set</em>' reference.
	 * @see #setGlobalVMRequirementSet(VMRequirementSet)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getDeploymentModel_GlobalVMRequirementSet()
	 * @model
	 * @generated
	 */
	VMRequirementSet getGlobalVMRequirementSet();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.DeploymentModel#getGlobalVMRequirementSet <em>Global VM Requirement Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global VM Requirement Set</em>' reference.
	 * @see #getGlobalVMRequirementSet()
	 * @generated
	 */
	void setGlobalVMRequirementSet(VMRequirementSet value);

} // DeploymentModel
