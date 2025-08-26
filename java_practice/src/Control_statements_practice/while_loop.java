package Control_statements_practice;

public class while_loop {

	public static void main(String[] args) {
		/*int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}*/
		char ch='A'; //converting char to ascii then change the data type,like change char to int
		while(ch<='Z')
		{
			System.out.println(ch +" = "+(int)ch); //can also do typecasting
			ch++;
		}

	}

}
