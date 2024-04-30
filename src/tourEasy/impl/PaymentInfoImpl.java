/**
 */
package tourEasy.impl;

import tourEasy.PaymentInfo;
import model.enums.PaymentMode;
import tourEasy.Wallet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Payment
 * Info</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link tourEasy.impl.PaymentInfoImpl#getBillingName <em>Billing
 * Name</em>}</li>
 * <li>{@link tourEasy.impl.PaymentInfoImpl#getBillingAddress <em>Billing
 * Address</em>}</li>
 * <li>{@link tourEasy.impl.PaymentInfoImpl#getPreferredModeOfPayment
 * <em>Preferred Mode Of Payment</em>}</li>
 * <li>{@link tourEasy.impl.PaymentInfoImpl#getWalletDetails <em>Wallet
 * Details</em>}</li>
 * <li>{@link tourEasy.impl.PaymentInfoImpl#getCardDetails <em>Card
 * Details</em>}</li>
 * <li>{@link tourEasy.impl.PaymentInfoImpl#getWallet <em>Wallet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentInfoImpl implements PaymentInfo {
	/**
	 * The default value of the '{@link #getBillingName() <em>Billing Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBillingName()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillingName() <em>Billing Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBillingName()
	 * @generated
	 * @ordered
	 */
	protected String billingName = BILLING_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillingAddress() <em>Billing
	 * Address</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBillingAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillingAddress() <em>Billing
	 * Address</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBillingAddress()
	 * @generated
	 * @ordered
	 */
	protected String billingAddress = BILLING_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreferredModeOfPayment() <em>Preferred
	 * Mode Of Payment</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getPreferredModeOfPayment()
	 * @generated
	 * @ordered
	 */
	protected model.enums.PaymentMode preferredModeOfPayment;

	/**
	 * The cached value of the '{@link #getWalletDetails() <em>Wallet Details</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWalletDetails()
	 * @generated
	 * @ordered
	 */
	protected Wallet walletDetails;

	/**
	 * The default value of the '{@link #getCardDetails() <em>Card Details</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCardDetails()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_DETAILS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardDetails() <em>Card Details</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCardDetails()
	 * @generated
	 * @ordered
	 */
	protected String cardDetails = CARD_DETAILS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWallet() <em>Wallet</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWallet()
	 * @generated
	 * @ordered
	 */
	protected Wallet wallet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PaymentInfoImpl() {
		super();
	}
	
	public PaymentInfoImpl(String billingName, String billingAddress, PaymentMode preferredModeOfPayment,
			Wallet walletDetails, String cardDetails) {
		super();
		this.billingName = billingName;
		this.billingAddress = billingAddress;
		this.preferredModeOfPayment = preferredModeOfPayment;
		this.walletDetails = walletDetails;
		this.cardDetails = cardDetails;
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getBillingName() {
		return billingName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setBillingName(String newBillingName) {

		billingName = newBillingName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getBillingAddress() {
		return billingAddress;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setBillingAddress(String newBillingAddress) {
		String oldBillingAddress = billingAddress;
		billingAddress = newBillingAddress;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public model.enums.PaymentMode getPreferredModeOfPayment() {
		return preferredModeOfPayment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public model.enums.PaymentMode basicGetPreferredModeOfPayment() {
		return preferredModeOfPayment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPreferredModeOfPayment(model.enums.PaymentMode newPreferredModeOfPayment) {
		model.enums.PaymentMode oldPreferredModeOfPayment = preferredModeOfPayment;
		preferredModeOfPayment = newPreferredModeOfPayment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Wallet getWalletDetails() {

		return walletDetails;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Wallet basicGetWalletDetails() {
		return walletDetails;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setWalletDetails(Wallet newWalletDetails) {
		Wallet oldWalletDetails = walletDetails;
		walletDetails = newWalletDetails;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCardDetails() {
		return cardDetails;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setCardDetails(String newCardDetails) {
		String oldCardDetails = cardDetails;
		cardDetails = newCardDetails;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Wallet getWallet() {
		return wallet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Wallet basicGetWallet() {
		return wallet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setWallet(Wallet newWallet) {
		Wallet oldWallet = wallet;
		wallet = newWallet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (billingName: ");
		result.append(billingName);
		result.append(", billingAddress: ");
		result.append(billingAddress);
		result.append(", cardDetails: ");
		result.append(cardDetails);
		result.append(')');
		return result.toString();
	}

} // PaymentInfoImpl
