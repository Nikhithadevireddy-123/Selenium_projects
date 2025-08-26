package assignment_day4;

class Hostel
{
	Hostel()
	{
		System.out.println("Who have to join in this hostel,must follow some rules:");
		System.out.println("1.student age should be 18+");
		System.out.println("2.there are hostel timings like mrng 6 to nyt 10");
		
	}
}
class girlshostel extends Hostel
{
	girlshostel()
	{
		super();
		System.out.println("but food is very delicious in this hostel");
	}
	
}
public class use_of_superkeyword {

	public static void main(String[] args) {
		girlshostel obj=new girlshostel();

	}

}
