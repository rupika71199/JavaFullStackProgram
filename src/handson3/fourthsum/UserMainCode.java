package handson3.fourthsum;

public class UserMainCode {

	static void display(String player1, String player2) {

		String playerName1[] = player1.split(" ");

		String playerName2[] = player2.split(" ");

		StringBuilder sb1 = new StringBuilder(playerName1[1]);

		StringBuilder sb2 = new StringBuilder(playerName2[1]);

		boolean bool = true;

		if (sb1.length() == sb2.length()) {

			for (int index = 0; index < sb1.length(); index++) {

				if (sb1.charAt(index) != sb2.charAt(index))

				{

					bool = false;

					break;

				}

			}

		}

		else

			bool = false;

		String result = (bool ? "Yes" : "No");

		System.out.println(result);

	}

}