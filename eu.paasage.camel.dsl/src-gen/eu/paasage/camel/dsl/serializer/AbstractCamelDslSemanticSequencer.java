package eu.paasage.camel.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import eu.paasage.camel.Action;
import eu.paasage.camel.Application;
import eu.paasage.camel.CamelModel;
import eu.paasage.camel.CamelPackage;
import eu.paasage.camel.deployment.Communication;
import eu.paasage.camel.deployment.CommunicationInstance;
import eu.paasage.camel.deployment.Configuration;
import eu.paasage.camel.deployment.DeploymentModel;
import eu.paasage.camel.deployment.DeploymentPackage;
import eu.paasage.camel.deployment.Hosting;
import eu.paasage.camel.deployment.HostingInstance;
import eu.paasage.camel.deployment.InternalComponent;
import eu.paasage.camel.deployment.InternalComponentInstance;
import eu.paasage.camel.deployment.ProvidedCommunication;
import eu.paasage.camel.deployment.ProvidedCommunicationInstance;
import eu.paasage.camel.deployment.ProvidedHost;
import eu.paasage.camel.deployment.ProvidedHostInstance;
import eu.paasage.camel.deployment.RequiredCommunication;
import eu.paasage.camel.deployment.RequiredCommunicationInstance;
import eu.paasage.camel.deployment.RequiredHost;
import eu.paasage.camel.deployment.RequiredHostInstance;
import eu.paasage.camel.deployment.VM;
import eu.paasage.camel.deployment.VMInstance;
import eu.paasage.camel.deployment.VMRequirementSet;
import eu.paasage.camel.dsl.services.CamelDslGrammarAccess;
import eu.paasage.camel.execution.ActionRealisation;
import eu.paasage.camel.execution.ApplicationMeasurement;
import eu.paasage.camel.execution.CommunicationMeasurement;
import eu.paasage.camel.execution.ExecutionContext;
import eu.paasage.camel.execution.ExecutionModel;
import eu.paasage.camel.execution.ExecutionPackage;
import eu.paasage.camel.execution.InternalComponentMeasurement;
import eu.paasage.camel.execution.RuleTrigger;
import eu.paasage.camel.execution.SLOAssessment;
import eu.paasage.camel.execution.VMMeasurement;
import eu.paasage.camel.location.CloudLocation;
import eu.paasage.camel.location.Country;
import eu.paasage.camel.location.GeographicalRegion;
import eu.paasage.camel.location.LocationModel;
import eu.paasage.camel.location.LocationPackage;
import eu.paasage.camel.metric.CompositeMetric;
import eu.paasage.camel.metric.CompositeMetricContext;
import eu.paasage.camel.metric.CompositeMetricInstance;
import eu.paasage.camel.metric.MetricApplicationBinding;
import eu.paasage.camel.metric.MetricComponentBinding;
import eu.paasage.camel.metric.MetricCondition;
import eu.paasage.camel.metric.MetricFormula;
import eu.paasage.camel.metric.MetricFormulaParameter;
import eu.paasage.camel.metric.MetricModel;
import eu.paasage.camel.metric.MetricPackage;
import eu.paasage.camel.metric.MetricVMBinding;
import eu.paasage.camel.metric.Property;
import eu.paasage.camel.metric.PropertyCondition;
import eu.paasage.camel.metric.PropertyContext;
import eu.paasage.camel.metric.RawMetric;
import eu.paasage.camel.metric.RawMetricContext;
import eu.paasage.camel.metric.RawMetricInstance;
import eu.paasage.camel.metric.Schedule;
import eu.paasage.camel.metric.Sensor;
import eu.paasage.camel.metric.Window;
import eu.paasage.camel.organisation.CloudCredentials;
import eu.paasage.camel.organisation.CloudProvider;
import eu.paasage.camel.organisation.DataCenter;
import eu.paasage.camel.organisation.Entity;
import eu.paasage.camel.organisation.ExternalIdentifier;
import eu.paasage.camel.organisation.InformationResourceFilter;
import eu.paasage.camel.organisation.Organisation;
import eu.paasage.camel.organisation.OrganisationModel;
import eu.paasage.camel.organisation.OrganisationPackage;
import eu.paasage.camel.organisation.PaaSageCredentials;
import eu.paasage.camel.organisation.Permission;
import eu.paasage.camel.organisation.Role;
import eu.paasage.camel.organisation.RoleAssignment;
import eu.paasage.camel.organisation.ServiceResourceFilter;
import eu.paasage.camel.organisation.User;
import eu.paasage.camel.organisation.UserGroup;
import eu.paasage.camel.provider.Alternative;
import eu.paasage.camel.provider.Attribute;
import eu.paasage.camel.provider.AttributeConstraint;
import eu.paasage.camel.provider.Clone;
import eu.paasage.camel.provider.Excludes;
import eu.paasage.camel.provider.Exclusive;
import eu.paasage.camel.provider.FeatCardinality;
import eu.paasage.camel.provider.Feature;
import eu.paasage.camel.provider.Functional;
import eu.paasage.camel.provider.GroupCardinality;
import eu.paasage.camel.provider.Implies;
import eu.paasage.camel.provider.Instance;
import eu.paasage.camel.provider.Product;
import eu.paasage.camel.provider.ProviderModel;
import eu.paasage.camel.provider.ProviderPackage;
import eu.paasage.camel.provider.Requires;
import eu.paasage.camel.requirement.HorizontalScaleRequirement;
import eu.paasage.camel.requirement.ImageRequirement;
import eu.paasage.camel.requirement.LocationRequirement;
import eu.paasage.camel.requirement.OSRequirement;
import eu.paasage.camel.requirement.OptimisationRequirement;
import eu.paasage.camel.requirement.ProviderRequirement;
import eu.paasage.camel.requirement.QualitativeHardwareRequirement;
import eu.paasage.camel.requirement.QuantitativeHardwareRequirement;
import eu.paasage.camel.requirement.RequirementGroup;
import eu.paasage.camel.requirement.RequirementModel;
import eu.paasage.camel.requirement.RequirementPackage;
import eu.paasage.camel.requirement.SecurityRequirement;
import eu.paasage.camel.requirement.ServiceLevelObjective;
import eu.paasage.camel.requirement.VerticalScaleRequirement;
import eu.paasage.camel.scalability.BinaryEventPattern;
import eu.paasage.camel.scalability.EventInstance;
import eu.paasage.camel.scalability.FunctionalEvent;
import eu.paasage.camel.scalability.HorizontalScalingAction;
import eu.paasage.camel.scalability.NonFunctionalEvent;
import eu.paasage.camel.scalability.ScalabilityModel;
import eu.paasage.camel.scalability.ScalabilityPackage;
import eu.paasage.camel.scalability.ScalabilityRule;
import eu.paasage.camel.scalability.Timer;
import eu.paasage.camel.scalability.UnaryEventPattern;
import eu.paasage.camel.scalability.VerticalScalingAction;
import eu.paasage.camel.security.Certifiable;
import eu.paasage.camel.security.CompositeSecurityMetric;
import eu.paasage.camel.security.CompositeSecurityMetricInstance;
import eu.paasage.camel.security.RawSecurityMetric;
import eu.paasage.camel.security.RawSecurityMetricInstance;
import eu.paasage.camel.security.SecurityCapability;
import eu.paasage.camel.security.SecurityControl;
import eu.paasage.camel.security.SecurityDomain;
import eu.paasage.camel.security.SecurityModel;
import eu.paasage.camel.security.SecurityPackage;
import eu.paasage.camel.security.SecurityProperty;
import eu.paasage.camel.security.SecuritySLO;
import eu.paasage.camel.type.BoolValue;
import eu.paasage.camel.type.BooleanValueType;
import eu.paasage.camel.type.DoublePrecisionValue;
import eu.paasage.camel.type.EnumerateValue;
import eu.paasage.camel.type.Enumeration;
import eu.paasage.camel.type.FloatsValue;
import eu.paasage.camel.type.IntegerValue;
import eu.paasage.camel.type.Limit;
import eu.paasage.camel.type.List;
import eu.paasage.camel.type.NegativeInf;
import eu.paasage.camel.type.PositiveInf;
import eu.paasage.camel.type.Range;
import eu.paasage.camel.type.RangeUnion;
import eu.paasage.camel.type.StringValueType;
import eu.paasage.camel.type.StringsValue;
import eu.paasage.camel.type.TypeModel;
import eu.paasage.camel.type.TypePackage;
import eu.paasage.camel.type.ValueToIncrease;
import eu.paasage.camel.unit.CoreUnit;
import eu.paasage.camel.unit.Dimensionless;
import eu.paasage.camel.unit.MonetaryUnit;
import eu.paasage.camel.unit.RequestUnit;
import eu.paasage.camel.unit.StorageUnit;
import eu.paasage.camel.unit.ThroughputUnit;
import eu.paasage.camel.unit.TimeIntervalUnit;
import eu.paasage.camel.unit.TransactionUnit;
import eu.paasage.camel.unit.UnitModel;
import eu.paasage.camel.unit.UnitPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractCamelDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CamelDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CamelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CamelPackage.ACTION:
				if(context == grammarAccess.getActionRule()) {
					sequence_Action(context, (Action) semanticObject); 
					return; 
				}
				else break;
			case CamelPackage.APPLICATION:
				if(context == grammarAccess.getApplicationRule()) {
					sequence_Application(context, (Application) semanticObject); 
					return; 
				}
				else break;
			case CamelPackage.CAMEL_MODEL:
				if(context == grammarAccess.getCamelModelRule()) {
					sequence_CamelModel(context, (CamelModel) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == DeploymentPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DeploymentPackage.COMMUNICATION:
				if(context == grammarAccess.getCommunicationRule()) {
					sequence_Communication(context, (Communication) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.COMMUNICATION_INSTANCE:
				if(context == grammarAccess.getCommunicationInstanceRule()) {
					sequence_CommunicationInstance(context, (CommunicationInstance) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.CONFIGURATION:
				if(context == grammarAccess.getConfigurationRule()) {
					sequence_Configuration(context, (Configuration) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.DEPLOYMENT_MODEL:
				if(context == grammarAccess.getDeploymentModelRule()) {
					sequence_DeploymentModel(context, (DeploymentModel) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.HOSTING:
				if(context == grammarAccess.getHostingRule()) {
					sequence_Hosting(context, (Hosting) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.HOSTING_INSTANCE:
				if(context == grammarAccess.getHostingInstanceRule()) {
					sequence_HostingInstance(context, (HostingInstance) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.INTERNAL_COMPONENT:
				if(context == grammarAccess.getInternalComponentRule()) {
					sequence_InternalComponent(context, (InternalComponent) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.INTERNAL_COMPONENT_INSTANCE:
				if(context == grammarAccess.getInternalComponentInstanceRule()) {
					sequence_InternalComponentInstance(context, (InternalComponentInstance) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.PROVIDED_COMMUNICATION:
				if(context == grammarAccess.getProvidedCommunicationRule()) {
					sequence_ProvidedCommunication(context, (ProvidedCommunication) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.PROVIDED_COMMUNICATION_INSTANCE:
				if(context == grammarAccess.getProvidedCommunicationInstanceRule()) {
					sequence_ProvidedCommunicationInstance(context, (ProvidedCommunicationInstance) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.PROVIDED_HOST:
				if(context == grammarAccess.getProvidedHostRule()) {
					sequence_ProvidedHost(context, (ProvidedHost) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.PROVIDED_HOST_INSTANCE:
				if(context == grammarAccess.getProvidedHostInstanceRule()) {
					sequence_ProvidedHostInstance(context, (ProvidedHostInstance) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.REQUIRED_COMMUNICATION:
				if(context == grammarAccess.getRequiredCommunicationRule()) {
					sequence_RequiredCommunication(context, (RequiredCommunication) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.REQUIRED_COMMUNICATION_INSTANCE:
				if(context == grammarAccess.getRequiredCommunicationInstanceRule()) {
					sequence_RequiredCommunicationInstance(context, (RequiredCommunicationInstance) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.REQUIRED_HOST:
				if(context == grammarAccess.getRequiredHostRule()) {
					sequence_RequiredHost(context, (RequiredHost) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.REQUIRED_HOST_INSTANCE:
				if(context == grammarAccess.getRequiredHostInstanceRule()) {
					sequence_RequiredHostInstance(context, (RequiredHostInstance) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.VM:
				if(context == grammarAccess.getVMRule()) {
					sequence_VM(context, (VM) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.VM_INSTANCE:
				if(context == grammarAccess.getVMInstanceRule()) {
					sequence_VMInstance(context, (VMInstance) semanticObject); 
					return; 
				}
				else break;
			case DeploymentPackage.VM_REQUIREMENT_SET:
				if(context == grammarAccess.getVMRequirementSetRule()) {
					sequence_VMRequirementSet(context, (VMRequirementSet) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == ExecutionPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExecutionPackage.ACTION_REALISATION:
				if(context == grammarAccess.getActionRealisationRule()) {
					sequence_ActionRealisation(context, (ActionRealisation) semanticObject); 
					return; 
				}
				else break;
			case ExecutionPackage.APPLICATION_MEASUREMENT:
				if(context == grammarAccess.getApplicationMeasurementRule() ||
				   context == grammarAccess.getMeasurementRule()) {
					sequence_ApplicationMeasurement(context, (ApplicationMeasurement) semanticObject); 
					return; 
				}
				else break;
			case ExecutionPackage.COMMUNICATION_MEASUREMENT:
				if(context == grammarAccess.getCommunicationMeasurementRule() ||
				   context == grammarAccess.getMeasurementRule()) {
					sequence_CommunicationMeasurement(context, (CommunicationMeasurement) semanticObject); 
					return; 
				}
				else break;
			case ExecutionPackage.EXECUTION_CONTEXT:
				if(context == grammarAccess.getExecutionContextRule()) {
					sequence_ExecutionContext(context, (ExecutionContext) semanticObject); 
					return; 
				}
				else break;
			case ExecutionPackage.EXECUTION_MODEL:
				if(context == grammarAccess.getExecutionModelRule()) {
					sequence_ExecutionModel(context, (ExecutionModel) semanticObject); 
					return; 
				}
				else break;
			case ExecutionPackage.INTERNAL_COMPONENT_MEASUREMENT:
				if(context == grammarAccess.getInternalComponentMeasurementRule() ||
				   context == grammarAccess.getMeasurementRule()) {
					sequence_InternalComponentMeasurement(context, (InternalComponentMeasurement) semanticObject); 
					return; 
				}
				else break;
			case ExecutionPackage.RULE_TRIGGER:
				if(context == grammarAccess.getRuleTriggerRule()) {
					sequence_RuleTrigger(context, (RuleTrigger) semanticObject); 
					return; 
				}
				else break;
			case ExecutionPackage.SLO_ASSESSMENT:
				if(context == grammarAccess.getSLOAssessmentRule()) {
					sequence_SLOAssessment(context, (SLOAssessment) semanticObject); 
					return; 
				}
				else break;
			case ExecutionPackage.VM_MEASUREMENT:
				if(context == grammarAccess.getMeasurementRule() ||
				   context == grammarAccess.getVMMeasurementRule()) {
					sequence_VMMeasurement(context, (VMMeasurement) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == LocationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LocationPackage.CLOUD_LOCATION:
				if(context == grammarAccess.getCloudLocationRule()) {
					sequence_CloudLocation(context, (CloudLocation) semanticObject); 
					return; 
				}
				else break;
			case LocationPackage.COUNTRY:
				if(context == grammarAccess.getCountryRule()) {
					sequence_Country(context, (Country) semanticObject); 
					return; 
				}
				else break;
			case LocationPackage.GEOGRAPHICAL_REGION:
				if(context == grammarAccess.getGeographicalRegionRule()) {
					sequence_GeographicalRegion(context, (GeographicalRegion) semanticObject); 
					return; 
				}
				else break;
			case LocationPackage.LOCATION_MODEL:
				if(context == grammarAccess.getLocationModelRule()) {
					sequence_LocationModel(context, (LocationModel) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == MetricPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MetricPackage.COMPOSITE_METRIC:
				if(context == grammarAccess.getCompositeMetricRule() ||
				   context == grammarAccess.getMetricRule() ||
				   context == grammarAccess.getMetricFormulaParameterRule()) {
					sequence_CompositeMetric(context, (CompositeMetric) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.COMPOSITE_METRIC_CONTEXT:
				if(context == grammarAccess.getCompositeMetricContextRule() ||
				   context == grammarAccess.getConditionContextRule()) {
					sequence_CompositeMetricContext(context, (CompositeMetricContext) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.COMPOSITE_METRIC_INSTANCE:
				if(context == grammarAccess.getCompositeMetricInstanceRule() ||
				   context == grammarAccess.getMetricInstanceRule()) {
					sequence_CompositeMetricInstance(context, (CompositeMetricInstance) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.METRIC_APPLICATION_BINDING:
				if(context == grammarAccess.getMetricApplicationBindingRule() ||
				   context == grammarAccess.getMetricObjectBindingRule()) {
					sequence_MetricApplicationBinding(context, (MetricApplicationBinding) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.METRIC_COMPONENT_BINDING:
				if(context == grammarAccess.getMetricComponentBindingRule() ||
				   context == grammarAccess.getMetricObjectBindingRule()) {
					sequence_MetricComponentBinding(context, (MetricComponentBinding) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.METRIC_CONDITION:
				if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getMetricConditionRule()) {
					sequence_MetricCondition(context, (MetricCondition) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.METRIC_FORMULA:
				if(context == grammarAccess.getFormulaParameterRule() ||
				   context == grammarAccess.getMetricFormulaRule() ||
				   context == grammarAccess.getMetricFormulaParameterRule()) {
					sequence_MetricFormula(context, (MetricFormula) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.METRIC_FORMULA_PARAMETER:
				if(context == grammarAccess.getFormulaParameterRule() ||
				   context == grammarAccess.getMetricFormulaParameterRule() ||
				   context == grammarAccess.getMetricFormulaParameter_ImplRule()) {
					sequence_MetricFormulaParameter_Impl(context, (MetricFormulaParameter) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.METRIC_MODEL:
				if(context == grammarAccess.getMetricModelRule()) {
					sequence_MetricModel(context, (MetricModel) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.METRIC_VM_BINDING:
				if(context == grammarAccess.getMetricObjectBindingRule() ||
				   context == grammarAccess.getMetricVMBindingRule()) {
					sequence_MetricVMBinding(context, (MetricVMBinding) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.PROPERTY_CONDITION:
				if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getPropertyConditionRule()) {
					sequence_PropertyCondition(context, (PropertyCondition) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.PROPERTY_CONTEXT:
				if(context == grammarAccess.getConditionContextRule() ||
				   context == grammarAccess.getPropertyContextRule()) {
					sequence_PropertyContext(context, (PropertyContext) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.RAW_METRIC:
				if(context == grammarAccess.getMetricRule() ||
				   context == grammarAccess.getMetricFormulaParameterRule() ||
				   context == grammarAccess.getRawMetricRule()) {
					sequence_RawMetric(context, (RawMetric) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.RAW_METRIC_CONTEXT:
				if(context == grammarAccess.getConditionContextRule() ||
				   context == grammarAccess.getRawMetricContextRule()) {
					sequence_RawMetricContext(context, (RawMetricContext) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.RAW_METRIC_INSTANCE:
				if(context == grammarAccess.getMetricInstanceRule() ||
				   context == grammarAccess.getRawMetricInstanceRule()) {
					sequence_RawMetricInstance(context, (RawMetricInstance) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.SCHEDULE:
				if(context == grammarAccess.getScheduleRule()) {
					sequence_Schedule(context, (Schedule) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.SENSOR:
				if(context == grammarAccess.getSensorRule()) {
					sequence_Sensor(context, (Sensor) semanticObject); 
					return; 
				}
				else break;
			case MetricPackage.WINDOW:
				if(context == grammarAccess.getWindowRule()) {
					sequence_Window(context, (Window) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == OrganisationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case OrganisationPackage.CLOUD_CREDENTIALS:
				if(context == grammarAccess.getCloudCredentialsRule()) {
					sequence_CloudCredentials(context, (CloudCredentials) semanticObject); 
					return; 
				}
				else break;
			case OrganisationPackage.CLOUD_PROVIDER:
				if(context == grammarAccess.getCloudProviderRule() ||
				   context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getOrganisationRule()) {
					sequence_CloudProvider(context, (CloudProvider) semanticObject); 
					return; 
				}
				else break;
			case OrganisationPackage.DATA_CENTER:
				if(context == grammarAccess.getDataCenterRule()) {
					sequence_DataCenter(context, (DataCenter) semanticObject); 
					return; 
				}
				else break;
			case OrganisationPackage.ENTITY:
				if(context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getEntity_ImplRule()) {
					sequence_Entity_Impl(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case OrganisationPackage.EXTERNAL_IDENTIFIER:
				if(context == grammarAccess.getExternalIdentifierRule()) {
					sequence_ExternalIdentifier(context, (ExternalIdentifier) semanticObject); 
					return; 
				}
				else break;
			case OrganisationPackage.INFORMATION_RESOURCE_FILTER:
				if(context == grammarAccess.getInformationResourceFilterRule() ||
				   context == grammarAccess.getResourceFilterRule()) {
					sequence_InformationResourceFilter(context, (InformationResourceFilter) semanticObject); 
					return; 
				}
				else break;
			case OrganisationPackage.ORGANISATION:
				if(context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getOrganisationRule() ||
				   context == grammarAccess.getOrganisation_ImplRule()) {
					sequence_Organisation_Impl(context, (Organisation) semanticObject); 
					return; 
				}
				else break;
			case OrganisationPackage.ORGANISATION_MODEL:
				if(context == grammarAccess.getOrganisationModelRule()) {
					sequence_OrganisationModel(context, (OrganisationModel) semanticObject); 
					return; 
				}
				else break;
			case OrganisationPackage.PAA_SAGE_CREDENTIALS:
				if(context == grammarAccess.getPaaSageCredentialsRule()) {
					sequence_PaaSageCredentials(context, (PaaSageCredentials) semanticObject); 
					return; 
				}
				else break;
			case OrganisationPackage.PERMISSION:
				if(context == grammarAccess.getPermissionRule()) {
					sequence_Permission(context, (Permission) semanticObject); 
					return; 
				}
				else break;
			case OrganisationPackage.ROLE:
				if(context == grammarAccess.getRoleRule()) {
					sequence_Role(context, (Role) semanticObject); 
					return; 
				}
				else break;
			case OrganisationPackage.ROLE_ASSIGNMENT:
				if(context == grammarAccess.getRoleAssignmentRule()) {
					sequence_RoleAssignment(context, (RoleAssignment) semanticObject); 
					return; 
				}
				else break;
			case OrganisationPackage.SERVICE_RESOURCE_FILTER:
				if(context == grammarAccess.getResourceFilterRule() ||
				   context == grammarAccess.getServiceResourceFilterRule()) {
					sequence_ServiceResourceFilter(context, (ServiceResourceFilter) semanticObject); 
					return; 
				}
				else break;
			case OrganisationPackage.USER:
				if(context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getUserRule()) {
					sequence_User(context, (User) semanticObject); 
					return; 
				}
				else break;
			case OrganisationPackage.USER_GROUP:
				if(context == grammarAccess.getUserGroupRule()) {
					sequence_UserGroup(context, (UserGroup) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == ProviderPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ProviderPackage.ALTERNATIVE:
				if(context == grammarAccess.getAlternative_ImplRule() ||
				   context == grammarAccess.getFeatureRule()) {
					sequence_Alternative_Impl(context, (Alternative) semanticObject); 
					return; 
				}
				else break;
			case ProviderPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case ProviderPackage.ATTRIBUTE_CONSTRAINT:
				if(context == grammarAccess.getAttributeConstraintRule()) {
					sequence_AttributeConstraint(context, (AttributeConstraint) semanticObject); 
					return; 
				}
				else break;
			case ProviderPackage.CLONE:
				if(context == grammarAccess.getCloneRule()) {
					sequence_Clone(context, (Clone) semanticObject); 
					return; 
				}
				else break;
			case ProviderPackage.EXCLUDES:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getExcludesRule()) {
					sequence_Excludes(context, (Excludes) semanticObject); 
					return; 
				}
				else break;
			case ProviderPackage.EXCLUSIVE:
				if(context == grammarAccess.getExclusiveRule() ||
				   context == grammarAccess.getFeatureRule()) {
					sequence_Exclusive(context, (Exclusive) semanticObject); 
					return; 
				}
				else break;
			case ProviderPackage.FEAT_CARDINALITY:
				if(context == grammarAccess.getFeatCardinalityRule()) {
					sequence_FeatCardinality(context, (FeatCardinality) semanticObject); 
					return; 
				}
				else break;
			case ProviderPackage.FEATURE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getFeature_ImplRule()) {
					sequence_Feature_Impl(context, (Feature) semanticObject); 
					return; 
				}
				else break;
			case ProviderPackage.FUNCTIONAL:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getFunctionalRule()) {
					sequence_Functional(context, (Functional) semanticObject); 
					return; 
				}
				else break;
			case ProviderPackage.GROUP_CARDINALITY:
				if(context == grammarAccess.getGroupCardinalityRule()) {
					sequence_GroupCardinality(context, (GroupCardinality) semanticObject); 
					return; 
				}
				else break;
			case ProviderPackage.IMPLIES:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getImpliesRule()) {
					sequence_Implies(context, (Implies) semanticObject); 
					return; 
				}
				else break;
			case ProviderPackage.INSTANCE:
				if(context == grammarAccess.getInstanceRule() ||
				   context == grammarAccess.getScopeRule()) {
					sequence_Instance(context, (Instance) semanticObject); 
					return; 
				}
				else break;
			case ProviderPackage.PRODUCT:
				if(context == grammarAccess.getProductRule() ||
				   context == grammarAccess.getScopeRule()) {
					sequence_Product(context, (Product) semanticObject); 
					return; 
				}
				else break;
			case ProviderPackage.PROVIDER_MODEL:
				if(context == grammarAccess.getProviderModelRule()) {
					sequence_ProviderModel(context, (ProviderModel) semanticObject); 
					return; 
				}
				else break;
			case ProviderPackage.REQUIRES:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getRequires_ImplRule()) {
					sequence_Requires_Impl(context, (Requires) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == RequirementPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RequirementPackage.HORIZONTAL_SCALE_REQUIREMENT:
				if(context == grammarAccess.getHorizontalScaleRequirementRule() ||
				   context == grammarAccess.getRequirementRule() ||
				   context == grammarAccess.getScaleRequirementRule()) {
					sequence_HorizontalScaleRequirement(context, (HorizontalScaleRequirement) semanticObject); 
					return; 
				}
				else break;
			case RequirementPackage.IMAGE_REQUIREMENT:
				if(context == grammarAccess.getImageRequirementRule()) {
					sequence_ImageRequirement(context, (ImageRequirement) semanticObject); 
					return; 
				}
				else break;
			case RequirementPackage.LOCATION_REQUIREMENT:
				if(context == grammarAccess.getLocationRequirementRule() ||
				   context == grammarAccess.getRequirementRule()) {
					sequence_LocationRequirement(context, (LocationRequirement) semanticObject); 
					return; 
				}
				else break;
			case RequirementPackage.OS_REQUIREMENT:
				if(context == grammarAccess.getOSRequirementRule()) {
					sequence_OSRequirement(context, (OSRequirement) semanticObject); 
					return; 
				}
				else break;
			case RequirementPackage.OPTIMISATION_REQUIREMENT:
				if(context == grammarAccess.getOptimisationRequirementRule() ||
				   context == grammarAccess.getRequirementRule()) {
					sequence_OptimisationRequirement(context, (OptimisationRequirement) semanticObject); 
					return; 
				}
				else break;
			case RequirementPackage.PROVIDER_REQUIREMENT:
				if(context == grammarAccess.getProviderRequirementRule()) {
					sequence_ProviderRequirement(context, (ProviderRequirement) semanticObject); 
					return; 
				}
				else break;
			case RequirementPackage.QUALITATIVE_HARDWARE_REQUIREMENT:
				if(context == grammarAccess.getQualitativeHardwareRequirementRule()) {
					sequence_QualitativeHardwareRequirement(context, (QualitativeHardwareRequirement) semanticObject); 
					return; 
				}
				else break;
			case RequirementPackage.QUANTITATIVE_HARDWARE_REQUIREMENT:
				if(context == grammarAccess.getQuantitativeHardwareRequirementRule()) {
					sequence_QuantitativeHardwareRequirement(context, (QuantitativeHardwareRequirement) semanticObject); 
					return; 
				}
				else break;
			case RequirementPackage.REQUIREMENT_GROUP:
				if(context == grammarAccess.getRequirementRule() ||
				   context == grammarAccess.getRequirementGroupRule()) {
					sequence_RequirementGroup(context, (RequirementGroup) semanticObject); 
					return; 
				}
				else break;
			case RequirementPackage.REQUIREMENT_MODEL:
				if(context == grammarAccess.getRequirementModelRule()) {
					sequence_RequirementModel(context, (RequirementModel) semanticObject); 
					return; 
				}
				else break;
			case RequirementPackage.SECURITY_REQUIREMENT:
				if(context == grammarAccess.getRequirementRule() ||
				   context == grammarAccess.getSecurityRequirementRule()) {
					sequence_SecurityRequirement(context, (SecurityRequirement) semanticObject); 
					return; 
				}
				else break;
			case RequirementPackage.SERVICE_LEVEL_OBJECTIVE:
				if(context == grammarAccess.getRequirementRule() ||
				   context == grammarAccess.getServiceLevelObjectiveRule()) {
					sequence_ServiceLevelObjective(context, (ServiceLevelObjective) semanticObject); 
					return; 
				}
				else break;
			case RequirementPackage.VERTICAL_SCALE_REQUIREMENT:
				if(context == grammarAccess.getRequirementRule() ||
				   context == grammarAccess.getScaleRequirementRule() ||
				   context == grammarAccess.getVerticalScaleRequirementRule()) {
					sequence_VerticalScaleRequirement(context, (VerticalScaleRequirement) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == ScalabilityPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ScalabilityPackage.BINARY_EVENT_PATTERN:
				if(context == grammarAccess.getBinaryEventPatternRule() ||
				   context == grammarAccess.getEventRule() ||
				   context == grammarAccess.getEventPatternRule()) {
					sequence_BinaryEventPattern(context, (BinaryEventPattern) semanticObject); 
					return; 
				}
				else break;
			case ScalabilityPackage.EVENT_INSTANCE:
				if(context == grammarAccess.getEventInstanceRule()) {
					sequence_EventInstance(context, (EventInstance) semanticObject); 
					return; 
				}
				else break;
			case ScalabilityPackage.FUNCTIONAL_EVENT:
				if(context == grammarAccess.getEventRule() ||
				   context == grammarAccess.getFunctionalEventRule() ||
				   context == grammarAccess.getSimpleEventRule()) {
					sequence_FunctionalEvent(context, (FunctionalEvent) semanticObject); 
					return; 
				}
				else break;
			case ScalabilityPackage.HORIZONTAL_SCALING_ACTION:
				if(context == grammarAccess.getHorizontalScalingActionRule() ||
				   context == grammarAccess.getScalingActionRule()) {
					sequence_HorizontalScalingAction(context, (HorizontalScalingAction) semanticObject); 
					return; 
				}
				else break;
			case ScalabilityPackage.NON_FUNCTIONAL_EVENT:
				if(context == grammarAccess.getEventRule() ||
				   context == grammarAccess.getNonFunctionalEventRule() ||
				   context == grammarAccess.getSimpleEventRule()) {
					sequence_NonFunctionalEvent(context, (NonFunctionalEvent) semanticObject); 
					return; 
				}
				else break;
			case ScalabilityPackage.SCALABILITY_MODEL:
				if(context == grammarAccess.getScalabilityModelRule()) {
					sequence_ScalabilityModel(context, (ScalabilityModel) semanticObject); 
					return; 
				}
				else break;
			case ScalabilityPackage.SCALABILITY_RULE:
				if(context == grammarAccess.getScalabilityRuleRule()) {
					sequence_ScalabilityRule(context, (ScalabilityRule) semanticObject); 
					return; 
				}
				else break;
			case ScalabilityPackage.TIMER:
				if(context == grammarAccess.getTimerRule()) {
					sequence_Timer(context, (Timer) semanticObject); 
					return; 
				}
				else break;
			case ScalabilityPackage.UNARY_EVENT_PATTERN:
				if(context == grammarAccess.getEventRule() ||
				   context == grammarAccess.getEventPatternRule() ||
				   context == grammarAccess.getUnaryEventPatternRule()) {
					sequence_UnaryEventPattern(context, (UnaryEventPattern) semanticObject); 
					return; 
				}
				else break;
			case ScalabilityPackage.VERTICAL_SCALING_ACTION:
				if(context == grammarAccess.getScalingActionRule() ||
				   context == grammarAccess.getVerticalScalingActionRule()) {
					sequence_VerticalScalingAction(context, (VerticalScalingAction) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == SecurityPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SecurityPackage.CERTIFIABLE:
				if(context == grammarAccess.getCertifiableRule() ||
				   context == grammarAccess.getSecurityPropertyRule()) {
					sequence_Certifiable(context, (Certifiable) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.COMPOSITE_SECURITY_METRIC:
				if(context == grammarAccess.getCompositeSecurityMetricRule()) {
					sequence_CompositeSecurityMetric(context, (CompositeSecurityMetric) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.COMPOSITE_SECURITY_METRIC_INSTANCE:
				if(context == grammarAccess.getCompositeSecurityMetricInstanceRule()) {
					sequence_CompositeSecurityMetricInstance(context, (CompositeSecurityMetricInstance) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.RAW_SECURITY_METRIC:
				if(context == grammarAccess.getRawSecurityMetricRule()) {
					sequence_RawSecurityMetric(context, (RawSecurityMetric) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.RAW_SECURITY_METRIC_INSTANCE:
				if(context == grammarAccess.getRawSecurityMetricInstanceRule()) {
					sequence_RawSecurityMetricInstance(context, (RawSecurityMetricInstance) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.SECURITY_CAPABILITY:
				if(context == grammarAccess.getSecurityCapabilityRule()) {
					sequence_SecurityCapability(context, (SecurityCapability) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.SECURITY_CONTROL:
				if(context == grammarAccess.getSecurityControlRule()) {
					sequence_SecurityControl(context, (SecurityControl) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.SECURITY_DOMAIN:
				if(context == grammarAccess.getSecurityDomainRule()) {
					sequence_SecurityDomain(context, (SecurityDomain) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.SECURITY_MODEL:
				if(context == grammarAccess.getSecurityModelRule()) {
					sequence_SecurityModel(context, (SecurityModel) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.SECURITY_PROPERTY:
				if(context == grammarAccess.getSecurityPropertyRule() ||
				   context == grammarAccess.getSecurityProperty_ImplRule()) {
					sequence_SecurityProperty_Impl(context, (SecurityProperty) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.SECURITY_SLO:
				if(context == grammarAccess.getSecuritySLORule()) {
					sequence_SecuritySLO(context, (SecuritySLO) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TypePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypePackage.BOOL_VALUE:
				if(context == grammarAccess.getBoolValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_BoolValue(context, (BoolValue) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.BOOLEAN_VALUE_TYPE:
				if(context == grammarAccess.getBoolValueTypeRule() ||
				   context == grammarAccess.getValueTypeRule()) {
					sequence_BoolValueType(context, (BooleanValueType) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.DOUBLE_PRECISION_VALUE:
				if(context == grammarAccess.getDoublePrecisionValueRule() ||
				   context == grammarAccess.getNumericValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_DoublePrecisionValue(context, (DoublePrecisionValue) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.ENUMERATE_VALUE:
				if(context == grammarAccess.getEnumerateValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_EnumerateValue(context, (EnumerateValue) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.ENUMERATION:
				if(context == grammarAccess.getEnumerationRule() ||
				   context == grammarAccess.getValueTypeRule()) {
					sequence_Enumeration(context, (Enumeration) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.FLOATS_VALUE:
				if(context == grammarAccess.getFloatsValueRule() ||
				   context == grammarAccess.getNumericValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_FloatsValue(context, (FloatsValue) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.INTEGER_VALUE:
				if(context == grammarAccess.getIntegerValueRule() ||
				   context == grammarAccess.getNumericValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_IntegerValue(context, (IntegerValue) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.LIMIT:
				if(context == grammarAccess.getLimitRule()) {
					sequence_Limit(context, (Limit) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.LIST:
				if(context == grammarAccess.getListRule() ||
				   context == grammarAccess.getValueTypeRule()) {
					sequence_List(context, (List) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.NEGATIVE_INF:
				if(context == grammarAccess.getNegativeInfRule() ||
				   context == grammarAccess.getNumericValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_NegativeInf(context, (NegativeInf) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.POSITIVE_INF:
				if(context == grammarAccess.getNumericValueRule() ||
				   context == grammarAccess.getPositiveInfRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_PositiveInf(context, (PositiveInf) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.RANGE:
				if(context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getValueTypeRule()) {
					sequence_Range(context, (Range) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.RANGE_UNION:
				if(context == grammarAccess.getRangeUnionRule() ||
				   context == grammarAccess.getValueTypeRule()) {
					sequence_RangeUnion(context, (RangeUnion) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.STRING_VALUE_TYPE:
				if(context == grammarAccess.getStringsValueTypeRule() ||
				   context == grammarAccess.getValueTypeRule()) {
					sequence_StringsValueType(context, (StringValueType) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.STRINGS_VALUE:
				if(context == grammarAccess.getStringsValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_StringsValue(context, (StringsValue) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.TYPE_MODEL:
				if(context == grammarAccess.getTypeModelRule()) {
					sequence_TypeModel(context, (TypeModel) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.VALUE_TO_INCREASE:
				if(context == grammarAccess.getNumericValueRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getValueToIncreaseRule()) {
					sequence_ValueToIncrease(context, (ValueToIncrease) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == UnitPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UnitPackage.CORE_UNIT:
				if(context == grammarAccess.getCoreUnitRule() ||
				   context == grammarAccess.getUnitRule()) {
					sequence_CoreUnit(context, (CoreUnit) semanticObject); 
					return; 
				}
				else break;
			case UnitPackage.DIMENSIONLESS:
				if(context == grammarAccess.getDimensionlessRule() ||
				   context == grammarAccess.getUnitRule()) {
					sequence_Dimensionless(context, (Dimensionless) semanticObject); 
					return; 
				}
				else break;
			case UnitPackage.MONETARY_UNIT:
				if(context == grammarAccess.getMonetaryUnitRule() ||
				   context == grammarAccess.getUnitRule()) {
					sequence_MonetaryUnit(context, (MonetaryUnit) semanticObject); 
					return; 
				}
				else break;
			case UnitPackage.REQUEST_UNIT:
				if(context == grammarAccess.getRequestUnitRule() ||
				   context == grammarAccess.getUnitRule()) {
					sequence_RequestUnit(context, (RequestUnit) semanticObject); 
					return; 
				}
				else break;
			case UnitPackage.STORAGE_UNIT:
				if(context == grammarAccess.getStorageUnitRule() ||
				   context == grammarAccess.getUnitRule()) {
					sequence_StorageUnit(context, (StorageUnit) semanticObject); 
					return; 
				}
				else break;
			case UnitPackage.THROUGHPUT_UNIT:
				if(context == grammarAccess.getThroughputUnitRule() ||
				   context == grammarAccess.getUnitRule()) {
					sequence_ThroughputUnit(context, (ThroughputUnit) semanticObject); 
					return; 
				}
				else break;
			case UnitPackage.TIME_INTERVAL_UNIT:
				if(context == grammarAccess.getTimeIntervalUnitRule() ||
				   context == grammarAccess.getUnitRule()) {
					sequence_TimeIntervalUnit(context, (TimeIntervalUnit) semanticObject); 
					return; 
				}
				else break;
			case UnitPackage.TRANSACTION_UNIT:
				if(context == grammarAccess.getTransactionUnitRule() ||
				   context == grammarAccess.getUnitRule()) {
					sequence_TransactionUnit(context, (TransactionUnit) semanticObject); 
					return; 
				}
				else break;
			case UnitPackage.UNIT_MODEL:
				if(context == grammarAccess.getUnitModelRule()) {
					sequence_UnitModel(context, (UnitModel) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID action=[Action|Fqn] lowLevelActions=EString? startTime=EDate? endTime=EDate?)
	 */
	protected void sequence_ActionRealisation(EObject context, ActionRealisation semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=ActionType)
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, CamelPackage.Literals.ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CamelPackage.Literals.ACTION__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, CamelPackage.Literals.ACTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CamelPackage.Literals.ACTION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActionAccess().getTypeActionTypeEnumRuleCall_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (attributes+=Attribute attributes+=Attribute*)? 
	 *         (subFeatures+=Feature subFeatures+=Feature*)? 
	 *         featureCardinality=FeatCardinality 
	 *         (clones+=Clone clones+=Clone*)? 
	 *         groupCardinality=GroupCardinality? 
	 *         variants+=Feature 
	 *         variants+=Feature*
	 *     )
	 */
	protected void sequence_Alternative_Impl(EObject context, Alternative semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         application=[Application|Fqn] 
	 *         value=EDouble 
	 *         rawData=EString? 
	 *         eventInstance=[EventInstance|Fqn]? 
	 *         measurementTime=EDate 
	 *         executionContext=[ExecutionContext|Fqn] 
	 *         metricInstance=[MetricInstance|Fqn] 
	 *         slo=[ServiceLevelObjective|Fqn]?
	 *     )
	 */
	protected void sequence_ApplicationMeasurement(EObject context, ApplicationMeasurement semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         version=EString 
	 *         description=EString? 
	 *         owner=[Entity|Fqn] 
	 *         (deploymentModels+=[DeploymentModel|Fqn] deploymentModels+=[DeploymentModel|Fqn]*)?
	 *     )
	 */
	protected void sequence_Application(EObject context, Application semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (from=[Attribute|Fqn] to=[Attribute|Fqn] fromValue=Value toValue=Value)
	 */
	protected void sequence_AttributeConstraint(EObject context, AttributeConstraint semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID unitType=UnitType? value=Value? valueType=[ValueType|Fqn]?)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         leftEvent=[Event|Fqn]? 
	 *         rightEvent=[Event|Fqn]? 
	 *         timer=[Timer|Fqn]? 
	 *         operator=BinaryPatternOperatorType 
	 *         lowerOccurrenceBound=EInt? 
	 *         upperOccurrenceBound=EInt?
	 *     )
	 */
	protected void sequence_BinaryEventPattern(EObject context, BinaryEventPattern semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID primitiveType=TypeEnum)
	 */
	protected void sequence_BoolValueType(EObject context, BooleanValueType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, TypePackage.Literals.VALUE_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TypePackage.Literals.VALUE_TYPE__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, TypePackage.Literals.BOOLEAN_VALUE_TYPE__PRIMITIVE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TypePackage.Literals.BOOLEAN_VALUE_TYPE__PRIMITIVE_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getBoolValueTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBoolValueTypeAccess().getPrimitiveTypeTypeEnumEnumRuleCall_4_0(), semanticObject.getPrimitiveType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=EBoolean
	 */
	protected void sequence_BoolValue(EObject context, BoolValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, TypePackage.Literals.BOOL_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TypePackage.Literals.BOOL_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getBoolValueAccess().getValueEBooleanParserRuleCall_1_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         importURI+=EString* 
	 *         name=ID 
	 *         (
	 *             deploymentModels+=DeploymentModel | 
	 *             executionModels+=ExecutionModel | 
	 *             locationModels+=LocationModel | 
	 *             metricModels+=MetricModel | 
	 *             organisationModels+=OrganisationModel | 
	 *             providerModels+=ProviderModel | 
	 *             requirementModels+=RequirementModel | 
	 *             scalabilityModels+=ScalabilityModel | 
	 *             securityModels+=SecurityModel | 
	 *             typeModels+=TypeModel | 
	 *             unitModels+=UnitModel | 
	 *             actions+=Action | 
	 *             applications+=Application
	 *         )*
	 *     )
	 */
	protected void sequence_CamelModel(EObject context, CamelModel semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=EString? type=PropertyType (sensors+=[Sensor|Fqn] sensors+=[Sensor|Fqn]*)? domain=[SecurityDomain|Fqn])
	 */
	protected void sequence_Certifiable(EObject context, Certifiable semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (subClones+=[Clone|Fqn] subClones+=[Clone|Fqn]*)?)
	 */
	protected void sequence_Clone(EObject context, Clone semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         securityGroup=EString? 
	 *         publicSSHKey=EString? 
	 *         privateSSHKey=EString? 
	 *         username=EString? 
	 *         password=EString? 
	 *         cloudProvider=[CloudProvider|Fqn]
	 *     )
	 */
	protected void sequence_CloudCredentials(EObject context, CloudCredentials semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=ID 
	 *         isAssignable?='assignable'? 
	 *         parent=[CloudLocation|Fqn]? 
	 *         geographicalRegion=[GeographicalRegion|Fqn]? 
	 *         (subLocations+=CloudLocation subLocations+=CloudLocation*)?
	 *     )
	 */
	protected void sequence_CloudLocation(EObject context, CloudLocation semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         www=EString? 
	 *         postalAddress=EString? 
	 *         email=EString 
	 *         public?='public'? 
	 *         SaaS?='SaaS'? 
	 *         PaaS?='PaaS'? 
	 *         IaaS?='IaaS'? 
	 *         (securityCapability+=[SecurityCapability|Fqn] securityCapability+=[SecurityCapability|Fqn]*)? 
	 *         providerModel=[ProviderModel|Fqn]?
	 *     )
	 */
	protected void sequence_CloudProvider(EObject context, CloudProvider semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         requiredCommunicationInstance=[RequiredCommunicationInstance|Fqn] 
	 *         providedCommunicationInstance=[ProvidedCommunicationInstance|Fqn] 
	 *         type=[Communication|Fqn] 
	 *         name=ID?
	 *     )
	 */
	protected void sequence_CommunicationInstance(EObject context, CommunicationInstance semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         sourceVMInstance=[VMInstance|Fqn] 
	 *         destinationVMInstance=[VMInstance|Fqn] 
	 *         value=EDouble 
	 *         rawData=EString? 
	 *         eventInstance=[EventInstance|Fqn]? 
	 *         measurementTime=EDate 
	 *         executionContext=[ExecutionContext|Fqn] 
	 *         metricInstance=[MetricInstance|Fqn] 
	 *         slo=[ServiceLevelObjective|Fqn]?
	 *     )
	 */
	protected void sequence_CommunicationMeasurement(EObject context, CommunicationMeasurement semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         type=CommunicationType? 
	 *         requiredCommunication=[RequiredCommunication|Fqn] 
	 *         providedCommunication=[ProvidedCommunication|Fqn] 
	 *         providedPortConfiguration=Configuration? 
	 *         requiredPortConfiguration=Configuration?
	 *     )
	 */
	protected void sequence_Communication(EObject context, Communication semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         metric=[Metric|Fqn] 
	 *         component=[Component|Fqn]? 
	 *         application=[Application|Fqn]? 
	 *         window=[Window|Fqn]? 
	 *         schedule=[Schedule|Fqn]? 
	 *         (composingMetricContexts+=[MetricContext|Fqn] composingMetricContexts+=[MetricContext|Fqn]*)? 
	 *         quantifier=QuantifierType? 
	 *         isRelative?='relative'? 
	 *         (minQuantity=EDouble maxQuantity=EDouble)?
	 *     )
	 */
	protected void sequence_CompositeMetricContext(EObject context, CompositeMetricContext semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         metric=[Metric|Fqn] 
	 *         objectBinding=[MetricObjectBinding|Fqn] 
	 *         composingMetricInstances+=[MetricInstance|Fqn] 
	 *         composingMetricInstances+=[MetricInstance|Fqn]* 
	 *         schedule=[Schedule|Fqn]? 
	 *         window=[Window|Fqn]? 
	 *         metricContext=[MetricContext|Fqn]?
	 *     )
	 */
	protected void sequence_CompositeMetricInstance(EObject context, CompositeMetricInstance semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=EString? 
	 *         valueDirection=EShort? 
	 *         layer=LayerType? 
	 *         property=[Property|Fqn] 
	 *         unit=[Unit|Fqn] 
	 *         valueType=[ValueType|Fqn]? 
	 *         formula=MetricFormula
	 *     )
	 */
	protected void sequence_CompositeMetric(EObject context, CompositeMetric semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         metric=[Metric|Fqn] 
	 *         composingMetricInstances+=[MetricInstance|Fqn] 
	 *         composingMetricInstances+=[MetricInstance|Fqn]* 
	 *         objectBinding=[MetricObjectBinding|Fqn] 
	 *         schedule=[Schedule|Fqn]? 
	 *         window=[Window|Fqn]? 
	 *         metricContext=[MetricContext|Fqn]?
	 *     )
	 */
	protected void sequence_CompositeSecurityMetricInstance(EObject context, CompositeSecurityMetricInstance semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=EString? 
	 *         property=[SecurityProperty|Fqn] 
	 *         valueDirection=EShort? 
	 *         layer=LayerType? 
	 *         value=[SingleValue|Fqn]? 
	 *         valueType=[ValueType|Fqn]? 
	 *         unit=[Unit|Fqn] 
	 *         formula=MetricFormula
	 *     )
	 */
	protected void sequence_CompositeSecurityMetric(EObject context, CompositeSecurityMetric semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             downloadCommand=EString | 
	 *             uploadCommand=EString | 
	 *             installCommand=EString | 
	 *             configureCommand=EString | 
	 *             startCommand=EString | 
	 *             stopCommand=EString
	 *         )*
	 *     )
	 */
	protected void sequence_Configuration(EObject context, Configuration semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID unit=UnitType)
	 */
	protected void sequence_CoreUnit(EObject context, CoreUnit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, UnitPackage.Literals.UNIT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitPackage.Literals.UNIT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, UnitPackage.Literals.UNIT__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitPackage.Literals.UNIT__UNIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getCoreUnitAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCoreUnitAccess().getUnitUnitTypeEnumRuleCall_4_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=ID 
	 *         name=EString 
	 *         (alternativeNames+=EString alternativeNames+=EString*)? 
	 *         (parentRegions+=[GeographicalRegion|Fqn] parentRegions+=[GeographicalRegion|Fqn]*)?
	 *     )
	 */
	protected void sequence_Country(EObject context, Country semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID codeName=EString location=[Location|Fqn])
	 */
	protected void sequence_DataCenter(EObject context, DataCenter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, OrganisationPackage.Literals.DATA_CENTER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, OrganisationPackage.Literals.DATA_CENTER__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, OrganisationPackage.Literals.DATA_CENTER__CODE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, OrganisationPackage.Literals.DATA_CENTER__CODE_NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, OrganisationPackage.Literals.DATA_CENTER__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, OrganisationPackage.Literals.DATA_CENTER__LOCATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getDataCenterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDataCenterAccess().getCodeNameEStringParserRuleCall_4_0(), semanticObject.getCodeName());
		feeder.accept(grammarAccess.getDataCenterAccess().getLocationLocationFqnParserRuleCall_6_0_1(), semanticObject.getLocation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (vms+=VM | internalComponents+=InternalComponent | vmRequirementSets+=VMRequirementSet)* 
	 *         hostings+=Hosting* 
	 *         communications+=Communication* 
	 *         (vmInstances+=VMInstance | internalComponentInstances+=InternalComponentInstance)* 
	 *         communicationInstances+=CommunicationInstance* 
	 *         hostingInstances+=HostingInstance* 
	 *         globalVMRequirementSet=[VMRequirementSet|Fqn]?
	 *     )
	 */
	protected void sequence_DeploymentModel(EObject context, DeploymentModel semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID unit=UnitType)
	 */
	protected void sequence_Dimensionless(EObject context, Dimensionless semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, UnitPackage.Literals.UNIT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitPackage.Literals.UNIT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, UnitPackage.Literals.UNIT__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitPackage.Literals.UNIT__UNIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getDimensionlessAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDimensionlessAccess().getUnitUnitTypeEnumRuleCall_4_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=EDouble
	 */
	protected void sequence_DoublePrecisionValue(EObject context, DoublePrecisionValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, TypePackage.Literals.DOUBLE_PRECISION_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TypePackage.Literals.DOUBLE_PRECISION_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getDoublePrecisionValueAccess().getValueEDoubleParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {Entity}
	 */
	protected void sequence_Entity_Impl(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString value=EInt)
	 */
	protected void sequence_EnumerateValue(EObject context, EnumerateValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, TypePackage.Literals.ENUMERATE_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TypePackage.Literals.ENUMERATE_VALUE__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, TypePackage.Literals.ENUMERATE_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TypePackage.Literals.ENUMERATE_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumerateValueAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEnumerateValueAccess().getValueEIntParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID values+=EnumerateValue values+=EnumerateValue*)
	 */
	protected void sequence_Enumeration(EObject context, Enumeration semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID event=[SimpleEvent|Fqn] status=StatusType layer=LayerType? metricInstance=[MetricInstance|Fqn]?)
	 */
	protected void sequence_EventInstance(EObject context, EventInstance semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID from=[Feature|Fqn] to=[Feature|Fqn] (attributeConstraints+=AttributeConstraint attributeConstraints+=AttributeConstraint*)?)
	 */
	protected void sequence_Excludes(EObject context, Excludes semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (attributes+=Attribute attributes+=Attribute*)? 
	 *         (subFeatures+=Feature subFeatures+=Feature*)? 
	 *         featureCardinality=FeatCardinality 
	 *         (clones+=Clone clones+=Clone*)? 
	 *         groupCardinality=GroupCardinality? 
	 *         variants+=Feature 
	 *         variants+=Feature*
	 *     )
	 */
	protected void sequence_Exclusive(EObject context, Exclusive semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         startTime=EDate? 
	 *         endTime=EDate? 
	 *         totalCost=EDouble? 
	 *         application=[Application|Fqn] 
	 *         costUnit=[MonetaryUnit|Fqn]? 
	 *         deploymentModel=[DeploymentModel|Fqn] 
	 *         requirementGroup=[RequirementGroup|Fqn]
	 *     )
	 */
	protected void sequence_ExecutionContext(EObject context, ExecutionContext semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (importURI+=EString importURI+=EString*)? 
	 *         name=ID 
	 *         (
	 *             actionRealisations+=ActionRealisation | 
	 *             eventInstances+=EventInstance | 
	 *             executionContexts+=ExecutionContext | 
	 *             measurements+=Measurement | 
	 *             sloAssessessments+=SLOAssessment | 
	 *             ruleTriggers+=RuleTrigger
	 *         )*
	 *     )
	 */
	protected void sequence_ExecutionModel(EObject context, ExecutionModel semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (identifier=ID description=EString?)
	 */
	protected void sequence_ExternalIdentifier(EObject context, ExternalIdentifier semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cardinalityMin=EInt cardinalityMax=EInt value=EInt?)
	 */
	protected void sequence_FeatCardinality(EObject context, FeatCardinality semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (attributes+=Attribute attributes+=Attribute*)? 
	 *         (subFeatures+=Feature subFeatures+=Feature*)? 
	 *         featureCardinality=FeatCardinality 
	 *         (clones+=Clone clones+=Clone*)?
	 *     )
	 */
	protected void sequence_Feature_Impl(EObject context, Feature semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=EFloat
	 */
	protected void sequence_FloatsValue(EObject context, FloatsValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, TypePackage.Literals.FLOATS_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TypePackage.Literals.FLOATS_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getFloatsValueAccess().getValueEFloatParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID functionalType=EString)
	 */
	protected void sequence_FunctionalEvent(EObject context, FunctionalEvent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, ScalabilityPackage.Literals.EVENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, ScalabilityPackage.Literals.EVENT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, ScalabilityPackage.Literals.FUNCTIONAL_EVENT__FUNCTIONAL_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, ScalabilityPackage.Literals.FUNCTIONAL_EVENT__FUNCTIONAL_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionalEventAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFunctionalEventAccess().getFunctionalTypeEStringParserRuleCall_4_0(), semanticObject.getFunctionalType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         type=Operator? 
	 *         order=EInt? 
	 *         value=EInt 
	 *         from=[Feature|Fqn] 
	 *         to=[Feature|Fqn] 
	 *         (attributeConstraints+=AttributeConstraint attributeConstraints+=AttributeConstraint*)? 
	 *         scopeFrom=Scope? 
	 *         scopeTo=Scope? 
	 *         cardFrom=FeatCardinality? 
	 *         cardTo=FeatCardinality?
	 *     )
	 */
	protected void sequence_Functional(EObject context, Functional semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=ID 
	 *         name=EString 
	 *         (alternativeNames+=EString alternativeNames+=EString*)? 
	 *         (parentRegions+=[GeographicalRegion|Fqn] parentRegions+=[GeographicalRegion|Fqn]*)?
	 *     )
	 */
	protected void sequence_GeographicalRegion(EObject context, GeographicalRegion semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cardinalityMin=EInt cardinalityMax=EInt)
	 */
	protected void sequence_GroupCardinality(EObject context, GroupCardinality semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, ProviderPackage.Literals.CARDINALITY__CARDINALITY_MIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, ProviderPackage.Literals.CARDINALITY__CARDINALITY_MIN));
			if(transientValues.isValueTransient((EObject)semanticObject, ProviderPackage.Literals.CARDINALITY__CARDINALITY_MAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, ProviderPackage.Literals.CARDINALITY__CARDINALITY_MAX));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getGroupCardinalityAccess().getCardinalityMinEIntParserRuleCall_3_0(), semanticObject.getCardinalityMin());
		feeder.accept(grammarAccess.getGroupCardinalityAccess().getCardinalityMaxEIntParserRuleCall_5_0(), semanticObject.getCardinalityMax());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID component=[InternalComponent|Fqn] minInstances=EInt maxInstances=EInt)
	 */
	protected void sequence_HorizontalScaleRequirement(EObject context, HorizontalScaleRequirement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, RequirementPackage.Literals.REQUIREMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, RequirementPackage.Literals.REQUIREMENT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, RequirementPackage.Literals.HORIZONTAL_SCALE_REQUIREMENT__MIN_INSTANCES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, RequirementPackage.Literals.HORIZONTAL_SCALE_REQUIREMENT__MIN_INSTANCES));
			if(transientValues.isValueTransient((EObject)semanticObject, RequirementPackage.Literals.HORIZONTAL_SCALE_REQUIREMENT__MAX_INSTANCES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, RequirementPackage.Literals.HORIZONTAL_SCALE_REQUIREMENT__MAX_INSTANCES));
			if(transientValues.isValueTransient((EObject)semanticObject, RequirementPackage.Literals.HORIZONTAL_SCALE_REQUIREMENT__COMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, RequirementPackage.Literals.HORIZONTAL_SCALE_REQUIREMENT__COMPONENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getHorizontalScaleRequirementAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getHorizontalScaleRequirementAccess().getComponentInternalComponentFqnParserRuleCall_4_0_1(), semanticObject.getComponent());
		feeder.accept(grammarAccess.getHorizontalScaleRequirementAccess().getMinInstancesEIntParserRuleCall_6_0(), semanticObject.getMinInstances());
		feeder.accept(grammarAccess.getHorizontalScaleRequirementAccess().getMaxInstancesEIntParserRuleCall_8_0(), semanticObject.getMaxInstances());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=ActionType vm=[VM|Fqn] internalComponent=[InternalComponent|Fqn] count=EInt?)
	 */
	protected void sequence_HorizontalScalingAction(EObject context, HorizontalScalingAction semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (requiredHostInstance=[RequiredHostInstance|Fqn] providedHostInstance=[ProvidedHostInstance|Fqn] type=[Hosting|Fqn] name=ID?)
	 */
	protected void sequence_HostingInstance(EObject context, HostingInstance semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID requiredHost=[RequiredHost|Fqn] providedHost=[ProvidedHost|Fqn])
	 */
	protected void sequence_Hosting(EObject context, Hosting semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID imageId=EString)
	 */
	protected void sequence_ImageRequirement(EObject context, ImageRequirement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, RequirementPackage.Literals.REQUIREMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, RequirementPackage.Literals.REQUIREMENT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, RequirementPackage.Literals.IMAGE_REQUIREMENT__IMAGE_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, RequirementPackage.Literals.IMAGE_REQUIREMENT__IMAGE_ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getImageRequirementAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getImageRequirementAccess().getImageIdEStringParserRuleCall_4_0(), semanticObject.getImageId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID from=[Feature|Fqn] to=[Feature|Fqn] (attributeConstraints+=AttributeConstraint attributeConstraints+=AttributeConstraint*)?)
	 */
	protected void sequence_Implies(EObject context, Implies semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID resourcePattern=ResourcePattern informationResourcePath=EString? everyInformationResource?='all')
	 */
	protected void sequence_InformationResourceFilter(EObject context, InformationResourceFilter semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     feature=[Feature|Fqn]
	 */
	protected void sequence_Instance(EObject context, Instance semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, ProviderPackage.Literals.INSTANCE__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, ProviderPackage.Literals.INSTANCE__FEATURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getInstanceAccess().getFeatureFeatureFqnParserRuleCall_3_0_1(), semanticObject.getFeature());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=EInt
	 */
	protected void sequence_IntegerValue(EObject context, IntegerValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, TypePackage.Literals.INTEGER_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TypePackage.Literals.INTEGER_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         type=[InternalComponent|Fqn] 
	 *         (
	 *             providedCommunicationInstances+=ProvidedCommunicationInstance | 
	 *             requiredCommunicationInstances+=RequiredCommunicationInstance | 
	 *             providedHostInstances+=ProvidedHostInstance | 
	 *             requiredHostInstance=RequiredHostInstance
	 *         )*
	 *     )
	 */
	protected void sequence_InternalComponentInstance(EObject context, InternalComponentInstance semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         internalComponentInstance=[InternalComponentInstance|Fqn] 
	 *         value=EDouble 
	 *         rawData=EString? 
	 *         eventInstance=[EventInstance|Fqn]? 
	 *         measurementTime=EDate 
	 *         executionContext=[ExecutionContext|Fqn] 
	 *         metricInstance=[MetricInstance|Fqn] 
	 *         slo=[ServiceLevelObjective|Fqn]?
	 *     )
	 */
	protected void sequence_InternalComponentMeasurement(EObject context, InternalComponentMeasurement semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             providedCommunications+=ProvidedCommunication | 
	 *             requiredCommunications+=RequiredCommunication | 
	 *             providedHosts+=ProvidedHost | 
	 *             requiredHost=RequiredHost | 
	 *             configurations+=Configuration
	 *         )*
	 *     )
	 */
	protected void sequence_InternalComponent(EObject context, InternalComponent semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=NumericValue included?='included'?)
	 */
	protected void sequence_Limit(EObject context, Limit semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID primitiveType=TypeEnum? type=[ValueType|Fqn]? values+=Value values+=Value*)
	 */
	protected void sequence_List(EObject context, List semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (regions+=GeographicalRegion | countries+=Country | cloudLocations+=CloudLocation)*)
	 */
	protected void sequence_LocationModel(EObject context, LocationModel semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (locations+=[Location|Fqn] locations+=[Location|Fqn]*)?)
	 */
	protected void sequence_LocationRequirement(EObject context, LocationRequirement semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID executionContext=[ExecutionContext|Fqn])
	 */
	protected void sequence_MetricApplicationBinding(EObject context, MetricApplicationBinding semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, MetricPackage.Literals.METRIC_OBJECT_BINDING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, MetricPackage.Literals.METRIC_OBJECT_BINDING__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, MetricPackage.Literals.METRIC_OBJECT_BINDING__EXECUTION_CONTEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, MetricPackage.Literals.METRIC_OBJECT_BINDING__EXECUTION_CONTEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getMetricApplicationBindingAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMetricApplicationBindingAccess().getExecutionContextExecutionContextFqnParserRuleCall_4_0_1(), semanticObject.getExecutionContext());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID executionContext=[ExecutionContext|Fqn] componentInstance=[ComponentInstance|Fqn] vmInstance=[VMInstance|Fqn]?)
	 */
	protected void sequence_MetricComponentBinding(EObject context, MetricComponentBinding semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID metricContext=[MetricContext|Fqn] threshold=EDouble comparisonOperator=ComparisonOperatorType validity=EDate?)
	 */
	protected void sequence_MetricCondition(EObject context, MetricCondition semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=[SingleValue|Fqn])
	 */
	protected void sequence_MetricFormulaParameter_Impl(EObject context, MetricFormulaParameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, MetricPackage.Literals.METRIC_FORMULA_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, MetricPackage.Literals.METRIC_FORMULA_PARAMETER__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, MetricPackage.Literals.METRIC_FORMULA_PARAMETER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, MetricPackage.Literals.METRIC_FORMULA_PARAMETER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getMetricFormulaParameter_ImplAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMetricFormulaParameter_ImplAccess().getValueSingleValueFqnParserRuleCall_4_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         functionArity=MetricFunctionArityType 
	 *         functionPattern=FunctionPatternType? 
	 *         function=MetricFunctionType 
	 *         parameters+=[MetricFormulaParameter|Fqn] 
	 *         parameters+=[MetricFormulaParameter|Fqn]*
	 *     )
	 */
	protected void sequence_MetricFormula(EObject context, MetricFormula semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (importURI+=EString importURI+=EString*)? 
	 *         name=ID 
	 *         (
	 *             contexts+=ConditionContext | 
	 *             metrics+=Metric | 
	 *             metricInstances+=MetricInstance | 
	 *             conditions+=Condition | 
	 *             properties+=Property | 
	 *             bindings+=MetricObjectBinding | 
	 *             windows+=Window | 
	 *             schedules+=Schedule | 
	 *             parameters+=FormulaParameter | 
	 *             sensors+=Sensor
	 *         )*
	 *     )
	 */
	protected void sequence_MetricModel(EObject context, MetricModel semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID executionContext=[ExecutionContext|Fqn] vmInstance=[VMInstance|Fqn])
	 */
	protected void sequence_MetricVMBinding(EObject context, MetricVMBinding semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, MetricPackage.Literals.METRIC_OBJECT_BINDING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, MetricPackage.Literals.METRIC_OBJECT_BINDING__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, MetricPackage.Literals.METRIC_OBJECT_BINDING__EXECUTION_CONTEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, MetricPackage.Literals.METRIC_OBJECT_BINDING__EXECUTION_CONTEXT));
			if(transientValues.isValueTransient((EObject)semanticObject, MetricPackage.Literals.METRIC_VM_BINDING__VM_INSTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, MetricPackage.Literals.METRIC_VM_BINDING__VM_INSTANCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getMetricVMBindingAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMetricVMBindingAccess().getExecutionContextExecutionContextFqnParserRuleCall_4_0_1(), semanticObject.getExecutionContext());
		feeder.accept(grammarAccess.getMetricVMBindingAccess().getVmInstanceVMInstanceFqnParserRuleCall_6_0_1(), semanticObject.getVmInstance());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID unit=UnitType)
	 */
	protected void sequence_MonetaryUnit(EObject context, MonetaryUnit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, UnitPackage.Literals.UNIT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitPackage.Literals.UNIT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, UnitPackage.Literals.UNIT__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitPackage.Literals.UNIT__UNIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getMonetaryUnitAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMonetaryUnitAccess().getUnitUnitTypeEnumRuleCall_4_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {NegativeInf}
	 */
	protected void sequence_NegativeInf(EObject context, NegativeInf semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID metricCondition=[MetricCondition|Fqn] isViolation?='violation')
	 */
	protected void sequence_NonFunctionalEvent(EObject context, NonFunctionalEvent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, ScalabilityPackage.Literals.EVENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, ScalabilityPackage.Literals.EVENT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, ScalabilityPackage.Literals.NON_FUNCTIONAL_EVENT__METRIC_CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, ScalabilityPackage.Literals.NON_FUNCTIONAL_EVENT__METRIC_CONDITION));
			if(transientValues.isValueTransient((EObject)semanticObject, ScalabilityPackage.Literals.NON_FUNCTIONAL_EVENT__IS_VIOLATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, ScalabilityPackage.Literals.NON_FUNCTIONAL_EVENT__IS_VIOLATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getNonFunctionalEventAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNonFunctionalEventAccess().getMetricConditionMetricConditionFqnParserRuleCall_4_0_1(), semanticObject.getMetricCondition());
		feeder.accept(grammarAccess.getNonFunctionalEventAccess().getIsViolationViolationKeyword_5_0(), semanticObject.isIsViolation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID os=EString is64os?='64os'?)
	 */
	protected void sequence_OSRequirement(EObject context, OSRequirement semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         optimisationFunction=OptimisationFunctionType 
	 *         metric=[Metric|Fqn]? 
	 *         property=[Property|Fqn]? 
	 *         application=[Application|Fqn]? 
	 *         component=[Component|Fqn]? 
	 *         priority=EDouble?
	 *     )
	 */
	protected void sequence_OptimisationRequirement(EObject context, OptimisationRequirement semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         organisation=Organisation_Impl? 
	 *         provider=CloudProvider? 
	 *         (
	 *             externalIdentifiers+=ExternalIdentifier | 
	 *             users+=User | 
	 *             userGroups+=UserGroup | 
	 *             dataCentres+=DataCenter | 
	 *             roles+=Role | 
	 *             roleAssigments+=RoleAssignment | 
	 *             permissions+=Permission | 
	 *             resourceFilters+=ResourceFilter
	 *         )* 
	 *         securityLevel=SecurityLevel
	 *     )
	 */
	protected void sequence_OrganisationModel(EObject context, OrganisationModel semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID www=EString? postalAddress=EString? email=EString)
	 */
	protected void sequence_Organisation_Impl(EObject context, Organisation semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     password=EString
	 */
	protected void sequence_PaaSageCredentials(EObject context, PaaSageCredentials semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, OrganisationPackage.Literals.PAA_SAGE_CREDENTIALS__PASSWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, OrganisationPackage.Literals.PAA_SAGE_CREDENTIALS__PASSWORD));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getPaaSageCredentialsAccess().getPasswordEStringParserRuleCall_1_0(), semanticObject.getPassword());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         startTime=EDate 
	 *         endTime=EDate? 
	 *         role=[Role|Fqn] 
	 *         resourceFilter=[ResourceFilter|Fqn] 
	 *         action=ActionType
	 *     )
	 */
	protected void sequence_Permission(EObject context, Permission semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {PositiveInf}
	 */
	protected void sequence_PositiveInf(EObject context, PositiveInf semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Product}
	 */
	protected void sequence_Product(EObject context, Product semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         propertyContext=[PropertyContext|Fqn] 
	 *         threshold=EDouble 
	 *         comparisonOperator=ComparisonOperatorType 
	 *         unit=[MonetaryUnit|Fqn]? 
	 *         timeUnit=[TimeIntervalUnit|Fqn]? 
	 *         validity=EDate?
	 *     )
	 */
	protected void sequence_PropertyCondition(EObject context, PropertyCondition semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         property=[Property|Fqn] 
	 *         component=[Component|Fqn]? 
	 *         application=[Application|Fqn]? 
	 *         quantifier=QuantifierType? 
	 *         isRelative?='relative'? 
	 *         (minQuantity=EDouble maxQuantity=EDouble)?
	 *     )
	 */
	protected void sequence_PropertyContext(EObject context, PropertyContext semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=EString? 
	 *         type=PropertyType 
	 *         (subProperties+=[Property|Fqn] subProperties+=[Property|Fqn]*)? 
	 *         (sensors+=[Sensor|Fqn] sensors+=[Sensor|Fqn]*)?
	 *     )
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=[CommunicationPort|Fqn])
	 */
	protected void sequence_ProvidedCommunicationInstance(EObject context, ProvidedCommunicationInstance semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, DeploymentPackage.Literals.DEPLOYMENT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, DeploymentPackage.Literals.DEPLOYMENT_ELEMENT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, DeploymentPackage.Literals.COMMUNICATION_PORT_INSTANCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, DeploymentPackage.Literals.COMMUNICATION_PORT_INSTANCE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getProvidedCommunicationInstanceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProvidedCommunicationInstanceAccess().getTypeCommunicationPortFqnParserRuleCall_3_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID portNumber=INT*)
	 */
	protected void sequence_ProvidedCommunication(EObject context, ProvidedCommunication semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=[HostingPort|Fqn])
	 */
	protected void sequence_ProvidedHostInstance(EObject context, ProvidedHostInstance semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, DeploymentPackage.Literals.DEPLOYMENT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, DeploymentPackage.Literals.DEPLOYMENT_ELEMENT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, DeploymentPackage.Literals.HOSTING_PORT_INSTANCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, DeploymentPackage.Literals.HOSTING_PORT_INSTANCE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getProvidedHostInstanceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProvidedHostInstanceAccess().getTypeHostingPortFqnParserRuleCall_3_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ProvidedHost(EObject context, ProvidedHost semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, DeploymentPackage.Literals.DEPLOYMENT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, DeploymentPackage.Literals.DEPLOYMENT_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getProvidedHostAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (constraints+=Constraint constraints+=Constraint*)? rootFeature=Feature)
	 */
	protected void sequence_ProviderModel(EObject context, ProviderModel semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID providers+=[CloudProvider|Fqn] providers+=[CloudProvider|Fqn]*)
	 */
	protected void sequence_ProviderRequirement(EObject context, ProviderRequirement semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID minBenchmark=Double maxBenchmark=Double?)
	 */
	protected void sequence_QualitativeHardwareRequirement(EObject context, QualitativeHardwareRequirement semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (minCores=INT maxCores=INT?)? (minRAM=INT maxRAM=INT?)? (minStorage=INT maxStorage=INT?)? (minCPU=Double maxCPU=Double?)?)
	 */
	protected void sequence_QuantitativeHardwareRequirement(EObject context, QuantitativeHardwareRequirement semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID primitiveType=TypeEnum ranges+=Range ranges+=Range*)
	 */
	protected void sequence_RangeUnion(EObject context, RangeUnion semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID primitiveType=TypeEnum lowerLimit=Limit upperLimit=Limit)
	 */
	protected void sequence_Range(EObject context, Range semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, TypePackage.Literals.VALUE_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TypePackage.Literals.VALUE_TYPE__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, TypePackage.Literals.RANGE__LOWER_LIMIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TypePackage.Literals.RANGE__LOWER_LIMIT));
			if(transientValues.isValueTransient((EObject)semanticObject, TypePackage.Literals.RANGE__UPPER_LIMIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TypePackage.Literals.RANGE__UPPER_LIMIT));
			if(transientValues.isValueTransient((EObject)semanticObject, TypePackage.Literals.RANGE__PRIMITIVE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TypePackage.Literals.RANGE__PRIMITIVE_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getRangeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRangeAccess().getPrimitiveTypeTypeEnumEnumRuleCall_4_0(), semanticObject.getPrimitiveType());
		feeder.accept(grammarAccess.getRangeAccess().getLowerLimitLimitParserRuleCall_6_0(), semanticObject.getLowerLimit());
		feeder.accept(grammarAccess.getRangeAccess().getUpperLimitLimitParserRuleCall_8_0(), semanticObject.getUpperLimit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         metric=[Metric|Fqn] 
	 *         sensor=[Sensor|Fqn] 
	 *         component=[Component|Fqn]? 
	 *         application=[Application|Fqn]? 
	 *         window=[Window|Fqn]? 
	 *         schedule=[Schedule|Fqn]? 
	 *         quantifier=QuantifierType? 
	 *         isRelative?='relative'? 
	 *         (minQuantity=EDouble maxQuantity=EDouble)?
	 *     )
	 */
	protected void sequence_RawMetricContext(EObject context, RawMetricContext semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         metric=[Metric|Fqn] 
	 *         sensor=[Sensor|Fqn] 
	 *         objectBinding=[MetricObjectBinding|Fqn] 
	 *         schedule=[Schedule|Fqn]? 
	 *         window=[Window|Fqn]? 
	 *         metricContext=[MetricContext|Fqn]?
	 *     )
	 */
	protected void sequence_RawMetricInstance(EObject context, RawMetricInstance semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=EString? 
	 *         valueDirection=EShort? 
	 *         layer=LayerType? 
	 *         property=[Property|Fqn] 
	 *         unit=[Unit|Fqn] 
	 *         valueType=[ValueType|Fqn]?
	 *     )
	 */
	protected void sequence_RawMetric(EObject context, RawMetric semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         metric=[Metric|Fqn] 
	 *         sensor=[Sensor|Fqn] 
	 *         objectBinding=[MetricObjectBinding|Fqn] 
	 *         schedule=[Schedule|Fqn]? 
	 *         window=[Window|Fqn]? 
	 *         metricContext=[MetricContext|Fqn]?
	 *     )
	 */
	protected void sequence_RawSecurityMetricInstance(EObject context, RawSecurityMetricInstance semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=EString? 
	 *         property=[SecurityProperty|Fqn] 
	 *         valueDirection=EShort? 
	 *         layer=LayerType? 
	 *         value=[SingleValue|Fqn]? 
	 *         valueType=[ValueType|Fqn]? 
	 *         unit=[Unit|Fqn]
	 *     )
	 */
	protected void sequence_RawSecurityMetric(EObject context, RawSecurityMetric semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID unit=UnitType)
	 */
	protected void sequence_RequestUnit(EObject context, RequestUnit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, UnitPackage.Literals.UNIT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitPackage.Literals.UNIT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, UnitPackage.Literals.UNIT__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitPackage.Literals.UNIT__UNIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getRequestUnitAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRequestUnitAccess().getUnitUnitTypeEnumRuleCall_4_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=[CommunicationPort|Fqn])
	 */
	protected void sequence_RequiredCommunicationInstance(EObject context, RequiredCommunicationInstance semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, DeploymentPackage.Literals.DEPLOYMENT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, DeploymentPackage.Literals.DEPLOYMENT_ELEMENT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, DeploymentPackage.Literals.COMMUNICATION_PORT_INSTANCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, DeploymentPackage.Literals.COMMUNICATION_PORT_INSTANCE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getRequiredCommunicationInstanceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRequiredCommunicationInstanceAccess().getTypeCommunicationPortFqnParserRuleCall_3_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (portNumber=INT | isMandatory?='mandatory')*)
	 */
	protected void sequence_RequiredCommunication(EObject context, RequiredCommunication semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=[HostingPort|Fqn])
	 */
	protected void sequence_RequiredHostInstance(EObject context, RequiredHostInstance semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, DeploymentPackage.Literals.DEPLOYMENT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, DeploymentPackage.Literals.DEPLOYMENT_ELEMENT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, DeploymentPackage.Literals.HOSTING_PORT_INSTANCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, DeploymentPackage.Literals.HOSTING_PORT_INSTANCE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getRequiredHostInstanceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRequiredHostInstanceAccess().getTypeHostingPortFqnParserRuleCall_3_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_RequiredHost(EObject context, RequiredHost semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, DeploymentPackage.Literals.DEPLOYMENT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, DeploymentPackage.Literals.DEPLOYMENT_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getRequiredHostAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         requirementOperator=RequirementOperatorType 
	 *         requirements+=[Requirement|Fqn] 
	 *         requirements+=[Requirement|Fqn]* 
	 *         (application+=[Application|Fqn] application+=[Application|Fqn]*)?
	 *     )
	 */
	protected void sequence_RequirementGroup(EObject context, RequirementGroup semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             requirements+=LocationRequirement | 
	 *             requirements+=QuantitativeHardwareRequirement | 
	 *             requirements+=QualitativeHardwareRequirement | 
	 *             requirements+=ImageRequirement | 
	 *             requirements+=OSRequirement | 
	 *             requirements+=HorizontalScaleRequirement | 
	 *             requirements+=VerticalScaleRequirement | 
	 *             requirements+=SecurityRequirement | 
	 *             requirements+=ServiceLevelObjective | 
	 *             requirements+=OptimisationRequirement | 
	 *             requirements+=ProviderRequirement | 
	 *             requirements+=RequirementGroup
	 *         )*
	 *     )
	 */
	protected void sequence_RequirementModel(EObject context, RequirementModel semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         from=[Feature|Fqn] 
	 *         to=[Feature|Fqn] 
	 *         (attributeConstraints+=AttributeConstraint attributeConstraints+=AttributeConstraint*)? 
	 *         scopeFrom=Scope? 
	 *         scopeTo=Scope? 
	 *         cardFrom=FeatCardinality? 
	 *         cardTo=FeatCardinality?
	 *     )
	 */
	protected void sequence_Requires_Impl(EObject context, Requires semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         startTime=EDate? 
	 *         endTime=EDate? 
	 *         assignmentTime=EDate 
	 *         user=[User|Fqn]? 
	 *         role=[Role|Fqn] 
	 *         userGroup=[UserGroup|Fqn]?
	 *     )
	 */
	protected void sequence_RoleAssignment(EObject context, RoleAssignment semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Role(EObject context, Role semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, OrganisationPackage.Literals.ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, OrganisationPackage.Literals.ROLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         scalabilityRule=[ScalabilityRule|Fqn] 
	 *         trigerringTime=EDate 
	 *         actionRealisations+=[ActionRealisation|Fqn] 
	 *         actionRealisations+=[ActionRealisation|Fqn]* 
	 *         executionContext=[ExecutionContext|Fqn] 
	 *         eventInstances+=[EventInstance|Fqn] 
	 *         eventInstances+=[EventInstance|Fqn]*
	 *     )
	 */
	protected void sequence_RuleTrigger(EObject context, RuleTrigger semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         measurement=[Measurement|Fqn] 
	 *         executionContext=[ExecutionContext|Fqn] 
	 *         assessmentTime=EDate 
	 *         slo=[ServiceLevelObjective|Fqn] 
	 *         assessment?='violated'
	 *     )
	 */
	protected void sequence_SLOAssessment(EObject context, SLOAssessment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, ExecutionPackage.Literals.SLO_ASSESSMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, ExecutionPackage.Literals.SLO_ASSESSMENT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, ExecutionPackage.Literals.SLO_ASSESSMENT__SLO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, ExecutionPackage.Literals.SLO_ASSESSMENT__SLO));
			if(transientValues.isValueTransient((EObject)semanticObject, ExecutionPackage.Literals.SLO_ASSESSMENT__ASSESSMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, ExecutionPackage.Literals.SLO_ASSESSMENT__ASSESSMENT));
			if(transientValues.isValueTransient((EObject)semanticObject, ExecutionPackage.Literals.SLO_ASSESSMENT__EXECUTION_CONTEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, ExecutionPackage.Literals.SLO_ASSESSMENT__EXECUTION_CONTEXT));
			if(transientValues.isValueTransient((EObject)semanticObject, ExecutionPackage.Literals.SLO_ASSESSMENT__MEASUREMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, ExecutionPackage.Literals.SLO_ASSESSMENT__MEASUREMENT));
			if(transientValues.isValueTransient((EObject)semanticObject, ExecutionPackage.Literals.SLO_ASSESSMENT__ASSESSMENT_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, ExecutionPackage.Literals.SLO_ASSESSMENT__ASSESSMENT_TIME));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getSLOAssessmentAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSLOAssessmentAccess().getMeasurementMeasurementFqnParserRuleCall_4_0_1(), semanticObject.getMeasurement());
		feeder.accept(grammarAccess.getSLOAssessmentAccess().getExecutionContextExecutionContextFqnParserRuleCall_6_0_1(), semanticObject.getExecutionContext());
		feeder.accept(grammarAccess.getSLOAssessmentAccess().getAssessmentTimeEDateParserRuleCall_8_0(), semanticObject.getAssessmentTime());
		feeder.accept(grammarAccess.getSLOAssessmentAccess().getSloServiceLevelObjectiveFqnParserRuleCall_10_0_1(), semanticObject.getSlo());
		feeder.accept(grammarAccess.getSLOAssessmentAccess().getAssessmentViolatedKeyword_11_0(), semanticObject.isAssessment());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (importURI+=EString importURI+=EString*)? 
	 *         name=ID 
	 *         (
	 *             rules+=ScalabilityRule | 
	 *             events+=Event | 
	 *             eventInstances+=EventInstance | 
	 *             actions+=ScalingAction | 
	 *             timers+=Timer | 
	 *             scaleRequirements+=ScaleRequirement
	 *         )*
	 *     )
	 */
	protected void sequence_ScalabilityModel(EObject context, ScalabilityModel semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         event=[Event|Fqn] 
	 *         actions+=[Action|Fqn] 
	 *         actions+=[Action|Fqn]* 
	 *         (entity+=[Entity|Fqn] entity+=[Entity|Fqn]*)? 
	 *         (scaleRequirements+=[ScaleRequirement|Fqn] scaleRequirements+=[ScaleRequirement|Fqn]*)?
	 *     )
	 */
	protected void sequence_ScalabilityRule(EObject context, ScalabilityRule semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         type=ScheduleType 
	 *         interval=ELong 
	 *         unit=[TimeIntervalUnit|Fqn] 
	 *         start=EDate? 
	 *         end=EDate? 
	 *         repetitions=EInt?
	 *     )
	 */
	protected void sequence_Schedule(EObject context, Schedule semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID securityControls+=[SecurityControl|Fqn] securityControls+=[SecurityControl|Fqn]* dataCenter=[DataCenter|Fqn]?)
	 */
	protected void sequence_SecurityCapability(EObject context, SecurityCapability semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         specification=EString 
	 *         domain=[SecurityDomain|Fqn] 
	 *         subDomain=[SecurityDomain|Fqn] 
	 *         (securityProperties+=[SecurityProperty|Fqn] securityProperties+=[SecurityProperty|Fqn]*)? 
	 *         (rawSecurityMetrics+=[RawSecurityMetric|Fqn] rawSecurityMetrics+=[RawSecurityMetric|Fqn]*)? 
	 *         (compositeSecurityMetrics+=[CompositeSecurityMetric|Fqn] compositeSecurityMetrics+=[CompositeSecurityMetric|Fqn]*)?
	 *     )
	 */
	protected void sequence_SecurityControl(EObject context, SecurityControl semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID name=EString (subDomain+=[SecurityDomain|Fqn] subDomain+=[SecurityDomain|Fqn]*)?)
	 */
	protected void sequence_SecurityDomain(EObject context, SecurityDomain semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (importURI+=EString importURI+=EString*)? 
	 *         name=ID 
	 *         (
	 *             securityControls+=SecurityControl | 
	 *             securityProperties+=SecurityProperty | 
	 *             rawSecurityMetrics+=RawSecurityMetric | 
	 *             compositeSecurityMetrics+=CompositeSecurityMetric | 
	 *             rawSecurityMetricInstances+=RawSecurityMetricInstance | 
	 *             compositeSecurityMetricInstances+=CompositeSecurityMetricInstance | 
	 *             securityDomains+=SecurityDomain | 
	 *             securityCapabilities+=SecurityCapability | 
	 *             securitySLOs+=SecuritySLO
	 *         )*
	 *     )
	 */
	protected void sequence_SecurityModel(EObject context, SecurityModel semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=EString? 
	 *         type=PropertyType 
	 *         (subProperties+=[SecurityProperty|Fqn] subProperties+=[SecurityProperty|Fqn]*)? 
	 *         (sensors+=[Sensor|Fqn] sensors+=[Sensor|Fqn]*)? 
	 *         domain=[SecurityDomain|Fqn]
	 *     )
	 */
	protected void sequence_SecurityProperty_Impl(EObject context, SecurityProperty semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         securityControls+=[SecurityControl|Fqn] 
	 *         securityControls+=[SecurityControl|Fqn]* 
	 *         application=[Application|Fqn]? 
	 *         component=[InternalComponent|Fqn]?
	 *     )
	 */
	protected void sequence_SecurityRequirement(EObject context, SecurityRequirement semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID customServiceLevel=[Condition|Fqn])
	 */
	protected void sequence_SecuritySLO(EObject context, SecuritySLO semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, RequirementPackage.Literals.REQUIREMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, RequirementPackage.Literals.REQUIREMENT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, RequirementPackage.Literals.SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, RequirementPackage.Literals.SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getSecuritySLOAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSecuritySLOAccess().getCustomServiceLevelConditionFqnParserRuleCall_4_0_1(), semanticObject.getCustomServiceLevel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID configuration=EString? isPush?='push'?)
	 */
	protected void sequence_Sensor(EObject context, Sensor semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID customServiceLevel=[Condition|Fqn])
	 */
	protected void sequence_ServiceLevelObjective(EObject context, ServiceLevelObjective semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, RequirementPackage.Literals.REQUIREMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, RequirementPackage.Literals.REQUIREMENT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, RequirementPackage.Literals.SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, RequirementPackage.Literals.SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getServiceLevelObjectiveAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getServiceLevelObjectiveAccess().getCustomServiceLevelConditionFqnParserRuleCall_4_0_1(), semanticObject.getCustomServiceLevel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID resourcePattern=ResourcePattern serviceURL=EString? everyService?='all')
	 */
	protected void sequence_ServiceResourceFilter(EObject context, ServiceResourceFilter semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID unit=UnitType)
	 */
	protected void sequence_StorageUnit(EObject context, StorageUnit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, UnitPackage.Literals.UNIT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitPackage.Literals.UNIT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, UnitPackage.Literals.UNIT__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitPackage.Literals.UNIT__UNIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getStorageUnitAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStorageUnitAccess().getUnitUnitTypeEnumRuleCall_4_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID primitiveType=TypeEnum)
	 */
	protected void sequence_StringsValueType(EObject context, StringValueType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, TypePackage.Literals.VALUE_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TypePackage.Literals.VALUE_TYPE__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, TypePackage.Literals.STRING_VALUE_TYPE__PRIMITIVE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TypePackage.Literals.STRING_VALUE_TYPE__PRIMITIVE_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getStringsValueTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStringsValueTypeAccess().getPrimitiveTypeTypeEnumEnumRuleCall_4_0(), semanticObject.getPrimitiveType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=EString
	 */
	protected void sequence_StringsValue(EObject context, StringsValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, TypePackage.Literals.STRINGS_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TypePackage.Literals.STRINGS_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getStringsValueAccess().getValueEStringParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID unit=UnitType)
	 */
	protected void sequence_ThroughputUnit(EObject context, ThroughputUnit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, UnitPackage.Literals.UNIT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitPackage.Literals.UNIT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, UnitPackage.Literals.UNIT__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitPackage.Literals.UNIT__UNIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getThroughputUnitAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getThroughputUnitAccess().getUnitUnitTypeEnumRuleCall_4_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID unit=UnitType)
	 */
	protected void sequence_TimeIntervalUnit(EObject context, TimeIntervalUnit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, UnitPackage.Literals.UNIT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitPackage.Literals.UNIT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, UnitPackage.Literals.UNIT__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitPackage.Literals.UNIT__UNIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getTimeIntervalUnitAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTimeIntervalUnitAccess().getUnitUnitTypeEnumRuleCall_4_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=TimerType timeValue=EInt unit=[TimeIntervalUnit|Fqn] maxOccurrenceNum=EInt?)
	 */
	protected void sequence_Timer(EObject context, Timer semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID unit=UnitType)
	 */
	protected void sequence_TransactionUnit(EObject context, TransactionUnit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, UnitPackage.Literals.UNIT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitPackage.Literals.UNIT__NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, UnitPackage.Literals.UNIT__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitPackage.Literals.UNIT__UNIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getTransactionUnitAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTransactionUnitAccess().getUnitUnitTypeEnumRuleCall_4_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((importURI+=EString importURI+=EString*)? name=ID (dataTypes+=ValueType | values+=Value)*)
	 */
	protected void sequence_TypeModel(EObject context, TypeModel semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID event=[Event|Fqn] operator=UnaryPatternOperatorType timer=[Timer|Fqn]? occurrenceNum=EInt?)
	 */
	protected void sequence_UnaryEventPattern(EObject context, UnaryEventPattern semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID units+=Unit*)
	 */
	protected void sequence_UnitModel(EObject context, UnitModel semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID users+=[User|Fqn] users+=[User|Fqn]*)
	 */
	protected void sequence_UserGroup(EObject context, UserGroup semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         firstName=EString 
	 *         lastName=EString 
	 *         email=EString 
	 *         www=EString? 
	 *         paasageCredentials=PaaSageCredentials 
	 *         (cloudCredentials+=CloudCredentials cloudCredentials+=CloudCredentials*)? 
	 *         (externalIdentifiers+=ExternalIdentifier externalIdentifiers+=ExternalIdentifier*)? 
	 *         (requirementModels+=[RequirementModel|Fqn] requirementModels+=[RequirementModel|Fqn]*)? 
	 *         (deploymentModels+=[DeploymentModel|Fqn] deploymentModels+=[DeploymentModel|Fqn]*)?
	 *     )
	 */
	protected void sequence_User(EObject context, User semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         type=[VM|Fqn] 
	 *         ip=EString? 
	 *         vmType=[Attribute|Fqn]? 
	 *         vmTypeValue=[SingleValue|Fqn]? 
	 *         providedHostInstances+=ProvidedHostInstance*
	 *     )
	 */
	protected void sequence_VMInstance(EObject context, VMInstance semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         vmInstance=[VMInstance|Fqn] 
	 *         value=EDouble 
	 *         rawData=EString? 
	 *         eventInstance=[EventInstance|Fqn]? 
	 *         measurementTime=EDate 
	 *         executionContext=[ExecutionContext|Fqn] 
	 *         metricInstance=[MetricInstance|Fqn] 
	 *         slo=[ServiceLevelObjective|Fqn]?
	 *     )
	 */
	protected void sequence_VMMeasurement(EObject context, VMMeasurement semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             locationRequirement=[LocationRequirement|Fqn] | 
	 *             qualitativeHardwareRequirement=[QualitativeHardwareRequirement|Fqn] | 
	 *             quantitativeHardwareRequirement=[QuantitativeHardwareRequirement|Fqn] | 
	 *             osOrImageRequirement=[OSRequirement|Fqn] | 
	 *             (osOrImageRequirement=[ImageRequirement|Fqn] providerRequirement=[ProviderRequirement|Fqn])
	 *         )*
	 *     )
	 */
	protected void sequence_VMRequirementSet(EObject context, VMRequirementSet semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID vmRequirementSet=[VMRequirementSet|ID]? (providedHosts+=ProvidedHost | configurations+=Configuration)*)
	 */
	protected void sequence_VM(EObject context, VM semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=NumericValue
	 */
	protected void sequence_ValueToIncrease(EObject context, ValueToIncrease semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, TypePackage.Literals.VALUE_TO_INCREASE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TypePackage.Literals.VALUE_TO_INCREASE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getValueToIncreaseAccess().getValueNumericValueParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         vm=[VM|Fqn] 
	 *         (minCores=INT maxCores=INT?)? 
	 *         (minRAM=INT maxRAM=INT?)? 
	 *         (minStorage=INT maxStorage=INT?)? 
	 *         (minCPU=Double maxCPU=Double?)?
	 *     )
	 */
	protected void sequence_VerticalScaleRequirement(EObject context, VerticalScaleRequirement semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         type=ActionType 
	 *         vm=[VM|Fqn] 
	 *         coreUpdate=EInt? 
	 *         CPUUpdate=EDouble? 
	 *         memoryUpdate=EInt? 
	 *         storageUpdate=EInt? 
	 *         ioUpdate=EInt? 
	 *         networkUpdate=EInt?
	 *     )
	 */
	protected void sequence_VerticalScalingAction(EObject context, VerticalScalingAction semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         windowType=WindowType 
	 *         sizeType=WindowSizeType 
	 *         measurementSize=ELong? 
	 *         timeSize=ELong? 
	 *         unit=[TimeIntervalUnit|Fqn]?
	 *     )
	 */
	protected void sequence_Window(EObject context, Window semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
}