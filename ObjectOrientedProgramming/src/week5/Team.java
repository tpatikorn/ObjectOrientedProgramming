package week5;

import java.util.List;

import week4.Sport;

public class Team {
	private String name;
	private Sport sport;
	private List<Player> teamMembers;

	public String getName() {
		return name;
	}

	public Sport getSport() {
		return sport;
	}

	public List<Player> getTeamMembers() {
		return teamMembers;
	}

	public Team(String name, Sport sport, List<Player> teamMembers) {
		super();
		this.name = name;
		this.sport = sport;
		this.teamMembers = teamMembers;
	}

	public int getAttack() {
		return 0;
	}

	public int getDefense() {
		return -10;
	}
}
