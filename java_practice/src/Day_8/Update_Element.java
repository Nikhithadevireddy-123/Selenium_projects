package Day_8;
//Update an Element 
import java.util.ArrayList;

public class Update_Element {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Math");
		al.add("Science");
		al.add("Social");
		al.add("Statistics");
		al.add("EVS");
		System.out.println("Before update: " + al);
		
		for(int i = 0; i < al.size(); i++) 
		{
            if (al.get(i).equals("Math")) 
            {
                al.set(i, "Statistics");
            }
        }

        System.out.println("After update: " + al);
    }
}

