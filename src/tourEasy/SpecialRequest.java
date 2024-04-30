/**
 */
package tourEasy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tourEasy.SpecialRequest#isApproved <em>Is Approved</em>}</li>
 *   <li>{@link tourEasy.SpecialRequest#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see tourEasy.TourEasyPackage#getSpecialRequest()
 * @model
 * @generated
 */
public interface SpecialRequest {
	/**
	 * Returns the value of the '<em><b>Is Approved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Approved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Approved</em>' attribute.
	 * @see #setIsApproved(boolean)
	 * @see tourEasy.TourEasyPackage#getSpecialRequest_IsApproved()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isApproved();

	/**
	 * Sets the value of the '{@link tourEasy.SpecialRequest#isApproved <em>Is Approved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Approved</em>' attribute.
	 * @see #isApproved()
	 * @generated
	 */
	void setIsApproved(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tourEasy.TourEasyPackage#getSpecialRequest_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tourEasy.SpecialRequest#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // SpecialRequest
