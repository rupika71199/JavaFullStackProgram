package handson2.thirdsum;

class InternationalPlayer extends Player {

	private String capNumber;

	private long noOfTestAppearance;

	private long noOfODIAppearance;

	public InternationalPlayer(String name, String country, String capNo, long testApp, long odiApp) {

		super(name, country);

		this.capNumber = capNo;

		this.noOfTestAppearance = testApp;

		this.noOfODIAppearance = odiApp;

	}

	public void displayDetails() {

		super.displayDetails();

		System.out.println(

				"Cap numer: " + capNumber + '\n' +

						"Number of test appearnace: " + noOfTestAppearance + '\n' +

						"Number of ODI appearnace : " + noOfODIAppearance);

	}

}