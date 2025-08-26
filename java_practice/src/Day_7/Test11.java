package Day_7;

class Test1 {
	int value;
	public Test1(int value)
	{
		this.value=value;
	}
}
public class Test11{
	public static void modifyobjects(Test1 obj){
		obj.value =200;
	}
	
	public static void main(String[] args)
	{
		Test1 t=new Test1(100);
		System.out.println("before method calling:"+t.value);
		modifyobjects(t);
		System.out.println("after method calling:"+t.value);
	}

}
