/**
 */
package eu.paasage.camel.location;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geographical Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.location.GeographicalRegion#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.location.GeographicalRegion#getParentRegions <em>Parent Regions</em>}</li>
 *   <li>{@link eu.paasage.camel.location.GeographicalRegion#getAlternativeNames <em>Alternative Names</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.location.LocationPackage#getGeographicalRegion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='geographical_region_not_in_parents'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot geographical_region_not_in_parents='Tuple {\n\tmessage : String = \'Geographical Region:\' + self.name +\n\t\t\t\t\t\' cannot be equivalent to any of its parents\',\n\tstatus : Boolean = self.parentRegions\n\t\t\t\t\t->forAll(p | p.name <> self.name)\n}.status'"
 * @generated
 */
public interface GeographicalRegion extends Location {
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
	 * @see eu.paasage.camel.location.LocationPackage#getGeographicalRegion_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.location.GeographicalRegion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Regions</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.location.GeographicalRegion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Regions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Regions</em>' reference list.
	 * @see eu.paasage.camel.location.LocationPackage#getGeographicalRegion_ParentRegions()
	 * @model
	 * @generated
	 */
	EList<GeographicalRegion> getParentRegions();

	/**
	 * Returns the value of the '<em><b>Alternative Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Names</em>' attribute list.
	 * @see eu.paasage.camel.location.LocationPackage#getGeographicalRegion_AlternativeNames()
	 * @model
	 * @generated
	 */
	EList<String> getAlternativeNames();

} // GeographicalRegion
