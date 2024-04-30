/**
 */
package tourEasy.impl;

import java.time.LocalDateTime;
import java.util.List;

import model.enums.KnownLanguages;
import model.enums.Role;
import tourEasy.Admin;
import tourEasy.User;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Admin</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link tourEasy.impl.AdminImpl#getDepartment <em>Department</em>}</li>
 * <li>{@link tourEasy.impl.AdminImpl#getSupervisor <em>Supervisor</em>}</li>
 * <li>{@link tourEasy.impl.AdminImpl#getSalary <em>Salary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdminImpl extends UserImpl implements Admin {
	/**
	 * The default value of the '{@link #getDepartment() <em>Department</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPARTMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepartment() <em>Department</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected String department = DEPARTMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupervisor() <em>Supervisor</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSupervisor()
	 * @generated
	 * @ordered
	 */
	protected Admin supervisor;

	/**
	 * The default value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected static final Double SALARY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected Double salary = SALARY_EDEFAULT;

	public AdminImpl(User user, String department, Admin supervisor, Double salary) {
		super(user.getFirstName(), user.getLastName(), user.getDob(), user.getContactNo(), user.getEmail(),
				user.getKnownlanguages(), user.getPassword(), user.getRole());
		this.department = department;
		this.supervisor = supervisor;
		this.salary = salary;
	}

	public AdminImpl(String firstName, String lastName, LocalDateTime dob, String contactNo, String email,
			List<KnownLanguages> knownLanguages, String password, Role role, String department, Admin supervisor,
			Double salary) {
		super(firstName, lastName, dob, contactNo, email, knownLanguages, password, role);
		this.department = department;
		this.supervisor = supervisor;
		this.salary = salary;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AdminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getDepartment() {
		return department;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDepartment(String newDepartment) {
		String oldDepartment = department;
		department = newDepartment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Admin getSupervisor() {
		return supervisor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Admin basicGetSupervisor() {
		return supervisor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSupervisor(Admin newSupervisor) {
		Admin oldSupervisor = supervisor;
		supervisor = newSupervisor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getSalary() {
		return salary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSalary(Double newSalary) {
		if (newSalary == null || newSalary >= 2500) {
			System.err.println("The admin’s salary must be less than $2500");
			return;
		}
		salary = newSalary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (department: ");
		result.append(department);
		result.append(", salary: ");
		result.append(salary);
		result.append(')');
		return result.toString();
	}

} // AdminImpl
