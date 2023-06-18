package handson3.thirdsum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String teamCaption = scan.next();

		String jerseyNum = scan.next();

		String captionCode = teamCaption.concat(" ").concat(jerseyNum);

		boolean validate = UserMainCode.validateTeam(captionCode);

		if (validate)

			System.out.println("Valid");

		else

			System.out.println("Invalid");

	}

}