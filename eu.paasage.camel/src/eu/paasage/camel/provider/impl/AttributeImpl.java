/**
 */
package eu.paasage.camel.provider.impl;

import eu.paasage.camel.provider.Attribute;
import eu.paasage.camel.provider.ProviderPackage;

import eu.paasage.camel.type.SingleValue;
import eu.paasage.camel.type.ValueType;

import eu.paasage.camel.unit.UnitType;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.provider.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.impl.AttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.impl.AttributeImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.impl.AttributeImpl#getUnitType <em>Unit Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends CDOObjectImpl implements Attribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProviderPackage.Literals.ATTRIBUTE;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ProviderPackage.Literals.ATTRIBUTE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ProviderPackage.Literals.ATTRIBUTE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValue getValue() {
		return (SingleValue)eGet(ProviderPackage.Literals.ATTRIBUTE__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(SingleValue newValue) {
		eSet(ProviderPackage.Literals.ATTRIBUTE__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType getValueType() {
		return (ValueType)eGet(ProviderPackage.Literals.ATTRIBUTE__VALUE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(ValueType newValueType) {
		eSet(ProviderPackage.Literals.ATTRIBUTE__VALUE_TYPE, newValueType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType getUnitType() {
		return (UnitType)eGet(ProviderPackage.Literals.ATTRIBUTE__UNIT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitType(UnitType newUnitType) {
		eSet(ProviderPackage.Literals.ATTRIBUTE__UNIT_TYPE, newUnitType);
	}

	/**
	 * The cached invocation delegate for the '{@link #checkValue(eu.paasage.camel.type.SingleValue, boolean) <em>Check Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #checkValue(eu.paasage.camel.type.SingleValue, boolean)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CHECK_VALUE_SINGLE_VALUE_BOOLEAN__EINVOCATION_DELEGATE = ((EOperation.Internal)ProviderPackage.Literals.ATTRIBUTE___CHECK_VALUE__SINGLEVALUE_BOOLEAN).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkValue(SingleValue v, boolean diff) {
		try {
			return (Boolean)CHECK_VALUE_SINGLE_VALUE_BOOLEAN__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{v, diff}));
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
			case ProviderPackage.ATTRIBUTE___CHECK_VALUE__SINGLEVALUE_BOOLEAN:
				return checkValue((SingleValue)arguments.get(0), (Boolean)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AttributeImpl
