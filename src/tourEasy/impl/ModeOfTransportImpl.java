/**
 */
package tourEasy.impl;

import tourEasy.ModeOfTransport;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Mode Of
 * Transport</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link tourEasy.impl.ModeOfTransportImpl#getModeOfTransport <em>Mode Of
 * Transport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeOfTransportImpl implements ModeOfTransport {
	/**
	 * The default value of the '{@link #getModeOfTransport() <em>Mode Of
	 * Transport</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModeOfTransport()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_OF_TRANSPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModeOfTransport() <em>Mode Of
	 * Transport</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModeOfTransport()
	 * @generated
	 * @ordered
	 */
	protected String modeOfTransport = MODE_OF_TRANSPORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ModeOfTransportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getModeOfTransport() {
		return modeOfTransport;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setModeOfTransport(String newModeOfTransport) {
		String oldModeOfTransport = modeOfTransport;
		modeOfTransport = newModeOfTransport;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (modeOfTransport: ");
		result.append(modeOfTransport);
		result.append(')');
		return result.toString();
	}

} // ModeOfTransportImpl
