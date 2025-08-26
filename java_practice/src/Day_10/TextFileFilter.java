package Day_10;

import java.io.File;
import java.io.FilenameFilter;

public class TextFileFilter {

	public static void main(String[] args) {
		File f=new File("C:\\File_Handling");
		FilenameFilter txtfile=new FilenameFilter() {
			@Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        };

        // List files using the filter
        File[] txtFiles = f.listFiles(txtfile);

        if (txtFiles != null) {
            System.out.println("Text files in the folder:");
            for (File file : txtFiles) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Folder not found or is not a directory.");
        }
			
		}
		

	}

