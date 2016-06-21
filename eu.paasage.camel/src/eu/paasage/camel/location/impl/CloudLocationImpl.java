/**
 */
package eu.paasage.camel.location.impl;

import eu.paasage.camel.location.CloudLocation;
import eu.paasage.camel.location.GeographicalRegion;
import eu.paasage.camel.location.LocationPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.location.impl.CloudLocationImpl#isIsAssignable <em>Is Assignable</em>}</li>
 *   <li>{@link eu.paasage.camel.location.impl.CloudLocationImpl#getSubLocations <em>Sub Locations</em>}</li>
 *   <li>{@link eu.paasage.camel.location.impl.CloudLocationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link eu.paasage.camel.location.impl.CloudLocationImpl#getGeographicalRegion <em>Geographical Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudLocationImpl extends LocationImpl implements CloudLocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationPackage.Literals.CLOUD_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAssignable() {
		return (Boolean)eGet(LocationPackage.Literals.CLOUD_LOCATION__IS_ASSIGNABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAssignable(boolean newIsAssignable) {
		eSet(LocationPackage.Literals.CLOUD_LOCATION__IS_ASSIGNABLE, newIsAssignable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CloudLocation> getSubLocations() {
		return (EList<CloudLocation>)eGet(LocationPackage.Literals.CLOUD_LOCATION__SUB_LOCATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudLocation getParent() {
		return (CloudLocation)eGet(LocationPackage.Literals.CLOUD_LOCATION__PARENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(CloudLocation newParent) {
		eSet(LocationPackage.Literals.CLOUD_LOCATION__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicalRegion getGeographicalRegion() {
		return (GeographicalRegion)eGet(LocationPackage.Literals.CLOUD_LOCATION__GEOGRAPHICAL_REGION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeographicalRegion(GeographicalRegion newGeographicalRegion) {
		eSet(LocationPackage.Literals.CLOUD_LOCATION__GEOGRAPHICAL_REGION, newGeographicalRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkRecursiveness(final CloudLocation cl1, final CloudLocation cl2) {
		System.out.println("Checking recursiveness for CloudLocation: " + cl1.getId());
				for (eu.paasage.camel.location.CloudLocation cl: cl1.getSubLocations()){
						if (cl.getId().equals(cl2.getId())) return Boolean.TRUE;
						if (checkRecursiveness(cl,cl2)) return Boolean.TRUE;
				}
				return Boolean.FALSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LocationPackage.CLOUD_LOCATION___CHECK_RECURSIVENESS__CLOUDLOCATION_CLOUDLOCATION:
				return checkRecursiveness((CloudLocation)arguments.get(0), (CloudLocation)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CloudLocationImpl
