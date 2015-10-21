package eu.paasage.camel.dsl.scoping

import eu.paasage.camel.deployment.CommunicationPortInstance
import eu.paasage.camel.deployment.ComponentInstance
import eu.paasage.camel.deployment.DeploymentModel
import eu.paasage.camel.deployment.HostingPortInstance
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import eu.paasage.camel.requirement.Requirement
import eu.paasage.camel.requirement.RequirementModel
import eu.paasage.camel.deployment.CommunicationPort
import eu.paasage.camel.deployment.Component
import eu.paasage.camel.deployment.HostingPort
import eu.paasage.camel.organisation.User
import eu.paasage.camel.organisation.OrganisationModel
import eu.paasage.camel.metric.Sensor
import eu.paasage.camel.metric.MetricModel
import eu.paasage.camel.execution.ExecutionContext
import eu.paasage.camel.execution.ExecutionModel
import eu.paasage.camel.metric.MetricInstance
import eu.paasage.camel.metric.Property
import eu.paasage.camel.execution.Measurement
import eu.paasage.camel.security.SecurityControl
import eu.paasage.camel.security.SecurityModel
import eu.paasage.camel.location.LocationModel
import eu.paasage.camel.location.CloudLocation
import eu.paasage.camel.location.GeographicalRegion
import eu.paasage.camel.security.SecurityDomain
import eu.paasage.camel.metric.Metric
import eu.paasage.camel.organisation.Role
import eu.paasage.camel.unit.Unit
import eu.paasage.camel.unit.UnitModel
import eu.paasage.camel.type.ValueType
import eu.paasage.camel.type.TypeModel
import eu.paasage.camel.metric.MetricContext

class CamelQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	def qualifiedName(CommunicationPort port){
		val comp = port.eContainer as Component
		return QualifiedName.create(comp.name, port.name)
	}
	
	def qualifiedName(HostingPort port){
		val comp = port.eContainer as Component
		return QualifiedName.create(comp.name, port.name)
	}
	
	def qualifiedName(CommunicationPortInstance port){
		val ci = port.eContainer as ComponentInstance
		return QualifiedName.create(ci.name, port.name)
	}
	
	def qualifiedName(HostingPortInstance port){
		val ci = port.eContainer as ComponentInstance
		return QualifiedName.create(ci.name, port.name)
	}
	
	def qualifiedName(Requirement req){
		val rm = req.eContainer as RequirementModel
		return QualifiedName.create(rm.name, req.name)
	}
	
	def qualifiedName(User u){
		val org = u.eContainer as OrganisationModel
		return QualifiedName.create(org.name,u.name)
	}
	
	def qualifiedName(Sensor s){
		val mm = s.eContainer as MetricModel
		return QualifiedName.create(mm.name,s.name)
	}
	
	def qualifiedName(ExecutionContext ec){
		val mm = ec.eContainer as ExecutionModel
		return QualifiedName.create(mm.name,ec.name)
	}
	
	def qualifiedName(Measurement m){
		val mm = m.eContainer as ExecutionModel
		return QualifiedName.create(mm.name,m.name)
	}
	
	def qualifiedName(SecurityControl sc){
		val sm = sc.eContainer as SecurityModel
		return QualifiedName.create(sm.name,sc.name)
	}
	
	def qualifiedName(SecurityDomain sd){
		val sm = sd.eContainer as SecurityModel
		return QualifiedName.create(sm.name,sd.id)
	}
	
	def qualifiedName(CloudLocation cl){
		val lm = cl.eContainer
		if (lm instanceof CloudLocation){
			return QualifiedName.create(lm.id,cl.id);	
		}
		else{
			val lm2 = lm as LocationModel
			return QualifiedName.create(lm2.name,cl.id);	
		}
	}
	
	def qualifiedName(GeographicalRegion l){
		val lm = l.eContainer as LocationModel
		return QualifiedName.create(lm.name,l.id)
	}
}