package File_Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class append_write {

	public static void main(String[] args) throws IOException {
		BufferedWriter w=new BufferedWriter(new FileWriter("sample.txt"));

	}

}
