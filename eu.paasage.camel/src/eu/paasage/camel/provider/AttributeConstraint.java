/**
 */
package eu.paasage.camel.provider;

import eu.paasage.camel.type.SingleValue;
import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.provider.AttributeConstraint#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.AttributeConstraint#getFrom <em>From</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.AttributeConstraint#getTo <em>To</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.AttributeConstraint#getFromValue <em>From Value</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.AttributeConstraint#getToValue <em>To Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.provider.ProviderPackage#getAttributeConstraint()
 * @model annotation="Ecore attributeConstraintValidation='atLeastOneDefinied'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='attribute_constraint_correct_values different_attrs_in_attribute_constraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot attribute_constraint_correct_values='Tuple {\n\tmessage : String = \'In AttributeConstraint: \' + self.toString() +\n\t\t\t\t\t\' either the fromValue: \' + fromValue.toString() + \' or the toValue: \' + toValue.toString() +\n\t\t\t\t\t\' are not contained in the value types of the respective attributes: \' + from.name + \' \' + to.name +\n\t\t\t\t\t\', respectively\',\n\tstatus : Boolean = from.checkValue(fromValue, true) and to.checkValue(toValue, true)\n}.status' different_attrs_in_attribute_constraint='Tuple {\n\tmessage : String = \'In AttributeConstraint: \' + self.toString() +\n\t\t\t\t\t\' the same attribute: \' + from.name + \' is used in the from and to associations\',\n\tstatus : Boolean = from <> to\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface AttributeConstraint extends CDOObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Attribute)
	 * @see eu.paasage.camel.provider.ProviderPackage#getAttributeConstraint_From()
	 * @model required="true"
	 * @generated
	 */
	Attribute getFrom();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.AttributeConstraint#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Attribute value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Attribute)
	 * @see eu.paasage.camel.provider.ProviderPackage#getAttributeConstraint_To()
	 * @model required="true"
	 * @generated
	 */
	Attribute getTo();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.AttributeConstraint#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Attribute value);

	/**
	 * Returns the value of the '<em><b>From Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Value</em>' containment reference.
	 * @see #setFromValue(SingleValue)
	 * @see eu.paasage.camel.provider.ProviderPackage#getAttributeConstraint_FromValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SingleValue getFromValue();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.AttributeConstraint#getFromValue <em>From Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Value</em>' containment reference.
	 * @see #getFromValue()
	 * @generated
	 */
	void setFromValue(SingleValue value);

	/**
	 * Returns the value of the '<em><b>To Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Value</em>' containment reference.
	 * @see #setToValue(SingleValue)
	 * @see eu.paasage.camel.provider.ProviderPackage#getAttributeConstraint_ToValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SingleValue getToValue();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.AttributeConstraint#getToValue <em>To Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Value</em>' containment reference.
	 * @see #getToValue()
	 * @generated
	 */
	void setToValue(SingleValue value);

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
	 * @see eu.paasage.camel.provider.ProviderPackage#getAttributeConstraint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.AttributeConstraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AttributeConstraint
