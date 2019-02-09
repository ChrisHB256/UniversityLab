package university;

/**
 * Class to create a person with a valid age, email, and
 * Social Security Number. Each runs through a validation
 * method to make sure that they are vaild.
 * @author Asher Schools 
 *
 */
public class Person {
	private Integer id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String ssn;
	private Integer age;
	private static Integer oldestAge = 0;
	private static Integer previousId;

	
	/**
	 * Creates a new Person object and validates key parameters.
	 * @param firstName 	The first name of the person.
	 * @param middleName	The middle name of the person.
	 * @param lastName		The last name of the person.
	 * @param email			The email address of the person.
	 * @param ssn			The Social Security Number of the person.
	 * @param age			The age of the person.
	 * 
	 */
	public Person(String firstName, String middleName, String lastName, String email, String ssn, Integer age) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.id = generateId();

		if (validAge(age) == true && validEmail(email) == true && validSSN(ssn) == true) {
			this.age = age;
			this.email = email;
			this.ssn = ssn;
		} else {
			this.age = 0;
			this.email = "";
			this.ssn = "";
			sendError();
		}
		if (age > oldestAge) {
			oldestAge = age;
		}
	}

	/**
	 * Checks if the person does not have an id number and assigns one if they do not. Returns the id number.
	 * @return 		The person's id number.
	 */
	public Integer getId() {
		if (id == null) {
			generateId();
		}
		return id;
	}

	/**
	 * Generates the person object's id number based on the previous id number and keeps track of the previous id number.
	 * @return		A newly generated id number.
	 */
	private Integer generateId() {
		Integer result;
		if (previousId == null) {
			result = 1000;
			previousId = 1000;
		} else {
			result = ++previousId;
		}
		return result;
	}

	/**
	 * Overrides the Object class's toString method.
	 * @return	The full name of the person.
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return firstName + " " + middleName + " " + lastName;
	}

	/**
	 * @return	The email domain (everything after the '@') 
	 */
	public String getEmailDomain() {
		String result = email.substring(email.indexOf("@")+1);
		return result;
	}

	/**
	 * @return 	The last four digits of a person object's social security number.
	 */
	public String getLast4SSN() {
		return ssn.substring(7);
	}

	/**
	 * Performs a validation check on the age of the person.
	 * @param age 	The age of the person.
	 * @return		True if the age is valid, false otherwise.
	 * 
	 */
	private static boolean validAge(Integer age) {
		return (age > 16) ? (true) : (false);
	}

	/**
	 * Performs a validation check on the email address of the person.
	 * @param address	The email address of the person.
	 * @return		True if valid, false otherwise.
	 * 
	 * @throws 		NullPointerException if not all conditions are met.
	 */
	private static boolean validEmail(String address) {
		boolean result = (address.contains("@")) ? ((address.substring(address.indexOf("@")).contains("."))
				? ((address.lastIndexOf("@") == address.indexOf("@")) ? (true) : (false))
				: (false)) : (false);
		return result;
	}

	/**
	 * Performs a validation check on the Social Security Number of the person.
	 * @param number	The Social Security Number of the person.
	 * @return			True if valid, false otherwise.
	 */
	private static boolean validSSN(String number) {
		boolean result = false;
		if (number.length() == 11) {
			if (number.indexOf("-") == 3 && number.lastIndexOf("-") == 6) {
				if (number.substring(0, 2).matches("[0-9]+") && number.substring(4, 5).matches("[0-9]+")
						&& number.substring(7, 11).matches("[0-9]+")) {
					result = true;
				}
			}
		}
		return result;
	}

	/**
	 * A generic error message for when invalid data is input.
	 */
	private void sendError() {
		System.out.println(
				"There was an error with the information you typed in.\nPlease retype your information and try again.");
	}

	// getters and setters

	public static Integer getOldestAge() {
		return oldestAge;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
