/**
 */
package eu.paasage.camel.scalability.impl;

import eu.paasage.camel.scalability.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScalabilityFactoryImpl extends EFactoryImpl implements ScalabilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScalabilityFactory init() {
		try {
			ScalabilityFactory theScalabilityFactory = (ScalabilityFactory)EPackage.Registry.INSTANCE.getEFactory(ScalabilityPackage.eNS_URI);
			if (theScalabilityFactory != null) {
				return theScalabilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScalabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalabilityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ScalabilityPackage.SCALABILITY_MODEL: return (EObject)createScalabilityModel();
			case ScalabilityPackage.EVENT: return (EObject)createEvent();
			case ScalabilityPackage.BINARY_EVENT_PATTERN: return (EObject)createBinaryEventPattern();
			case ScalabilityPackage.UNARY_EVENT_PATTERN: return (EObject)createUnaryEventPattern();
			case ScalabilityPackage.SIMPLE_EVENT: return (EObject)createSimpleEvent();
			case ScalabilityPackage.FUNCTIONAL_EVENT: return (EObject)createFunctionalEvent();
			case ScalabilityPackage.NON_FUNCTIONAL_EVENT: return (EObject)createNonFunctionalEvent();
			case ScalabilityPackage.EVENT_INSTANCE: return (EObject)createEventInstance();
			case ScalabilityPackage.SCALABILITY_RULE: return (EObject)createScalabilityRule();
			case ScalabilityPackage.HORIZONTAL_SCALING_ACTION: return (EObject)createHorizontalScalingAction();
			case ScalabilityPackage.VERTICAL_SCALING_ACTION: return (EObject)createVerticalScalingAction();
			case ScalabilityPackage.TIMER: return (EObject)createTimer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ScalabilityPackage.BINARY_PATTERN_OPERATOR_TYPE:
				return createBinaryPatternOperatorTypeFromString(eDataType, initialValue);
			case ScalabilityPackage.TIMER_TYPE:
				return createTimerTypeFromString(eDataType, initialValue);
			case ScalabilityPackage.UNARY_PATTERN_OPERATOR_TYPE:
				return createUnaryPatternOperatorTypeFromString(eDataType, initialValue);
			case ScalabilityPackage.STATUS_TYPE:
				return createStatusTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ScalabilityPackage.BINARY_PATTERN_OPERATOR_TYPE:
				return convertBinaryPatternOperatorTypeToString(eDataType, instanceValue);
			case ScalabilityPackage.TIMER_TYPE:
				return convertTimerTypeToString(eDataType, instanceValue);
			case ScalabilityPackage.UNARY_PATTERN_OPERATOR_TYPE:
				return convertUnaryPatternOperatorTypeToString(eDataType, instanceValue);
			case ScalabilityPackage.STATUS_TYPE:
				return convertStatusTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalabilityModel createScalabilityModel() {
		ScalabilityModelImpl scalabilityModel = new ScalabilityModelImpl();
		return scalabilityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryEventPattern createBinaryEventPattern() {
		BinaryEventPatternImpl binaryEventPattern = new BinaryEventPatternImpl();
		return binaryEventPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryEventPattern createUnaryEventPattern() {
		UnaryEventPatternImpl unaryEventPattern = new UnaryEventPatternImpl();
		return unaryEventPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleEvent createSimpleEvent() {
		SimpleEventImpl simpleEvent = new SimpleEventImpl();
		return simpleEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalEvent createFunctionalEvent() {
		FunctionalEventImpl functionalEvent = new FunctionalEventImpl();
		return functionalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonFunctionalEvent createNonFunctionalEvent() {
		NonFunctionalEventImpl nonFunctionalEvent = new NonFunctionalEventImpl();
		return nonFunctionalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventInstance createEventInstance() {
		EventInstanceImpl eventInstance = new EventInstanceImpl();
		return eventInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalabilityRule createScalabilityRule() {
		ScalabilityRuleImpl scalabilityRule = new ScalabilityRuleImpl();
		return scalabilityRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalScalingAction createHorizontalScalingAction() {
		HorizontalScalingActionImpl horizontalScalingAction = new HorizontalScalingActionImpl();
		return horizontalScalingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalScalingAction createVerticalScalingAction() {
		VerticalScalingActionImpl verticalScalingAction = new VerticalScalingActionImpl();
		return verticalScalingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timer createTimer() {
		TimerImpl timer = new TimerImpl();
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryPatternOperatorType createBinaryPatternOperatorTypeFromString(EDataType eDataType, String initialValue) {
		BinaryPatternOperatorType result = BinaryPatternOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryPatternOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerType createTimerTypeFromString(EDataType eDataType, String initialValue) {
		TimerType result = TimerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryPatternOperatorType createUnaryPatternOperatorTypeFromString(EDataType eDataType, String initialValue) {
		UnaryPatternOperatorType result = UnaryPatternOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryPatternOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType createStatusTypeFromString(EDataType eDataType, String initialValue) {
		StatusType result = StatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalabilityPackage getScalabilityPackage() {
		return (ScalabilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScalabilityPackage getPackage() {
		return ScalabilityPackage.eINSTANCE;
	}

} //ScalabilityFactoryImpl
