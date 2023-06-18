package handson2.firstsum;

public class Venue {

	private String name;

	private String city;

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getCity() {

		return city;

	}

	public void setCity(String city) {

		this.city = city;

	}

	Venue() {

		this(null, null);

	}

	Venue(String name, String city) {

		setName(name);

		setCity(city);

	}

	@Override

	public String toString() {

		return getName() + "," + getCity();

	}

}