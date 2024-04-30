/**
 */
package tourEasy.impl;

import java.time.LocalDateTime;
import java.util.List;

import model.enums.KnownLanguages;
import model.enums.Role;
import tourEasy.Guide;
import tourEasy.User;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Guide</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link tourEasy.impl.GuideImpl#getGuideCharges <em>Guide
 * Charges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuideImpl extends UserImpl implements Guide {
	/**
	 * The default value of the '{@link #getGuideCharges() <em>Guide Charges</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGuideCharges()
	 * @generated
	 * @ordered
	 */
	protected static final int GUIDE_CHARGES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGuideCharges() <em>Guide Charges</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGuideCharges()
	 * @generated
	 * @ordered
	 */
	protected int guideCharges = GUIDE_CHARGES_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GuideImpl() {
		super();
	}
	
	public GuideImpl(User user, Double guideCharges) {
		super(user.getFirstName(), user.getLastName(), user.getDob(), user.getContactNo(), user.getEmail(),
				user.getKnownLanguages(), user.getPassword(), user.getRole());
		this.guideCharges = guideCharges;
	}

	public GuideImpl(String firstName, String lastName, LocalDateTime dob, String contactNo, String email,
			List<KnownLanguages> knownLanguages, String password, Role role, Double guideCharges) {
		super(firstName, lastName, dob, contactNo, email, knownLanguages, password, role);
		this.guideCharges = guideCharges;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getGuideCharges() {
		return guideCharges;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setGuideCharges(int newGuideCharges) {
		int oldGuideCharges = guideCharges;
		guideCharges = newGuideCharges;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (guideCharges: ");
		result.append(guideCharges);
		result.append(')');
		return result.toString();
	}

} // GuideImpl
