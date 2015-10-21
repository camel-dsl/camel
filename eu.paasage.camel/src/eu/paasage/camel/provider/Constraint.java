/**
 */
package eu.paasage.camel.provider;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.provider.Constraint#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.Constraint#getFrom <em>From</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.Constraint#getTo <em>To</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.Constraint#getAttributeConstraints <em>Attribute Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.provider.ProviderPackage#getConstraint()
 * @model abstract="true"
 *        annotation="Ecore fromAttributeConstraintsvalidation='fromAttributesBelongsToFromFeature' toAttributeConstraintsvalidation='toAttributesBelongsToToFeature'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='constraint_from_attributes_belong_to_from_feature_and_symmetric'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot constraint_from_attributes_belong_to_from_feature_and_symmetric='Tuple {\n\tmessage : String = \'Constraint: \' + name +\n\t\t\t\t\t\' has attribute constraints which map to from or to attributes that do not belong to the respective from: \' +\n\t\t\t\t\tfrom.name + \' or to: \' + to.name + \' feature of this constraint\',\n\tstatus : Boolean = attributeConstraints\n\t\t\t\t\t->forAll(p | (from.attributes\n\t\t\t\t\t\t->includes(p.from) and to.attributes\n\t\t\t\t\t\t->includes(p.to)))\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface Constraint extends CDOObject {
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
	 * @see eu.paasage.camel.provider.ProviderPackage#getConstraint_Name()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='PropertyCondition' unique='false' upper='*'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Constraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Feature)
	 * @see eu.paasage.camel.provider.ProviderPackage#getConstraint_From()
	 * @model required="true"
	 * @generated
	 */
	Feature getFrom();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Constraint#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Feature value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Feature)
	 * @see eu.paasage.camel.provider.ProviderPackage#getConstraint_To()
	 * @model required="true"
	 * @generated
	 */
	Feature getTo();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Constraint#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Feature value);

	/**
	 * Returns the value of the '<em><b>Attribute Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.provider.AttributeConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Constraints</em>' containment reference list.
	 * @see eu.paasage.camel.provider.ProviderPackage#getConstraint_AttributeConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeConstraint> getAttributeConstraints();

} // Constraint
