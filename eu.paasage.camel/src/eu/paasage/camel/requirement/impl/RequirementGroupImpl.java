/**
 */
package eu.paasage.camel.requirement.impl;

import eu.paasage.camel.Application;
import eu.paasage.camel.requirement.HardRequirement;
import eu.paasage.camel.requirement.Requirement;
import eu.paasage.camel.requirement.RequirementGroup;
import eu.paasage.camel.requirement.RequirementOperatorType;
import eu.paasage.camel.requirement.RequirementPackage;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.impl.RequirementGroupImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.RequirementGroupImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.impl.RequirementGroupImpl#getRequirementOperator <em>Requirement Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementGroupImpl extends RequirementImpl implements RequirementGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.REQUIREMENT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Requirement> getRequirements() {
		return (EList<Requirement>)eGet(RequirementPackage.Literals.REQUIREMENT_GROUP__REQUIREMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Application> getApplication() {
		return (EList<Application>)eGet(RequirementPackage.Literals.REQUIREMENT_GROUP__APPLICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementOperatorType getRequirementOperator() {
		return (RequirementOperatorType)eGet(RequirementPackage.Literals.REQUIREMENT_GROUP__REQUIREMENT_OPERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirementOperator(RequirementOperatorType newRequirementOperator) {
		eSet(RequirementPackage.Literals.REQUIREMENT_GROUP__REQUIREMENT_OPERATOR, newRequirementOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkRecursiveness(final RequirementGroup rg1, final HardRequirement r, final boolean resources, final EList<RequirementGroup> context) {
		System.out.println("Checking recursiveness for RequirementGroup: " + rg1);
				for (Requirement r2: rg1.getRequirements()){
					EList<RequirementGroup> context2 = null;
					if (context == null) context2 = new org.eclipse.emf.common.util.BasicEList<RequirementGroup>();
					else context2 = new org.eclipse.emf.common.util.BasicEList<RequirementGroup>(context);
					if (!resources){
						if (r2 instanceof RequirementGroup){
							RequirementGroup rg2 = (RequirementGroup)r2;
							if (context == null || !context.contains(rg2)){
								context2.add(rg2);
								if (rg2.getName().equals(r.getName())) return Boolean.TRUE;
								if (checkRecursiveness(rg2,r,resources,context2)) return Boolean.TRUE;
							}
						}
					}
					else{
						if (r.getName().equals(r2.getName())) return true;
						if (r2 instanceof RequirementGroup){
							RequirementGroup rg2 = (RequirementGroup)r2;
							if (context == null || !context.contains(rg2)){
								context2.add(rg2);
								if (checkRecursiveness(rg2,r,resources,context2)) return Boolean.TRUE;
							}
						}
					}
				}
				return Boolean.FALSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RequirementPackage.REQUIREMENT_GROUP___CHECK_RECURSIVENESS__REQUIREMENTGROUP_HARDREQUIREMENT_BOOLEAN_ELIST:
				return checkRecursiveness((RequirementGroup)arguments.get(0), (HardRequirement)arguments.get(1), (Boolean)arguments.get(2), (EList<RequirementGroup>)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RequirementGroupImpl
