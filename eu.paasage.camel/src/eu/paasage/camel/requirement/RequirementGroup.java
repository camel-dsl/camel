/**
 */
package eu.paasage.camel.requirement;

import eu.paasage.camel.Application;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.RequirementGroup#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.RequirementGroup#getApplication <em>Application</em>}</li>
 *   <li>{@link eu.paasage.camel.requirement.RequirementGroup#getRequirementOperator <em>Requirement Operator</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.requirement.RequirementPackage#getRequirementGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='applications_in_sub_groups_in_group requirement_group_no_conflict_reqs requirements_in_group_refer_to_group_applications'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot applications_in_sub_groups_in_group='Tuple {\n\tmessage : String = \'RequirementGroup: \' + self.name +\n\t\t\t\t\t\' has one or more sub-groups that map to applications which are not included in the group\\\'s list of applications\',\n\tstatus : Boolean = self.requirements\n\t\t\t\t\t->forAll(p | p.oclIsTypeOf(RequirementGroup) implies p.oclAsType(RequirementGroup).application\n\t\t\t\t\t\t->forAll(a | self.application\n\t\t\t\t\t\t\t->includes(a)))\n}.status' requirement_group_no_conflict_reqs='Tuple {\n\tmessage : String = \'RequirementGroup: \' + self.name +\n\t\t\t\t\t\' has two or more scale requirements of the same type that are conflicting, i.e., refer to the same VM (in case of vertical requirements) or component (in case of horizontal requirements)\',\n\tstatus : Boolean = if\n\t\t\t\t\t\t(self.requirementOperator = RequirementOperatorType::AND)\n\t\t\t\t\tthen self.requirements\n\t\t\t\t\t\t->forAll(p1, p2 | (p1 <> p2 and p1.oclIsKindOf(camel::requirement::ScaleRequirement) and\n\t\t\t\t\t\t\tp2.oclIsKindOf(camel::requirement::ScaleRequirement) and p1.oclType() = p2.oclType()) implies if\n\t\t\t\t\t\t\t\t(p1.oclIsTypeOf(camel::requirement::VerticalScaleRequirement))\n\t\t\t\t\t\t\tthen p1.oclAsType(camel::requirement::VerticalScaleRequirement).vm <>\n\t\t\t\t\t\t\t\tp2.oclAsType(camel::requirement::VerticalScaleRequirement).vm\n\t\t\t\t\t\t\telse p1.oclAsType(camel::requirement::HorizontalScaleRequirement).component <>\n\t\t\t\t\t\t\t\tp2.oclAsType(camel::requirement::HorizontalScaleRequirement).component\n\t\t\t\t\t\t\tendif)\n\t\t\t\t\telse true\n\t\t\t\t\tendif\n}.status' requirements_in_group_refer_to_group_applications='Tuple {\n\tmessage : String = \'RequirementGroup: \' + self.name +\n\t\t\t\t\t\' has one or more requirements that map to an application which is not included in the group\\\'s list of applications\',\n\tstatus : Boolean = if\n\t\t\t\t\t\t(application\n\t\t\t\t\t\t->notEmpty())\n\t\t\t\t\tthen requirements\n\t\t\t\t\t\t->forAll(p | if (p.oclIsTypeOf(camel::requirement::ServiceLevelObjective))\n\t\t\t\t\t\t\tthen if\n\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclIsTypeOf(camel::metric::MetricCondition))\n\t\t\t\t\t\t\t\tthen application\n\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.application)\n\t\t\t\t\t\t\t\telse if\n\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclIsTypeOf(camel::metric::MetricCondition))\n\t\t\t\t\t\t\t\t\tthen if\n\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.application\n\t\t\t\t\t\t\t\t\t\t\t<> null)\n\t\t\t\t\t\t\t\t\t\tthen application\n\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.application)\n\t\t\t\t\t\t\t\t\t\telse if\n\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.component\n\t\t\t\t\t\t\t\t\t\t\t\t<> null)\n\t\t\t\t\t\t\t\t\t\t\tthen if\n\t\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.component.oclIsTypeOf(camel::deployment::InternalComponent))\n\t\t\t\t\t\t\t\t\t\t\t\tthen application\n\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.internalComponents\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.component.oclAsType(camel::deployment::InternalComponent)))))\n\t\t\t\t\t\t\t\t\t\t\t\telse application\n\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.vms\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.component.oclAsType(camel::deployment::VM)))))\n\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\telse if\n\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclIsTypeOf(camel::metric::PropertyCondition))\n\t\t\t\t\t\t\t\t\t\tthen if\n\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.application\n\t\t\t\t\t\t\t\t\t\t\t\t<> null)\n\t\t\t\t\t\t\t\t\t\t\tthen application\n\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.application)\n\t\t\t\t\t\t\t\t\t\t\telse if\n\t\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.component\n\t\t\t\t\t\t\t\t\t\t\t\t\t<> null)\n\t\t\t\t\t\t\t\t\t\t\t\tthen if\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.component.oclIsTypeOf(camel::deployment::InternalComponent))\n\t\t\t\t\t\t\t\t\t\t\t\t\tthen application\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.internalComponents\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.component.oclAsType(camel::deployment::InternalComponent)))))\n\t\t\t\t\t\t\t\t\t\t\t\t\telse application\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.vms\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::ServiceLevelObjective).customServiceLevel.oclAsType(camel::metric::PropertyCondition).propertyContext.component.oclAsType(camel::deployment::VM)))))\n\t\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (p.oclIsTypeOf(camel::requirement::OptimisationRequirement))\n\t\t\t\t\t\t\t\tthen if (p.oclAsType(camel::requirement::OptimisationRequirement).metric <> null or\n\t\t\t\t\t\t\t\t\t\tp.oclAsType(camel::requirement::OptimisationRequirement).property <> null)\n\t\t\t\t\t\t\t\t\tthen if (p.oclAsType(camel::requirement::OptimisationRequirement).application <> null)\n\t\t\t\t\t\t\t\t\t\tthen application\n\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::OptimisationRequirement).application)\n\t\t\t\t\t\t\t\t\t\telse if (p.oclAsType(camel::requirement::OptimisationRequirement).component <> null)\n\t\t\t\t\t\t\t\t\t\t\tthen if\n\t\t\t\t\t\t\t\t\t\t\t\t\t(p.oclAsType(camel::requirement::OptimisationRequirement).component.oclIsTypeOf(camel::deployment::InternalComponent))\n\t\t\t\t\t\t\t\t\t\t\t\tthen application\n\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.internalComponents\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::OptimisationRequirement).component.oclAsType(camel::deployment::InternalComponent)))))\n\t\t\t\t\t\t\t\t\t\t\t\telse application\n\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(q | q.deploymentModels\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t->exists(r | (r.vms\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::OptimisationRequirement).component.oclAsType(camel::deployment::VM)))))\n\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse if (p.oclIsTypeOf(camel::requirement::SecurityRequirement))\n\t\t\t\t\t\t\t\t\tthen if (p.oclAsType(camel::requirement::SecurityRequirement).application <> null)\n\t\t\t\t\t\t\t\t\t\tthen application\n\t\t\t\t\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::SecurityRequirement).application)\n\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif)\n\t\t\t\t\telse true\n\t\t\t\t\tendif\n}.status'"
 * @generated
 */
public interface RequirementGroup extends Requirement {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.requirement.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' reference list.
	 * @see eu.paasage.camel.requirement.RequirementPackage#getRequirementGroup_Requirements()
	 * @model required="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.Application}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference list.
	 * @see eu.paasage.camel.requirement.RequirementPackage#getRequirementGroup_Application()
	 * @model
	 * @generated
	 */
	EList<Application> getApplication();

	/**
	 * Returns the value of the '<em><b>Requirement Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.requirement.RequirementOperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Operator</em>' attribute.
	 * @see eu.paasage.camel.requirement.RequirementOperatorType
	 * @see #setRequirementOperator(RequirementOperatorType)
	 * @see eu.paasage.camel.requirement.RequirementPackage#getRequirementGroup_RequirementOperator()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='Requires'"
	 * @generated
	 */
	RequirementOperatorType getRequirementOperator();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.requirement.RequirementGroup#getRequirementOperator <em>Requirement Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Operator</em>' attribute.
	 * @see eu.paasage.camel.requirement.RequirementOperatorType
	 * @see #getRequirementOperator()
	 * @generated
	 */
	void setRequirementOperator(RequirementOperatorType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='System.out.println(\"Checking recursiveness for RequirementGroup: \" + rg1);\r\n\t\tfor (Requirement r2: rg1.getRequirements()){\r\n\t\t\tEList<RequirementGroup> context2 = null;\r\n\t\t\tif (context == null) context2 = new org.eclipse.emf.common.util.BasicEList<RequirementGroup>();\r\n\t\t\telse context2 = new org.eclipse.emf.common.util.BasicEList<RequirementGroup>(context);\r\n\t\t\tif (!resources){\r\n\t\t\t\tif (r2 instanceof RequirementGroup){\r\n\t\t\t\t\tRequirementGroup rg2 = (RequirementGroup)r2;\r\n\t\t\t\t\tif (context == null || !context.contains(rg2)){\r\n\t\t\t\t\t\tcontext2.add(rg2);\r\n\t\t\t\t\t\tif (rg2.getName().equals(r.getName())) return Boolean.TRUE;\r\n\t\t\t\t\t\tif (checkRecursiveness(rg2,r,resources,context2)) return Boolean.TRUE;\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\telse{\r\n\t\t\t\tif (r.getName().equals(r2.getName())) return true;\r\n\t\t\t\tif (r2 instanceof RequirementGroup){\r\n\t\t\t\t\tRequirementGroup rg2 = (RequirementGroup)r2;\r\n\t\t\t\t\tif (context == null || !context.contains(rg2)){\r\n\t\t\t\t\t\tcontext2.add(rg2);\r\n\t\t\t\t\t\tif (checkRecursiveness(rg2,r,resources,context2)) return Boolean.TRUE;\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t}\r\n\t\treturn Boolean.FALSE;'"
	 * @generated
	 */
	boolean checkRecursiveness(RequirementGroup rg1, HardRequirement r, boolean resources, EList<RequirementGroup> context);

} // RequirementGroup
