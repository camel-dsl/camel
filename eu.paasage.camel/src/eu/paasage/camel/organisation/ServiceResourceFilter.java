/**
 */
package eu.paasage.camel.organisation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Resource Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.ServiceResourceFilter#getServiceURL <em>Service URL</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.ServiceResourceFilter#isEveryService <em>Every Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.organisation.OrganisationPackage#getServiceResourceFilter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='service_resource_filter_validity'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot service_resource_filter_validity='Tuple {\n\tmessage : String = \'ServiceResourceFilter: \' + self.name +\n\t\t\t\t\t\' is not valid as both its own attributes were set\',\n\tstatus : Boolean = everyService = true implies serviceURL = null\n}.status'"
 * @generated
 */
public interface ServiceResourceFilter extends ResourceFilter {
	/**
	 * Returns the value of the '<em><b>Service URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service URL</em>' attribute.
	 * @see #setServiceURL(String)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getServiceResourceFilter_ServiceURL()
	 * @model
	 * @generated
	 */
	String getServiceURL();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.ServiceResourceFilter#getServiceURL <em>Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service URL</em>' attribute.
	 * @see #getServiceURL()
	 * @generated
	 */
	void setServiceURL(String value);

	/**
	 * Returns the value of the '<em><b>Every Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Every Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Every Service</em>' attribute.
	 * @see #setEveryService(boolean)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getServiceResourceFilter_EveryService()
	 * @model required="true"
	 * @generated
	 */
	boolean isEveryService();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.ServiceResourceFilter#isEveryService <em>Every Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Every Service</em>' attribute.
	 * @see #isEveryService()
	 * @generated
	 */
	void setEveryService(boolean value);

} // ServiceResourceFilter
