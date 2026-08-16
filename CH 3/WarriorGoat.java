public class WarriorGoat extends Goat {

    private static final int ATTACK_DAMAGE = 15;  // WarriorGoat's attack damage

    // Constructor
    public WarriorGoat(String name) {
        super(name);  // Calling the parent constructor (Goat) to set the name and health
    }

    // Implement the attack method
    @Override
    public void attack(Goat opponent) {
        System.out.println(getName() + " swings its sword!");
        opponent.takeDamage(ATTACK_DAMAGE);  // Deal attack damage to the opponent
    }

    // Implement the takeDamage method
    @Override
    protected void takeDamage(int damage) {
        super.takeDamage(damage);  // Optionally call the parent method, or override with additional logic
        System.out.println(getName() + " takes " + damage + " damage!");
    }

    @Override
    public String toString() {
        return getName() + " (WarriorGoat) - " + getStatus();
    }

    // Main method to test the WarriorGoat class
    public static void main(String[] args) {
        // Create two WarriorGoat instances
        WarriorGoat goat1 = new WarriorGoat("Warrior Goat 1");
        WarriorGoat goat2 = new WarriorGoat("Warrior Goat 2");

        // Print both WarriorGoats
        System.out.println(goat1);
        System.out.println(goat2);

        // Simulate a battle
        System.out.println("\nBattle begins!");
        goat1.attack(goat2);  // Warrior Goat 1 attacks Warrior Goat 2
        System.out.println(goat2);

        goat2.attack(goat1);  // Warrior Goat 2 attacks Warrior Goat 1
        System.out.println(goat1);
    }
}

