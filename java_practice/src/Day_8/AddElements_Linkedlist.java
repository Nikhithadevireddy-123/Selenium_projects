package Day_8;
//Add Elements at First and Last Position
import java.util.LinkedList;

public class AddElements_Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.addFirst(5);
		list.addLast(55);
		System.out.println("original list:"+list);
		System.out.println("afteradding elements list:"+list);

	}

}
