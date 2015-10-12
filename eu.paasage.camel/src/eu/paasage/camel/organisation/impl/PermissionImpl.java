/**
 */
package eu.paasage.camel.organisation.impl;

import eu.paasage.camel.ActionType;

import eu.paasage.camel.organisation.OrganisationPackage;
import eu.paasage.camel.organisation.Permission;
import eu.paasage.camel.organisation.ResourceFilter;
import eu.paasage.camel.organisation.Role;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.impl.PermissionImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.PermissionImpl#getRole <em>Role</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.PermissionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.PermissionImpl#getEnd <em>End</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.PermissionImpl#getResourceFilter <em>Resource Filter</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.PermissionImpl#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PermissionImpl extends CDOObjectImpl implements Permission {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganisationPackage.Literals.PERMISSION;
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
		return (String)eGet(OrganisationPackage.Literals.PERMISSION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(OrganisationPackage.Literals.PERMISSION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		return (Role)eGet(OrganisationPackage.Literals.PERMISSION__ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		eSet(OrganisationPackage.Literals.PERMISSION__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return (Date)eGet(OrganisationPackage.Literals.PERMISSION__START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		eSet(OrganisationPackage.Literals.PERMISSION__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return (Date)eGet(OrganisationPackage.Literals.PERMISSION__END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		eSet(OrganisationPackage.Literals.PERMISSION__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceFilter getResourceFilter() {
		return (ResourceFilter)eGet(OrganisationPackage.Literals.PERMISSION__RESOURCE_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceFilter(ResourceFilter newResourceFilter) {
		eSet(OrganisationPackage.Literals.PERMISSION__RESOURCE_FILTER, newResourceFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType getAction() {
		return (ActionType)eGet(OrganisationPackage.Literals.PERMISSION__ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ActionType newAction) {
		eSet(OrganisationPackage.Literals.PERMISSION__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkStartEndDates(final Permission this_) {
		System.out.println("CHECKING Permission_Start_Before_End: " + this + " " + this.getStart() + " " + this.getEnd()); java.util.Date date1 = this.getStart(); java.util.Date date2 = this.getEnd(); if (date1 == null || date2 == null || (date1 != null && date2 != null && date1.before(date2))) return Boolean.TRUE; return Boolean.FALSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OrganisationPackage.PERMISSION___CHECK_START_END_DATES__PERMISSION:
				return checkStartEndDates((Permission)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PermissionImpl
