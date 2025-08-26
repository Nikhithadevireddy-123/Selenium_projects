package Day_8;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_to_Arraylist {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("bike");
		list.add("car");		
		list.add("scooty");
		System.out.println("linkedlist:"+list);
		//converting from linkedlist to arraylist
		ArrayList<String> al=new ArrayList<>(list);
		System.out.println("arraylist:"+al);
		


	}

}
