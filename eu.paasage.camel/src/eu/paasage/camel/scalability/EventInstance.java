/**
 */
package eu.paasage.camel.scalability;

import eu.paasage.camel.LayerType;

import eu.paasage.camel.metric.MetricInstance;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.EventInstance#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.EventInstance#getStatus <em>Status</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.EventInstance#getLayer <em>Layer</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.EventInstance#getEvent <em>Event</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.EventInstance#getMetricInstance <em>Metric Instance</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.scalability.ScalabilityPackage#getEventInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='event_instance_same_layer_of_metric_as_in_event event_instance_metric_in_event'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot event_instance_same_layer_of_metric_as_in_event='Tuple {\n\tmessage : String = \'EventInstance: \' + self.name +\n\t\t\t\t\t\' does not map to the same layer as the one designated by the metric referenced by the instance\\\'s respective event:\'\n\t\t\t\t\t+ self.event.name,\n\tstatus : Boolean = if (self.event.oclIsTypeOf(NonFunctionalEvent))\n\t\t\t\t\tthen self.equalLayer(self.layer,\n\t\t\t\t\t\t\tself.event.oclAsType(NonFunctionalEvent).metricCondition.metricContext.metric.layer)\n\t\t\t\t\telse true\n\t\t\t\t\tendif\n}.status' event_instance_metric_in_event='Tuple {\n\tmessage : String = \'EventInstance: \' + self.name +\n\t\t\t\t\t\' has a metric instance with a metric which is not identical to the one associated to the event instance\\\'s event: \'\n\t\t\t\t\t+ self.event.name,\n\tstatus : Boolean = if (self.event.oclIsTypeOf(NonFunctionalEvent))\n\t\t\t\t\tthen metricInstance.metric = event.oclAsType(NonFunctionalEvent).metricCondition.metricContext.metric\n\t\t\t\t\telse true\n\t\t\t\t\tendif\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface EventInstance extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getEventInstance_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.EventInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.scalability.StatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see eu.paasage.camel.scalability.StatusType
	 * @see #setStatus(StatusType)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getEventInstance_Status()
	 * @model required="true"
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.EventInstance#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see eu.paasage.camel.scalability.StatusType
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusType value);

	/**
	 * Returns the value of the '<em><b>Layer</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.LayerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer</em>' attribute.
	 * @see eu.paasage.camel.LayerType
	 * @see #setLayer(LayerType)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getEventInstance_Layer()
	 * @model
	 * @generated
	 */
	LayerType getLayer();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.EventInstance#getLayer <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' attribute.
	 * @see eu.paasage.camel.LayerType
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(LayerType value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(SimpleEvent)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getEventInstance_Event()
	 * @model required="true"
	 * @generated
	 */
	SimpleEvent getEvent();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.EventInstance#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(SimpleEvent value);

	/**
	 * Returns the value of the '<em><b>Metric Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Instance</em>' reference.
	 * @see #setMetricInstance(MetricInstance)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getEventInstance_MetricInstance()
	 * @model
	 * @generated
	 */
	MetricInstance getMetricInstance();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.EventInstance#getMetricInstance <em>Metric Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric Instance</em>' reference.
	 * @see #getMetricInstance()
	 * @generated
	 */
	void setMetricInstance(MetricInstance value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model l1Required="true" l2Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if (l1 = LayerType::SaaS)\n\t\t\t\t\t\tthen (if (l2 = LayerType::SaaS)\n\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\telse (if (l1 = LayerType::PaaS)\n\t\t\t\t\t\t\tthen (if (l2 = LayerType::PaaS)\n\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\t\telse (if (l2 = LayerType::IaaS)\n\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean equalLayer(LayerType l1, LayerType l2);

} // EventInstance
