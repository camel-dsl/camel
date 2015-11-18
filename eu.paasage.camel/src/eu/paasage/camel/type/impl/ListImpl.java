/**
 */
package eu.paasage.camel.type.impl;

import eu.paasage.camel.type.List;
import eu.paasage.camel.type.SingleValue;
import eu.paasage.camel.type.TypeEnum;
import eu.paasage.camel.type.TypePackage;
import eu.paasage.camel.type.ValueType;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.type.impl.ListImpl#getValues <em>Values</em>}</li>
 *   <li>{@link eu.paasage.camel.type.impl.ListImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link eu.paasage.camel.type.impl.ListImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListImpl extends ValueTypeImpl implements List {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SingleValue> getValues() {
		return (EList<SingleValue>)eGet(TypePackage.Literals.LIST__VALUES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEnum getPrimitiveType() {
		return (TypeEnum)eGet(TypePackage.Literals.LIST__PRIMITIVE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveType(TypeEnum newPrimitiveType) {
		eSet(TypePackage.Literals.LIST__PRIMITIVE_TYPE, newPrimitiveType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType getType() {
		return (ValueType)eGet(TypePackage.Literals.LIST__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ValueType newType) {
		eSet(TypePackage.Literals.LIST__TYPE, newType);
	}

	/**
	 * The cached invocation delegate for the '{@link #includesValue(eu.paasage.camel.type.SingleValue) <em>Includes Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #includesValue(eu.paasage.camel.type.SingleValue)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INCLUDES_VALUE_SINGLE_VALUE__EINVOCATION_DELEGATE = ((EOperation.Internal)TypePackage.Literals.LIST___INCLUDES_VALUE__SINGLEVALUE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesValue(SingleValue v) {
		try {
			return (Boolean)INCLUDES_VALUE_SINGLE_VALUE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{v}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #checkValueType(eu.paasage.camel.type.SingleValue) <em>Check Value Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #checkValueType(eu.paasage.camel.type.SingleValue)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CHECK_VALUE_TYPE_SINGLE_VALUE__EINVOCATION_DELEGATE = ((EOperation.Internal)TypePackage.Literals.LIST___CHECK_VALUE_TYPE__SINGLEVALUE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkValueType(SingleValue p) {
		try {
			return (Boolean)CHECK_VALUE_TYPE_SINGLE_VALUE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{p}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TypePackage.LIST___INCLUDES_VALUE__SINGLEVALUE:
				return includesValue((SingleValue)arguments.get(0));
			case TypePackage.LIST___CHECK_VALUE_TYPE__SINGLEVALUE:
				return checkValueType((SingleValue)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ListImpl
