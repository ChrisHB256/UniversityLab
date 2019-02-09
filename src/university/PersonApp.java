package university;

import java.util.HashMap;


public class PersonApp {
	HashMap<Integer, Person> uni = new HashMap<Integer, Person>();
	
	public static void main(String[] args) {
		Person p1 = new Person("Jason", "Howard", "Smith", "smithj@gmail.com","324-91-0472", 18);
		Person p2 = new Student("Mason", "Davis", "Jones", "jonesm@students.rowan.edu", "561-48-4973", 17, "Computer Science");
		Person p3 = new Instructor("Julia", "Elizabeth", "Jackson", "jacksonj@rowan.edu", "214-48-3528", 38, "Science and Mathematics");
	}
}
