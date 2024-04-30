/**
 */
package tourEasy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rating</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tourEasy.Rating#getRatingId <em>Rating Id</em>}</li>
 *   <li>{@link tourEasy.Rating#getTourId <em>Tour Id</em>}</li>
 *   <li>{@link tourEasy.Rating#getStars <em>Stars</em>}</li>
 *   <li>{@link tourEasy.Rating#getGuideId <em>Guide Id</em>}</li>
 *   <li>{@link tourEasy.Rating#getCustomerId <em>Customer Id</em>}</li>
 * </ul>
 *
 * @see tourEasy.TourEasyPackage#getRating()
 * @model
 * @generated
 */
public interface Rating {
	/**
	 * Returns the value of the '<em><b>Rating Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rating Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating Id</em>' attribute.
	 * @see #setRatingId(String)
	 * @see tourEasy.TourEasyPackage#getRating_RatingId()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ratingID'"
	 * @generated
	 */
	String getRatingId();

	/**
	 * Sets the value of the '{@link tourEasy.Rating#getRatingId <em>Rating Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating Id</em>' attribute.
	 * @see #getRatingId()
	 * @generated
	 */
	void setRatingId(String value);

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
	 * @see tourEasy.TourEasyPackage#getRating_TourId()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='tourID'"
	 * @generated
	 */
	String getTourId();

	/**
	 * Sets the value of the '{@link tourEasy.Rating#getTourId <em>Tour Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tour Id</em>' attribute.
	 * @see #getTourId()
	 * @generated
	 */
	void setTourId(String value);

	/**
	 * Returns the value of the '<em><b>Stars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stars</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stars</em>' attribute.
	 * @see #setStars(int)
	 * @see tourEasy.TourEasyPackage#getRating_Stars()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getStars();

	/**
	 * Sets the value of the '{@link tourEasy.Rating#getStars <em>Stars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stars</em>' attribute.
	 * @see #getStars()
	 * @generated
	 */
	void setStars(int value);

	/**
	 * Returns the value of the '<em><b>Guide Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guide Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guide Id</em>' attribute.
	 * @see #setGuideId(String)
	 * @see tourEasy.TourEasyPackage#getRating_GuideId()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='guideID'"
	 * @generated
	 */
	String getGuideId();

	/**
	 * Sets the value of the '{@link tourEasy.Rating#getGuideId <em>Guide Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guide Id</em>' attribute.
	 * @see #getGuideId()
	 * @generated
	 */
	void setGuideId(String value);

	/**
	 * Returns the value of the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Id</em>' attribute.
	 * @see #setCustomerId(String)
	 * @see tourEasy.TourEasyPackage#getRating_CustomerId()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='customerID'"
	 * @generated
	 */
	String getCustomerId();

	/**
	 * Sets the value of the '{@link tourEasy.Rating#getCustomerId <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Id</em>' attribute.
	 * @see #getCustomerId()
	 * @generated
	 */
	void setCustomerId(String value);

} // Rating
