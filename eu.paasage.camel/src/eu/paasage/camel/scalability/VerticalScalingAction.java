/**
 */
package eu.paasage.camel.scalability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertical Scaling Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.VerticalScalingAction#getMemoryUpdate <em>Memory Update</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.VerticalScalingAction#getCPUUpdate <em>CPU Update</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.VerticalScalingAction#getCoreUpdate <em>Core Update</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.VerticalScalingAction#getStorageUpdate <em>Storage Update</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.VerticalScalingAction#getIoUpdate <em>Io Update</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.VerticalScalingAction#getNetworkUpdate <em>Network Update</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.scalability.ScalabilityPackage#getVerticalScalingAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='vertical_scale_action_correct_input vertical_scale_action_correct_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot vertical_scale_action_correct_input='Tuple {\n\tmessage : String = \'VerticalScalingAction: \' + self.name +\n\t\t\t\t\t\' has the value of all VM characteristic update attributes equal to zero. At least one should be positive.\',\n\tstatus : Boolean = memoryUpdate\n\t\t\t\t\t<> 0 or CPUUpdate <> 0.0 or coreUpdate <> 0 or storageUpdate <> 0\n}.status' vertical_scale_action_correct_type='Tuple {\n\tmessage : String = \'VerticalScalingAction: \' + self.name + \' has a wrong type (\' +\n\t\t\t\t\tself.type.toString() + \'). It should be either SCALE_UP or SCALE_DOWN\',\n\tstatus : Boolean = (self.type = camel::ActionType::SCALE_UP)\n\t\t\t\t\tor (self.type = camel::ActionType::SCALE_DOWN)\n}.status'"
 * @generated
 */
public interface VerticalScalingAction extends ScalingAction {
	/**
	 * Returns the value of the '<em><b>Memory Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Update</em>' attribute.
	 * @see #setMemoryUpdate(int)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getVerticalScalingAction_MemoryUpdate()
	 * @model
	 * @generated
	 */
	int getMemoryUpdate();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.VerticalScalingAction#getMemoryUpdate <em>Memory Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Update</em>' attribute.
	 * @see #getMemoryUpdate()
	 * @generated
	 */
	void setMemoryUpdate(int value);

	/**
	 * Returns the value of the '<em><b>CPU Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CPU Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPU Update</em>' attribute.
	 * @see #setCPUUpdate(double)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getVerticalScalingAction_CPUUpdate()
	 * @model
	 * @generated
	 */
	double getCPUUpdate();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.VerticalScalingAction#getCPUUpdate <em>CPU Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPU Update</em>' attribute.
	 * @see #getCPUUpdate()
	 * @generated
	 */
	void setCPUUpdate(double value);

	/**
	 * Returns the value of the '<em><b>Core Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Update</em>' attribute.
	 * @see #setCoreUpdate(int)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getVerticalScalingAction_CoreUpdate()
	 * @model
	 * @generated
	 */
	int getCoreUpdate();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.VerticalScalingAction#getCoreUpdate <em>Core Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Update</em>' attribute.
	 * @see #getCoreUpdate()
	 * @generated
	 */
	void setCoreUpdate(int value);

	/**
	 * Returns the value of the '<em><b>Storage Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Update</em>' attribute.
	 * @see #setStorageUpdate(int)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getVerticalScalingAction_StorageUpdate()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='Schedule' unique='false' upper='*'"
	 * @generated
	 */
	int getStorageUpdate();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.VerticalScalingAction#getStorageUpdate <em>Storage Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Update</em>' attribute.
	 * @see #getStorageUpdate()
	 * @generated
	 */
	void setStorageUpdate(int value);

	/**
	 * Returns the value of the '<em><b>Io Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Update</em>' attribute.
	 * @see #setIoUpdate(int)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getVerticalScalingAction_IoUpdate()
	 * @model
	 * @generated
	 */
	int getIoUpdate();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.VerticalScalingAction#getIoUpdate <em>Io Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io Update</em>' attribute.
	 * @see #getIoUpdate()
	 * @generated
	 */
	void setIoUpdate(int value);

	/**
	 * Returns the value of the '<em><b>Network Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Update</em>' attribute.
	 * @see #setNetworkUpdate(int)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getVerticalScalingAction_NetworkUpdate()
	 * @model
	 * @generated
	 */
	int getNetworkUpdate();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.VerticalScalingAction#getNetworkUpdate <em>Network Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Update</em>' attribute.
	 * @see #getNetworkUpdate()
	 * @generated
	 */
	void setNetworkUpdate(int value);

} // VerticalScalingAction
