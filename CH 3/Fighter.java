class Fighter extends Goat {

    // Constructor for Fighter class
    public Fighter(String name) {
        // Call the constructor of the parent class Goat
        super(name);
    }

    // Override the attack method to provide Fighter-specific implementation
    @Override
    public void attack(Goat opponent) {
        System.out.println(getName() + " punches with strength!");
        opponent.takeDamage(30);  // Fighter deals 30 damage
    }

    // main method to test the Fighter class
    public static void main(String[] args) {
        // Create a Fighter goat instance
        Fighter fighter1 = new Fighter("Fighter Goat");

        // Output the name and health of the Fighter
        System.out.println("Name: " + fighter1.getName());
        System.out.println("Health: " + fighter1.getStatus());
    }
}
