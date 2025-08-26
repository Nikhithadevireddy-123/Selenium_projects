package oops_practice;

class Vehicle1 {
    Vehicle1() {
        System.out.println("Vehicle Created");
    }

    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle1 {
    Bike() {
        super();  
        System.out.println("Bike Created");
    }

    @Override
    void run() {
        System.out.println("Bike is running");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle1 v = new Vehicle1();
        v.run();

        Bike b = new Bike();
        b.run();

        Vehicle1 v2 = new Bike();  
        v2.run();  
    }   

}

