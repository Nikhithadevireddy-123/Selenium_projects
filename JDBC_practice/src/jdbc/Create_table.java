package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_table {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="Nikhitha123";
        //create table
		String sql="create table students(rollno int ,"
		+ "name varchar(50),"
		+" per int," 
		+ "email varchar(50))";
		//insert records
		String sql1 = "CREATE TABLE IF NOT EXISTS students";
		String insertSQL="insert into students values(101,'chinni',98,'chinni@gmail.com'),"
				+ "(102,'nikki',89,'nikki@gmail.com'),"
				+ "(103,'abhi',79,'abhi@gmail.com')";
		String updateSQl="update students set per=88 where name='abhi'"; 
				
		try
		{
		//driver connection
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("connection created");
		//create statement for query execution
		Statement stmt=con.createStatement();
		//call create query using statement
		stmt.executeUpdate(sql1);
		System.out.println("students table created");
		//call insert query using statement
		int rowInserted=stmt.executeUpdate(insertSQL);
		int rowUpdated=stmt.executeUpdate(updateSQl);
		
		if(rowInserted>0)
		{
			System.out.println("new student record inserted");	
			System.out.println("student name is updated");
		}
		//print table
		ResultSet rs =stmt.executeQuery("select * from students");
		System.out.println("rollno\t name\t Percentage\t Email");
		//while loop for fetching all the table records
		while(rs.next())
		{
			int rollno=rs.getInt("rollno");
			String name=rs.getString("name");
			int per=rs.getInt("per");
			String email=rs.getString("email");
			System.out.println(rollno+" "+name+" "+per+" "+email);
			//System.out.println("rollno:"+rollno+"\tName:"+ name+"Percentage:"+ per+"Email:"+ email);
		}
		stmt.close();
		con.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}

	}

}
