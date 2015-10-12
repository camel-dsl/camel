/**
 */
package eu.paasage.camel.requirement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.requirement.RequirementPackage
 * @generated
 */
public interface RequirementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementFactory eINSTANCE = eu.paasage.camel.requirement.impl.RequirementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	RequirementModel createRequirementModel();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	RequirementGroup createRequirementGroup();

	/**
	 * Returns a new object of class '<em>Service Level Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Objective</em>'.
	 * @generated
	 */
	ServiceLevelObjective createServiceLevelObjective();

	/**
	 * Returns a new object of class '<em>Optimisation Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optimisation Requirement</em>'.
	 * @generated
	 */
	OptimisationRequirement createOptimisationRequirement();

	/**
	 * Returns a new object of class '<em>Qualitative Hardware Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualitative Hardware Requirement</em>'.
	 * @generated
	 */
	QualitativeHardwareRequirement createQualitativeHardwareRequirement();

	/**
	 * Returns a new object of class '<em>Quantitative Hardware Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantitative Hardware Requirement</em>'.
	 * @generated
	 */
	QuantitativeHardwareRequirement createQuantitativeHardwareRequirement();

	/**
	 * Returns a new object of class '<em>Provider Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider Requirement</em>'.
	 * @generated
	 */
	ProviderRequirement createProviderRequirement();

	/**
	 * Returns a new object of class '<em>OS Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OS Requirement</em>'.
	 * @generated
	 */
	OSRequirement createOSRequirement();

	/**
	 * Returns a new object of class '<em>Image Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Requirement</em>'.
	 * @generated
	 */
	ImageRequirement createImageRequirement();

	/**
	 * Returns a new object of class '<em>Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Requirement</em>'.
	 * @generated
	 */
	SecurityRequirement createSecurityRequirement();

	/**
	 * Returns a new object of class '<em>Location Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Requirement</em>'.
	 * @generated
	 */
	LocationRequirement createLocationRequirement();

	/**
	 * Returns a new object of class '<em>Horizontal Scale Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontal Scale Requirement</em>'.
	 * @generated
	 */
	HorizontalScaleRequirement createHorizontalScaleRequirement();

	/**
	 * Returns a new object of class '<em>Vertical Scale Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vertical Scale Requirement</em>'.
	 * @generated
	 */
	VerticalScaleRequirement createVerticalScaleRequirement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RequirementPackage getRequirementPackage();

} //RequirementFactory
