/**
 */
package eu.paasage.camel.requirement;

import eu.paasage.camel.deployment.VM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertical Scale Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMinCPU <em>Min CPU</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMaxCPU <em>Max CPU</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMinCores <em>Min Cores</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMaxCores <em>Max Cores</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMinRAM <em>Min RAM</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMaxRAM <em>Max RAM</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMinStorage <em>Min Storage</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMaxStorage <em>Max Storage</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getVm <em>Vm</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.requirement.RequirementPackage#getVerticalScaleRequirement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='vert_scale_requirement_correct_param_vals vert_scale_requirement_activ_one_alt'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot vert_scale_requirement_correct_param_vals='Tuple {\n\tmessage : String = \'In VerticalScaleRequirement: \' + self.name +\n\t\t\t\t\t\' there are wrong combinations of values mapping to the respective VM characteristics. For each characteristic, the min value should be non-negative, the max value greater or equal to -1 and if the max value is greater than -1, then it should be greater or equal to the min value\',\n\tstatus : Boolean = minCores\n\t\t\t\t\t>= 0 and maxCores >= - 1 and (maxCores <> - 1 implies minCores <= maxCores) and minRAM >= 0 and maxRAM >= - 1 and\n\t\t\t\t\t(maxRAM <> - 1 implies minRAM <= maxRAM) and minCPU >= 0 and maxCPU >= - 1 and (maxCPU <> - 1 implies minCPU <=\n\t\t\t\t\tmaxCPU) and minStorage >= 0 and maxStorage >= - 1 and (maxStorage <> - 1 implies minStorage <= maxStorage)\n}.status' vert_scale_requirement_activ_one_alt='Tuple {\n\tmessage : String = \'In VerticalScaleRequirement: \' + self.name +\n\t\t\t\t\t\' the maximum value for no VM characteristic has been specified\',\n\tstatus : Boolean = maxCores > 0 or maxCores = - 1 or maxCPU > 0 or\n\t\t\t\t\tmaxCPU = - 1 or maxRAM > 0 or maxRAM = - 1 or maxStorage > 0 or maxStorage = - 1\n}.status'"
 * @generated
 */
public interface VerticalScaleRequirement extends ScaleRequirement {
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
	 * @see eu.paasage.camel.requirement.RequirementPackage#getVerticalScaleRequirement_MinCPU()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='ScalabilityRule' unique='false' upper='*'"
	 * @generated
	 */
	double getMinCPU();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMinCPU <em>Min CPU</em>}' attribute.
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
	 * @see eu.paasage.camel.requirement.RequirementPackage#getVerticalScaleRequirement_MaxCPU()
	 * @model
	 * @generated
	 */
	double getMaxCPU();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMaxCPU <em>Max CPU</em>}' attribute.
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
	 * @see eu.paasage.camel.requirement.RequirementPackage#getVerticalScaleRequirement_MinCores()
	 * @model
	 * @generated
	 */
	int getMinCores();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMinCores <em>Min Cores</em>}' attribute.
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
	 * @see eu.paasage.camel.requirement.RequirementPackage#getVerticalScaleRequirement_MaxCores()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='ScalabilityRule' unique='false' upper='*'"
	 * @generated
	 */
	int getMaxCores();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMaxCores <em>Max Cores</em>}' attribute.
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
	 * @see eu.paasage.camel.requirement.RequirementPackage#getVerticalScaleRequirement_MinRAM()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='Property' unique='false' upper='*'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='ScalabilityRule' unique='false' upper='*'"
	 * @generated
	 */
	int getMinRAM();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMinRAM <em>Min RAM</em>}' attribute.
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
	 * @see eu.paasage.camel.requirement.RequirementPackage#getVerticalScaleRequirement_MaxRAM()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='ScalabilityRule' unique='false' upper='*'"
	 * @generated
	 */
	int getMaxRAM();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMaxRAM <em>Max RAM</em>}' attribute.
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
	 * @see eu.paasage.camel.requirement.RequirementPackage#getVerticalScaleRequirement_MinStorage()
	 * @model
	 * @generated
	 */
	int getMinStorage();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMinStorage <em>Min Storage</em>}' attribute.
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
	 * @see eu.paasage.camel.requirement.RequirementPackage#getVerticalScaleRequirement_MaxStorage()
	 * @model
	 * @generated
	 */
	int getMaxStorage();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMaxStorage <em>Max Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Storage</em>' attribute.
	 * @see #getMaxStorage()
	 * @generated
	 */
	void setMaxStorage(int value);

	/**
	 * Returns the value of the '<em><b>Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm</em>' reference.
	 * @see #setVm(VM)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getVerticalScaleRequirement_Vm()
	 * @model required="true"
	 * @generated
	 */
	VM getVm();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getVm <em>Vm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm</em>' reference.
	 * @see #getVm()
	 * @generated
	 */
	void setVm(VM value);

} // VerticalScaleRequirement
