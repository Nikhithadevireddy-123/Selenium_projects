package assignment_day4;

class Shape{
	void area()
	{
		System.out.println("calculate area in shape");
		
	}
}
class circle extends Shape{
	double radius=5;
	
	void area() {
		double result=Math.PI*radius*radius;
		System.out.println("area of circle:"+result);
		
	}
}

class rectangle extends Shape{
	double length=6;
	double breadth=4;
	
	void area() {
		double result=length*breadth;
		System.out.println("area of reactangle:"+result);
		
	}
}

public class Areas_byusing_overriding {

	public static void main(String[] args) {
		Shape s1=new circle();
		s1.area();
		Shape s2=new rectangle();
		s1.area();

	}

}
