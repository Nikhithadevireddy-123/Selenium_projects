package Abstract_demo;

abstract class Animal{
		void eat()
		{
			System.out.println("eating");
		}
	abstract void sound();
	}
	class Dog extends Animal
	{
		void sound()
		{
			System.out.println("sound=barking");
		}
	}
	class Tiger extends Animal
	{
		void sound()
		{
			System.out.println("sound=Roarr");
		}
	}
public class Animal_demo{
	public static void main(String[] args) {
		Dog a=new Dog();
		a.sound();
		Tiger t=new Tiger();
		t.sound();
		
		
		
	}
		

}


