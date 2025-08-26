package collections_demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset_demo {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("maggie");
		set.add("pasta");
		set.add("salt");
		set.add("chocolate");
		set.add("water");
		set.add("water");
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		System.out.println(set.clone());
		System.out.println(set.contains("pasta"));
		System.out.println("First element="+set.getFirst());
		System.out.println("First element="+set.getLast());
		System.out.println(set);
		//System.out.println(set.isEmpty());
			
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
