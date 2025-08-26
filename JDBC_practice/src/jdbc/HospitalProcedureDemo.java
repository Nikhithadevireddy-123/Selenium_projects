package jdbc;

import java.sql.*;

public class HospitalProcedureDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb"; // Change DB name if different
        String user = "root";
        String password = "Nikhitha123";

        try (Connection con = DriverManager.getConnection(url, user, password)) {

          
            CallableStatement cs1 = con.prepareCall("CALL avgPatientCountPerDay()");
            ResultSet rs1 = cs1.executeQuery();
            if (rs1.next()) {
                System.out.println("Average Patients Per Day: " + rs1.getFloat("avg_patients"));
            }

            
            CallableStatement cs2 = con.prepareCall("CALL sameWardPatients()");
            ResultSet rs2 = cs2.executeQuery();
            System.out.println("\nPatients in Same Ward:");
            while (rs2.next()) {
                System.out.println("Hospital: " + rs2.getString("hospitalname") +
                                   ", Ward: " + rs2.getString("ward") +
                                   ", Patient: " + rs2.getString("patientname") );
                                   
            }

            
            CallableStatement cs3 = con.prepareCall("CALL sortPatientsByAdmission()");
            ResultSet rs3 = cs3.executeQuery();
            System.out.println("\nPatients Sorted by Admission Date:");
            while (rs3.next()) {
                System.out.println("Hospital: " + rs3.getString("hospitalname") +
                                   ", Patient: " + rs3.getString("patientname") +
                                   ", Admission Date: " + rs3.getDate("admissiondate"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
