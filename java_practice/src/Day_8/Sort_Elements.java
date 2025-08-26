package Day_8;
//Sort Elements 
import java.util.ArrayList;
import java.util.Collections;

public class Sort_Elements {

	public static void main(String[] args ) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(3);
		al.add(5);
		al.add(1);
		al.add(8);
		al.add(4);
		al.add(9);
		al.add(0);
		System.out.println("original list:"+al);
		Collections.sort(al);
		System.out.println("sorted list:"+al);
	}

}
