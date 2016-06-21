/**
 */
package eu.paasage.camel.security;

import eu.paasage.camel.organisation.DataCenter;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.security.SecurityCapability#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.security.SecurityCapability#getSecurityControls <em>Security Controls</em>}</li>
 *   <li>{@link eu.paasage.camel.security.SecurityCapability#getDataCenter <em>Data Center</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.security.SecurityPackage#getSecurityCapability()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface SecurityCapability extends CDOObject {
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
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityCapability_Name()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='ServiceLevelObjectiveType'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.security.SecurityCapability#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Security Controls</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.security.SecurityControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Controls</em>' reference list.
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityCapability_SecurityControls()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<SecurityControl> getSecurityControls();

	/**
	 * Returns the value of the '<em><b>Data Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Center</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Center</em>' reference.
	 * @see #setDataCenter(DataCenter)
	 * @see eu.paasage.camel.security.SecurityPackage#getSecurityCapability_DataCenter()
	 * @model
	 * @generated
	 */
	DataCenter getDataCenter();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.security.SecurityCapability#getDataCenter <em>Data Center</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Center</em>' reference.
	 * @see #getDataCenter()
	 * @generated
	 */
	void setDataCenter(DataCenter value);

} // SecurityCapability
