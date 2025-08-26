package collections_demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap_prac {

	public static void main(String[] args) {
		Map<String,String> map=new LinkedHashMap<String,String>();
		map.put("One", "Orange");
		map.put("Four", "Mango");
		map.put("Three", "Banana");
		map.put("Five", "Watermelon");
		map.put("Ten", "Muskmelon");
		map.put("Two", "Kiwi");
		map.put("Two", "Muskmelon");
		map.put(null, "nothing");
		map.put("Nine", "CursturdApple");
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
