package handson2.secondsum;

public class PlayerBO {

	void displayAllPlayerDetails(Player[] playerList) {

		System.out.println("Player Details");

		for (Player player : playerList) {

			System.out.println(player.toString());

		}

	}

}