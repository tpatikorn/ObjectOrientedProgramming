package week3;

import java.util.ArrayList;

public class Basketball extends Sport { // inherit from Sport

	public Basketball(ArrayList<String> team1PlayerNames, ArrayList<String> team2PlayerNames, Result result) {
		super(team1PlayerNames, team2PlayerNames, result);
		if ((team1PlayerNames.size() == 5) && (team2PlayerNames.size() == 5)) {
			this.name = "Basketball";
			this.rule = "ball in hoop = WIN";
		} else {
			throw new RuntimeException("invalid player numbers");
		}
	}

	public static void main(String args[]) {
		ArrayList<String> names1 = new ArrayList<String>();
		ArrayList<String> names2 = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			names1.add("Team 1 player " + i);
			names2.add("Team 2 player " + i);
		}
		Basketball newBasketball = new Basketball(names1, names2, Result.TEAM1WIN);
		System.out.println(newBasketball.team1PlayerNames);

		System.out.println(newBasketball.getName());
		System.out.println(newBasketball.getResult());
	}
}
