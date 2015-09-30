/**
 */
package eu.paasage.camel.security;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see eu.paasage.camel.security.SecurityPackage#getCertifiable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='certifiable_realized_by'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot certifiable_realized_by='Tuple {\n\tmessage : String = \'Certifiable Property: \' + self.name +\n\t\t\t\t\t\' has a non-empty list of sub-properties\',\n\tstatus : Boolean = self.subProperties\n\t\t\t\t\t->isEmpty()\n}.status'"
 * @generated
 */
public interface Certifiable extends SecurityProperty {
} // Certifiable
