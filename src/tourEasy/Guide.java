/**
 */
package tourEasy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guide</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tourEasy.Guide#getGuideCharges <em>Guide Charges</em>}</li>
 * </ul>
 *
 * @see tourEasy.TourEasyPackage#getGuide()
 * @model
 * @generated
 */
public interface Guide extends User {
	/**
	 * Returns the value of the '<em><b>Guide Charges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guide Charges</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guide Charges</em>' attribute.
	 * @see #setGuideCharges(int)
	 * @see tourEasy.TourEasyPackage#getGuide_GuideCharges()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getGuideCharges();

	/**
	 * Sets the value of the '{@link tourEasy.Guide#getGuideCharges <em>Guide Charges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guide Charges</em>' attribute.
	 * @see #getGuideCharges()
	 * @generated
	 */
	void setGuideCharges(int value);

} // Guide
