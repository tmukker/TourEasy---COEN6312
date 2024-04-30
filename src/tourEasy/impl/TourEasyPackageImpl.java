///**
// */
//package tourEasy.impl;
//
//import org.eclipse.emf.ecore.EAttribute;
//import org.eclipse.emf.ecore.EClass;
//import org.eclipse.emf.ecore.EOperation;
//import org.eclipse.emf.ecore.EPackage;
//import org.eclipse.emf.ecore.EReference;
//import org.eclipse.emf.ecore.impl.EPackageImpl;
//import org.eclipse.uml2.types.TypesPackage;
//import org.eclipse.uml2.types.impl.TypesPackageImpl;
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
// * An implementation of the model <b>Package</b>.
// * <!-- end-user-doc -->
// * @generated
// */
//public class TourEasyPackageImpl extends EPackageImpl implements TourEasyPackage {
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass bookingEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass paymentInfoEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass paymentModeEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass walletEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass specialRequestEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass customerEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass userEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass personEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass knownLanguagesEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass roleEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass hotelEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass ratingEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass tourEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass destinationEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass modeOfTransportEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass guideEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass reviewEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass notificationEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass promotionEClass = null;
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private EClass adminEClass = null;
//
//	/**
//	 * Creates an instance of the model <b>Package</b>, registered with
//	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
//	 * package URI value.
//	 * <p>Note: the correct way to create the package is via the static
//	 * factory method {@link #init init()}, which also performs
//	 * initialization of the package, or returns the registered package,
//	 * if one already exists.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see org.eclipse.emf.ecore.EPackage.Registry
//	 * @see tourEasy.TourEasyPackage#eNS_URI
//	 * @see #init()
//	 * @generated
//	 */
//	private TourEasyPackageImpl() {
//		super(eNS_URI, TourEasyFactory.eINSTANCE);
//	}
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private static boolean isInited = false;
//
//	/**
//	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
//	 *
//	 * <p>This method is used to initialize {@link TourEasyPackage#eINSTANCE} when that field is accessed.
//	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see #eNS_URI
//	 * @see #createPackageContents()
//	 * @see #initializePackageContents()
//	 * @generated
//	 */
//	public static TourEasyPackage init() {
//		if (isInited) return (TourEasyPackage)EPackage.Registry.INSTANCE.getEPackage(TourEasyPackage.eNS_URI);
//
//		// Obtain or create and register package
//		Object registeredTourEasyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
//		TourEasyPackageImpl theTourEasyPackage = registeredTourEasyPackage instanceof TourEasyPackageImpl ? (TourEasyPackageImpl)registeredTourEasyPackage : new TourEasyPackageImpl();
//
//		isInited = true;
//
//		// Obtain or create and register interdependencies
//		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
//		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(registeredPackage instanceof TypesPackageImpl ? registeredPackage : TypesPackage.eINSTANCE);
//
//		// Create package meta-data objects
//		theTourEasyPackage.createPackageContents();
//		theTypesPackage.createPackageContents();
//
//		// Initialize created meta-data
//		theTourEasyPackage.initializePackageContents();
//		theTypesPackage.initializePackageContents();
//
//		// Mark meta-data to indicate it can't be changed
//		theTourEasyPackage.freeze();
//
//		// Update the registry and return the package
//		EPackage.Registry.INSTANCE.put(TourEasyPackage.eNS_URI, theTourEasyPackage);
//		return theTourEasyPackage;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getBooking() {
//		return bookingEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getBooking_BookingId() {
//		return (EAttribute)bookingEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getBooking_TourId() {
//		return (EAttribute)bookingEClass.getEStructuralFeatures().get(1);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getBooking_CustomerId() {
//		return (EAttribute)bookingEClass.getEStructuralFeatures().get(2);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getBooking_Date() {
//		return (EAttribute)bookingEClass.getEStructuralFeatures().get(3);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getBooking_Status() {
//		return (EAttribute)bookingEClass.getEStructuralFeatures().get(4);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getBooking_PaymentStatus() {
//		return (EAttribute)bookingEClass.getEStructuralFeatures().get(5);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getBooking_PaymentInf() {
//		return (EReference)bookingEClass.getEStructuralFeatures().get(6);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getBooking_SpecialRequest() {
//		return (EReference)bookingEClass.getEStructuralFeatures().get(7);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getBooking_Booking() {
//		return (EReference)bookingEClass.getEStructuralFeatures().get(8);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getBooking_Paymentinfo() {
//		return (EReference)bookingEClass.getEStructuralFeatures().get(9);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getBooking_Customer() {
//		return (EReference)bookingEClass.getEStructuralFeatures().get(10);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getPaymentInfo() {
//		return paymentInfoEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getPaymentInfo_BillingName() {
//		return (EAttribute)paymentInfoEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getPaymentInfo_BillingAddress() {
//		return (EAttribute)paymentInfoEClass.getEStructuralFeatures().get(1);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getPaymentInfo_PreferredModeOfPayment() {
//		return (EReference)paymentInfoEClass.getEStructuralFeatures().get(2);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getPaymentInfo_WalletDetails() {
//		return (EReference)paymentInfoEClass.getEStructuralFeatures().get(3);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getPaymentInfo_CardDetails() {
//		return (EAttribute)paymentInfoEClass.getEStructuralFeatures().get(4);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getPaymentInfo_Wallet() {
//		return (EReference)paymentInfoEClass.getEStructuralFeatures().get(5);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getPaymentMode() {
//		return paymentModeEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getPaymentMode_PaymentMode() {
//		return (EAttribute)paymentModeEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getWallet() {
//		return walletEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getWallet_WalletId() {
//		return (EAttribute)walletEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getWallet_WalletBalance() {
//		return (EAttribute)walletEClass.getEStructuralFeatures().get(1);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EOperation getWallet__TopUp__double() {
//		return walletEClass.getEOperations().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EOperation getWallet__Withdraw__double() {
//		return walletEClass.getEOperations().get(1);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getSpecialRequest() {
//		return specialRequestEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getSpecialRequest_IsApproved() {
//		return (EAttribute)specialRequestEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getSpecialRequest_Description() {
//		return (EAttribute)specialRequestEClass.getEStructuralFeatures().get(1);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getCustomer() {
//		return customerEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getCustomer_PersonalAddress() {
//		return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getCustomer_PaymentInf() {
//		return (EReference)customerEClass.getEStructuralFeatures().get(1);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getCustomer_Paymentinfo() {
//		return (EReference)customerEClass.getEStructuralFeatures().get(2);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getUser() {
//		return userEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getUser_Password() {
//		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getUser_Role() {
//		return (EReference)userEClass.getEStructuralFeatures().get(1);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getPerson() {
//		return personEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getPerson_Knownlanguages() {
//		return (EReference)personEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getPerson_FirstName() {
//		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getPerson_LastName() {
//		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getPerson_Dob() {
//		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getPerson_ContactNo() {
//		return (EAttribute)personEClass.getEStructuralFeatures().get(4);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getPerson_Email() {
//		return (EAttribute)personEClass.getEStructuralFeatures().get(5);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getKnownLanguages() {
//		return knownLanguagesEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getKnownLanguages_KnownLanguages() {
//		return (EAttribute)knownLanguagesEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getRole() {
//		return roleEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getRole_Role() {
//		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getHotel() {
//		return hotelEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getHotel_HotelName() {
//		return (EAttribute)hotelEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getHotel_HotelAddress() {
//		return (EAttribute)hotelEClass.getEStructuralFeatures().get(1);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getHotel_Manager() {
//		return (EReference)hotelEClass.getEStructuralFeatures().get(2);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getHotel_CityName() {
//		return (EAttribute)hotelEClass.getEStructuralFeatures().get(3);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getHotel_NumberOfAvailableRooms() {
//		return (EAttribute)hotelEClass.getEStructuralFeatures().get(4);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getHotel_Price() {
//		return (EAttribute)hotelEClass.getEStructuralFeatures().get(5);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getHotel_HotelId() {
//		return (EAttribute)hotelEClass.getEStructuralFeatures().get(6);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getHotel_Person() {
//		return (EReference)hotelEClass.getEStructuralFeatures().get(7);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getRating() {
//		return ratingEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getRating_RatingId() {
//		return (EAttribute)ratingEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getRating_TourId() {
//		return (EAttribute)ratingEClass.getEStructuralFeatures().get(1);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getRating_Stars() {
//		return (EAttribute)ratingEClass.getEStructuralFeatures().get(2);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getRating_GuideId() {
//		return (EAttribute)ratingEClass.getEStructuralFeatures().get(3);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getRating_CustomerId() {
//		return (EAttribute)ratingEClass.getEStructuralFeatures().get(4);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getTour() {
//		return tourEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getTour_TourId() {
//		return (EAttribute)tourEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getTour_Destination() {
//		return (EReference)tourEClass.getEStructuralFeatures().get(1);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getTour_NumberOfNights() {
//		return (EAttribute)tourEClass.getEStructuralFeatures().get(2);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getTour_Hotel() {
//		return (EReference)tourEClass.getEStructuralFeatures().get(3);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getTour_InCityModeOfTransport() {
//		return (EReference)tourEClass.getEStructuralFeatures().get(4);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getTour_Guide() {
//		return (EReference)tourEClass.getEStructuralFeatures().get(5);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getDestination() {
//		return destinationEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getDestination_DestinationId() {
//		return (EAttribute)destinationEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getDestination_Name() {
//		return (EAttribute)destinationEClass.getEStructuralFeatures().get(1);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getDestination_Attractions() {
//		return (EAttribute)destinationEClass.getEStructuralFeatures().get(2);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getDestination_Description() {
//		return (EAttribute)destinationEClass.getEStructuralFeatures().get(3);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getModeOfTransport() {
//		return modeOfTransportEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getModeOfTransport_ModeOfTransport() {
//		return (EAttribute)modeOfTransportEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getGuide() {
//		return guideEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getGuide_GuideCharges() {
//		return (EAttribute)guideEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getReview() {
//		return reviewEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getReview_ReviewId() {
//		return (EAttribute)reviewEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getReview_Comment() {
//		return (EAttribute)reviewEClass.getEStructuralFeatures().get(1);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getReview_Date() {
//		return (EAttribute)reviewEClass.getEStructuralFeatures().get(2);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getNotification() {
//		return notificationEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getNotification_NotificationId() {
//		return (EAttribute)notificationEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getNotification_Email() {
//		return (EAttribute)notificationEClass.getEStructuralFeatures().get(1);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getNotification_Message() {
//		return (EAttribute)notificationEClass.getEStructuralFeatures().get(2);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getNotification_Status() {
//		return (EAttribute)notificationEClass.getEStructuralFeatures().get(3);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getNotification_Date() {
//		return (EAttribute)notificationEClass.getEStructuralFeatures().get(4);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getPromotion() {
//		return promotionEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getPromotion_PromotionId() {
//		return (EAttribute)promotionEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getPromotion_TourId() {
//		return (EAttribute)promotionEClass.getEStructuralFeatures().get(1);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getPromotion_DiscountPercentage() {
//		return (EAttribute)promotionEClass.getEStructuralFeatures().get(2);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getPromotion_StartDate() {
//		return (EAttribute)promotionEClass.getEStructuralFeatures().get(3);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getPromotion_EndDate() {
//		return (EAttribute)promotionEClass.getEStructuralFeatures().get(4);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EClass getAdmin() {
//		return adminEClass;
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getAdmin_Department() {
//		return (EAttribute)adminEClass.getEStructuralFeatures().get(0);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EReference getAdmin_Supervisor() {
//		return (EReference)adminEClass.getEStructuralFeatures().get(1);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public EAttribute getAdmin_Salary() {
//		return (EAttribute)adminEClass.getEStructuralFeatures().get(2);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public TourEasyFactory getTourEasyFactory() {
//		return (TourEasyFactory)getEFactoryInstance();
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private boolean isCreated = false;
//
//	/**
//	 * Creates the meta-model objects for the package.  This method is
//	 * guarded to have no affect on any invocation but its first.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public void createPackageContents() {
//		if (isCreated) return;
//		isCreated = true;
//
//		// Create classes and their features
//		bookingEClass = createEClass(BOOKING);
//		createEAttribute(bookingEClass, BOOKING__BOOKING_ID);
//		createEAttribute(bookingEClass, BOOKING__TOUR_ID);
//		createEAttribute(bookingEClass, BOOKING__CUSTOMER_ID);
//		createEAttribute(bookingEClass, BOOKING__DATE);
//		createEAttribute(bookingEClass, BOOKING__STATUS);
//		createEAttribute(bookingEClass, BOOKING__PAYMENT_STATUS);
//		createEReference(bookingEClass, BOOKING__PAYMENT_INF);
//		createEReference(bookingEClass, BOOKING__SPECIAL_REQUEST);
//		createEReference(bookingEClass, BOOKING__BOOKING);
//		createEReference(bookingEClass, BOOKING__PAYMENTINFO);
//		createEReference(bookingEClass, BOOKING__CUSTOMER);
//
//		paymentInfoEClass = createEClass(PAYMENT_INFO);
//		createEAttribute(paymentInfoEClass, PAYMENT_INFO__BILLING_NAME);
//		createEAttribute(paymentInfoEClass, PAYMENT_INFO__BILLING_ADDRESS);
//		createEReference(paymentInfoEClass, PAYMENT_INFO__PREFERRED_MODE_OF_PAYMENT);
//		createEReference(paymentInfoEClass, PAYMENT_INFO__WALLET_DETAILS);
//		createEAttribute(paymentInfoEClass, PAYMENT_INFO__CARD_DETAILS);
//		createEReference(paymentInfoEClass, PAYMENT_INFO__WALLET);
//
//		paymentModeEClass = createEClass(PAYMENT_MODE);
//		createEAttribute(paymentModeEClass, PAYMENT_MODE__PAYMENT_MODE);
//
//		walletEClass = createEClass(WALLET);
//		createEAttribute(walletEClass, WALLET__WALLET_ID);
//		createEAttribute(walletEClass, WALLET__WALLET_BALANCE);
//		createEOperation(walletEClass, WALLET___TOP_UP__DOUBLE);
//		createEOperation(walletEClass, WALLET___WITHDRAW__DOUBLE);
//
//		specialRequestEClass = createEClass(SPECIAL_REQUEST);
//		createEAttribute(specialRequestEClass, SPECIAL_REQUEST__IS_APPROVED);
//		createEAttribute(specialRequestEClass, SPECIAL_REQUEST__DESCRIPTION);
//
//		customerEClass = createEClass(CUSTOMER);
//		createEAttribute(customerEClass, CUSTOMER__PERSONAL_ADDRESS);
//		createEReference(customerEClass, CUSTOMER__PAYMENT_INF);
//		createEReference(customerEClass, CUSTOMER__PAYMENTINFO);
//
//		userEClass = createEClass(USER);
//		createEAttribute(userEClass, USER__PASSWORD);
//		createEReference(userEClass, USER__ROLE);
//
//		personEClass = createEClass(PERSON);
//		createEReference(personEClass, PERSON__KNOWNLANGUAGES);
//		createEAttribute(personEClass, PERSON__FIRST_NAME);
//		createEAttribute(personEClass, PERSON__LAST_NAME);
//		createEAttribute(personEClass, PERSON__DOB);
//		createEAttribute(personEClass, PERSON__CONTACT_NO);
//		createEAttribute(personEClass, PERSON__EMAIL);
//
//		knownLanguagesEClass = createEClass(KNOWN_LANGUAGES);
//		createEAttribute(knownLanguagesEClass, KNOWN_LANGUAGES__KNOWN_LANGUAGES);
//
//		roleEClass = createEClass(ROLE);
//		createEAttribute(roleEClass, ROLE__ROLE);
//
//		hotelEClass = createEClass(HOTEL);
//		createEAttribute(hotelEClass, HOTEL__HOTEL_NAME);
//		createEAttribute(hotelEClass, HOTEL__HOTEL_ADDRESS);
//		createEReference(hotelEClass, HOTEL__MANAGER);
//		createEAttribute(hotelEClass, HOTEL__CITY_NAME);
//		createEAttribute(hotelEClass, HOTEL__NUMBER_OF_AVAILABLE_ROOMS);
//		createEAttribute(hotelEClass, HOTEL__PRICE);
//		createEAttribute(hotelEClass, HOTEL__HOTEL_ID);
//		createEReference(hotelEClass, HOTEL__PERSON);
//
//		ratingEClass = createEClass(RATING);
//		createEAttribute(ratingEClass, RATING__RATING_ID);
//		createEAttribute(ratingEClass, RATING__TOUR_ID);
//		createEAttribute(ratingEClass, RATING__STARS);
//		createEAttribute(ratingEClass, RATING__GUIDE_ID);
//		createEAttribute(ratingEClass, RATING__CUSTOMER_ID);
//
//		tourEClass = createEClass(TOUR);
//		createEAttribute(tourEClass, TOUR__TOUR_ID);
//		createEReference(tourEClass, TOUR__DESTINATION);
//		createEAttribute(tourEClass, TOUR__NUMBER_OF_NIGHTS);
//		createEReference(tourEClass, TOUR__HOTEL);
//		createEReference(tourEClass, TOUR__IN_CITY_MODE_OF_TRANSPORT);
//		createEReference(tourEClass, TOUR__GUIDE);
//
//		destinationEClass = createEClass(DESTINATION);
//		createEAttribute(destinationEClass, DESTINATION__DESTINATION_ID);
//		createEAttribute(destinationEClass, DESTINATION__NAME);
//		createEAttribute(destinationEClass, DESTINATION__ATTRACTIONS);
//		createEAttribute(destinationEClass, DESTINATION__DESCRIPTION);
//
//		modeOfTransportEClass = createEClass(MODE_OF_TRANSPORT);
//		createEAttribute(modeOfTransportEClass, MODE_OF_TRANSPORT__MODE_OF_TRANSPORT);
//
//		guideEClass = createEClass(GUIDE);
//		createEAttribute(guideEClass, GUIDE__GUIDE_CHARGES);
//
//		reviewEClass = createEClass(REVIEW);
//		createEAttribute(reviewEClass, REVIEW__REVIEW_ID);
//		createEAttribute(reviewEClass, REVIEW__COMMENT);
//		createEAttribute(reviewEClass, REVIEW__DATE);
//
//		notificationEClass = createEClass(NOTIFICATION);
//		createEAttribute(notificationEClass, NOTIFICATION__NOTIFICATION_ID);
//		createEAttribute(notificationEClass, NOTIFICATION__EMAIL);
//		createEAttribute(notificationEClass, NOTIFICATION__MESSAGE);
//		createEAttribute(notificationEClass, NOTIFICATION__STATUS);
//		createEAttribute(notificationEClass, NOTIFICATION__DATE);
//
//		promotionEClass = createEClass(PROMOTION);
//		createEAttribute(promotionEClass, PROMOTION__PROMOTION_ID);
//		createEAttribute(promotionEClass, PROMOTION__TOUR_ID);
//		createEAttribute(promotionEClass, PROMOTION__DISCOUNT_PERCENTAGE);
//		createEAttribute(promotionEClass, PROMOTION__START_DATE);
//		createEAttribute(promotionEClass, PROMOTION__END_DATE);
//
//		adminEClass = createEClass(ADMIN);
//		createEAttribute(adminEClass, ADMIN__DEPARTMENT);
//		createEReference(adminEClass, ADMIN__SUPERVISOR);
//		createEAttribute(adminEClass, ADMIN__SALARY);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	private boolean isInitialized = false;
//
//	/**
//	 * Complete the initialization of the package and its meta-model.  This
//	 * method is guarded to have no affect on any invocation but its first.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public void initializePackageContents() {
//		if (isInitialized) return;
//		isInitialized = true;
//
//		// Initialize package
//		setName(eNAME);
//		setNsPrefix(eNS_PREFIX);
//		setNsURI(eNS_URI);
//
//		// Obtain other dependent packages
//		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
//
//		// Create type parameters
//
//		// Set bounds for type parameters
//
//		// Add supertypes to classes
//		customerEClass.getESuperTypes().add(this.getUser());
//		userEClass.getESuperTypes().add(this.getPerson());
//		guideEClass.getESuperTypes().add(this.getUser());
//		reviewEClass.getESuperTypes().add(this.getRating());
//		adminEClass.getESuperTypes().add(this.getUser());
//
//		// Initialize classes, features, and operations; add parameters
//		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getBooking_BookingId(), theTypesPackage.getString(), "bookingId", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getBooking_TourId(), theTypesPackage.getString(), "tourId", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getBooking_CustomerId(), theTypesPackage.getString(), "customerId", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getBooking_Date(), theTypesPackage.getString(), "date", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getBooking_Status(), theTypesPackage.getString(), "status", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getBooking_PaymentStatus(), theTypesPackage.getString(), "paymentStatus", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getBooking_PaymentInf(), this.getPaymentInfo(), null, "paymentInf", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getBooking_SpecialRequest(), this.getSpecialRequest(), null, "specialRequest", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getBooking_Booking(), this.getSpecialRequest(), null, "booking", null, 0, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getBooking_Paymentinfo(), this.getPaymentInfo(), null, "paymentinfo", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getBooking_Customer(), this.getCustomer(), null, "customer", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(paymentInfoEClass, PaymentInfo.class, "PaymentInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getPaymentInfo_BillingName(), theTypesPackage.getString(), "billingName", null, 1, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getPaymentInfo_BillingAddress(), theTypesPackage.getString(), "billingAddress", null, 1, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getPaymentInfo_PreferredModeOfPayment(), this.getPaymentMode(), null, "preferredModeOfPayment", null, 1, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getPaymentInfo_WalletDetails(), this.getWallet(), null, "walletDetails", null, 1, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getPaymentInfo_CardDetails(), theTypesPackage.getString(), "cardDetails", null, 1, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getPaymentInfo_Wallet(), this.getWallet(), null, "wallet", null, 0, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(paymentModeEClass, PaymentMode.class, "PaymentMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getPaymentMode_PaymentMode(), theTypesPackage.getString(), "paymentMode", null, 1, 1, PaymentMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(walletEClass, Wallet.class, "Wallet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getWallet_WalletId(), theTypesPackage.getString(), "walletId", null, 1, 1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getWallet_WalletBalance(), theTypesPackage.getReal(), "walletBalance", null, 1, 1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		EOperation op = initEOperation(getWallet__TopUp__double(), null, "topUp", 1, 1, IS_UNIQUE, !IS_ORDERED);
//		addEParameter(op, theTypesPackage.getReal(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);
//
//		op = initEOperation(getWallet__Withdraw__double(), null, "withdraw", 1, 1, IS_UNIQUE, !IS_ORDERED);
//		addEParameter(op, theTypesPackage.getReal(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);
//
//		initEClass(specialRequestEClass, SpecialRequest.class, "SpecialRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getSpecialRequest_IsApproved(), theTypesPackage.getBoolean(), "isApproved", null, 1, 1, SpecialRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getSpecialRequest_Description(), theTypesPackage.getString(), "description", null, 1, 1, SpecialRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getCustomer_PersonalAddress(), theTypesPackage.getString(), "personalAddress", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getCustomer_PaymentInf(), this.getPaymentInfo(), null, "paymentInf", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getCustomer_Paymentinfo(), this.getPaymentInfo(), null, "paymentinfo", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getUser_Password(), theTypesPackage.getString(), "password", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getUser_Role(), this.getRole(), null, "role", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEReference(getPerson_Knownlanguages(), this.getKnownLanguages(), null, "knownlanguages", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getPerson_FirstName(), theTypesPackage.getString(), "firstName", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getPerson_LastName(), theTypesPackage.getString(), "lastName", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getPerson_Dob(), theTypesPackage.getString(), "dob", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getPerson_ContactNo(), theTypesPackage.getString(), "contactNo", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getPerson_Email(), theTypesPackage.getString(), "email", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(knownLanguagesEClass, KnownLanguages.class, "KnownLanguages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getKnownLanguages_KnownLanguages(), theTypesPackage.getString(), "knownLanguages", null, 1, 1, KnownLanguages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getRole_Role(), theTypesPackage.getString(), "role", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(hotelEClass, Hotel.class, "Hotel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getHotel_HotelName(), theTypesPackage.getString(), "hotelName", null, 1, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getHotel_HotelAddress(), theTypesPackage.getString(), "hotelAddress", null, 1, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getHotel_Manager(), this.getPerson(), null, "manager", null, 1, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getHotel_CityName(), theTypesPackage.getString(), "cityName", null, 1, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getHotel_NumberOfAvailableRooms(), theTypesPackage.getInteger(), "numberOfAvailableRooms", null, 1, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getHotel_Price(), theTypesPackage.getReal(), "price", null, 1, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getHotel_HotelId(), theTypesPackage.getInteger(), "hotelId", null, 1, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getHotel_Person(), this.getPerson(), null, "person", null, 0, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(ratingEClass, Rating.class, "Rating", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getRating_RatingId(), theTypesPackage.getString(), "ratingId", null, 1, 1, Rating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getRating_TourId(), theTypesPackage.getString(), "tourId", null, 1, 1, Rating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getRating_Stars(), theTypesPackage.getInteger(), "stars", null, 1, 1, Rating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getRating_GuideId(), theTypesPackage.getString(), "guideId", null, 1, 1, Rating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getRating_CustomerId(), theTypesPackage.getString(), "customerId", null, 1, 1, Rating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(tourEClass, Tour.class, "Tour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getTour_TourId(), theTypesPackage.getString(), "tourId", null, 1, 1, Tour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getTour_Destination(), this.getDestination(), null, "destination", null, 0, 1, Tour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getTour_NumberOfNights(), theTypesPackage.getInteger(), "numberOfNights", null, 1, 1, Tour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getTour_Hotel(), this.getHotel(), null, "hotel", null, 0, 1, Tour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getTour_InCityModeOfTransport(), this.getModeOfTransport(), null, "inCityModeOfTransport", null, 1, 1, Tour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getTour_Guide(), this.getGuide(), null, "guide", null, 0, 1, Tour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(destinationEClass, Destination.class, "Destination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getDestination_DestinationId(), theTypesPackage.getInteger(), "destinationId", null, 1, 1, Destination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getDestination_Name(), theTypesPackage.getString(), "name", null, 1, 1, Destination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getDestination_Attractions(), theTypesPackage.getString(), "attractions", null, 1, 1, Destination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getDestination_Description(), theTypesPackage.getString(), "description", null, 1, 1, Destination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(modeOfTransportEClass, ModeOfTransport.class, "ModeOfTransport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getModeOfTransport_ModeOfTransport(), theTypesPackage.getString(), "modeOfTransport", null, 1, 1, ModeOfTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(guideEClass, Guide.class, "Guide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getGuide_GuideCharges(), theTypesPackage.getInteger(), "guideCharges", null, 1, 1, Guide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(reviewEClass, Review.class, "Review", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getReview_ReviewId(), theTypesPackage.getString(), "reviewId", null, 1, 1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getReview_Comment(), theTypesPackage.getString(), "comment", null, 1, 1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getReview_Date(), theTypesPackage.getString(), "date", null, 1, 1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(notificationEClass, Notification.class, "Notification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getNotification_NotificationId(), theTypesPackage.getString(), "notificationId", null, 1, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getNotification_Email(), theTypesPackage.getString(), "email", null, 1, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getNotification_Message(), theTypesPackage.getString(), "message", null, 1, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getNotification_Status(), theTypesPackage.getString(), "status", null, 1, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getNotification_Date(), theTypesPackage.getString(), "date", null, 1, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(promotionEClass, Promotion.class, "Promotion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getPromotion_PromotionId(), theTypesPackage.getString(), "promotionId", null, 1, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getPromotion_TourId(), theTypesPackage.getString(), "tourId", null, 1, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getPromotion_DiscountPercentage(), theTypesPackage.getReal(), "discountPercentage", null, 1, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getPromotion_StartDate(), theTypesPackage.getString(), "startDate", null, 1, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getPromotion_EndDate(), theTypesPackage.getString(), "endDate", null, 1, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		initEClass(adminEClass, Admin.class, "Admin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
//		initEAttribute(getAdmin_Department(), theTypesPackage.getString(), "department", null, 1, 1, Admin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEReference(getAdmin_Supervisor(), this.getAdmin(), null, "supervisor", null, 1, 1, Admin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//		initEAttribute(getAdmin_Salary(), theTypesPackage.getInteger(), "salary", null, 1, 1, Admin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
//
//		// Create resource
//		createResource(eNS_URI);
//
//		// Create annotations
//		// http://www.eclipse.org/uml2/2.0.0/UML
//		createUMLAnnotations();
//		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
//		createEmofAnnotations();
//		// duplicates
//		createDuplicatesAnnotations();
//	}
//
//	/**
//	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	protected void createUMLAnnotations() {
//		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
//		addAnnotation
//		  (this,
//		   source,
//		   new String[] {
//			   "originalName", "TourEasy"
//		   });
//		addAnnotation
//		  (getBooking_BookingId(),
//		   source,
//		   new String[] {
//			   "originalName", "bookingID"
//		   });
//		addAnnotation
//		  (getBooking_TourId(),
//		   source,
//		   new String[] {
//			   "originalName", "tourID"
//		   });
//		addAnnotation
//		  (getBooking_CustomerId(),
//		   source,
//		   new String[] {
//			   "originalName", "customerID"
//		   });
//		addAnnotation
//		  (walletEClass,
//		   source,
//		   new String[] {
//			   "originalName", "wallet"
//		   });
//		addAnnotation
//		  (getWallet_WalletId(),
//		   source,
//		   new String[] {
//			   "originalName", "walletID"
//		   });
//		addAnnotation
//		  (getRating_RatingId(),
//		   source,
//		   new String[] {
//			   "originalName", "ratingID"
//		   });
//		addAnnotation
//		  (getRating_TourId(),
//		   source,
//		   new String[] {
//			   "originalName", "tourID"
//		   });
//		addAnnotation
//		  (getRating_GuideId(),
//		   source,
//		   new String[] {
//			   "originalName", "guideID"
//		   });
//		addAnnotation
//		  (getRating_CustomerId(),
//		   source,
//		   new String[] {
//			   "originalName", "customerID"
//		   });
//		addAnnotation
//		  (getReview_ReviewId(),
//		   source,
//		   new String[] {
//			   "originalName", "reviewID"
//		   });
//		addAnnotation
//		  (getNotification_NotificationId(),
//		   source,
//		   new String[] {
//			   "originalName", "notificationID"
//		   });
//		addAnnotation
//		  (getPromotion_PromotionId(),
//		   source,
//		   new String[] {
//			   "originalName", "promotionID"
//		   });
//		addAnnotation
//		  (getPromotion_TourId(),
//		   source,
//		   new String[] {
//			   "originalName", "tourID"
//		   });
//	}
//
//	/**
//	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	protected void createEmofAnnotations() {
//		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";
//		addAnnotation
//		  (getBooking_Booking(),
//		   source,
//		   new String[] {
//			   "body", "specialrequest"
//		   });
//		addAnnotation
//		  (getBooking_Paymentinfo(),
//		   source,
//		   new String[] {
//			   "body", "booking"
//		   });
//		addAnnotation
//		  (getBooking_Customer(),
//		   source,
//		   new String[] {
//			   "body", "booking"
//		   });
//		addAnnotation
//		  (getPaymentInfo_Wallet(),
//		   source,
//		   new String[] {
//			   "body", "paymentinfo"
//		   });
//		addAnnotation
//		  (getCustomer_Paymentinfo(),
//		   source,
//		   new String[] {
//			   "body", "customer"
//		   });
//		addAnnotation
//		  (getHotel_Person(),
//		   source,
//		   new String[] {
//			   "body", "hotel"
//		   });
//	}
//
//	/**
//	 * Initializes the annotations for <b>duplicates</b>.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	protected void createDuplicatesAnnotations() {
//		String source = "duplicates";
//		addAnnotation
//		  (tourEClass,
//		   source,
//		   new String[] {
//		   });
//	}
//
//} //TourEasyPackageImpl
