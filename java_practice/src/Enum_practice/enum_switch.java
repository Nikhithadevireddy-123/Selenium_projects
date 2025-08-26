package Enum_practice;

public class enum_switch {
enum day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
	public static void main(String[] args) {
		day today=day.Monday;
		switch(today) 
		{
		case Monday:System.out.println("today is monday");
		break;
		case Tuesday:System.out.println("today is Tuesday");
		break;
		case Wednesday:System.out.println("today is Wednesday");
		break;
		case Thursday:System.out.println("today is Thursday");
		break;
		case Friday:System.out.println("today is Friday");
		break;
		case Saturday:System.out.println("today is Saturday");
		break;
		case Sunday:System.out.println("today is Sunday");
		break;
		
		}

	}

}
