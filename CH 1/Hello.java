public class Hello {

    // Define the hello method
    public static void helloName(String first, String last) {
        // Print the message with first and last name
        System.out.println("Hello, " + first + " " + last + "!");
    }

    public static void main(String[] args) {
        // Call the helloName method from main
        helloName("John", "Doe");
    }
}
