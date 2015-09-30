/**
 */
package eu.paasage.camel.deployment;

import eu.paasage.camel.requirement.LocationRequirement;
import eu.paasage.camel.requirement.OSOrImageRequirement;
import eu.paasage.camel.requirement.ProviderRequirement;
import eu.paasage.camel.requirement.QualitativeHardwareRequirement;
import eu.paasage.camel.requirement.QuantitativeHardwareRequirement;
import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM Requirement Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.VMRequirementSet#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.VMRequirementSet#getLocationRequirement <em>Location Requirement</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.VMRequirementSet#getProviderRequirement <em>Provider Requirement</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.VMRequirementSet#getQualitativeHardwareRequirement <em>Qualitative Hardware Requirement</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.VMRequirementSet#getQuantitativeHardwareRequirement <em>Quantitative Hardware Requirement</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.VMRequirementSet#getOsOrImageRequirement <em>Os Or Image Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.deployment.DeploymentPackage#getVMRequirementSet()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='at_least_one_alternative_in_vm_req_set'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot at_least_one_alternative_in_vm_req_set='Tuple {\n\tmessage : String = \'VMRequirementSet: \' + self.name +\n\t\t\t\t\' should include the specification of at least one requirement\',\n\tstatus : Boolean = (locationRequirement <> null or\n\t\t\t\tproviderRequirement <> null or osOrImageRequirement <> null or qualitativeHardwareRequirement <> null or\n\t\t\t\tquantitativeHardwareRequirement <> null)\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface VMRequirementSet extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getVMRequirementSet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.VMRequirementSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Requirement</em>' reference.
	 * @see #setLocationRequirement(LocationRequirement)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getVMRequirementSet_LocationRequirement()
	 * @model
	 * @generated
	 */
	LocationRequirement getLocationRequirement();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.VMRequirementSet#getLocationRequirement <em>Location Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Requirement</em>' reference.
	 * @see #getLocationRequirement()
	 * @generated
	 */
	void setLocationRequirement(LocationRequirement value);

	/**
	 * Returns the value of the '<em><b>Provider Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Requirement</em>' reference.
	 * @see #setProviderRequirement(ProviderRequirement)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getVMRequirementSet_ProviderRequirement()
	 * @model
	 * @generated
	 */
	ProviderRequirement getProviderRequirement();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.VMRequirementSet#getProviderRequirement <em>Provider Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Requirement</em>' reference.
	 * @see #getProviderRequirement()
	 * @generated
	 */
	void setProviderRequirement(ProviderRequirement value);

	/**
	 * Returns the value of the '<em><b>Qualitative Hardware Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualitative Hardware Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualitative Hardware Requirement</em>' reference.
	 * @see #setQualitativeHardwareRequirement(QualitativeHardwareRequirement)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getVMRequirementSet_QualitativeHardwareRequirement()
	 * @model annotation="teneo.jpa value='@JoinColumn(name=\"qualitativehardwarerequirement\")'"
	 * @generated
	 */
	QualitativeHardwareRequirement getQualitativeHardwareRequirement();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.VMRequirementSet#getQualitativeHardwareRequirement <em>Qualitative Hardware Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualitative Hardware Requirement</em>' reference.
	 * @see #getQualitativeHardwareRequirement()
	 * @generated
	 */
	void setQualitativeHardwareRequirement(QualitativeHardwareRequirement value);

	/**
	 * Returns the value of the '<em><b>Quantitative Hardware Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantitative Hardware Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantitative Hardware Requirement</em>' reference.
	 * @see #setQuantitativeHardwareRequirement(QuantitativeHardwareRequirement)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getVMRequirementSet_QuantitativeHardwareRequirement()
	 * @model annotation="teneo.jpa value='@JoinColumn(name=\"quantitativehardwarerequirement\")'"
	 * @generated
	 */
	QuantitativeHardwareRequirement getQuantitativeHardwareRequirement();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.VMRequirementSet#getQuantitativeHardwareRequirement <em>Quantitative Hardware Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantitative Hardware Requirement</em>' reference.
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	void setQuantitativeHardwareRequirement(QuantitativeHardwareRequirement value);

	/**
	 * Returns the value of the '<em><b>Os Or Image Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Or Image Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Or Image Requirement</em>' reference.
	 * @see #setOsOrImageRequirement(OSOrImageRequirement)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getVMRequirementSet_OsOrImageRequirement()
	 * @model
	 * @generated
	 */
	OSOrImageRequirement getOsOrImageRequirement();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.VMRequirementSet#getOsOrImageRequirement <em>Os Or Image Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Or Image Requirement</em>' reference.
	 * @see #getOsOrImageRequirement()
	 * @generated
	 */
	void setOsOrImageRequirement(OSOrImageRequirement value);

} // VMRequirementSet
