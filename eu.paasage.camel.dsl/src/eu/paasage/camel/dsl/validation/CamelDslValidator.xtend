/*
 * generated by Xtext
 */
package eu.paasage.camel.dsl.validation

import eu.paasage.camel.CamelModel
import eu.paasage.camel.deployment.DeploymentElement
import eu.paasage.camel.provider.Attribute
import eu.paasage.camel.provider.AttributeConstraint
import eu.paasage.camel.provider.Constraint
import eu.paasage.camel.provider.Feature
import eu.paasage.camel.provider.ProviderModel
import eu.paasage.camel.provider.ProviderPackage
import org.eclipse.ocl.ecore.delegate.OCLDelegateDomain
import org.eclipse.xtext.validation.Check
import eu.paasage.camel.CamelPackage

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class CamelDslValidator extends AbstractCamelDslValidator {

	public static int counter = 0

	@Check
	def checkCamelModelBeforeFurtherValidation(CamelModel cm) {
		OCLDelegateDomain.initialize(cm.eResource.resourceSet);
		val objit = cm.eResource.allContents
		while (objit.hasNext()) {
			val elem = objit.next();
			if (elem instanceof DeploymentElement) {
				if (elem.name == null) {
					elem.name = elem.eClass.name + counter
					counter = counter + 1
				}
			}
		}
	}

	public static val INVALID_NAME = 'invalidName'

	public static val INVALID_FEATURE = 'invalidFeature'

	public static val INVALID_CARDINALITY = 'invalidCardinality'

	public static val INVALID_VALUE = 'invalidValue'

	public static val INVALID_ATTRIBUTE = 'invalidAttribute'

	public static val INVALID_ATTRIBUTE_VALUE = 'invalidAttributeValue'

	@Check
	def checkProviderModelName(ProviderModel model) {
		if (model.name == null) {
			error('You have to specify the name of the provider model', CamelPackage.Literals.MODEL__NAME,
				INVALID_NAME);
			return
		}
	}

	@Check
	def checkRootFeature(ProviderModel model) {
		if (model.name != null && model.rootFeature == null) {
			error('You have to define the root feature of the provider model',
				ProviderPackage.Literals.PROVIDER_MODEL__ROOT_FEATURE, INVALID_FEATURE);
			return
		}
	}

	@Check
	def checkFeatureName(Feature feature) {
		if (feature.name == null) {
			error('You have to specify the name of the feature', ProviderPackage.Literals.FEATURE__NAME, INVALID_NAME);
			return
		}
	}

	@Check
	def checkFeatureCardinality(Feature feature) {
		if (feature.name != null && feature.featureCardinality == null) {
			error('You have to specify the cardinality of the feature ' + feature.name,
				ProviderPackage.Literals.FEATURE__FEATURE_CARDINALITY, INVALID_CARDINALITY);
			return
		}
	}

	@Check
	def checkFeatureCardinalityMinMax(Feature feature) {
		if (feature.name != null && feature.featureCardinality != null) {
			if (feature.featureCardinality.cardinalityMin > feature.featureCardinality.cardinalityMax) {
				error('cardinalityMin should be lower or equals to cardinalityMax in feature ' + feature.name,
					ProviderPackage.Literals.FEATURE__FEATURE_CARDINALITY, INVALID_CARDINALITY);
				return
			}
		}
	}

	@Check
	def checkAttributeName(Attribute attribute) {
		if (attribute.name == null) {
			error('You have to specify the name of the attribute', ProviderPackage.Literals.ATTRIBUTE__NAME,
				INVALID_NAME);
			return
		}
	}

	@Check
	def checkAttributeValue(Attribute attribute) {
		if (attribute.name != null && (attribute.value == null && attribute.valueType == null)) {
			error('You have to specify the value or the value type of the ' + attribute.name + ' attribute ',
				ProviderPackage.Literals.ATTRIBUTE__VALUE, INVALID_VALUE);
			return
		}
	}

	@Check
	def checkConstraint(Constraint constraint) {
		if (constraint.name == null) {
			error('You have to specify the name of the constraint ', ProviderPackage.Literals.CONSTRAINT__NAME,
				INVALID_NAME);
			return
		} else if (constraint.from == null) {
			error('You have to specify the from feature of the ' + constraint.name + ' constraint ',
				ProviderPackage.Literals.CONSTRAINT__FROM, INVALID_FEATURE);
			return
		} else if (constraint.to == null) {
			error('You have to specify the to feature of the ' + constraint.name + ' constraint ',
				ProviderPackage.Literals.CONSTRAINT__TO, INVALID_FEATURE);
			return
		}
	}

	@Check
	def checkAttributeConstraint(AttributeConstraint ac) {
		if (ac.from == null) {
			error('You have to specify the from attribute of the attribute constraint ',
				ProviderPackage.Literals.ATTRIBUTE_CONSTRAINT__FROM, INVALID_ATTRIBUTE);
			return
		} else if (ac.to == null) {
			error('You have to specify the to attribute of the attribute constraint ',
				ProviderPackage.Literals.ATTRIBUTE_CONSTRAINT__TO, INVALID_ATTRIBUTE);
			return
		} else if (ac.fromValue == null) {
			error('You have to specify the from attribute value of the attribute constraint ',
				ProviderPackage.Literals.ATTRIBUTE_CONSTRAINT__FROM_VALUE, INVALID_ATTRIBUTE_VALUE);
			return
		} else if (ac.toValue == null) {
			error('You have to specify the to attribute value of the attribute constraint ',
				ProviderPackage.Literals.ATTRIBUTE_CONSTRAINT__TO_VALUE, INVALID_ATTRIBUTE_VALUE);
			return
		}
	}

}
