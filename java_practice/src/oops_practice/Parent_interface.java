package oops_practice;

interface Parent{
	void flat();
	void car();
}
interface parent2
{
	void flat();
	void bike();
	
}
class Child implements Parent,parent2
{
	public void bike() {
		System.out.println("sports bike");
	}
	public void flat() {
		System.out.println("2bhk flat");
	}
	public void car() {
		System.out.println("sports car");
	}
	
}
public class Parent_interface{
	public static void main(String[] args) {
		Child soham=new Child();
		soham.bike();
		soham.car();
		soham.flat();
		
	}
	
}
