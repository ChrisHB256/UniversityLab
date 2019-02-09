package university;

/**
 * Class to create an Instructor. 
 * Child class of Person
 * @author Chris Hicks
 *
 */

public class Instructor extends Person {
	private String department;
	
	/**
	 * Constructor of the Intructor class, utlitizes parent's
	 * constructor to fill in the gaps. Sets department here.
	 * @param firstName		The first name of the instructor
	 * @param middleName    The middle name of the instructor
	 * @param lastName      The last name of the instructor
	 * @param email         The email of the instructor
	 * @param ssn			The Social Security Number of the instructor
	 * @param age			The age of the instructor
	 * @param department    The department that the instructor is
	 */
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