package handson2.firstsum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

// TODO Auto-generated method stub 

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the venue name ");

		String name = scan.nextLine();

		System.out.println("Enter the city name ");

		String city = scan.nextLine();

		Venue venue = new Venue(name, city);

		VenueBO venBO = new VenueBO();

		venBO.displayVenueDetails(venue);

	}

}