package Day_9;

import java.util.*;

public class SortStrings_Length {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Apple");
        names.add("grapes");
        names.add("banana");
        Collections.sort(names, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        for (String name : names) {
            System.out.println(name);
        }
    }
}

