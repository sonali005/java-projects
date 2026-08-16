public class Pet {

    private String name;
    private int age;
    private String color;
    private double weight;

    public Pet(String name) {
        this(name, 2,"red", 33.5);
    }

    public Pet(String name, int age, String color, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void birthday() {
        age++;
        }

    @Override
    public String toString() {
        String statement = name + " " + age + " " + color + " " + weight;
        return statement;
    }

    public static void main(String[] args) {
        Pet cat = new Pet("Snoopy");
        System.out.println(cat.toString());

        Pet dog = new Pet("Max");
        System.out.println(dog.toString());
    }
    
}