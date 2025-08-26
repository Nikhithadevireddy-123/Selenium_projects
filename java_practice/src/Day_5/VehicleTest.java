package Day_5;

interface BaseVehicle {
 void start();
}
interface AdvancedVehicle extends BaseVehicle {
 void stop();
 boolean refuel(int amount);
}
class Car implements AdvancedVehicle {
 private int fuel;
 public Car(int initialFuel) {
     this.fuel = initialFuel;
 }
 public void start() {
     if (fuel > 0) {
         System.out.println(" Fuel level: " + fuel + "L");
     } else {
         System.out.println("No fuel.");
     }
 }
 public void stop() {
     System.out.println("Car stopped.");
 }
 public boolean refuel(int amount) {
     if (amount > 0) {
         fuel =fuel + amount;
         System.out.println("Refueled " + amount + "L. Total fuel: " + fuel + "L");
         return true;
     } else {
         System.out.println("Invalid fuel amount.");
         return false;
     }
 }
}
public class VehicleTest {
 public static void main(String[] args) {
     BaseVehicle bv = new Car(5);
     bv.start(); 

     AdvancedVehicle av = (AdvancedVehicle) bv;
     av.stop();          
     av.refuel(10);       
     av.start();          
 }
}
