///**
// */
//package tourEasy.util;
//
//import org.eclipse.emf.common.notify.Adapter;
//import org.eclipse.emf.common.notify.Notifier;
//import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
//import org.eclipse.emf.ecore.EObject;
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
// * The <b>Adapter Factory</b> for the model.
// * It provides an adapter <code>createXXX</code> method for each class of the model.
// * <!-- end-user-doc -->
// * @see tourEasy.TourEasyPackage
// * @generated
// */
//public class TourEasyAdapterFactory extends AdapterFactoryImpl {
//	/**
//	 * The cached model package.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	protected static TourEasyPackage modelPackage;
//
//	/**
//	 * Creates an instance of the adapter factory.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public TourEasyAdapterFactory() {
//		if (modelPackage == null) {
//			modelPackage = TourEasyPackage.eINSTANCE;
//		}
//	}
//
//	/**
//	 * Returns whether this factory is applicable for the type of the object.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
//	 * <!-- end-user-doc -->
//	 * @return whether this factory is applicable for the type of the object.
//	 * @generated
//	 */
//	@Override
//	public boolean isFactoryForType(Object object) {
//		if (object == modelPackage) {
//			return true;
//		}
//		if (object instanceof EObject) {
//			return ((EObject)object).eClass().getEPackage() == modelPackage;
//		}
//		return false;
//	}
//
//	/**
//	 * The switch that delegates to the <code>createXXX</code> methods.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	protected TourEasySwitch<Adapter> modelSwitch =
//		new TourEasySwitch<Adapter>() {
//			@Override
//			public Adapter caseBooking(Booking object) {
//				return createBookingAdapter();
//			}
//			@Override
//			public Adapter casePaymentInfo(PaymentInfo object) {
//				return createPaymentInfoAdapter();
//			}
//			@Override
//			public Adapter casePaymentMode(PaymentMode object) {
//				return createPaymentModeAdapter();
//			}
//			@Override
//			public Adapter caseWallet(Wallet object) {
//				return createWalletAdapter();
//			}
//			@Override
//			public Adapter caseSpecialRequest(SpecialRequest object) {
//				return createSpecialRequestAdapter();
//			}
//			@Override
//			public Adapter caseCustomer(Customer object) {
//				return createCustomerAdapter();
//			}
//			@Override
//			public Adapter caseUser(User object) {
//				return createUserAdapter();
//			}
//			@Override
//			public Adapter casePerson(Person object) {
//				return createPersonAdapter();
//			}
//			@Override
//			public Adapter caseKnownLanguages(KnownLanguages object) {
//				return createKnownLanguagesAdapter();
//			}
//			@Override
//			public Adapter caseRole(Role object) {
//				return createRoleAdapter();
//			}
//			@Override
//			public Adapter caseHotel(Hotel object) {
//				return createHotelAdapter();
//			}
//			@Override
//			public Adapter caseRating(Rating object) {
//				return createRatingAdapter();
//			}
//			@Override
//			public Adapter caseTour(Tour object) {
//				return createTourAdapter();
//			}
//			@Override
//			public Adapter caseDestination(Destination object) {
//				return createDestinationAdapter();
//			}
//			@Override
//			public Adapter caseModeOfTransport(ModeOfTransport object) {
//				return createModeOfTransportAdapter();
//			}
//			@Override
//			public Adapter caseGuide(Guide object) {
//				return createGuideAdapter();
//			}
//			@Override
//			public Adapter caseReview(Review object) {
//				return createReviewAdapter();
//			}
//			@Override
//			public Adapter caseNotification(Notification object) {
//				return createNotificationAdapter();
//			}
//			@Override
//			public Adapter casePromotion(Promotion object) {
//				return createPromotionAdapter();
//			}
//			@Override
//			public Adapter caseAdmin(Admin object) {
//				return createAdminAdapter();
//			}
//			@Override
//			public Adapter defaultCase(EObject object) {
//				return createEObjectAdapter();
//			}
//		};
//
//	/**
//	 * Creates an adapter for the <code>target</code>.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @param target the object to adapt.
//	 * @return the adapter for the <code>target</code>.
//	 * @generated
//	 */
//	@Override
//	public Adapter createAdapter(Notifier target) {
//		return modelSwitch.doSwitch((EObject)target);
//	}
//
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.Booking <em>Booking</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.Booking
//	 * @generated
//	 */
//	public Adapter createBookingAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.PaymentInfo <em>Payment Info</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.PaymentInfo
//	 * @generated
//	 */
//	public Adapter createPaymentInfoAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.PaymentMode <em>Payment Mode</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.PaymentMode
//	 * @generated
//	 */
//	public Adapter createPaymentModeAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.Wallet <em>Wallet</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.Wallet
//	 * @generated
//	 */
//	public Adapter createWalletAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.SpecialRequest <em>Special Request</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.SpecialRequest
//	 * @generated
//	 */
//	public Adapter createSpecialRequestAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.Customer <em>Customer</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.Customer
//	 * @generated
//	 */
//	public Adapter createCustomerAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.User <em>User</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.User
//	 * @generated
//	 */
//	public Adapter createUserAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.Person <em>Person</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.Person
//	 * @generated
//	 */
//	public Adapter createPersonAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.KnownLanguages <em>Known Languages</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.KnownLanguages
//	 * @generated
//	 */
//	public Adapter createKnownLanguagesAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.Role <em>Role</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.Role
//	 * @generated
//	 */
//	public Adapter createRoleAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.Hotel <em>Hotel</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.Hotel
//	 * @generated
//	 */
//	public Adapter createHotelAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.Rating <em>Rating</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.Rating
//	 * @generated
//	 */
//	public Adapter createRatingAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.Tour <em>Tour</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.Tour
//	 * @generated
//	 */
//	public Adapter createTourAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.Destination <em>Destination</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.Destination
//	 * @generated
//	 */
//	public Adapter createDestinationAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.ModeOfTransport <em>Mode Of Transport</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.ModeOfTransport
//	 * @generated
//	 */
//	public Adapter createModeOfTransportAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.Guide <em>Guide</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.Guide
//	 * @generated
//	 */
//	public Adapter createGuideAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.Review <em>Review</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.Review
//	 * @generated
//	 */
//	public Adapter createReviewAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.Notification <em>Notification</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.Notification
//	 * @generated
//	 */
//	public Adapter createNotificationAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.Promotion <em>Promotion</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.Promotion
//	 * @generated
//	 */
//	public Adapter createPromotionAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for an object of class '{@link tourEasy.Admin <em>Admin</em>}'.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null so that we can easily ignore cases;
//	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @see tourEasy.Admin
//	 * @generated
//	 */
//	public Adapter createAdminAdapter() {
//		return null;
//	}
//
//	/**
//	 * Creates a new adapter for the default case.
//	 * <!-- begin-user-doc -->
//	 * This default implementation returns null.
//	 * <!-- end-user-doc -->
//	 * @return the new adapter.
//	 * @generated
//	 */
//	public Adapter createEObjectAdapter() {
//		return null;
//	}
//
//} //TourEasyAdapterFactory
