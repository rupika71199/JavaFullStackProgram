package handson2.thirdsum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

// TODO Auto-generated method stub 

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter player name");

		String playerName = scan.nextLine();

		System.out.println("Enter player country");

		String country = scan.nextLine();

		System.out.println("Enter the Cap number");

		String cap = scan.next();

		System.out.println("Enter the number of test appearnace");

		long testAppearance = scan.nextLong();

		System.out.println("Enter the number of ODI appearnace");

		long odiAppearance = scan.nextLong();

//Base class 

		InternationalPlayer ip = new InternationalPlayer(playerName, country, cap, testAppearance, odiAppearance);

		ip.displayDetails();

	}

}