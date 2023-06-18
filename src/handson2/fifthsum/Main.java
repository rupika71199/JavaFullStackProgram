package handson2.fifthsum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(

				"1. Four Wheeler" + '\n' +

						"2. Two Wheeler");

		System.out.println("Enter Vehicle Type:");

		int option = scan.nextInt();

		scan.nextLine();

		System.out.println("Vehicle Make:");

		String make = scan.nextLine();

		System.out.println("Vehicle Number:");

		String num = scan.nextLine();

		System.out.println(

				"Fuel Type" + '\n' +

						"1. Petrol" + '\n' +

						"2. Diesel");

		int fuelTypeOption = scan.nextInt();

		String fuelType = "";

		switch (fuelTypeOption) {

		case 1:

			fuelType = "Petrol";

			break;

		case 2:

			fuelType = "Diesel";

			break;

		}

		System.out.println("Fuel Capacity:");

		int capacity = scan.nextInt();

		System.out.println("Engine CC:");

		int cc = scan.nextInt();

		scan.nextLine();

		switch (option) {

		case 1:

			System.out.println("Audio System:");

			String audio = scan.nextLine();

			System.out.println("Number of Doors:");

			int door = scan.nextInt();

			FourWheeler four = new FourWheeler(make, num, fuelType, capacity, cc, audio, door);

			four.displayMake();

			four.displayBasicInfo();

			four.displayDetailInfo();

			break;

		case 2:

			System.out.println("Kick Start Available(yes/no):");

			String bool = scan.nextLine(); // When trying with Boolean, it is not accepting yes or no.

			TwoWheeler two = new TwoWheeler(make, num, fuelType, capacity, cc, bool);

			two.displayMake();

			two.displayBasicInfo();

			two.displayDetailInfo();

			break;

		}

	}

}