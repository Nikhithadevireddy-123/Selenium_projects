package Control_statements_practice;

public class switch_case2 {

	public static void main(String[] args) {
		char operator='+';
		int a=22;
		int b=33;
		switch(operator) {
		case'+':System.out.println("addition");
		break;
		case'*':System.out.println("multiplication");
		break;
		case'-':System.out.println("subtraction");
		break;
		case'/':System.out.println("division");
		break;
		default:System.out.println("invalid");
		}
	}

}
