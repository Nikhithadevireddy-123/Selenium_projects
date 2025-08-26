package collections_demo;


import java.util.TreeSet;

public class Treeset_demo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("maggi");
        set.add("pasta");
        set.add("salt");
        set.add("chocolate");
        set.add("water");
        set.add("water"); // duplicate
        // set.add(null); // ❌ Will throw NullPointerException in TreeSet
        System.out.println(set);

        System.out.println(set.clone());
        System.out.println(set.contains("pasta"));

        System.out.println(set);
        System.out.println(set.ceiling("water"));  // next
        System.out.println(set.floor("waters"));   // previous
        System.out.println(set.higher("salt"));    
        System.out.println(set.lower("salt"));     

        set.pollFirst(); // removes first
        System.out.println(set);
        set.pollLast();  // removes last
        System.out.println(set);

        System.out.println(set.descendingSet());
    }
}


