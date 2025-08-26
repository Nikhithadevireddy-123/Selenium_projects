package Day_6;
//Compass Directions
import java.util.Scanner;

enum directions {
	NORTH,SOUTH,EAST,WEST};
public class Enum_directions{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter a directions");
	    String input=sc.nextLine().toUpperCase(); //convert to uppercase for case-insensitive matching
	    try {
	    	directions dir=directions.valueOf(input); //attempt to convert string to enum
	    	switch(dir) {
	    	case NORTH:System.out.println("Move to north");
	    	break;
	    	case SOUTH:System.out.println("Move to south");
	    	break;
	    	case EAST:System.out.println("Move to east");
	    	break;
	    	case WEST:System.out.println("Move to west");
	    	}
	    	
	    }
	    	catch(Exception e)
	    	{
	    		System.out.println("wrong directions entered .Please enter south,north,east,wast");
	    	}
	    	finally {
	    		sc.close();
	    	}
	}
	   

}
