package week4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Player {
	private String name;
	private Calendar dateOfBirth;
	private Sex sex;

	public enum Sex {
		MALE, FEMALE
	}

	public Player(String name, Calendar dateOfBirth, Sex sex) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}
	
	public Sex getSex() {
		return sex;
	}

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
		String dateText = dateFormat.format(dateOfBirth.getTime());
		return "Player [name=" + name + ", dateOfBirth=" + dateText + ", sex=" + sex + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, name, sex);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;  // type casting
		return Objects.equals(dateOfBirth, other.dateOfBirth) && 
				Objects.equals(name, other.name) && 
				sex == other.sex;
	}

	public static void main(String args[]) {
		if(args.length == 3) { // ครบ
			String name = args[0];
			String sex_input = args[1];
			Sex sex; 
			if(sex_input.equals("MALE")) {
				sex = Sex.MALE;
			} else {
				sex = Sex.FEMALE;
			}
			String dob = args[2];
			// int day = (int) dob.substring(0, 2); // type-casting. 
			// Only good use case is superclass that you know the subclass -> subclass
			
			int day = Integer.parseInt(dob.substring(0, 2));
			int month = Integer.parseInt(dob.substring(3, 5));
			int year = Integer.parseInt(dob.substring(6, 10));
			
			Calendar cal = new GregorianCalendar(year, month, day);
			System.out.println(name + sex + dob);
			Player mainPlayer1 = new Player(name, cal, sex);
			Player mainPlayer2 = new Player(name, cal, sex);
			System.out.println(mainPlayer1);
			System.out.println(mainPlayer2);
			System.out.println(mainPlayer1.equals(mainPlayer1));
			System.out.println(mainPlayer1.equals(mainPlayer2));
		} else {
			System.out.println("You must provide name, sex, and dateOfBirth");
		}
	}

}
