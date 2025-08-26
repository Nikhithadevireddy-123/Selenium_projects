package File_Handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirectoryWalker {
    public static void main(String[] args) {
        Path startPath = Paths.get("."); // Start from current directory
        try (Stream<Path> walk = Files.walk(startPath)) {
            walk.filter(Files::isRegularFile) // Filter only regular files
                .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
