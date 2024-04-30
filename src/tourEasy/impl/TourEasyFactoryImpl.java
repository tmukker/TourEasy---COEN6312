///**
// */
//package tourEasy.impl;
//
//import org.eclipse.emf.ecore.EClass;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.EPackage;
//import org.eclipse.emf.ecore.impl.EFactoryImpl;
//import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
//import tourEasy.TourEasyFactory;
//import tourEasy.TourEasyPackage;
//import tourEasy.User;
//import tourEasy.Wallet;
//
///**
// * <!-- begin-user-doc -->
// * An implementation of the model <b>Factory</b>.
// * <!-- end-user-doc -->
// * @generated
// */
//public class TourEasyFactoryImpl extends EFactoryImpl implements TourEasyFactory {
//	/**
//	 * Creates the default factory implementation.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public static TourEasyFactory init() {
//		try {
//			TourEasyFactory theTourEasyFactory = (TourEasyFactory)EPackage.Registry.INSTANCE.getEFactory(TourEasyPackage.eNS_URI);
//			if (theTourEasyFactory != null) {
//				return theTourEasyFactory;
//			}
//		}
//		catch (Exception exception) {
//			EcorePlugin.INSTANCE.log(exception);
//		}
//		return new TourEasyFactoryImpl();
//	}
//
//	/**
//	 * Creates an instance of the factory.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public TourEasyFactoryImpl() {
//		super();
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EObject create(EClass eClass) {
//		switch (eClass.getClassifierID()) {
//			case TourEasyPackage.BOOKING: return createBooking();
//			case TourEasyPackage.PAYMENT_INFO: return createPaymentInfo();
//			case TourEasyPackage.PAYMENT_MODE: return createPaymentMode();
//			case TourEasyPackage.WALLET: return createWallet();
//			case TourEasyPackage.SPECIAL_REQUEST: return createSpecialRequest();
//			case TourEasyPackage.CUSTOMER: return createCustomer();
//			case TourEasyPackage.USER: return createUser();
//			case TourEasyPackage.PERSON: return createPerson();
//			case TourEasyPackage.KNOWN_LANGUAGES: return createKnownLanguages();
//			case TourEasyPackage.ROLE: return createRole();
//			case TourEasyPackage.HOTEL: return createHotel();
//			case TourEasyPackage.RATING: return createRating();
//			case TourEasyPackage.TOUR: return createTour();
//			case TourEasyPackage.DESTINATION: return createDestination();
//			case TourEasyPackage.MODE_OF_TRANSPORT: return createModeOfTransport();
//			case TourEasyPackage.GUIDE: return createGuide();
//			case TourEasyPackage.REVIEW: return createReview();
//			case TourEasyPackage.NOTIFICATION: return createNotification();
//			case TourEasyPackage.PROMOTION: return createPromotion();
//			case TourEasyPackage.ADMIN: return createAdmin();
//			default:
//				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
//		}
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public Booking createBooking() {
//		BookingImpl booking = new BookingImpl();
//		return booking;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public PaymentInfo createPaymentInfo() {
//		PaymentInfoImpl paymentInfo = new PaymentInfoImpl();
//		return paymentInfo;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public PaymentMode createPaymentMode() {
//		PaymentModeImpl paymentMode = new PaymentModeImpl();
//		return paymentMode;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public Wallet createWallet() {
//		WalletImpl wallet = new WalletImpl();
//		return wallet;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public SpecialRequest createSpecialRequest() {
//		SpecialRequestImpl specialRequest = new SpecialRequestImpl();
//		return specialRequest;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public Customer createCustomer() {
//		CustomerImpl customer = new CustomerImpl();
//		return customer;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public User createUser() {
//		UserImpl user = new UserImpl();
//		return user;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public Person createPerson() {
//		PersonImpl person = new PersonImpl();
//		return person;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public KnownLanguages createKnownLanguages() {
//		KnownLanguagesImpl knownLanguages = new KnownLanguagesImpl();
//		return knownLanguages;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public Role createRole() {
//		RoleImpl role = new RoleImpl();
//		return role;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public Hotel createHotel() {
//		HotelImpl hotel = new HotelImpl();
//		return hotel;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public Rating createRating() {
//		RatingImpl rating = new RatingImpl();
//		return rating;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public Tour createTour() {
//		TourImpl tour = new TourImpl();
//		return tour;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public Destination createDestination() {
//		DestinationImpl destination = new DestinationImpl();
//		return destination;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public ModeOfTransport createModeOfTransport() {
//		ModeOfTransportImpl modeOfTransport = new ModeOfTransportImpl();
//		return modeOfTransport;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public Guide createGuide() {
//		GuideImpl guide = new GuideImpl();
//		return guide;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public Review createReview() {
//		ReviewImpl review = new ReviewImpl();
//		return review;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public Notification createNotification() {
//		NotificationImpl notification = new NotificationImpl();
//		return notification;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public Promotion createPromotion() {
//		PromotionImpl promotion = new PromotionImpl();
//		return promotion;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public Admin createAdmin() {
//		AdminImpl admin = new AdminImpl();
//		return admin;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public TourEasyPackage getTourEasyPackage() {
//		return (TourEasyPackage)getEPackage();
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @deprecated
//	 * @generated
//	 */
//	@Deprecated
//	public static TourEasyPackage getPackage() {
//		return TourEasyPackage.eINSTANCE;
//	}
//
//} //TourEasyFactoryImpl
