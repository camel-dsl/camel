/**
 */
package eu.paasage.camel.provider;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requires</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.provider.Requires#getScopeFrom <em>Scope From</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.Requires#getScopeTo <em>Scope To</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.Requires#getCardFrom <em>Card From</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.Requires#getCardTo <em>Card To</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.provider.ProviderPackage#getRequires()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='requires_cardFrom_to_conformance'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot requires_cardFrom_to_conformance='Tuple {\n\tmessage : String = \'In Requires Constraint: \' + self.name +\n\t\t\t\t\t\' there are from or to cardinalities that do not conform to the designated cardinality restrictions of the respective from: \'\n\t\t\t\t\t+ from.name + \' or to: \' + to.name + \' features of this constraint\',\n\tstatus : Boolean = (cardFrom <> null implies\n\t\t\t\t\t(cardFrom.cardinalityMin >= from.featureCardinality.cardinalityMin and ((from.featureCardinality.cardinalityMax =\n\t\t\t\t\t- 1) or (cardFrom.cardinalityMax <> - 1 and cardFrom.cardinalityMax <= from.featureCardinality.cardinalityMax))))\n\t\t\t\t\tand (cardTo <> null implies (cardTo.cardinalityMin >= to.featureCardinality.cardinalityMin and\n\t\t\t\t\t((to.featureCardinality.cardinalityMax = - 1) or (cardTo.cardinalityMax <> - 1 and cardTo.cardinalityMax <=\n\t\t\t\t\tto.featureCardinality.cardinalityMax))))\n}.status'"
 * @generated
 */
public interface Requires extends Constraint {
	/**
	 * Returns the value of the '<em><b>Scope From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope From</em>' containment reference.
	 * @see #setScopeFrom(Scope)
	 * @see eu.paasage.camel.provider.ProviderPackage#getRequires_ScopeFrom()
	 * @model containment="true"
	 * @generated
	 */
	Scope getScopeFrom();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Requires#getScopeFrom <em>Scope From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope From</em>' containment reference.
	 * @see #getScopeFrom()
	 * @generated
	 */
	void setScopeFrom(Scope value);

	/**
	 * Returns the value of the '<em><b>Scope To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope To</em>' containment reference.
	 * @see #setScopeTo(Scope)
	 * @see eu.paasage.camel.provider.ProviderPackage#getRequires_ScopeTo()
	 * @model containment="true"
	 * @generated
	 */
	Scope getScopeTo();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Requires#getScopeTo <em>Scope To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope To</em>' containment reference.
	 * @see #getScopeTo()
	 * @generated
	 */
	void setScopeTo(Scope value);

	/**
	 * Returns the value of the '<em><b>Card From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card From</em>' containment reference.
	 * @see #setCardFrom(FeatCardinality)
	 * @see eu.paasage.camel.provider.ProviderPackage#getRequires_CardFrom()
	 * @model containment="true"
	 * @generated
	 */
	FeatCardinality getCardFrom();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Requires#getCardFrom <em>Card From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card From</em>' containment reference.
	 * @see #getCardFrom()
	 * @generated
	 */
	void setCardFrom(FeatCardinality value);

	/**
	 * Returns the value of the '<em><b>Card To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card To</em>' containment reference.
	 * @see #setCardTo(FeatCardinality)
	 * @see eu.paasage.camel.provider.ProviderPackage#getRequires_CardTo()
	 * @model containment="true"
	 * @generated
	 */
	FeatCardinality getCardTo();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Requires#getCardTo <em>Card To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card To</em>' containment reference.
	 * @see #getCardTo()
	 * @generated
	 */
	void setCardTo(FeatCardinality value);

} // Requires
