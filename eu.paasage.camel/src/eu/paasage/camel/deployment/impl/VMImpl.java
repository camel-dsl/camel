/**
 */
package eu.paasage.camel.deployment.impl;

import eu.paasage.camel.deployment.DeploymentPackage;
import eu.paasage.camel.deployment.VM;
import eu.paasage.camel.deployment.VMRequirementSet;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.impl.VMImpl#getVmRequirementSet <em>Vm Requirement Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VMImpl extends ComponentImpl implements VM {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.VM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMRequirementSet getVmRequirementSet() {
		return (VMRequirementSet)eGet(DeploymentPackage.Literals.VM__VM_REQUIREMENT_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmRequirementSet(VMRequirementSet newVmRequirementSet) {
		eSet(DeploymentPackage.Literals.VM__VM_REQUIREMENT_SET, newVmRequirementSet);
	}

} //VMImpl
