/**
 */
package eu.paasage.camel.execution;

import eu.paasage.camel.Application;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.ApplicationMeasurement#getApplication <em>Application</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.execution.ExecutionPackage#getApplicationMeasurement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='application_measurement_same_app'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot application_measurement_same_app='Tuple {\n\tmessage : String = \'ApplicationMeasurement: \' + self.name +\n\t\t\t\t\' has a different application from the one referenced by its execution context: \' +\n\t\t\t\tself.executionContext.name,\n\tstatus : Boolean = self.executionContext.application = self.application\n}.status'"
 * @generated
 */
public interface ApplicationMeasurement extends Measurement {
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
	 * @see eu.paasage.camel.execution.ExecutionPackage#getApplicationMeasurement_Application()
	 * @model required="true"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.ApplicationMeasurement#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

} // ApplicationMeasurement
