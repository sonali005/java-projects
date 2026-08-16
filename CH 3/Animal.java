public class Animal {               //inheritance example w rabbit
    private String name;
    private double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return "Animal name = " + name + " , weight = " + weight;
    }

    public String getName() {
        return name;
    }

    public void greet(Animal o) {
        System.out.println(name = " greets " + o.name + "!");
    }
}
