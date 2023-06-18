package handson_1.secondsum;

import java.util.Scanner;

class Player {

	// Instance variables

	String name;

	String country;

	String skill;

	void playerDetails(String name, String country, String skill) {

		System.out.println(

				"Player Details:" + '\n' +

						"Player Name : " + name + '\n' +

						"Country Name: " + country + '\n' +

						"Skill: " + skill

		);

	}

}

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Player1

		Player play1 = new Player();

		System.out.println("Enter the player name");

		play1.name = sc.nextLine();

		System.out.println("Enter the country name");

		play1.country = sc.nextLine();

		System.out.println("Enter the skill");

		play1.skill = sc.nextLine();

		play1.playerDetails(play1.name, play1.country, play1.skill);

		// Player2

		Player play2 = new Player();

		System.out.println("Enter the player name");

		play2.name = sc.nextLine();

		System.out.println("Enter the country name");

		play2.country = sc.nextLine();

		System.out.println("Enter the skill");

		play2.skill = sc.nextLine();

		play2.playerDetails(play2.name, play2.country, play2.skill);

	}

}