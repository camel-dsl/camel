/**
 */
package eu.paasage.camel.provider.impl;

import eu.paasage.camel.impl.ModelImpl;

import eu.paasage.camel.provider.Constraint;
import eu.paasage.camel.provider.Feature;
import eu.paasage.camel.provider.ProviderModel;
import eu.paasage.camel.provider.ProviderPackage;

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
 *   <li>{@link eu.paasage.camel.provider.impl.ProviderModelImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.impl.ProviderModelImpl#getRootFeature <em>Root Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProviderModelImpl extends ModelImpl implements ProviderModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProviderPackage.Literals.PROVIDER_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Constraint> getConstraints() {
		return (EList<Constraint>)eGet(ProviderPackage.Literals.PROVIDER_MODEL__CONSTRAINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getRootFeature() {
		return (Feature)eGet(ProviderPackage.Literals.PROVIDER_MODEL__ROOT_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootFeature(Feature newRootFeature) {
		eSet(ProviderPackage.Literals.PROVIDER_MODEL__ROOT_FEATURE, newRootFeature);
	}

} //ProviderModelImpl
