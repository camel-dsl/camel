/**
 */
package eu.paasage.camel.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.type.Enumeration#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.type.TypePackage#getEnumeration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='enumeration_all_values_diff'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot enumeration_all_values_diff='Tuple {\n\tmessage : String = \'Enumeration: \' + self.toString() +\n\t\t\t\t\t\' has two or more members which have either the same name or the same value\',\n\tstatus : Boolean = values\n\t\t\t\t\t->forAll(p1, p2 | p1 <> p2 implies (p1.name <> p2.name and p1.value <> p2.value))\n}.status'"
 * @generated
 */
public interface Enumeration extends ValueType {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.type.EnumerateValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see eu.paasage.camel.type.TypePackage#getEnumeration_Values()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnumerateValue> getValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.values\n\t\t\t\t\t\t->exists(p | p.name = name)'"
	 * @generated
	 */
	boolean includesName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.values\n\t\t\t\t\t\t->exists(p | p.value = value)'"
	 * @generated
	 */
	boolean includesValue(int value);

} // Enumeration
