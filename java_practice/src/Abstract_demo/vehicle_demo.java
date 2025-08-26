package Abstract_demo;
abstract class Vehicle
{
	abstract void no_of_tyre();
	abstract void no_of_seats();
	abstract void run_on();
	void start_stop()
	{
		System.out.println("vehicle start on fuel and stops with button");
	}
	
}
class Car extends Vehicle
{
	void no_of_tyre()
	{
		System.out.println("4 wheels");
	}
	void no_of_seats()
	{
		System.out.println("5 or 7 seats");
	}
	void run_on()
	{
		System.out.println("Car run on petrol,disel or battery");
	}
}
class Scooter extends Vehicle
{
	void no_of_tyre()
	{
		System.out.println("2 wheels");
	}
	void no_of_seats()
	{
		System.out.println("2 or 3 seats");
	}
	void run_on()
	{
		System.out.println("Scooter run on petrol,disel or battery");
	}
	
}

public class vehicle_demo {

	public static void main(String[] args) {
		System.out.println("******Car********");
		Car v=new Car();
		v.no_of_tyre();
		v.no_of_seats();
		v.run_on();
		System.out.println("******Scooter********");
		Scooter s=new Scooter();
		v.no_of_tyre();
		v.no_of_seats();
		v.run_on();
		
		
		
		

	}

}
