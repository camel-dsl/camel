/**
 */
package eu.paasage.camel.requirement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OS Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.OSRequirement#getOs <em>Os</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.OSRequirement#isIs64os <em>Is64os</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.requirement.RequirementPackage#getOSRequirement()
 * @model
 * @generated
 */
public interface OSRequirement extends OSOrImageRequirement {
	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(String)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getOSRequirement_Os()
	 * @model required="true"
	 * @generated
	 */
	String getOs();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.OSRequirement#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(String value);

	/**
	 * Returns the value of the '<em><b>Is64os</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is64os</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is64os</em>' attribute.
	 * @see #setIs64os(boolean)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getOSRequirement_Is64os()
	 * @model default="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='HorizontalScalingAction' unique='false' upper='*'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='HorizontalScalingAction' unique='false' upper='*'"
	 * @generated
	 */
	boolean isIs64os();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.OSRequirement#isIs64os <em>Is64os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is64os</em>' attribute.
	 * @see #isIs64os()
	 * @generated
	 */
	void setIs64os(boolean value);

} // OSRequirement
