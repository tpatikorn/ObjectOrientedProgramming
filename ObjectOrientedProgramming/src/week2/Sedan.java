package week2;

// 1. structure
// 2. data - properties -> noun/adj
// 3. action - behavior -> verb

public class Sedan {
	
	// 1 structure
	private int wheels = 4;
	public int doors;
	public double horsepower;
	public String engine_type;  // come back later
	char tea = 't';
	
	// 1.2 constructor
	public Sedan(int doors, double horsepower, String engine_type) {
		// 2 data
		if((doors == 2) || (doors == 4)) {
			this.doors = doors;
		} else {
			// code should die
			throw new RuntimeException("doors must be 2 or 4");
		}
		this.horsepower = horsepower;
		this.engine_type = engine_type;
	}

	// 3 action
	public int getWheels() {
		return this.wheels;
	}
	
	public void printWheels() {
		System.out.println(this.wheels);
	}
	
	
	public String getSummary() {
		return "wheels->" + this.wheels + " doors->" + this.doors + " HP->" + this.horsepower + " engine->" + this.engine_type;
	}
	
}
