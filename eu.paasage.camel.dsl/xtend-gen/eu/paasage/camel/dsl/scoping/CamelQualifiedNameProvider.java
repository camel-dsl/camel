package eu.paasage.camel.dsl.scoping;

import eu.paasage.camel.deployment.CommunicationPort;
import eu.paasage.camel.deployment.CommunicationPortInstance;
import eu.paasage.camel.deployment.Component;
import eu.paasage.camel.deployment.ComponentInstance;
import eu.paasage.camel.deployment.HostingPort;
import eu.paasage.camel.deployment.HostingPortInstance;
import eu.paasage.camel.execution.ExecutionContext;
import eu.paasage.camel.execution.ExecutionModel;
import eu.paasage.camel.execution.Measurement;
import eu.paasage.camel.location.CloudLocation;
import eu.paasage.camel.location.GeographicalRegion;
import eu.paasage.camel.location.LocationModel;
import eu.paasage.camel.metric.MetricModel;
import eu.paasage.camel.metric.Sensor;
import eu.paasage.camel.organisation.OrganisationModel;
import eu.paasage.camel.organisation.User;
import eu.paasage.camel.requirement.Requirement;
import eu.paasage.camel.requirement.RequirementModel;
import eu.paasage.camel.security.SecurityControl;
import eu.paasage.camel.security.SecurityDomain;
import eu.paasage.camel.security.SecurityModel;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public class CamelQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  public QualifiedName qualifiedName(final CommunicationPort port) {
    EObject _eContainer = port.eContainer();
    final Component comp = ((Component) _eContainer);
    String _name = comp.getName();
    String _name_1 = port.getName();
    return QualifiedName.create(_name, _name_1);
  }
  
  public QualifiedName qualifiedName(final HostingPort port) {
    EObject _eContainer = port.eContainer();
    final Component comp = ((Component) _eContainer);
    String _name = comp.getName();
    String _name_1 = port.getName();
    return QualifiedName.create(_name, _name_1);
  }
  
  public QualifiedName qualifiedName(final CommunicationPortInstance port) {
    EObject _eContainer = port.eContainer();
    final ComponentInstance ci = ((ComponentInstance) _eContainer);
    String _name = ci.getName();
    String _name_1 = port.getName();
    return QualifiedName.create(_name, _name_1);
  }
  
  public QualifiedName qualifiedName(final HostingPortInstance port) {
    EObject _eContainer = port.eContainer();
    final ComponentInstance ci = ((ComponentInstance) _eContainer);
    String _name = ci.getName();
    String _name_1 = port.getName();
    return QualifiedName.create(_name, _name_1);
  }
  
  public QualifiedName qualifiedName(final Requirement req) {
    EObject _eContainer = req.eContainer();
    final RequirementModel rm = ((RequirementModel) _eContainer);
    String _name = rm.getName();
    String _name_1 = req.getName();
    return QualifiedName.create(_name, _name_1);
  }
  
  public QualifiedName qualifiedName(final User u) {
    EObject _eContainer = u.eContainer();
    final OrganisationModel org = ((OrganisationModel) _eContainer);
    String _name = org.getName();
    String _name_1 = u.getName();
    return QualifiedName.create(_name, _name_1);
  }
  
  public QualifiedName qualifiedName(final Sensor s) {
    EObject _eContainer = s.eContainer();
    final MetricModel mm = ((MetricModel) _eContainer);
    String _name = mm.getName();
    String _name_1 = s.getName();
    return QualifiedName.create(_name, _name_1);
  }
  
  public QualifiedName qualifiedName(final ExecutionContext ec) {
    EObject _eContainer = ec.eContainer();
    final ExecutionModel mm = ((ExecutionModel) _eContainer);
    String _name = mm.getName();
    String _name_1 = ec.getName();
    return QualifiedName.create(_name, _name_1);
  }
  
  public QualifiedName qualifiedName(final Measurement m) {
    EObject _eContainer = m.eContainer();
    final ExecutionModel mm = ((ExecutionModel) _eContainer);
    String _name = mm.getName();
    String _name_1 = m.getName();
    return QualifiedName.create(_name, _name_1);
  }
  
  public QualifiedName qualifiedName(final SecurityControl sc) {
    EObject _eContainer = sc.eContainer();
    final SecurityModel sm = ((SecurityModel) _eContainer);
    String _name = sm.getName();
    String _name_1 = sc.getName();
    return QualifiedName.create(_name, _name_1);
  }
  
  public QualifiedName qualifiedName(final SecurityDomain sd) {
    EObject _eContainer = sd.eContainer();
    final SecurityModel sm = ((SecurityModel) _eContainer);
    String _name = sm.getName();
    String _id = sd.getId();
    return QualifiedName.create(_name, _id);
  }
  
  public QualifiedName qualifiedName(final CloudLocation cl) {
    final EObject lm = cl.eContainer();
    if ((lm instanceof CloudLocation)) {
      String _id = ((CloudLocation)lm).getId();
      String _id_1 = cl.getId();
      return QualifiedName.create(_id, _id_1);
    } else {
      final LocationModel lm2 = ((LocationModel) lm);
      String _name = lm2.getName();
      String _id_2 = cl.getId();
      return QualifiedName.create(_name, _id_2);
    }
  }
  
  public QualifiedName qualifiedName(final GeographicalRegion l) {
    EObject _eContainer = l.eContainer();
    final LocationModel lm = ((LocationModel) _eContainer);
    String _name = lm.getName();
    String _id = l.getId();
    return QualifiedName.create(_name, _id);
  }
}
