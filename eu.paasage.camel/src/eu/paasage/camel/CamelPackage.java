/**
 */
package eu.paasage.camel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.CamelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface CamelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "camel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.paasage.eu/2015/06/camel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "camel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CamelPackage eINSTANCE = eu.paasage.camel.impl.CamelPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.paasage.camel.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.impl.ModelImpl
	 * @see eu.paasage.camel.impl.CamelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IMPORT_URI = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.impl.CamelModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.impl.CamelModelImpl
	 * @see eu.paasage.camel.impl.CamelPackageImpl#getCamelModel()
	 * @generated
	 */
	int CAMEL_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MODEL__NAME = MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MODEL__IMPORT_URI = MODEL__IMPORT_URI;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MODEL__ACTIONS = MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MODEL__APPLICATIONS = MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deployment Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MODEL__DEPLOYMENT_MODELS = MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Execution Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MODEL__EXECUTION_MODELS = MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Location Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MODEL__LOCATION_MODELS = MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Metric Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MODEL__METRIC_MODELS = MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Organisation Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MODEL__ORGANISATION_MODELS = MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Provider Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MODEL__PROVIDER_MODELS = MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Requirement Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MODEL__REQUIREMENT_MODELS = MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Scalability Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MODEL__SCALABILITY_MODELS = MODEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Security Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MODEL__SECURITY_MODELS = MODEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MODEL__TYPE_MODELS = MODEL_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Unit Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MODEL__UNIT_MODELS = MODEL_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MODEL_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.impl.ActionImpl
	 * @see eu.paasage.camel.impl.CamelPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.impl.ApplicationImpl
	 * @see eu.paasage.camel.impl.CamelPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__OWNER = 3;

	/**
	 * The feature id for the '<em><b>Deployment Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DEPLOYMENT_MODELS = 4;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.ActionType
	 * @see eu.paasage.camel.impl.CamelPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 4;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.LayerType <em>Layer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.LayerType
	 * @see eu.paasage.camel.impl.CamelPackageImpl#getLayerType()
	 * @generated
	 */
	int LAYER_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see eu.paasage.camel.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the attribute list '{@link eu.paasage.camel.Model#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Import URI</em>'.
	 * @see eu.paasage.camel.Model#getImportURI()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ImportURI();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.CamelModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see eu.paasage.camel.CamelModel
	 * @generated
	 */
	EClass getCamelModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.CamelModel#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see eu.paasage.camel.CamelModel#getActions()
	 * @see #getCamelModel()
	 * @generated
	 */
	EReference getCamelModel_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.CamelModel#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see eu.paasage.camel.CamelModel#getApplications()
	 * @see #getCamelModel()
	 * @generated
	 */
	EReference getCamelModel_Applications();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.CamelModel#getDeploymentModels <em>Deployment Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment Models</em>'.
	 * @see eu.paasage.camel.CamelModel#getDeploymentModels()
	 * @see #getCamelModel()
	 * @generated
	 */
	EReference getCamelModel_DeploymentModels();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.CamelModel#getExecutionModels <em>Execution Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execution Models</em>'.
	 * @see eu.paasage.camel.CamelModel#getExecutionModels()
	 * @see #getCamelModel()
	 * @generated
	 */
	EReference getCamelModel_ExecutionModels();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.CamelModel#getLocationModels <em>Location Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location Models</em>'.
	 * @see eu.paasage.camel.CamelModel#getLocationModels()
	 * @see #getCamelModel()
	 * @generated
	 */
	EReference getCamelModel_LocationModels();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.CamelModel#getMetricModels <em>Metric Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Models</em>'.
	 * @see eu.paasage.camel.CamelModel#getMetricModels()
	 * @see #getCamelModel()
	 * @generated
	 */
	EReference getCamelModel_MetricModels();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.CamelModel#getOrganisationModels <em>Organisation Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organisation Models</em>'.
	 * @see eu.paasage.camel.CamelModel#getOrganisationModels()
	 * @see #getCamelModel()
	 * @generated
	 */
	EReference getCamelModel_OrganisationModels();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.CamelModel#getProviderModels <em>Provider Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provider Models</em>'.
	 * @see eu.paasage.camel.CamelModel#getProviderModels()
	 * @see #getCamelModel()
	 * @generated
	 */
	EReference getCamelModel_ProviderModels();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.CamelModel#getRequirementModels <em>Requirement Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Models</em>'.
	 * @see eu.paasage.camel.CamelModel#getRequirementModels()
	 * @see #getCamelModel()
	 * @generated
	 */
	EReference getCamelModel_RequirementModels();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.CamelModel#getScalabilityModels <em>Scalability Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scalability Models</em>'.
	 * @see eu.paasage.camel.CamelModel#getScalabilityModels()
	 * @see #getCamelModel()
	 * @generated
	 */
	EReference getCamelModel_ScalabilityModels();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.CamelModel#getSecurityModels <em>Security Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Models</em>'.
	 * @see eu.paasage.camel.CamelModel#getSecurityModels()
	 * @see #getCamelModel()
	 * @generated
	 */
	EReference getCamelModel_SecurityModels();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.CamelModel#getTypeModels <em>Type Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Models</em>'.
	 * @see eu.paasage.camel.CamelModel#getTypeModels()
	 * @see #getCamelModel()
	 * @generated
	 */
	EReference getCamelModel_TypeModels();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.CamelModel#getUnitModels <em>Unit Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit Models</em>'.
	 * @see eu.paasage.camel.CamelModel#getUnitModels()
	 * @see #getCamelModel()
	 * @generated
	 */
	EReference getCamelModel_UnitModels();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see eu.paasage.camel.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.Action#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.paasage.camel.Action#getType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Type();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see eu.paasage.camel.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.Application#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see eu.paasage.camel.Application#getVersion()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Version();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.Application#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eu.paasage.camel.Application#getDescription()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Description();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.Application#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see eu.paasage.camel.Application#getOwner()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Owner();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.Application#getDeploymentModels <em>Deployment Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployment Models</em>'.
	 * @see eu.paasage.camel.Application#getDeploymentModels()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_DeploymentModels();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see eu.paasage.camel.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.LayerType <em>Layer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layer Type</em>'.
	 * @see eu.paasage.camel.LayerType
	 * @generated
	 */
	EEnum getLayerType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CamelFactory getCamelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.paasage.camel.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.impl.ModelImpl
		 * @see eu.paasage.camel.impl.CamelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__IMPORT_URI = eINSTANCE.getModel_ImportURI();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.impl.CamelModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.impl.CamelModelImpl
		 * @see eu.paasage.camel.impl.CamelPackageImpl#getCamelModel()
		 * @generated
		 */
		EClass CAMEL_MODEL = eINSTANCE.getCamelModel();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMEL_MODEL__ACTIONS = eINSTANCE.getCamelModel_Actions();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMEL_MODEL__APPLICATIONS = eINSTANCE.getCamelModel_Applications();

		/**
		 * The meta object literal for the '<em><b>Deployment Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMEL_MODEL__DEPLOYMENT_MODELS = eINSTANCE.getCamelModel_DeploymentModels();

		/**
		 * The meta object literal for the '<em><b>Execution Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMEL_MODEL__EXECUTION_MODELS = eINSTANCE.getCamelModel_ExecutionModels();

		/**
		 * The meta object literal for the '<em><b>Location Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMEL_MODEL__LOCATION_MODELS = eINSTANCE.getCamelModel_LocationModels();

		/**
		 * The meta object literal for the '<em><b>Metric Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMEL_MODEL__METRIC_MODELS = eINSTANCE.getCamelModel_MetricModels();

		/**
		 * The meta object literal for the '<em><b>Organisation Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMEL_MODEL__ORGANISATION_MODELS = eINSTANCE.getCamelModel_OrganisationModels();

		/**
		 * The meta object literal for the '<em><b>Provider Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMEL_MODEL__PROVIDER_MODELS = eINSTANCE.getCamelModel_ProviderModels();

		/**
		 * The meta object literal for the '<em><b>Requirement Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMEL_MODEL__REQUIREMENT_MODELS = eINSTANCE.getCamelModel_RequirementModels();

		/**
		 * The meta object literal for the '<em><b>Scalability Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMEL_MODEL__SCALABILITY_MODELS = eINSTANCE.getCamelModel_ScalabilityModels();

		/**
		 * The meta object literal for the '<em><b>Security Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMEL_MODEL__SECURITY_MODELS = eINSTANCE.getCamelModel_SecurityModels();

		/**
		 * The meta object literal for the '<em><b>Type Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMEL_MODEL__TYPE_MODELS = eINSTANCE.getCamelModel_TypeModels();

		/**
		 * The meta object literal for the '<em><b>Unit Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMEL_MODEL__UNIT_MODELS = eINSTANCE.getCamelModel_UnitModels();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.impl.ActionImpl
		 * @see eu.paasage.camel.impl.CamelPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__TYPE = eINSTANCE.getAction_Type();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.impl.ApplicationImpl
		 * @see eu.paasage.camel.impl.CamelPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__VERSION = eINSTANCE.getApplication_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__DESCRIPTION = eINSTANCE.getApplication_Description();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__OWNER = eINSTANCE.getApplication_Owner();

		/**
		 * The meta object literal for the '<em><b>Deployment Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__DEPLOYMENT_MODELS = eINSTANCE.getApplication_DeploymentModels();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.ActionType
		 * @see eu.paasage.camel.impl.CamelPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.LayerType <em>Layer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.LayerType
		 * @see eu.paasage.camel.impl.CamelPackageImpl#getLayerType()
		 * @generated
		 */
		EEnum LAYER_TYPE = eINSTANCE.getLayerType();

	}

} //CamelPackage
