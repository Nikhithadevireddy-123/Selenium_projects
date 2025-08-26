package Day_7;

class Student {
	String name;
	int marks;
	public Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	public void updatemarks(int newmarks)
	{
		this.marks=marks;
	}

	public static void main(String[] args) {
		Student s=new Student("nikki",67);
		System.out.println("before update:" +s.name +"s marks =" +s.marks);
		s.updatemarks(89);
		System.out.println("after update:" +s.name +"s marks =" +s.marks);
		

	}

}
