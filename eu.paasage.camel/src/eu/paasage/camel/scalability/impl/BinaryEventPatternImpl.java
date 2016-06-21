/**
 */
package eu.paasage.camel.scalability.impl;

import eu.paasage.camel.scalability.BinaryEventPattern;
import eu.paasage.camel.scalability.BinaryPatternOperatorType;
import eu.paasage.camel.scalability.Event;
import eu.paasage.camel.scalability.ScalabilityPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.impl.BinaryEventPatternImpl#getLeftEvent <em>Left Event</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.BinaryEventPatternImpl#getRightEvent <em>Right Event</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.BinaryEventPatternImpl#getLowerOccurrenceBound <em>Lower Occurrence Bound</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.BinaryEventPatternImpl#getUpperOccurrenceBound <em>Upper Occurrence Bound</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.BinaryEventPatternImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryEventPatternImpl extends EventPatternImpl implements BinaryEventPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryEventPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalabilityPackage.Literals.BINARY_EVENT_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getLeftEvent() {
		return (Event)eGet(ScalabilityPackage.Literals.BINARY_EVENT_PATTERN__LEFT_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftEvent(Event newLeftEvent) {
		eSet(ScalabilityPackage.Literals.BINARY_EVENT_PATTERN__LEFT_EVENT, newLeftEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getRightEvent() {
		return (Event)eGet(ScalabilityPackage.Literals.BINARY_EVENT_PATTERN__RIGHT_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightEvent(Event newRightEvent) {
		eSet(ScalabilityPackage.Literals.BINARY_EVENT_PATTERN__RIGHT_EVENT, newRightEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerOccurrenceBound() {
		return (Integer)eGet(ScalabilityPackage.Literals.BINARY_EVENT_PATTERN__LOWER_OCCURRENCE_BOUND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerOccurrenceBound(int newLowerOccurrenceBound) {
		eSet(ScalabilityPackage.Literals.BINARY_EVENT_PATTERN__LOWER_OCCURRENCE_BOUND, newLowerOccurrenceBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperOccurrenceBound() {
		return (Integer)eGet(ScalabilityPackage.Literals.BINARY_EVENT_PATTERN__UPPER_OCCURRENCE_BOUND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperOccurrenceBound(int newUpperOccurrenceBound) {
		eSet(ScalabilityPackage.Literals.BINARY_EVENT_PATTERN__UPPER_OCCURRENCE_BOUND, newUpperOccurrenceBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryPatternOperatorType getOperator() {
		return (BinaryPatternOperatorType)eGet(ScalabilityPackage.Literals.BINARY_EVENT_PATTERN__OPERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(BinaryPatternOperatorType newOperator) {
		eSet(ScalabilityPackage.Literals.BINARY_EVENT_PATTERN__OPERATOR, newOperator);
	}

} //BinaryEventPatternImpl
