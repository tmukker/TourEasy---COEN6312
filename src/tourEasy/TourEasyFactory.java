///**
// */
//package tourEasy;
//
//import org.eclipse.emf.ecore.EFactory;
//
///**
// * <!-- begin-user-doc -->
// * The <b>Factory</b> for the model.
// * It provides a create method for each non-abstract class of the model.
// * <!-- end-user-doc -->
// * @see tourEasy.TourEasyPackage
// * @generated
// */
//public interface TourEasyFactory extends EFactory {
//	/**
//	 * The singleton instance of the factory.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	TourEasyFactory eINSTANCE = tourEasy.impl.TourEasyFactoryImpl.init();
//
//	/**
//	 * Returns a new object of class '<em>Booking</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Booking</em>'.
//	 * @generated
//	 */
//	Booking createBooking();
//
//	/**
//	 * Returns a new object of class '<em>Payment Info</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Payment Info</em>'.
//	 * @generated
//	 */
//	PaymentInfo createPaymentInfo();
//
//	/**
//	 * Returns a new object of class '<em>Payment Mode</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Payment Mode</em>'.
//	 * @generated
//	 */
//	PaymentMode createPaymentMode();
//
//	/**
//	 * Returns a new object of class '<em>Wallet</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Wallet</em>'.
//	 * @generated
//	 */
//	Wallet createWallet();
//
//	/**
//	 * Returns a new object of class '<em>Special Request</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Special Request</em>'.
//	 * @generated
//	 */
//	SpecialRequest createSpecialRequest();
//
//	/**
//	 * Returns a new object of class '<em>Customer</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Customer</em>'.
//	 * @generated
//	 */
//	Customer createCustomer();
//
//	/**
//	 * Returns a new object of class '<em>User</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>User</em>'.
//	 * @generated
//	 */
//	User createUser();
//
//	/**
//	 * Returns a new object of class '<em>Person</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Person</em>'.
//	 * @generated
//	 */
//	Person createPerson();
//
//	/**
//	 * Returns a new object of class '<em>Known Languages</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Known Languages</em>'.
//	 * @generated
//	 */
//	KnownLanguages createKnownLanguages();
//
//	/**
//	 * Returns a new object of class '<em>Role</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Role</em>'.
//	 * @generated
//	 */
//	Role createRole();
//
//	/**
//	 * Returns a new object of class '<em>Hotel</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Hotel</em>'.
//	 * @generated
//	 */
//	Hotel createHotel();
//
//	/**
//	 * Returns a new object of class '<em>Rating</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Rating</em>'.
//	 * @generated
//	 */
//	Rating createRating();
//
//	/**
//	 * Returns a new object of class '<em>Tour</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Tour</em>'.
//	 * @generated
//	 */
//	Tour createTour();
//
//	/**
//	 * Returns a new object of class '<em>Destination</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Destination</em>'.
//	 * @generated
//	 */
//	Destination createDestination();
//
//	/**
//	 * Returns a new object of class '<em>Mode Of Transport</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Mode Of Transport</em>'.
//	 * @generated
//	 */
//	ModeOfTransport createModeOfTransport();
//
//	/**
//	 * Returns a new object of class '<em>Guide</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Guide</em>'.
//	 * @generated
//	 */
//	Guide createGuide();
//
//	/**
//	 * Returns a new object of class '<em>Review</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Review</em>'.
//	 * @generated
//	 */
//	Review createReview();
//
//	/**
//	 * Returns a new object of class '<em>Notification</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Notification</em>'.
//	 * @generated
//	 */
//	Notification createNotification();
//
//	/**
//	 * Returns a new object of class '<em>Promotion</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Promotion</em>'.
//	 * @generated
//	 */
//	Promotion createPromotion();
//
//	/**
//	 * Returns a new object of class '<em>Admin</em>'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return a new object of class '<em>Admin</em>'.
//	 * @generated
//	 */
//	Admin createAdmin();
//
//	/**
//	 * Returns the package supported by this factory.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the package supported by this factory.
//	 * @generated
//	 */
//	TourEasyPackage getTourEasyPackage();
//
//} //TourEasyFactory
