package collections_demo;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
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
		set.remove("water");
		System.out.println(set);
		set.add("oil");
		System.out.println(set);
		set.clear();
		System.out.println(set);
		System.out.println(set.isEmpty());
		
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		

	}

}
