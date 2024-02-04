package week3;

import java.util.ArrayList;
import java.util.Map;

import java.util.List;
import java.util.HashMap;

public abstract class Sport {

	enum Result {
		TEAM1WIN, TEAM2WIN, DRAW, CANCELED
	}

	private String name;
	private String rule;
	ArrayList<String> team1PlayerNames;
	ArrayList<String> team2PlayerNames;
	Result result;

	public Sport(ArrayList<String> team1PlayerNames, ArrayList<String> team2PlayerNames, 
			Result result) {
		super();
		
		this.team1PlayerNames = new ArrayList<String>();
		team1PlayerNames.addAll(team1PlayerNames);
		
		this.team2PlayerNames = new ArrayList<String>();
		team1PlayerNames.addAll(team2PlayerNames);

		this.result = result;
	}
	
}
