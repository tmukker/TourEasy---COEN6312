/**
 */
package tourEasy.impl;

import java.time.LocalDateTime;
import java.util.List;

import model.enums.KnownLanguages;
import tourEasy.Person;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Person</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link tourEasy.impl.PersonImpl#getKnownlanguages
 * <em>Knownlanguages</em>}</li>
 * <li>{@link tourEasy.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 * <li>{@link tourEasy.impl.PersonImpl#getLastName <em>Last Name</em>}</li>
 * <li>{@link tourEasy.impl.PersonImpl#getDob <em>Dob</em>}</li>
 * <li>{@link tourEasy.impl.PersonImpl#getContactNo <em>Contact No</em>}</li>
 * <li>{@link tourEasy.impl.PersonImpl#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl implements Person {
	/**
	 * The cached value of the '{@link #getKnownlanguages()
	 * <em>Knownlanguages</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getKnownlanguages()
	 * @generated
	 * @ordered
	 */
	protected List<model.enums.KnownLanguages> knownlanguages;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDob() <em>Dob</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDob()
	 * @generated
	 * @ordered
	 */
	protected static final LocalDateTime DOB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDob() <em>Dob</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDob()
	 * @generated
	 * @ordered
	 */
	protected LocalDateTime dob = DOB_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactNo() <em>Contact No</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContactNo()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactNo() <em>Contact No</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContactNo()
	 * @generated
	 * @ordered
	 */
	protected String contactNo = CONTACT_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}
	
	public PersonImpl(String firstName, String lastName, LocalDateTime dob, String contactNo, String email,
			List<KnownLanguages> knownLanguages) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.contactNo = contactNo;
		this.email = email;
		this.knownlanguages = knownLanguages;
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<model.enums.KnownLanguages> getKnownlanguages() {

		return knownlanguages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List<model.enums.KnownLanguages> basicGetKnownlanguages() {
		return knownlanguages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setKnownlanguages(List<model.enums.KnownLanguages> newKnownlanguages) {
		List<model.enums.KnownLanguages> oldKnownlanguages = knownlanguages;
		knownlanguages = newKnownlanguages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public LocalDateTime getDob() {
		return dob;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDob(LocalDateTime newDob) {
		LocalDateTime oldDob = dob;
		dob = newDob;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getContactNo() {
		return contactNo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setContactNo(String newContactNo) {
		String oldContactNo = contactNo;
		contactNo = newContactNo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", dob: ");
		result.append(dob);
		result.append(", contactNo: ");
		result.append(contactNo);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} // PersonImpl
