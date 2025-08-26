package oops_practice;
class Vehicle
{
	int speed=90;
}
class car extends Vehicle
{
	int speed=100;
	void showspeed()
	{
		System.out.println("car normal speed ="+speed);//100 normal printing
		System.out.println("car normal speed ="+speed);//100 using this keyword
		System.out.println("vehicle normal speed ="+super.speed);//90 using super keyword
	}
}

public class thiskeyword_example {

	public static void main(String[] args) {
		car c=new car();
		c.showspeed();

	}

}
