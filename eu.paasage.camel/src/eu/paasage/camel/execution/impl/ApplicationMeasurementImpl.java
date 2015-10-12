/**
 */
package eu.paasage.camel.execution.impl;

import eu.paasage.camel.Application;

import eu.paasage.camel.execution.ApplicationMeasurement;
import eu.paasage.camel.execution.ExecutionPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.impl.ApplicationMeasurementImpl#getApplication <em>Application</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationMeasurementImpl extends MeasurementImpl implements ApplicationMeasurement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.APPLICATION_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		return (Application)eGet(ExecutionPackage.Literals.APPLICATION_MEASUREMENT__APPLICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		eSet(ExecutionPackage.Literals.APPLICATION_MEASUREMENT__APPLICATION, newApplication);
	}

} //ApplicationMeasurementImpl
