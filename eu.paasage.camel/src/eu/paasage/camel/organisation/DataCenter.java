/**
 */
package eu.paasage.camel.organisation;

import eu.paasage.camel.location.Location;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Center</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.DataCenter#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.DataCenter#getCodeName <em>Code Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.DataCenter#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.organisation.OrganisationPackage#getDataCenter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='unique_datacenter_per_provider no_datacenter_same_location_same_provider'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot unique_datacenter_per_provider='Tuple {\n\tmessage : String = \'There exist data centers of cloud provider that have the same name or the same code name\',\n\tstatus : Boolean = DataCenter.allInstances()\n\t\t\t\t\t->forAll(p1, p2 | p1 <> p2 and p1.oclContainer().oclAsType(OrganisationModel).provider = p2.oclContainer().oclAsType(OrganisationModel).provider implies p1.name <> p2.name and p1.codeName <>\n\t\t\t\t\t\tp2.codeName)\n}.status' no_datacenter_same_location_same_provider='Tuple {\n\tmessage : String = \'There exist data centers of cloud provider which are on the same fine-grained location\',\n\tstatus : Boolean = DataCenter.allInstances()\n\t\t\t\t\t->forAll(p1, p2 | p1 <> p2 and p1.name <> p2.name and p1.oclContainer().oclAsType(OrganisationModel).provider = p2.oclContainer().oclAsType(OrganisationModel).provider implies p1.location <>\n\t\t\t\t\t\tp2.location)\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface DataCenter extends CDOObject {
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
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getDataCenter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.DataCenter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Name</em>' attribute.
	 * @see #setCodeName(String)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getDataCenter_CodeName()
	 * @model required="true"
	 * @generated
	 */
	String getCodeName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.DataCenter#getCodeName <em>Code Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Name</em>' attribute.
	 * @see #getCodeName()
	 * @generated
	 */
	void setCodeName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getDataCenter_Location()
	 * @model required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.DataCenter#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // DataCenter
