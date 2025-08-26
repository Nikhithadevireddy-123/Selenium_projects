package Day_9;

import java.util.*;
class Citizen {
    String name;
    int age;
    Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " - " + age;
    }
}
public class TreeSetSortByAge {
    public static void main(String[] args) {
        Set<Citizen> citizens = new TreeSet<>(Comparator.comparingInt(c -> c.age));
        citizens.add(new Citizen("Nikhitha", 25));
        citizens.add(new Citizen("Bobby", 30));
        citizens.add(new Citizen("Abhi", 20));
        for (Citizen c : citizens) {
            System.out.println(c);
        }
    }
}


