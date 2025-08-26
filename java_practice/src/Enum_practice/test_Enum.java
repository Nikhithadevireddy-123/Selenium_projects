package Enum_practice;
enum Day{Monday,Saturday}

public class test_Enum {

	public static void main(String[] args) {
		Day today=Day.Saturday;
		Day todaym=Day.Monday;
		System.out.println("today is:"+today);
		System.out.println("day after tommorow is:"+todaym);

	}

}
