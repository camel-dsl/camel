/**
 */
package eu.paasage.camel.execution.impl;

import eu.paasage.camel.deployment.InternalComponentInstance;

import eu.paasage.camel.execution.ExecutionPackage;
import eu.paasage.camel.execution.InternalComponentMeasurement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Component Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.impl.InternalComponentMeasurementImpl#getInternalComponentInstance <em>Internal Component Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalComponentMeasurementImpl extends MeasurementImpl implements InternalComponentMeasurement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalComponentMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.INTERNAL_COMPONENT_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalComponentInstance getInternalComponentInstance() {
		return (InternalComponentInstance)eGet(ExecutionPackage.Literals.INTERNAL_COMPONENT_MEASUREMENT__INTERNAL_COMPONENT_INSTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalComponentInstance(InternalComponentInstance newInternalComponentInstance) {
		eSet(ExecutionPackage.Literals.INTERNAL_COMPONENT_MEASUREMENT__INTERNAL_COMPONENT_INSTANCE, newInternalComponentInstance);
	}

} //InternalComponentMeasurementImpl
