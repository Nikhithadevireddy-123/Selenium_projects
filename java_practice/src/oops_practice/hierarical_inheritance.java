package oops_practice;

class Vehical
{
	void start(String st)
	{
		System.out.println("starts with:"+st);
	}
	void stop(String st)
	{
		System.out.println("stops with:"+st);
	}
}
 class Car extends Vehical
 {
	 void type_of_car(String type)
		{
			System.out.println(type+ " car");
		}
		void no_of_seats(int st)
		{
			System.out.println("number of seats:"+st);
		}
	 
 }
 class Ertica extends Car
 {
	 void color(String color)
		{
			System.out.println("color is:"+color);
		} 
 }
 class Scooter extends Vehical
 {
	 void type_of_Scooter(String type)
		{
			System.out.println(type+ "Scooter");
		}
		void no_of_seats(int st)
		{
			System.out.println("number of seats:"+st);
		}	 
 }
 class Activa extends Scooter
 {
	 void speed(int sp)
	 {
		 System.out.println("speed:"+sp);
	 }
 }
 
public class hierarical_inheritance {

	public static void main(String[] args) {
		System.out.println("***BAKENO CAR***");
		Car b=new Car();
		b.start("key or button");
		b.stop("key or button");
		b.type_of_car("petrol");
		b.no_of_seats(5);
	    //b.color("white");
		
		System.out.println("*****ertica*******");
		Ertica b1=new Ertica();
		b1.start("key or button");
		b1.stop("key or button");
		b1.type_of_car("petrol and diesel");
		b1.no_of_seats(7);
	    //b.color("blue");
		
		System.out.println("*****activa*******");
		Ertica b2=new Ertica();
		b2.start("key or button");
		b2.stop("key or button");
		b2.type_of_car("diesel");
		b2.no_of_seats(3);
	  
		
		
		 

	}

}
