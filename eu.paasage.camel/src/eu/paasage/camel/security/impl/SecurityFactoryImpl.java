/**
 */
package eu.paasage.camel.security.impl;

import eu.paasage.camel.security.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityFactoryImpl extends EFactoryImpl implements SecurityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SecurityFactory init() {
		try {
			SecurityFactory theSecurityFactory = (SecurityFactory)EPackage.Registry.INSTANCE.getEFactory(SecurityPackage.eNS_URI);
			if (theSecurityFactory != null) {
				return theSecurityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SecurityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SecurityPackage.SECURITY_MODEL: return (EObject)createSecurityModel();
			case SecurityPackage.SECURITY_DOMAIN: return (EObject)createSecurityDomain();
			case SecurityPackage.SECURITY_CONTROL: return (EObject)createSecurityControl();
			case SecurityPackage.RAW_SECURITY_METRIC_INSTANCE: return (EObject)createRawSecurityMetricInstance();
			case SecurityPackage.RAW_SECURITY_METRIC: return (EObject)createRawSecurityMetric();
			case SecurityPackage.SECURITY_PROPERTY: return (EObject)createSecurityProperty();
			case SecurityPackage.CERTIFIABLE: return (EObject)createCertifiable();
			case SecurityPackage.SECURITY_SLO: return (EObject)createSecuritySLO();
			case SecurityPackage.SECURITY_CAPABILITY: return (EObject)createSecurityCapability();
			case SecurityPackage.COMPOSITE_SECURITY_METRIC: return (EObject)createCompositeSecurityMetric();
			case SecurityPackage.COMPOSITE_SECURITY_METRIC_INSTANCE: return (EObject)createCompositeSecurityMetricInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityModel createSecurityModel() {
		SecurityModelImpl securityModel = new SecurityModelImpl();
		return securityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityDomain createSecurityDomain() {
		SecurityDomainImpl securityDomain = new SecurityDomainImpl();
		return securityDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityControl createSecurityControl() {
		SecurityControlImpl securityControl = new SecurityControlImpl();
		return securityControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RawSecurityMetricInstance createRawSecurityMetricInstance() {
		RawSecurityMetricInstanceImpl rawSecurityMetricInstance = new RawSecurityMetricInstanceImpl();
		return rawSecurityMetricInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RawSecurityMetric createRawSecurityMetric() {
		RawSecurityMetricImpl rawSecurityMetric = new RawSecurityMetricImpl();
		return rawSecurityMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityProperty createSecurityProperty() {
		SecurityPropertyImpl securityProperty = new SecurityPropertyImpl();
		return securityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Certifiable createCertifiable() {
		CertifiableImpl certifiable = new CertifiableImpl();
		return certifiable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritySLO createSecuritySLO() {
		SecuritySLOImpl securitySLO = new SecuritySLOImpl();
		return securitySLO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityCapability createSecurityCapability() {
		SecurityCapabilityImpl securityCapability = new SecurityCapabilityImpl();
		return securityCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSecurityMetric createCompositeSecurityMetric() {
		CompositeSecurityMetricImpl compositeSecurityMetric = new CompositeSecurityMetricImpl();
		return compositeSecurityMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSecurityMetricInstance createCompositeSecurityMetricInstance() {
		CompositeSecurityMetricInstanceImpl compositeSecurityMetricInstance = new CompositeSecurityMetricInstanceImpl();
		return compositeSecurityMetricInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPackage getSecurityPackage() {
		return (SecurityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SecurityPackage getPackage() {
		return SecurityPackage.eINSTANCE;
	}

} //SecurityFactoryImpl
