package Enum_practice;

public class enum_ifblock {

	public static void main(String[] args) {
		enum Day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday};
		Day today=Day.Sunday;
		if(today==Day.Saturday || today==Day.Sunday)
		{
			System.out.println("its a weekend");
		}
		else
		{
			System.out.println("its a weekday");
		}

	}

}
