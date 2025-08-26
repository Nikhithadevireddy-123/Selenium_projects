package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Preparedstatement_demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="Nikhitha123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("connection created");
		String query="Inser into student1(rollno,name,age) values(?,?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, 101);
		pst.setString(2,"nikki");
		pst.setInt(3,20);
		
//		pst.setInt(1, 102);
//		pst.setString(2,"chinni");
//		pst.setInt(3,21);
//		
//		pst.setInt(1, 103);
//		pst.setString(2,"abhi");
//		pst.setInt(3,22);
		int rows=pst.executeUpdate();
		System.out.println(rows+"=Update rows");
		
		
		
		
		

}

}
