package oops_practice;

class AutoVehicle {
    void start() {
        System.out.println("AutoVehicle is starting");
    }
}

class AutoCar extends AutoVehicle {
    void start() {
        System.out.println("AutoCar is starting");
    }
}

class AutoBike extends AutoVehicle {
    void start() {
        System.out.println("AutoBike is starting");
    }
}

class AutoTruck extends AutoVehicle {
    void start() {
        System.out.println("AutoTruck is starting");
    }
}

public class AutoVehicleTest {
    static void testStart(AutoVehicle v) {
        v.start();
    }

    public static void main(String[] args) {
        AutoVehicle car = new AutoCar();
        AutoVehicle bike = new AutoBike();
        AutoVehicle truck = new AutoTruck();

        testStart(car);
        testStart(bike);   
        testStart(truck);  
    }
}

