/**
 */
package eu.paasage.camel.unit;

import eu.paasage.camel.CamelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see eu.paasage.camel.unit.UnitFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface UnitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "unit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.paasage.eu/2015/06/camel/unit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "unit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnitPackage eINSTANCE = eu.paasage.camel.unit.impl.UnitPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.paasage.camel.unit.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.unit.impl.UnitImpl
	 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Check Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT___CHECK_UNIT = 0;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.unit.impl.CoreUnitImpl <em>Core Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.unit.impl.CoreUnitImpl
	 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getCoreUnit()
	 * @generated
	 */
	int CORE_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_UNIT__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_UNIT__UNIT = UNIT__UNIT;

	/**
	 * The number of structural features of the '<em>Core Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_UNIT___CHECK_UNIT = UNIT___CHECK_UNIT;

	/**
	 * The number of operations of the '<em>Core Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.unit.impl.DimensionlessImpl <em>Dimensionless</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.unit.impl.DimensionlessImpl
	 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getDimensionless()
	 * @generated
	 */
	int DIMENSIONLESS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONLESS__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONLESS__UNIT = UNIT__UNIT;

	/**
	 * The number of structural features of the '<em>Dimensionless</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONLESS_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONLESS___CHECK_UNIT = UNIT___CHECK_UNIT;

	/**
	 * The number of operations of the '<em>Dimensionless</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONLESS_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.unit.impl.MonetaryUnitImpl <em>Monetary Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.unit.impl.MonetaryUnitImpl
	 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getMonetaryUnit()
	 * @generated
	 */
	int MONETARY_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETARY_UNIT__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETARY_UNIT__UNIT = UNIT__UNIT;

	/**
	 * The number of structural features of the '<em>Monetary Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETARY_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETARY_UNIT___CHECK_UNIT = UNIT___CHECK_UNIT;

	/**
	 * The number of operations of the '<em>Monetary Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETARY_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.unit.impl.RequestUnitImpl <em>Request Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.unit.impl.RequestUnitImpl
	 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getRequestUnit()
	 * @generated
	 */
	int REQUEST_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_UNIT__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_UNIT__UNIT = UNIT__UNIT;

	/**
	 * The number of structural features of the '<em>Request Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_UNIT___CHECK_UNIT = UNIT___CHECK_UNIT;

	/**
	 * The number of operations of the '<em>Request Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.unit.impl.StorageUnitImpl <em>Storage Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.unit.impl.StorageUnitImpl
	 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getStorageUnit()
	 * @generated
	 */
	int STORAGE_UNIT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT__UNIT = UNIT__UNIT;

	/**
	 * The number of structural features of the '<em>Storage Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT___CHECK_UNIT = UNIT___CHECK_UNIT;

	/**
	 * The number of operations of the '<em>Storage Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.unit.impl.ThroughputUnitImpl <em>Throughput Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.unit.impl.ThroughputUnitImpl
	 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getThroughputUnit()
	 * @generated
	 */
	int THROUGHPUT_UNIT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_UNIT__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_UNIT__UNIT = UNIT__UNIT;

	/**
	 * The number of structural features of the '<em>Throughput Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_UNIT___CHECK_UNIT = UNIT___CHECK_UNIT;

	/**
	 * The number of operations of the '<em>Throughput Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.unit.impl.TimeIntervalUnitImpl <em>Time Interval Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.unit.impl.TimeIntervalUnitImpl
	 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getTimeIntervalUnit()
	 * @generated
	 */
	int TIME_INTERVAL_UNIT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_UNIT__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_UNIT__UNIT = UNIT__UNIT;

	/**
	 * The number of structural features of the '<em>Time Interval Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_UNIT___CHECK_UNIT = UNIT___CHECK_UNIT;

	/**
	 * The number of operations of the '<em>Time Interval Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.unit.impl.TransactionUnitImpl <em>Transaction Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.unit.impl.TransactionUnitImpl
	 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getTransactionUnit()
	 * @generated
	 */
	int TRANSACTION_UNIT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_UNIT__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_UNIT__UNIT = UNIT__UNIT;

	/**
	 * The number of structural features of the '<em>Transaction Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_UNIT___CHECK_UNIT = UNIT___CHECK_UNIT;

	/**
	 * The number of operations of the '<em>Transaction Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.unit.impl.UnitModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.unit.impl.UnitModelImpl
	 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getUnitModel()
	 * @generated
	 */
	int UNIT_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MODEL__NAME = CamelPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MODEL__IMPORT_URI = CamelPackage.MODEL__IMPORT_URI;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MODEL__UNITS = CamelPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MODEL_FEATURE_COUNT = CamelPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MODEL_OPERATION_COUNT = CamelPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.unit.UnitType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.unit.UnitType
	 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 10;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.unit.UnitDimensionType <em>Dimension Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.unit.UnitDimensionType
	 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getUnitDimensionType()
	 * @generated
	 */
	int UNIT_DIMENSION_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.unit.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see eu.paasage.camel.unit.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.unit.Unit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.unit.Unit#getName()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.unit.Unit#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see eu.paasage.camel.unit.Unit#getUnit()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Unit();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.unit.Unit#checkUnit() <em>Check Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Unit</em>' operation.
	 * @see eu.paasage.camel.unit.Unit#checkUnit()
	 * @generated
	 */
	EOperation getUnit__CheckUnit();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.unit.CoreUnit <em>Core Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core Unit</em>'.
	 * @see eu.paasage.camel.unit.CoreUnit
	 * @generated
	 */
	EClass getCoreUnit();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.unit.Dimensionless <em>Dimensionless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimensionless</em>'.
	 * @see eu.paasage.camel.unit.Dimensionless
	 * @generated
	 */
	EClass getDimensionless();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.unit.MonetaryUnit <em>Monetary Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monetary Unit</em>'.
	 * @see eu.paasage.camel.unit.MonetaryUnit
	 * @generated
	 */
	EClass getMonetaryUnit();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.unit.RequestUnit <em>Request Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Unit</em>'.
	 * @see eu.paasage.camel.unit.RequestUnit
	 * @generated
	 */
	EClass getRequestUnit();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.unit.StorageUnit <em>Storage Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Unit</em>'.
	 * @see eu.paasage.camel.unit.StorageUnit
	 * @generated
	 */
	EClass getStorageUnit();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.unit.ThroughputUnit <em>Throughput Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throughput Unit</em>'.
	 * @see eu.paasage.camel.unit.ThroughputUnit
	 * @generated
	 */
	EClass getThroughputUnit();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.unit.TimeIntervalUnit <em>Time Interval Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Interval Unit</em>'.
	 * @see eu.paasage.camel.unit.TimeIntervalUnit
	 * @generated
	 */
	EClass getTimeIntervalUnit();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.unit.TransactionUnit <em>Transaction Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Unit</em>'.
	 * @see eu.paasage.camel.unit.TransactionUnit
	 * @generated
	 */
	EClass getTransactionUnit();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.unit.UnitModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see eu.paasage.camel.unit.UnitModel
	 * @generated
	 */
	EClass getUnitModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.unit.UnitModel#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see eu.paasage.camel.unit.UnitModel#getUnits()
	 * @see #getUnitModel()
	 * @generated
	 */
	EReference getUnitModel_Units();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.unit.UnitType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see eu.paasage.camel.unit.UnitType
	 * @generated
	 */
	EEnum getUnitType();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.unit.UnitDimensionType <em>Dimension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dimension Type</em>'.
	 * @see eu.paasage.camel.unit.UnitDimensionType
	 * @generated
	 */
	EEnum getUnitDimensionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UnitFactory getUnitFactory();

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
		 * The meta object literal for the '{@link eu.paasage.camel.unit.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.unit.impl.UnitImpl
		 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__NAME = eINSTANCE.getUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__UNIT = eINSTANCE.getUnit_Unit();

		/**
		 * The meta object literal for the '<em><b>Check Unit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNIT___CHECK_UNIT = eINSTANCE.getUnit__CheckUnit();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.unit.impl.CoreUnitImpl <em>Core Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.unit.impl.CoreUnitImpl
		 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getCoreUnit()
		 * @generated
		 */
		EClass CORE_UNIT = eINSTANCE.getCoreUnit();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.unit.impl.DimensionlessImpl <em>Dimensionless</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.unit.impl.DimensionlessImpl
		 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getDimensionless()
		 * @generated
		 */
		EClass DIMENSIONLESS = eINSTANCE.getDimensionless();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.unit.impl.MonetaryUnitImpl <em>Monetary Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.unit.impl.MonetaryUnitImpl
		 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getMonetaryUnit()
		 * @generated
		 */
		EClass MONETARY_UNIT = eINSTANCE.getMonetaryUnit();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.unit.impl.RequestUnitImpl <em>Request Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.unit.impl.RequestUnitImpl
		 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getRequestUnit()
		 * @generated
		 */
		EClass REQUEST_UNIT = eINSTANCE.getRequestUnit();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.unit.impl.StorageUnitImpl <em>Storage Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.unit.impl.StorageUnitImpl
		 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getStorageUnit()
		 * @generated
		 */
		EClass STORAGE_UNIT = eINSTANCE.getStorageUnit();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.unit.impl.ThroughputUnitImpl <em>Throughput Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.unit.impl.ThroughputUnitImpl
		 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getThroughputUnit()
		 * @generated
		 */
		EClass THROUGHPUT_UNIT = eINSTANCE.getThroughputUnit();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.unit.impl.TimeIntervalUnitImpl <em>Time Interval Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.unit.impl.TimeIntervalUnitImpl
		 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getTimeIntervalUnit()
		 * @generated
		 */
		EClass TIME_INTERVAL_UNIT = eINSTANCE.getTimeIntervalUnit();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.unit.impl.TransactionUnitImpl <em>Transaction Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.unit.impl.TransactionUnitImpl
		 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getTransactionUnit()
		 * @generated
		 */
		EClass TRANSACTION_UNIT = eINSTANCE.getTransactionUnit();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.unit.impl.UnitModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.unit.impl.UnitModelImpl
		 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getUnitModel()
		 * @generated
		 */
		EClass UNIT_MODEL = eINSTANCE.getUnitModel();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_MODEL__UNITS = eINSTANCE.getUnitModel_Units();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.unit.UnitType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.unit.UnitType
		 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getUnitType()
		 * @generated
		 */
		EEnum UNIT_TYPE = eINSTANCE.getUnitType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.unit.UnitDimensionType <em>Dimension Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.unit.UnitDimensionType
		 * @see eu.paasage.camel.unit.impl.UnitPackageImpl#getUnitDimensionType()
		 * @generated
		 */
		EEnum UNIT_DIMENSION_TYPE = eINSTANCE.getUnitDimensionType();

	}

} //UnitPackage
