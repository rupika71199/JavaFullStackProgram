package handson2.secondsum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of players");

		int count = scan.nextInt();

		scan.nextLine();

		Player player[] = new Player[count];

		for (int i = 0; i < count; i++) {

			System.out.println("Enter the player name");

			String name = scan.nextLine();

			System.out.println("Enter the country name");

			String country = scan.nextLine();

			System.out.println("Enter the skill");

			String skill = scan.nextLine();

			player[i] = new Player(name, country, skill);

		}

		PlayerBO playBO = new PlayerBO();

		playBO.displayAllPlayerDetails(player);

	}

}