/**
 */
package eu.paasage.camel.organisation;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.ResourceFilter#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.ResourceFilter#getResourcePattern <em>Resource Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.organisation.OrganisationPackage#getResourceFilter()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ResourceFilter extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getResourceFilter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.ResourceFilter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resource Pattern</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.organisation.ResourcePattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Pattern</em>' attribute.
	 * @see eu.paasage.camel.organisation.ResourcePattern
	 * @see #setResourcePattern(ResourcePattern)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getResourceFilter_ResourcePattern()
	 * @model required="true"
	 * @generated
	 */
	ResourcePattern getResourcePattern();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.ResourceFilter#getResourcePattern <em>Resource Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Pattern</em>' attribute.
	 * @see eu.paasage.camel.organisation.ResourcePattern
	 * @see #getResourcePattern()
	 * @generated
	 */
	void setResourcePattern(ResourcePattern value);

} // ResourceFilter
