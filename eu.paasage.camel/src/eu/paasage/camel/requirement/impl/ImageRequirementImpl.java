/**
 */
package eu.paasage.camel.requirement.impl;

import eu.paasage.camel.requirement.ImageRequirement;
import eu.paasage.camel.requirement.RequirementPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.requirement.impl.ImageRequirementImpl#getImageId <em>Image Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageRequirementImpl extends OSOrImageRequirementImpl implements ImageRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.IMAGE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageId() {
		return (String)eGet(RequirementPackage.Literals.IMAGE_REQUIREMENT__IMAGE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageId(String newImageId) {
		eSet(RequirementPackage.Literals.IMAGE_REQUIREMENT__IMAGE_ID, newImageId);
	}

} //ImageRequirementImpl
