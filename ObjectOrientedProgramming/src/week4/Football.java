package week4;

public class Football implements Sport, Outdoor { // inherit from Sport

	public Football() {
		super();
	}

	@Override // << @annotation
	public String getName() {
		return "Football";
	}

	@Override
	public String getRule() {
		return "punch the face = WIN";
	}

	@Override
	public int getValidTeamSize() {
		return 11;
	}

	@Override
	public boolean isValidSubPlayerCount(int playerCount) {
		return ((0 <= playerCount) && (playerCount <= 3));
		// if ((0 <= playerCount) && (playerCount <= 3)) {
		// return true;
		// } else {
		// return false;
		// }
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

}
