/**
 */
package tourEasy.impl;

import tourEasy.Hotel;
import tourEasy.Person;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Hotel</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link tourEasy.impl.HotelImpl#getHotelName <em>Hotel Name</em>}</li>
 * <li>{@link tourEasy.impl.HotelImpl#getHotelAddress <em>Hotel
 * Address</em>}</li>
 * <li>{@link tourEasy.impl.HotelImpl#getManager <em>Manager</em>}</li>
 * <li>{@link tourEasy.impl.HotelImpl#getCityName <em>City Name</em>}</li>
 * <li>{@link tourEasy.impl.HotelImpl#getNumberOfAvailableRooms <em>Number Of
 * Available Rooms</em>}</li>
 * <li>{@link tourEasy.impl.HotelImpl#getPrice <em>Price</em>}</li>
 * <li>{@link tourEasy.impl.HotelImpl#getHotelId <em>Hotel Id</em>}</li>
 * <li>{@link tourEasy.impl.HotelImpl#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HotelImpl implements Hotel {
	/**
	 * The default value of the '{@link #getHotelName() <em>Hotel Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHotelName()
	 * @generated
	 * @ordered
	 */
	protected static final String HOTEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHotelName() <em>Hotel Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHotelName()
	 * @generated
	 * @ordered
	 */
	protected String hotelName = HOTEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHotelAddress() <em>Hotel Address</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHotelAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String HOTEL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHotelAddress() <em>Hotel Address</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHotelAddress()
	 * @generated
	 * @ordered
	 */
	protected String hotelAddress = HOTEL_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected Person manager;

	/**
	 * The default value of the '{@link #getCityName() <em>City Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCityName()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCityName() <em>City Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCityName()
	 * @generated
	 * @ordered
	 */
	protected String cityName = CITY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfAvailableRooms() <em>Number Of
	 * Available Rooms</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getNumberOfAvailableRooms()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_AVAILABLE_ROOMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfAvailableRooms() <em>Number Of
	 * Available Rooms</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getNumberOfAvailableRooms()
	 * @generated
	 * @ordered
	 */
	protected int numberOfAvailableRooms = NUMBER_OF_AVAILABLE_ROOMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHotelId() <em>Hotel Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHotelId()
	 * @generated
	 * @ordered
	 */
	protected static final int HOTEL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHotelId() <em>Hotel Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHotelId()
	 * @generated
	 * @ordered
	 */
	protected int hotelId = HOTEL_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;
	
	public HotelImpl(String hotelName, String hotelAddress, Person manager, String cityName, int numberOfAvailableRooms,
			float price) {
		super();
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.manager = manager;
		this.cityName = cityName;
		this.numberOfAvailableRooms = numberOfAvailableRooms;
		this.price = price;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HotelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setHotelName(String newHotelName) {
		String oldHotelName = hotelName;
		hotelName = newHotelName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getHotelAddress() {
		return hotelAddress;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setHotelAddress(String newHotelAddress) {
		String oldHotelAddress = hotelAddress;
		hotelAddress = newHotelAddress;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Person getManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Person basicGetManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setManager(Person newManager) {
		Person oldManager = manager;
		manager = newManager;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCityName() {
		return cityName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setCityName(String newCityName) {
		String oldCityName = cityName;
		cityName = newCityName;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getNumberOfAvailableRooms() {
		return numberOfAvailableRooms;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setNumberOfAvailableRooms(int newNumberOfAvailableRooms) {
		int oldNumberOfAvailableRooms = numberOfAvailableRooms;
		numberOfAvailableRooms = newNumberOfAvailableRooms;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getHotelId() {
		return hotelId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setHotelId(int newHotelId) {
		int oldHotelId = hotelId;
		hotelId = newHotelId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Person getPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPerson(Person newPerson) {
		if (newPerson != person) {
			person = newPerson;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (hotelName: ");
		result.append(hotelName);
		result.append(", hotelAddress: ");
		result.append(hotelAddress);
		result.append(", cityName: ");
		result.append(cityName);
		result.append(", numberOfAvailableRooms: ");
		result.append(numberOfAvailableRooms);
		result.append(", price: ");
		result.append(price);
		result.append(", hotelId: ");
		result.append(hotelId);
		result.append(')');
		return result.toString();
	}

} // HotelImpl
