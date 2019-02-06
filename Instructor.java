package university;

public class Instructor extends Person {
	private String department;
	
	public Instructor(String department) {
		super();
		this.department  = department;
	}
	
	/**
	 * Method to get the department of the instructor
	 * @return department
	 */
	public String getDepartment() {
		return department;
	}
}