/**
 */
package eu.paasage.camel.location;

import eu.paasage.camel.Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.location.LocationModel#getCloudLocations <em>Cloud Locations</em>}</li>
 *   <li>{@link eu.paasage.camel.location.LocationModel#getCountries <em>Countries</em>}</li>
 *   <li>{@link eu.paasage.camel.location.LocationModel#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.location.LocationPackage#getLocationModel()
 * @model
 * @generated
 */
public interface LocationModel extends Model {
	/**
	 * Returns the value of the '<em><b>Cloud Locations</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.location.CloudLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Locations</em>' containment reference list.
	 * @see eu.paasage.camel.location.LocationPackage#getLocationModel_CloudLocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CloudLocation> getCloudLocations();

	/**
	 * Returns the value of the '<em><b>Countries</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.location.Country}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Countries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countries</em>' containment reference list.
	 * @see eu.paasage.camel.location.LocationPackage#getLocationModel_Countries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Country> getCountries();

	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.location.GeographicalRegion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see eu.paasage.camel.location.LocationPackage#getLocationModel_Regions()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeographicalRegion> getRegions();

} // LocationModel
