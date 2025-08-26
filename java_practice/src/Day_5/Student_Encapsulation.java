package Day_5;

class Student {
	private String Studentname;
	private int Studentrollno;
	private int Studentmarks;
	
	public Student(String Studentname,int Studentrollno,int Studentmarks)
	{
		this.Studentname=Studentname;
		this.Studentrollno=Studentrollno;
		if(Studentmarks>=0 && Studentmarks<=100)
		{
			this.Studentmarks = Studentmarks;	
		}
		else
		{
			this.Studentmarks=0;
		}
	}
	public String getname() {
		return Studentname;
	}
	public int getrollno() {
		return Studentrollno;
	}
	public int getmarks() {
		return Studentmarks;
	}
	
	public void displayDetails() {
		System.out.println("Studentname:"+ Studentname);
		System.out.println("Studentrollno:"+ Studentrollno);
		System.out.println("Studentmarks:"+ Studentmarks);
	}

//for future versions
public void inputMarks(int newMarks) 
{
 if (newMarks > Studentmarks) 
    { 
     if (newMarks >= 0 && newMarks <= 100) 
     {
         this.Studentmarks = newMarks;
     } 
     else 
     {
         System.out.println("Invalid marks provided. Marks must be between 0 and 100.");
     }
 } 
 else {
     System.out.println("Marks cannot be reduced.");
 }
}
}
public class Student_Encapsulation {
    public static void main(String[] args) {
    	Student student1 = new Student("nikki", 1, 65);
    	Student student2 = new Student("chinni", 2, 70); 
    	Student student3 = new Student("chintu", 3, 80); 

        System.out.println("1st Student Details:");
        student1.displayDetails();
        System.out.println("2nd Student Details:");
        student2.displayDetails();
        System.out.println("3rd Student Details:");
        student3.displayDetails();

        System.out.println("Updating 3st Student marks:");
        student3.inputMarks(90); 
        student3.displayDetails();
        student3.inputMarks(85); 
        student3.displayDetails();
    }
}


