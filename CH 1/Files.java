/* 
import java.io.File;

public class Files {
    public static void main(String[] args) {
        info("example.txt");
        info("testfile.txt");
        info("anotherfile.txt");
    }

    public static void info(String filename) {
        File file = new File(filename);

        System.out.println("File name: " + file.getName());

        System.out.println("Absolute path: " + file.getAbsolutePath());

        if (file.exists()) {
            System.out.println("File exists.");
            System.out.println("File length: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }

        System.out.println();
    }
} */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        printFile("data/alice.txt");
    }

    public static void printFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}



