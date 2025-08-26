package oops_practice;

class Software_testing {
	void Syllabus()
	{
		System.out.println("software testing course details");
		System.out.println("manual testing,core java,selenium webdriver,jira(project management),Mysql(database");
		System.out.println(50000);
	}
}
class Manual extends Software_testing
{
	void manual_testing()
	
	{
		super.Syllabus();
		System.out.println("if it is manual testing only \n then it includes manual testing concepts,jira,mysql");
	}
}
class Automation extends Software_testing
{
	void Automation_testing()
	
	{
		super.Syllabus();
		System.out.println("if it is automation testing only \n then it includes core java,selenium webdriver");
	}
}
	
public class superkeyword_testing{
	
	public static void main(String[] args) {
		System.out.println("***** manual testing *******");
		Manual mn=new Manual();
		mn.manual_testing();
		System.out.println("***** automation testing *******");
		Automation Au=new Automation();
		Au.Automation_testing();
		

	}

}
