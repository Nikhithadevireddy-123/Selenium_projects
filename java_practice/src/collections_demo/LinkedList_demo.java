package collections_demo;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_demo {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(0);
		list.add(1);		
		list.add(2);
		list.add(3);
    	list.add(4);
		list.add(5);
		
	   Object clonelist1=new LinkedList<Object>();
	   clonelist1=list.clone();
	   System.out.println("original linkedlist="+list);
	   System.out.println("clone linkedlist="+clonelist1);
	   
	   
		
		
		
		
		
		

	}

}
