/**
 */
package eu.paasage.camel.deployment.impl;

import eu.paasage.camel.deployment.DeploymentPackage;
import eu.paasage.camel.deployment.VMRequirementSet;

import eu.paasage.camel.requirement.LocationRequirement;
import eu.paasage.camel.requirement.OSOrImageRequirement;
import eu.paasage.camel.requirement.ProviderRequirement;
import eu.paasage.camel.requirement.QualitativeHardwareRequirement;
import eu.paasage.camel.requirement.QuantitativeHardwareRequirement;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VM Requirement Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.impl.VMRequirementSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.VMRequirementSetImpl#getLocationRequirement <em>Location Requirement</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.VMRequirementSetImpl#getProviderRequirement <em>Provider Requirement</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.VMRequirementSetImpl#getQualitativeHardwareRequirement <em>Qualitative Hardware Requirement</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.VMRequirementSetImpl#getQuantitativeHardwareRequirement <em>Quantitative Hardware Requirement</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.VMRequirementSetImpl#getOsOrImageRequirement <em>Os Or Image Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VMRequirementSetImpl extends CDOObjectImpl implements VMRequirementSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMRequirementSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.VM_REQUIREMENT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(DeploymentPackage.Literals.VM_REQUIREMENT_SET__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(DeploymentPackage.Literals.VM_REQUIREMENT_SET__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationRequirement getLocationRequirement() {
		return (LocationRequirement)eGet(DeploymentPackage.Literals.VM_REQUIREMENT_SET__LOCATION_REQUIREMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationRequirement(LocationRequirement newLocationRequirement) {
		eSet(DeploymentPackage.Literals.VM_REQUIREMENT_SET__LOCATION_REQUIREMENT, newLocationRequirement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderRequirement getProviderRequirement() {
		return (ProviderRequirement)eGet(DeploymentPackage.Literals.VM_REQUIREMENT_SET__PROVIDER_REQUIREMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderRequirement(ProviderRequirement newProviderRequirement) {
		eSet(DeploymentPackage.Literals.VM_REQUIREMENT_SET__PROVIDER_REQUIREMENT, newProviderRequirement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitativeHardwareRequirement getQualitativeHardwareRequirement() {
		return (QualitativeHardwareRequirement)eGet(DeploymentPackage.Literals.VM_REQUIREMENT_SET__QUALITATIVE_HARDWARE_REQUIREMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualitativeHardwareRequirement(QualitativeHardwareRequirement newQualitativeHardwareRequirement) {
		eSet(DeploymentPackage.Literals.VM_REQUIREMENT_SET__QUALITATIVE_HARDWARE_REQUIREMENT, newQualitativeHardwareRequirement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantitativeHardwareRequirement getQuantitativeHardwareRequirement() {
		return (QuantitativeHardwareRequirement)eGet(DeploymentPackage.Literals.VM_REQUIREMENT_SET__QUANTITATIVE_HARDWARE_REQUIREMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantitativeHardwareRequirement(QuantitativeHardwareRequirement newQuantitativeHardwareRequirement) {
		eSet(DeploymentPackage.Literals.VM_REQUIREMENT_SET__QUANTITATIVE_HARDWARE_REQUIREMENT, newQuantitativeHardwareRequirement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSOrImageRequirement getOsOrImageRequirement() {
		return (OSOrImageRequirement)eGet(DeploymentPackage.Literals.VM_REQUIREMENT_SET__OS_OR_IMAGE_REQUIREMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsOrImageRequirement(OSOrImageRequirement newOsOrImageRequirement) {
		eSet(DeploymentPackage.Literals.VM_REQUIREMENT_SET__OS_OR_IMAGE_REQUIREMENT, newOsOrImageRequirement);
	}

} //VMRequirementSetImpl
