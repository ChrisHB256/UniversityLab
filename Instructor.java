package university;

/**
 * @author Chris Hicks
 *
 */

public class Instructor extends Person {
	private String department;
	
	public Instructor(String firstName, String middleName, String lastName, String email, String ssn, Integer age, String department) {
		super(firstName, middleName, lastName, email, ssn, age);
		this.department  = department;
	}
	
	/**
	 * Method to get the department of the instructor
	 * @return department
	 */
	public String getDepartment() {
		return department;
	}
	
	/**
	 * Method to set a new department for the instructor
	 * @param newDepartment String
	 */
	public void setDepartment(String newDepartment) {
		department = newDepartment;
	}
}