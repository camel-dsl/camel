/**
 */
package eu.paasage.camel.location.impl;

import eu.paasage.camel.location.GeographicalRegion;
import eu.paasage.camel.location.LocationPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geographical Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.location.impl.GeographicalRegionImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.location.impl.GeographicalRegionImpl#getParentRegions <em>Parent Regions</em>}</li>
 *   <li>{@link eu.paasage.camel.location.impl.GeographicalRegionImpl#getAlternativeNames <em>Alternative Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeographicalRegionImpl extends LocationImpl implements GeographicalRegion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeographicalRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationPackage.Literals.GEOGRAPHICAL_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(LocationPackage.Literals.GEOGRAPHICAL_REGION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(LocationPackage.Literals.GEOGRAPHICAL_REGION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GeographicalRegion> getParentRegions() {
		return (EList<GeographicalRegion>)eGet(LocationPackage.Literals.GEOGRAPHICAL_REGION__PARENT_REGIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getAlternativeNames() {
		return (EList<String>)eGet(LocationPackage.Literals.GEOGRAPHICAL_REGION__ALTERNATIVE_NAMES, true);
	}

} //GeographicalRegionImpl
