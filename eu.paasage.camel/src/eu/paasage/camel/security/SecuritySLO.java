/**
 */
package eu.paasage.camel.security;

import eu.paasage.camel.requirement.ServiceLevelObjective;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SLO</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see eu.paasage.camel.security.SecurityPackage#getSecuritySLO()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='only_sec_constructs_in_condition'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot only_sec_constructs_in_condition='Tuple {\n\tmessage : String = \'SecuritySLO: \' + self.name +\n\t\t\t\t\t\' maps to non-security metrics or properties\',\n\tstatus : Boolean = if\n\t\t\t\t\t\t(customServiceLevel.oclIsTypeOf(camel::metric::MetricCondition))\n\t\t\t\t\tthen\n\t\t\t\t\t\tcustomServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.metric.oclIsTypeOf(camel::security::RawSecurityMetric)\n\t\t\t\t\t\tor\n\t\t\t\t\t\tcustomServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.metric.oclIsTypeOf(camel::security::CompositeSecurityMetric)\n\t\t\t\t\telse if (customServiceLevel.oclIsTypeOf(camel::metric::PropertyCondition))\n\t\t\t\t\t\tthen\n\t\t\t\t\t\t\tcustomServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.property.oclIsTypeOf(camel::security::SecurityProperty)\n\t\t\t\t\t\telse false\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n}.status'"
 * @generated
 */
public interface SecuritySLO extends ServiceLevelObjective {
} // SecuritySLO
