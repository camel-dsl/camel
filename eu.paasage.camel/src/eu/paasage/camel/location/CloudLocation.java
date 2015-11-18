/**
 */
package eu.paasage.camel.location;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.location.CloudLocation#isIsAssignable <em>Is Assignable</em>}</li>
 *   <li>{@link eu.paasage.camel.location.CloudLocation#getSubLocations <em>Sub Locations</em>}</li>
 *   <li>{@link eu.paasage.camel.location.CloudLocation#getParent <em>Parent</em>}</li>
 *   <li>{@link eu.paasage.camel.location.CloudLocation#getGeographicalRegion <em>Geographical Region</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.location.LocationPackage#getCloudLocation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='cloud_location_same_as_parent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot cloud_location_same_as_parent='Tuple {\n\tmessage : String = \'CloudLocation: \' + self.id +\n\t\t\t\t\t\' should not be the same as its parent\',\n\tstatus : Boolean = parent <> null implies parent.id <> self.id\n}.status'"
 * @generated
 */
public interface CloudLocation extends Location {
	/**
	 * Returns the value of the '<em><b>Is Assignable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Assignable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Assignable</em>' attribute.
	 * @see #setIsAssignable(boolean)
	 * @see eu.paasage.camel.location.LocationPackage#getCloudLocation_IsAssignable()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsAssignable();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.location.CloudLocation#isIsAssignable <em>Is Assignable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Assignable</em>' attribute.
	 * @see #isIsAssignable()
	 * @generated
	 */
	void setIsAssignable(boolean value);

	/**
	 * Returns the value of the '<em><b>Sub Locations</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.location.CloudLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Locations</em>' containment reference list.
	 * @see eu.paasage.camel.location.LocationPackage#getCloudLocation_SubLocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CloudLocation> getSubLocations();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(CloudLocation)
	 * @see eu.paasage.camel.location.LocationPackage#getCloudLocation_Parent()
	 * @model
	 * @generated
	 */
	CloudLocation getParent();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.location.CloudLocation#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CloudLocation value);

	/**
	 * Returns the value of the '<em><b>Geographical Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geographical Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geographical Region</em>' reference.
	 * @see #setGeographicalRegion(GeographicalRegion)
	 * @see eu.paasage.camel.location.LocationPackage#getCloudLocation_GeographicalRegion()
	 * @model
	 * @generated
	 */
	GeographicalRegion getGeographicalRegion();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.location.CloudLocation#getGeographicalRegion <em>Geographical Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geographical Region</em>' reference.
	 * @see #getGeographicalRegion()
	 * @generated
	 */
	void setGeographicalRegion(GeographicalRegion value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='System.out.println(\"Checking recursiveness for CloudLocation: \" + cl1.getId());\r\n\t\tfor (eu.paasage.camel.location.CloudLocation cl: cl1.getSubLocations()){\r\n\t\t\t\tif (cl.getId().equals(cl2.getId())) return Boolean.TRUE;\r\n\t\t\t\tif (checkRecursiveness(cl,cl2)) return Boolean.TRUE;\n\t\t}\r\n\t\treturn Boolean.FALSE;'"
	 * @generated
	 */
	boolean checkRecursiveness(CloudLocation cl1, CloudLocation cl2);

} // CloudLocation
