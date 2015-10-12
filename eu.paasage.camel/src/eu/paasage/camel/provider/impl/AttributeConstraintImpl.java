/**
 */
package eu.paasage.camel.provider.impl;

import eu.paasage.camel.provider.Attribute;
import eu.paasage.camel.provider.AttributeConstraint;
import eu.paasage.camel.provider.ProviderPackage;

import eu.paasage.camel.type.SingleValue;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.provider.impl.AttributeConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.impl.AttributeConstraintImpl#getFrom <em>From</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.impl.AttributeConstraintImpl#getTo <em>To</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.impl.AttributeConstraintImpl#getFromValue <em>From Value</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.impl.AttributeConstraintImpl#getToValue <em>To Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeConstraintImpl extends CDOObjectImpl implements AttributeConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProviderPackage.Literals.ATTRIBUTE_CONSTRAINT;
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
		return (String)eGet(ProviderPackage.Literals.ATTRIBUTE_CONSTRAINT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ProviderPackage.Literals.ATTRIBUTE_CONSTRAINT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getFrom() {
		return (Attribute)eGet(ProviderPackage.Literals.ATTRIBUTE_CONSTRAINT__FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Attribute newFrom) {
		eSet(ProviderPackage.Literals.ATTRIBUTE_CONSTRAINT__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getTo() {
		return (Attribute)eGet(ProviderPackage.Literals.ATTRIBUTE_CONSTRAINT__TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Attribute newTo) {
		eSet(ProviderPackage.Literals.ATTRIBUTE_CONSTRAINT__TO, newTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValue getFromValue() {
		return (SingleValue)eGet(ProviderPackage.Literals.ATTRIBUTE_CONSTRAINT__FROM_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromValue(SingleValue newFromValue) {
		eSet(ProviderPackage.Literals.ATTRIBUTE_CONSTRAINT__FROM_VALUE, newFromValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValue getToValue() {
		return (SingleValue)eGet(ProviderPackage.Literals.ATTRIBUTE_CONSTRAINT__TO_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToValue(SingleValue newToValue) {
		eSet(ProviderPackage.Literals.ATTRIBUTE_CONSTRAINT__TO_VALUE, newToValue);
	}

} //AttributeConstraintImpl
