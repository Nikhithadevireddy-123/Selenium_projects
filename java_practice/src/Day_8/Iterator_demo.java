package Day_8;
//Iterate using Iterator
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Iterator_demo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("hyd");
		al.add("wrgl");
		al.add("ngl");
		al.add("krm");
		al.add("kmm");
		System.out.println(al);
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
