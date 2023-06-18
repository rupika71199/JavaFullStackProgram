package handson3.fourthsum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String playerFirst = scan.nextLine();

		String playerSecond = scan.nextLine();

		UserMainCode.display(playerFirst, playerSecond);

	}

}