package week4;

// interface 
public interface Sport {
	public String getName();
	public String getRule();
	public int getValidTeamSize();

	// default = when implemented, you get this implementation by default
	public default boolean isValidSubPlayerCount(int playerCount) {
		return (playerCount == 0);
	}

	public default String getSportDetails() {
		return "Sport name: " + this.getName() + "\n" + 
			   "Sport rule: " + this.getRule() + "\n" + 
	           "Sport team size: " + this.getValidTeamSize();
	}
}
