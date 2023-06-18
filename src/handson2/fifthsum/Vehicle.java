package handson2.fifthsum;

public class Vehicle {

	protected String make;

	protected String vehicleNumber;

	protected String fuelType;

	protected int fuelCapacity;

	protected int cc;

	public String getMake() {

		return make;

	}

	public void setMake(String make) {

		this.make = make;

	}

	public String getVehicleNumber() {

		return vehicleNumber;

	}

	public void setVehicleNumber(String vehicleNumber) {

		this.vehicleNumber = vehicleNumber;

	}

	public String getFuelType() {

		return fuelType;

	}

	public void setFuelType(String fuelType) {

		this.fuelType = fuelType;

	}

	public int getFuelCapacity() {

		return fuelCapacity;

	}

	public void setFuelCapacity(int fuelCapacity) {

		this.fuelCapacity = fuelCapacity;

	}

	public int getCc() {

		return cc;

	}

	public void setCc(int cc) {

		this.cc = cc;

	}

	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {

		setMake(make);

		setVehicleNumber(vehicleNumber);

		setFuelType(fuelType);

		setFuelCapacity(fuelCapacity);

		setCc(cc);

	}

	public void displayMake() {

		System.out.println("***" + getMake() + "***");

	}

	public void displayBasicInfo() {

		System.out.println("---Basic Information---");

		System.out.println(

				"Vehicle Number: " + getVehicleNumber() + '\n' +

						"Fuel Capacity: " + getFuelCapacity() + '\n' +

						"Fuel Type: " + getFuelType() + '\n' +

						"CC: " + getCc());

	}

	public void displayDetailInfo() {

	}

}