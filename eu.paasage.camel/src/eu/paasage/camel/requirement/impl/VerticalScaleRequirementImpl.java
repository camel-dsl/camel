/**
 */
package eu.paasage.camel.requirement.impl;

import eu.paasage.camel.deployment.VM;

import eu.paasage.camel.requirement.RequirementPackage;
import eu.paasage.camel.requirement.VerticalScaleRequirement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertical Scale Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.impl.VerticalScaleRequirementImpl#getMinCPU <em>Min CPU</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.VerticalScaleRequirementImpl#getMaxCPU <em>Max CPU</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.VerticalScaleRequirementImpl#getMinCores <em>Min Cores</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.VerticalScaleRequirementImpl#getMaxCores <em>Max Cores</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.VerticalScaleRequirementImpl#getMinRAM <em>Min RAM</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.VerticalScaleRequirementImpl#getMaxRAM <em>Max RAM</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.VerticalScaleRequirementImpl#getMinStorage <em>Min Storage</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.VerticalScaleRequirementImpl#getMaxStorage <em>Max Storage</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.VerticalScaleRequirementImpl#getVm <em>Vm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerticalScaleRequirementImpl extends ScaleRequirementImpl implements VerticalScaleRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerticalScaleRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinCPU() {
		return (Double)eGet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MIN_CPU, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCPU(double newMinCPU) {
		eSet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MIN_CPU, newMinCPU);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxCPU() {
		return (Double)eGet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MAX_CPU, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCPU(double newMaxCPU) {
		eSet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MAX_CPU, newMaxCPU);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinCores() {
		return (Integer)eGet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MIN_CORES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCores(int newMinCores) {
		eSet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MIN_CORES, newMinCores);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxCores() {
		return (Integer)eGet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MAX_CORES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCores(int newMaxCores) {
		eSet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MAX_CORES, newMaxCores);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinRAM() {
		return (Integer)eGet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MIN_RAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRAM(int newMinRAM) {
		eSet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MIN_RAM, newMinRAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxRAM() {
		return (Integer)eGet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MAX_RAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRAM(int newMaxRAM) {
		eSet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MAX_RAM, newMaxRAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinStorage() {
		return (Integer)eGet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MIN_STORAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinStorage(int newMinStorage) {
		eSet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MIN_STORAGE, newMinStorage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxStorage() {
		return (Integer)eGet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MAX_STORAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxStorage(int newMaxStorage) {
		eSet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MAX_STORAGE, newMaxStorage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VM getVm() {
		return (VM)eGet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__VM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVm(VM newVm) {
		eSet(RequirementPackage.Literals.VERTICAL_SCALE_REQUIREMENT__VM, newVm);
	}

} //VerticalScaleRequirementImpl
