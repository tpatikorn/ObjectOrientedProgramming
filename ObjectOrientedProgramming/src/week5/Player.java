package week5;

import java.util.Calendar;

public class Player extends week4.Player {
	private PlayStyle ps;

	public Player(String name, Calendar dateOfBirth, Sex sex, PlayStyle ps) {
		super(name, dateOfBirth, sex);
		this.ps = ps;
	}

	public PlayStyle getPlayStyle() {
		return ps;
	}
}
