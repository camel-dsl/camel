/**
 */
package eu.paasage.camel.requirement.impl;

import eu.paasage.camel.Application;

import eu.paasage.camel.deployment.Component;

import eu.paasage.camel.metric.Metric;
import eu.paasage.camel.metric.Property;

import eu.paasage.camel.requirement.OptimisationFunctionType;
import eu.paasage.camel.requirement.OptimisationRequirement;
import eu.paasage.camel.requirement.RequirementPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optimisation Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.impl.OptimisationRequirementImpl#getOptimisationFunction <em>Optimisation Function</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.OptimisationRequirementImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.OptimisationRequirementImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.OptimisationRequirementImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.OptimisationRequirementImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptimisationRequirementImpl extends SoftRequirementImpl implements OptimisationRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptimisationRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.OPTIMISATION_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationFunctionType getOptimisationFunction() {
		return (OptimisationFunctionType)eGet(RequirementPackage.Literals.OPTIMISATION_REQUIREMENT__OPTIMISATION_FUNCTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimisationFunction(OptimisationFunctionType newOptimisationFunction) {
		eSet(RequirementPackage.Literals.OPTIMISATION_REQUIREMENT__OPTIMISATION_FUNCTION, newOptimisationFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric getMetric() {
		return (Metric)eGet(RequirementPackage.Literals.OPTIMISATION_REQUIREMENT__METRIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(Metric newMetric) {
		eSet(RequirementPackage.Literals.OPTIMISATION_REQUIREMENT__METRIC, newMetric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getProperty() {
		return (Property)eGet(RequirementPackage.Literals.OPTIMISATION_REQUIREMENT__PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(Property newProperty) {
		eSet(RequirementPackage.Literals.OPTIMISATION_REQUIREMENT__PROPERTY, newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		return (Application)eGet(RequirementPackage.Literals.OPTIMISATION_REQUIREMENT__APPLICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		eSet(RequirementPackage.Literals.OPTIMISATION_REQUIREMENT__APPLICATION, newApplication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		return (Component)eGet(RequirementPackage.Literals.OPTIMISATION_REQUIREMENT__COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		eSet(RequirementPackage.Literals.OPTIMISATION_REQUIREMENT__COMPONENT, newComponent);
	}

} //OptimisationRequirementImpl
