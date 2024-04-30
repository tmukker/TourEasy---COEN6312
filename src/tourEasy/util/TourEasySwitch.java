///**
// */
//package tourEasy.util;
//
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.EPackage;
//import org.eclipse.emf.ecore.util.Switch;
//
//import tourEasy.Admin;
//import tourEasy.Booking;
//import tourEasy.Customer;
//import tourEasy.Destination;
//import tourEasy.Guide;
//import tourEasy.Hotel;
//import tourEasy.KnownLanguages;
//import tourEasy.ModeOfTransport;
//import tourEasy.Notification;
//import tourEasy.PaymentInfo;
//import tourEasy.PaymentMode;
//import tourEasy.Person;
//import tourEasy.Promotion;
//import tourEasy.Rating;
//import tourEasy.Review;
//import tourEasy.Role;
//import tourEasy.SpecialRequest;
//import tourEasy.Tour;
//import tourEasy.TourEasyPackage;
//import tourEasy.User;
//import tourEasy.Wallet;
//
///**
// * <!-- begin-user-doc -->
// * The <b>Switch</b> for the model's inheritance hierarchy.
// * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
// * to invoke the <code>caseXXX</code> method for each class of the model,
// * starting with the actual class of the object
// * and proceeding up the inheritance hierarchy
// * until a non-null result is returned,
// * which is the result of the switch.
// * <!-- end-user-doc -->
// * @see tourEasy.TourEasyPackage
// * @generated
// */
//public class TourEasySwitch<T> extends Switch<T> {
//	/**
//	 * The cached model package
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	protected static TourEasyPackage modelPackage;
//
//	/**
//	 * Creates an instance of the switch.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public TourEasySwitch() {
//		if (modelPackage == null) {
//			modelPackage = TourEasyPackage.eINSTANCE;
//		}
//	}
//
//	/**
//	 * Checks whether this is a switch for the given package.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @param ePackage the package in question.
//	 * @return whether this is a switch for the given package.
//	 * @generated
//	 */
//	@Override
//	protected boolean isSwitchFor(EPackage ePackage) {
//		return ePackage == modelPackage;
//	}
//
//	/**
//	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the first non-null result returned by a <code>caseXXX</code> call.
//	 * @generated
//	 */
//	@Override
//	protected T doSwitch(int classifierID, EObject theEObject) {
//		switch (classifierID) {
//			case TourEasyPackage.BOOKING: {
//				Booking booking = (Booking)theEObject;
//				T result = caseBooking(booking);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.PAYMENT_INFO: {
//				PaymentInfo paymentInfo = (PaymentInfo)theEObject;
//				T result = casePaymentInfo(paymentInfo);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.PAYMENT_MODE: {
//				PaymentMode paymentMode = (PaymentMode)theEObject;
//				T result = casePaymentMode(paymentMode);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.WALLET: {
//				Wallet wallet = (Wallet)theEObject;
//				T result = caseWallet(wallet);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.SPECIAL_REQUEST: {
//				SpecialRequest specialRequest = (SpecialRequest)theEObject;
//				T result = caseSpecialRequest(specialRequest);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.CUSTOMER: {
//				Customer customer = (Customer)theEObject;
//				T result = caseCustomer(customer);
//				if (result == null) result = caseUser(customer);
//				if (result == null) result = casePerson(customer);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.USER: {
//				User user = (User)theEObject;
//				T result = caseUser(user);
//				if (result == null) result = casePerson(user);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.PERSON: {
//				Person person = (Person)theEObject;
//				T result = casePerson(person);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.KNOWN_LANGUAGES: {
//				KnownLanguages knownLanguages = (KnownLanguages)theEObject;
//				T result = caseKnownLanguages(knownLanguages);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.ROLE: {
//				Role role = (Role)theEObject;
//				T result = caseRole(role);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.HOTEL: {
//				Hotel hotel = (Hotel)theEObject;
//				T result = caseHotel(hotel);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.RATING: {
//				Rating rating = (Rating)theEObject;
//				T result = caseRating(rating);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.TOUR: {
//				Tour tour = (Tour)theEObject;
//				T result = caseTour(tour);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.DESTINATION: {
//				Destination destination = (Destination)theEObject;
//				T result = caseDestination(destination);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.MODE_OF_TRANSPORT: {
//				ModeOfTransport modeOfTransport = (ModeOfTransport)theEObject;
//				T result = caseModeOfTransport(modeOfTransport);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.GUIDE: {
//				Guide guide = (Guide)theEObject;
//				T result = caseGuide(guide);
//				if (result == null) result = caseUser(guide);
//				if (result == null) result = casePerson(guide);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.REVIEW: {
//				Review review = (Review)theEObject;
//				T result = caseReview(review);
//				if (result == null) result = caseRating(review);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.NOTIFICATION: {
//				Notification notification = (Notification)theEObject;
//				T result = caseNotification(notification);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.PROMOTION: {
//				Promotion promotion = (Promotion)theEObject;
//				T result = casePromotion(promotion);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			case TourEasyPackage.ADMIN: {
//				Admin admin = (Admin)theEObject;
//				T result = caseAdmin(admin);
//				if (result == null) result = caseUser(admin);
//				if (result == null) result = casePerson(admin);
//				if (result == null) result = defaultCase(theEObject);
//				return result;
//			}
//			default: return defaultCase(theEObject);
//		}
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Booking</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Booking</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T caseBooking(Booking object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Payment Info</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Payment Info</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T casePaymentInfo(PaymentInfo object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Payment Mode</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Payment Mode</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T casePaymentMode(PaymentMode object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Wallet</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Wallet</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T caseWallet(Wallet object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Special Request</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Special Request</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T caseSpecialRequest(SpecialRequest object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Customer</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Customer</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T caseCustomer(Customer object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T caseUser(User object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T casePerson(Person object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Known Languages</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Known Languages</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T caseKnownLanguages(KnownLanguages object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T caseRole(Role object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Hotel</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Hotel</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T caseHotel(Hotel object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Rating</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Rating</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T caseRating(Rating object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Tour</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Tour</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T caseTour(Tour object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Destination</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Destination</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T caseDestination(Destination object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Mode Of Transport</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Mode Of Transport</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T caseModeOfTransport(ModeOfTransport object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Guide</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Guide</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T caseGuide(Guide object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Review</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Review</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T caseReview(Review object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Notification</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Notification</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T caseNotification(Notification object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Promotion</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Promotion</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T casePromotion(Promotion object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Admin</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Admin</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public T caseAdmin(Admin object) {
//		return null;
//	}
//
//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch, but this is the last case anyway.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
//	 * @generated
//	 */
//	@Override
//	public T defaultCase(EObject object) {
//		return null;
//	}
//
//} //TourEasySwitch
