public class Rabbit extends Animal { // Child class of Animal
    private String furColor;

    public Rabbit(double weight, String furColor) {
        super("Rabbit", weight);
        this.furColor = furColor;
    }

    public void move() {
        System.out.println(getName() + " goes hop hop hop"); // Use getter if 'name' is private
    }
}
