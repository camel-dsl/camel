/**
 */
package eu.paasage.camel.requirement;

import eu.paasage.camel.metric.Condition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.ServiceLevelObjective#getCustomServiceLevel <em>Custom Service Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.requirement.RequirementPackage#getServiceLevelObjective()
 * @model
 * @generated
 */
public interface ServiceLevelObjective extends HardRequirement {
	/**
	 * Returns the value of the '<em><b>Custom Service Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Service Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Service Level</em>' reference.
	 * @see #setCustomServiceLevel(Condition)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getServiceLevelObjective_CustomServiceLevel()
	 * @model required="true"
	 * @generated
	 */
	Condition getCustomServiceLevel();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.ServiceLevelObjective#getCustomServiceLevel <em>Custom Service Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Service Level</em>' reference.
	 * @see #getCustomServiceLevel()
	 * @generated
	 */
	void setCustomServiceLevel(Condition value);

} // ServiceLevelObjective
