/**
 */
package tourEasy.impl;

import tourEasy.SpecialRequest;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Special
 * Request</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link tourEasy.impl.SpecialRequestImpl#isApproved <em>Is
 * Approved</em>}</li>
 * <li>{@link tourEasy.impl.SpecialRequestImpl#getDescription
 * <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialRequestImpl implements SpecialRequest {
	/**
	 * The default value of the '{@link #isApproved() <em>Is Approved</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isApproved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_APPROVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApproved() <em>Is Approved</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isApproved()
	 * @generated
	 * @ordered
	 */
	protected boolean isApproved = IS_APPROVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	
	public SpecialRequestImpl(Boolean isApproved, String description) {
		super();
		this.isApproved = isApproved;
		this.description = description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SpecialRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isApproved() {
		return isApproved;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setIsApproved(boolean newIsApproved) {
		boolean oldIsApproved = isApproved;
		isApproved = newIsApproved;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isApproved: ");
		result.append(isApproved);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} // SpecialRequestImpl
