package Day_8;

import java.util.Iterator;
import java.util.LinkedList;

class Fields {
    int id;
    String title;
    String author;

    Fields(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("ID: " + id + ", title: " + title + ", author: " + author);
    }
}

public class CostomObjects_linkedlist {

	public static void main(String[] args) {
		LinkedList<Fields> list=new LinkedList<>();
		list.add(new Fields(101, "ammakosam", "nikki"));
		list.add(new Fields(201, "chinnapti gnapakalu", "chinni"));
		list.add(new Fields(301, "love never ends", "abhi"));

        System.out.println("Student Details:");
        
        for (Fields field: list) 
        {
            field.display();
	}

	}
}
