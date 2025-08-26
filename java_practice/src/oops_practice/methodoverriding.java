package oops_practice;

class Animal
{
	void eat()
	{
		System.out.println("eating");
	}
	void sound()
	{
		System.out.println("sound");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("eats=royal canin");
	}
	void sound()
	{
		System.out.println("sound=barking");
	}
}
class Tiger extends Animal
{
	void eat()
	{
		System.out.println("eats=meat");
	}
	void sound()
	{
		System.out.println("sound=Roarr");
	}
}

public class methodoverriding {

	public static void main(String[] args) {
		System.out.println("****Dog*****");
		Dog max=new Dog();
		max.eat();
		max.sound();
		System.out.println("****Tiger*****");
		Tiger max1=new Tiger();
		max1.eat();
		max1.sound();


	}

}
