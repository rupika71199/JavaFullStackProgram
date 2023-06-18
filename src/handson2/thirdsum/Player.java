package handson2.thirdsum;
class Player {

	protected String name;

	protected String country;

	public Player(String name, String country) {

		this.name = name;

		this.country = country;

	}

	public void displayDetails() {

		System.out.println(

				"Player Details:" + '\n' +

						"Player Name: " + name + '\n' +

						"Country: " + country);

	}

}