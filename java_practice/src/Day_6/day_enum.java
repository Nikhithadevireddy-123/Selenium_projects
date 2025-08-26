package Day_6;

import java.util.Scanner;
public class day_enum{
	
public class DayChecker {
	enum Day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday};
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a day of the week:");
		String daynameInput =sc.nextLine().toUpperCase();
		try {
			DayChecker day=DayChecker.valueOf(daynameInput);
			System.out.println("position via ordinal"+day +";"+day.ordinal());
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
