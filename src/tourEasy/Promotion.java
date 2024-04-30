/**
 */
package tourEasy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Promotion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tourEasy.Promotion#getPromotionId <em>Promotion Id</em>}</li>
 *   <li>{@link tourEasy.Promotion#getTourId <em>Tour Id</em>}</li>
 *   <li>{@link tourEasy.Promotion#getDiscountPercentage <em>Discount Percentage</em>}</li>
 *   <li>{@link tourEasy.Promotion#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link tourEasy.Promotion#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @see tourEasy.TourEasyPackage#getPromotion()
 * @model
 * @generated
 */
public interface Promotion {
	/**
	 * Returns the value of the '<em><b>Promotion Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promotion Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promotion Id</em>' attribute.
	 * @see #setPromotionId(String)
	 * @see tourEasy.TourEasyPackage#getPromotion_PromotionId()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='promotionID'"
	 * @generated
	 */
	String getPromotionId();

	/**
	 * Sets the value of the '{@link tourEasy.Promotion#getPromotionId <em>Promotion Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promotion Id</em>' attribute.
	 * @see #getPromotionId()
	 * @generated
	 */
	void setPromotionId(String value);

	/**
	 * Returns the value of the '<em><b>Tour Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tour Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tour Id</em>' attribute.
	 * @see #setTourId(String)
	 * @see tourEasy.TourEasyPackage#getPromotion_TourId()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='tourID'"
	 * @generated
	 */
	String getTourId();

	/**
	 * Sets the value of the '{@link tourEasy.Promotion#getTourId <em>Tour Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tour Id</em>' attribute.
	 * @see #getTourId()
	 * @generated
	 */
	void setTourId(String value);

	/**
	 * Returns the value of the '<em><b>Discount Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount Percentage</em>' attribute.
	 * @see #setDiscountPercentage(double)
	 * @see tourEasy.TourEasyPackage#getPromotion_DiscountPercentage()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getDiscountPercentage();

	/**
	 * Sets the value of the '{@link tourEasy.Promotion#getDiscountPercentage <em>Discount Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount Percentage</em>' attribute.
	 * @see #getDiscountPercentage()
	 * @generated
	 */
	void setDiscountPercentage(double value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(String)
	 * @see tourEasy.TourEasyPackage#getPromotion_StartDate()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link tourEasy.Promotion#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see tourEasy.TourEasyPackage#getPromotion_EndDate()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link tourEasy.Promotion#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

} // Promotion
