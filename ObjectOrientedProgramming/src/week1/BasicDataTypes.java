package week1;

import java.util.ArrayList;

public class BasicDataTypes {
	public static void main(String[] args) {
		/*
		 * Basic data types
		 * 
		 * text [String of characters -> String] 
		 * - first_name 
		 * - last_name 
		 * - sex 
		 * - national_id 
		 * - array/list 
		 * - phone_number 
		 * - array/list
		 * 
		 * true/false [Boolean/bool] comes from George Boole 
		 * - graduate_from_highshool
		 * 
		 * one of many [enumeration -> enum] 
		 * - highest education 
		 * - marriage status
		 * 
		 * whole number/integer [Integer -> int] 
		 * - age 
		 * - number of siblings 
		 * - number of cars
		 * 
		 * decimal [Floating point numbers -> float] [double-precision floating point number -> double] 
		 * - weight 
		 * - height 
		 * - GPA
		 * 
		 * Date 
		 * - date_of_birth
		 * 
		 * 
		 */

		String first_name = "Steve";
		String last_name = "Roger";
		int age = 104;
		double height = 295.2;
		float weight = 99.6f;
		boolean isMale = true;

		System.out.println(first_name + last_name + age + height + weight + isMale);

		double bmi = weight / ((height / 100) * (height / 100));

		// loop
		if (bmi > 25) {
			System.out.println("greater than 25");
		} else if (bmi < 15) {
			System.out.println("less than 15");
		} else {
			System.out.println(bmi);
		}

		// repeating tasks
		for (int i = 0; i < 100; i = i + 1) {
			System.out.print(" " + i);
		}
		System.out.println("end for");

		int j = 0;
		while (j < 100) {
			System.out.print(" " + j);
			j = j + 1;
		}
		System.out.println("end while" + j);

		for (; j < 200;) {
			System.out.print(" " + j);
			j = j + 1;
		}
		System.out.println("end for");

		// enumeration = enum and switch case
		enum Country {
			USA, UK, THAILAND, JAPAN, CHINA
		}

		Country captainAmericaNation = Country.USA;
		Country ShangChiNation = Country.CHINA;

		ArrayList<Country> nations = new ArrayList<Country>();
		nations.add(captainAmericaNation);
		nations.add(ShangChiNation);

		for (int i = 0; i < nations.size(); i++) {
			Country nation = nations.get(i);

			// best use of
			switch (nation) {
			case USA:
				System.out.println("United States of America");
				break;
			case UK:
				System.out.println("United Kingdom");
				break;
			case CHINA:
				System.out.println("Zhong Gua");
				break;
			case THAILAND:
				System.out.println("Pra Ted Tai");
				break;
			case JAPAN:
				System.out.println("Nihon");
				break;
			}
		}

	}

}
