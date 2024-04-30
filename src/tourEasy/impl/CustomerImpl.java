/**
 */
package tourEasy.impl;

import java.time.LocalDateTime;
import java.util.List;

import model.enums.KnownLanguages;
import model.enums.Role;
import tourEasy.Customer;
import tourEasy.PaymentInfo;
import tourEasy.User;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Customer</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link tourEasy.impl.CustomerImpl#getPersonalAddress <em>Personal
 * Address</em>}</li>
 * <li>{@link tourEasy.impl.CustomerImpl#getPaymentInf <em>Payment
 * Inf</em>}</li>
 * <li>{@link tourEasy.impl.CustomerImpl#getPaymentinfo
 * <em>Paymentinfo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends UserImpl implements Customer {
	/**
	 * The default value of the '{@link #getPersonalAddress() <em>Personal
	 * Address</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPersonalAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSONAL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonalAddress() <em>Personal
	 * Address</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPersonalAddress()
	 * @generated
	 * @ordered
	 */
	protected String personalAddress = PERSONAL_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaymentInf() <em>Payment Inf</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPaymentInf()
	 * @generated
	 * @ordered
	 */
	protected PaymentInfo paymentInf;

	/**
	 * The cached value of the '{@link #getPaymentinfo() <em>Paymentinfo</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPaymentinfo()
	 * @generated
	 * @ordered
	 */
	protected PaymentInfo paymentinfo;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}
	
	public CustomerImpl (User user, String personalAddress, PaymentInfo paymentInfo) {
		super(user.getFirstName(), user.getLastName(), user.getDob(), user.getContactNo(), user.getEmail(),
				user.getKnownlanguages(), user.getPassword(), user.getRole());
		this.personalAddress = personalAddress;
		this.paymentinfo = paymentInfo;
	}

	public CustomerImpl(String firstName, String lastName, LocalDateTime dob, String contactNo, String email,
			List<KnownLanguages> knownLanguages, String password, Role role, String personalAddress,
			PaymentInfo paymentInfo) {
		super(firstName, lastName, dob, contactNo, email, knownLanguages, password, role);
		this.personalAddress = personalAddress;
		this.paymentinfo = paymentInfo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getPersonalAddress() {
		return personalAddress;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPersonalAddress(String newPersonalAddress) {
		String oldPersonalAddress = personalAddress;
		personalAddress = newPersonalAddress;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public PaymentInfo getPaymentInf() {
		return paymentInf;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PaymentInfo basicGetPaymentInf() {
		return paymentInf;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPaymentInf(PaymentInfo newPaymentInf) {
		PaymentInfo oldPaymentInf = paymentInf;
		paymentInf = newPaymentInf;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public PaymentInfo getPaymentinfo() {
		return paymentinfo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPaymentinfo(PaymentInfo newPaymentinfo) {
		if (newPaymentinfo != paymentinfo) {
			paymentinfo = newPaymentinfo;
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
		result.append(" (personalAddress: ");
		result.append(personalAddress);
		result.append(')');
		return result.toString();
	}

} // CustomerImpl
