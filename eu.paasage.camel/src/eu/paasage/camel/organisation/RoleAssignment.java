/**
 */
package eu.paasage.camel.organisation;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.RoleAssignment#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.RoleAssignment#getUser <em>User</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.RoleAssignment#getRole <em>Role</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.RoleAssignment#getUserGroup <em>User Group</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.RoleAssignment#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.RoleAssignment#getEndTime <em>End Time</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.RoleAssignment#getAssignmentTime <em>Assignment Time</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.organisation.OrganisationPackage#getRoleAssignment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='role_assignment_at_least_user_or_group same_role_concurrent_assignments'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot role_assignment_at_least_user_or_group='Tuple {\n\tmessage : String = \'There is no user or user group associated to RoleAssigment:\' +\n\t\t\t\t\tself.name,\n\tstatus : Boolean = self.user <> null or self.userGroup <> null\n}.status' same_role_concurrent_assignments='Tuple {\n\tmessage : String = \'There are two or more role assignments which are odentical, i.e., refer to the same organisation, user/user group and role\',\n\tstatus : Boolean = RoleAssignment.allInstances()\n\t\t\t\t\t->forAll(p1, p2 | p1 <> p2 and ((p1.user <> null and p2.user <> null and p1.user = p2.user) or (p1.userGroup <>\n\t\t\t\t\t\tnull and p2.userGroup <> null and p1.userGroup = p2.userGroup)) implies p1.role <> p2.role)\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface RoleAssignment extends CDOObject {
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
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getRoleAssignment_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.RoleAssignment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getRoleAssignment_User()
	 * @model
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.RoleAssignment#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

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
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getRoleAssignment_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.RoleAssignment#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>User Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Group</em>' reference.
	 * @see #setUserGroup(UserGroup)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getRoleAssignment_UserGroup()
	 * @model
	 * @generated
	 */
	UserGroup getUserGroup();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.RoleAssignment#getUserGroup <em>User Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Group</em>' reference.
	 * @see #getUserGroup()
	 * @generated
	 */
	void setUserGroup(UserGroup value);

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
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getRoleAssignment_StartTime()
	 * @model
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.RoleAssignment#getStartTime <em>Start Time</em>}' attribute.
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
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getRoleAssignment_EndTime()
	 * @model
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.RoleAssignment#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Assignment Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Time</em>' attribute.
	 * @see #setAssignmentTime(Date)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getRoleAssignment_AssignmentTime()
	 * @model required="true"
	 * @generated
	 */
	Date getAssignmentTime();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.RoleAssignment#getAssignmentTime <em>Assignment Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment Time</em>' attribute.
	 * @see #getAssignmentTime()
	 * @generated
	 */
	void setAssignmentTime(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model thisRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='System.out.println(\"CHECKING Assignment_Assigned_Before_Start: \" + this + \" \" + this.getStartTime() + \" \" + this.getEndTime() + \" \" + this.getAssignmentTime()); java.util.Date date1 = this.getStartTime(); java.util.Date date2 = this.getEndTime(); java.util.Date date = this.getAssignmentTime(); if (date == null) return Boolean.TRUE; else if (date1 != null){ if (date.equals(date1) || date.before(date1)) return Boolean.TRUE; else return Boolean.FALSE;} else if (date2 != null && date.before(date2)) return Boolean.TRUE; return Boolean.FALSE;'"
	 * @generated
	 */
	boolean checkAssignedOnDates(RoleAssignment this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model thisRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='System.out.println(\"CHECKING Assignment_Start_Before_End: \" + this + \" \" + this.getStartTime() + \" \" + this.getEndTime() + \" \" + this.getAssignmentTime()); java.util.Date date1 = this.getStartTime(); java.util.Date date2 = this.getEndTime(); if (date1 == null || date2 == null || (date1 != null && date2 != null && date1.before(date2))) return Boolean.TRUE; return Boolean.FALSE;'"
	 * @generated
	 */
	boolean checkStartEndDates(RoleAssignment this_);

} // RoleAssignment
