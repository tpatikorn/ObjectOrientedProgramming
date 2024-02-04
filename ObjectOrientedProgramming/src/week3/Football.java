package week3;

import java.util.ArrayList;

public class Football extends Sport {

	
	public Football(ArrayList<String> team1PlayerNames, 
			ArrayList<String> team2PlayerNames, Result result) {
		super(team1PlayerNames, team2PlayerNames, result);
	}

	public static void main(String args[]) {
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Ronaldo1");
		
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("Ronaldo2");
		Football s = new Football(names1, names2, Result.DRAW);
		
		System.out.println(s.result);
	}
}
