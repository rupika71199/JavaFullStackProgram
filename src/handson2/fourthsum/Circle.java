package handson2.fourthsum;

class Circle extends Shape {

	private int radius;

	final double PI = 3.1415;

	Circle(int r) {

		super("Circle");

		this.radius = r;

	}

	double calculateArea() {

		return PI * radius * radius;

	}

}