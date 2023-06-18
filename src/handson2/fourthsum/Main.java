package handson2.fourthsum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

// TODO Auto-generated method stub 

		Scanner scan = new Scanner(System.in);

		System.out.println(

				"1. Rectangle" + "\n" +

						"2. Square" + "\n" +

						"3. Circle"

		);

		System.out.println("Area Calculator --- Choose your shape");

		int option = scan.nextInt();

		double area = 0;

		switch (option) {

		case 1:

			System.out.println("Enter length and breadth:");

			int len = scan.nextInt();

			int bre = scan.nextInt();

			Rectangle rect = new Rectangle(len, bre);

			area = rect.calculateArea();

			System.out.print("Area of " + rect.shapeName + " is ");

			break;

		case 2:

			System.out.println("Enter side:");

			int side = scan.nextInt();

			Square sq = new Square(side);

			area = sq.calculateArea();

			System.out.print("Area of " + sq.shapeName + " is ");

			break;

		case 3:

			System.out.println("Enter Radius:");

			int radius = scan.nextInt();

			Circle cir = new Circle(radius);

			area = cir.calculateArea();

			System.out.print("Area of " + cir.shapeName + " is ");

			break;

		}

		System.out.printf("%.2f", area);

	}

}