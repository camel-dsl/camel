/**
 */
package eu.paasage.camel.unit.util;

import eu.paasage.camel.unit.*;

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
 * @see eu.paasage.camel.unit.UnitPackage
 * @generated
 */
public class UnitValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UnitValidator INSTANCE = new UnitValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eu.paasage.camel.unit";

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
	public UnitValidator() {
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
	  return UnitPackage.eINSTANCE;
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
			case UnitPackage.UNIT:
				return validateUnit((Unit)value, diagnostics, context);
			case UnitPackage.CORE_UNIT:
				return validateCoreUnit((CoreUnit)value, diagnostics, context);
			case UnitPackage.DIMENSIONLESS:
				return validateDimensionless((Dimensionless)value, diagnostics, context);
			case UnitPackage.MONETARY_UNIT:
				return validateMonetaryUnit((MonetaryUnit)value, diagnostics, context);
			case UnitPackage.REQUEST_UNIT:
				return validateRequestUnit((RequestUnit)value, diagnostics, context);
			case UnitPackage.STORAGE_UNIT:
				return validateStorageUnit((StorageUnit)value, diagnostics, context);
			case UnitPackage.THROUGHPUT_UNIT:
				return validateThroughputUnit((ThroughputUnit)value, diagnostics, context);
			case UnitPackage.TIME_INTERVAL_UNIT:
				return validateTimeIntervalUnit((TimeIntervalUnit)value, diagnostics, context);
			case UnitPackage.TRANSACTION_UNIT:
				return validateTransactionUnit((TransactionUnit)value, diagnostics, context);
			case UnitPackage.UNIT_MODEL:
				return validateUnitModel((UnitModel)value, diagnostics, context);
			case UnitPackage.UNIT_TYPE:
				return validateUnitType((UnitType)value, diagnostics, context);
			case UnitPackage.UNIT_DIMENSION_TYPE:
				return validateUnitDimensionType((UnitDimensionType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnit(Unit unit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)unit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)unit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)unit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)unit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)unit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)unit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)unit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)unit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)unit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_correct_unit(unit, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the correct_unit constraint of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNIT__CORRECT_UNIT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Unit: ' + name + ' is incorrect as its type( ' + self.unit.toString() +\n" +
		"\t\t\t\t\t\t' that does not correspond to its dimension',\n" +
		"\tstatus : Boolean = checkUnit()\n" +
		"}.status";

	/**
	 * Validates the correct_unit constraint of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnit_correct_unit(Unit unit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UnitPackage.Literals.UNIT,
				 unit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correct_unit",
				 UNIT__CORRECT_UNIT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoreUnit(CoreUnit coreUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)coreUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)coreUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)coreUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)coreUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)coreUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)coreUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)coreUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)coreUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)coreUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_correct_unit(coreUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionless(Dimensionless dimensionless, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)dimensionless, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)dimensionless, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)dimensionless, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)dimensionless, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)dimensionless, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)dimensionless, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)dimensionless, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)dimensionless, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)dimensionless, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_correct_unit(dimensionless, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonetaryUnit(MonetaryUnit monetaryUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)monetaryUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)monetaryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)monetaryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)monetaryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)monetaryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)monetaryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)monetaryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)monetaryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)monetaryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_correct_unit(monetaryUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestUnit(RequestUnit requestUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)requestUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)requestUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)requestUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)requestUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)requestUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)requestUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)requestUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)requestUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)requestUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_correct_unit(requestUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageUnit(StorageUnit storageUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)storageUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)storageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)storageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)storageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)storageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)storageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)storageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)storageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)storageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_correct_unit(storageUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThroughputUnit(ThroughputUnit throughputUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)throughputUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)throughputUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)throughputUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)throughputUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)throughputUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)throughputUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)throughputUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)throughputUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)throughputUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_correct_unit(throughputUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeIntervalUnit(TimeIntervalUnit timeIntervalUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)timeIntervalUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)timeIntervalUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)timeIntervalUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)timeIntervalUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)timeIntervalUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)timeIntervalUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)timeIntervalUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)timeIntervalUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)timeIntervalUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_correct_unit(timeIntervalUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionUnit(TransactionUnit transactionUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)transactionUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)transactionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)transactionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)transactionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)transactionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)transactionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)transactionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)transactionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)transactionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_correct_unit(transactionUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitModel(UnitModel unitModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)unitModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitType(UnitType unitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitDimensionType(UnitDimensionType unitDimensionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //UnitValidator
