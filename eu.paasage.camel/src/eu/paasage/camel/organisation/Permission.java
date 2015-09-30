/**
 */
package eu.paasage.camel.organisation;

import eu.paasage.camel.ActionType;
import java.util.Date;
import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.Permission#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.Permission#getRole <em>Role</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.Permission#getStart <em>Start</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.Permission#getEnd <em>End</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.Permission#getResourceFilter <em>Resource Filter</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.Permission#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.organisation.OrganisationPackage#getPermission()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='permission_valid_actions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot permission_valid_actions='Tuple {\n\tmessage : String = \'Wrong actions were identified for resource:\' + self.resourceFilter.name +\n\t\t\t\t\t\' in the context of Permission: \' + self.name,\n\tstatus : Boolean = self.action = camel::ActionType::READ or self.action =\n\t\t\t\t\tcamel::ActionType::WRITE\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface Permission extends CDOObject {
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
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getPermission_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.Permission#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getPermission_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.Permission#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getPermission_Start()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='Requires'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='Requires'"
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.Permission#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getPermission_End()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='Requires'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='Requires'"
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.Permission#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Resource Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Filter</em>' reference.
	 * @see #setResourceFilter(ResourceFilter)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getPermission_ResourceFilter()
	 * @model required="true"
	 * @generated
	 */
	ResourceFilter getResourceFilter();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.Permission#getResourceFilter <em>Resource Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Filter</em>' reference.
	 * @see #getResourceFilter()
	 * @generated
	 */
	void setResourceFilter(ResourceFilter value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see eu.paasage.camel.ActionType
	 * @see #setAction(ActionType)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getPermission_Action()
	 * @model required="true"
	 * @generated
	 */
	ActionType getAction();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.Permission#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see eu.paasage.camel.ActionType
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model thisRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='System.out.println(\"CHECKING Permission_Start_Before_End: \" + this + \" \" + this.getStart() + \" \" + this.getEnd()); java.util.Date date1 = this.getStart(); java.util.Date date2 = this.getEnd(); if (date1 == null || date2 == null || (date1 != null && date2 != null && date1.before(date2))) return Boolean.TRUE; return Boolean.FALSE;'"
	 * @generated
	 */
	boolean checkStartEndDates(Permission this_);

} // Permission
