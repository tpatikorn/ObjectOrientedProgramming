package week2;

public class Main {

	
	public static void main(String args[]) {
		Sedan car1 = new Sedan(4, 100.75, "V8");
		Sedan car2 = new Sedan(0, 999.99, "V99");

		
		int wheels = car1.getWheels();		
		wheels = 6;

		String s = car1.getSummary();
		System.out.println(s);
		System.out.println(car1.horsepower);
		System.out.println(car1.getWheels());
		
		
		System.out.println(car2.getSummary());
	}
	
}
