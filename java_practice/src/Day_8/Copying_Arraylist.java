package Day_8;
// Copy One ArrayList to Another
import java.util.ArrayList;

public class Copying_Arraylist {

	public static void main(String[] args) {
		ArrayList<Character> al=new ArrayList<Character>();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		al.add('e');
		ArrayList<Character> al1=new ArrayList<>();
		al1.addAll(al);
		System.out.println("original list:"+al);
		System.out.println("Copied list:"+al1);

	}

}
