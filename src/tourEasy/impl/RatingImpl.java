/**
 */
package tourEasy.impl;

import tourEasy.Rating;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Rating</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link tourEasy.impl.RatingImpl#getRatingId <em>Rating Id</em>}</li>
 * <li>{@link tourEasy.impl.RatingImpl#getTourId <em>Tour Id</em>}</li>
 * <li>{@link tourEasy.impl.RatingImpl#getStars <em>Stars</em>}</li>
 * <li>{@link tourEasy.impl.RatingImpl#getGuideId <em>Guide Id</em>}</li>
 * <li>{@link tourEasy.impl.RatingImpl#getCustomerId <em>Customer Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RatingImpl implements Rating {
	/**
	 * The default value of the '{@link #getRatingId() <em>Rating Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRatingId()
	 * @generated
	 * @ordered
	 */
	protected static final String RATING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRatingId() <em>Rating Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRatingId()
	 * @generated
	 * @ordered
	 */
	protected String ratingId = RATING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTourId() <em>Tour Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTourId()
	 * @generated
	 * @ordered
	 */
	protected static final String TOUR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTourId() <em>Tour Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTourId()
	 * @generated
	 * @ordered
	 */
	protected String tourId = TOUR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStars() <em>Stars</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStars()
	 * @generated
	 * @ordered
	 */
	protected static final int STARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStars() <em>Stars</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStars()
	 * @generated
	 * @ordered
	 */
	protected int stars = STARS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuideId() <em>Guide Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGuideId()
	 * @generated
	 * @ordered
	 */
	protected static final String GUIDE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuideId() <em>Guide Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGuideId()
	 * @generated
	 * @ordered
	 */
	protected String guideId = GUIDE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerId() <em>Customer Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerId() <em>Customer Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected String customerId = CUSTOMER_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RatingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getRatingId() {
		return ratingId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setRatingId(String newRatingId) {
		String oldRatingId = ratingId;
		ratingId = newRatingId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getTourId() {
		return tourId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTourId(String newTourId) {
		String oldTourId = tourId;
		tourId = newTourId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getStars() {
		return stars;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setStars(int newStars) {
		if (stars < 1 || stars > 5) {
			System.err.println("The number of stars of a rating must be between 1 to 5");
			return;

		}
		stars = newStars;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getGuideId() {
		return guideId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setGuideId(String newGuideId) {
		String oldGuideId = guideId;
		guideId = newGuideId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setCustomerId(String newCustomerId) {
		String oldCustomerId = customerId;
		customerId = newCustomerId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ratingId: ");
		result.append(ratingId);
		result.append(", tourId: ");
		result.append(tourId);
		result.append(", stars: ");
		result.append(stars);
		result.append(", guideId: ");
		result.append(guideId);
		result.append(", customerId: ");
		result.append(customerId);
		result.append(')');
		return result.toString();
	}

} // RatingImpl
