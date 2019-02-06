package university;

public class Student extends Person {
	private String major;
	
	public Student(String major) {
		super();
		this.major = major;
	}
	
	/**
	 * Method to get the major of the student
	 * @return major
	 */
	public String getMajor() {
		return major;
	}
}
