package arrays_practice;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String str="programming";
		char[] chars=str.toCharArray(); //toCharArray() converts string to array of chars
		Arrays.sort(chars);// ['p','r','o',.....]
        System.out.println("sorted String:"+new String(chars));
	}

}
