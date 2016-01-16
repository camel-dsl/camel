/**
 */
package eu.paasage.camel.requirement;

import eu.paasage.camel.Application;

import eu.paasage.camel.deployment.Component;

import eu.paasage.camel.metric.Metric;
import eu.paasage.camel.metric.MetricContext;
import eu.paasage.camel.metric.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optimisation Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.OptimisationRequirement#getOptimisationFunction <em>Optimisation Function</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.OptimisationRequirement#getMetric <em>Metric</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.OptimisationRequirement#getProperty <em>Property</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.OptimisationRequirement#getApplication <em>Application</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.OptimisationRequirement#getComponent <em>Component</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.OptimisationRequirement#getMetricContext <em>Metric Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.requirement.RequirementPackage#getOptimisationRequirement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='optimization_requirement_metric_or_prop'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot optimization_requirement_metric_or_prop='Tuple {\n\tmessage : String = \'In OptimizationRequirement: \' + self.name +\n\t\t\t\t\t\' no metric or property has been given\',\n\tstatus : Boolean = (metric <> null and property = null and (application <> null or\n\t\t\t\t\tcomponent <> null)) or (property <> null and metric = null and (application <> null or component <> null))\n}.status'"
 * @generated
 */
public interface OptimisationRequirement extends SoftRequirement {
	/**
	 * Returns the value of the '<em><b>Optimisation Function</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.requirement.OptimisationFunctionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimisation Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimisation Function</em>' attribute.
	 * @see eu.paasage.camel.requirement.OptimisationFunctionType
	 * @see #setOptimisationFunction(OptimisationFunctionType)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getOptimisationRequirement_OptimisationFunction()
	 * @model required="true"
	 * @generated
	 */
	OptimisationFunctionType getOptimisationFunction();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.OptimisationRequirement#getOptimisationFunction <em>Optimisation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimisation Function</em>' attribute.
	 * @see eu.paasage.camel.requirement.OptimisationFunctionType
	 * @see #getOptimisationFunction()
	 * @generated
	 */
	void setOptimisationFunction(OptimisationFunctionType value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(Metric)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getOptimisationRequirement_Metric()
	 * @model
	 * @generated
	 */
	Metric getMetric();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.OptimisationRequirement#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(Metric value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getOptimisationRequirement_Property()
	 * @model
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.OptimisationRequirement#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference.
	 * @see #setApplication(Application)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getOptimisationRequirement_Application()
	 * @model
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.OptimisationRequirement#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getOptimisationRequirement_Component()
	 * @model
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.OptimisationRequirement#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Metric Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Context</em>' reference.
	 * @see #setMetricContext(MetricContext)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getOptimisationRequirement_MetricContext()
	 * @model
	 * @generated
	 */
	MetricContext getMetricContext();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.OptimisationRequirement#getMetricContext <em>Metric Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric Context</em>' reference.
	 * @see #getMetricContext()
	 * @generated
	 */
	void setMetricContext(MetricContext value);

} // OptimisationRequirement
