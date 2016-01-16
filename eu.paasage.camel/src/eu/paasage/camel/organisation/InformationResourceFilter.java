/**
 */
package eu.paasage.camel.organisation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Resource Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.InformationResourceFilter#getInformationResourcePath <em>Information Resource Path</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.InformationResourceFilter#isEveryInformationResource <em>Every Information Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.organisation.OrganisationPackage#getInformationResourceFilter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='information_resource_filter_validity'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot information_resource_filter_validity='Tuple {\n\tmessage : String = \'InformationResourceFilter: \' + self.name +\n\t\t\t\t\t\' is not valid as both its own attributes were set\',\n\tstatus : Boolean = everyInformationResource = true implies\n\t\t\t\t\tinformationResourcePath = null\n}.status'"
 * @generated
 */
public interface InformationResourceFilter extends ResourceFilter {
	/**
	 * Returns the value of the '<em><b>Information Resource Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Resource Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Resource Path</em>' attribute.
	 * @see #setInformationResourcePath(String)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getInformationResourceFilter_InformationResourcePath()
	 * @model
	 * @generated
	 */
	String getInformationResourcePath();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.InformationResourceFilter#getInformationResourcePath <em>Information Resource Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Resource Path</em>' attribute.
	 * @see #getInformationResourcePath()
	 * @generated
	 */
	void setInformationResourcePath(String value);

	/**
	 * Returns the value of the '<em><b>Every Information Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Every Information Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Every Information Resource</em>' attribute.
	 * @see #setEveryInformationResource(boolean)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getInformationResourceFilter_EveryInformationResource()
	 * @model required="true"
	 * @generated
	 */
	boolean isEveryInformationResource();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.InformationResourceFilter#isEveryInformationResource <em>Every Information Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Every Information Resource</em>' attribute.
	 * @see #isEveryInformationResource()
	 * @generated
	 */
	void setEveryInformationResource(boolean value);

} // InformationResourceFilter
