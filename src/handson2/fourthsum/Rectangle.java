package handson2.fourthsum;

class Rectangle extends Shape {

	private int length, breadth;

	Rectangle(int l, int b) {

		super("Rectangle");

		this.length = l;

		this.breadth = b;

	}

	double calculateArea() {

		return length * breadth;

	}

}