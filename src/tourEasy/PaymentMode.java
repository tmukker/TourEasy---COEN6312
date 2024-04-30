/**
 */
package tourEasy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tourEasy.PaymentMode#getPaymentMode <em>Payment Mode</em>}</li>
 * </ul>
 *
 * @see tourEasy.TourEasyPackage#getPaymentMode()
 * @model
 * @generated
 */
public interface PaymentMode {
	/**
	 * Returns the value of the '<em><b>Payment Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Mode</em>' attribute.
	 * @see #setPaymentMode(String)
	 * @see tourEasy.TourEasyPackage#getPaymentMode_PaymentMode()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPaymentMode();

	/**
	 * Sets the value of the '{@link tourEasy.PaymentMode#getPaymentMode <em>Payment Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Mode</em>' attribute.
	 * @see #getPaymentMode()
	 * @generated
	 */
	void setPaymentMode(String value);

} // PaymentMode
