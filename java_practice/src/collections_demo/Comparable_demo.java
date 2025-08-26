package collections_demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparable_demo {
	int id;
	String name;
	Comparable_demo(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int compareTo(Comparable_demo s)
	{
		return id - s.id;
	}
	public String toString(){
		return id +" "+ name;
	}
	
	public static void main(String[] args) {
		List<Comparable_demo> list=Arrays.asList(
				new Comparable_demo(9,"nikki"),
				new Comparable_demo(4,"chinni"),
				new Comparable_demo(2,"abhi")
				);
		Collections.sort(list);   //uses Comparable
		list.forEach(System.out::println);

	}

}
