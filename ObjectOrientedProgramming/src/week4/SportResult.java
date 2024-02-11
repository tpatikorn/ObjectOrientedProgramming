package week4;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class SportResult {

	public enum Result {
		TEAM1WIN, TEAM2WIN, DRAW, CANCELED
	}

	protected Sport sport;
	protected Team team1;
	protected Team team2;
	private Result result;

	public SportResult(Sport sport, Team team1, Team team2) {
		super();
		this.sport = sport;
		if ((team1.getTeamMembers().size() == sport.getValidTeamSize())
				&& (team2.getTeamMembers().size() == sport.getValidTeamSize())) {
			this.team1 = team1;
			this.team2 = team2;
			this.result = this.calculateResult();
		} else {
			throw new RuntimeException(
					"Team of sport " + sport.getName() + "must be of size " + sport.getValidTeamSize() + ". Given "
							+ this.team1.getTeamMembers().size() + " and " + this.team1.getTeamMembers().size());
		}
	}

	protected Result calculateResult() {
		return Result.CANCELED;
	}

	public Sport getSport() {
		return sport;
	}

	public Team getTeam1() {
		return team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public Result getResult() {
		return this.result;
	}

	public static void main(String args[]) {
		Sport fb = new Football();
		Sport bb = new Basketball();
		Team fb1 = new Team("MUFC", fb, null);
		Team fb2 = new Team("LPFC", fb, null);
		Team bb1 = new Team("RMUTSB Basketball Club", bb, null);

		List<Team> bus = new ArrayList<Team>();
		bus.add(fb1);
		bus.add(fb2);
		bus.add(bb1);

		for (int i = 0; i < bus.size(); i++) {
			System.out.println(i);
			System.out.println(bus.get(i).getSport().getSportDetails());
		}
	}

}
