package week3;

import java.util.ArrayList;

public class Football extends Sport { // inherit from Sport

	public Football(
			ArrayList<String> team1PlayerNames, 
			ArrayList<String> team2PlayerNames, 
			Result result) {
		super(team1PlayerNames, team2PlayerNames, result);
		if ((team1PlayerNames.size() == 11) && (team2PlayerNames.size() == 11)) {
			this.name = "Football";
			this.rule = "punch the face = WIN";
			this.team1PlayerNames = team1PlayerNames;
			this.team2PlayerNames = team2PlayerNames;
		} else {
			throw new RuntimeException("invalid player numbers");
		}
	}

	public static void main(String args[]) {
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Ronaldo1");
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("Ronaldo2");
		Football newFootball = new Football(names1, names2, Result.DRAW); // this will die because player numbers don't match
		System.out.println(newFootball.team1PlayerNames);
		System.out.println(newFootball.getName());
		System.out.println(newFootball.getResult());
	}
}
