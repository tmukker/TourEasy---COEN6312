///**
// */
//package tourEasy;
//
//import org.eclipse.emf.ecore.EAttribute;
//import org.eclipse.emf.ecore.EClass;
//import org.eclipse.emf.ecore.EOperation;
//import org.eclipse.emf.ecore.EPackage;
//import org.eclipse.emf.ecore.EReference;
//
///**
// * <!-- begin-user-doc -->
// * The <b>Package</b> for the model.
// * It contains accessors for the meta objects to represent
// * <ul>
// *   <li>each class,</li>
// *   <li>each feature of each class,</li>
// *   <li>each operation of each class,</li>
// *   <li>each enum,</li>
// *   <li>and each data type</li>
// * </ul>
// * <!-- end-user-doc -->
// * @see tourEasy.TourEasyFactory
// * @model kind="package"
// *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TourEasy'"
// * @generated
// */
//public interface TourEasyPackage extends EPackage {
//	/**
//	 * The package name.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	String eNAME = "tourEasy";
//
//	/**
//	 * The package namespace URI.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	String eNS_URI = "http:///tourEasy.ecore";
//
//	/**
//	 * The package namespace name.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	String eNS_PREFIX = "tourEasy";
//
//	/**
//	 * The singleton instance of the package.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	TourEasyPackage eINSTANCE = tourEasy.impl.TourEasyPackageImpl.init();
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.BookingImpl <em>Booking</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.BookingImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getBooking()
//	 * @generated
//	 */
//	int BOOKING = 0;
//
//	/**
//	 * The feature id for the '<em><b>Booking Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int BOOKING__BOOKING_ID = 0;
//
//	/**
//	 * The feature id for the '<em><b>Tour Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int BOOKING__TOUR_ID = 1;
//
//	/**
//	 * The feature id for the '<em><b>Customer Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int BOOKING__CUSTOMER_ID = 2;
//
//	/**
//	 * The feature id for the '<em><b>Date</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int BOOKING__DATE = 3;
//
//	/**
//	 * The feature id for the '<em><b>Status</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int BOOKING__STATUS = 4;
//
//	/**
//	 * The feature id for the '<em><b>Payment Status</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int BOOKING__PAYMENT_STATUS = 5;
//
//	/**
//	 * The feature id for the '<em><b>Payment Inf</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int BOOKING__PAYMENT_INF = 6;
//
//	/**
//	 * The feature id for the '<em><b>Special Request</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int BOOKING__SPECIAL_REQUEST = 7;
//
//	/**
//	 * The feature id for the '<em><b>Booking</b></em>' containment reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int BOOKING__BOOKING = 8;
//
//	/**
//	 * The feature id for the '<em><b>Paymentinfo</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int BOOKING__PAYMENTINFO = 9;
//
//	/**
//	 * The feature id for the '<em><b>Customer</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int BOOKING__CUSTOMER = 10;
//
//	/**
//	 * The number of structural features of the '<em>Booking</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int BOOKING_FEATURE_COUNT = 11;
//
//	/**
//	 * The number of operations of the '<em>Booking</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int BOOKING_OPERATION_COUNT = 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.PaymentInfoImpl <em>Payment Info</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.PaymentInfoImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getPaymentInfo()
//	 * @generated
//	 */
//	int PAYMENT_INFO = 1;
//
//	/**
//	 * The feature id for the '<em><b>Billing Name</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PAYMENT_INFO__BILLING_NAME = 0;
//
//	/**
//	 * The feature id for the '<em><b>Billing Address</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PAYMENT_INFO__BILLING_ADDRESS = 1;
//
//	/**
//	 * The feature id for the '<em><b>Preferred Mode Of Payment</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PAYMENT_INFO__PREFERRED_MODE_OF_PAYMENT = 2;
//
//	/**
//	 * The feature id for the '<em><b>Wallet Details</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PAYMENT_INFO__WALLET_DETAILS = 3;
//
//	/**
//	 * The feature id for the '<em><b>Card Details</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PAYMENT_INFO__CARD_DETAILS = 4;
//
//	/**
//	 * The feature id for the '<em><b>Wallet</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PAYMENT_INFO__WALLET = 5;
//
//	/**
//	 * The number of structural features of the '<em>Payment Info</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PAYMENT_INFO_FEATURE_COUNT = 6;
//
//	/**
//	 * The number of operations of the '<em>Payment Info</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PAYMENT_INFO_OPERATION_COUNT = 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.PaymentModeImpl <em>Payment Mode</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.PaymentModeImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getPaymentMode()
//	 * @generated
//	 */
//	int PAYMENT_MODE = 2;
//
//	/**
//	 * The feature id for the '<em><b>Payment Mode</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PAYMENT_MODE__PAYMENT_MODE = 0;
//
//	/**
//	 * The number of structural features of the '<em>Payment Mode</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PAYMENT_MODE_FEATURE_COUNT = 1;
//
//	/**
//	 * The number of operations of the '<em>Payment Mode</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PAYMENT_MODE_OPERATION_COUNT = 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.WalletImpl <em>Wallet</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.WalletImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getWallet()
//	 * @generated
//	 */
//	int WALLET = 3;
//
//	/**
//	 * The feature id for the '<em><b>Wallet Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int WALLET__WALLET_ID = 0;
//
//	/**
//	 * The feature id for the '<em><b>Wallet Balance</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int WALLET__WALLET_BALANCE = 1;
//
//	/**
//	 * The number of structural features of the '<em>Wallet</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int WALLET_FEATURE_COUNT = 2;
//
//	/**
//	 * The operation id for the '<em>Top Up</em>' operation.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int WALLET___TOP_UP__DOUBLE = 0;
//
//	/**
//	 * The operation id for the '<em>Withdraw</em>' operation.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int WALLET___WITHDRAW__DOUBLE = 1;
//
//	/**
//	 * The number of operations of the '<em>Wallet</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int WALLET_OPERATION_COUNT = 2;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.SpecialRequestImpl <em>Special Request</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.SpecialRequestImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getSpecialRequest()
//	 * @generated
//	 */
//	int SPECIAL_REQUEST = 4;
//
//	/**
//	 * The feature id for the '<em><b>Is Approved</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int SPECIAL_REQUEST__IS_APPROVED = 0;
//
//	/**
//	 * The feature id for the '<em><b>Description</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int SPECIAL_REQUEST__DESCRIPTION = 1;
//
//	/**
//	 * The number of structural features of the '<em>Special Request</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int SPECIAL_REQUEST_FEATURE_COUNT = 2;
//
//	/**
//	 * The number of operations of the '<em>Special Request</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int SPECIAL_REQUEST_OPERATION_COUNT = 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.PersonImpl <em>Person</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.PersonImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getPerson()
//	 * @generated
//	 */
//	int PERSON = 7;
//
//	/**
//	 * The feature id for the '<em><b>Knownlanguages</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PERSON__KNOWNLANGUAGES = 0;
//
//	/**
//	 * The feature id for the '<em><b>First Name</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PERSON__FIRST_NAME = 1;
//
//	/**
//	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PERSON__LAST_NAME = 2;
//
//	/**
//	 * The feature id for the '<em><b>Dob</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PERSON__DOB = 3;
//
//	/**
//	 * The feature id for the '<em><b>Contact No</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PERSON__CONTACT_NO = 4;
//
//	/**
//	 * The feature id for the '<em><b>Email</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PERSON__EMAIL = 5;
//
//	/**
//	 * The number of structural features of the '<em>Person</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PERSON_FEATURE_COUNT = 6;
//
//	/**
//	 * The number of operations of the '<em>Person</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PERSON_OPERATION_COUNT = 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.UserImpl <em>User</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.UserImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getUser()
//	 * @generated
//	 */
//	int USER = 6;
//
//	/**
//	 * The feature id for the '<em><b>Knownlanguages</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int USER__KNOWNLANGUAGES = PERSON__KNOWNLANGUAGES;
//
//	/**
//	 * The feature id for the '<em><b>First Name</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int USER__FIRST_NAME = PERSON__FIRST_NAME;
//
//	/**
//	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int USER__LAST_NAME = PERSON__LAST_NAME;
//
//	/**
//	 * The feature id for the '<em><b>Dob</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int USER__DOB = PERSON__DOB;
//
//	/**
//	 * The feature id for the '<em><b>Contact No</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int USER__CONTACT_NO = PERSON__CONTACT_NO;
//
//	/**
//	 * The feature id for the '<em><b>Email</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int USER__EMAIL = PERSON__EMAIL;
//
//	/**
//	 * The feature id for the '<em><b>Password</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int USER__PASSWORD = PERSON_FEATURE_COUNT + 0;
//
//	/**
//	 * The feature id for the '<em><b>Role</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int USER__ROLE = PERSON_FEATURE_COUNT + 1;
//
//	/**
//	 * The number of structural features of the '<em>User</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int USER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;
//
//	/**
//	 * The number of operations of the '<em>User</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int USER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.CustomerImpl <em>Customer</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.CustomerImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getCustomer()
//	 * @generated
//	 */
//	int CUSTOMER = 5;
//
//	/**
//	 * The feature id for the '<em><b>Knownlanguages</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int CUSTOMER__KNOWNLANGUAGES = USER__KNOWNLANGUAGES;
//
//	/**
//	 * The feature id for the '<em><b>First Name</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int CUSTOMER__FIRST_NAME = USER__FIRST_NAME;
//
//	/**
//	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int CUSTOMER__LAST_NAME = USER__LAST_NAME;
//
//	/**
//	 * The feature id for the '<em><b>Dob</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int CUSTOMER__DOB = USER__DOB;
//
//	/**
//	 * The feature id for the '<em><b>Contact No</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int CUSTOMER__CONTACT_NO = USER__CONTACT_NO;
//
//	/**
//	 * The feature id for the '<em><b>Email</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int CUSTOMER__EMAIL = USER__EMAIL;
//
//	/**
//	 * The feature id for the '<em><b>Password</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int CUSTOMER__PASSWORD = USER__PASSWORD;
//
//	/**
//	 * The feature id for the '<em><b>Role</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int CUSTOMER__ROLE = USER__ROLE;
//
//	/**
//	 * The feature id for the '<em><b>Personal Address</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int CUSTOMER__PERSONAL_ADDRESS = USER_FEATURE_COUNT + 0;
//
//	/**
//	 * The feature id for the '<em><b>Payment Inf</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int CUSTOMER__PAYMENT_INF = USER_FEATURE_COUNT + 1;
//
//	/**
//	 * The feature id for the '<em><b>Paymentinfo</b></em>' containment reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int CUSTOMER__PAYMENTINFO = USER_FEATURE_COUNT + 2;
//
//	/**
//	 * The number of structural features of the '<em>Customer</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int CUSTOMER_FEATURE_COUNT = USER_FEATURE_COUNT + 3;
//
//	/**
//	 * The number of operations of the '<em>Customer</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int CUSTOMER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.KnownLanguagesImpl <em>Known Languages</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.KnownLanguagesImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getKnownLanguages()
//	 * @generated
//	 */
//	int KNOWN_LANGUAGES = 8;
//
//	/**
//	 * The feature id for the '<em><b>Known Languages</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int KNOWN_LANGUAGES__KNOWN_LANGUAGES = 0;
//
//	/**
//	 * The number of structural features of the '<em>Known Languages</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int KNOWN_LANGUAGES_FEATURE_COUNT = 1;
//
//	/**
//	 * The number of operations of the '<em>Known Languages</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int KNOWN_LANGUAGES_OPERATION_COUNT = 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.RoleImpl <em>Role</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.RoleImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getRole()
//	 * @generated
//	 */
//	int ROLE = 9;
//
//	/**
//	 * The feature id for the '<em><b>Role</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ROLE__ROLE = 0;
//
//	/**
//	 * The number of structural features of the '<em>Role</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ROLE_FEATURE_COUNT = 1;
//
//	/**
//	 * The number of operations of the '<em>Role</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ROLE_OPERATION_COUNT = 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.HotelImpl <em>Hotel</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.HotelImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getHotel()
//	 * @generated
//	 */
//	int HOTEL = 10;
//
//	/**
//	 * The feature id for the '<em><b>Hotel Name</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int HOTEL__HOTEL_NAME = 0;
//
//	/**
//	 * The feature id for the '<em><b>Hotel Address</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int HOTEL__HOTEL_ADDRESS = 1;
//
//	/**
//	 * The feature id for the '<em><b>Manager</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int HOTEL__MANAGER = 2;
//
//	/**
//	 * The feature id for the '<em><b>City Name</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int HOTEL__CITY_NAME = 3;
//
//	/**
//	 * The feature id for the '<em><b>Number Of Available Rooms</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int HOTEL__NUMBER_OF_AVAILABLE_ROOMS = 4;
//
//	/**
//	 * The feature id for the '<em><b>Price</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int HOTEL__PRICE = 5;
//
//	/**
//	 * The feature id for the '<em><b>Hotel Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int HOTEL__HOTEL_ID = 6;
//
//	/**
//	 * The feature id for the '<em><b>Person</b></em>' containment reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int HOTEL__PERSON = 7;
//
//	/**
//	 * The number of structural features of the '<em>Hotel</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int HOTEL_FEATURE_COUNT = 8;
//
//	/**
//	 * The number of operations of the '<em>Hotel</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int HOTEL_OPERATION_COUNT = 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.RatingImpl <em>Rating</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.RatingImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getRating()
//	 * @generated
//	 */
//	int RATING = 11;
//
//	/**
//	 * The feature id for the '<em><b>Rating Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int RATING__RATING_ID = 0;
//
//	/**
//	 * The feature id for the '<em><b>Tour Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int RATING__TOUR_ID = 1;
//
//	/**
//	 * The feature id for the '<em><b>Stars</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int RATING__STARS = 2;
//
//	/**
//	 * The feature id for the '<em><b>Guide Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int RATING__GUIDE_ID = 3;
//
//	/**
//	 * The feature id for the '<em><b>Customer Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int RATING__CUSTOMER_ID = 4;
//
//	/**
//	 * The number of structural features of the '<em>Rating</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int RATING_FEATURE_COUNT = 5;
//
//	/**
//	 * The number of operations of the '<em>Rating</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int RATING_OPERATION_COUNT = 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.TourImpl <em>Tour</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.TourImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getTour()
//	 * @generated
//	 */
//	int TOUR = 12;
//
//	/**
//	 * The feature id for the '<em><b>Tour Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int TOUR__TOUR_ID = 0;
//
//	/**
//	 * The feature id for the '<em><b>Destination</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int TOUR__DESTINATION = 1;
//
//	/**
//	 * The feature id for the '<em><b>Number Of Nights</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int TOUR__NUMBER_OF_NIGHTS = 2;
//
//	/**
//	 * The feature id for the '<em><b>Hotel</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int TOUR__HOTEL = 3;
//
//	/**
//	 * The feature id for the '<em><b>In City Mode Of Transport</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int TOUR__IN_CITY_MODE_OF_TRANSPORT = 4;
//
//	/**
//	 * The feature id for the '<em><b>Guide</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int TOUR__GUIDE = 5;
//
//	/**
//	 * The number of structural features of the '<em>Tour</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int TOUR_FEATURE_COUNT = 6;
//
//	/**
//	 * The number of operations of the '<em>Tour</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int TOUR_OPERATION_COUNT = 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.DestinationImpl <em>Destination</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.DestinationImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getDestination()
//	 * @generated
//	 */
//	int DESTINATION = 13;
//
//	/**
//	 * The feature id for the '<em><b>Destination Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int DESTINATION__DESTINATION_ID = 0;
//
//	/**
//	 * The feature id for the '<em><b>Name</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int DESTINATION__NAME = 1;
//
//	/**
//	 * The feature id for the '<em><b>Attractions</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int DESTINATION__ATTRACTIONS = 2;
//
//	/**
//	 * The feature id for the '<em><b>Description</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int DESTINATION__DESCRIPTION = 3;
//
//	/**
//	 * The number of structural features of the '<em>Destination</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int DESTINATION_FEATURE_COUNT = 4;
//
//	/**
//	 * The number of operations of the '<em>Destination</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int DESTINATION_OPERATION_COUNT = 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.ModeOfTransportImpl <em>Mode Of Transport</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.ModeOfTransportImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getModeOfTransport()
//	 * @generated
//	 */
//	int MODE_OF_TRANSPORT = 14;
//
//	/**
//	 * The feature id for the '<em><b>Mode Of Transport</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int MODE_OF_TRANSPORT__MODE_OF_TRANSPORT = 0;
//
//	/**
//	 * The number of structural features of the '<em>Mode Of Transport</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int MODE_OF_TRANSPORT_FEATURE_COUNT = 1;
//
//	/**
//	 * The number of operations of the '<em>Mode Of Transport</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int MODE_OF_TRANSPORT_OPERATION_COUNT = 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.GuideImpl <em>Guide</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.GuideImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getGuide()
//	 * @generated
//	 */
//	int GUIDE = 15;
//
//	/**
//	 * The feature id for the '<em><b>Knownlanguages</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int GUIDE__KNOWNLANGUAGES = USER__KNOWNLANGUAGES;
//
//	/**
//	 * The feature id for the '<em><b>First Name</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int GUIDE__FIRST_NAME = USER__FIRST_NAME;
//
//	/**
//	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int GUIDE__LAST_NAME = USER__LAST_NAME;
//
//	/**
//	 * The feature id for the '<em><b>Dob</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int GUIDE__DOB = USER__DOB;
//
//	/**
//	 * The feature id for the '<em><b>Contact No</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int GUIDE__CONTACT_NO = USER__CONTACT_NO;
//
//	/**
//	 * The feature id for the '<em><b>Email</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int GUIDE__EMAIL = USER__EMAIL;
//
//	/**
//	 * The feature id for the '<em><b>Password</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int GUIDE__PASSWORD = USER__PASSWORD;
//
//	/**
//	 * The feature id for the '<em><b>Role</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int GUIDE__ROLE = USER__ROLE;
//
//	/**
//	 * The feature id for the '<em><b>Guide Charges</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int GUIDE__GUIDE_CHARGES = USER_FEATURE_COUNT + 0;
//
//	/**
//	 * The number of structural features of the '<em>Guide</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int GUIDE_FEATURE_COUNT = USER_FEATURE_COUNT + 1;
//
//	/**
//	 * The number of operations of the '<em>Guide</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int GUIDE_OPERATION_COUNT = USER_OPERATION_COUNT + 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.ReviewImpl <em>Review</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.ReviewImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getReview()
//	 * @generated
//	 */
//	int REVIEW = 16;
//
//	/**
//	 * The feature id for the '<em><b>Rating Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int REVIEW__RATING_ID = RATING__RATING_ID;
//
//	/**
//	 * The feature id for the '<em><b>Tour Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int REVIEW__TOUR_ID = RATING__TOUR_ID;
//
//	/**
//	 * The feature id for the '<em><b>Stars</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int REVIEW__STARS = RATING__STARS;
//
//	/**
//	 * The feature id for the '<em><b>Guide Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int REVIEW__GUIDE_ID = RATING__GUIDE_ID;
//
//	/**
//	 * The feature id for the '<em><b>Customer Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int REVIEW__CUSTOMER_ID = RATING__CUSTOMER_ID;
//
//	/**
//	 * The feature id for the '<em><b>Review Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int REVIEW__REVIEW_ID = RATING_FEATURE_COUNT + 0;
//
//	/**
//	 * The feature id for the '<em><b>Comment</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int REVIEW__COMMENT = RATING_FEATURE_COUNT + 1;
//
//	/**
//	 * The feature id for the '<em><b>Date</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int REVIEW__DATE = RATING_FEATURE_COUNT + 2;
//
//	/**
//	 * The number of structural features of the '<em>Review</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int REVIEW_FEATURE_COUNT = RATING_FEATURE_COUNT + 3;
//
//	/**
//	 * The number of operations of the '<em>Review</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int REVIEW_OPERATION_COUNT = RATING_OPERATION_COUNT + 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.NotificationImpl <em>Notification</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.NotificationImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getNotification()
//	 * @generated
//	 */
//	int NOTIFICATION = 17;
//
//	/**
//	 * The feature id for the '<em><b>Notification Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int NOTIFICATION__NOTIFICATION_ID = 0;
//
//	/**
//	 * The feature id for the '<em><b>Email</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int NOTIFICATION__EMAIL = 1;
//
//	/**
//	 * The feature id for the '<em><b>Message</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int NOTIFICATION__MESSAGE = 2;
//
//	/**
//	 * The feature id for the '<em><b>Status</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int NOTIFICATION__STATUS = 3;
//
//	/**
//	 * The feature id for the '<em><b>Date</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int NOTIFICATION__DATE = 4;
//
//	/**
//	 * The number of structural features of the '<em>Notification</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int NOTIFICATION_FEATURE_COUNT = 5;
//
//	/**
//	 * The number of operations of the '<em>Notification</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int NOTIFICATION_OPERATION_COUNT = 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.PromotionImpl <em>Promotion</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.PromotionImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getPromotion()
//	 * @generated
//	 */
//	int PROMOTION = 18;
//
//	/**
//	 * The feature id for the '<em><b>Promotion Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PROMOTION__PROMOTION_ID = 0;
//
//	/**
//	 * The feature id for the '<em><b>Tour Id</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PROMOTION__TOUR_ID = 1;
//
//	/**
//	 * The feature id for the '<em><b>Discount Percentage</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PROMOTION__DISCOUNT_PERCENTAGE = 2;
//
//	/**
//	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PROMOTION__START_DATE = 3;
//
//	/**
//	 * The feature id for the '<em><b>End Date</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PROMOTION__END_DATE = 4;
//
//	/**
//	 * The number of structural features of the '<em>Promotion</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PROMOTION_FEATURE_COUNT = 5;
//
//	/**
//	 * The number of operations of the '<em>Promotion</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int PROMOTION_OPERATION_COUNT = 0;
//
//	/**
//	 * The meta object id for the '{@link tourEasy.impl.AdminImpl <em>Admin</em>}' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see tourEasy.impl.AdminImpl
//	 * @see tourEasy.impl.TourEasyPackageImpl#getAdmin()
//	 * @generated
//	 */
//	int ADMIN = 19;
//
//	/**
//	 * The feature id for the '<em><b>Knownlanguages</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ADMIN__KNOWNLANGUAGES = USER__KNOWNLANGUAGES;
//
//	/**
//	 * The feature id for the '<em><b>First Name</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ADMIN__FIRST_NAME = USER__FIRST_NAME;
//
//	/**
//	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ADMIN__LAST_NAME = USER__LAST_NAME;
//
//	/**
//	 * The feature id for the '<em><b>Dob</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ADMIN__DOB = USER__DOB;
//
//	/**
//	 * The feature id for the '<em><b>Contact No</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ADMIN__CONTACT_NO = USER__CONTACT_NO;
//
//	/**
//	 * The feature id for the '<em><b>Email</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ADMIN__EMAIL = USER__EMAIL;
//
//	/**
//	 * The feature id for the '<em><b>Password</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ADMIN__PASSWORD = USER__PASSWORD;
//
//	/**
//	 * The feature id for the '<em><b>Role</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ADMIN__ROLE = USER__ROLE;
//
//	/**
//	 * The feature id for the '<em><b>Department</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ADMIN__DEPARTMENT = USER_FEATURE_COUNT + 0;
//
//	/**
//	 * The feature id for the '<em><b>Supervisor</b></em>' reference.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ADMIN__SUPERVISOR = USER_FEATURE_COUNT + 1;
//
//	/**
//	 * The feature id for the '<em><b>Salary</b></em>' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ADMIN__SALARY = USER_FEATURE_COUNT + 2;
//
//	/**
//	 * The number of structural features of the '<em>Admin</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ADMIN_FEATURE_COUNT = USER_FEATURE_COUNT + 3;
//
//	/**
//	 * The number of operations of the '<em>Admin</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ADMIN_OPERATION_COUNT = USER_OPERATION_COUNT + 0;
//
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.Booking <em>Booking</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Booking</em>'.
//	 * @see tourEasy.Booking
//	 * @generated
//	 */
//	EClass getBooking();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Booking#getBookingId <em>Booking Id</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Booking Id</em>'.
//	 * @see tourEasy.Booking#getBookingId()
//	 * @see #getBooking()
//	 * @generated
//	 */
//	EAttribute getBooking_BookingId();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Booking#getTourId <em>Tour Id</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Tour Id</em>'.
//	 * @see tourEasy.Booking#getTourId()
//	 * @see #getBooking()
//	 * @generated
//	 */
//	EAttribute getBooking_TourId();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Booking#getCustomerId <em>Customer Id</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Customer Id</em>'.
//	 * @see tourEasy.Booking#getCustomerId()
//	 * @see #getBooking()
//	 * @generated
//	 */
//	EAttribute getBooking_CustomerId();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Booking#getDate <em>Date</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Date</em>'.
//	 * @see tourEasy.Booking#getDate()
//	 * @see #getBooking()
//	 * @generated
//	 */
//	EAttribute getBooking_Date();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Booking#getStatus <em>Status</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Status</em>'.
//	 * @see tourEasy.Booking#getStatus()
//	 * @see #getBooking()
//	 * @generated
//	 */
//	EAttribute getBooking_Status();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Booking#getPaymentStatus <em>Payment Status</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Payment Status</em>'.
//	 * @see tourEasy.Booking#getPaymentStatus()
//	 * @see #getBooking()
//	 * @generated
//	 */
//	EAttribute getBooking_PaymentStatus();
//
//	/**
//	 * Returns the meta object for the reference '{@link tourEasy.Booking#getPaymentInf <em>Payment Inf</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the reference '<em>Payment Inf</em>'.
//	 * @see tourEasy.Booking#getPaymentInf()
//	 * @see #getBooking()
//	 * @generated
//	 */
//	EReference getBooking_PaymentInf();
//
//	/**
//	 * Returns the meta object for the reference '{@link tourEasy.Booking#getSpecialRequest <em>Special Request</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the reference '<em>Special Request</em>'.
//	 * @see tourEasy.Booking#getSpecialRequest()
//	 * @see #getBooking()
//	 * @generated
//	 */
//	EReference getBooking_SpecialRequest();
//
//	/**
//	 * Returns the meta object for the containment reference '{@link tourEasy.Booking#getBooking <em>Booking</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the containment reference '<em>Booking</em>'.
//	 * @see tourEasy.Booking#getBooking()
//	 * @see #getBooking()
//	 * @generated
//	 */
//	EReference getBooking_Booking();
//
//	/**
//	 * Returns the meta object for the reference '{@link tourEasy.Booking#getPaymentinfo <em>Paymentinfo</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the reference '<em>Paymentinfo</em>'.
//	 * @see tourEasy.Booking#getPaymentinfo()
//	 * @see #getBooking()
//	 * @generated
//	 */
//	EReference getBooking_Paymentinfo();
//
//	/**
//	 * Returns the meta object for the reference '{@link tourEasy.Booking#getCustomer <em>Customer</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the reference '<em>Customer</em>'.
//	 * @see tourEasy.Booking#getCustomer()
//	 * @see #getBooking()
//	 * @generated
//	 */
//	EReference getBooking_Customer();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.PaymentInfo <em>Payment Info</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Payment Info</em>'.
//	 * @see tourEasy.PaymentInfo
//	 * @generated
//	 */
//	EClass getPaymentInfo();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.PaymentInfo#getBillingName <em>Billing Name</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Billing Name</em>'.
//	 * @see tourEasy.PaymentInfo#getBillingName()
//	 * @see #getPaymentInfo()
//	 * @generated
//	 */
//	EAttribute getPaymentInfo_BillingName();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.PaymentInfo#getBillingAddress <em>Billing Address</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Billing Address</em>'.
//	 * @see tourEasy.PaymentInfo#getBillingAddress()
//	 * @see #getPaymentInfo()
//	 * @generated
//	 */
//	EAttribute getPaymentInfo_BillingAddress();
//
//	/**
//	 * Returns the meta object for the reference '{@link tourEasy.PaymentInfo#getPreferredModeOfPayment <em>Preferred Mode Of Payment</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the reference '<em>Preferred Mode Of Payment</em>'.
//	 * @see tourEasy.PaymentInfo#getPreferredModeOfPayment()
//	 * @see #getPaymentInfo()
//	 * @generated
//	 */
//	EReference getPaymentInfo_PreferredModeOfPayment();
//
//	/**
//	 * Returns the meta object for the reference '{@link tourEasy.PaymentInfo#getWalletDetails <em>Wallet Details</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the reference '<em>Wallet Details</em>'.
//	 * @see tourEasy.PaymentInfo#getWalletDetails()
//	 * @see #getPaymentInfo()
//	 * @generated
//	 */
//	EReference getPaymentInfo_WalletDetails();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.PaymentInfo#getCardDetails <em>Card Details</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Card Details</em>'.
//	 * @see tourEasy.PaymentInfo#getCardDetails()
//	 * @see #getPaymentInfo()
//	 * @generated
//	 */
//	EAttribute getPaymentInfo_CardDetails();
//
//	/**
//	 * Returns the meta object for the reference '{@link tourEasy.PaymentInfo#getWallet <em>Wallet</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the reference '<em>Wallet</em>'.
//	 * @see tourEasy.PaymentInfo#getWallet()
//	 * @see #getPaymentInfo()
//	 * @generated
//	 */
//	EReference getPaymentInfo_Wallet();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.PaymentMode <em>Payment Mode</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Payment Mode</em>'.
//	 * @see tourEasy.PaymentMode
//	 * @generated
//	 */
//	EClass getPaymentMode();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.PaymentMode#getPaymentMode <em>Payment Mode</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Payment Mode</em>'.
//	 * @see tourEasy.PaymentMode#getPaymentMode()
//	 * @see #getPaymentMode()
//	 * @generated
//	 */
//	EAttribute getPaymentMode_PaymentMode();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.Wallet <em>Wallet</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Wallet</em>'.
//	 * @see tourEasy.Wallet
//	 * @generated
//	 */
//	EClass getWallet();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Wallet#getWalletId <em>Wallet Id</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Wallet Id</em>'.
//	 * @see tourEasy.Wallet#getWalletId()
//	 * @see #getWallet()
//	 * @generated
//	 */
//	EAttribute getWallet_WalletId();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Wallet#getWalletBalance <em>Wallet Balance</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Wallet Balance</em>'.
//	 * @see tourEasy.Wallet#getWalletBalance()
//	 * @see #getWallet()
//	 * @generated
//	 */
//	EAttribute getWallet_WalletBalance();
//
//	/**
//	 * Returns the meta object for the '{@link tourEasy.Wallet#topUp(double) <em>Top Up</em>}' operation.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the '<em>Top Up</em>' operation.
//	 * @see tourEasy.Wallet#topUp(double)
//	 * @generated
//	 */
//	EOperation getWallet__TopUp__double();
//
//	/**
//	 * Returns the meta object for the '{@link tourEasy.Wallet#withdraw(double) <em>Withdraw</em>}' operation.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the '<em>Withdraw</em>' operation.
//	 * @see tourEasy.Wallet#withdraw(double)
//	 * @generated
//	 */
//	EOperation getWallet__Withdraw__double();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.SpecialRequest <em>Special Request</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Special Request</em>'.
//	 * @see tourEasy.SpecialRequest
//	 * @generated
//	 */
//	EClass getSpecialRequest();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.SpecialRequest#isApproved <em>Is Approved</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Is Approved</em>'.
//	 * @see tourEasy.SpecialRequest#isApproved()
//	 * @see #getSpecialRequest()
//	 * @generated
//	 */
//	EAttribute getSpecialRequest_IsApproved();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.SpecialRequest#getDescription <em>Description</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Description</em>'.
//	 * @see tourEasy.SpecialRequest#getDescription()
//	 * @see #getSpecialRequest()
//	 * @generated
//	 */
//	EAttribute getSpecialRequest_Description();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.Customer <em>Customer</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Customer</em>'.
//	 * @see tourEasy.Customer
//	 * @generated
//	 */
//	EClass getCustomer();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Customer#getPersonalAddress <em>Personal Address</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Personal Address</em>'.
//	 * @see tourEasy.Customer#getPersonalAddress()
//	 * @see #getCustomer()
//	 * @generated
//	 */
//	EAttribute getCustomer_PersonalAddress();
//
//	/**
//	 * Returns the meta object for the reference '{@link tourEasy.Customer#getPaymentInf <em>Payment Inf</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the reference '<em>Payment Inf</em>'.
//	 * @see tourEasy.Customer#getPaymentInf()
//	 * @see #getCustomer()
//	 * @generated
//	 */
//	EReference getCustomer_PaymentInf();
//
//	/**
//	 * Returns the meta object for the containment reference '{@link tourEasy.Customer#getPaymentinfo <em>Paymentinfo</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the containment reference '<em>Paymentinfo</em>'.
//	 * @see tourEasy.Customer#getPaymentinfo()
//	 * @see #getCustomer()
//	 * @generated
//	 */
//	EReference getCustomer_Paymentinfo();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.User <em>User</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>User</em>'.
//	 * @see tourEasy.User
//	 * @generated
//	 */
//	EClass getUser();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.User#getPassword <em>Password</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Password</em>'.
//	 * @see tourEasy.User#getPassword()
//	 * @see #getUser()
//	 * @generated
//	 */
//	EAttribute getUser_Password();
//
//	/**
//	 * Returns the meta object for the reference '{@link tourEasy.User#getRole <em>Role</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the reference '<em>Role</em>'.
//	 * @see tourEasy.User#getRole()
//	 * @see #getUser()
//	 * @generated
//	 */
//	EReference getUser_Role();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.Person <em>Person</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Person</em>'.
//	 * @see tourEasy.Person
//	 * @generated
//	 */
//	EClass getPerson();
//
//	/**
//	 * Returns the meta object for the reference '{@link tourEasy.Person#getKnownlanguages <em>Knownlanguages</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the reference '<em>Knownlanguages</em>'.
//	 * @see tourEasy.Person#getKnownlanguages()
//	 * @see #getPerson()
//	 * @generated
//	 */
//	EReference getPerson_Knownlanguages();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Person#getFirstName <em>First Name</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>First Name</em>'.
//	 * @see tourEasy.Person#getFirstName()
//	 * @see #getPerson()
//	 * @generated
//	 */
//	EAttribute getPerson_FirstName();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Person#getLastName <em>Last Name</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Last Name</em>'.
//	 * @see tourEasy.Person#getLastName()
//	 * @see #getPerson()
//	 * @generated
//	 */
//	EAttribute getPerson_LastName();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Person#getDob <em>Dob</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Dob</em>'.
//	 * @see tourEasy.Person#getDob()
//	 * @see #getPerson()
//	 * @generated
//	 */
//	EAttribute getPerson_Dob();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Person#getContactNo <em>Contact No</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Contact No</em>'.
//	 * @see tourEasy.Person#getContactNo()
//	 * @see #getPerson()
//	 * @generated
//	 */
//	EAttribute getPerson_ContactNo();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Person#getEmail <em>Email</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Email</em>'.
//	 * @see tourEasy.Person#getEmail()
//	 * @see #getPerson()
//	 * @generated
//	 */
//	EAttribute getPerson_Email();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.KnownLanguages <em>Known Languages</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Known Languages</em>'.
//	 * @see tourEasy.KnownLanguages
//	 * @generated
//	 */
//	EClass getKnownLanguages();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.KnownLanguages#getKnownLanguages <em>Known Languages</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Known Languages</em>'.
//	 * @see tourEasy.KnownLanguages#getKnownLanguages()
//	 * @see #getKnownLanguages()
//	 * @generated
//	 */
//	EAttribute getKnownLanguages_KnownLanguages();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.Role <em>Role</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Role</em>'.
//	 * @see tourEasy.Role
//	 * @generated
//	 */
//	EClass getRole();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Role#getRole <em>Role</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Role</em>'.
//	 * @see tourEasy.Role#getRole()
//	 * @see #getRole()
//	 * @generated
//	 */
//	EAttribute getRole_Role();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.Hotel <em>Hotel</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Hotel</em>'.
//	 * @see tourEasy.Hotel
//	 * @generated
//	 */
//	EClass getHotel();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Hotel#getHotelName <em>Hotel Name</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Hotel Name</em>'.
//	 * @see tourEasy.Hotel#getHotelName()
//	 * @see #getHotel()
//	 * @generated
//	 */
//	EAttribute getHotel_HotelName();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Hotel#getHotelAddress <em>Hotel Address</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Hotel Address</em>'.
//	 * @see tourEasy.Hotel#getHotelAddress()
//	 * @see #getHotel()
//	 * @generated
//	 */
//	EAttribute getHotel_HotelAddress();
//
//	/**
//	 * Returns the meta object for the reference '{@link tourEasy.Hotel#getManager <em>Manager</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the reference '<em>Manager</em>'.
//	 * @see tourEasy.Hotel#getManager()
//	 * @see #getHotel()
//	 * @generated
//	 */
//	EReference getHotel_Manager();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Hotel#getCityName <em>City Name</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>City Name</em>'.
//	 * @see tourEasy.Hotel#getCityName()
//	 * @see #getHotel()
//	 * @generated
//	 */
//	EAttribute getHotel_CityName();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Hotel#getNumberOfAvailableRooms <em>Number Of Available Rooms</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Number Of Available Rooms</em>'.
//	 * @see tourEasy.Hotel#getNumberOfAvailableRooms()
//	 * @see #getHotel()
//	 * @generated
//	 */
//	EAttribute getHotel_NumberOfAvailableRooms();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Hotel#getPrice <em>Price</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Price</em>'.
//	 * @see tourEasy.Hotel#getPrice()
//	 * @see #getHotel()
//	 * @generated
//	 */
//	EAttribute getHotel_Price();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Hotel#getHotelId <em>Hotel Id</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Hotel Id</em>'.
//	 * @see tourEasy.Hotel#getHotelId()
//	 * @see #getHotel()
//	 * @generated
//	 */
//	EAttribute getHotel_HotelId();
//
//	/**
//	 * Returns the meta object for the containment reference '{@link tourEasy.Hotel#getPerson <em>Person</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the containment reference '<em>Person</em>'.
//	 * @see tourEasy.Hotel#getPerson()
//	 * @see #getHotel()
//	 * @generated
//	 */
//	EReference getHotel_Person();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.Rating <em>Rating</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Rating</em>'.
//	 * @see tourEasy.Rating
//	 * @generated
//	 */
//	EClass getRating();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Rating#getRatingId <em>Rating Id</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Rating Id</em>'.
//	 * @see tourEasy.Rating#getRatingId()
//	 * @see #getRating()
//	 * @generated
//	 */
//	EAttribute getRating_RatingId();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Rating#getTourId <em>Tour Id</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Tour Id</em>'.
//	 * @see tourEasy.Rating#getTourId()
//	 * @see #getRating()
//	 * @generated
//	 */
//	EAttribute getRating_TourId();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Rating#getStars <em>Stars</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Stars</em>'.
//	 * @see tourEasy.Rating#getStars()
//	 * @see #getRating()
//	 * @generated
//	 */
//	EAttribute getRating_Stars();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Rating#getGuideId <em>Guide Id</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Guide Id</em>'.
//	 * @see tourEasy.Rating#getGuideId()
//	 * @see #getRating()
//	 * @generated
//	 */
//	EAttribute getRating_GuideId();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Rating#getCustomerId <em>Customer Id</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Customer Id</em>'.
//	 * @see tourEasy.Rating#getCustomerId()
//	 * @see #getRating()
//	 * @generated
//	 */
//	EAttribute getRating_CustomerId();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.Tour <em>Tour</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Tour</em>'.
//	 * @see tourEasy.Tour
//	 * @generated
//	 */
//	EClass getTour();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Tour#getTourId <em>Tour Id</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Tour Id</em>'.
//	 * @see tourEasy.Tour#getTourId()
//	 * @see #getTour()
//	 * @generated
//	 */
//	EAttribute getTour_TourId();
//
//	/**
//	 * Returns the meta object for the reference '{@link tourEasy.Tour#getDestination <em>Destination</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the reference '<em>Destination</em>'.
//	 * @see tourEasy.Tour#getDestination()
//	 * @see #getTour()
//	 * @generated
//	 */
//	EReference getTour_Destination();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Tour#getNumberOfNights <em>Number Of Nights</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Number Of Nights</em>'.
//	 * @see tourEasy.Tour#getNumberOfNights()
//	 * @see #getTour()
//	 * @generated
//	 */
//	EAttribute getTour_NumberOfNights();
//
//	/**
//	 * Returns the meta object for the reference '{@link tourEasy.Tour#getHotel <em>Hotel</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the reference '<em>Hotel</em>'.
//	 * @see tourEasy.Tour#getHotel()
//	 * @see #getTour()
//	 * @generated
//	 */
//	EReference getTour_Hotel();
//
//	/**
//	 * Returns the meta object for the reference '{@link tourEasy.Tour#getInCityModeOfTransport <em>In City Mode Of Transport</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the reference '<em>In City Mode Of Transport</em>'.
//	 * @see tourEasy.Tour#getInCityModeOfTransport()
//	 * @see #getTour()
//	 * @generated
//	 */
//	EReference getTour_InCityModeOfTransport();
//
//	/**
//	 * Returns the meta object for the reference '{@link tourEasy.Tour#getGuide <em>Guide</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the reference '<em>Guide</em>'.
//	 * @see tourEasy.Tour#getGuide()
//	 * @see #getTour()
//	 * @generated
//	 */
//	EReference getTour_Guide();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.Destination <em>Destination</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Destination</em>'.
//	 * @see tourEasy.Destination
//	 * @generated
//	 */
//	EClass getDestination();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Destination#getDestinationId <em>Destination Id</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Destination Id</em>'.
//	 * @see tourEasy.Destination#getDestinationId()
//	 * @see #getDestination()
//	 * @generated
//	 */
//	EAttribute getDestination_DestinationId();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Destination#getName <em>Name</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Name</em>'.
//	 * @see tourEasy.Destination#getName()
//	 * @see #getDestination()
//	 * @generated
//	 */
//	EAttribute getDestination_Name();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Destination#getAttractions <em>Attractions</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Attractions</em>'.
//	 * @see tourEasy.Destination#getAttractions()
//	 * @see #getDestination()
//	 * @generated
//	 */
//	EAttribute getDestination_Attractions();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Destination#getDescription <em>Description</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Description</em>'.
//	 * @see tourEasy.Destination#getDescription()
//	 * @see #getDestination()
//	 * @generated
//	 */
//	EAttribute getDestination_Description();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.ModeOfTransport <em>Mode Of Transport</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Mode Of Transport</em>'.
//	 * @see tourEasy.ModeOfTransport
//	 * @generated
//	 */
//	EClass getModeOfTransport();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.ModeOfTransport#getModeOfTransport <em>Mode Of Transport</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Mode Of Transport</em>'.
//	 * @see tourEasy.ModeOfTransport#getModeOfTransport()
//	 * @see #getModeOfTransport()
//	 * @generated
//	 */
//	EAttribute getModeOfTransport_ModeOfTransport();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.Guide <em>Guide</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Guide</em>'.
//	 * @see tourEasy.Guide
//	 * @generated
//	 */
//	EClass getGuide();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Guide#getGuideCharges <em>Guide Charges</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Guide Charges</em>'.
//	 * @see tourEasy.Guide#getGuideCharges()
//	 * @see #getGuide()
//	 * @generated
//	 */
//	EAttribute getGuide_GuideCharges();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.Review <em>Review</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Review</em>'.
//	 * @see tourEasy.Review
//	 * @generated
//	 */
//	EClass getReview();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Review#getReviewId <em>Review Id</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Review Id</em>'.
//	 * @see tourEasy.Review#getReviewId()
//	 * @see #getReview()
//	 * @generated
//	 */
//	EAttribute getReview_ReviewId();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Review#getComment <em>Comment</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Comment</em>'.
//	 * @see tourEasy.Review#getComment()
//	 * @see #getReview()
//	 * @generated
//	 */
//	EAttribute getReview_Comment();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Review#getDate <em>Date</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Date</em>'.
//	 * @see tourEasy.Review#getDate()
//	 * @see #getReview()
//	 * @generated
//	 */
//	EAttribute getReview_Date();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.Notification <em>Notification</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Notification</em>'.
//	 * @see tourEasy.Notification
//	 * @generated
//	 */
//	EClass getNotification();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Notification#getNotificationId <em>Notification Id</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Notification Id</em>'.
//	 * @see tourEasy.Notification#getNotificationId()
//	 * @see #getNotification()
//	 * @generated
//	 */
//	EAttribute getNotification_NotificationId();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Notification#getEmail <em>Email</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Email</em>'.
//	 * @see tourEasy.Notification#getEmail()
//	 * @see #getNotification()
//	 * @generated
//	 */
//	EAttribute getNotification_Email();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Notification#getMessage <em>Message</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Message</em>'.
//	 * @see tourEasy.Notification#getMessage()
//	 * @see #getNotification()
//	 * @generated
//	 */
//	EAttribute getNotification_Message();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Notification#getStatus <em>Status</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Status</em>'.
//	 * @see tourEasy.Notification#getStatus()
//	 * @see #getNotification()
//	 * @generated
//	 */
//	EAttribute getNotification_Status();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Notification#getDate <em>Date</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Date</em>'.
//	 * @see tourEasy.Notification#getDate()
//	 * @see #getNotification()
//	 * @generated
//	 */
//	EAttribute getNotification_Date();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.Promotion <em>Promotion</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Promotion</em>'.
//	 * @see tourEasy.Promotion
//	 * @generated
//	 */
//	EClass getPromotion();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Promotion#getPromotionId <em>Promotion Id</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Promotion Id</em>'.
//	 * @see tourEasy.Promotion#getPromotionId()
//	 * @see #getPromotion()
//	 * @generated
//	 */
//	EAttribute getPromotion_PromotionId();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Promotion#getTourId <em>Tour Id</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Tour Id</em>'.
//	 * @see tourEasy.Promotion#getTourId()
//	 * @see #getPromotion()
//	 * @generated
//	 */
//	EAttribute getPromotion_TourId();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Promotion#getDiscountPercentage <em>Discount Percentage</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Discount Percentage</em>'.
//	 * @see tourEasy.Promotion#getDiscountPercentage()
//	 * @see #getPromotion()
//	 * @generated
//	 */
//	EAttribute getPromotion_DiscountPercentage();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Promotion#getStartDate <em>Start Date</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Start Date</em>'.
//	 * @see tourEasy.Promotion#getStartDate()
//	 * @see #getPromotion()
//	 * @generated
//	 */
//	EAttribute getPromotion_StartDate();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Promotion#getEndDate <em>End Date</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>End Date</em>'.
//	 * @see tourEasy.Promotion#getEndDate()
//	 * @see #getPromotion()
//	 * @generated
//	 */
//	EAttribute getPromotion_EndDate();
//
//	/**
//	 * Returns the meta object for class '{@link tourEasy.Admin <em>Admin</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for class '<em>Admin</em>'.
//	 * @see tourEasy.Admin
//	 * @generated
//	 */
//	EClass getAdmin();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Admin#getDepartment <em>Department</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Department</em>'.
//	 * @see tourEasy.Admin#getDepartment()
//	 * @see #getAdmin()
//	 * @generated
//	 */
//	EAttribute getAdmin_Department();
//
//	/**
//	 * Returns the meta object for the reference '{@link tourEasy.Admin#getSupervisor <em>Supervisor</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the reference '<em>Supervisor</em>'.
//	 * @see tourEasy.Admin#getSupervisor()
//	 * @see #getAdmin()
//	 * @generated
//	 */
//	EReference getAdmin_Supervisor();
//
//	/**
//	 * Returns the meta object for the attribute '{@link tourEasy.Admin#getSalary <em>Salary</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for the attribute '<em>Salary</em>'.
//	 * @see tourEasy.Admin#getSalary()
//	 * @see #getAdmin()
//	 * @generated
//	 */
//	EAttribute getAdmin_Salary();
//
//	/**
//	 * Returns the factory that creates the instances of the model.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the factory that creates the instances of the model.
//	 * @generated
//	 */
//	TourEasyFactory getTourEasyFactory();
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * Defines literals for the meta objects that represent
//	 * <ul>
//	 *   <li>each class,</li>
//	 *   <li>each feature of each class,</li>
//	 *   <li>each operation of each class,</li>
//	 *   <li>each enum,</li>
//	 *   <li>and each data type</li>
//	 * </ul>
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	interface Literals {
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.BookingImpl <em>Booking</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.BookingImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getBooking()
//		 * @generated
//		 */
//		EClass BOOKING = eINSTANCE.getBooking();
//
//		/**
//		 * The meta object literal for the '<em><b>Booking Id</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute BOOKING__BOOKING_ID = eINSTANCE.getBooking_BookingId();
//
//		/**
//		 * The meta object literal for the '<em><b>Tour Id</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute BOOKING__TOUR_ID = eINSTANCE.getBooking_TourId();
//
//		/**
//		 * The meta object literal for the '<em><b>Customer Id</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute BOOKING__CUSTOMER_ID = eINSTANCE.getBooking_CustomerId();
//
//		/**
//		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute BOOKING__DATE = eINSTANCE.getBooking_Date();
//
//		/**
//		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute BOOKING__STATUS = eINSTANCE.getBooking_Status();
//
//		/**
//		 * The meta object literal for the '<em><b>Payment Status</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute BOOKING__PAYMENT_STATUS = eINSTANCE.getBooking_PaymentStatus();
//
//		/**
//		 * The meta object literal for the '<em><b>Payment Inf</b></em>' reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference BOOKING__PAYMENT_INF = eINSTANCE.getBooking_PaymentInf();
//
//		/**
//		 * The meta object literal for the '<em><b>Special Request</b></em>' reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference BOOKING__SPECIAL_REQUEST = eINSTANCE.getBooking_SpecialRequest();
//
//		/**
//		 * The meta object literal for the '<em><b>Booking</b></em>' containment reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference BOOKING__BOOKING = eINSTANCE.getBooking_Booking();
//
//		/**
//		 * The meta object literal for the '<em><b>Paymentinfo</b></em>' reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference BOOKING__PAYMENTINFO = eINSTANCE.getBooking_Paymentinfo();
//
//		/**
//		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference BOOKING__CUSTOMER = eINSTANCE.getBooking_Customer();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.PaymentInfoImpl <em>Payment Info</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.PaymentInfoImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getPaymentInfo()
//		 * @generated
//		 */
//		EClass PAYMENT_INFO = eINSTANCE.getPaymentInfo();
//
//		/**
//		 * The meta object literal for the '<em><b>Billing Name</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute PAYMENT_INFO__BILLING_NAME = eINSTANCE.getPaymentInfo_BillingName();
//
//		/**
//		 * The meta object literal for the '<em><b>Billing Address</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute PAYMENT_INFO__BILLING_ADDRESS = eINSTANCE.getPaymentInfo_BillingAddress();
//
//		/**
//		 * The meta object literal for the '<em><b>Preferred Mode Of Payment</b></em>' reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference PAYMENT_INFO__PREFERRED_MODE_OF_PAYMENT = eINSTANCE.getPaymentInfo_PreferredModeOfPayment();
//
//		/**
//		 * The meta object literal for the '<em><b>Wallet Details</b></em>' reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference PAYMENT_INFO__WALLET_DETAILS = eINSTANCE.getPaymentInfo_WalletDetails();
//
//		/**
//		 * The meta object literal for the '<em><b>Card Details</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute PAYMENT_INFO__CARD_DETAILS = eINSTANCE.getPaymentInfo_CardDetails();
//
//		/**
//		 * The meta object literal for the '<em><b>Wallet</b></em>' reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference PAYMENT_INFO__WALLET = eINSTANCE.getPaymentInfo_Wallet();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.PaymentModeImpl <em>Payment Mode</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.PaymentModeImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getPaymentMode()
//		 * @generated
//		 */
//		EClass PAYMENT_MODE = eINSTANCE.getPaymentMode();
//
//		/**
//		 * The meta object literal for the '<em><b>Payment Mode</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute PAYMENT_MODE__PAYMENT_MODE = eINSTANCE.getPaymentMode_PaymentMode();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.WalletImpl <em>Wallet</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.WalletImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getWallet()
//		 * @generated
//		 */
//		EClass WALLET = eINSTANCE.getWallet();
//
//		/**
//		 * The meta object literal for the '<em><b>Wallet Id</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute WALLET__WALLET_ID = eINSTANCE.getWallet_WalletId();
//
//		/**
//		 * The meta object literal for the '<em><b>Wallet Balance</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute WALLET__WALLET_BALANCE = eINSTANCE.getWallet_WalletBalance();
//
//		/**
//		 * The meta object literal for the '<em><b>Top Up</b></em>' operation.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EOperation WALLET___TOP_UP__DOUBLE = eINSTANCE.getWallet__TopUp__double();
//
//		/**
//		 * The meta object literal for the '<em><b>Withdraw</b></em>' operation.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EOperation WALLET___WITHDRAW__DOUBLE = eINSTANCE.getWallet__Withdraw__double();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.SpecialRequestImpl <em>Special Request</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.SpecialRequestImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getSpecialRequest()
//		 * @generated
//		 */
//		EClass SPECIAL_REQUEST = eINSTANCE.getSpecialRequest();
//
//		/**
//		 * The meta object literal for the '<em><b>Is Approved</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute SPECIAL_REQUEST__IS_APPROVED = eINSTANCE.getSpecialRequest_IsApproved();
//
//		/**
//		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute SPECIAL_REQUEST__DESCRIPTION = eINSTANCE.getSpecialRequest_Description();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.CustomerImpl <em>Customer</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.CustomerImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getCustomer()
//		 * @generated
//		 */
//		EClass CUSTOMER = eINSTANCE.getCustomer();
//
//		/**
//		 * The meta object literal for the '<em><b>Personal Address</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute CUSTOMER__PERSONAL_ADDRESS = eINSTANCE.getCustomer_PersonalAddress();
//
//		/**
//		 * The meta object literal for the '<em><b>Payment Inf</b></em>' reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference CUSTOMER__PAYMENT_INF = eINSTANCE.getCustomer_PaymentInf();
//
//		/**
//		 * The meta object literal for the '<em><b>Paymentinfo</b></em>' containment reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference CUSTOMER__PAYMENTINFO = eINSTANCE.getCustomer_Paymentinfo();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.UserImpl <em>User</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.UserImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getUser()
//		 * @generated
//		 */
//		EClass USER = eINSTANCE.getUser();
//
//		/**
//		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();
//
//		/**
//		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference USER__ROLE = eINSTANCE.getUser_Role();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.PersonImpl <em>Person</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.PersonImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getPerson()
//		 * @generated
//		 */
//		EClass PERSON = eINSTANCE.getPerson();
//
//		/**
//		 * The meta object literal for the '<em><b>Knownlanguages</b></em>' reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference PERSON__KNOWNLANGUAGES = eINSTANCE.getPerson_Knownlanguages();
//
//		/**
//		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();
//
//		/**
//		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();
//
//		/**
//		 * The meta object literal for the '<em><b>Dob</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute PERSON__DOB = eINSTANCE.getPerson_Dob();
//
//		/**
//		 * The meta object literal for the '<em><b>Contact No</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute PERSON__CONTACT_NO = eINSTANCE.getPerson_ContactNo();
//
//		/**
//		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.KnownLanguagesImpl <em>Known Languages</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.KnownLanguagesImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getKnownLanguages()
//		 * @generated
//		 */
//		EClass KNOWN_LANGUAGES = eINSTANCE.getKnownLanguages();
//
//		/**
//		 * The meta object literal for the '<em><b>Known Languages</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute KNOWN_LANGUAGES__KNOWN_LANGUAGES = eINSTANCE.getKnownLanguages_KnownLanguages();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.RoleImpl <em>Role</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.RoleImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getRole()
//		 * @generated
//		 */
//		EClass ROLE = eINSTANCE.getRole();
//
//		/**
//		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute ROLE__ROLE = eINSTANCE.getRole_Role();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.HotelImpl <em>Hotel</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.HotelImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getHotel()
//		 * @generated
//		 */
//		EClass HOTEL = eINSTANCE.getHotel();
//
//		/**
//		 * The meta object literal for the '<em><b>Hotel Name</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute HOTEL__HOTEL_NAME = eINSTANCE.getHotel_HotelName();
//
//		/**
//		 * The meta object literal for the '<em><b>Hotel Address</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute HOTEL__HOTEL_ADDRESS = eINSTANCE.getHotel_HotelAddress();
//
//		/**
//		 * The meta object literal for the '<em><b>Manager</b></em>' reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference HOTEL__MANAGER = eINSTANCE.getHotel_Manager();
//
//		/**
//		 * The meta object literal for the '<em><b>City Name</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute HOTEL__CITY_NAME = eINSTANCE.getHotel_CityName();
//
//		/**
//		 * The meta object literal for the '<em><b>Number Of Available Rooms</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute HOTEL__NUMBER_OF_AVAILABLE_ROOMS = eINSTANCE.getHotel_NumberOfAvailableRooms();
//
//		/**
//		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute HOTEL__PRICE = eINSTANCE.getHotel_Price();
//
//		/**
//		 * The meta object literal for the '<em><b>Hotel Id</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute HOTEL__HOTEL_ID = eINSTANCE.getHotel_HotelId();
//
//		/**
//		 * The meta object literal for the '<em><b>Person</b></em>' containment reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference HOTEL__PERSON = eINSTANCE.getHotel_Person();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.RatingImpl <em>Rating</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.RatingImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getRating()
//		 * @generated
//		 */
//		EClass RATING = eINSTANCE.getRating();
//
//		/**
//		 * The meta object literal for the '<em><b>Rating Id</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute RATING__RATING_ID = eINSTANCE.getRating_RatingId();
//
//		/**
//		 * The meta object literal for the '<em><b>Tour Id</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute RATING__TOUR_ID = eINSTANCE.getRating_TourId();
//
//		/**
//		 * The meta object literal for the '<em><b>Stars</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute RATING__STARS = eINSTANCE.getRating_Stars();
//
//		/**
//		 * The meta object literal for the '<em><b>Guide Id</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute RATING__GUIDE_ID = eINSTANCE.getRating_GuideId();
//
//		/**
//		 * The meta object literal for the '<em><b>Customer Id</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute RATING__CUSTOMER_ID = eINSTANCE.getRating_CustomerId();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.TourImpl <em>Tour</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.TourImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getTour()
//		 * @generated
//		 */
//		EClass TOUR = eINSTANCE.getTour();
//
//		/**
//		 * The meta object literal for the '<em><b>Tour Id</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute TOUR__TOUR_ID = eINSTANCE.getTour_TourId();
//
//		/**
//		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference TOUR__DESTINATION = eINSTANCE.getTour_Destination();
//
//		/**
//		 * The meta object literal for the '<em><b>Number Of Nights</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute TOUR__NUMBER_OF_NIGHTS = eINSTANCE.getTour_NumberOfNights();
//
//		/**
//		 * The meta object literal for the '<em><b>Hotel</b></em>' reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference TOUR__HOTEL = eINSTANCE.getTour_Hotel();
//
//		/**
//		 * The meta object literal for the '<em><b>In City Mode Of Transport</b></em>' reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference TOUR__IN_CITY_MODE_OF_TRANSPORT = eINSTANCE.getTour_InCityModeOfTransport();
//
//		/**
//		 * The meta object literal for the '<em><b>Guide</b></em>' reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference TOUR__GUIDE = eINSTANCE.getTour_Guide();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.DestinationImpl <em>Destination</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.DestinationImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getDestination()
//		 * @generated
//		 */
//		EClass DESTINATION = eINSTANCE.getDestination();
//
//		/**
//		 * The meta object literal for the '<em><b>Destination Id</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute DESTINATION__DESTINATION_ID = eINSTANCE.getDestination_DestinationId();
//
//		/**
//		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute DESTINATION__NAME = eINSTANCE.getDestination_Name();
//
//		/**
//		 * The meta object literal for the '<em><b>Attractions</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute DESTINATION__ATTRACTIONS = eINSTANCE.getDestination_Attractions();
//
//		/**
//		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute DESTINATION__DESCRIPTION = eINSTANCE.getDestination_Description();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.ModeOfTransportImpl <em>Mode Of Transport</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.ModeOfTransportImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getModeOfTransport()
//		 * @generated
//		 */
//		EClass MODE_OF_TRANSPORT = eINSTANCE.getModeOfTransport();
//
//		/**
//		 * The meta object literal for the '<em><b>Mode Of Transport</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute MODE_OF_TRANSPORT__MODE_OF_TRANSPORT = eINSTANCE.getModeOfTransport_ModeOfTransport();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.GuideImpl <em>Guide</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.GuideImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getGuide()
//		 * @generated
//		 */
//		EClass GUIDE = eINSTANCE.getGuide();
//
//		/**
//		 * The meta object literal for the '<em><b>Guide Charges</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute GUIDE__GUIDE_CHARGES = eINSTANCE.getGuide_GuideCharges();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.ReviewImpl <em>Review</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.ReviewImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getReview()
//		 * @generated
//		 */
//		EClass REVIEW = eINSTANCE.getReview();
//
//		/**
//		 * The meta object literal for the '<em><b>Review Id</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute REVIEW__REVIEW_ID = eINSTANCE.getReview_ReviewId();
//
//		/**
//		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute REVIEW__COMMENT = eINSTANCE.getReview_Comment();
//
//		/**
//		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute REVIEW__DATE = eINSTANCE.getReview_Date();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.NotificationImpl <em>Notification</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.NotificationImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getNotification()
//		 * @generated
//		 */
//		EClass NOTIFICATION = eINSTANCE.getNotification();
//
//		/**
//		 * The meta object literal for the '<em><b>Notification Id</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute NOTIFICATION__NOTIFICATION_ID = eINSTANCE.getNotification_NotificationId();
//
//		/**
//		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute NOTIFICATION__EMAIL = eINSTANCE.getNotification_Email();
//
//		/**
//		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute NOTIFICATION__MESSAGE = eINSTANCE.getNotification_Message();
//
//		/**
//		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute NOTIFICATION__STATUS = eINSTANCE.getNotification_Status();
//
//		/**
//		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute NOTIFICATION__DATE = eINSTANCE.getNotification_Date();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.PromotionImpl <em>Promotion</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.PromotionImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getPromotion()
//		 * @generated
//		 */
//		EClass PROMOTION = eINSTANCE.getPromotion();
//
//		/**
//		 * The meta object literal for the '<em><b>Promotion Id</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute PROMOTION__PROMOTION_ID = eINSTANCE.getPromotion_PromotionId();
//
//		/**
//		 * The meta object literal for the '<em><b>Tour Id</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute PROMOTION__TOUR_ID = eINSTANCE.getPromotion_TourId();
//
//		/**
//		 * The meta object literal for the '<em><b>Discount Percentage</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute PROMOTION__DISCOUNT_PERCENTAGE = eINSTANCE.getPromotion_DiscountPercentage();
//
//		/**
//		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute PROMOTION__START_DATE = eINSTANCE.getPromotion_StartDate();
//
//		/**
//		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute PROMOTION__END_DATE = eINSTANCE.getPromotion_EndDate();
//
//		/**
//		 * The meta object literal for the '{@link tourEasy.impl.AdminImpl <em>Admin</em>}' class.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see tourEasy.impl.AdminImpl
//		 * @see tourEasy.impl.TourEasyPackageImpl#getAdmin()
//		 * @generated
//		 */
//		EClass ADMIN = eINSTANCE.getAdmin();
//
//		/**
//		 * The meta object literal for the '<em><b>Department</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute ADMIN__DEPARTMENT = eINSTANCE.getAdmin_Department();
//
//		/**
//		 * The meta object literal for the '<em><b>Supervisor</b></em>' reference feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EReference ADMIN__SUPERVISOR = eINSTANCE.getAdmin_Supervisor();
//
//		/**
//		 * The meta object literal for the '<em><b>Salary</b></em>' attribute feature.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @generated
//		 */
//		EAttribute ADMIN__SALARY = eINSTANCE.getAdmin_Salary();
//
//	}
//
//} //TourEasyPackage
