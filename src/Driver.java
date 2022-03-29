import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.management.InstanceAlreadyExistsException;
import javax.print.attribute.standard.NumberUp;

// program will ask user to enter any number of first Names, last names and ages then 
// programm will spit them out sorted 
public class Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numOfPeople = 0;
		int counter = 0;
		
		// array list for people
		ArrayList<Person> myList = new ArrayList<>();
		
		// ask for NUM of people
		boolean correctInt = true;
		
		do {
			
			System.out.println("Enter number of people you want in your list.");
			try {
				
				numOfPeople = sc.nextInt();
				correctInt = false;
			} catch (InputMismatchException ex) {
				System.err.println("you need to enter a whole NUMBER!");
				sc.next();
			}
		} while (correctInt);
		
		do {
			
			String firstName = null;
			String lastName = null;
			int age = 0;
			
			// ASK FOR first NAME
			boolean correctFirstName = true;

			do {

				System.out.println("Enter persons first name:");
				try {

					firstName = sc.next();
					correctFirstName = false;
				} catch (InputMismatchException ex) {
					System.err.println("you need to enter only letters a - b!");
					sc.next();

				}
				/* System.out.println(firstName); */
			} while (correctFirstName);
			
			// ASK FOR LAST NAME
			boolean correctLastName = true;

			do {

				System.out.println("Enter persons last name:");
				try {

					lastName = sc.next();
					correctLastName = false;
				} catch (InputMismatchException ex) {
					System.err.println("you need to enter only letters a - b!");
					sc.next();

				}
//				 System.out.println(lastName);
			} while (correctLastName);
			
			
			// ASK FOR PERSONS AGE
			boolean correctAge = true;

			do {

				System.out.println("Enter persons age:");
				try {

					age = sc.nextInt();
					correctAge = false;
				} catch (InputMismatchException ex) {
					System.err.println("enter a valid whole NUMBER 1-9");
					sc.next();

				}
				/* System.out.println(age); */
			} while (correctAge);
			
			// create a new person with variables taken from above
			Person person = new Person(firstName, lastName, age);
			
			//populate array with person objects
			myList.add(person);

			counter ++;
		} while (counter < numOfPeople);
		// close the scanner object when done looping
		sc.close();
		
		System.out.println("Here are the people on your list:");
		System.out.println(myList.toString());
		
		System.out.println("Here is your list sorted!");
		Collections.sort(myList);
		System.out.println(myList);
		
	}
}














