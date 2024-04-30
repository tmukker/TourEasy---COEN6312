/**
 */
package tourEasy.impl;

import java.util.List;

import tourEasy.Destination;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tourEasy.impl.DestinationImpl#getDestinationId <em>Destination Id</em>}</li>
 *   <li>{@link tourEasy.impl.DestinationImpl#getName <em>Name</em>}</li>
 *   <li>{@link tourEasy.impl.DestinationImpl#getAttractions <em>Attractions</em>}</li>
 *   <li>{@link tourEasy.impl.DestinationImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DestinationImpl implements Destination {
	/**
	 * The default value of the '{@link #getDestinationId() <em>Destination Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationId()
	 * @generated
	 * @ordered
	 */
	protected static final int DESTINATION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDestinationId() <em>Destination Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationId()
	 * @generated
	 * @ordered
	 */
	protected int destinationId = DESTINATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttractions() <em>Attractions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttractions()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRACTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttractions() <em>Attractions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttractions()
	 * @generated
	 * @ordered
	 */
	protected String attractions = ATTRACTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestinationImpl() {
		super();
	}


	public DestinationImpl (String name, String description, List<String> attractions) {
		super();
		this.name = name;
		this.description = description;
		this.attractions = attractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDestinationId() {
		return destinationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationId(int newDestinationId) {
		destinationId = newDestinationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttractions() {
		return attractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttractions(String newAttractions) {
		String oldAttractions = attractions;
		attractions = newAttractions;	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (destinationId: ");
		result.append(destinationId);
		result.append(", name: ");
		result.append(name);
		result.append(", attractions: ");
		result.append(attractions);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DestinationImpl
