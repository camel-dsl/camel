/**
 */
package eu.paasage.camel.provider;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.provider.Feature#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.Feature#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.Feature#getSubFeatures <em>Sub Features</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.Feature#getFeatureCardinality <em>Feature Cardinality</em>}</li>
 *   <li>{@link eu.paasage.camel.provider.Feature#getClones <em>Clones</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.provider.ProviderPackage#getFeature()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Feature extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.paasage.camel.provider.ProviderPackage#getFeature_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.provider.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see eu.paasage.camel.provider.ProviderPackage#getFeature_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Sub Features</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.provider.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Features</em>' containment reference list.
	 * @see eu.paasage.camel.provider.ProviderPackage#getFeature_SubFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getSubFeatures();

	/**
	 * Returns the value of the '<em><b>Feature Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Cardinality</em>' containment reference.
	 * @see #setFeatureCardinality(FeatCardinality)
	 * @see eu.paasage.camel.provider.ProviderPackage#getFeature_FeatureCardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatCardinality getFeatureCardinality();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.provider.Feature#getFeatureCardinality <em>Feature Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Cardinality</em>' containment reference.
	 * @see #getFeatureCardinality()
	 * @generated
	 */
	void setFeatureCardinality(FeatCardinality value);

	/**
	 * Returns the value of the '<em><b>Clones</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.provider.Clone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clones</em>' containment reference list.
	 * @see eu.paasage.camel.provider.ProviderPackage#getFeature_Clones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clone> getClones();

} // Feature
