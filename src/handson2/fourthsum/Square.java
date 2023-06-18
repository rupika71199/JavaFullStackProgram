package handson2.fourthsum;

class Square extends Shape {

	private int side;

	Square(int side) {

		super("Square");

		this.side = side;

	}

	public int getSide() {

		return side;

	}

	public void setSide(int side) {

		this.side = side;

	}

	double calculateArea() {

		return side * side;

	}

}