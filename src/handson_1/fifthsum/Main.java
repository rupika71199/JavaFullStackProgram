package handson_1.fifthsum;

import java.util.Scanner;

class Venue {

	private String name;

	private String city;

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getCity() {

		return city;

	}

	public void setCity(String city) {

		this.city = city;

	}

	void printVenueDetails() {

		System.out.println(

				"Venue Details: " + '\n' +

						"Venue Name: " + getName() + '\n' +

						"City Name: " + getCity());

	}

}

public class Main {

	public static void main(String[] args) {

// TODO Auto-generated method stub 

		Scanner sc = new Scanner(System.in);

		Venue venue = new Venue();

		System.out.println("Enter the venue name");

		venue.setName(sc.nextLine());

		System.out.println("Enter the city name");

		venue.setCity(sc.nextLine());

		System.out.println("====================");

		venue.printVenueDetails();

		boolean bool = true;

		while (bool) {

			System.out.println('\n' +

					"Verify and Update Venue Details" + '\n' +

					"Menu" + '\n' +

					"1.Update Venue Name" + '\n' +

					"2.Update City Name" + '\n' +

					"3.All informations Correct/Exit" + '\n' +

					"Type 1 or 2 or 3"

			);

			int option = sc.nextInt();

			sc.nextLine();

			switch (option) {

			case 1:

				System.out.println("Enter the venue name");

				venue.setName(sc.nextLine());

				venue.printVenueDetails();

				break;

			case 2:

				System.out.println("Enter the city name");

				venue.setCity(sc.nextLine());

				venue.printVenueDetails();

				break;

			case 3:

				venue.printVenueDetails();

				bool = false;

				break;

			}

		}

	}

}