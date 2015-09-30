/**
 */
package eu.paasage.camel.provider;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.provider.Alternative#getGroupCardinality <em>Group Cardinality</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.Alternative#getVariants <em>Variants</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.provider.ProviderPackage#getAlternative()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='alternative_variants_diff_from_sub_features'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot alternative_variants_diff_from_sub_features='Tuple {\n\tmessage : String = \'There is a pair of subFeature and variant with the same name for Feature: \'\n\t\t\t\t\t+ self.name,\n\tstatus : Boolean = subFeatures\n\t\t\t\t\t->forAll(p | not (variants\n\t\t\t\t\t\t->exists(q | q.name = p.name)))\n}.status'"
 * @generated
 */
public interface Alternative extends Feature {
	/**
	 * Returns the value of the '<em><b>Group Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Cardinality</em>' containment reference.
	 * @see #setGroupCardinality(GroupCardinality)
	 * @see eu.paasage.camel.provider.ProviderPackage#getAlternative_GroupCardinality()
	 * @model containment="true"
	 * @generated
	 */
	GroupCardinality getGroupCardinality();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Alternative#getGroupCardinality <em>Group Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Cardinality</em>' containment reference.
	 * @see #getGroupCardinality()
	 * @generated
	 */
	void setGroupCardinality(GroupCardinality value);

	/**
	 * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.provider.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variants</em>' containment reference list.
	 * @see eu.paasage.camel.provider.ProviderPackage#getAlternative_Variants()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Feature> getVariants();

} // Alternative
