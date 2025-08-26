package Day_8;
//Insert Element at Specific Position 
import java.util.LinkedList;
public class Insert_specificPosition {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("White");
		list.add("Blue");		
		list.add("Yellow");
		list.add("Black");
    	list.add("Pink");
    	System.out.println("before inserting:"+list);
    	list.add(2,"purple");
    	System.out.println("after inserting:"+list);
	}

}
