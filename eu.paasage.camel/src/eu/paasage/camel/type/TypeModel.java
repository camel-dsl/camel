/**
 */
package eu.paasage.camel.type;

import eu.paasage.camel.Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.type.TypeModel#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link eu.paasage.camel.type.TypeModel#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.type.TypePackage#getTypeModel()
 * @model
 * @generated
 */
public interface TypeModel extends Model {
	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.type.ValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see eu.paasage.camel.type.TypePackage#getTypeModel_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueType> getDataTypes();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.type.SingleValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see eu.paasage.camel.type.TypePackage#getTypeModel_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<SingleValue> getValues();

} // TypeModel
