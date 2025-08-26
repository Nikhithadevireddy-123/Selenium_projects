package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class java_jdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="Nikhitha123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("connection created");
		//create statement
		Statement stmt=con.createStatement();
		ResultSet rs =stmt.executeQuery("select * from Emp");
		System.out.println("ID\t name\t Sal");
		while(rs.next())
		{
			int id=rs.getInt("Id");
			String name=rs.getString("name");
			int sal=rs.getInt("sal");
			System.out.println(id+" "+name+" "+sal);
			//System.out.println("ID:"+id+"\tName:"+name+"salary:"+salary);
		}
		con.close();
		stmt.close();
		con.close();
		
		
	}

}
