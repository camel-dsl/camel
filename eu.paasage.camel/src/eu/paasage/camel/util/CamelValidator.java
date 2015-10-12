/**
 */
package eu.paasage.camel.util;

import eu.paasage.camel.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.CamelPackage
 * @generated
 */
public class CamelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CamelValidator INSTANCE = new CamelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eu.paasage.camel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CamelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CamelPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case CamelPackage.CAMEL_MODEL:
				return validateCamelModel((CamelModel)value, diagnostics, context);
			case CamelPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case CamelPackage.APPLICATION:
				return validateApplication((Application)value, diagnostics, context);
			case CamelPackage.ACTION_TYPE:
				return validateActionType((ActionType)value, diagnostics, context);
			case CamelPackage.LAYER_TYPE:
				return validateLayerType((LayerType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)model, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCamelModel(CamelModel camelModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)camelModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)action, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)action, diagnostics, context);
		if (result || diagnostics != null) result &= validateAction_correct_action_type(action, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the correct_action_type constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTION__CORRECT_ACTION_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Action: ' + self.toString() + ' has a wrong type (' + self.type.toString() +\n" +
		"\t\t\t\t\t'). Any kind of scaling action should be take one of the four possible action type values, while in the opposite case should map to a CREATION_EVENT',\n" +
		"\tstatus : Boolean = if\n" +
		"\t\t\t\t\t\t(self.oclIsKindOf(camel::scalability::ScalingAction))\n" +
		"\t\t\t\t\tthen (self.type = ActionType::SCALE_IN or self.type = ActionType::SCALE_OUT or self.type = ActionType::SCALE_UP or\n" +
		"\t\t\t\t\t\tself.type = ActionType::SCALE_DOWN)\n" +
		"\t\t\t\t\telse not (self.type = ActionType::SCALE_IN or self.type = ActionType::SCALE_OUT or self.type =\n" +
		"\t\t\t\t\t\tActionType::SCALE_UP or self.type = ActionType::SCALE_DOWN)\n" +
		"\t\t\t\t\tendif\n" +
		"}.status";

	/**
	 * Validates the correct_action_type constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction_correct_action_type(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CamelPackage.Literals.ACTION,
				 action,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correct_action_type",
				 ACTION__CORRECT_ACTION_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)application, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayerType(LayerType layerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CamelValidator
