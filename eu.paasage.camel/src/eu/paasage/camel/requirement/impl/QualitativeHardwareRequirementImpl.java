/**
 */
package eu.paasage.camel.requirement.impl;

import eu.paasage.camel.requirement.QualitativeHardwareRequirement;
import eu.paasage.camel.requirement.RequirementPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualitative Hardware Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.impl.QualitativeHardwareRequirementImpl#getMinBenchmark <em>Min Benchmark</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.QualitativeHardwareRequirementImpl#getMaxBenchmark <em>Max Benchmark</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualitativeHardwareRequirementImpl extends HardwareRequirementImpl implements QualitativeHardwareRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualitativeHardwareRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.QUALITATIVE_HARDWARE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinBenchmark() {
		return (Double)eGet(RequirementPackage.Literals.QUALITATIVE_HARDWARE_REQUIREMENT__MIN_BENCHMARK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinBenchmark(double newMinBenchmark) {
		eSet(RequirementPackage.Literals.QUALITATIVE_HARDWARE_REQUIREMENT__MIN_BENCHMARK, newMinBenchmark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxBenchmark() {
		return (Double)eGet(RequirementPackage.Literals.QUALITATIVE_HARDWARE_REQUIREMENT__MAX_BENCHMARK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBenchmark(double newMaxBenchmark) {
		eSet(RequirementPackage.Literals.QUALITATIVE_HARDWARE_REQUIREMENT__MAX_BENCHMARK, newMaxBenchmark);
	}

} //QualitativeHardwareRequirementImpl
