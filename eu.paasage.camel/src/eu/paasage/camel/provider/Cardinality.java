/**
 */
package eu.paasage.camel.provider;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.provider.Cardinality#getCardinalityMin <em>Cardinality Min</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.Cardinality#getCardinalityMax <em>Cardinality Max</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.provider.ProviderPackage#getCardinality()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='cardinality_min_less_equal_than_max'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot cardinality_min_less_equal_than_max='Tuple {\n\tmessage : String = \'In Cardinality\' + self.toString() +\n\t\t\t\t\t\' either negative values are given for cardinalityMin or cardinalityMax or cardinalityMin is greater than cardinalityMax\',\n\tstatus : Boolean = cardinalityMin\n\t\t\t\t\t>= 0 and (cardinalityMax >= 0 implies cardinalityMin <= cardinalityMax)\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface Cardinality extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Cardinality Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Min</em>' attribute.
	 * @see #setCardinalityMin(int)
	 * @see eu.paasage.camel.provider.ProviderPackage#getCardinality_CardinalityMin()
	 * @model required="true"
	 * @generated
	 */
	int getCardinalityMin();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Cardinality#getCardinalityMin <em>Cardinality Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Min</em>' attribute.
	 * @see #getCardinalityMin()
	 * @generated
	 */
	void setCardinalityMin(int value);

	/**
	 * Returns the value of the '<em><b>Cardinality Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Max</em>' attribute.
	 * @see #setCardinalityMax(int)
	 * @see eu.paasage.camel.provider.ProviderPackage#getCardinality_CardinalityMax()
	 * @model required="true"
	 * @generated
	 */
	int getCardinalityMax();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Cardinality#getCardinalityMax <em>Cardinality Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Max</em>' attribute.
	 * @see #getCardinalityMax()
	 * @generated
	 */
	void setCardinalityMax(int value);

} // Cardinality
