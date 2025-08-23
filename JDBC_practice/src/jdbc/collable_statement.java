package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class collable_statement {

	public static void main(String[] args) {
			String url = "jdbc:mysql://localhost:3306/mydb";
		    String user = "root";
		    String password = "Nikhitha123";
		    try 
		    	(Connection con = DriverManager.getConnection(url, user, password)){
		    	
		        CallableStatement cst0 = con.prepareCall("CALL employeesalary11()");
		        cst0.execute();
		        System.out.println("bonus added to all employess");
		        
		        CallableStatement cst1 = con.prepareCall("CALL sameemployeenames1()");
		        ResultSet rs=cst1.executeQuery();
		        System.out.println("same employees names: ");
		        while(rs.next()) {
		        	System.out.println(rs.getString("name"));
		        }
		        
		        CallableStatement cst2 = con.prepareCall("CALL highestandlowestsalary1()");
		        ResultSet rs1=cst2.executeQuery();
		        if(rs1.next())
		        {
		        	System.out.println("highest salary:"+rs1.getInt(1));
		        	System.out.println("highest salary:"+rs1.getInt(2));
		        	
		        }
		    }
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    }
	}
}




