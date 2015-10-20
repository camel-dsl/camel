/**
 */
package eu.paasage.camel.deployment;

import eu.paasage.camel.provider.Attribute;

import eu.paasage.camel.type.SingleValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.VMInstance#getVmType <em>Vm Type</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.VMInstance#getVmTypeValue <em>Vm Type Value</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.VMInstance#getIp <em>Ip</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.deployment.DeploymentPackage#getVMInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='correct_type_for_vm_instance correct_vm_type_value_in_vm_instance'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot correct_type_for_vm_instance='Tuple {\n\tmessage : String = \'VM Instance: \' + self.name +\n\t\t\t\t\' should have as type a VM\',\n\tstatus : Boolean = type.oclIsTypeOf(VM)\n}.status' correct_vm_type_value_in_vm_instance='Tuple {\n\tmessage : String = \'VMInstance: \' + self.name +\n\t\t\t\t\' has a vmTypeValue which is not included in the ValueType of the vmType Attribute\',\n\tstatus : Boolean = ((vmType <> null and\n\t\t\t\tvmType.valueType <> null) implies (if (vmType.valueType.oclIsTypeOf(camel::type::Range))\n\t\t\t\tthen if (vmTypeValue.oclIsTypeOf(camel::type::IntegerValue))\n\t\t\t\t\tthen\n\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::Range).includesValue(vmTypeValue.oclAsType(camel::type::IntegerValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\telse if (vmTypeValue.oclIsTypeOf(camel::type::FloatsValue))\n\t\t\t\t\t\tthen\n\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::Range).includesValue(vmTypeValue.oclAsType(camel::type::FloatsValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\telse if (vmTypeValue.oclIsTypeOf(camel::type::DoublePrecisionValue))\n\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::Range).includesValue(vmTypeValue.oclAsType(camel::type::DoublePrecisionValue).value)\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\telse if (vmType.valueType.oclIsTypeOf(camel::type::Enumeration))\n\t\t\t\t\tthen if (vmTypeValue.oclIsTypeOf(camel::type::StringsValue))\n\t\t\t\t\t\tthen\n\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::Enumeration).includesName(vmTypeValue.oclAsType(camel::type::StringsValue).value)\n\t\t\t\t\t\telse if (vmTypeValue.oclIsTypeOf(camel::type::EnumerateValue))\n\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::Enumeration).includesName(vmTypeValue.oclAsType(camel::type::EnumerateValue).name)\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif\n\t\t\t\t\telse if (vmType.valueType.oclIsTypeOf(camel::type::List))\n\t\t\t\t\t\tthen vmType.valueType.oclAsType(camel::type::List).includesValue(vmTypeValue)\n\t\t\t\t\t\telse if (vmType.valueType.oclIsTypeOf(camel::type::RangeUnion))\n\t\t\t\t\t\t\tthen if (vmTypeValue.oclIsTypeOf(camel::type::IntegerValue))\n\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::RangeUnion).includesValue(vmTypeValue.oclAsType(camel::type::IntegerValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\telse if (vmTypeValue.oclIsTypeOf(camel::type::FloatsValue))\n\t\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::RangeUnion).includesValue(vmTypeValue.oclAsType(camel::type::FloatsValue).value.oclAsType(ecore::EDouble))\n\t\t\t\t\t\t\t\t\telse if (vmTypeValue.oclIsTypeOf(camel::type::DoublePrecisionValue))\n\t\t\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\t\t\tvmType.valueType.oclAsType(camel::type::RangeUnion).includesValue(vmTypeValue.oclAsType(camel::type::DoublePrecisionValue).value)\n\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif))\n}.status'"
 * @generated
 */
public interface VMInstance extends ComponentInstance {
	/**
	 * Returns the value of the '<em><b>Vm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Type</em>' reference.
	 * @see #setVmType(Attribute)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getVMInstance_VmType()
	 * @model
	 * @generated
	 */
	Attribute getVmType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.VMInstance#getVmType <em>Vm Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Type</em>' reference.
	 * @see #getVmType()
	 * @generated
	 */
	void setVmType(Attribute value);

	/**
	 * Returns the value of the '<em><b>Vm Type Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Type Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Type Value</em>' reference.
	 * @see #setVmTypeValue(SingleValue)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getVMInstance_VmTypeValue()
	 * @model
	 * @generated
	 */
	SingleValue getVmTypeValue();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.VMInstance#getVmTypeValue <em>Vm Type Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Type Value</em>' reference.
	 * @see #getVmTypeValue()
	 * @generated
	 */
	void setVmTypeValue(SingleValue value);

	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see eu.paasage.camel.deployment.DeploymentPackage#getVMInstance_Ip()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='CommunicationInstance' unique='false' upper='*'"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.deployment.VMInstance#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='System.out.println(\"Checking dates for VMInstance: \" + vm);\n\t\tjava.util.Date createdOn = vm.getInstantiatedOn();\n\t\tjava.util.Date destroyedOn = vm.getDestroyedOn();\n\t\tif (createdOn != null && destroyedOn != null && destroyedOn.before(createdOn)) return Boolean.FALSE;\n\t\treturn Boolean.TRUE;'"
	 * @generated
	 */
	boolean checkDates(VMInstance vm);

} // VMInstance
