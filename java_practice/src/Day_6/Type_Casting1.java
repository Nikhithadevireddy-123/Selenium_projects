package Day_6;

public class Type_Casting1 {
	public void behaviour() {
		int x=5;
		//x=(x+4.5);//error because cannot convert from double to int
		x+=4.5;
		System.out.println("result:"+x);
		
	}

	public static void main(String[] args) {
		Type_Casting1 t=new Type_Casting1();
		t.behaviour();
		

	}

}
