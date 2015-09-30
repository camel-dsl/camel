/**
 */
package eu.paasage.camel.scalability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.scalability.ScalabilityPackage
 * @generated
 */
public interface ScalabilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScalabilityFactory eINSTANCE = eu.paasage.camel.scalability.impl.ScalabilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	ScalabilityModel createScalabilityModel();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Binary Event Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Event Pattern</em>'.
	 * @generated
	 */
	BinaryEventPattern createBinaryEventPattern();

	/**
	 * Returns a new object of class '<em>Unary Event Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Event Pattern</em>'.
	 * @generated
	 */
	UnaryEventPattern createUnaryEventPattern();

	/**
	 * Returns a new object of class '<em>Simple Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Event</em>'.
	 * @generated
	 */
	SimpleEvent createSimpleEvent();

	/**
	 * Returns a new object of class '<em>Functional Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Event</em>'.
	 * @generated
	 */
	FunctionalEvent createFunctionalEvent();

	/**
	 * Returns a new object of class '<em>Non Functional Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Functional Event</em>'.
	 * @generated
	 */
	NonFunctionalEvent createNonFunctionalEvent();

	/**
	 * Returns a new object of class '<em>Event Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Instance</em>'.
	 * @generated
	 */
	EventInstance createEventInstance();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	ScalabilityRule createScalabilityRule();

	/**
	 * Returns a new object of class '<em>Horizontal Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontal Scaling Action</em>'.
	 * @generated
	 */
	HorizontalScalingAction createHorizontalScalingAction();

	/**
	 * Returns a new object of class '<em>Vertical Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vertical Scaling Action</em>'.
	 * @generated
	 */
	VerticalScalingAction createVerticalScalingAction();

	/**
	 * Returns a new object of class '<em>Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timer</em>'.
	 * @generated
	 */
	Timer createTimer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScalabilityPackage getScalabilityPackage();

} //ScalabilityFactory
