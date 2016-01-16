/**
 */
package eu.paasage.camel.organisation.impl;

import eu.paasage.camel.organisation.InformationResourceFilter;
import eu.paasage.camel.organisation.OrganisationPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Resource Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.impl.InformationResourceFilterImpl#getInformationResourcePath <em>Information Resource Path</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.InformationResourceFilterImpl#isEveryInformationResource <em>Every Information Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationResourceFilterImpl extends ResourceFilterImpl implements InformationResourceFilter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationResourceFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganisationPackage.Literals.INFORMATION_RESOURCE_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInformationResourcePath() {
		return (String)eGet(OrganisationPackage.Literals.INFORMATION_RESOURCE_FILTER__INFORMATION_RESOURCE_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationResourcePath(String newInformationResourcePath) {
		eSet(OrganisationPackage.Literals.INFORMATION_RESOURCE_FILTER__INFORMATION_RESOURCE_PATH, newInformationResourcePath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEveryInformationResource() {
		return (Boolean)eGet(OrganisationPackage.Literals.INFORMATION_RESOURCE_FILTER__EVERY_INFORMATION_RESOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEveryInformationResource(boolean newEveryInformationResource) {
		eSet(OrganisationPackage.Literals.INFORMATION_RESOURCE_FILTER__EVERY_INFORMATION_RESOURCE, newEveryInformationResource);
	}

} //InformationResourceFilterImpl
