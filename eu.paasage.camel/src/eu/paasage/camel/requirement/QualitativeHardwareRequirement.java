/**
 */
package eu.paasage.camel.requirement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualitative Hardware Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.QualitativeHardwareRequirement#getMinBenchmark <em>Min Benchmark</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.QualitativeHardwareRequirement#getMaxBenchmark <em>Max Benchmark</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.requirement.RequirementPackage#getQualitativeHardwareRequirement()
 * @model
 * @generated
 */
public interface QualitativeHardwareRequirement extends HardwareRequirement {
	/**
	 * Returns the value of the '<em><b>Min Benchmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Benchmark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Benchmark</em>' attribute.
	 * @see #setMinBenchmark(double)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getQualitativeHardwareRequirement_MinBenchmark()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='NonFunctionalEvent' unique='false' upper='*'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='NonFunctionalEvent' unique='false' upper='*'"
	 * @generated
	 */
	double getMinBenchmark();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.QualitativeHardwareRequirement#getMinBenchmark <em>Min Benchmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Benchmark</em>' attribute.
	 * @see #getMinBenchmark()
	 * @generated
	 */
	void setMinBenchmark(double value);

	/**
	 * Returns the value of the '<em><b>Max Benchmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Benchmark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Benchmark</em>' attribute.
	 * @see #setMaxBenchmark(double)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getQualitativeHardwareRequirement_MaxBenchmark()
	 * @model
	 * @generated
	 */
	double getMaxBenchmark();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.QualitativeHardwareRequirement#getMaxBenchmark <em>Max Benchmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Benchmark</em>' attribute.
	 * @see #getMaxBenchmark()
	 * @generated
	 */
	void setMaxBenchmark(double value);

} // QualitativeHardwareRequirement
