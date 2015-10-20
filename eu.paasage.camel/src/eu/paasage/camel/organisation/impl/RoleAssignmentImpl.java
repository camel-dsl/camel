/**
 */
package eu.paasage.camel.organisation.impl;

import eu.paasage.camel.organisation.OrganisationPackage;
import eu.paasage.camel.organisation.Role;
import eu.paasage.camel.organisation.RoleAssignment;
import eu.paasage.camel.organisation.User;
import eu.paasage.camel.organisation.UserGroup;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.impl.RoleAssignmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.RoleAssignmentImpl#getUser <em>User</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.RoleAssignmentImpl#getRole <em>Role</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.RoleAssignmentImpl#getUserGroup <em>User Group</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.RoleAssignmentImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.RoleAssignmentImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.RoleAssignmentImpl#getAssignmentTime <em>Assignment Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleAssignmentImpl extends CDOObjectImpl implements RoleAssignment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganisationPackage.Literals.ROLE_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(OrganisationPackage.Literals.ROLE_ASSIGNMENT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(OrganisationPackage.Literals.ROLE_ASSIGNMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		return (User)eGet(OrganisationPackage.Literals.ROLE_ASSIGNMENT__USER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser) {
		eSet(OrganisationPackage.Literals.ROLE_ASSIGNMENT__USER, newUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		return (Role)eGet(OrganisationPackage.Literals.ROLE_ASSIGNMENT__ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		eSet(OrganisationPackage.Literals.ROLE_ASSIGNMENT__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserGroup getUserGroup() {
		return (UserGroup)eGet(OrganisationPackage.Literals.ROLE_ASSIGNMENT__USER_GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserGroup(UserGroup newUserGroup) {
		eSet(OrganisationPackage.Literals.ROLE_ASSIGNMENT__USER_GROUP, newUserGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTime() {
		return (Date)eGet(OrganisationPackage.Literals.ROLE_ASSIGNMENT__START_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		eSet(OrganisationPackage.Literals.ROLE_ASSIGNMENT__START_TIME, newStartTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndTime() {
		return (Date)eGet(OrganisationPackage.Literals.ROLE_ASSIGNMENT__END_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(Date newEndTime) {
		eSet(OrganisationPackage.Literals.ROLE_ASSIGNMENT__END_TIME, newEndTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAssignmentTime() {
		return (Date)eGet(OrganisationPackage.Literals.ROLE_ASSIGNMENT__ASSIGNMENT_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignmentTime(Date newAssignmentTime) {
		eSet(OrganisationPackage.Literals.ROLE_ASSIGNMENT__ASSIGNMENT_TIME, newAssignmentTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkAssignedOnDates(final RoleAssignment this_) {
		System.out.println("CHECKING Assignment_Assigned_Before_Start: " + this + " " + this.getStartTime() + " " + this.getEndTime() + " " + this.getAssignmentTime()); java.util.Date date1 = this.getStartTime(); java.util.Date date2 = this.getEndTime(); java.util.Date date = this.getAssignmentTime(); if (date == null) return Boolean.TRUE; else if (date1 != null){ if (date.equals(date1) || date.before(date1)) return Boolean.TRUE; else return Boolean.FALSE;} else if (date2 != null && date.before(date2)) return Boolean.TRUE; return Boolean.FALSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkStartEndDates(final RoleAssignment this_) {
		System.out.println("CHECKING Assignment_Start_Before_End: " + this + " " + this.getStartTime() + " " + this.getEndTime() + " " + this.getAssignmentTime()); java.util.Date date1 = this.getStartTime(); java.util.Date date2 = this.getEndTime(); if (date1 == null || date2 == null || (date1 != null && date2 != null && date1.before(date2))) return Boolean.TRUE; return Boolean.FALSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OrganisationPackage.ROLE_ASSIGNMENT___CHECK_ASSIGNED_ON_DATES__ROLEASSIGNMENT:
				return checkAssignedOnDates((RoleAssignment)arguments.get(0));
			case OrganisationPackage.ROLE_ASSIGNMENT___CHECK_START_END_DATES__ROLEASSIGNMENT:
				return checkStartEndDates((RoleAssignment)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoleAssignmentImpl
