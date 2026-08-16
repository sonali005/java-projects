import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class file {
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

