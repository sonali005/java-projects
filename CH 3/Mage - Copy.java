public class Mage {
    private final String name;
    private final int maximumHP;
    private int currentHP;

    public Mage(String name) {
        this.name = name;
        this.maximumHP = 125; 
        this.currentHP = 125; 
    }

    // Check if Mage is unconscious
    public boolean isUnconscious() {
        return currentHP == 0;
    }

    // Magic Missile Attack: 4 hits of 9 magical damage each (Total: 36)
    public void attack(Mage target) {
        if (this.isUnconscious()) {
            System.out.println(this.name + " is unconscious and cannot attack!");
            return;
        }

        int totalDamage = 4 * 9; 
        System.out.println(this.name + " casts Magic Missiles at " + target.name + "!");
        target.takeDamage(totalDamage, "magical");
    }

    // Taking Damage: Reduces HP but not below 0
    public void takeDamage(int damage, String type) {
        if (this.isUnconscious()) {
            System.out.println(this.name + " is already unconscious and cannot take damage!");
            return;
        }

        if (type.equalsIgnoreCase("magical")) {
            damage *= 0.75; // Magical damage reduced by 25%
        } else if (type.equalsIgnoreCase("physical")) {
            damage *= 1.25; // Physical damage increased by 25%
        }

        currentHP -= damage;
        if (currentHP < 0) {
            currentHP = 0;
        }

        System.out.println(this.name + " takes " + damage + " " + type + " damage! Current HP: " + currentHP);
    }

    // Healing: Cannot exceed max HP
    public void heal(int amount) {
        if (this.isUnconscious()) {
            System.out.println(this.name + " is unconscious and cannot be healed!");
            return;
        }

        currentHP += amount;
        if (currentHP > maximumHP) {
            currentHP = maximumHP;
        }

        System.out.println(this.name + " heals for " + amount + " HP! Current HP: " + currentHP);
    }

    @Override
    public String toString() {
        return "A mage named " + name + " with " + currentHP + "/" + maximumHP + " hit points!";
    }

    // Main method for testing
    public static void main(String[] args) {
        Mage mage1 = new Mage("Hairy Potter");
        Mage mage2 = new Mage("Gandalf the Grey");

        System.out.println(mage1);
        System.out.println(mage2);

        // Mage1 attacks Mage2
        mage1.attack(mage2);
        System.out.println(mage2);

        // Mage2 attacks Mage1
        mage2.attack(mage1);
        System.out.println(mage1);

        // Mage2 heals
        mage2.heal(20);
        System.out.println(mage2);

        // Mage1 takes a physical attack (simulate)
        mage1.takeDamage(40, "physical");
        System.out.println(mage1);
    }
}
