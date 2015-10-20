/**
 */
package eu.paasage.camel.metric.util;

import eu.paasage.camel.Model;

import eu.paasage.camel.metric.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.metric.MetricPackage
 * @generated
 */
public class MetricSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetricPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricSwitch() {
		if (modelPackage == null) {
			modelPackage = MetricPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MetricPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.METRIC_CONDITION: {
				MetricCondition metricCondition = (MetricCondition)theEObject;
				T result = caseMetricCondition(metricCondition);
				if (result == null) result = caseCondition(metricCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.PROPERTY_CONDITION: {
				PropertyCondition propertyCondition = (PropertyCondition)theEObject;
				T result = casePropertyCondition(propertyCondition);
				if (result == null) result = caseCondition(propertyCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.METRIC_INSTANCE: {
				MetricInstance metricInstance = (MetricInstance)theEObject;
				T result = caseMetricInstance(metricInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.COMPOSITE_METRIC_INSTANCE: {
				CompositeMetricInstance compositeMetricInstance = (CompositeMetricInstance)theEObject;
				T result = caseCompositeMetricInstance(compositeMetricInstance);
				if (result == null) result = caseMetricInstance(compositeMetricInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.RAW_METRIC_INSTANCE: {
				RawMetricInstance rawMetricInstance = (RawMetricInstance)theEObject;
				T result = caseRawMetricInstance(rawMetricInstance);
				if (result == null) result = caseMetricInstance(rawMetricInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.METRIC_FORMULA_PARAMETER: {
				MetricFormulaParameter metricFormulaParameter = (MetricFormulaParameter)theEObject;
				T result = caseMetricFormulaParameter(metricFormulaParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.METRIC_FORMULA: {
				MetricFormula metricFormula = (MetricFormula)theEObject;
				T result = caseMetricFormula(metricFormula);
				if (result == null) result = caseMetricFormulaParameter(metricFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.METRIC: {
				Metric metric = (Metric)theEObject;
				T result = caseMetric(metric);
				if (result == null) result = caseMetricFormulaParameter(metric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.COMPOSITE_METRIC: {
				CompositeMetric compositeMetric = (CompositeMetric)theEObject;
				T result = caseCompositeMetric(compositeMetric);
				if (result == null) result = caseMetric(compositeMetric);
				if (result == null) result = caseMetricFormulaParameter(compositeMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.RAW_METRIC: {
				RawMetric rawMetric = (RawMetric)theEObject;
				T result = caseRawMetric(rawMetric);
				if (result == null) result = caseMetric(rawMetric);
				if (result == null) result = caseMetricFormulaParameter(rawMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.METRIC_OBJECT_BINDING: {
				MetricObjectBinding metricObjectBinding = (MetricObjectBinding)theEObject;
				T result = caseMetricObjectBinding(metricObjectBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.METRIC_APPLICATION_BINDING: {
				MetricApplicationBinding metricApplicationBinding = (MetricApplicationBinding)theEObject;
				T result = caseMetricApplicationBinding(metricApplicationBinding);
				if (result == null) result = caseMetricObjectBinding(metricApplicationBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.METRIC_COMPONENT_BINDING: {
				MetricComponentBinding metricComponentBinding = (MetricComponentBinding)theEObject;
				T result = caseMetricComponentBinding(metricComponentBinding);
				if (result == null) result = caseMetricObjectBinding(metricComponentBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.METRIC_VM_BINDING: {
				MetricVMBinding metricVMBinding = (MetricVMBinding)theEObject;
				T result = caseMetricVMBinding(metricVMBinding);
				if (result == null) result = caseMetricObjectBinding(metricVMBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.SCHEDULE: {
				Schedule schedule = (Schedule)theEObject;
				T result = caseSchedule(schedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.WINDOW: {
				Window window = (Window)theEObject;
				T result = caseWindow(window);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.CONDITION_CONTEXT: {
				ConditionContext conditionContext = (ConditionContext)theEObject;
				T result = caseConditionContext(conditionContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.METRIC_MODEL: {
				MetricModel metricModel = (MetricModel)theEObject;
				T result = caseMetricModel(metricModel);
				if (result == null) result = caseModel(metricModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.METRIC_CONTEXT: {
				MetricContext metricContext = (MetricContext)theEObject;
				T result = caseMetricContext(metricContext);
				if (result == null) result = caseConditionContext(metricContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.COMPOSITE_METRIC_CONTEXT: {
				CompositeMetricContext compositeMetricContext = (CompositeMetricContext)theEObject;
				T result = caseCompositeMetricContext(compositeMetricContext);
				if (result == null) result = caseMetricContext(compositeMetricContext);
				if (result == null) result = caseConditionContext(compositeMetricContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.RAW_METRIC_CONTEXT: {
				RawMetricContext rawMetricContext = (RawMetricContext)theEObject;
				T result = caseRawMetricContext(rawMetricContext);
				if (result == null) result = caseMetricContext(rawMetricContext);
				if (result == null) result = caseConditionContext(rawMetricContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricPackage.PROPERTY_CONTEXT: {
				PropertyContext propertyContext = (PropertyContext)theEObject;
				T result = casePropertyContext(propertyContext);
				if (result == null) result = caseConditionContext(propertyContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricCondition(MetricCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyCondition(PropertyCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricInstance(MetricInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Metric Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeMetricInstance(CompositeMetricInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raw Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raw Metric Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRawMetricInstance(RawMetricInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricFormulaParameter(MetricFormulaParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricFormula(MetricFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetric(Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeMetric(CompositeMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raw Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raw Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRawMetric(RawMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricObjectBinding(MetricObjectBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricApplicationBinding(MetricApplicationBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricComponentBinding(MetricComponentBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricVMBinding(MetricVMBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedule(Schedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindow(Window object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionContext(ConditionContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricModel(MetricModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricContext(MetricContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Metric Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Metric Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeMetricContext(CompositeMetricContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raw Metric Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raw Metric Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRawMetricContext(RawMetricContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyContext(PropertyContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MetricSwitch
