package handson2.secondsum;

public class Player {

	private String name;

	private String country;

	private String skill;

//Getters and Setters  

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getCountry() {

		return country;

	}

	public void setCountry(String country) {

		this.country = country;

	}

	public String getSkill() {

		return skill;

	}

	public void setSkill(String skill) {

		this.skill = skill;

	}

//Parameterized constructor with 3 arguments  

	Player(String n, String c, String s) {

		setName(n);

		setCountry(c);

		setSkill(s);

	}

	@Override

	public String toString() {

		return getName() + "  " + getCountry() + "  " + getSkill();

	}

}