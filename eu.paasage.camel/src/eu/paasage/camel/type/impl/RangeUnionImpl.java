/**
 */
package eu.paasage.camel.type.impl;

import eu.paasage.camel.type.Range;
import eu.paasage.camel.type.RangeUnion;
import eu.paasage.camel.type.TypeEnum;
import eu.paasage.camel.type.TypePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Union</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.type.impl.RangeUnionImpl#getRanges <em>Ranges</em>}</li>
 *   <li>{@link eu.paasage.camel.type.impl.RangeUnionImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeUnionImpl extends ValueTypeImpl implements RangeUnion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeUnionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.RANGE_UNION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Range> getRanges() {
		return (EList<Range>)eGet(TypePackage.Literals.RANGE_UNION__RANGES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEnum getPrimitiveType() {
		return (TypeEnum)eGet(TypePackage.Literals.RANGE_UNION__PRIMITIVE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveType(TypeEnum newPrimitiveType) {
		eSet(TypePackage.Literals.RANGE_UNION__PRIMITIVE_TYPE, newPrimitiveType);
	}

	/**
	 * The cached invocation delegate for the '{@link #includesValue(double) <em>Includes Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #includesValue(double)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INCLUDES_VALUE_DOUBLE__EINVOCATION_DELEGATE = ((EOperation.Internal)TypePackage.Literals.RANGE_UNION___INCLUDES_VALUE__DOUBLE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesValue(double n) {
		try {
			return (Boolean)INCLUDES_VALUE_DOUBLE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{n}));
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
	public boolean invalidRangeSequence(final RangeUnion ru) {
		EList<Range> ranges = ru.getRanges();
				Range prev = ranges.get(0);
				for (int i = 1; i < ranges.size(); i++){
					Range next = ranges.get(i);
					eu.paasage.camel.type.Limit lowerLimit = prev.getUpperLimit();
					eu.paasage.camel.type.Limit upperLimit = next.getLowerLimit();
					boolean lowerInclusive = lowerLimit.isIncluded();
					boolean upperInclusive = upperLimit.isIncluded();
					if (!(lowerLimit instanceof eu.paasage.camel.type.NegativeInf) && !(upperLimit instanceof eu.paasage.camel.type.PositiveInf)){
						double low = 0.0, upper = 0.0;
						//Checking if already at end (positive infinity or next range starts with negative infinity
						eu.paasage.camel.type.NumericValue prevVal = lowerLimit.getValue();
						if (prevVal instanceof eu.paasage.camel.type.PositiveInf) return Boolean.TRUE;
						eu.paasage.camel.type.NumericValue nextVal = upperLimit.getValue();
						if (nextVal instanceof eu.paasage.camel.type.NegativeInf) return Boolean.TRUE;
						//Checking now that low is less or equal to upper
						if (prevVal instanceof eu.paasage.camel.type.IntegerValue){
							low = ((eu.paasage.camel.type.IntegerValue)prevVal).getValue();
							if (!lowerInclusive){
								low = low -1;
								lowerInclusive = true;
							}
						}
						else if (prevVal instanceof eu.paasage.camel.type.FloatsValue) low = ((eu.paasage.camel.type.FloatsValue)prevVal).getValue();
						else low = ((eu.paasage.camel.type.DoublePrecisionValue)prevVal).getValue();
						if (nextVal instanceof eu.paasage.camel.type.IntegerValue){
							upper = ((eu.paasage.camel.type.IntegerValue)nextVal).getValue();
							if (!upperInclusive){
								upper = upper + 1;
								upperInclusive = true;
							}
						}
						else if (nextVal instanceof eu.paasage.camel.type.FloatsValue) upper = ((eu.paasage.camel.type.FloatsValue)nextVal).getValue();
						else upper = ((eu.paasage.camel.type.DoublePrecisionValue)nextVal).getValue();
						System.out.println("Low is: " + low + " upper is: " + upper);
						if (low > upper || (low == upper && lowerInclusive == true )) return Boolean.TRUE;
					}
					prev = next;
				}
				return Boolean.FALSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TypePackage.RANGE_UNION___INCLUDES_VALUE__DOUBLE:
				return includesValue((Double)arguments.get(0));
			case TypePackage.RANGE_UNION___INVALID_RANGE_SEQUENCE__RANGEUNION:
				return invalidRangeSequence((RangeUnion)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RangeUnionImpl
