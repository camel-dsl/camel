/**
 */
package eu.paasage.camel.deployment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.InternalComponent#getCompositeInternalComponents <em>Composite Internal Components</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.InternalComponent#getRequiredCommunications <em>Required Communications</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.InternalComponent#getRequiredHost <em>Required Host</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.InternalComponent#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.deployment.DeploymentPackage#getInternalComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='no_recursion_in_parts_of_internal_component'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot no_recursion_in_parts_of_internal_component='Tuple {\n\tmessage : String = \'InternalComponent: \' + self.name +\n\t\t\t\t\' should not be recursively contained by itself via the compositeInternalComponent association\',\n\tstatus : Boolean = not\n\t\t\t\t(self.contains(self, self))\n}.status'"
 * @generated
 */
public interface InternalComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Composite Internal Components</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.InternalComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Internal Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Internal Components</em>' containment reference list.
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getInternalComponent_CompositeInternalComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalComponent> getCompositeInternalComponents();

	/**
	 * Returns the value of the '<em><b>Required Communications</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.RequiredCommunication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Communications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Communications</em>' containment reference list.
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getInternalComponent_RequiredCommunications()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredCommunication> getRequiredCommunications();

	/**
	 * Returns the value of the '<em><b>Required Host</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Host</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Host</em>' containment reference.
	 * @see #setRequiredHost(RequiredHost)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getInternalComponent_RequiredHost()
	 * @model containment="true"
	 * @generated
	 */
	RequiredHost getRequiredHost();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.InternalComponent#getRequiredHost <em>Required Host</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Host</em>' containment reference.
	 * @see #getRequiredHost()
	 * @generated
	 */
	void setRequiredHost(RequiredHost value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getInternalComponent_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.InternalComponent#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model icRequired="true" rcRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='ic.compositeInternalComponents\n\t\t\t\t\t->exists(p | p.name = rc.name or p.contains(p, rc))'"
	 * @generated
	 */
	boolean contains(InternalComponent ic, InternalComponent rc);

} // InternalComponent
