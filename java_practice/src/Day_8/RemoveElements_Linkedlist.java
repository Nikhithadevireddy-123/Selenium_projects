package Day_8;
//Remove Elements 
import java.util.LinkedList;
public class RemoveElements_Linkedlist {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Dog");
		list.add("Cat");		
		list.add("Buffalo");
		list.add("Pig");
    	list.add("Cow");
    	System.out.println("original list:"+list);
    	list.removeFirst();
    	list.removeLast();
    	System.out.println("removing first and last:"+list);
    	list.remove("Buffalo");
    	System.out.println("final list:"+list);
	}

}
