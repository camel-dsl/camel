/**
 */
package eu.paasage.camel.requirement;

import eu.paasage.camel.deployment.InternalComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Horizontal Scale Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.HorizontalScaleRequirement#getMinInstances <em>Min Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.HorizontalScaleRequirement#getMaxInstances <em>Max Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.HorizontalScaleRequirement#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.requirement.RequirementPackage#getHorizontalScaleRequirement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='horiz_scale_requirement_min_max_enforcement'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot horiz_scale_requirement_min_max_enforcement='Tuple {\n\tmessage : String = \'HorizontalScaleRequirement: \' + self.name +\n\t\t\t\t\t\' has wrong values for the minInstances and/or maxInstance properties. The minInstances value should be positive, the maxInstances value positive or equal to -1, and when maxInstances value is positive, then minInstances value should not be greater than it\',\n\tstatus : Boolean = self.minInstances\n\t\t\t\t\t> 0 and (self.maxInstances > 0 or self.maxInstances = - 1) and (self.maxInstances <> - 1 implies self.minInstances\n\t\t\t\t\t<= self.maxInstances)\n}.status'"
 * @generated
 */
public interface HorizontalScaleRequirement extends ScaleRequirement {
	/**
	 * Returns the value of the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Instances</em>' attribute.
	 * @see #setMinInstances(int)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getHorizontalScaleRequirement_MinInstances()
	 * @model required="true"
	 * @generated
	 */
	int getMinInstances();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.HorizontalScaleRequirement#getMinInstances <em>Min Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Instances</em>' attribute.
	 * @see #getMinInstances()
	 * @generated
	 */
	void setMinInstances(int value);

	/**
	 * Returns the value of the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Instances</em>' attribute.
	 * @see #setMaxInstances(int)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getHorizontalScaleRequirement_MaxInstances()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='ScalabilityRule' unique='false' upper='*'"
	 * @generated
	 */
	int getMaxInstances();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.HorizontalScaleRequirement#getMaxInstances <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Instances</em>' attribute.
	 * @see #getMaxInstances()
	 * @generated
	 */
	void setMaxInstances(int value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(InternalComponent)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getHorizontalScaleRequirement_Component()
	 * @model required="true"
	 * @generated
	 */
	InternalComponent getComponent();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.HorizontalScaleRequirement#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(InternalComponent value);

} // HorizontalScaleRequirement
