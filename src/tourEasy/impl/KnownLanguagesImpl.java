/**
 */
package tourEasy.impl;

import tourEasy.KnownLanguages;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Known Languages</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tourEasy.impl.KnownLanguagesImpl#getKnownLanguages <em>Known Languages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnownLanguagesImpl implements KnownLanguages {
	/**
	 * The default value of the '{@link #getKnownLanguages() <em>Known Languages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnownLanguages()
	 * @generated
	 * @ordered
	 */
	protected static final String KNOWN_LANGUAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKnownLanguages() <em>Known Languages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnownLanguages()
	 * @generated
	 * @ordered
	 */
	protected String knownLanguages = KNOWN_LANGUAGES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnownLanguagesImpl() {
		super();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKnownLanguages() {
		return knownLanguages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKnownLanguages(String newKnownLanguages) {
		String oldKnownLanguages = knownLanguages;
		knownLanguages = newKnownLanguages;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (knownLanguages: ");
		result.append(knownLanguages);
		result.append(')');
		return result.toString();
	}

} //KnownLanguagesImpl
