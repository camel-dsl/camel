/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.metric.MetricPackage;
import eu.paasage.camel.metric.Property;
import eu.paasage.camel.metric.PropertyContext;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.PropertyContextImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyContextImpl extends ConditionContextImpl implements PropertyContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.PROPERTY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getProperty() {
		return (Property)eGet(MetricPackage.Literals.PROPERTY_CONTEXT__PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(Property newProperty) {
		eSet(MetricPackage.Literals.PROPERTY_CONTEXT__PROPERTY, newProperty);
	}

} //PropertyContextImpl
