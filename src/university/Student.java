package university;

/** 
 * Class to create a Student.
 * Child class of Person.
 * @author Chris Hicks
 *
 */

public class Student extends Person {
	private String major;
	
	/**
	 * Constructor for the Student class, utilizes the parent's
	 * constructor to create the Student, major is set here.
	 * @param firstName		The first name of the student
	 * @param middleName	The middle name of the student
	 * @param lastName		The last name of the student
	 * @param email			The email of the student
	 * @param ssn			The Social Security Number of the student
	 * @param age			The age of the student
	 * @param major			The major of the student
	 */
	public Student(String firstName, String middleName, String lastName, String email, String ssn, Integer age, String major) {
		super(firstName, middleName, lastName, email, ssn, age);
		this.major = major;
	}
	
	/**
	 * Method to get the major of the student
	 * @return major
	 */
	public String getMajor() {
		return major;
	}
	
	/**
	 * Method to set a new major for the student
	 * @param newMajor
	 */
	public void setMajor(String newMajor) {
		major = newMajor;
	}
}
