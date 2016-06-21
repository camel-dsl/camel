/**
 */
package eu.paasage.camel.scalability.impl;

import eu.paasage.camel.LayerType;

import eu.paasage.camel.metric.MetricInstance;

import eu.paasage.camel.scalability.EventInstance;
import eu.paasage.camel.scalability.ScalabilityPackage;
import eu.paasage.camel.scalability.SimpleEvent;
import eu.paasage.camel.scalability.StatusType;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.impl.EventInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.EventInstanceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.EventInstanceImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.EventInstanceImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.EventInstanceImpl#getMetricInstance <em>Metric Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventInstanceImpl extends CDOObjectImpl implements EventInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalabilityPackage.Literals.EVENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ScalabilityPackage.Literals.EVENT_INSTANCE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ScalabilityPackage.Literals.EVENT_INSTANCE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType getStatus() {
		return (StatusType)eGet(ScalabilityPackage.Literals.EVENT_INSTANCE__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusType newStatus) {
		eSet(ScalabilityPackage.Literals.EVENT_INSTANCE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerType getLayer() {
		return (LayerType)eGet(ScalabilityPackage.Literals.EVENT_INSTANCE__LAYER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayer(LayerType newLayer) {
		eSet(ScalabilityPackage.Literals.EVENT_INSTANCE__LAYER, newLayer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleEvent getEvent() {
		return (SimpleEvent)eGet(ScalabilityPackage.Literals.EVENT_INSTANCE__EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(SimpleEvent newEvent) {
		eSet(ScalabilityPackage.Literals.EVENT_INSTANCE__EVENT, newEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricInstance getMetricInstance() {
		return (MetricInstance)eGet(ScalabilityPackage.Literals.EVENT_INSTANCE__METRIC_INSTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetricInstance(MetricInstance newMetricInstance) {
		eSet(ScalabilityPackage.Literals.EVENT_INSTANCE__METRIC_INSTANCE, newMetricInstance);
	}

	/**
	 * The cached invocation delegate for the '{@link #equalLayer(eu.paasage.camel.LayerType, eu.paasage.camel.LayerType) <em>Equal Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #equalLayer(eu.paasage.camel.LayerType, eu.paasage.camel.LayerType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EQUAL_LAYER_LAYER_TYPE_LAYER_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ScalabilityPackage.Literals.EVENT_INSTANCE___EQUAL_LAYER__LAYERTYPE_LAYERTYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equalLayer(LayerType l1, LayerType l2) {
		try {
			return (Boolean)EQUAL_LAYER_LAYER_TYPE_LAYER_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{l1, l2}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ScalabilityPackage.EVENT_INSTANCE___EQUAL_LAYER__LAYERTYPE_LAYERTYPE:
				return equalLayer((LayerType)arguments.get(0), (LayerType)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EventInstanceImpl
