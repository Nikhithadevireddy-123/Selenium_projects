package Day_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Sorting_linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(50);
		list.add(30);
		System.out.println(list);
		Collections.sort(list);
		System.out.println("sorted list:"+list);
		

	}

}
