package collections_demo;

import java.util.Map;

public class Hashmap_demo {

	public static void main(String[] args) {
		Map<String,Integer> map=Hashmap<String,Integer>();
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
		//System.out.println(map.get("Three));
		map.replace("Nine", "")
				

	}

}
