package Control_statements_practice;

public class switch_case3 {
	public void signals(String colors)
	{
		
		switch(colors)
		{
		case "red" :System.out.println("stop");
		break;
		case "yellow" :System.out.println("ready");
		break;
		case "green" :System.out.println("go");
		break;
		default:System.out.println("invalid");
		}	
	}
//-----------------------------------------------------------------------------
	/*public void character(char ch) {
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch + " is a vowel");
			break;
		default:
			System.out.println(ch + " is a consonent");
		}
	}*/
//----------------------------------------------------------------------------
	/*public void months(int i) {
		switch(i) {
		case 1:System.out.println("jan");
		break;
		case 2:System.out.println("feb");
		break;
		case 3:System.out.println("mar");
		break;
		case 4:System.out.println("apr");
		break;
		case 5:System.out.println("may");
		break;
		case 6:System.out.println("june");
		break;
		case 7:System.out.println("july");
		break;
		case 8:System.out.println("aug");
		break;
		case 9:System.out.println("sep");
		break;
		case 10:System.out.println("oct");
		break;
		case 11:System.out.println("nov");
		break;
		case 12:System.out.println("dec");
		break;
		default:System.out.println("invalid");
		}
	}*/
	public static void main(String[] args) {
		switch_case3 obj=new switch_case3();
		obj.signals("red");
		//obj.character('e');
		//obj.months(6);
	}

}
