package handson2.fifthsum;

public class TwoWheeler extends Vehicle {

	private String kickStartAvailable;

	public String isKickStartAvailable() {

		return kickStartAvailable;

	}

	public void setKickStartAvailable(String kickStartAvailable) {

		this.kickStartAvailable = kickStartAvailable;

	}

	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String bool) {

		super(make, vehicleNumber, fuelType, fuelCapacity, cc);

		setKickStartAvailable(bool);

	}

	public void displayDetailInfo() {

		System.out.println("---Detail Information---" + '\n' +

				"Kick Start Available: " + isKickStartAvailable().toUpperCase());

	}

}