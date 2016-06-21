/**
 */
package eu.paasage.camel.requirement.impl;

import eu.paasage.camel.location.Location;

import eu.paasage.camel.requirement.LocationRequirement;
import eu.paasage.camel.requirement.RequirementPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.impl.LocationRequirementImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationRequirementImpl extends HardRequirementImpl implements LocationRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.LOCATION_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Location> getLocations() {
		return (EList<Location>)eGet(RequirementPackage.Literals.LOCATION_REQUIREMENT__LOCATIONS, true);
	}

} //LocationRequirementImpl
