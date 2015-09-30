/**
 */
package eu.paasage.camel.requirement.impl;

import eu.paasage.camel.metric.Condition;
import eu.paasage.camel.requirement.RequirementPackage;
import eu.paasage.camel.requirement.ServiceLevelObjective;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Level Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.impl.ServiceLevelObjectiveImpl#getCustomServiceLevel <em>Custom Service Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceLevelObjectiveImpl extends HardRequirementImpl implements ServiceLevelObjective {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.SERVICE_LEVEL_OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCustomServiceLevel() {
		return (Condition)eGet(RequirementPackage.Literals.SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomServiceLevel(Condition newCustomServiceLevel) {
		eSet(RequirementPackage.Literals.SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL, newCustomServiceLevel);
	}

} //ServiceLevelObjectiveImpl
