/**
 */
package eu.paasage.camel.scalability.impl;

import eu.paasage.camel.scalability.EventPattern;
import eu.paasage.camel.scalability.ScalabilityPackage;
import eu.paasage.camel.scalability.SimpleEvent;
import eu.paasage.camel.scalability.Timer;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.impl.EventPatternImpl#getTimer <em>Timer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EventPatternImpl extends EventImpl implements EventPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalabilityPackage.Literals.EVENT_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timer getTimer() {
		return (Timer)eGet(ScalabilityPackage.Literals.EVENT_PATTERN__TIMER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer(Timer newTimer) {
		eSet(ScalabilityPackage.Literals.EVENT_PATTERN__TIMER, newTimer);
	}

	/**
	 * The cached invocation delegate for the '{@link #includesEvent(eu.paasage.camel.scalability.SimpleEvent) <em>Includes Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #includesEvent(eu.paasage.camel.scalability.SimpleEvent)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INCLUDES_EVENT_SIMPLE_EVENT__EINVOCATION_DELEGATE = ((EOperation.Internal)ScalabilityPackage.Literals.EVENT_PATTERN___INCLUDES_EVENT__SIMPLEEVENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesEvent(SimpleEvent e) {
		try {
			return (Boolean)INCLUDES_EVENT_SIMPLE_EVENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{e}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #includesLeftEvent(eu.paasage.camel.scalability.SimpleEvent) <em>Includes Left Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #includesLeftEvent(eu.paasage.camel.scalability.SimpleEvent)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INCLUDES_LEFT_EVENT_SIMPLE_EVENT__EINVOCATION_DELEGATE = ((EOperation.Internal)ScalabilityPackage.Literals.EVENT_PATTERN___INCLUDES_LEFT_EVENT__SIMPLEEVENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesLeftEvent(SimpleEvent e) {
		try {
			return (Boolean)INCLUDES_LEFT_EVENT_SIMPLE_EVENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{e}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #includesRightEvent(eu.paasage.camel.scalability.SimpleEvent) <em>Includes Right Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #includesRightEvent(eu.paasage.camel.scalability.SimpleEvent)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INCLUDES_RIGHT_EVENT_SIMPLE_EVENT__EINVOCATION_DELEGATE = ((EOperation.Internal)ScalabilityPackage.Literals.EVENT_PATTERN___INCLUDES_RIGHT_EVENT__SIMPLEEVENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesRightEvent(SimpleEvent e) {
		try {
			return (Boolean)INCLUDES_RIGHT_EVENT_SIMPLE_EVENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{e}));
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
			case ScalabilityPackage.EVENT_PATTERN___INCLUDES_EVENT__SIMPLEEVENT:
				return includesEvent((SimpleEvent)arguments.get(0));
			case ScalabilityPackage.EVENT_PATTERN___INCLUDES_LEFT_EVENT__SIMPLEEVENT:
				return includesLeftEvent((SimpleEvent)arguments.get(0));
			case ScalabilityPackage.EVENT_PATTERN___INCLUDES_RIGHT_EVENT__SIMPLEEVENT:
				return includesRightEvent((SimpleEvent)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EventPatternImpl
