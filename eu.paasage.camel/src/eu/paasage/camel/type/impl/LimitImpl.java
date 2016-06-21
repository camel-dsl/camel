/**
 */
package eu.paasage.camel.type.impl;

import eu.paasage.camel.type.Limit;
import eu.paasage.camel.type.NumericValue;
import eu.paasage.camel.type.TypePackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.type.impl.LimitImpl#isIncluded <em>Included</em>}</li>
 *   <li>{@link eu.paasage.camel.type.impl.LimitImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LimitImpl extends CDOObjectImpl implements Limit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.LIMIT;
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
	public boolean isIncluded() {
		return (Boolean)eGet(TypePackage.Literals.LIMIT__INCLUDED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncluded(boolean newIncluded) {
		eSet(TypePackage.Literals.LIMIT__INCLUDED, newIncluded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericValue getValue() {
		return (NumericValue)eGet(TypePackage.Literals.LIMIT__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(NumericValue newValue) {
		eSet(TypePackage.Literals.LIMIT__VALUE, newValue);
	}

} //LimitImpl
