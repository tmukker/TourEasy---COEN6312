/**
 */
package tourEasy;

import java.util.Date;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Booking</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link tourEasy.Booking#getBookingId <em>Booking Id</em>}</li>
 * <li>{@link tourEasy.Booking#getTourId <em>Tour Id</em>}</li>
 * <li>{@link tourEasy.Booking#getCustomerId <em>Customer Id</em>}</li>
 * <li>{@link tourEasy.Booking#getDate <em>Date</em>}</li>
 * <li>{@link tourEasy.Booking#getStatus <em>Status</em>}</li>
 * <li>{@link tourEasy.Booking#getPaymentStatus <em>Payment Status</em>}</li>
 * <li>{@link tourEasy.Booking#getPaymentInf <em>Payment Inf</em>}</li>
 * <li>{@link tourEasy.Booking#getSpecialRequest <em>Special Request</em>}</li>
 * <li>{@link tourEasy.Booking#getBooking <em>Booking</em>}</li>
 * <li>{@link tourEasy.Booking#getPaymentinfo <em>Paymentinfo</em>}</li>
 * <li>{@link tourEasy.Booking#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @see tourEasy.TourEasyPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking {

	/**
	 * Returns the value of the '<em><b>Booking Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Id</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Booking Id</em>' attribute.
	 * @see #setBookingId(String)
	 * @see tourEasy.TourEasyPackage#getBooking_BookingId()
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 *        ordered="false" annotation="http://www.eclipse.org/uml2/2.0.0/UML
	 *        originalName='bookingID'"
	 * @generated
	 * 
	 */
	
	String getBookingId();

	/**
	 * Sets the value of the '{@link tourEasy.Booking#getBookingId <em>Booking
	 * Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Booking Id</em>' attribute.
	 * @see #getBookingId()
	 * @generated
	 */
	void setBookingId(String value);

	/**
	 * Returns the value of the '<em><b>Tour Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tour Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Tour Id</em>' attribute.
	 * @see #setTourId(String)
	 * @see tourEasy.TourEasyPackage#getBooking_TourId()
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 *        ordered="false" annotation="http://www.eclipse.org/uml2/2.0.0/UML
	 *        originalName='tourID'"
	 * @generated
	 */
	String getTourId();

	/**
	 * Sets the value of the '{@link tourEasy.Booking#getTourId <em>Tour Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Tour Id</em>' attribute.
	 * @see #getTourId()
	 * @generated
	 */
	void setTourId(String value);

	/**
	 * Returns the value of the '<em><b>Customer Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Id</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Customer Id</em>' attribute.
	 * @see #setCustomerId(String)
	 * @see tourEasy.TourEasyPackage#getBooking_CustomerId()
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 *        ordered="false" annotation="http://www.eclipse.org/uml2/2.0.0/UML
	 *        originalName='customerID'"
	 * @generated
	 */
	String getCustomerId();

	/**
	 * Sets the value of the '{@link tourEasy.Booking#getCustomerId <em>Customer
	 * Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Customer Id</em>' attribute.
	 * @see #getCustomerId()
	 * @generated
	 */
	void setCustomerId(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see tourEasy.TourEasyPackage#getBooking_Date()
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 *        ordered="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link tourEasy.Booking#getDate <em>Date</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see tourEasy.TourEasyPackage#getBooking_Status()
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 *        ordered="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link tourEasy.Booking#getStatus <em>Status</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Payment Status</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Status</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Payment Status</em>' attribute.
	 * @see #setPaymentStatus(String)
	 * @see tourEasy.TourEasyPackage#getBooking_PaymentStatus()
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 *        ordered="false"
	 * @generated
	 */
	String getPaymentStatus();

	/**
	 * Sets the value of the '{@link tourEasy.Booking#getPaymentStatus <em>Payment
	 * Status</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Payment Status</em>' attribute.
	 * @see #getPaymentStatus()
	 * @generated
	 */
	void setPaymentStatus(String value);

	/**
	 * Returns the value of the '<em><b>Payment Inf</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Inf</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Payment Inf</em>' reference.
	 * @see #setPaymentInf(PaymentInfo)
	 * @see tourEasy.TourEasyPackage#getBooking_PaymentInf()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentInfo getPaymentInf();

	/**
	 * Sets the value of the '{@link tourEasy.Booking#getPaymentInf <em>Payment
	 * Inf</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Payment Inf</em>' reference.
	 * @see #getPaymentInf()
	 * @generated
	 */
	void setPaymentInf(PaymentInfo value);

	/**
	 * Returns the value of the '<em><b>Special Request</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Request</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Special Request</em>' reference.
	 * @see #setSpecialRequest(SpecialRequest)
	 * @see tourEasy.TourEasyPackage#getBooking_SpecialRequest()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SpecialRequest getSpecialRequest();

	/**
	 * Sets the value of the '{@link tourEasy.Booking#getSpecialRequest <em>Special
	 * Request</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Special Request</em>' reference.
	 * @see #getSpecialRequest()
	 * @generated
	 */
	void setSpecialRequest(SpecialRequest value);

	/**
	 * Returns the value of the '<em><b>Booking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Booking</em>' containment reference.
	 * @see #setBooking(SpecialRequest)
	 * @see tourEasy.TourEasyPackage#getBooking_Booking()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
	 *        body='specialrequest'"
	 * @generated
	 */
	SpecialRequest getBooking();

	/**
	 * Sets the value of the '{@link tourEasy.Booking#getBooking <em>Booking</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Booking</em>' containment reference.
	 * @see #getBooking()
	 * @generated
	 */
	void setBooking(SpecialRequest value);

	/**
	 * Returns the value of the '<em><b>Paymentinfo</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paymentinfo</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Paymentinfo</em>' reference.
	 * @see #setPaymentinfo(PaymentInfo)
	 * @see tourEasy.TourEasyPackage#getBooking_Paymentinfo()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
	 *        body='booking'"
	 * @generated
	 */
	PaymentInfo getPaymentinfo();

	/**
	 * Sets the value of the '{@link tourEasy.Booking#getPaymentinfo
	 * <em>Paymentinfo</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Paymentinfo</em>' reference.
	 * @see #getPaymentinfo()
	 * @generated
	 */
	void setPaymentinfo(PaymentInfo value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see tourEasy.TourEasyPackage#getBooking_Customer()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
	 *        body='booking'"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link tourEasy.Booking#getCustomer
	 * <em>Customer</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

} // Booking
