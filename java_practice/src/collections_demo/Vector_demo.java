package collections_demo;

import java.util.Iterator;
import java.util.Vector;

public class Vector_demo {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Orange");
		v.add("Blue");
		v.add("White");
		v.add("Black");
		v.add("Gray");
		v.add(null);
		v.add("Black");
		System.out.println(v);
		System.out.println(v.indexOf("Black"));
		System.out.println(v.subList(0, 3));
		System.out.println(v.get(3));
		System.out.println(v.getFirst());
		System.out.println(v.getLast());
		System.out.println(v.indexOf("White"));
		System.out.println(v.isEmpty());
		v.remove(0);
		System.out.println(v);
		v.remove("Gray");
		System.out.println(v);
		System.out.println(v.reversed());
		Iterator<String> itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
		//using listIterator
		Iterator<String> itsr=v.listIterator();
		while(itsr.hasNext())
		{
			System.out.println(itsr.next()+" ");
		}
		

	}

}
