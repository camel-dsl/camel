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
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.Permission#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.Permission#getRole <em>Role</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.Permission#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.Permission#getEndTime <em>End Time</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.Permission#getResourceFilter <em>Resource Filter</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.Permission#getAction <em>Action</em>}</li>
 * </ul>
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
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getPermission_StartTime()
	 * @model required="true"
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.Permission#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Date)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getPermission_EndTime()
	 * @model
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.Permission#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='System.out.println(\"CHECKING Permission_Start_Before_End: \" + this + \" \" + this.getStartTime() + \" \" + this.getEndTime()); java.util.Date date1 = this.getStartTime(); java.util.Date date2 = this.getEndTime(); if (date1 == null || date2 == null || (date1 != null && date2 != null && date1.before(date2))) return Boolean.TRUE; return Boolean.FALSE;'"
	 * @generated
	 */
	boolean checkStartEndDates(Permission this_);

} // Permission
