/**
 */
package eu.paasage.camel.location.impl;

import eu.paasage.camel.impl.ModelImpl;

import eu.paasage.camel.location.CloudLocation;
import eu.paasage.camel.location.Country;
import eu.paasage.camel.location.GeographicalRegion;
import eu.paasage.camel.location.LocationModel;
import eu.paasage.camel.location.LocationPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.location.impl.LocationModelImpl#getCloudLocations <em>Cloud Locations</em>}</li>
 *   <li>{@link eu.paasage.camel.location.impl.LocationModelImpl#getCountries <em>Countries</em>}</li>
 *   <li>{@link eu.paasage.camel.location.impl.LocationModelImpl#getRegions <em>Regions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationModelImpl extends ModelImpl implements LocationModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationPackage.Literals.LOCATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CloudLocation> getCloudLocations() {
		return (EList<CloudLocation>)eGet(LocationPackage.Literals.LOCATION_MODEL__CLOUD_LOCATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Country> getCountries() {
		return (EList<Country>)eGet(LocationPackage.Literals.LOCATION_MODEL__COUNTRIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GeographicalRegion> getRegions() {
		return (EList<GeographicalRegion>)eGet(LocationPackage.Literals.LOCATION_MODEL__REGIONS, true);
	}

} //LocationModelImpl
