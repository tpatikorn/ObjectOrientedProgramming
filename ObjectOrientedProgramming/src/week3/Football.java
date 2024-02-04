package week3;

import java.util.ArrayList;

public class Football extends Sport { // inherit from Sport

	
	public Football(ArrayList<String> team1PlayerNames, 
			ArrayList<String> team2PlayerNames, Result result) {
		super(team1PlayerNames, team2PlayerNames, result);
		this.name = "Football";
		this.rule = "punch the face = WIN";
		System.out.println(super.getNumber());
	}

	public static void main(String args[]) {
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Ronaldo1");
		
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("Ronaldo2");
		Football newFootball = new Football(names1, names2, Result.DRAW);
		System.out.println(newFootball.team1PlayerNames);
		
		names1.add("Hello World");
		names2.add("xxxxxxxxxxx");
		System.out.println(names1);
		System.out.println(names2);
		System.out.println(newFootball.team1PlayerNames);
		System.out.println(newFootball.team2PlayerNames);
		
		System.out.println(newFootball.getName());
		System.out.println(newFootball.getResult());
	}
}
