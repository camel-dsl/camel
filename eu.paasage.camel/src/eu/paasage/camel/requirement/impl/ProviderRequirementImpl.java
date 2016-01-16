/**
 */
package eu.paasage.camel.requirement.impl;

import eu.paasage.camel.organisation.CloudProvider;

import eu.paasage.camel.requirement.ProviderRequirement;
import eu.paasage.camel.requirement.RequirementPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.impl.ProviderRequirementImpl#getProviders <em>Providers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProviderRequirementImpl extends HardRequirementImpl implements ProviderRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.PROVIDER_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CloudProvider> getProviders() {
		return (EList<CloudProvider>)eGet(RequirementPackage.Literals.PROVIDER_REQUIREMENT__PROVIDERS, true);
	}

} //ProviderRequirementImpl
