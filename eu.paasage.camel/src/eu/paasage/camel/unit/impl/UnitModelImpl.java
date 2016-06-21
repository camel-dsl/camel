/**
 */
package eu.paasage.camel.unit.impl;

import eu.paasage.camel.impl.ModelImpl;

import eu.paasage.camel.unit.Unit;
import eu.paasage.camel.unit.UnitModel;
import eu.paasage.camel.unit.UnitPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.unit.impl.UnitModelImpl#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitModelImpl extends ModelImpl implements UnitModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnitPackage.Literals.UNIT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Unit> getUnits() {
		return (EList<Unit>)eGet(UnitPackage.Literals.UNIT_MODEL__UNITS, true);
	}

} //UnitModelImpl
