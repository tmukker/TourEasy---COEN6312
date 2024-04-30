/**
 */
package tourEasy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tourEasy.PaymentInfo#getBillingName <em>Billing Name</em>}</li>
 *   <li>{@link tourEasy.PaymentInfo#getBillingAddress <em>Billing Address</em>}</li>
 *   <li>{@link tourEasy.PaymentInfo#getPreferredModeOfPayment <em>Preferred Mode Of Payment</em>}</li>
 *   <li>{@link tourEasy.PaymentInfo#getWalletDetails <em>Wallet Details</em>}</li>
 *   <li>{@link tourEasy.PaymentInfo#getCardDetails <em>Card Details</em>}</li>
 *   <li>{@link tourEasy.PaymentInfo#getWallet <em>Wallet</em>}</li>
 * </ul>
 *
 * @see tourEasy.TourEasyPackage#getPaymentInfo()
 * @model
 * @generated
 */
public interface PaymentInfo {
	/**
	 * Returns the value of the '<em><b>Billing Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Name</em>' attribute.
	 * @see #setBillingName(String)
	 * @see tourEasy.TourEasyPackage#getPaymentInfo_BillingName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBillingName();

	/**
	 * Sets the value of the '{@link tourEasy.PaymentInfo#getBillingName <em>Billing Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Name</em>' attribute.
	 * @see #getBillingName()
	 * @generated
	 */
	void setBillingName(String value);

	/**
	 * Returns the value of the '<em><b>Billing Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Address</em>' attribute.
	 * @see #setBillingAddress(String)
	 * @see tourEasy.TourEasyPackage#getPaymentInfo_BillingAddress()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBillingAddress();

	/**
	 * Sets the value of the '{@link tourEasy.PaymentInfo#getBillingAddress <em>Billing Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Address</em>' attribute.
	 * @see #getBillingAddress()
	 * @generated
	 */
	void setBillingAddress(String value);

	/**
	 * Returns the value of the '<em><b>Preferred Mode Of Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Mode Of Payment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Mode Of Payment</em>' reference.
	 * @see #setPreferredModeOfPayment(PaymentMode)
	 * @see tourEasy.TourEasyPackage#getPaymentInfo_PreferredModeOfPayment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	model.enums.PaymentMode getPreferredModeOfPayment();

	/**
	 * Sets the value of the '{@link tourEasy.PaymentInfo#getPreferredModeOfPayment <em>Preferred Mode Of Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Mode Of Payment</em>' reference.
	 * @see #getPreferredModeOfPayment()
	 * @generated
	 */
	void setPreferredModeOfPayment(model.enums.PaymentMode value);

	/**
	 * Returns the value of the '<em><b>Wallet Details</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wallet Details</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wallet Details</em>' reference.
	 * @see #setWalletDetails(Wallet)
	 * @see tourEasy.TourEasyPackage#getPaymentInfo_WalletDetails()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Wallet getWalletDetails();

	/**
	 * Sets the value of the '{@link tourEasy.PaymentInfo#getWalletDetails <em>Wallet Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wallet Details</em>' reference.
	 * @see #getWalletDetails()
	 * @generated
	 */
	void setWalletDetails(Wallet value);

	/**
	 * Returns the value of the '<em><b>Card Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Details</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Details</em>' attribute.
	 * @see #setCardDetails(String)
	 * @see tourEasy.TourEasyPackage#getPaymentInfo_CardDetails()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCardDetails();

	/**
	 * Sets the value of the '{@link tourEasy.PaymentInfo#getCardDetails <em>Card Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Details</em>' attribute.
	 * @see #getCardDetails()
	 * @generated
	 */
	void setCardDetails(String value);

	/**
	 * Returns the value of the '<em><b>Wallet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wallet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wallet</em>' reference.
	 * @see #setWallet(Wallet)
	 * @see tourEasy.TourEasyPackage#getPaymentInfo_Wallet()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='paymentinfo'"
	 * @generated
	 */
	Wallet getWallet();

	/**
	 * Sets the value of the '{@link tourEasy.PaymentInfo#getWallet <em>Wallet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wallet</em>' reference.
	 * @see #getWallet()
	 * @generated
	 */
	void setWallet(Wallet value);

} // PaymentInfo
