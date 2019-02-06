package university;

public class Person {
Integer id;
String firstName;
String middleName;
String lastName;
String email;
String ssn;
Integer age;
static Integer oldestAge;

public Person(String firstName, String middleName, String lastName, String email, String ssn, Integer age) 
{
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.email = email;
	this.ssn = ssn;
	this.age = age;
	
}
public Integer getId()
{
	return id;
}

public String toString() {
	return firstName + middleName + lastName;
}

public String getEmailDomain()
{
	String result = email.substring(email.indexOf("@"));
	return result;
}

public String getLast4SSN() {
	return ssn.substring(7);
}

public static boolean validAge(Integer age) {
	return (age > 16)?(true):(false);
	}

public static boolean validEmail(String address) {
	boolean result = (address.contains("@"))?((address.contains("."))?(true):(false)):(false);
	
	return (result==true)?(true):(false);
	}

public static boolean validSSN(String number) {
	return (number > 16)?(true):(false);
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
