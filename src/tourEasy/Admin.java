/**
 */
package tourEasy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tourEasy.Admin#getDepartment <em>Department</em>}</li>
 *   <li>{@link tourEasy.Admin#getSupervisor <em>Supervisor</em>}</li>
 *   <li>{@link tourEasy.Admin#getSalary <em>Salary</em>}</li>
 * </ul>
 *
 * @see tourEasy.TourEasyPackage#getAdmin()
 * @model
 * @generated
 */
public interface Admin extends User {
	/**
	 * Returns the value of the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Department</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' attribute.
	 * @see #setDepartment(String)
	 * @see tourEasy.TourEasyPackage#getAdmin_Department()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDepartment();

	/**
	 * Sets the value of the '{@link tourEasy.Admin#getDepartment <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' attribute.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(String value);

	/**
	 * Returns the value of the '<em><b>Supervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervisor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor</em>' reference.
	 * @see #setSupervisor(Admin)
	 * @see tourEasy.TourEasyPackage#getAdmin_Supervisor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Admin getSupervisor();

	/**
	 * Sets the value of the '{@link tourEasy.Admin#getSupervisor <em>Supervisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervisor</em>' reference.
	 * @see #getSupervisor()
	 * @generated
	 */
	void setSupervisor(Admin value);

	/**
	 * Returns the value of the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salary</em>' attribute.
	 * @see #setSalary(int)
	 * @see tourEasy.TourEasyPackage#getAdmin_Salary()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	Double getSalary();

	/**
	 * Sets the value of the '{@link tourEasy.Admin#getSalary <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary</em>' attribute.
	 * @see #getSalary()
	 * @generated
	 */
	void setSalary(Double value);

} // Admin
