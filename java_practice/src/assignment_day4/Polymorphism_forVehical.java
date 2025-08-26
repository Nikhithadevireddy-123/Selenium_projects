package assignment_day4;

//Runtime Polymorphism with constructor Chaining


class vehicle{
	vehicle()
	{
		System.out.println("Vehicle Created");
	}
	void start() {
		System.out.println("vehicle is starting..");
	}
	
}
class Bike extends vehicle{
	Bike(){
		super();
		System.out.println("bike created");
	}
	
	void start() {
		System.out.println("bike is starting..");
	}
}
public class Polymorphism_forVehical {

	public static void main(String[] args) {
		vehicle v=new Bike();
		v.start();

	}

}
