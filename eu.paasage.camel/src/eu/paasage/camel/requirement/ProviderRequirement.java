/**
 */
package eu.paasage.camel.requirement;

import eu.paasage.camel.organisation.CloudProvider;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.ProviderRequirement#getProviders <em>Providers</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.requirement.RequirementPackage#getProviderRequirement()
 * @model
 * @generated
 */
public interface ProviderRequirement extends HardRequirement {
	/**
	 * Returns the value of the '<em><b>Providers</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.organisation.CloudProvider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' reference list.
	 * @see eu.paasage.camel.requirement.RequirementPackage#getProviderRequirement_Providers()
	 * @model required="true"
	 * @generated
	 */
	EList<CloudProvider> getProviders();

} // ProviderRequirement
