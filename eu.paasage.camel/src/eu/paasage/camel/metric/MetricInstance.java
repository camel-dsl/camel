/**
 */
package eu.paasage.camel.metric;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.MetricInstance#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricInstance#getMetric <em>Metric</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricInstance#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricInstance#getWindow <em>Window</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricInstance#getObjectBinding <em>Object Binding</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricInstance#getMetricContext <em>Metric Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getMetricInstance()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface MetricInstance extends CDOObject {
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
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricInstance_Name()
	 * @model id="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='MetricFormulaParameter' unique='false' upper='*'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricInstance_Metric()
	 * @model required="true"
	 * @generated
	 */
	Metric getMetric();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricInstance#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(Metric value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' reference.
	 * @see #setSchedule(Schedule)
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricInstance_Schedule()
	 * @model
	 * @generated
	 */
	Schedule getSchedule();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricInstance#getSchedule <em>Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(Schedule value);

	/**
	 * Returns the value of the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window</em>' reference.
	 * @see #setWindow(Window)
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricInstance_Window()
	 * @model
	 * @generated
	 */
	Window getWindow();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricInstance#getWindow <em>Window</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window</em>' reference.
	 * @see #getWindow()
	 * @generated
	 */
	void setWindow(Window value);

	/**
	 * Returns the value of the '<em><b>Object Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Binding</em>' reference.
	 * @see #setObjectBinding(MetricObjectBinding)
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricInstance_ObjectBinding()
	 * @model required="true"
	 * @generated
	 */
	MetricObjectBinding getObjectBinding();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricInstance#getObjectBinding <em>Object Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Binding</em>' reference.
	 * @see #getObjectBinding()
	 * @generated
	 */
	void setObjectBinding(MetricObjectBinding value);

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
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricInstance_MetricContext()
	 * @model
	 * @generated
	 */
	MetricContext getMetricContext();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricInstance#getMetricContext <em>Metric Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric Context</em>' reference.
	 * @see #getMetricContext()
	 * @generated
	 */
	void setMetricContext(MetricContext value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='System.out.println(\"Checking recursiveness for MetricInstance: \" + m1.getName());\n\t\tCompositeMetricInstance cmi = (CompositeMetricInstance)m1;\n\t\tfor (MetricInstance m: cmi.getComposingMetricInstances()){\n\t\t\tif (m.getName().equals(m2.getName())) return Boolean.TRUE;\n\t\t\tif (m instanceof CompositeMetricInstance && checkRecursiveness(m,m2)) return Boolean.TRUE;\n\t\t}\n\t\treturn Boolean.FALSE;'"
	 * @generated
	 */
	boolean checkRecursiveness(MetricInstance m1, MetricInstance m2);

} // MetricInstance
