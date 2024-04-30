/**
 */
package tourEasy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tourEasy.Destination#getDestinationId <em>Destination Id</em>}</li>
 *   <li>{@link tourEasy.Destination#getName <em>Name</em>}</li>
 *   <li>{@link tourEasy.Destination#getAttractions <em>Attractions</em>}</li>
 *   <li>{@link tourEasy.Destination#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see tourEasy.TourEasyPackage#getDestination()
 * @model
 * @generated
 */
public interface Destination {
	/**
	 * Returns the value of the '<em><b>Destination Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Id</em>' attribute.
	 * @see #setDestinationId(int)
	 * @see tourEasy.TourEasyPackage#getDestination_DestinationId()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getDestinationId();

	/**
	 * Sets the value of the '{@link tourEasy.Destination#getDestinationId <em>Destination Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Id</em>' attribute.
	 * @see #getDestinationId()
	 * @generated
	 */
	void setDestinationId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tourEasy.TourEasyPackage#getDestination_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tourEasy.Destination#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attractions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attractions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attractions</em>' attribute.
	 * @see #setAttractions(String)
	 * @see tourEasy.TourEasyPackage#getDestination_Attractions()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAttractions();

	/**
	 * Sets the value of the '{@link tourEasy.Destination#getAttractions <em>Attractions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attractions</em>' attribute.
	 * @see #getAttractions()
	 * @generated
	 */
	void setAttractions(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tourEasy.TourEasyPackage#getDestination_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tourEasy.Destination#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Destination
