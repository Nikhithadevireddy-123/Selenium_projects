package Day_6;

import java.util.Scanner;

public class temperature_converter {
	Scanner sc=new Scanner(System.in);
	void temp() {
	System.out.println("enter a temperature");
	double celsius=sc.nextDouble();
	double farenheitPrecision=celsius*9/5+ 32;
	System.out.println("celsius:"+celsius);
	//casting that fahrenheit to int for display.
	int farenheitTruncated= (int) farenheitPrecision;
	System.out.println("farenheit:"+farenheitPrecision);
	System.out.println("farenheitTruncated:"+farenheitTruncated);
	
	System.out.println("if farenheitPrecision is 50.0 then farenheitTruncated is 50. so the decimal part will be the loss ");
	}
	
	

	public static void main(String[] args) {
		temperature_converter t=new temperature_converter();
		t.temp();
		

	}

}
