package week3;

import java.util.ArrayList;

public abstract class Sport {

	enum Result {
		TEAM1WIN, TEAM2WIN, DRAW, CANCELED
	}

	protected String name;
	protected String rule;
	protected ArrayList<String> team1PlayerNames;
	protected ArrayList<String> team2PlayerNames;
	private Result result;

	public Sport(ArrayList<String> team1PlayerNames, ArrayList<String> team2PlayerNames, Result result) {
		super();
		this.team1PlayerNames = team1PlayerNames;   	  // pass by reference (pointer) -> original list change = inside change
		this.team2PlayerNames = new ArrayList<String>();  // copy references to elements -> original list change = no change
		this.team2PlayerNames.addAll(team2PlayerNames);   
		this.result = result;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getRule() {
		return this.rule;
	}
	
	public Result getResult() {
		return this.result;
	}

	public int getNumber() {
		return 2024;
	}

}
