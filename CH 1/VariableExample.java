public class VariableExample { // Renamed class to follow conventions
    public static void printVariables() { // Renamed method to avoid conflict
        double weight = 65.5;
        int age;
        age = 10;

        System.out.println("weight = " + weight + ", age = " + age); // Added a comma and space for clarity
    }

    public static void main(String[] args) {
        printVariables(); // Call the method to execute
    }
}

