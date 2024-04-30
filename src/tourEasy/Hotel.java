/**
 */
package tourEasy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tourEasy.Hotel#getHotelName <em>Hotel Name</em>}</li>
 *   <li>{@link tourEasy.Hotel#getHotelAddress <em>Hotel Address</em>}</li>
 *   <li>{@link tourEasy.Hotel#getManager <em>Manager</em>}</li>
 *   <li>{@link tourEasy.Hotel#getCityName <em>City Name</em>}</li>
 *   <li>{@link tourEasy.Hotel#getNumberOfAvailableRooms <em>Number Of Available Rooms</em>}</li>
 *   <li>{@link tourEasy.Hotel#getPrice <em>Price</em>}</li>
 *   <li>{@link tourEasy.Hotel#getHotelId <em>Hotel Id</em>}</li>
 *   <li>{@link tourEasy.Hotel#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @see tourEasy.TourEasyPackage#getHotel()
 * @model
 * @generated
 */
public interface Hotel {
	/**
	 * Returns the value of the '<em><b>Hotel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hotel Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hotel Name</em>' attribute.
	 * @see #setHotelName(String)
	 * @see tourEasy.TourEasyPackage#getHotel_HotelName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getHotelName();

	/**
	 * Sets the value of the '{@link tourEasy.Hotel#getHotelName <em>Hotel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hotel Name</em>' attribute.
	 * @see #getHotelName()
	 * @generated
	 */
	void setHotelName(String value);

	/**
	 * Returns the value of the '<em><b>Hotel Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hotel Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hotel Address</em>' attribute.
	 * @see #setHotelAddress(String)
	 * @see tourEasy.TourEasyPackage#getHotel_HotelAddress()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getHotelAddress();

	/**
	 * Sets the value of the '{@link tourEasy.Hotel#getHotelAddress <em>Hotel Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hotel Address</em>' attribute.
	 * @see #getHotelAddress()
	 * @generated
	 */
	void setHotelAddress(String value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(Person)
	 * @see tourEasy.TourEasyPackage#getHotel_Manager()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Person getManager();

	/**
	 * Sets the value of the '{@link tourEasy.Hotel#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Person value);

	/**
	 * Returns the value of the '<em><b>City Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Name</em>' attribute.
	 * @see #setCityName(String)
	 * @see tourEasy.TourEasyPackage#getHotel_CityName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCityName();

	/**
	 * Sets the value of the '{@link tourEasy.Hotel#getCityName <em>City Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Name</em>' attribute.
	 * @see #getCityName()
	 * @generated
	 */
	void setCityName(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Available Rooms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Available Rooms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Available Rooms</em>' attribute.
	 * @see #setNumberOfAvailableRooms(int)
	 * @see tourEasy.TourEasyPackage#getHotel_NumberOfAvailableRooms()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfAvailableRooms();

	/**
	 * Sets the value of the '{@link tourEasy.Hotel#getNumberOfAvailableRooms <em>Number Of Available Rooms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Available Rooms</em>' attribute.
	 * @see #getNumberOfAvailableRooms()
	 * @generated
	 */
	void setNumberOfAvailableRooms(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see tourEasy.TourEasyPackage#getHotel_Price()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link tourEasy.Hotel#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Hotel Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hotel Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hotel Id</em>' attribute.
	 * @see #setHotelId(int)
	 * @see tourEasy.TourEasyPackage#getHotel_HotelId()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getHotelId();

	/**
	 * Sets the value of the '{@link tourEasy.Hotel#getHotelId <em>Hotel Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hotel Id</em>' attribute.
	 * @see #getHotelId()
	 * @generated
	 */
	void setHotelId(int value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(Person)
	 * @see tourEasy.TourEasyPackage#getHotel_Person()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='hotel'"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link tourEasy.Hotel#getPerson <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' containment reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

} // Hotel
