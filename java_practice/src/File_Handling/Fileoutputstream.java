package File_Handling;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Fileoutputstream {

	public static void main(String[] args) {
		//Employee emp=new Employee(101,"nikki");
		//Employee emp1=new Employee(102,"chinni");
		
		try {
				FileWriter fw=new FileWriter("employee.txt");
				BufferedWriter bf=new BufferedWriter(fw);
				emp.setData(110,"nikki");
				bf.write(emp.toString());
				bf.newLine();
				emp.setData(111,"chinni");
				bf.write(emp.toString);
				bf.newLine();
				bf.close();
				fw.close();
				System.out.println("Done");
			}
			catch(IOException e)
			{
				System.out.println("Failed");
				System.out.println(e);
			}
		}

	}

