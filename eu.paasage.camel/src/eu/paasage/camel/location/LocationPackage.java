/**
 */
package eu.paasage.camel.location;

import eu.paasage.camel.CamelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.location.LocationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface LocationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "location";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.paasage.eu/2015/06/camel/location";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "location";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LocationPackage eINSTANCE = eu.paasage.camel.location.impl.LocationPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.paasage.camel.location.impl.LocationModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.location.impl.LocationModelImpl
	 * @see eu.paasage.camel.location.impl.LocationPackageImpl#getLocationModel()
	 * @generated
	 */
	int LOCATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_MODEL__NAME = CamelPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_MODEL__IMPORT_URI = CamelPackage.MODEL__IMPORT_URI;

	/**
	 * The feature id for the '<em><b>Cloud Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_MODEL__CLOUD_LOCATIONS = CamelPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_MODEL__COUNTRIES = CamelPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_MODEL__REGIONS = CamelPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_MODEL_FEATURE_COUNT = CamelPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_MODEL_OPERATION_COUNT = CamelPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.location.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.location.impl.LocationImpl
	 * @see eu.paasage.camel.location.impl.LocationPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = 0;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.location.impl.CloudLocationImpl <em>Cloud Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.location.impl.CloudLocationImpl
	 * @see eu.paasage.camel.location.impl.LocationPackageImpl#getCloudLocation()
	 * @generated
	 */
	int CLOUD_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_LOCATION__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Is Assignable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_LOCATION__IS_ASSIGNABLE = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_LOCATION__SUB_LOCATIONS = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_LOCATION__PARENT = LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Geographical Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_LOCATION__GEOGRAPHICAL_REGION = LOCATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cloud Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_LOCATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Check Recursiveness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_LOCATION___CHECK_RECURSIVENESS__CLOUDLOCATION_CLOUDLOCATION = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cloud Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_LOCATION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.location.impl.GeographicalRegionImpl <em>Geographical Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.location.impl.GeographicalRegionImpl
	 * @see eu.paasage.camel.location.impl.LocationPackageImpl#getGeographicalRegion()
	 * @generated
	 */
	int GEOGRAPHICAL_REGION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__NAME = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Regions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__PARENT_REGIONS = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alternative Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__ALTERNATIVE_NAMES = LOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Geographical Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Geographical Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.location.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.location.impl.CountryImpl
	 * @see eu.paasage.camel.location.impl.LocationPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__ID = GEOGRAPHICAL_REGION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = GEOGRAPHICAL_REGION__NAME;

	/**
	 * The feature id for the '<em><b>Parent Regions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__PARENT_REGIONS = GEOGRAPHICAL_REGION__PARENT_REGIONS;

	/**
	 * The feature id for the '<em><b>Alternative Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__ALTERNATIVE_NAMES = GEOGRAPHICAL_REGION__ALTERNATIVE_NAMES;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = GEOGRAPHICAL_REGION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = GEOGRAPHICAL_REGION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.location.LocationModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see eu.paasage.camel.location.LocationModel
	 * @generated
	 */
	EClass getLocationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.location.LocationModel#getCloudLocations <em>Cloud Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cloud Locations</em>'.
	 * @see eu.paasage.camel.location.LocationModel#getCloudLocations()
	 * @see #getLocationModel()
	 * @generated
	 */
	EReference getLocationModel_CloudLocations();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.location.LocationModel#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Countries</em>'.
	 * @see eu.paasage.camel.location.LocationModel#getCountries()
	 * @see #getLocationModel()
	 * @generated
	 */
	EReference getLocationModel_Countries();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.location.LocationModel#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regions</em>'.
	 * @see eu.paasage.camel.location.LocationModel#getRegions()
	 * @see #getLocationModel()
	 * @generated
	 */
	EReference getLocationModel_Regions();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.location.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see eu.paasage.camel.location.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.location.Location#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eu.paasage.camel.location.Location#getId()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Id();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.location.CloudLocation <em>Cloud Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Location</em>'.
	 * @see eu.paasage.camel.location.CloudLocation
	 * @generated
	 */
	EClass getCloudLocation();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.location.CloudLocation#isIsAssignable <em>Is Assignable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Assignable</em>'.
	 * @see eu.paasage.camel.location.CloudLocation#isIsAssignable()
	 * @see #getCloudLocation()
	 * @generated
	 */
	EAttribute getCloudLocation_IsAssignable();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.location.CloudLocation#getSubLocations <em>Sub Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Locations</em>'.
	 * @see eu.paasage.camel.location.CloudLocation#getSubLocations()
	 * @see #getCloudLocation()
	 * @generated
	 */
	EReference getCloudLocation_SubLocations();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.location.CloudLocation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see eu.paasage.camel.location.CloudLocation#getParent()
	 * @see #getCloudLocation()
	 * @generated
	 */
	EReference getCloudLocation_Parent();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.location.CloudLocation#getGeographicalRegion <em>Geographical Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geographical Region</em>'.
	 * @see eu.paasage.camel.location.CloudLocation#getGeographicalRegion()
	 * @see #getCloudLocation()
	 * @generated
	 */
	EReference getCloudLocation_GeographicalRegion();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.location.CloudLocation#checkRecursiveness(eu.paasage.camel.location.CloudLocation, eu.paasage.camel.location.CloudLocation) <em>Check Recursiveness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Recursiveness</em>' operation.
	 * @see eu.paasage.camel.location.CloudLocation#checkRecursiveness(eu.paasage.camel.location.CloudLocation, eu.paasage.camel.location.CloudLocation)
	 * @generated
	 */
	EOperation getCloudLocation__CheckRecursiveness__CloudLocation_CloudLocation();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.location.GeographicalRegion <em>Geographical Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geographical Region</em>'.
	 * @see eu.paasage.camel.location.GeographicalRegion
	 * @generated
	 */
	EClass getGeographicalRegion();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.location.GeographicalRegion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.location.GeographicalRegion#getName()
	 * @see #getGeographicalRegion()
	 * @generated
	 */
	EAttribute getGeographicalRegion_Name();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.location.GeographicalRegion#getParentRegions <em>Parent Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Regions</em>'.
	 * @see eu.paasage.camel.location.GeographicalRegion#getParentRegions()
	 * @see #getGeographicalRegion()
	 * @generated
	 */
	EReference getGeographicalRegion_ParentRegions();

	/**
	 * Returns the meta object for the attribute list '{@link eu.paasage.camel.location.GeographicalRegion#getAlternativeNames <em>Alternative Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Alternative Names</em>'.
	 * @see eu.paasage.camel.location.GeographicalRegion#getAlternativeNames()
	 * @see #getGeographicalRegion()
	 * @generated
	 */
	EAttribute getGeographicalRegion_AlternativeNames();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.location.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see eu.paasage.camel.location.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LocationFactory getLocationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.paasage.camel.location.impl.LocationModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.location.impl.LocationModelImpl
		 * @see eu.paasage.camel.location.impl.LocationPackageImpl#getLocationModel()
		 * @generated
		 */
		EClass LOCATION_MODEL = eINSTANCE.getLocationModel();

		/**
		 * The meta object literal for the '<em><b>Cloud Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_MODEL__CLOUD_LOCATIONS = eINSTANCE.getLocationModel_CloudLocations();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_MODEL__COUNTRIES = eINSTANCE.getLocationModel_Countries();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_MODEL__REGIONS = eINSTANCE.getLocationModel_Regions();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.location.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.location.impl.LocationImpl
		 * @see eu.paasage.camel.location.impl.LocationPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ID = eINSTANCE.getLocation_Id();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.location.impl.CloudLocationImpl <em>Cloud Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.location.impl.CloudLocationImpl
		 * @see eu.paasage.camel.location.impl.LocationPackageImpl#getCloudLocation()
		 * @generated
		 */
		EClass CLOUD_LOCATION = eINSTANCE.getCloudLocation();

		/**
		 * The meta object literal for the '<em><b>Is Assignable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_LOCATION__IS_ASSIGNABLE = eINSTANCE.getCloudLocation_IsAssignable();

		/**
		 * The meta object literal for the '<em><b>Sub Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_LOCATION__SUB_LOCATIONS = eINSTANCE.getCloudLocation_SubLocations();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_LOCATION__PARENT = eINSTANCE.getCloudLocation_Parent();

		/**
		 * The meta object literal for the '<em><b>Geographical Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_LOCATION__GEOGRAPHICAL_REGION = eINSTANCE.getCloudLocation_GeographicalRegion();

		/**
		 * The meta object literal for the '<em><b>Check Recursiveness</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_LOCATION___CHECK_RECURSIVENESS__CLOUDLOCATION_CLOUDLOCATION = eINSTANCE.getCloudLocation__CheckRecursiveness__CloudLocation_CloudLocation();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.location.impl.GeographicalRegionImpl <em>Geographical Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.location.impl.GeographicalRegionImpl
		 * @see eu.paasage.camel.location.impl.LocationPackageImpl#getGeographicalRegion()
		 * @generated
		 */
		EClass GEOGRAPHICAL_REGION = eINSTANCE.getGeographicalRegion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOGRAPHICAL_REGION__NAME = eINSTANCE.getGeographicalRegion_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Regions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOGRAPHICAL_REGION__PARENT_REGIONS = eINSTANCE.getGeographicalRegion_ParentRegions();

		/**
		 * The meta object literal for the '<em><b>Alternative Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOGRAPHICAL_REGION__ALTERNATIVE_NAMES = eINSTANCE.getGeographicalRegion_AlternativeNames();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.location.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.location.impl.CountryImpl
		 * @see eu.paasage.camel.location.impl.LocationPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

	}

} //LocationPackage
