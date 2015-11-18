/**
 */
package eu.paasage.camel.type.impl;

import eu.paasage.camel.type.SingleValue;
import eu.paasage.camel.type.TypePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SingleValueImpl extends CDOObjectImpl implements SingleValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.SINGLE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * The cached invocation delegate for the '{@link #valueEquals(eu.paasage.camel.type.SingleValue) <em>Value Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #valueEquals(eu.paasage.camel.type.SingleValue)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALUE_EQUALS_SINGLE_VALUE__EINVOCATION_DELEGATE = ((EOperation.Internal)TypePackage.Literals.SINGLE_VALUE___VALUE_EQUALS__SINGLEVALUE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean valueEquals(SingleValue v) {
		try {
			return (Boolean)VALUE_EQUALS_SINGLE_VALUE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{v}));
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
			case TypePackage.SINGLE_VALUE___VALUE_EQUALS__SINGLEVALUE:
				return valueEquals((SingleValue)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SingleValueImpl
