package oops_practice;

class School {
	School()
	{
		System.out.println("one particular format uniform");
		System.out.println("follow patterns like CBSE");
		System.out.println("follow timings between 7 to 5");
	}
}
class SNBP extends School
{
	SNBP()
	{
		super();
		System.out.println("70% study and 30% sports oriented school");
	}
}
	public class Superkeyword_school{
		public static void main(String[] args) {
			SNBP snbp=new SNBP();
		}
	}
