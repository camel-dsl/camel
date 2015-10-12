/**
 */
package eu.paasage.camel.scalability.impl;

import eu.paasage.camel.scalability.Event;
import eu.paasage.camel.scalability.ScalabilityPackage;
import eu.paasage.camel.scalability.UnaryEventPattern;
import eu.paasage.camel.scalability.UnaryPatternOperatorType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.impl.UnaryEventPatternImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.UnaryEventPatternImpl#getOccurrenceNum <em>Occurrence Num</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.UnaryEventPatternImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnaryEventPatternImpl extends EventPatternImpl implements UnaryEventPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryEventPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalabilityPackage.Literals.UNARY_EVENT_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEvent() {
		return (Event)eGet(ScalabilityPackage.Literals.UNARY_EVENT_PATTERN__EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(Event newEvent) {
		eSet(ScalabilityPackage.Literals.UNARY_EVENT_PATTERN__EVENT, newEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOccurrenceNum() {
		return (Integer)eGet(ScalabilityPackage.Literals.UNARY_EVENT_PATTERN__OCCURRENCE_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceNum(int newOccurrenceNum) {
		eSet(ScalabilityPackage.Literals.UNARY_EVENT_PATTERN__OCCURRENCE_NUM, newOccurrenceNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryPatternOperatorType getOperator() {
		return (UnaryPatternOperatorType)eGet(ScalabilityPackage.Literals.UNARY_EVENT_PATTERN__OPERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(UnaryPatternOperatorType newOperator) {
		eSet(ScalabilityPackage.Literals.UNARY_EVENT_PATTERN__OPERATOR, newOperator);
	}

} //UnaryEventPatternImpl
