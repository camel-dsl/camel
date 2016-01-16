/**
 */
package eu.paasage.camel.organisation.impl;

import eu.paasage.camel.organisation.OrganisationPackage;
import eu.paasage.camel.organisation.ServiceResourceFilter;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Resource Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.impl.ServiceResourceFilterImpl#getServiceURL <em>Service URL</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.ServiceResourceFilterImpl#isEveryService <em>Every Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceResourceFilterImpl extends ResourceFilterImpl implements ServiceResourceFilter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceResourceFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganisationPackage.Literals.SERVICE_RESOURCE_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceURL() {
		return (String)eGet(OrganisationPackage.Literals.SERVICE_RESOURCE_FILTER__SERVICE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceURL(String newServiceURL) {
		eSet(OrganisationPackage.Literals.SERVICE_RESOURCE_FILTER__SERVICE_URL, newServiceURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEveryService() {
		return (Boolean)eGet(OrganisationPackage.Literals.SERVICE_RESOURCE_FILTER__EVERY_SERVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEveryService(boolean newEveryService) {
		eSet(OrganisationPackage.Literals.SERVICE_RESOURCE_FILTER__EVERY_SERVICE, newEveryService);
	}

} //ServiceResourceFilterImpl
