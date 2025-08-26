package oops_practice;

class IsVehicle {
    void noOfVehicle(int vehicleNo) {
        System.out.println("Vehicle Number: " + vehicleNo);
    }
}

class FourWheeler extends IsVehicle {
    void wheels(int wheels) {
        System.out.println("Number of wheels: " + wheels);
    }
}

class PetrolFourWheeler extends FourWheeler {
    void fuelType(String fuel) {
        System.out.println("Fuel type: " + fuel);
    }
}

class FiveSeaterPetrol extends PetrolFourWheeler {
    void seating(int seats) {
        System.out.println("Seating capacity: " + seats);
    }
}

class BalenoFiveStarPetrolFourWheeler extends FiveSeaterPetrol {
    void modelName(String model) {
        System.out.println("Model name: " + model);
    }
}

public class Vehicle {
    public static void main(String[] args) {
        BalenoFiveStarPetrolFourWheeler veh = new BalenoFiveStarPetrolFourWheeler();
        veh.noOfVehicle(3678);
        veh.wheels(4);
        veh.fuelType("petrol");
        veh.seating(22);
        veh.modelName("baleno");
    }
}
