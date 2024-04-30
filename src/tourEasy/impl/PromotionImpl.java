/**
 */
package tourEasy.impl;

import tourEasy.Promotion;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Promotion</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link tourEasy.impl.PromotionImpl#getPromotionId <em>Promotion
 * Id</em>}</li>
 * <li>{@link tourEasy.impl.PromotionImpl#getTourId <em>Tour Id</em>}</li>
 * <li>{@link tourEasy.impl.PromotionImpl#getDiscountPercentage <em>Discount
 * Percentage</em>}</li>
 * <li>{@link tourEasy.impl.PromotionImpl#getStartDate <em>Start Date</em>}</li>
 * <li>{@link tourEasy.impl.PromotionImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PromotionImpl implements Promotion {
	/**
	 * The default value of the '{@link #getPromotionId() <em>Promotion Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPromotionId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROMOTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPromotionId() <em>Promotion Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPromotionId()
	 * @generated
	 * @ordered
	 */
	protected String promotionId = PROMOTION_ID_EDEFAULT;

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
	 * The default value of the '{@link #getDiscountPercentage() <em>Discount
	 * Percentage</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDiscountPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final double DISCOUNT_PERCENTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiscountPercentage() <em>Discount
	 * Percentage</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDiscountPercentage()
	 * @generated
	 * @ordered
	 */
	protected double discountPercentage = DISCOUNT_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected String startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected String endDate = END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PromotionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getPromotionId() {
		return promotionId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPromotionId(String newPromotionId) {
		String oldPromotionId = promotionId;
		promotionId = newPromotionId;
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
	public double getDiscountPercentage() {
		return discountPercentage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDiscountPercentage(double newDiscountPercentage) {
		double oldDiscountPercentage = discountPercentage;
		discountPercentage = newDiscountPercentage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setStartDate(String newStartDate) {
		String oldStartDate = startDate;
		startDate = newStartDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setEndDate(String newEndDate) {
		String oldEndDate = endDate;
		endDate = newEndDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (promotionId: ");
		result.append(promotionId);
		result.append(", tourId: ");
		result.append(tourId);
		result.append(", discountPercentage: ");
		result.append(discountPercentage);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} // PromotionImpl
