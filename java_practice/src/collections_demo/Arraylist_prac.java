package collections_demo;

import java.util.ArrayList;
import java.util.List;

public class Arraylist_prac {

	public static void main(String[] args) {
		//searching for an element
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		if(al.contains(30))
		{
			System.out.println("yes data is there");
		}
		else
		{
			System.out.println("data is not there");
		}
		
		//Convert Arraylist to Array
		Integer[] num=al.toArray(new Integer[0]);
		//System.out.println("array element");
		for (Integer al1:num)
		{
			System.out.print(al1 +" ");
		}
		
		
		//merging 
		List<Integer> al2=new ArrayList<>al.of(60,70,80));
		for(Integer num1:al2)
		{
			if(!al.contains(al2))
			{
				al.add(num1);
			}
			
		}
		System.out.println("without duplicates");
		for(int num1 : al)
		{
			System.out.println(num1);
		}
		

	}
	}
}


