package Day_9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 {
    int id;
    String name;
    int marks;
    Student1(int id, String name,int marks) {
        this.id = id;
        this.name = name;
        this.marks=marks;
    }
    public String toString() {
        return id + " " + name +" "+marks;
    }
}
 
public class Comparable_SydentDetails implements Comparator<Student1> {
	public int compare(Student1 s1,Student1 s2)
		{
			return Integer.compare(s1.id,s2.id);
		}
    public static void main(String[] args) {
        List<Student1> list =new ArrayList<>();
 
        list.add(new Student1(0, "nikhitha",77));
        
        list.add(new Student1(1, "chinni",89));
        list.add(new Student1(2, "chintu",76));
        Collections.sort(list, new Comparable_SydentDetails());
 
        list.forEach(System.out::println);
    }
}
