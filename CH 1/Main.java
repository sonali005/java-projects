import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 10;  // Set n to the desired number of elements
        System.out.println(Arrays.toString(squares(n)));
    }

    public static int[] squares(int n) {
        // Create an array with n elements
        int[] result = new int[n];
        
        // Loop through and set each index to the square of the index
        for (int i = 0; i < n; i++) {
            result[i] = i * i;
        }
        
        // Return the array
        return result;
    }
}
