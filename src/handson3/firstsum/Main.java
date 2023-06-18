package handson3.firstsum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the team details");

		String teamDetails = scan.nextLine();

		String detailInfo[] = teamDetails.split("#");

		Team team = new Team(detailInfo[0], detailInfo[1], detailInfo[2], detailInfo[3], detailInfo[4]);

		System.out.println();

		System.out.println(

				"Team: " + team.getName() + '\n' +

						"Coach: " + team.getCoach() + '\n' +

						"Location: " + team.getLocation() + '\n' +

						"Players: " + team.getPlayers() + '\n' +

						"Captain: " + team.getCaptain());

	}

}