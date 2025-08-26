package Day_8;
//Reverse the ArrayList 
import java.util.ArrayList;
import java.util.Collections;

public class Reverse_Arraylist {

	public static void main(String[] args) {
		ArrayList<Character> al=new ArrayList<Character>();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		al.add('e');
		System.out.println("before reversing the characters:"+al);
		Collections.reverse(al);
		System.out.println("before reversing the characters:"+al);

	}

}
