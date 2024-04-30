/**
 */
package tourEasy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tourEasy.Tour#getTourId <em>Tour Id</em>}</li>
 *   <li>{@link tourEasy.Tour#getDestination <em>Destination</em>}</li>
 *   <li>{@link tourEasy.Tour#getNumberOfNights <em>Number Of Nights</em>}</li>
 *   <li>{@link tourEasy.Tour#getHotel <em>Hotel</em>}</li>
 *   <li>{@link tourEasy.Tour#getInCityModeOfTransport <em>In City Mode Of Transport</em>}</li>
 *   <li>{@link tourEasy.Tour#getGuide <em>Guide</em>}</li>
 * </ul>
 *
 * @see tourEasy.TourEasyPackage#getTour()
 * @model annotation="duplicates"
 * @generated
 */
public interface Tour {
	/**
	 * Returns the value of the '<em><b>Tour Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tour Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tour Id</em>' attribute.
	 * @see #setTourId(String)
	 * @see tourEasy.TourEasyPackage#getTour_TourId()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTourId();

	/**
	 * Sets the value of the '{@link tourEasy.Tour#getTourId <em>Tour Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tour Id</em>' attribute.
	 * @see #getTourId()
	 * @generated
	 */
	void setTourId(String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Destination)
	 * @see tourEasy.TourEasyPackage#getTour_Destination()
	 * @model ordered="false"
	 * @generated
	 */
	Destination getDestination();

	/**
	 * Sets the value of the '{@link tourEasy.Tour#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Destination value);

	/**
	 * Returns the value of the '<em><b>Number Of Nights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Nights</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Nights</em>' attribute.
	 * @see #setNumberOfNights(int)
	 * @see tourEasy.TourEasyPackage#getTour_NumberOfNights()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfNights();

	/**
	 * Sets the value of the '{@link tourEasy.Tour#getNumberOfNights <em>Number Of Nights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Nights</em>' attribute.
	 * @see #getNumberOfNights()
	 * @generated
	 */
	void setNumberOfNights(int value);

	/**
	 * Returns the value of the '<em><b>Hotel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hotel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hotel</em>' reference.
	 * @see #setHotel(Hotel)
	 * @see tourEasy.TourEasyPackage#getTour_Hotel()
	 * @model ordered="false"
	 * @generated
	 */
	Hotel getHotel();

	/**
	 * Sets the value of the '{@link tourEasy.Tour#getHotel <em>Hotel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hotel</em>' reference.
	 * @see #getHotel()
	 * @generated
	 */
	void setHotel(Hotel value);

	/**
	 * Returns the value of the '<em><b>In City Mode Of Transport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In City Mode Of Transport</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In City Mode Of Transport</em>' reference.
	 * @see #setInCityModeOfTransport(ModeOfTransport)
	 * @see tourEasy.TourEasyPackage#getTour_InCityModeOfTransport()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	model.enums.ModeOfTransport getInCityModeOfTransport();

	/**
	 * Sets the value of the '{@link tourEasy.Tour#getInCityModeOfTransport <em>In City Mode Of Transport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In City Mode Of Transport</em>' reference.
	 * @see #getInCityModeOfTransport()
	 * @generated
	 */
	void setInCityModeOfTransport(model.enums.ModeOfTransport value);

	/**
	 * Returns the value of the '<em><b>Guide</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guide</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guide</em>' reference.
	 * @see #setGuide(Guide)
	 * @see tourEasy.TourEasyPackage#getTour_Guide()
	 * @model ordered="false"
	 * @generated
	 */
	Guide getGuide();

	/**
	 * Sets the value of the '{@link tourEasy.Tour#getGuide <em>Guide</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guide</em>' reference.
	 * @see #getGuide()
	 * @generated
	 */
	void setGuide(Guide value);

} // Tour
