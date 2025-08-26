package oops_practice;

class Hospitall {
 String hospitalName = "Amma Hospital";
 String doctorname = "Ranjith";

 void displayHospitalInfo() {
     System.out.println("Hospital Name: " + hospitalName);
     System.out.println("doctorname: " + doctorname);
 }
}
class Patient1 extends Hospitall {
 String patientName = "Nikhitha";
 int weight = 50 ;

 void displayPatientInformation() {
     System.out.println("Patient Name: " + patientName);
     System.out.println("weight: " + weight);
     System.out.println("Hospital : " + super.hospitalName);
     System.out.println("doctorname : " + super.doctorname);
     //super.displayHospitalInfo();
 }
}

public class HospitalClass {
 public static void main(String[] args) {
     Patient1 p = new Patient1();
     p.displayPatientInformation();
 }
}
