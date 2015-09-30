/**
 */
package eu.paasage.camel.unit.impl;

import eu.paasage.camel.unit.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitFactoryImpl extends EFactoryImpl implements UnitFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitFactory init() {
		try {
			UnitFactory theUnitFactory = (UnitFactory)EPackage.Registry.INSTANCE.getEFactory(UnitPackage.eNS_URI);
			if (theUnitFactory != null) {
				return theUnitFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UnitFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UnitPackage.CORE_UNIT: return (EObject)createCoreUnit();
			case UnitPackage.DIMENSIONLESS: return (EObject)createDimensionless();
			case UnitPackage.MONETARY_UNIT: return (EObject)createMonetaryUnit();
			case UnitPackage.REQUEST_UNIT: return (EObject)createRequestUnit();
			case UnitPackage.STORAGE_UNIT: return (EObject)createStorageUnit();
			case UnitPackage.THROUGHPUT_UNIT: return (EObject)createThroughputUnit();
			case UnitPackage.TIME_INTERVAL_UNIT: return (EObject)createTimeIntervalUnit();
			case UnitPackage.TRANSACTION_UNIT: return (EObject)createTransactionUnit();
			case UnitPackage.UNIT_MODEL: return (EObject)createUnitModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UnitPackage.UNIT_TYPE:
				return createUnitTypeFromString(eDataType, initialValue);
			case UnitPackage.UNIT_DIMENSION_TYPE:
				return createUnitDimensionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UnitPackage.UNIT_TYPE:
				return convertUnitTypeToString(eDataType, instanceValue);
			case UnitPackage.UNIT_DIMENSION_TYPE:
				return convertUnitDimensionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreUnit createCoreUnit() {
		CoreUnitImpl coreUnit = new CoreUnitImpl();
		return coreUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimensionless createDimensionless() {
		DimensionlessImpl dimensionless = new DimensionlessImpl();
		return dimensionless;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonetaryUnit createMonetaryUnit() {
		MonetaryUnitImpl monetaryUnit = new MonetaryUnitImpl();
		return monetaryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestUnit createRequestUnit() {
		RequestUnitImpl requestUnit = new RequestUnitImpl();
		return requestUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageUnit createStorageUnit() {
		StorageUnitImpl storageUnit = new StorageUnitImpl();
		return storageUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThroughputUnit createThroughputUnit() {
		ThroughputUnitImpl throughputUnit = new ThroughputUnitImpl();
		return throughputUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeIntervalUnit createTimeIntervalUnit() {
		TimeIntervalUnitImpl timeIntervalUnit = new TimeIntervalUnitImpl();
		return timeIntervalUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionUnit createTransactionUnit() {
		TransactionUnitImpl transactionUnit = new TransactionUnitImpl();
		return transactionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitModel createUnitModel() {
		UnitModelImpl unitModel = new UnitModelImpl();
		return unitModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitTypeFromString(EDataType eDataType, String initialValue) {
		UnitType result = UnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitDimensionType createUnitDimensionTypeFromString(EDataType eDataType, String initialValue) {
		UnitDimensionType result = UnitDimensionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitDimensionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitPackage getUnitPackage() {
		return (UnitPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UnitPackage getPackage() {
		return UnitPackage.eINSTANCE;
	}

} //UnitFactoryImpl
