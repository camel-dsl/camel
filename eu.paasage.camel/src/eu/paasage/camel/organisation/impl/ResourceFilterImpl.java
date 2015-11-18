/**
 */
package eu.paasage.camel.organisation.impl;

import eu.paasage.camel.organisation.OrganisationPackage;
import eu.paasage.camel.organisation.ResourceFilter;
import eu.paasage.camel.organisation.ResourcePattern;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.impl.ResourceFilterImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.ResourceFilterImpl#getResourcePattern <em>Resource Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceFilterImpl extends CDOObjectImpl implements ResourceFilter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganisationPackage.Literals.RESOURCE_FILTER;
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
		return (String)eGet(OrganisationPackage.Literals.RESOURCE_FILTER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(OrganisationPackage.Literals.RESOURCE_FILTER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePattern getResourcePattern() {
		return (ResourcePattern)eGet(OrganisationPackage.Literals.RESOURCE_FILTER__RESOURCE_PATTERN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourcePattern(ResourcePattern newResourcePattern) {
		eSet(OrganisationPackage.Literals.RESOURCE_FILTER__RESOURCE_PATTERN, newResourcePattern);
	}

} //ResourceFilterImpl
