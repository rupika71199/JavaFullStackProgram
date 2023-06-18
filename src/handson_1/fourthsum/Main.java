package handson_1.fourthsum;

import java.util.Scanner;

class Player {

//Instance variables  

	String name;

	String country;

	String skill;

// To display Player details  

	void displayPlayerDetails(String name, String country, String skill) {

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

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the player details");

//Gets all data in single line  

		String playerdetails = scan.nextLine();

//Splits the entire sentence with comma  

		String playerarray[] = playerdetails.split(",");

		Player play = new Player();

//Trim is to eliminate extra spaces 

		play.name = playerarray[0].trim();

		play.country = playerarray[1].trim();

		play.skill = playerarray[2].trim();

		play.displayPlayerDetails(play.name, play.country, play.skill);

	}

}