/**
 */
package eu.paasage.camel.provider.impl;

import eu.paasage.camel.provider.AttributeConstraint;
import eu.paasage.camel.provider.Constraint;
import eu.paasage.camel.provider.Feature;
import eu.paasage.camel.provider.ProviderPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.provider.impl.ConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.impl.ConstraintImpl#getFrom <em>From</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.impl.ConstraintImpl#getTo <em>To</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.impl.ConstraintImpl#getAttributeConstraints <em>Attribute Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConstraintImpl extends CDOObjectImpl implements Constraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProviderPackage.Literals.CONSTRAINT;
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
		return (String)eGet(ProviderPackage.Literals.CONSTRAINT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ProviderPackage.Literals.CONSTRAINT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFrom() {
		return (Feature)eGet(ProviderPackage.Literals.CONSTRAINT__FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Feature newFrom) {
		eSet(ProviderPackage.Literals.CONSTRAINT__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getTo() {
		return (Feature)eGet(ProviderPackage.Literals.CONSTRAINT__TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Feature newTo) {
		eSet(ProviderPackage.Literals.CONSTRAINT__TO, newTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AttributeConstraint> getAttributeConstraints() {
		return (EList<AttributeConstraint>)eGet(ProviderPackage.Literals.CONSTRAINT__ATTRIBUTE_CONSTRAINTS, true);
	}

} //ConstraintImpl
