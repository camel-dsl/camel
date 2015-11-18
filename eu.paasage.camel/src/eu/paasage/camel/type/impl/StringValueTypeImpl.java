/**
 */
package eu.paasage.camel.type.impl;

import eu.paasage.camel.type.StringValueType;
import eu.paasage.camel.type.TypeEnum;
import eu.paasage.camel.type.TypePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.type.impl.StringValueTypeImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringValueTypeImpl extends ValueTypeImpl implements StringValueType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.STRING_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEnum getPrimitiveType() {
		return (TypeEnum)eGet(TypePackage.Literals.STRING_VALUE_TYPE__PRIMITIVE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveType(TypeEnum newPrimitiveType) {
		eSet(TypePackage.Literals.STRING_VALUE_TYPE__PRIMITIVE_TYPE, newPrimitiveType);
	}

} //StringValueTypeImpl
