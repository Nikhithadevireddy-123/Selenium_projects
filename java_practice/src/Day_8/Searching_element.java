package Day_8;
//Search an Element 
import java.util.LinkedList;
import java.util.Scanner;

public class Searching_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> list=new LinkedList<String>();
		list.add("nitish");
		list.add("chintu");		
		list.add("abhinaya");
		list.add("nikki");
    	list.add("chinni");
    	System.out.println(list);
    	System.out.println("enter a name for search:");
    	String searchname=sc.nextLine();
    	if(list.contains(searchname))
    	{
    		System.out.println(searchname+" is found");	
    	}
    	else
    	{
    		System.out.println(searchname+" is not found");	
    	}

	}

}
