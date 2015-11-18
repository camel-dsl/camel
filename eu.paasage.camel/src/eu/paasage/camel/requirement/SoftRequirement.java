/**
 */
package eu.paasage.camel.requirement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soft Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.SoftRequirement#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.requirement.RequirementPackage#getSoftRequirement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='non_negative_priorities_for_soft_requirement'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot non_negative_priorities_for_soft_requirement='Tuple {\n\tmessage : String = \'Requirement: \' + self.name + \' has a negative priority: \' +\n\t\t\t\t\tself.priority.toString(),\n\tstatus : Boolean = self.priority >= 0.0\n}.status'"
 * @generated
 */
public interface SoftRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(double)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getSoftRequirement_Priority()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='BinaryEventPattern' unique='false' upper='*'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='BinaryEventPattern' unique='false' upper='*'"
	 * @generated
	 */
	double getPriority();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.SoftRequirement#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(double value);

} // SoftRequirement
