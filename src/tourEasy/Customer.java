/**
 */
package tourEasy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tourEasy.Customer#getPersonalAddress <em>Personal Address</em>}</li>
 *   <li>{@link tourEasy.Customer#getPaymentInf <em>Payment Inf</em>}</li>
 *   <li>{@link tourEasy.Customer#getPaymentinfo <em>Paymentinfo</em>}</li>
 * </ul>
 *
 * @see tourEasy.TourEasyPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends User {
	/**
	 * Returns the value of the '<em><b>Personal Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personal Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Address</em>' attribute.
	 * @see #setPersonalAddress(String)
	 * @see tourEasy.TourEasyPackage#getCustomer_PersonalAddress()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPersonalAddress();

	/**
	 * Sets the value of the '{@link tourEasy.Customer#getPersonalAddress <em>Personal Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Address</em>' attribute.
	 * @see #getPersonalAddress()
	 * @generated
	 */
	void setPersonalAddress(String value);

	/**
	 * Returns the value of the '<em><b>Payment Inf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Inf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Inf</em>' reference.
	 * @see #setPaymentInf(PaymentInfo)
	 * @see tourEasy.TourEasyPackage#getCustomer_PaymentInf()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentInfo getPaymentInf();

	/**
	 * Sets the value of the '{@link tourEasy.Customer#getPaymentInf <em>Payment Inf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Inf</em>' reference.
	 * @see #getPaymentInf()
	 * @generated
	 */
	void setPaymentInf(PaymentInfo value);

	/**
	 * Returns the value of the '<em><b>Paymentinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paymentinfo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paymentinfo</em>' containment reference.
	 * @see #setPaymentinfo(PaymentInfo)
	 * @see tourEasy.TourEasyPackage#getCustomer_Paymentinfo()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='customer'"
	 * @generated
	 */
	PaymentInfo getPaymentinfo();

	/**
	 * Sets the value of the '{@link tourEasy.Customer#getPaymentinfo <em>Paymentinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paymentinfo</em>' containment reference.
	 * @see #getPaymentinfo()
	 * @generated
	 */
	void setPaymentinfo(PaymentInfo value);

} // Customer
