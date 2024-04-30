/**
 */
package tourEasy.impl;

import java.util.Date;

import tourEasy.Booking;
import tourEasy.Customer;
import tourEasy.PaymentInfo;
import tourEasy.SpecialRequest;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Booking</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link tourEasy.impl.BookingImpl#getBookingId <em>Booking Id</em>}</li>
 * <li>{@link tourEasy.impl.BookingImpl#getTourId <em>Tour Id</em>}</li>
 * <li>{@link tourEasy.impl.BookingImpl#getCustomerId <em>Customer Id</em>}</li>
 * <li>{@link tourEasy.impl.BookingImpl#getDate <em>Date</em>}</li>
 * <li>{@link tourEasy.impl.BookingImpl#getStatus <em>Status</em>}</li>
 * <li>{@link tourEasy.impl.BookingImpl#getPaymentStatus <em>Payment
 * Status</em>}</li>
 * <li>{@link tourEasy.impl.BookingImpl#getPaymentInf <em>Payment Inf</em>}</li>
 * <li>{@link tourEasy.impl.BookingImpl#getSpecialRequest <em>Special
 * Request</em>}</li>
 * <li>{@link tourEasy.impl.BookingImpl#getBooking <em>Booking</em>}</li>
 * <li>{@link tourEasy.impl.BookingImpl#getPaymentinfo
 * <em>Paymentinfo</em>}</li>
 * <li>{@link tourEasy.impl.BookingImpl#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingImpl implements Booking {
	/**
	 * The default value of the '{@link #getBookingId() <em>Booking Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBookingId()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookingId() <em>Booking Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBookingId()
	 * @generated
	 * @ordered
	 */
	protected String bookingId = BOOKING_ID_EDEFAULT;

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
	 * The default value of the '{@link #getCustomerId() <em>Customer Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerId() <em>Customer Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected String customerId = CUSTOMER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentStatus() <em>Payment
	 * Status</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentStatus() <em>Payment Status</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected String paymentStatus = PAYMENT_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaymentInf() <em>Payment Inf</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPaymentInf()
	 * @generated
	 * @ordered
	 */
	protected PaymentInfo paymentInf;

	/**
	 * The cached value of the '{@link #getSpecialRequest() <em>Special
	 * Request</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSpecialRequest()
	 * @generated
	 * @ordered
	 */
	protected SpecialRequest specialRequest;

	/**
	 * The cached value of the '{@link #getBooking() <em>Booking</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBooking()
	 * @generated
	 * @ordered
	 */
	protected SpecialRequest booking;

	/**
	 * The cached value of the '{@link #getPaymentinfo() <em>Paymentinfo</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPaymentinfo()
	 * @generated
	 * @ordered
	 */
	protected PaymentInfo paymentinfo;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	public BookingImpl(String bookingID, String tourID, String customerID, Date date, String status, String paymentStatus, PaymentInfo paymentInfo) {
		super();
		this.bookingId = bookingID;
		this.tourId = tourID;
		this.customerId = customerID;
		this.date = date;
		this.status = status;
		this.paymentStatus = paymentStatus;
		this.specialRequest = specialRequest;
		this.paymentinfo = paymentInfo;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getBookingId() {
		return bookingId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setBookingId(String newBookingId) {
		String oldBookingId = bookingId;
		bookingId = newBookingId;
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
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setCustomerId(String newCustomerId) {
		String oldCustomerId = customerId;
		customerId = newCustomerId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPaymentStatus(String newPaymentStatus) {
		String oldPaymentStatus = paymentStatus;
		paymentStatus = newPaymentStatus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public PaymentInfo getPaymentInf() {
		return paymentInf;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PaymentInfo basicGetPaymentInf() {
		return paymentInf;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPaymentInf(PaymentInfo newPaymentInf) {
		PaymentInfo oldPaymentInf = paymentInf;
		paymentInf = newPaymentInf;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public SpecialRequest getSpecialRequest() {
		return specialRequest;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SpecialRequest basicGetSpecialRequest() {
		return specialRequest;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSpecialRequest(SpecialRequest newSpecialRequest) {
		SpecialRequest oldSpecialRequest = specialRequest;
		specialRequest = newSpecialRequest;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public SpecialRequest getBooking() {
		return booking;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setBooking(SpecialRequest newBooking) {
		if (newBooking != booking) {
			booking = newBooking;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public PaymentInfo getPaymentinfo() {
		return paymentinfo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PaymentInfo basicGetPaymentinfo() {
		return paymentinfo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPaymentinfo(PaymentInfo newPaymentinfo) {
		paymentinfo = newPaymentinfo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setCustomer(Customer newCustomer) {
		customer = newCustomer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (bookingId: ");
		result.append(bookingId);
		result.append(", tourId: ");
		result.append(tourId);
		result.append(", customerId: ");
		result.append(customerId);
		result.append(", date: ");
		result.append(date);
		result.append(", status: ");
		result.append(status);
		result.append(", paymentStatus: ");
		result.append(paymentStatus);
		result.append(')');
		return result.toString();
	}

} // BookingImpl
