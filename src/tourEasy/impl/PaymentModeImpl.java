/**
 */
package tourEasy.impl;

import tourEasy.PaymentMode;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Payment
 * Mode</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link tourEasy.impl.PaymentModeImpl#getPaymentMode <em>Payment
 * Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentModeImpl implements PaymentMode {
	/**
	 * The default value of the '{@link #getPaymentMode() <em>Payment Mode</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPaymentMode()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentMode() <em>Payment Mode</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPaymentMode()
	 * @generated
	 * @ordered
	 */
	protected String paymentMode = PAYMENT_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PaymentModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getPaymentMode() {
		return paymentMode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPaymentMode(String newPaymentMode) {
		String oldPaymentMode = paymentMode;
		paymentMode = newPaymentMode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (paymentMode: ");
		result.append(paymentMode);
		result.append(')');
		return result.toString();
	}

} // PaymentModeImpl
