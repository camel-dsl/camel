/**
 */
package eu.paasage.camel.security.util;

import eu.paasage.camel.Model;

import eu.paasage.camel.metric.CompositeMetric;
import eu.paasage.camel.metric.CompositeMetricInstance;
import eu.paasage.camel.metric.Metric;
import eu.paasage.camel.metric.MetricFormulaParameter;
import eu.paasage.camel.metric.MetricInstance;
import eu.paasage.camel.metric.Property;
import eu.paasage.camel.metric.RawMetric;
import eu.paasage.camel.metric.RawMetricInstance;

import eu.paasage.camel.requirement.HardRequirement;
import eu.paasage.camel.requirement.Requirement;
import eu.paasage.camel.requirement.ServiceLevelObjective;

import eu.paasage.camel.security.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.security.SecurityPackage
 * @generated
 */
public class SecuritySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecurityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritySwitch() {
		if (modelPackage == null) {
			modelPackage = SecurityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SecurityPackage.SECURITY_MODEL: {
				SecurityModel securityModel = (SecurityModel)theEObject;
				T result = caseSecurityModel(securityModel);
				if (result == null) result = caseModel(securityModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.SECURITY_DOMAIN: {
				SecurityDomain securityDomain = (SecurityDomain)theEObject;
				T result = caseSecurityDomain(securityDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.SECURITY_CONTROL: {
				SecurityControl securityControl = (SecurityControl)theEObject;
				T result = caseSecurityControl(securityControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.RAW_SECURITY_METRIC_INSTANCE: {
				RawSecurityMetricInstance rawSecurityMetricInstance = (RawSecurityMetricInstance)theEObject;
				T result = caseRawSecurityMetricInstance(rawSecurityMetricInstance);
				if (result == null) result = caseRawMetricInstance(rawSecurityMetricInstance);
				if (result == null) result = caseMetricInstance(rawSecurityMetricInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.RAW_SECURITY_METRIC: {
				RawSecurityMetric rawSecurityMetric = (RawSecurityMetric)theEObject;
				T result = caseRawSecurityMetric(rawSecurityMetric);
				if (result == null) result = caseRawMetric(rawSecurityMetric);
				if (result == null) result = caseMetric(rawSecurityMetric);
				if (result == null) result = caseMetricFormulaParameter(rawSecurityMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.SECURITY_PROPERTY: {
				SecurityProperty securityProperty = (SecurityProperty)theEObject;
				T result = caseSecurityProperty(securityProperty);
				if (result == null) result = caseProperty(securityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.CERTIFIABLE: {
				Certifiable certifiable = (Certifiable)theEObject;
				T result = caseCertifiable(certifiable);
				if (result == null) result = caseSecurityProperty(certifiable);
				if (result == null) result = caseProperty(certifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.SECURITY_SLO: {
				SecuritySLO securitySLO = (SecuritySLO)theEObject;
				T result = caseSecuritySLO(securitySLO);
				if (result == null) result = caseServiceLevelObjective(securitySLO);
				if (result == null) result = caseHardRequirement(securitySLO);
				if (result == null) result = caseRequirement(securitySLO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.SECURITY_CAPABILITY: {
				SecurityCapability securityCapability = (SecurityCapability)theEObject;
				T result = caseSecurityCapability(securityCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.COMPOSITE_SECURITY_METRIC: {
				CompositeSecurityMetric compositeSecurityMetric = (CompositeSecurityMetric)theEObject;
				T result = caseCompositeSecurityMetric(compositeSecurityMetric);
				if (result == null) result = caseCompositeMetric(compositeSecurityMetric);
				if (result == null) result = caseMetric(compositeSecurityMetric);
				if (result == null) result = caseMetricFormulaParameter(compositeSecurityMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.COMPOSITE_SECURITY_METRIC_INSTANCE: {
				CompositeSecurityMetricInstance compositeSecurityMetricInstance = (CompositeSecurityMetricInstance)theEObject;
				T result = caseCompositeSecurityMetricInstance(compositeSecurityMetricInstance);
				if (result == null) result = caseCompositeMetricInstance(compositeSecurityMetricInstance);
				if (result == null) result = caseMetricInstance(compositeSecurityMetricInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityModel(SecurityModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityDomain(SecurityDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityControl(SecurityControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raw Security Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raw Security Metric Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRawSecurityMetricInstance(RawSecurityMetricInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raw Security Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raw Security Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRawSecurityMetric(RawSecurityMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityProperty(SecurityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertifiable(Certifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SLO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SLO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecuritySLO(SecuritySLO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityCapability(SecurityCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Security Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Security Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSecurityMetric(CompositeSecurityMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Security Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Security Metric Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSecurityMetricInstance(CompositeSecurityMetricInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricInstance(MetricInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raw Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raw Metric Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRawMetricInstance(RawMetricInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricFormulaParameter(MetricFormulaParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetric(Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raw Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raw Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRawMetric(RawMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hard Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hard Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardRequirement(HardRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelObjective(ServiceLevelObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeMetric(CompositeMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Metric Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeMetricInstance(CompositeMetricInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SecuritySwitch
