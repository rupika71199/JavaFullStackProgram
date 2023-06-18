package handson2.fifthsum;

public class FourWheeler extends Vehicle {

	private String audioSystem;

	private int numberOfDoors;

	public String getAudioSystem() {

		return audioSystem;

	}

	public void setAudioSystem(String audioSystem) {

		this.audioSystem = audioSystem;

	}

	public int getNumberOfDoors() {

		return numberOfDoors;

	}

	public void setNumberOfDoors(int numberOfDoors) {

		this.numberOfDoors = numberOfDoors;

	}

	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audio,
			int no) {

		super(make, vehicleNumber, fuelType, fuelCapacity, cc);

		setAudioSystem(audio);

		setNumberOfDoors(no);

	}

	public void displayDetailInfo() {

		System.out.println("---Detail Information---" + '\n' +

				"Audio System: " + getAudioSystem() + '\n' +

				"Number of Doors: " + getNumberOfDoors()

		);

	}

}