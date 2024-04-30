/**
 */
package tourEasy.impl;

import tourEasy.Wallet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wallet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tourEasy.impl.WalletImpl#getWalletId <em>Wallet Id</em>}</li>
 *   <li>{@link tourEasy.impl.WalletImpl#getWalletBalance <em>Wallet Balance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WalletImpl implements Wallet {
	/**
	 * The default value of the '{@link #getWalletId() <em>Wallet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWalletId()
	 * @generated
	 * @ordered
	 */
	protected static final String WALLET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWalletId() <em>Wallet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWalletId()
	 * @generated
	 * @ordered
	 */
	protected String walletId = WALLET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWalletBalance() <em>Wallet Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWalletBalance()
	 * @generated
	 * @ordered
	 */
	protected static final double WALLET_BALANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWalletBalance() <em>Wallet Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWalletBalance()
	 * @generated
	 * @ordered
	 */
	protected double walletBalance = WALLET_BALANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WalletImpl() {
		super();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWalletId() {
		return walletId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWalletId(String newWalletId) {
		String oldWalletId = walletId;
		walletId = newWalletId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWalletBalance() {
		return walletBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWalletBalance(double newWalletBalance) {
		double oldWalletBalance = walletBalance;
		walletBalance = newWalletBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void topUp(double amount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void withdraw(double amount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (walletId: ");
		result.append(walletId);
		result.append(", walletBalance: ");
		result.append(walletBalance);
		result.append(')');
		return result.toString();
	}

} //WalletImpl
