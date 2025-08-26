package Day_6;

abstract class Animal{
	abstract void makesound();
}
class Dog extends Animal
{
	void makesound() {
		System.out.println("woof");
	}
	 void fetch() {
		System.out.println("Dog is fetching");
	}
	
}

public class object_typecasting {
	public static void main(String[] args) {
		Dog d=new Dog();
		Animal a =d;
		a.makesound();
		

	}

}
