package week3;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String args[]) {

		ArrayList<String> names = new ArrayList<String>();

		names.add("ronaldo");
		names.add("Steve Roger");
		names.add("Tony Stark");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(3);
		numbers.add(5);
		numbers.add(8);
		numbers.add(3);
		
		numbers.remove(3);
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		names.remove("Steve Roger");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	
	}
}
