/**
 */
package eu.paasage.camel.requirement;

import eu.paasage.camel.location.Location;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.LocationRequirement#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.requirement.RequirementPackage#getLocationRequirement()
 * @model
 * @generated
 */
public interface LocationRequirement extends HardRequirement {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.location.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see eu.paasage.camel.requirement.RequirementPackage#getLocationRequirement_Locations()
	 * @model required="true"
	 * @generated
	 */
	EList<Location> getLocations();

} // LocationRequirement
