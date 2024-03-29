package week5;

public class ExceptionExample {

	static double calculateBMICM(double weight, double heightCM) {
		double heightM;
		try {
			heightM = heightCMtoM(heightCM);
		} catch(Exception e2) {
			System.out.println("oh no nooooo");
			heightM = 0;
		}
		double bmi = calculateBMI(weight, heightM);
		return bmi;
	}

	static double calculateBMI(double weight, double height) {
		return weight / (height * height);
	}

	static double heightCMtoM(double height) throws LessThanZeroException {
		if (height < 0) {
			throw new LessThanZeroException("ส่วนสูงติดลบไม่ได้");
		}
		return height / 100;
	}

	public static void main(String args[]) {
		System.out.println(calculateBMICM(60, -160));
		System.out.println(calculateBMI(60, 1.60));
	}

	// stacktrace

}
