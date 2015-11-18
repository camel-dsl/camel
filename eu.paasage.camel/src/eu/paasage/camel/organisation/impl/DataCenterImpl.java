/**
 */
package eu.paasage.camel.organisation.impl;

import eu.paasage.camel.location.Location;

import eu.paasage.camel.organisation.DataCenter;
import eu.paasage.camel.organisation.OrganisationPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Center</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.impl.DataCenterImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.DataCenterImpl#getCodeName <em>Code Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.DataCenterImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataCenterImpl extends CDOObjectImpl implements DataCenter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCenterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganisationPackage.Literals.DATA_CENTER;
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
		return (String)eGet(OrganisationPackage.Literals.DATA_CENTER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(OrganisationPackage.Literals.DATA_CENTER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeName() {
		return (String)eGet(OrganisationPackage.Literals.DATA_CENTER__CODE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeName(String newCodeName) {
		eSet(OrganisationPackage.Literals.DATA_CENTER__CODE_NAME, newCodeName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		return (Location)eGet(OrganisationPackage.Literals.DATA_CENTER__LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		eSet(OrganisationPackage.Literals.DATA_CENTER__LOCATION, newLocation);
	}

} //DataCenterImpl
