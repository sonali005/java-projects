public class Miscellany {

    public String reverseChars(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Concatenate the character to the reversed string
        }

        return reversed;
    }

    public static void main(String[] args) {
        Miscellany miscellany = new Miscellany(); // Create an instance of the class

        String original = "hello world";
        String reversed = miscellany.reverseChars(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}

