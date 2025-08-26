package Day_9;

import java.util.*;
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString() {
        return name + " - " + age;
    }
}
public class SortWithMethodReference {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Nitish", 25));
        people.add(new Person("Nikhitha", 30));
        people.add(new Person("Bobby", 22));

        people.sort(Comparator.comparing(Person::getName));
        System.out.println("Sorted by Name:");
        people.forEach(System.out::println);

        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("\nSorted by Age:");
        people.forEach(System.out::println);
    }
}

