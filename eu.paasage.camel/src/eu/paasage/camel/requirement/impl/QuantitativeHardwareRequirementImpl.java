/**
 */
package eu.paasage.camel.requirement.impl;

import eu.paasage.camel.requirement.QuantitativeHardwareRequirement;
import eu.paasage.camel.requirement.RequirementPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantitative Hardware Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.impl.QuantitativeHardwareRequirementImpl#getMinCPU <em>Min CPU</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.QuantitativeHardwareRequirementImpl#getMaxCPU <em>Max CPU</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.QuantitativeHardwareRequirementImpl#getMinCores <em>Min Cores</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.QuantitativeHardwareRequirementImpl#getMaxCores <em>Max Cores</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.QuantitativeHardwareRequirementImpl#getMinRAM <em>Min RAM</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.QuantitativeHardwareRequirementImpl#getMaxRAM <em>Max RAM</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.QuantitativeHardwareRequirementImpl#getMinStorage <em>Min Storage</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.QuantitativeHardwareRequirementImpl#getMaxStorage <em>Max Storage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuantitativeHardwareRequirementImpl extends HardwareRequirementImpl implements QuantitativeHardwareRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantitativeHardwareRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinCPU() {
		return (Double)eGet(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CPU, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCPU(double newMinCPU) {
		eSet(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CPU, newMinCPU);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxCPU() {
		return (Double)eGet(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CPU, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCPU(double newMaxCPU) {
		eSet(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CPU, newMaxCPU);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinCores() {
		return (Integer)eGet(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CORES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCores(int newMinCores) {
		eSet(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CORES, newMinCores);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxCores() {
		return (Integer)eGet(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CORES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCores(int newMaxCores) {
		eSet(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CORES, newMaxCores);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinRAM() {
		return (Integer)eGet(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_RAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRAM(int newMinRAM) {
		eSet(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_RAM, newMinRAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxRAM() {
		return (Integer)eGet(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_RAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRAM(int newMaxRAM) {
		eSet(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_RAM, newMaxRAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinStorage() {
		return (Integer)eGet(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_STORAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinStorage(int newMinStorage) {
		eSet(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_STORAGE, newMinStorage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxStorage() {
		return (Integer)eGet(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_STORAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxStorage(int newMaxStorage) {
		eSet(RequirementPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_STORAGE, newMaxStorage);
	}

} //QuantitativeHardwareRequirementImpl
