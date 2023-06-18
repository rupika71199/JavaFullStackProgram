package handson3.thirdsum;

public class UserMainCode {

	static boolean validateTeam(String code) {

		boolean bool = false;

		String teams[] = { "RCB", "MI", "CSK", "SRH", "KXIP", "DD", "KKR", "RPSG", "GL" };

		String[] team_code = code.split(" ");

		String caption = team_code[0];

		for (String str : teams) {

			if (str.equalsIgnoreCase(caption)) {

				bool = true;

				break;

			}

		}

		return bool;

	}

}