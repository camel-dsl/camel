/**
 */
package eu.paasage.camel.requirement;

import eu.paasage.camel.Application;

import eu.paasage.camel.deployment.InternalComponent;

import eu.paasage.camel.security.SecurityControl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.SecurityRequirement#getSecurityControls <em>Security Controls</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.SecurityRequirement#getApplication <em>Application</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.SecurityRequirement#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.requirement.RequirementPackage#getSecurityRequirement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='security_req_component_in_app'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot security_req_component_in_app='Tuple {\n\tmessage : String = \'SecurityRequirement\' + self.name +\n\t\t\t\t\t\' maps to a component  which is not included in any deploymentModel of the respective application referenced\',\n\tstatus : Boolean = (application\n\t\t\t\t\t<> null and component <> null) implies application.deploymentModels\n\t\t\t\t\t->exists(d | (d.internalComponents\n\t\t\t\t\t\t->includes(component)))\n}.status'"
 * @generated
 */
public interface SecurityRequirement extends HardRequirement {
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
	 * @see eu.paasage.camel.requirement.RequirementPackage#getSecurityRequirement_SecurityControls()
	 * @model required="true"
	 * @generated
	 */
	EList<SecurityControl> getSecurityControls();

	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference.
	 * @see #setApplication(Application)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getSecurityRequirement_Application()
	 * @model
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.SecurityRequirement#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(InternalComponent)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getSecurityRequirement_Component()
	 * @model
	 * @generated
	 */
	InternalComponent getComponent();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.SecurityRequirement#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(InternalComponent value);

} // SecurityRequirement
