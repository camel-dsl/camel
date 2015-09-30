/**
 */
package eu.paasage.camel.location.util;

import eu.paasage.camel.location.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.location.LocationPackage
 * @generated
 */
public class LocationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LocationValidator INSTANCE = new LocationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eu.paasage.camel.location";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return LocationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case LocationPackage.LOCATION_MODEL:
				return validateLocationModel((LocationModel)value, diagnostics, context);
			case LocationPackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case LocationPackage.CLOUD_LOCATION:
				return validateCloudLocation((CloudLocation)value, diagnostics, context);
			case LocationPackage.GEOGRAPHICAL_REGION:
				return validateGeographicalRegion((GeographicalRegion)value, diagnostics, context);
			case LocationPackage.COUNTRY:
				return validateCountry((Country)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationModel(LocationModel locationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)locationModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)location, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudLocation(CloudLocation cloudLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)cloudLocation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)cloudLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)cloudLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)cloudLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)cloudLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)cloudLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)cloudLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)cloudLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)cloudLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudLocation_cloud_location_same_as_parent(cloudLocation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the cloud_location_same_as_parent constraint of '<em>Cloud Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLOUD_LOCATION__CLOUD_LOCATION_SAME_AS_PARENT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'CloudLocation: ' + self.id +\n" +
		"\t\t\t\t\t' should not be the same as its parent',\n" +
		"\tstatus : Boolean = parent <> null implies parent.id <> self.id\n" +
		"}.status";

	/**
	 * Validates the cloud_location_same_as_parent constraint of '<em>Cloud Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudLocation_cloud_location_same_as_parent(CloudLocation cloudLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(LocationPackage.Literals.CLOUD_LOCATION,
				 cloudLocation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "cloud_location_same_as_parent",
				 CLOUD_LOCATION__CLOUD_LOCATION_SAME_AS_PARENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeographicalRegion(GeographicalRegion geographicalRegion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)geographicalRegion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)geographicalRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)geographicalRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)geographicalRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)geographicalRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)geographicalRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)geographicalRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)geographicalRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)geographicalRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeographicalRegion_geographical_region_not_in_parents(geographicalRegion, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the geographical_region_not_in_parents constraint of '<em>Geographical Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GEOGRAPHICAL_REGION__GEOGRAPHICAL_REGION_NOT_IN_PARENTS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Geographical Region:' + self.name +\n" +
		"\t\t\t\t\t' cannot be equivalent to any of its parents',\n" +
		"\tstatus : Boolean = self.parentRegions\n" +
		"\t\t\t\t\t->forAll(p | p.name <> self.name)\n" +
		"}.status";

	/**
	 * Validates the geographical_region_not_in_parents constraint of '<em>Geographical Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeographicalRegion_geographical_region_not_in_parents(GeographicalRegion geographicalRegion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(LocationPackage.Literals.GEOGRAPHICAL_REGION,
				 geographicalRegion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "geographical_region_not_in_parents",
				 GEOGRAPHICAL_REGION__GEOGRAPHICAL_REGION_NOT_IN_PARENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountry(Country country, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)country, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)country, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeographicalRegion_geographical_region_not_in_parents(country, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //LocationValidator
