package handson3.secondsum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of wickets");

		int wicketNo = scan.nextInt();

		scan.nextLine();

		String wicketDetails[] = new String[wicketNo];

		for (int index = 1; index <= wicketNo; index++) {

			System.out.println("Enter the details of wicket " + index);

			wicketDetails[index - 1] = scan.nextLine();

		}

		System.out.println("Wicket Details");

		for (int index = 0; index < wicketNo; index++) {

			String wicketInfo[] = wicketDetails[index].split(",");

			Wicket wicket = new Wicket();

			wicket.setOver(Long.parseLong(wicketInfo[0]));

			wicket.setBall(Long.parseLong(wicketInfo[1]));

			wicket.setWicketType(wicketInfo[2]);

			wicket.setPlayerName(wicketInfo[3]);

			wicket.setBowlerName(wicketInfo[4]);

			System.out.println(

					"Over: " + wicket.getOver() + '\n' +

							"Ball: " + wicket.getBall() + '\n' +

							"Wicket Type: " + wicket.getWicketType() + '\n' +

							"Player Name: " + wicket.getPlayerName() + '\n' +

							"Bowler Name: " + wicket.getBowlerName());

		}

	}

}