/**
 */
package eu.paasage.camel.type.impl;

import eu.paasage.camel.type.DoublePrecisionValue;
import eu.paasage.camel.type.TypePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double Precision Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.type.impl.DoublePrecisionValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoublePrecisionValueImpl extends NumericValueImpl implements DoublePrecisionValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoublePrecisionValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.DOUBLE_PRECISION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return (Double)eGet(TypePackage.Literals.DOUBLE_PRECISION_VALUE__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		eSet(TypePackage.Literals.DOUBLE_PRECISION_VALUE__VALUE, newValue);
	}

} //DoublePrecisionValueImpl
