/**
 */
package tourEasy.impl;

import model.enums.ModeOfTransport;
import tourEasy.Destination;
import tourEasy.Guide;
import tourEasy.Hotel;
import tourEasy.Tour;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Tour</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link tourEasy.impl.TourImpl#getDestination <em>Destination</em>}</li>
 * <li>{@link tourEasy.impl.TourImpl#getHotel <em>Hotel</em>}</li>
 * <li>{@link tourEasy.impl.TourImpl#getGuide <em>Guide</em>}</li>
 * <li>{@link tourEasy.impl.TourImpl#getTourId <em>Tour Id</em>}</li>
 * <li>{@link tourEasy.impl.TourImpl#getNumberOfNights <em>Number Of
 * Nights</em>}</li>
 * <li>{@link tourEasy.impl.TourImpl#getInCityModeOfTransport <em>In City Mode
 * Of Transport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TourImpl implements Tour {
	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Destination destination;

	/**
	 * The cached value of the '{@link #getHotel() <em>Hotel</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHotel()
	 * @generated
	 * @ordered
	 */
	protected Hotel hotel;

	/**
	 * The cached value of the '{@link #getGuide() <em>Guide</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGuide()
	 * @generated
	 * @ordered
	 */
	protected Guide guide;

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
	 * The default value of the '{@link #getNumberOfNights() <em>Number Of
	 * Nights</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNumberOfNights()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_NIGHTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfNights() <em>Number Of
	 * Nights</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNumberOfNights()
	 * @generated
	 * @ordered
	 */
	protected int numberOfNights = NUMBER_OF_NIGHTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInCityModeOfTransport() <em>In City Mode
	 * Of Transport</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInCityModeOfTransport()
	 * @generated
	 * @ordered
	 */
	protected ModeOfTransport inCityModeOfTransport;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TourImpl() {
		super();
	}

	public TourImpl(String tourId, Destination destination, Integer numberOfNights, Hotel hotel,
			ModeOfTransport inCityModeOfTransport, Guide guide) {
		super();
		this.tourId = tourId;
		this.destination = destination;
		this.numberOfNights = numberOfNights;
		this.hotel = hotel;
		this.inCityModeOfTransport = inCityModeOfTransport;
		this.guide = guide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Destination getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDestination(Destination newDestination) {
		if (newDestination != destination) {
			destination = newDestination;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetDestination() {
		return destination != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Hotel getHotel() {
		return hotel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setHotel(Hotel newHotel) {
		if (newHotel != hotel) {
			hotel = newHotel;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetHotel() {
		return hotel != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Guide getGuide() {
		return guide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Guide basicGetGuide() {
		return guide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setGuide(Guide newGuide) {
		Guide oldGuide = guide;
		guide = newGuide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetGuide() {
		return guide != null;
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
	public int getNumberOfNights() {
		return numberOfNights;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setNumberOfNights(int newNumberOfNights) {
		int oldNumberOfNights = numberOfNights;
		numberOfNights = newNumberOfNights;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ModeOfTransport getInCityModeOfTransport() {
		return inCityModeOfTransport;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModeOfTransport basicGetInCityModeOfTransport() {
		return inCityModeOfTransport;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setInCityModeOfTransport(ModeOfTransport newInCityModeOfTransport) {
		ModeOfTransport oldInCityModeOfTransport = inCityModeOfTransport;
		inCityModeOfTransport = newInCityModeOfTransport;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (tourId: ");
		result.append(tourId);
		result.append(", numberOfNights: ");
		result.append(numberOfNights);
		result.append(')');
		return result.toString();
	}

} // TourImpl
