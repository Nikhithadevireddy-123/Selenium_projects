package collections_demo;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_prac {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Orange");
		map.put(2, "Mango");
		map.put(3, "Banana");
		map.put(4, "Watermelon");
		map.put(10, "Muskmelon");
		map.put(5, "Kiwi");
		System.out.println(map);
		map.put(4, "Grapes");
		System.out.println(map);
		map.put(null, "Dragon");
		map.put(null, null);
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map);
		
		

	}

}
