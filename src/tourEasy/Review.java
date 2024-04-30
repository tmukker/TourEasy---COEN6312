/**
 */
package tourEasy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Review</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tourEasy.Review#getReviewId <em>Review Id</em>}</li>
 *   <li>{@link tourEasy.Review#getComment <em>Comment</em>}</li>
 *   <li>{@link tourEasy.Review#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see tourEasy.TourEasyPackage#getReview()
 * @model
 * @generated
 */
public interface Review {
	/**
	 * Returns the value of the '<em><b>Review Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Review Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review Id</em>' attribute.
	 * @see #setReviewId(String)
	 * @see tourEasy.TourEasyPackage#getReview_ReviewId()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='reviewID'"
	 * @generated
	 */
	String getReviewId();

	/**
	 * Sets the value of the '{@link tourEasy.Review#getReviewId <em>Review Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Id</em>' attribute.
	 * @see #getReviewId()
	 * @generated
	 */
	void setReviewId(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see tourEasy.TourEasyPackage#getReview_Comment()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link tourEasy.Review#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see tourEasy.TourEasyPackage#getReview_Date()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link tourEasy.Review#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

} // Review
