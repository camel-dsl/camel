/**
 */
package eu.paasage.camel.requirement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.ImageRequirement#getImageId <em>Image Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.requirement.RequirementPackage#getImageRequirement()
 * @model
 * @generated
 */
public interface ImageRequirement extends OSOrImageRequirement {
	/**
	 * Returns the value of the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Id</em>' attribute.
	 * @see #setImageId(String)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getImageRequirement_ImageId()
	 * @model required="true"
	 * @generated
	 */
	String getImageId();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.ImageRequirement#getImageId <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Id</em>' attribute.
	 * @see #getImageId()
	 * @generated
	 */
	void setImageId(String value);

} // ImageRequirement
