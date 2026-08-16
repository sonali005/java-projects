public class Count {

    public static int countWhile(int n) {
        int i = 0;   // Start counting from 0
        int sum = 0; // To store the sum of numbers

        while (i <= n) { // Loop until i reaches n
            System.out.println(i); // Print the current number
            sum += i;              // Add the current number to the sum
            i++;                   // Increment the counter
        }
        return sum; // Return the total sum
    }

    public static void main(String[] args) {
        int result = countWhile(5); // Call the countWhile method with n=5
        System.out.println("Sum of numbers: " + result); // Print the sum
    }
}

