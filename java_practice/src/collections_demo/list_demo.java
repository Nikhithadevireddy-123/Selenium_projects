package collections_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class list_demo {

	public static void main(String[] args) {
		//add group of elements with list interface method "of"
		//ArrayList<Integer> list=new ArrayList<>(List.of(50,70,80,40,50));
		//Collections.sort(list);
		//System.out.println(list);
		List<String> list=new ArrayList<String>();
		list.add(0,"Apple");
		list.add(1,"Mango");
		list.add(2,"Kiwi");
		list.add(3,"Banana");//String
		System.out.println(list);
		System.out.println(list.get(3));
		list.set(2,"Orange");//replace current element
		System.out.println(list);
		list.add(3,"Kiwi");//add element on particular index
		System.out.println(list);
		System.out.println(list.contains("Banana"));
		System.out.println(list.equals("banana"));//false
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.indexOf("Kiwi"));
		System.out.println(list.isEmpty());
		list.remove(0);
		System.out.println(list);
		list.remove("Kiwi");
		System.out.println(list);
		System.out.println(list.reversed());
		//using iterator
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//using listIterator
		Iterator<String> itsr=list.listIterator();
		while(itsr.hasNext())
		{
			System.out.println(itsr.next());
		}
		
	

	}

}
