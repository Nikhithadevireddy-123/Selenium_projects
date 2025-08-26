package Day_8;
//Create and Display a LinkedList
import java.util.LinkedList;

public class Display_linkedlist {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("White");
		list.add("Blue");		
		list.add("Yellow");
		list.add("Black");
    	list.add("Pink");
		//System.out.println(list);
    	for(String s:list)
    	{
    		System.out.println(s);
    	}
		

	}

}
