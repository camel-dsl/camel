/**
 */
package eu.paasage.camel.unit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.unit.UnitPackage
 * @generated
 */
public interface UnitFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnitFactory eINSTANCE = eu.paasage.camel.unit.impl.UnitFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Core Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Core Unit</em>'.
	 * @generated
	 */
	CoreUnit createCoreUnit();

	/**
	 * Returns a new object of class '<em>Dimensionless</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimensionless</em>'.
	 * @generated
	 */
	Dimensionless createDimensionless();

	/**
	 * Returns a new object of class '<em>Monetary Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monetary Unit</em>'.
	 * @generated
	 */
	MonetaryUnit createMonetaryUnit();

	/**
	 * Returns a new object of class '<em>Request Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Unit</em>'.
	 * @generated
	 */
	RequestUnit createRequestUnit();

	/**
	 * Returns a new object of class '<em>Storage Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Unit</em>'.
	 * @generated
	 */
	StorageUnit createStorageUnit();

	/**
	 * Returns a new object of class '<em>Throughput Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throughput Unit</em>'.
	 * @generated
	 */
	ThroughputUnit createThroughputUnit();

	/**
	 * Returns a new object of class '<em>Time Interval Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Interval Unit</em>'.
	 * @generated
	 */
	TimeIntervalUnit createTimeIntervalUnit();

	/**
	 * Returns a new object of class '<em>Transaction Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction Unit</em>'.
	 * @generated
	 */
	TransactionUnit createTransactionUnit();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	UnitModel createUnitModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UnitPackage getUnitPackage();

} //UnitFactory
