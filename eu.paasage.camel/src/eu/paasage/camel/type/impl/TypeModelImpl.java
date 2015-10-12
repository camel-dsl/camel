/**
 */
package eu.paasage.camel.type.impl;

import eu.paasage.camel.impl.ModelImpl;

import eu.paasage.camel.type.SingleValue;
import eu.paasage.camel.type.TypeModel;
import eu.paasage.camel.type.TypePackage;
import eu.paasage.camel.type.ValueType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.type.impl.TypeModelImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link eu.paasage.camel.type.impl.TypeModelImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeModelImpl extends ModelImpl implements TypeModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.TYPE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ValueType> getDataTypes() {
		return (EList<ValueType>)eGet(TypePackage.Literals.TYPE_MODEL__DATA_TYPES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SingleValue> getValues() {
		return (EList<SingleValue>)eGet(TypePackage.Literals.TYPE_MODEL__VALUES, true);
	}

} //TypeModelImpl
