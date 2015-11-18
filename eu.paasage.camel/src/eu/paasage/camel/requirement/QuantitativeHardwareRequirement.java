/**
 */
package eu.paasage.camel.requirement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantitative Hardware Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMinCPU <em>Min CPU</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMaxCPU <em>Max CPU</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMinCores <em>Min Cores</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMaxCores <em>Max Cores</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMinRAM <em>Min RAM</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMaxRAM <em>Max RAM</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMinStorage <em>Min Storage</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMaxStorage <em>Max Storage</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.requirement.RequirementPackage#getQuantitativeHardwareRequirement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='one_alternative_provided_in_quantitative_req quantitative_req_correct_input'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot one_alternative_provided_in_quantitative_req='Tuple {\n\tmessage : String = \'QuantitativeHardwareRequirement with name: \' + self.name +\n\t\t\t\t\t\' should be have at least one min or max value for a VM characteristic\',\n\tstatus : Boolean = ((minRAM > 0 or maxRAM > 0)) or\n\t\t\t\t\t((minStorage > 0 or maxStorage > 0)) or (minCores > 0 or maxCores > 0)\n}.status' quantitative_req_correct_input='Tuple {\n\tmessage : String = \'Correct (non-negative) values for the characteristics of VM in QuantitativeHardwareRequirement with name: \'\n\t\t\t\t\t+ self.name + \' should be provided\',\n\tstatus : Boolean = minRAM >= 0 and maxRAM >= 0 and minCores >= 0 and maxCores >= 0 and\n\t\t\t\t\tminStorage >= 0 and maxStorage >= 0\n}.status'"
 * @generated
 */
public interface QuantitativeHardwareRequirement extends HardwareRequirement {
	/**
	 * Returns the value of the '<em><b>Min CPU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min CPU</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min CPU</em>' attribute.
	 * @see #setMinCPU(double)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getQuantitativeHardwareRequirement_MinCPU()
	 * @model
	 * @generated
	 */
	double getMinCPU();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMinCPU <em>Min CPU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min CPU</em>' attribute.
	 * @see #getMinCPU()
	 * @generated
	 */
	void setMinCPU(double value);

	/**
	 * Returns the value of the '<em><b>Max CPU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max CPU</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max CPU</em>' attribute.
	 * @see #setMaxCPU(double)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getQuantitativeHardwareRequirement_MaxCPU()
	 * @model
	 * @generated
	 */
	double getMaxCPU();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMaxCPU <em>Max CPU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max CPU</em>' attribute.
	 * @see #getMaxCPU()
	 * @generated
	 */
	void setMaxCPU(double value);

	/**
	 * Returns the value of the '<em><b>Min Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Cores</em>' attribute.
	 * @see #setMinCores(int)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getQuantitativeHardwareRequirement_MinCores()
	 * @model
	 * @generated
	 */
	int getMinCores();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMinCores <em>Min Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Cores</em>' attribute.
	 * @see #getMinCores()
	 * @generated
	 */
	void setMinCores(int value);

	/**
	 * Returns the value of the '<em><b>Max Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Cores</em>' attribute.
	 * @see #setMaxCores(int)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getQuantitativeHardwareRequirement_MaxCores()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='EventInstance' unique='false' upper='*'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='EventInstance' unique='false' upper='*'"
	 * @generated
	 */
	int getMaxCores();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMaxCores <em>Max Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Cores</em>' attribute.
	 * @see #getMaxCores()
	 * @generated
	 */
	void setMaxCores(int value);

	/**
	 * Returns the value of the '<em><b>Min RAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min RAM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min RAM</em>' attribute.
	 * @see #setMinRAM(int)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getQuantitativeHardwareRequirement_MinRAM()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='EventInstance' unique='false' upper='*'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='EventInstance' unique='false' upper='*'"
	 * @generated
	 */
	int getMinRAM();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMinRAM <em>Min RAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min RAM</em>' attribute.
	 * @see #getMinRAM()
	 * @generated
	 */
	void setMinRAM(int value);

	/**
	 * Returns the value of the '<em><b>Max RAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max RAM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max RAM</em>' attribute.
	 * @see #setMaxRAM(int)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getQuantitativeHardwareRequirement_MaxRAM()
	 * @model
	 * @generated
	 */
	int getMaxRAM();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMaxRAM <em>Max RAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max RAM</em>' attribute.
	 * @see #getMaxRAM()
	 * @generated
	 */
	void setMaxRAM(int value);

	/**
	 * Returns the value of the '<em><b>Min Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Storage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Storage</em>' attribute.
	 * @see #setMinStorage(int)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getQuantitativeHardwareRequirement_MinStorage()
	 * @model
	 * @generated
	 */
	int getMinStorage();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMinStorage <em>Min Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Storage</em>' attribute.
	 * @see #getMinStorage()
	 * @generated
	 */
	void setMinStorage(int value);

	/**
	 * Returns the value of the '<em><b>Max Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Storage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Storage</em>' attribute.
	 * @see #setMaxStorage(int)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getQuantitativeHardwareRequirement_MaxStorage()
	 * @model
	 * @generated
	 */
	int getMaxStorage();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMaxStorage <em>Max Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Storage</em>' attribute.
	 * @see #getMaxStorage()
	 * @generated
	 */
	void setMaxStorage(int value);

} // QuantitativeHardwareRequirement
