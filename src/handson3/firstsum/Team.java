package handson3.firstsum;

public class Team {

	private String name;

	private String coach;

	private String location;

	private String players;

	private String captain;

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getCoach() {

		return coach;

	}

	public void setCoach(String coach) {

		this.coach = coach;

	}

	public String getLocation() {

		return location;

	}

	public void setLocation(String location) {

		this.location = location;

	}

	public String getPlayers() {

		return players;

	}

	public void setPlayers(String players) {

		this.players = players;

	}

	public String getCaptain() {

		return captain;

	}

	public void setCaptain(String captain) {

		this.captain = captain;

	}

	Team(String name, String coach, String loc, String player, String captain) {

		this.name = name;

		this.coach = coach;

		this.location = loc;

		this.players = player;

		this.captain = captain;

	}

	Team() {

	}

}