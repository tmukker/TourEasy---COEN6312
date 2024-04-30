/**
 */
package tourEasy;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tourEasy.Person#getKnownlanguages <em>Knownlanguages</em>}</li>
 *   <li>{@link tourEasy.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link tourEasy.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link tourEasy.Person#getDob <em>Dob</em>}</li>
 *   <li>{@link tourEasy.Person#getContactNo <em>Contact No</em>}</li>
 *   <li>{@link tourEasy.Person#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @see tourEasy.TourEasyPackage#getPerson()
 * @model
 * @generated
 */
public interface Person {
	/**
	 * Returns the value of the '<em><b>Knownlanguages</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knownlanguages</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knownlanguages</em>' reference.
	 * @see #setKnownlanguages(KnownLanguages)
	 * @see tourEasy.TourEasyPackage#getPerson_Knownlanguages()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	List<model.enums.KnownLanguages> getKnownlanguages();

	/**
	 * Sets the value of the '{@link tourEasy.Person#getKnownlanguages <em>Knownlanguages</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knownlanguages</em>' reference.
	 * @see #getKnownlanguages()
	 * @generated
	 */
	void setKnownlanguages(List<model.enums.KnownLanguages> value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see tourEasy.TourEasyPackage#getPerson_FirstName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link tourEasy.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see tourEasy.TourEasyPackage#getPerson_LastName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link tourEasy.Person#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Dob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dob</em>' attribute.
	 * @see #setDob(String)
	 * @see tourEasy.TourEasyPackage#getPerson_Dob()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	LocalDateTime getDob();

	/**
	 * Sets the value of the '{@link tourEasy.Person#getDob <em>Dob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dob</em>' attribute.
	 * @see #getDob()
	 * @generated
	 */
	void setDob(LocalDateTime value);

	/**
	 * Returns the value of the '<em><b>Contact No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact No</em>' attribute.
	 * @see #setContactNo(String)
	 * @see tourEasy.TourEasyPackage#getPerson_ContactNo()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getContactNo();

	/**
	 * Sets the value of the '{@link tourEasy.Person#getContactNo <em>Contact No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact No</em>' attribute.
	 * @see #getContactNo()
	 * @generated
	 */
	void setContactNo(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see tourEasy.TourEasyPackage#getPerson_Email()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link tourEasy.Person#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // Person
