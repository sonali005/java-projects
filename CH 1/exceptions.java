import java.util.Scanner;

public class exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();  // Directly reads the integer input
            System.out.println("You entered: " + number);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }
        
        scanner.close();  // Close the scanner outside of finally
    }
}

