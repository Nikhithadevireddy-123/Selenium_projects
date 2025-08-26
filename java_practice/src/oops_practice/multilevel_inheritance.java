package oops_practice;
class Animal1 {
    void eat(String eats) {
        System.out.println("Eats = " + eats);
    }

    void sound(String sd) {
        System.out.println("Sound = " + sd);  // Fixed syntax error
    }
}

// Child class
class Dog extends Animal1 {
    void lives(String lives) {
        System.out.println("Lives in the " + lives);
    }
}

// Sub-child class
class Puppy extends Dog {
    void breed(String bd) {
        System.out.println("Breed of Dog is " + bd);
    }
}

// Main class
public class multilevel_inheritance {
    public static void main(String[] args) {
        // Creating object of Puppy (has access to all methods from Animal1 and Dog)
        Puppy max = new Puppy();
        max.eat("Royal Canin");      // from Animal1
        max.sound("Barking");        // from Animal1
        max.lives("City");           // from Dog
        max.breed("Labrador");       // from Puppy

        // Creating object of Dog (has access to Animal1 and Dog methods)
        Dog max1 = new Dog();
        max1.eat("Royal Canin");
        max1.sound("Barking");
        max1.lives("City");
    }
}

