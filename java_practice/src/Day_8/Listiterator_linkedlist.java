package Day_8;
// Iterate using ListIterator 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Listiterator_linkedlist {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("hyd");
		list.add("wrgl");
		list.add("ngl");
		list.add("krm");
		list.add("kmm");
		System.out.println(list);
		//forward direction
		System.out.println("forward direction:");
		ListIterator<String> itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---------------------");
		System.out.println("reverse direction:");
		//reverse direction
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		

	}

}
