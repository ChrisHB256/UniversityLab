package university;

public class Student extends Person {
	private String major;
	
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
