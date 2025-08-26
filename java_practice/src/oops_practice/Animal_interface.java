package oops_practice;

interface Animal1 {
	void eat();
	void sound();
	default void show()
	{
		System.out.println("hello");
	}
}
class Dog1 implements Animal1
{
	public void eat()
	{
		System.out.println("royal canin");
	}
	public void sound()
	{
		System.out.println("barking");
	}

public class Animal_interface{
	

	public static void main(String[] args) {
		Dog1 max=new Dog1();
		max.eat();
		max.sound();
	}
		

	}

}
