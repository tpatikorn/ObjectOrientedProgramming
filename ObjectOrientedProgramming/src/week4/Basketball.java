package week4;

public class Basketball implements Sport { // inherit from Sport

	public Basketball() {
		super();
	}

	@Override
	public String getName() {
		return "Basketball";
	}

	@Override
	public String getRule() {
		return "ball in hoop = WIN";
	}

	@Override
	public int getValidTeamSize() {
		return 5;
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

}
