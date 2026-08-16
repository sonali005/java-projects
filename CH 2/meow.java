
public class meow {
    private String name;
    private int age;
    private String uni;

    // Constructor to initialize the fields
    public meow(String name, int age, String uni) {
        this.name = name;
        this.age = age;
        this.uni = uni;
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old attending " + uni + ".";
    }

    public static void main(String[] args) {
        // Create a meow object
        meow mymeow = new meow("Sonali", 19, "Rochester Institute of Tech");

        // Call toString() method to print the details
        System.out.println(mymeow);
    }
}
