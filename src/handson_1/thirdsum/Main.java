package handson_1.thirdsum;

import java.util.Scanner;

class Delivery {

	public long over;

	public long ball;

	public long runs;

	public String batsman;

	public String bowler;

	public String nonStriker;

	void displayDeliveryDetails() {

		System.out.println(

				"Delivery Details:" + '\n' +

						"Over: " + over + '\n' +

						"Ball: " + ball + '\n' +

						"Runs: " + runs + '\n' +

						"Batsman: " + batsman + '\n' +

						"Bowler: " + bowler + '\n' +

						"NonStriker : " + nonStriker + '\n'

		);

	}

}

public class Main {

	public static void main(String[] args) {

// TODO Auto-generated method stub 

		Scanner scan = new Scanner(System.in);

		Delivery delivery = new Delivery();

		System.out.println("Enter the over");

		delivery.over = scan.nextLong();

		System.out.println("Enter the ball");

		delivery.ball = scan.nextLong();

		System.out.println("Enter the runs");

		delivery.runs = scan.nextLong();

		scan.nextLine();

		System.out.println("Enter the batsman name");

		delivery.batsman = scan.nextLine();

		System.out.println("Enter the bowler name");

		delivery.bowler = scan.nextLine();

		System.out.println("Enter the nonStriker name");

		delivery.nonStriker = scan.nextLine();

		delivery.displayDeliveryDetails();

	}

}
