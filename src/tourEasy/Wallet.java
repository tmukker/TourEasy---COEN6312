/**
 */
package tourEasy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wallet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tourEasy.Wallet#getWalletId <em>Wallet Id</em>}</li>
 *   <li>{@link tourEasy.Wallet#getWalletBalance <em>Wallet Balance</em>}</li>
 * </ul>
 *
 * @see tourEasy.TourEasyPackage#getWallet()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='wallet'"
 * @generated
 */
public interface Wallet {
	/**
	 * Returns the value of the '<em><b>Wallet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wallet Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wallet Id</em>' attribute.
	 * @see #setWalletId(String)
	 * @see tourEasy.TourEasyPackage#getWallet_WalletId()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='walletID'"
	 * @generated
	 */
	String getWalletId();

	/**
	 * Sets the value of the '{@link tourEasy.Wallet#getWalletId <em>Wallet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wallet Id</em>' attribute.
	 * @see #getWalletId()
	 * @generated
	 */
	void setWalletId(String value);

	/**
	 * Returns the value of the '<em><b>Wallet Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wallet Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wallet Balance</em>' attribute.
	 * @see #setWalletBalance(double)
	 * @see tourEasy.TourEasyPackage#getWallet_WalletBalance()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getWalletBalance();

	/**
	 * Sets the value of the '{@link tourEasy.Wallet#getWalletBalance <em>Wallet Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wallet Balance</em>' attribute.
	 * @see #getWalletBalance()
	 * @generated
	 */
	void setWalletBalance(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model amountDataType="org.eclipse.uml2.types.Real" amountRequired="true" amountOrdered="false"
	 * @generated
	 */
	void topUp(double amount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model amountDataType="org.eclipse.uml2.types.Real" amountRequired="true" amountOrdered="false"
	 * @generated
	 */
	void withdraw(double amount);

} // Wallet
