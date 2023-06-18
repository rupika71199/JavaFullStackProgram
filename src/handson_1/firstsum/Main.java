package handson_1.firstsum;

import java.util.Scanner;

class Venue {
	String name; // Default and instance variables
	String city;
	void printDetails(String n, String c) { // Method to print the venue details
		name = n;
		city = c;
		System.out.println(
				"Venue Details:" + '\n' +
						"Venue Name: " + n + '\n' +
						"City Name: " + c);

	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner class to get input from user
		Venue ven = new Venue();// Creating object for class Venue. This will invoke the default constructor
		System.out.println("Enter the venue name");
		ven.name = sc.nextLine();
		System.out.println("Enter the city name");
		ven.city = sc.nextLine();
		ven.printDetails(ven.name, ven.city);

	}

}