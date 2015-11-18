/**
 */
package eu.paasage.camel.provider;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feat Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.provider.FeatCardinality#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.provider.ProviderPackage#getFeatCardinality()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='correct_feat_cardinality'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot correct_feat_cardinality='Tuple {\n\tmessage : String = \'In FeatCardinality: \' + self.toString() +\n\t\t\t\t\t\' either the value given is negative or the value is less than cardinalityMin or value is greater than cardinalityMax\',\n\tstatus : Boolean = (value\n\t\t\t\t\t> 0 implies (cardinalityMin <= value) and (cardinalityMax <> - 1 implies value <= cardinalityMax))\n}.status'"
 * @generated
 */
public interface FeatCardinality extends Cardinality {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see eu.paasage.camel.provider.ProviderPackage#getFeatCardinality_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.FeatCardinality#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // FeatCardinality
