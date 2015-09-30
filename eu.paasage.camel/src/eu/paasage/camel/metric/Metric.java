/**
 */
package eu.paasage.camel.metric;

import eu.paasage.camel.LayerType;

import eu.paasage.camel.type.ValueType;
import eu.paasage.camel.unit.Unit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.Metric#getDescription <em>Description</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Metric#getValueType <em>Value Type</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Metric#getValueDirection <em>Value Direction</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Metric#getUnit <em>Unit</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Metric#getLayer <em>Layer</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Metric#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getMetric()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='metric_measures_measurable_property'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot metric_measures_measurable_property='Tuple {\n\tmessage : String = \'Metric: \' + name + \' measures property: \' + self.property.name +\n\t\t\t\t\t\' which is ABSTRACT (i.e., not MEASURABLE)\',\n\tstatus : Boolean = self.property.type = PropertyType::MEASURABLE\n}.status'"
 * @generated
 */
public interface Metric extends MetricFormulaParameter {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see eu.paasage.camel.metric.MetricPackage#getMetric_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Metric#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' reference.
	 * @see #setValueType(ValueType)
	 * @see eu.paasage.camel.metric.MetricPackage#getMetric_ValueType()
	 * @model
	 * @generated
	 */
	ValueType getValueType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Metric#getValueType <em>Value Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(ValueType value);

	/**
	 * Returns the value of the '<em><b>Value Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Direction</em>' attribute.
	 * @see #setValueDirection(short)
	 * @see eu.paasage.camel.metric.MetricPackage#getMetric_ValueDirection()
	 * @model
	 * @generated
	 */
	short getValueDirection();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Metric#getValueDirection <em>Value Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Direction</em>' attribute.
	 * @see #getValueDirection()
	 * @generated
	 */
	void setValueDirection(short value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(Unit)
	 * @see eu.paasage.camel.metric.MetricPackage#getMetric_Unit()
	 * @model required="true"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Metric#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

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
	 * @see eu.paasage.camel.metric.MetricPackage#getMetric_Layer()
	 * @model
	 * @generated
	 */
	LayerType getLayer();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Metric#getLayer <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' attribute.
	 * @see eu.paasage.camel.LayerType
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(LayerType value);

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
	 * @see eu.paasage.camel.metric.MetricPackage#getMetric_Property()
	 * @model required="true"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Metric#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='System.out.println(\"Checking recursiveness for Metric: \" + mt1.getName());\n\t\tCompositeMetric m1 = (CompositeMetric)mt1;\n\t\tfor (eu.paasage.camel.metric.MetricFormulaParameter param: m1.getFormula().getParameters()){\n\t\t\tif (param instanceof Metric){\n\t\t\t\tMetric mt = (Metric)param;\n\t\t\t\tif (mt.getName().equals(mt2.getName())) return Boolean.TRUE;\n\t\t\t\tif (mt instanceof CompositeMetric && checkRecursiveness(mt,mt2)) return Boolean.TRUE;\n\t\t\t}\n\t\t}\n\t\treturn Boolean.FALSE;'"
	 * @generated
	 */
	boolean checkRecursiveness(Metric mt1, Metric mt2);

} // Metric
