package Day_10;

import java.io.File;

public class Files_directory {
        public static void main(String[] args) {
            File directory = new File("C:\\File_Handling"); 
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println("File: " + file.getName());
                    } else if (file.isDirectory()) {
                        System.out.println("Directory: " + file.getName());
                    }
                }
            } else {
                System.out.println("Directory is empty or does not exist.");
            }
        }

}
