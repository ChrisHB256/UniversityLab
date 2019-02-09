package university;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Driver class for the University application
 * @author Asher Schools 
 * @author Chris Hicks
 *
 */

public class PersonApp {
	private static HashMap<Integer, Person> uni;
	
	/**
	 * Main method
	 * @param args Any additional arguments to be applied when ran
	 */
	public static void main(String[] args) {
		uni = new HashMap<Integer, Person>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter person's first name");
		String first = scan.nextLine();
		System.out.println("Enter person's middle name");
		String middle = scan.nextLine();
		System.out.println("Enter person's last name");
		String last = scan.nextLine();
		System.out.println("Enter person's email");
		String email = scan.nextLine();
		System.out.println("Enter person's Social Security Number in the format ###-##-####");
		String ssn = scan.nextLine();
		System.out.println("Enter person's age");
		Integer age = scan.nextInt();
		scan.close();
		System.out.println();
		
		Person person1 = new Person(first,middle,last,email,ssn,age);
		Person p2 = new Student("Mason", "Davis", "Jones", "jonesm@students.rowan.edu", "561-48-4973", 17, "Computer Science");
		Person p3 = new Instructor("Julia", "Elizabeth", "Jackson", "jacksonj@rowan.edu", "214-48-3528", 38, "Science and Mathematics");

		uni.put(person1.getId(),person1);
		uni.put(p2.getId(),p2);
		uni.put(p3.getId(),p3);
		
		uni.forEach((id,person) -> {
			displayInfo(person);
		});
		
	}
	
	/**
	 * Both prints and returns all of the information about a particular Person object.
	 * @param person The specific Person object that we want information about.
	 * @return a string containing all of the important information.
	 */
	private static String displayInfo(Person person)
	{
		
		String result = "\n";
		if(person.getClass().getSimpleName().equals("Student"))
		{
			Student s = (Student) person;
			result = s.getMajor();
		}
		else if(person.getClass().getSimpleName().equals("Instructor"))
		{
			Instructor i = (Instructor) person;
			result = i.getDepartment();
		}
		 result = person.toString() + "(" + person.getClass().getSimpleName() + ")\n" + person.getEmailDomain() + 
				"\n" + person.getLast4SSN() + "\n" + (person.getAge().equals(Person.getOldestAge())?("oldest"):("not oldest"))
				+ "\n"+ result + "\n";
		System.out.println(result);
		
		return result;
	}
}
