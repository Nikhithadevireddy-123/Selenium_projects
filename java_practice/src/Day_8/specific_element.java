package Day_8;
//Remove Specific Element 
import java.util.ArrayList;
import java.util.Scanner;

public class specific_element {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		al.add("Mango");
		al.add("Banana");
		al.add("Grapes");
		al.add("Kiwi");
		al.add("Apple");
		System.out.println(al);
		System.out.print("Enter fruit name to remove: ");
        String fruitToRemove = sc.nextLine();

        // Remove and display updated list
        if (al.remove(fruitToRemove)) {
            System.out.println(fruitToRemove + " removed successfully.");
        } else {
            System.out.println(fruitToRemove + " not found in the list.");
        }

        System.out.println("Updated fruit list: " + al);
        sc.close();

    }
}
