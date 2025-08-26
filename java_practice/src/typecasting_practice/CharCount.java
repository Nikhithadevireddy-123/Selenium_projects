package typecasting_practice;

public class CharCount {

	public static void main(String[] args) {
		String str="nikki123";
		for(char c: str.toCharArray())
		{
			if(Character.isDigit(c))
			{
				System.out.println("digit is:"+c);
				
			}
			else
			{
				System.out.println("character is:"+c);
			}
		}
		
		String str1="nikki123";
		int count=0;
		int count1=0;
		for(char c:str1.toCharArray())
		{
			if(Character.isDigit(c))
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		System.out.println("char count:"+count);
		System.out.println("digit count:"+count1);
		

	}

}
