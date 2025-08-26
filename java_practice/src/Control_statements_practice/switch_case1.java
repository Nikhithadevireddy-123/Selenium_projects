package Control_statements_practice;

public class switch_case1 {

	public static void main(String[] args) {
		int dresssize=28;
		switch(dresssize)
		{
		case 26:System.out.println("extra small");
		break;
		case 28:System.out.println("small");
		break;
		case 30:System.out.println("medium");
		break;
		case 32:System.out.println("large");
		break;
		case 34:System.out.println("extra large");
		break;
		case 36:System.out.println("extra extra large");
		break;
		default:System.out.println("invalid dress size enter valid dress size");
		
		}

	}

}
